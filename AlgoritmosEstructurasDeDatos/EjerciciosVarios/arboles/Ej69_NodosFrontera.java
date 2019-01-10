package arboles;

import java.util.Iterator;

import es.upm.aedlib.Position;
import es.upm.aedlib.positionlist.NodePositionList;
import es.upm.aedlib.positionlist.PositionList;
import es.upm.aedlib.tree.Tree;

public class Ej69_NodosFrontera {
	
	private <E> void getExternalChildren(Tree<E> t, Position<E> pos, PositionList<E> res) {
		
		Iterator<Position<E>> it = t.children(pos).iterator();
		boolean found = false;
		while(it.hasNext() && !found) {
			Position<E> curr = it.next();
			if(t.isExternal(curr)) {
				found = true;
			}
		}
		
		if(found) {
			res.addLast(pos.element());
		}
		
		for(Position<E> child : t.children(pos)) {
			
			if(! t.isExternal(child)) {
				this.getExternalChildren(t, child, res);
			}
		}

	}
	
	public <E> PositionList<E> 	getExternalChildren(Tree<E> t) {
		
		PositionList<E> res = new NodePositionList<E>();
		if(t.isEmpty()) {
			return res;
		}
		
		Position<E> root = t.root();
		this.getExternalChildren(t, root, res);
		
		return res;
	}
	
}
