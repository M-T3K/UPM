package arbolesBinarios;

import es.upm.aedlib.Position;
import es.upm.aedlib.tree.BinaryTree;
import es.upm.aedlib.tree.EmptyTreeException;

public class Ej76_HojaIzquierda {
	
	public <E> E leftMostLeaf(BinaryTree<E> t) {
		
		if(t.isEmpty()) {
			throw new EmptyTreeException("Arbol vacio.");
		}
		
		Position<E> pos = t.root();
		
		while(!t.isExternal(pos)) {
			
			if(!t.hasLeft(pos)) {
				
				pos = t.right(pos);
			}
			else {
				
				pos = t.left(pos);
			}
			
		}
		return pos.element();
	}
	
}
