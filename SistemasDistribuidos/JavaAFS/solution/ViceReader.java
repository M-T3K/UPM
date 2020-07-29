// Interfaz de servidor que define los métodos remotos
// para completar la descarga de un fichero
package afs;
import java.rmi.*;
import java.io.IOException;

public interface ViceReader extends Remote {
    public byte[] read(int tam) throws RemoteException,IOException;
    public void close() throws RemoteException,IOException;
    /* añada los métodos remotos que requiera */
}       

