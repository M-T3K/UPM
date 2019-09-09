import es.upm.babel.cclib.Producto;
import es.upm.babel.cclib.Almacen;
import es.upm.babel.cclib.Semaphore;

// @CHECK: I don't understand the fucking tester so I really do not know if it is done or not.

/**
 * Implementación de la clase Almacen que permite el almacenamiento
 * de producto y el uso simultáneo del almacen por varios threads.
 */
class Almacen1 implements Almacen {
    // Producto a almacenar: null representa que no hay producto
    private Producto almacenado = null;
    static Semaphore semVacio = new Semaphore(1);
    static Semaphore semLleno = new Semaphore(0);

    public Almacen1() {

    }

    public void almacenar(Producto producto) {

        semVacio.await(); // ++permit; Si no esta vacio no continuamos.
        {
            almacenado = producto;
        }
        semLleno.signal(); // --permit; Ya esta lleno, asi que restamos un permiso a los restantes.
    }

    public Producto extraer() {
        
        Producto res;

        semLleno.await(); // ++permit; Si no esta lleno, no continuamos.
        {
            res = almacenado;
            almacenado = null;
        }
        semVacio.signal(); // --permit; Nos aseguramos de que este vacio.
     
        return res;
    }
}
