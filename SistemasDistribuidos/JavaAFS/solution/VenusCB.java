// Interfaz de cliente que define los métodos remotos para gestionar
// callbacks
package afs;

import java.rmi.*;

public interface VenusCB extends Remote {
    public void invalidate(String fileName) throws RemoteException;
}

