package aed.orderedmap;


import java.util.Comparator;

import es.upm.aedlib.Position;
import es.upm.aedlib.positionlist.PositionList;
import es.upm.aedlib.positionlist.NodePositionList;

public class PositionListOrderedMap<K,V> implements OrderedMap<K,V> {
    private Comparator<K> cmp;
    private PositionList<Entry<K,V>> elements;
  
    /* Acabar de codificar el constructor */
    public PositionListOrderedMap(Comparator<K> cmp) {
	
    	this.cmp = cmp;
    	this.elements = new NodePositionList<Entry<K, V>>();
    	
    }
  //------------------------------------------------------------------- 
  
		/**
		 * @param  : <key> de tipo generico <K> cuya posicion recomendada debe ser 
		 * 				obtenida.
		 * @return la posicion recomendada para <key>; <null> si la lista esta vacia
		 * 				 o si el primer elemento es null.
		 */
    private Position<Entry<K, V>> findKeyPlace(K key) {


			// Si esta vacia, devolvemos <null>
    	if(this.isEmpty()) {
    		
    		return null;
    		
    	}
    	
    	boolean found = false;
    	
    	Position<Entry<K, V>> curr = this.elements.first();
    	
    	while((curr != null) && !found) {
    		
    		if(this.cmp.compare(curr.element().getKey(), key) >= 0) {
    			
    			found = true;
    			
    		}
    		else {
    			
    			curr = this.elements.next(curr);
    			
    		}
    		
    	}
    	
    	return curr;

    } 
    //-------------------------------------------------------------------
    
    /**
	 	 * @param key : de tipo generico <K> cuya posicion debe ser 
		 * 				obtenida.
		 * @return la posicion de <key>; <null> si la lista esta vacia
		 * 				 o si el primer elemento es null. (Si no es encontrada)
		 */
    private Position<Entry<K,V>> keyPosition(K key) {
    
    	// En el caso de que este vacia, no hace falta continuar
    	if(this.isEmpty()) {
    		
    		return null;
    		
    	}
    	
    	boolean found = false;
    	
    	Position<Entry<K, V>> curr = this.elements.first();
    	
    	while((curr != null) && !found) {
    		
    		if(this.cmp.compare(curr.element().getKey(), key) == 0) {
    			
    			found = true;
    			
    		}
    		else {
    			
    			curr = this.elements.next(curr);
    			
    		}
    		
    	}
    	
    	return curr;
    	
    }
  	//-------------------------------------------------------------------
  
    /**
     * @param key : Dato del tipo generico <K> que representa la
     * 						clave de un elemento del Map.
     * @return <true> si <key> es encontrada y <false> si no.
     */
    public boolean containsKey(K key) throws InvalidKeyException {
			
			if(key == null) {

				throw new InvalidKeyException();

			}

  		return (this.keyPosition(key) != null);
    	
    }
  	//-------------------------------------------------------------------
	
		/**
		 * @param key : Dato del tipo generico <K> del cual debemos obtener el Valor <V> 
		 * 						que va a juego.
		 */
    public V get(K key) throws InvalidKeyException {
      
      if(key == null) {
      
        throw new InvalidKeyException();

      }

    	Position<Entry<K, V>> ex = this.keyPosition(key);
    	if(ex == null) {
    		
    		return null;
    		
    	}
    	
    	return ex.element().getValue();
    	
    }
  //-------------------------------------------------------------------
		
	
    public V put(K key, V value) throws InvalidKeyException {
      
      if(key == null) {

        throw new InvalidKeyException();

      }

      Entry<K, V>           curr  = new EntryImpl<K, V>(key, value);
      Position<Entry<K, V>> post  = this.findKeyPlace(key);
      
      if(post == null) {
    	  
    	  this.elements.addLast(curr);
    	  return null;
    	  
      }
      
      this.elements.addBefore(post, curr);

      if(this.cmp.compare(key, post.element().getKey()) != 0) {
    	  
    		return null;
    	
      }
      
      {
    	  
    	  V val = post.element().getValue();
    	  this.elements.remove(post);
    	  return val;
    	  
      }
      
    }
  //-------------------------------------------------------------------
    
