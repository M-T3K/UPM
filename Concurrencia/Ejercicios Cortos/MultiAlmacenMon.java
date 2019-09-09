import es.upm.babel.cclib.Producto;
import es.upm.babel.cclib.MultiAlmacen;

// My imports
import es.upm.babel.cclib.Monitor;
import es.upm.babel.cclib.Monitor.Cond;

// Ejercicio 9
class MultiAlmacenMon implements MultiAlmacen {
    private int capacidad = 0;
    private Producto almacenado[] = null;
    private int aExtraer = 0;
    private int aInsertar = 0;
    private int nDatos = 0;

    // TODO: declaración de atributos extras necesarios
    // para exclusión mutua y sincronización por condición

    private static volatile boolean isReadyPoner;
    private static volatile boolean isReadyTomar;
    private static Monitor monitor = null;

    // Para evitar la construcción de almacenes sin inicializar la
    // capacidad
    private MultiAlmacenMon() {

    }

    public MultiAlmacenMon(int n) {
        almacenado = new Producto[n];
        aExtraer     = 0;
        aInsertar    = 0;
        capacidad    = n;
        nDatos       = 0;

        // TODO: inicialización de otros atributos
        monitor      = new Monitor();
        isReadyPoner = false;
        isReadyTomar = false;
    }

    private int nDatos() {
        return nDatos;
    }

    private int nHuecos() {
        return capacidad - nDatos;
    }

    public void almacenar(Producto[] productos) {

        // TODO: implementación de código de bloqueo para
        // exclusión muytua y sincronización condicional

        // PRE: Longitud(s) <= [MAX/2]
        if(productos.length > this.capacidad / 2) {
            return;
        }

        // Condiciones Previas de Concurrencia:
        // CPRE1: Hay sitio en el buffer para dejar la secuencia
        if(nHuecos() < productos.length) {
            return;
        }
        // CPRE2: Longitud(self + s) <= MAX
        if((this.almacenado.length + productos.length) > capacidad) {
            return;
        }

        isReadyTomar = true;
        monitor.enter();
        while(!isReadyPoner);

        // Sección crítica
        for (int i = 0; i < productos.length; i++) {
            almacenado[aInsertar] = productos[i];
            nDatos++;
            aInsertar++;
            aInsertar %= capacidad;
        }

        // TODO: implementación de código de desbloqueo para
        // sincronización condicional y liberación de la exclusión mutua

        monitor.leave();
        isReadyTomar = false;
    }

    public Producto[] extraer(int n) {
        Producto[] result = new Producto[n];

        // PRE: n <= [MAX / 2]
        if(n > this.capacidad / 2) {
            return null;
        }

        // CPRE: Hay suficientes elementos en el buffer
        if(nDatos < n) {
            return null;
        }

        // CPRE2: Longitud(self + s) <= MAX
        if(this.almacenado.length < n) {
            return null;
        }
        // TODO: implementación de código de bloqueo para exclusión
        // mutua y sincronización condicional

        isReadyPoner = true;
        monitor.enter();
        while(!isReadyTomar);

        // Sección crítica
        for (int i = 0; i < result.length; i++) {
            result[i] = almacenado[aExtraer];
            almacenado[aExtraer] = null;
            nDatos--;
            aExtraer++;
            aExtraer %= capacidad;
        }

        // TODO: implementación de código de desbloqueo para
        // sincronización condicional y liberación de la exclusión mutua
        monitor.leave();
        isReadyPoner = false;
        return result;
    }
}
