// Implementación de la interafaz de servidor que define los métodos remotos
// para completar la carga de un fichero
package afs;
import java.rmi.*;
import java.rmi.server.*;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.RandomAccessFile;
import java.util.Iterator;

public class ViceWriterImpl extends UnicastRemoteObject implements ViceWriter {
	private static final String AFSDir = "AFSDir/";
	private RandomAccessFile raf;
	private String fileName;
	private ViceImpl vi;
	private Venusvcb vcb;
    public ViceWriterImpl(String fileName, String mode, ViceImpl vi, Venusvcb vcb)
		    throws RemoteException, FileNotFoundException {
    	this.fileName = fileName;
    	this.vi = vi;
    	this.vcb = vcb;
    	raf = new RandomAccessFile(ViceWriterImpl.AFSDir + fileName, mode);
    	this.vi.getLm().bind(this.fileName).writeLock().lock();
    }
    @Override
    public void write(byte [] b) throws RemoteException, IOException {
    	// TODO Auto-generated method stub
        this.raf.write(b);
    }
    @Override
    public void close() throws RemoteException, IOException {
    	// TODO Auto-generated method stub
        this.raf.close();
        if(this.vi.getMap().containsKey(this.fileName)) {
			Iterator<Venusvcb> it = this.vi.getMap().get(this.fileName).iterator();
			while(it.hasNext()){
				Venusvcb aux = it.next();
				if(!aux.equals(this.vcb)){
					aux.invalidate(this.fileName);
					it.remove();
				}
			}
        }
        this.vi.getLm().bind(this.fileName).writeLock().unlock();
        this.vi.getLm().unbind(this.fileName);
    }
	@Override
	public void setLen(long tam) throws RemoteException, IOException {
		// TODO Auto-generated method stub
		this.raf.setLength(tam);
	}

}       
      

