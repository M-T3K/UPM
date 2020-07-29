// Clase de cliente que inicia la interacción con el servicio de
// ficheros remotos
package afs;

import java.rmi.*;
import java.net.MalformedURLException;


public class Venus {
    private String host = System.getenv("REGISTRY_HOST");
    private int port = Integer.parseInt(System.getenv("REGISTRY_PORT"));
    private int block = Integer.parseInt(System.getenv("BLOCKSIZE"));
    private Venusvcb vcb;
    private Vice v;
    public Venus() throws MalformedURLException, RemoteException, NotBoundException, AccessException{
        this.v = (Vice) Naming.lookup("//" + this.host + ":" + this.port + "/AFS");
        this.vcb = new VenusvcbImpl();
    }
    public int getBlock() {
        return this.block;
    }
    public Vice getService() {
        return this.v;
    }
    public Venusvcb getvcb() {
        return this.vcb;
    } 
}

