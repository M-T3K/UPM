// Interfaz de servidor que define los métodos remotos para iniciar
// la carga y descarga de ficheros
package afs;
import java.rmi.*;
import java.util.ArrayList;
import java.util.Map;
import java.io.IOException;

public interface Vice extends Remote {
    public ViceReader download(String fileName, String mode, afs.VenusCB cb)
    	throws RemoteException, IOException;
    public ViceWriter upload(String fileName, String mode, afs.VenusCB cb)
    	throws RemoteException, IOException;
  
    public Map<String, ArrayList<VenusCB>> getMap() throws RemoteException;
    /* añada los métodos remotos que requiera */

}
       

