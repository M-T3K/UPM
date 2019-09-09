package aed.compress;

import es.upm.aedlib.Position;
import es.upm.aedlib.tree.*;

public class AttachableLinkedBinaryTree<E> extends LinkedBinaryTree<E> implements AttachableBinaryTree<E> {

	/**
	 * @param pos  : Position<E> perteneciente a esta instancia de objeto a partir
	 *             de la cual deseamos añadir los 2 subarboles.
	 * @param ins  : Position<E> perteneciente al subarbol 'tree' que vamos a
	 *             insertar despues de 'pos'.
	 * @param tree : BinaryTree<E> que queremos añadir a esta instancia de Arbol
	 *             (this)
	 */
	public void attach(Position<E> pos, BinaryTree<E> leftTree, BinaryTree<E> rightTree) {

		attachRec(pos, leftTree.root(), true, leftTree);
		attachRec(pos, rightTree.root(), false, rightTree);
	}
	// --------------------------------------------------------------------

	/**
	 * @param pos        : Position<E> perteneciente a esta instancia de objeto a
	 *                   partir de la cual deseamos añadir los 2 subarboles.
	 * @param ins        : Position<E> perteneciente al subarbol 'tree' que vamos a
	 *                   insertar despues de 'pos'.
	 * @param shouldLeft : Valor booleano que nos indica si deberia ir hacia la
	 *                   izquierda o hacia la derecha a la hora de insertar nuevos
	 *                   datos en el arbol.
	 * @param tree       : BinaryTree<E> que queremos añadir a esta instancia de
	 *                   Arbol (this)
	 */
	private void attachRec(Position<E> pos, Position<E> ins, boolean shouldLeft, BinaryTree<E> tree) {

		Position<E> newPos; // Position<E> en la cual guardamos la posicion que acabamos de insertar.
		if (shouldLeft) {

			this.insertLeft(pos, ins.element());
			newPos = this.left(pos); // El elemento que acabamos de anadir
		} else {

			this.insertRight(pos, ins.element());
			newPos = this.right(pos); // El elemento que acabamos de anadir
		}

		if (tree.hasLeft(ins)) {

			attachRec(newPos, tree.left(ins), true, tree);
		}
		if (tree.hasRight(ins)) {

			attachRec(newPos, tree.right(ins), false, tree);
		}

	}
	// --------------------------------------------------------------------

}
