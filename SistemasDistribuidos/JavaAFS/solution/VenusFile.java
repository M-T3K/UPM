// Clase de cliente que define la interfaz a las aplicaciones.
// Proporciona la misma API que RandomAccessFile.
package afs;

import java.rmi.*; 
import java.io.*; 

public class VenusFile {
    public static final String cacheDir = "Cache/";
    private boolean mod;
    private Venus venus;
    private String fileName;
    private String mode;
    private RandomAccessFile rf;
    
    public VenusFile(Venus venus, String fileName, String mode) throws RemoteException, IOException, FileNotFoundException {
    	this.venus = venus;
    	this.fileName = fileName;
    	this.mode = mode;
    	this.mod = false;
    	File f = new File(VenusFile.cacheDir + fileName);
    	if(!f.exists()) {
    		ViceReader vr;
			vr = venus.getService().download(fileName, mode, venus.getCB());
    		int block = venus.getBlock();
    		if(mode.equals("rw")) {
    			rf = new RandomAccessFile(VenusFile.cacheDir + fileName, mode);
    			byte[] b = new byte[block];
    			while((b = vr.read(block)) != null) {
    				this.rf.write(b);
    			}
    		}
    		else {
    			RandomAccessFile interm = new RandomAccessFile(VenusFile.cacheDir + fileName, "rw");
    			byte[] b = new byte[block];
    			while((b = vr.read(block)) != null) {
    				interm.write(b);
    			}
    			interm.close();
    			rf = new RandomAccessFile(VenusFile.cacheDir + fileName, mode);
			}
			vr.close();
    		this.rf.seek(0);
    	}
    	else {
    		rf = new RandomAccessFile(f, mode);
    	}
    }
    public int read(byte[] b) throws RemoteException, IOException {
        return this.rf.read(b);
    }
    public void write(byte[] b) throws RemoteException, IOException {
        this.rf.write(b);
        this.mod = true;
    }
    public void seek(long p) throws RemoteException, IOException {
        this.rf.seek(p);
    }
    public void setLength(long l) throws RemoteException, IOException {
        this.rf.setLength(l);
        this.mod = true;
    }
    public void close() throws RemoteException, IOException {
    	if(!this.mod) {
    		this.rf.close();
    	}
    	else {
    		ViceWriter vw = this.venus.getService().upload(this.fileName, this.mode, this.venus.getCB());
			byte[] b = new byte[this.venus.getBlock()];
			this.rf.seek(0);
			while(this.rf.read(b) != -1){
				vw.write(b);
			}
			vw.setLen(this.rf.length());
			vw.close();
			this.rf.close();
    	}
    }
}

