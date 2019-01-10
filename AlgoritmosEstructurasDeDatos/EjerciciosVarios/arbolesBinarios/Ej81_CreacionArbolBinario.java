package arbolesBinarios;

import es.upm.aedlib.Position;
import es.upm.aedlib.tree.BinaryTree;
import es.upm.aedlib.tree.LinkedBinaryTree;

public class Ej81_CreacionArbolBinario {

	//      un
	// En       de
	//     lugar   la
	//                Mancha
	
	
	public <E> void creacionArbol() {
		
		BinaryTree<String> t = new LinkedBinaryTree<String>();
		t.addRoot("un");
		t.insertLeft(t.root(), "En");
		
		
		Position<String> lastPos = t.insertRight(t.root(), "de");
		t.insertLeft(lastPos, "lugar");
		lastPos = t.insertRight(lastPos, "la");
		t.insertRight(lastPos, "Mancha");
	}
}
