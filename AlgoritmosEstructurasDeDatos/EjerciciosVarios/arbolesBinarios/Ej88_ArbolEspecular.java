package arbolesBinarios;

import es.upm.aedlib.Position;
import es.upm.aedlib.lifo.LIFOList;
import es.upm.aedlib.tree.BinaryTree;
import es.upm.aedlib.tree.LinkedBinaryTree;

public class Ej88_ArbolEspecular {

	public <E> void espejo(BinaryTree<E> t, BinaryTree<E> mirror, Position<E> pos, Position<E> posm) {
		
		Position<E> nuevaPos; // Siguiente Posicion 
		Position<E> nuevaPosm; // Siguiente Posicion en Mirror (la que vamos a anadir)
		
		if(t.hasLeft(pos)) {
			
			nuevaPos = t.left(pos);
			nuevaPosm = mirror.insertRight(posm, nuevaPos.element());
			espejo(t, mirror, nuevaPos, nuevaPosm);
		}
		if(t.hasRight(pos)) {
			
			nuevaPos = t.right(pos);
			nuevaPosm = mirror.insertLeft(posm, nuevaPos.element());
			espejo(t, mirror, nuevaPos, nuevaPosm);
		}
		
	}
	
	public <E> BinaryTree<E> espejo(BinaryTree<E> t) {
		
		BinaryTree<E> mirror = new LinkedBinaryTree<E>();
		if(t.isEmpty()) {
			return mirror;
		}
		
		Position<E> pos  = t.root();
		Position<E> posm = mirror.addRoot(pos.element());
		
		espejo(t, mirror, pos, posm);
		return mirror;
	}
}
