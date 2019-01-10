package arbolesBinarios;

import es.upm.aedlib.Position;
import es.upm.aedlib.tree.BinaryTree;

public class Ej95_SumTree {

	private static void sumTree(BinaryTree<Integer> tree, Position<Integer> pos) {
		
		Integer sumRight = 0;
		Integer sumLeft = 0;
		
		if(tree.hasLeft(pos)) {
			
			sumTree(tree, tree.left(pos));
			sumLeft = tree.left(pos).element();
		}
		
		if(tree.hasRight(pos)) {
			
			sumTree(tree, tree.right(pos));
			sumRight = tree.right(pos).element();
		}
		
		tree.set(pos, sumRight + sumLeft);
		
	}
	
	public static void sumTree(BinaryTree<Integer> tree) {
		
		if(tree.isEmpty() || tree == null) {
			
			return;
		}
		
		Position<Integer> root = tree.root();
		sumTree(tree, root);		
	}	
}
