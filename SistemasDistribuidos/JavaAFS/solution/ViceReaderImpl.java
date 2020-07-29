// Implementación de la interafaz de servidor que define los métodos remotos
// para completar la descarga de un fichero
package afs;
import java.rmi.*;
import java.rmi.server.*;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.RandomAccessFile;
import java.io.File;

public class ViceReaderImpl extends UnicastRemoteObject implements ViceReader {
    private static final String AFSDir = "AFSDir/";
    private RandomAccessFile raf;
	private String fileName;
	private ViceImpl vi;

	public ViceReaderImpl(String fileName, String mode, ViceImpl vi)
		    throws RemoteException, FileNotFoundException {
    	this.fileName = fileName;
    	this.vi = vi;
    	File f = new File(ViceReaderImpl.AFSDir + fileName);
    	raf = new RandomAccessFile(ViceReaderImpl.AFSDir + fileName, mode);
    	this.vi.getLm().bind(fileName).readLock().lock();
    }
	@Override
    public byte[] read(int tam) throws RemoteException, IOException {
    	// TODO Auto-generated method stub
    	long rest = this.raf.length() - this.raf.getFilePointer();
    	if(rest == 0) {
    		return null;
    	}
    	byte b[];
        if(rest < tam) {
        	b = new byte[Math.toIntExact(rest)];
        }
        else {
        	b = new byte[tam];
        }
        this.raf.read(b);
        return b;
    }
    @Override
    public void close() throws RemoteException, IOException {
        raf.close();
        this.vi.getLm().bind(this.fileName).readLock().unlock();
        this.vi.getLm().unbind(this.fileName);
    }
}       

