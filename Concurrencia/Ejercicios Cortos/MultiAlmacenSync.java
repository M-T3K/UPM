import es.upm.babel.cclib.Producto;
import es.upm.babel.cclib.MultiAlmacen;

// Ejercicio 8: Consiste en implementar mediante metodos synchronized la especificacion del pdf
class MultiAlmacenSync implements MultiAlmacen {
    private int capacidad = 0; // MAX
    private Producto almacenado[] = null; // BUFFER
    private int aExtraer = 0; // Cursor de Extraccion
    private int aInsertar = 0; // Cursor de Insercion
    private int nDatos = 0;    // # de datos

    // TODO: declaración de atributos extras necesarios
    private static boolean readyPoner = false; // Condicion para Poner
    private static boolean readyTomar = false; // Condicion para Tomar


    // Para evitar la construcción de almacenes sin inicializar la
    // capacidad
    private MultiAlmacenSync() {
    }

    public MultiAlmacenSync(int n) {
        almacenado = new Producto[n];
        aExtraer = 0;
        aInsertar = 0;
        capacidad = n;
        nDatos = 0;

        // TODO: inicialización de otros atributos
    }

    private int nDatos() {
        return nDatos;
    }

    private int nHuecos() {
        return capacidad - nDatos;
    }

    // Poner: Tipo_Secuencia[e]
    synchronized public void almacenar(Producto[] productos) {
        // TODO: implementación de código de bloqueo para sincronización
        // condicional

        // PRE: Longitud(s) <= [MAX/2]
        if(productos.length > this.capacidad / 2) {
            return;
        }

        // Condiciones Previas de Concurrencia:
        // CPRE1: Hay sitio en el buffer para dejar la secuencia
        if(nDatos() > (this.almacenado.length - productos.length)) {
            return;
        }
        // CPRE2: Longitud(self + s) <= MAX
        if((this.almacenado.length + productos.length) > capacidad) {
            return;
        }

        readyTomar = true;
        while( !readyPoner); // Esperamos a que ReadyPoner cambie

        // No deberia hacer falta crear ninguna variable turno ya que solo se puede acceder 1 vez al mismo metodo
        // Entonces lo que estamos haciendo es elegir uno de los dos metodos que pueden estar abiertos simultaneamente.
        // Sección crítica
        for (int i = 0; i < productos.length; i++) {
            almacenado[aInsertar] = productos[i];
            nDatos++;
            aInsertar++;
            aInsertar %= capacidad;
        }

        // TODO: implementación de código de desbloqueo para
        // sincronización condicional
        notifyAll(); // Notificamos a todos los demas Threads que esten esperando a este
        readyPoner = false;
    }

    // Tomar: N[e]xTipo_Secuencia[s]
    synchronized public Producto[] extraer(int n) {
        Producto[] result = new Producto[n];

        // TODO: implementación de código de bloqueo para sincronización
        // condicional

        // PRE: n <= [MAX / 2]
        if(n > this.capacidad / 2) {
            return null;
        }

        // CPRE: Hay suficientes elementos en el buffer
        if(nDatos < n) {
            return null;
        }

        // CPRE2: ongitud(self + s) <= MAX
        if(this.almacenado.length < n) {
            return null;
        }

        readyPoner = true;
        while( !readyTomar);

        // Sección crítica
        for (int i = 0; i < result.length; i++) {
            result[i] = almacenado[aExtraer];
            almacenado[aExtraer] = null;
            nDatos--;
            aExtraer++;
            aExtraer %= capacidad;
        }

        // TODO: implementación de código de desbloqueo para
        // sincronización condicional
        readyTomar = false;
        notifyAll();
        return result;
    }
}
