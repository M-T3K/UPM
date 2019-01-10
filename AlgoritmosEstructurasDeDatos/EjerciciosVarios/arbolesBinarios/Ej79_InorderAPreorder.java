package arbolesBinarios;

public class Ej79_InorderAPreorder {

	// Dibujemos el Arbol
	// Inorder: BACKFHDEG
	// 1) F es root, BACK es la parte izquierda y HDEG la parte derecha
	// 2) BACK: B es externo izquierdo, A es el root de ese sub arbol.
	
	//                                   F
	//                               A      D
	//                              B  K  H  G
    //                                  C      E
	
	// Preorder: Root, Izq, Der
	// Postorder: Izq, Der, Root
	// Inorder:   Izq, Root, Der
	
	// En este caso Inorder = BACKFHDEG
	// Preorder := FABKCDHGE
	
	// Debido al numero de permutaciones hay n! arboles distintos con este inorder.
	// Pero la respuesta que quieren es FABKCDHGE		 
}
