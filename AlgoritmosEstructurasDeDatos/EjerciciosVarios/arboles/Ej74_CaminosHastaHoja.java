package arboles;

import es.upm.aedlib.Position;
import es.upm.aedlib.tree.Tree;

public class Ej74_CaminosHastaHoja {
	
	static <E> void imprimirCaminosHojas(Tree<E> tree, Position<E> pos, String path) {
		
		path += pos.element().toString();
		
		if(tree.isExternal(pos)) {
			System.out.println(path);
			return;
		}
		
		for(Position<E> child : tree.children(pos)) {
			
			imprimirCaminosHojas(tree, child, path);
		}
		
	}
	
	static <E> void imprimirCaminosHojas(Tree<E> tree) {
		
		if(tree.isEmpty()) {
			return;
		}
		
		Position<E> root = tree.root();
		imprimirCaminosHojas(tree, root, "");
		
	}
	
}
