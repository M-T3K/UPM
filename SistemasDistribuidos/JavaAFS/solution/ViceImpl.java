// Implementación de la interfaz de servidor que define los métodos remotos
// para iniciar la carga y descarga de ficheros
package afs;
import java.rmi.*;
import java.rmi.server.*;
import java.util.ArrayList;
import java.util.Collections;
import java.util.HashMap;
import java.util.Map;
import java.io.FileNotFoundException;

public class ViceImpl extends UnicastRemoteObject implements Vice {
	
	private LockManager lm;
	private Map<String, ArrayList<VenusCB>> list = Collections.synchronizedMap(new HashMap<String, ArrayList<VenusCB>>());
	public ViceImpl() throws RemoteException {
		this.lm = new LockManager();
    }
	@Override
	public ViceReader download(String fileName, String mode, VenusCB cb) throws RemoteException, FileNotFoundException {
		// TODO Auto-generated method stub
		if(!this.list.containsKey(fileName)) {
			this.list.put(fileName, new ArrayList<VenusCB>());
		}
		this.list.get(fileName).add(cb);
		return new ViceReaderImpl(fileName, mode, this);
	}
	@Override
	public ViceWriter upload(String fileName, String mode, VenusCB cb) throws RemoteException, FileNotFoundException {
		return new ViceWriterImpl(fileName, mode, this, cb);
	}
	public LockManager getLm() {
		return this.lm;
	}
	@Override
	public synchronized Map<String, ArrayList<VenusCB>> getMap() throws RemoteException {
		return this.list;
	}
}
