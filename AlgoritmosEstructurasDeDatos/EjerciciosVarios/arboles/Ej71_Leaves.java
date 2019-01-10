package arboles;

import es.upm.aedlib.Position;
import es.upm.aedlib.positionlist.NodePositionList;
import es.upm.aedlib.positionlist.PositionList;
import es.upm.aedlib.tree.Tree;

public class Ej71_Leaves {
	
	private <E> void leaves(Tree<E> t, Position<E> pos, PositionList<E> res) {
		// 35 91
		if(t.isExternal(pos)) {
			res.addLast(pos.element());
		}
		
		for(Position<E> child : t.children(pos)) {
			this.leaves(t, child, res);
		}
	}
	
	public <E> PositionList<E> leaves(Tree<E> t) {
		
		PositionList<E> res = new NodePositionList<E>();
		if(t.isEmpty()) {
			return res;
		}
		
		Position<E> root = t.root();
		this.leaves(t, root, res);
		
		return res;
	}
	
}
