package arboles;

import java.util.Iterator;

import es.upm.aedlib.Position;
import es.upm.aedlib.positionlist.NodePositionList;
import es.upm.aedlib.positionlist.PositionList;
import es.upm.aedlib.tree.Tree;

public class Ej73_Ancestros {
	
	public static <E> PositionList<E> ancestros(Tree<E> t, Position<E> p) {
		
		PositionList<E> res = new NodePositionList<E>();
		
		while(!p.equals(t.root())) {
			p = t.parent(p);
			res.addLast(p.element());
		}
				
		return res;
	}
	
}
