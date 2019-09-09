package aed.compress;

import es.upm.aedlib.Position;
import es.upm.aedlib.Entry;
import es.upm.aedlib.tree.*;
import es.upm.aedlib.priorityqueue.*;

public class Huffman {

  private BinaryTree<Character> huffmanTree;

  /**
   * @param text : String que contiene el texto a partir del cual debemos
   *             construir el Arbol de Huffman Optimizado.
   */
  public Huffman(String text) {
    this.huffmanTree = constructHuffmanTree(text);
  }
  // --------------------------------------------------------------------

  /**
   * 
   * @param text : String que contiene los char a contar.
   * @return Contamos la ocurrencia de cada char dentro de 'text', y almacenamos
   *         el resultado en su correspondiente posicion de un array de tamaño 256
   *         (ASCII).
   */
  public static int[] countChars(String text) {

    int arr[] = new int[256];

    for (int i = 0; i < text.length(); ++i) {

      int pos = text.codePointAt(i);
      ++arr[pos];

      /*
       * Alternativa: char ch = text.charAt(i); arr[text.charAt(i)]++;
       */
    }

    return arr;
  }
  // --------------------------------------------------------------------

  /**
   * @param text : String conteniendo la lista de caracteres a partir de los
   *             cuales se debe crear el arbol.
   * @return BinaryTree<Character> T creado tal que T sea un arbol de Huffman
   *         Optimo.
   */
  private BinaryTree<Character> constructHuffmanTree(String text) {

    int[] charCode = this.countChars(text);
    PriorityQueue<Integer, BinaryTree<Character>> Q = new SortedListPriorityQueue<Integer, BinaryTree<Character>>();

    for (int i = 0; i < charCode.length; ++i) {

      char c = (char) i;
      int key = charCode[i];

      if (key > 0) {

        AttachableBinaryTree<Character> T = new AttachableLinkedBinaryTree<Character>();
        T.addRoot(c);
        Q.enqueue(key, T);
      }

    }

    while (Q.size() > 1) {

      Entry<Integer, BinaryTree<Character>> left = Q.dequeue();
      Entry<Integer, BinaryTree<Character>> right = Q.dequeue();

      AttachableBinaryTree<Character> T = new AttachableLinkedBinaryTree<Character>();
      T.addRoot(' '); // Debemos anadir una nueva Raiz...
      T.attach(T.root(), left.getValue(), right.getValue());

      Q.enqueue(left.getKey() + right.getKey(), T);
    }

    return Q.dequeue().getValue();
  }
  // --------------------------------------------------------------------

}
