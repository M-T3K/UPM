package aed.huffman;

import es.upm.aedlib.Position;
import es.upm.aedlib.tree.*;

/**
 * Defines metodos for Huffman encoding of text strings.
 */
public class Huffman {

	private LinkedBinaryTree<Character> huffmanTree;

	public Huffman(LinkedBinaryTree<Character> huffmanTree) {
		// NO CAMBIA ESTE METODO!!! Esta usado durante las pruebas
		this.huffmanTree = huffmanTree;
	}
	// --------------------------------------------------------------------

	// @Opt
	/**
	 * Creates a Huffman tree (and stores it in the attribute huffmanTree). The
	 * shape of the (binary) tree is defined by the array of char-codes.
	 */
	public Huffman(CharCode[] paths) {

		LinkedBinaryTree<Character> newTree = new LinkedBinaryTree<Character>();
		
		// Padre de todos
		newTree.addRoot(' ');

		for (CharCode cc : paths) {

			Character ch = cc.getCh();
			String str = cc.getCode();
			Position<Character> prev = newTree.root();

			for (int i = 0; i < str.length(); ++i) {

				if (str.charAt(i) == '1') {

					if (i == str.length() - 1) {

						newTree.insertRight(prev, ch);
					} else {

						if (newTree.hasRight(prev)) {

							prev = newTree.right(prev);
						} else {

							newTree.insertRight(prev, null);
							prev = newTree.right(prev);
						}
					}
				} else {

					if (i == str.length() - 1) {

						newTree.insertLeft(prev, ch);
					} else {

						if (newTree.hasLeft(prev)) {

							prev = newTree.left(prev);
						} else {

							newTree.insertLeft(prev, null);
							prev = newTree.left(prev);
						}

					}
				}
			}

		}

		this.huffmanTree = newTree;
	}
	// --------------------------------------------------------------------

	/**
	 * Huffman encodes a text, returning a new text string containing only
	 * characters '0' and '1'.
	 */
	public String encode(String text) {

		String res = "";

		for (char ch : text.toCharArray()) {

			res += findCharacterCode(ch, this.huffmanTree, this.huffmanTree.root(), "");
		}
		return res;
	}
	// --------------------------------------------------------------------

	// CAMBIA e UTILIZA si quiereis
	private String findCharacterCode(Character ch, BinaryTree<Character> tree, Position<Character> pos, String path) {

		// Hemos encontrado el elemento
		if (pos.element().equals(ch)) {

			return path;
		}

		// Comprobamos si hay un nodo izquierdo
		if (tree.hasLeft(pos)) {

			Position<Character> left = tree.left(pos);

			String strLeft = findCharacterCode(ch, tree, left, path + "0");

			// Encontrar el char => strLeft != null; Entonces,
			if (strLeft != null) {

				return strLeft;
			}

		}

		// Repetimos el proceso anterior por la derecha
		if (tree.hasRight(pos)) {

			Position<Character> right = tree.right(pos);

			String strRight = findCharacterCode(ch, tree, right, path + "1");

			if (strRight != null) {

				return strRight;
			}

		}

		return null;
	}
	// --------------------------------------------------------------------

	/**
	 * Given the Huffman encoded text argument (a string of only '0' and '1's),
	 * returns the corresponding normal text.
	 */
	public String decode(String encodedText) {

		LinkedBinaryTree<Character> tree = this.huffmanTree;
		Position<Character> pos = tree.root();
		String res = "";

		for (int i = 0; i < encodedText.length(); ++i) {

			// Si debe ir a la izquierda...
			if (encodedText.charAt(i) == '0') {

				// y puede ir a la izquierda...
				if (tree.hasLeft(pos)) {

					// pasamos a la siguiente iteracion del bucle con el nodo izquierdo...
					pos = tree.left(pos);
				}

				// Si no puede ir a la izquierda, comprobamos que es un Externo
				if (tree.isExternal(pos)) {

					// si no puede ir a la izquierda, significa que ya hemos llegado
					// a nuestro destino
					// por lo que anadimos a nuestra cadena de caracteres
					// y reiniciamos el nodo
					res += pos.element();
					pos = tree.root();

				}
			} else {

				if (tree.hasRight(pos)) {

					pos = tree.right(pos);
				}

				if (tree.isExternal(pos)) {

					res += pos.element();
					pos = tree.root();
				}
			}

		}

		return res;
	}
	// --------------------------------------------------------------------

}

