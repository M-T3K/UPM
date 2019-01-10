package arbolesBinarios;

import es.upm.aedlib.Position;
import es.upm.aedlib.fifo.FIFOList;
import es.upm.aedlib.positionlist.NodePositionList;
import es.upm.aedlib.tree.BinaryTree;

public class Ej86_Breadth {

	public <E> NodePositionList<E> breadth(BinaryTree<E> tree) {
		
		NodePositionList<E> res = new NodePositionList<E>();
		
		if(tree.isEmpty()) {
			
			return res;
		}
		
		Position<E> pos = tree.root();
		
		FIFOList<Position<E>> queue = new FIFOList<>();
		queue.enqueue(pos);
		
		while(!queue.isEmpty()) {
			
			
			for(Position<E> child : tree.children(pos)) {
				
				queue.enqueue(child);
			}
			
			res.addLast(queue.dequeue().element());
			pos = queue.first();
			
		}
		
		return res;
	}
	
}
