package arboles;

import es.upm.aedlib.Position;
import es.upm.aedlib.tree.Tree;

public class Ej72_Siblings {

	public <E> boolean siblings(Tree<E> t, Position<E> p1, Position<E> p2) {
		
		return p1 != p2 && (!t.isRoot(p1) && !t.isRoot(p2)) 
			   && t.parent(p1) == t.parent(p2);
	}
}
