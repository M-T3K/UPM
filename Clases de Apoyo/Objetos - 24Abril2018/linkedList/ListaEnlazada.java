package linkedList;

import objects.animals.Humano;

public class ListaEnlazada {

	private Nodo cabeza;
	private int tamano;
	
	public ListaEnlazada() {}
	//------------------------------------------
	
	public Nodo getCabeza() {
		
		return this.cabeza;
		
	}
	//------------------------------------------s
	
	public int getTamano() {
		
		return this.tamano;
		
	}
	//------------------------------------------
	
	public void setCabeza(Nodo cabeza) {
		
		this.cabeza = cabeza;
		
	}
	//------------------------------------------
	
	public boolean estaVacia() {
		
		return this.cabeza == null;
		
	}
	//------------------------------------------
	
	public Nodo getCola() {
		
		Nodo nodo = this.cabeza;
		
		while(nodo.haySiguiente()) {
			
			nodo = nodo.getSiguiente();
			
		}
		
		return nodo;
		
	}
	//------------------------------------------
	
	public void vaciarLista() {
		
		this.cabeza = null;
		this.tamano = 0;
		
	}
	//------------------------------------------
	
	public boolean listaContiene(Humano h) {
		
		Nodo nodo = this.cabeza;
		boolean encontrado = false;
		while(nodo.haySiguiente() && !encontrado) {
			
			if(nodo.getDatos().equals(h)) {
				
				encontrado = true;
				
			}
			
		}
		
		return encontrado;
		
	}
	//------------------------------------------
	
	public Nodo getNodo(int pos) {
		
		int i = 0;
		Nodo nodo = this.cabeza;
		
		while(i < pos && nodo.haySiguiente()) {
			
			nodo = nodo.getSiguiente();
			++i;
			
		}
		
		// Aqui se deberia hacer una excepcion en el caso de que la cabeza 
		// sea null o que el Nodo nodo sea null
		// Pero no quiero anadir complejidad
		
		return nodo;
		
		
	}
	//------------------------------------------
	
	public String toString() {
		
		String str = "[";
		Nodo nodo = this.cabeza;
		int i = 0;
		
		while(nodo != null) {
			
			str += i + "->" + nodo.getDatos().getNombre() + ", ";
			++i;
			nodo = nodo.getSiguiente();
			
		}

		return str += "]";
		
	}
	//------------------------------------------
	
	public void anadir(Nodo n) {
		
		Nodo nodo = this.cabeza;
		while(nodo.haySiguiente()) {
			
			nodo = nodo.getSiguiente();
			
		}
		
		nodo.setSiguiente(n);
		++this.tamano;
		
	}
	//------------------------------------------
	
	public void quitar() {
		
		Nodo nodo = this.cabeza;
		while(nodo.getSiguiente().haySiguiente()) {
			
			nodo = nodo.getSiguiente();
			
		}
		nodo.setSiguiente(null);
		--this.tamano;
		
	}
	//------------------------------------------
	
	public void insertar(Nodo n, int idx) {
		
		int i = 0;
		Nodo nodo = this.cabeza;
		
		while(i < idx - 1 && nodo.haySiguiente()) {
			
			nodo = nodo.getSiguiente();
			++i;
			
		}
		
		// Aqui hemos llegado al indice
		
		n.setSiguiente(nodo.getSiguiente());
		nodo.setSiguiente(n);
		++this.tamano;
				
	}
	//------------------------------------------
	
	public void eliminar(int idx) {
		
		int i = 0;
		Nodo nodo = this.cabeza;
		
		while(i < idx - 1 && nodo.haySiguiente()) {
			
			nodo = nodo.getSiguiente();
			++i;
			
		}
		nodo.setSiguiente(nodo.getSiguiente().getSiguiente());
		--this.tamano;
		
	}
	//------------------------------------------
	
	
}
