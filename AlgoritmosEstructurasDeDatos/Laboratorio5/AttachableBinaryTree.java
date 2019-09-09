package aed.compress;

import es.upm.aedlib.Position;
import es.upm.aedlib.tree.BinaryTree;


public interface AttachableBinaryTree<E> extends BinaryTree<E> {
  public void attach(Position<E> pos, BinaryTree<E> leftTree, BinaryTree<E> rightTree);
}