    public V remove(K key) throws InvalidKeyException {
    	
    	if(key == null) {
    		
    		throw new InvalidKeyException();
    		
    	}
    	
    	if(this.isEmpty()) {
    		
    		return null;
    		
    	}
    	
    	Position<Entry<K, V>> toRemove = this.keyPosition(key);
      
      
      if(toRemove == null) {

    	  //throw new InvalidKeyException();
    	  return null;
    	  
      }

    	return this.elements.remove(toRemove).getValue();
	
    }
  //-------------------------------------------------------------------

    /**
     * @return Devuelve el tamano <int> (Cantidad de Elementos) de este Objeto.
     */
    public int size() {
    	return this.elements.size();
    }
  //-------------------------------------------------------------------
    
    /**
     * @return Devuelve <true> si Este Objeto <PositionListOrderedMap> esta vacio, 
     * 				  y <false> si no es asi.
     */
    public boolean isEmpty() {
    	
    	return this.elements.isEmpty();
    	
    }
  //-------------------------------------------------------------------
    
    /**
		 * @param key : Clave del tipo generico <K>
		 * @return Return the entry with the greatest key less than or equal to the argument key, or null if no such entry exists.
		 */
    public Entry<K,V> floorEntry(K key) throws InvalidKeyException {
    	
    	if(key == null) {
    		
    		throw new InvalidKeyException();
    		
    	}
    	
    	if(this.isEmpty()) {
    		
    		return null;
    		
    	}
    	
      Position<Entry<K, V>> curr = this.elements.first(); // CURRENT NODE
    	boolean found = false;
      
    	while(!found && (this.elements.next(curr) != null) && (this.cmp.compare(curr.element().getKey(), key) <= 0)) {
    		
    		if(this.cmp.compare(this.elements.next(curr).element().getKey(), key) > 0) {
    			
    			found = true;
    			
    		}
    		else {
    			
    			curr = this.elements.next(curr);
    			
    		}
    		
    	}
    	
    	if(this.cmp.compare(curr.element().getKey(), key) > 0) {
    		
    		return null;
    		
    	}
    	
    	return curr.element();
    	
    }
  //-------------------------------------------------------------------
    
    /**
     * @param key : Clave del tipo <K>.
		 * @return Return the entry with the smallest key greater or equal to the argument key, or null if no such entry exists.
     */
    public Entry<K,V> ceilingEntry(K key) throws InvalidKeyException {
    	
    	if(key == null) {
    		
    		throw new InvalidKeyException();
    		
    	}
    	
    	if(this.isEmpty()) {
    		
    		return null;
    		
    	}
    	
      Position<Entry<K, V>> curr = this.elements.first(); // CURRENT NODE
    	boolean found = false;
      
    	while(!found && (this.elements.next(curr) != null) && (this.cmp.compare(curr.element().getKey(), key) < 0)) {
    		
    		curr = this.elements.next(curr);
    		
    	}
    	
    	if(this.cmp.compare(curr.element().getKey(), key) >= 0) {
    		
    		return curr.element();
    		
    	}
    	
    	return null;
    }
  //-------------------------------------------------------------------
		
	/**
	 * @return Una lista tipo Iterable<K> que contiene todas las keys de elements.
	 */
    public Iterable<K> keys() {
    	
    	PositionList<K> keys = new NodePositionList<K>();
    	
    	for(Entry<K, V> entry : this.elements) {
    		
    		if(keys.first() == null) {
    			
    			keys.addFirst(entry.getKey());
    			
    		}
    		else {
    			
    			keys.addLast(entry.getKey());
    			
    		}
    		
    	}
          	
      // Como PositionList ya extiende a Iterable, podemos simplemente devolver
      // la PositionList <keys>.
    	return keys;

    }
  //-------------------------------------------------------------------
    
    public String toString() {
    	
    	return elements.toString();
	
    }
    //-------------------------------------------------------------------
 
  
}
