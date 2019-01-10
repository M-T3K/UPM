package arboles;

import java.util.Iterator;

import es.upm.aedlib.Position;
import es.upm.aedlib.tree.Tree;

public class Ej75_ArbolHeapOrder {
	
	private static boolean hasHeapPropertyGen(Tree<Integer> tree, Position<Integer> pos) {
		
		if(!tree.isRoot(pos) && (pos.element() < tree.parent(pos).element())) {
			
			return false;
		}
		
		Iterator<Position<Integer>> it = tree.children(pos).iterator();
		boolean shouldStop = false;
		while(it.hasNext() && !shouldStop) {
			
			Position<Integer> child = it.next();			
			if(!hasHeapPropertyGen(tree, pos)) {
				
				shouldStop = true;
			}
			
		}
		
		return true;		
	}
	
	public static boolean hasHeapPropertyGen(Tree<Integer> tree) {
		
		if(tree.isEmpty()) {
			
			return true;
		}
		
		Position<Integer> root = tree.root();
				
		return hasHeapPropertyGen(tree, root);
	}
	
}
