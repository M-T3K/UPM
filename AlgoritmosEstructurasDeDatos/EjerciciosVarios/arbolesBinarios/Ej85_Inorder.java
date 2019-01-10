package arbolesBinarios;

import es.upm.aedlib.Position;
import es.upm.aedlib.tree.BinaryTree;

public class Ej85_Inorder {

	public <E> void inOrder(BinaryTree<E> t, Position<E> pos) {
		
		if(t.hasLeft(pos)) {
			
			inOrder(t, t.left(pos));
		}
		
		System.out.println(" " + pos.element() + " ");
		
		if(t.hasRight(pos)) {
			
			inOrder(t, t.right(pos));
		}
	}
	
	public <E> void inOrder(BinaryTree<E> t) {
		
		if(t.isEmpty()) {
			
			return;
		}
		
		// InOrder: Left, Root, Right
		Position<E> root = t.root();
		
		inOrder(t, root);
		
	}
	
}
