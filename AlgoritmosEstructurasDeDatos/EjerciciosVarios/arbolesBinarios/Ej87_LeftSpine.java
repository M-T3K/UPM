package arbolesBinarios;

import es.upm.aedlib.Position;
import es.upm.aedlib.tree.BinaryTree;

public class Ej87_LeftSpine<E> {
	
	// A) Caso peor seria O(n) si todos los elementos estan en el Lado izquierdo, donde n = 
	// la altura (si solo tuviera un elemento seria O(0), no hay nada que podar)
	
	public void leftSpine(BinaryTree<E> tree) {
		
		
		if(tree.isEmpty()) {
			return;
		}
		
		Position<E> curr = tree.root();

		while(!tree.isExternal(curr)) {
		
			if(tree.hasRight(curr)) {
				
				tree.removeSubTree(tree.right(curr));
			}
			// Just in case it only had a right path.
			if(tree.hasLeft(curr)) {
				
				curr = tree.left(curr);			
			}
		}
	}
}
