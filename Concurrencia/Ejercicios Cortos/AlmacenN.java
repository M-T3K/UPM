import es.upm.babel.cclib.Producto;
import es.upm.babel.cclib.Almacen;
import es.upm.babel.cclib.Semaphore;

/**
 * Implementación de la clase Almacen que permite el almacenamiento
 * FIFO de hasta un determinado número de productos y el uso
 * simultáneo del almacén por varios threads.
 */
class AlmacenN implements Almacen {
    private int capacidad = 0;
    private Producto[] almacenado = null;
    private int nDatos = 0;
    private int aExtraer = 0;
    private int aInsertar = 0;

    // TODO: declaración de los semáforos necesarios
    static Semaphore vacio; // No se podra vaciar si es 0
    static Semaphore almac; // Se puede llenar siempre que no se supere a capacidad
    static Semaphore mutex; // Para Garantizar Exclusion Mutua

    public AlmacenN(int n) {
        capacidad = n;
        almacenado = new Producto[capacidad];
        nDatos = 0;
        aExtraer = 0;
        aInsertar = 0;

        vacio = new Semaphore(0);
        almac = new Semaphore(capacidad);
        mutex = new Semaphore(1); 
    }

    public void almacenar(Producto producto) {

        almac.await(); // Esperamos a que haya un hueco en el almacen
        mutex.await(); // Una vez este vacio, esperamos a que seamos los unicos tocando la seccion critica
        { // Sección crítica
            almacenado[aInsertar] = producto;
            nDatos++;
            aInsertar++;
            aInsertar %= capacidad;
        }
        almac.signal(); // Enviamos una senal como que hemos anadido un elemento
        mutex.signal(); // Enviamos una senal como que hemos terminado con la seccion critica.
    }

    public Producto extraer() {
        Producto result;

        vacio.await(); // Esperamos a que el almacen no este vacio
        mutex.await(); // Esperamos a ser los unicos tocando la seccion critica
        {// Sección crítica
            result = almacenado[aExtraer];
            almacenado[aExtraer] = null;
            nDatos--;
            aExtraer++;
            aExtraer %= capacidad;
        }
        if(aExtraer == 0) {
            vacio.signal(); // El Almacen esta vacio
        }
        mutex.signal(); // Enviamos ua senal como que hemos terminado con la senal critica

        return result;
    }
}
