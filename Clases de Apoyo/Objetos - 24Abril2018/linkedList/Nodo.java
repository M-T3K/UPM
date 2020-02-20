package linkedList;

import objects.animals.Humano;

public class Nodo {

	private Humano datos;
	private Nodo siguiente;
	
	
	public Nodo(Humano datos, Nodo siguiente) {
		
		this.datos = datos;
		this.siguiente = siguiente;
		
	}
	//-----------------------------------------
	
	public Humano getDatos() {
		
		return this.datos;
		
	}
	//-----------------------------------------
	
	public Nodo getSiguiente() {
		
		return this.siguiente;
		
	}
	//-----------------------------------------
	
	public void setDatos(Humano datos) {
		
		this.datos = datos;
		
	}
	//-----------------------------------------
	
	public void setSiguiente(Nodo siguiente) {
		
		this.siguiente = siguiente;
		
	}
	//-----------------------------------------
	
	public boolean haySiguiente() {
		
		if(this.siguiente == null) {
			
			return false;
			
		}
		else {
			
			return true;
			
		}
		
	}
	//------------------------------------------
	
	public String toString() {
		
		return this.datos.toString();
		
	}
	//------------------------------------------
	
	public boolean equals(Object Obj) {
		
		if(Obj instanceof Object) {
			
			Nodo nodo = (Nodo)(Obj);
			return (this.datos.equals(nodo.datos));
			
		}
		else {
			
			return false;
			
		}
		
	}
	//------------------------------------------
	
}
