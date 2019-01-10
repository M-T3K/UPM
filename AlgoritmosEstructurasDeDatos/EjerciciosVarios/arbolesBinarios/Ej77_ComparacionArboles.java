package arbolesBinarios;

import java.util.Comparator;
import java.util.Iterator;

import es.upm.aedlib.tree.BinaryTree;

public class Ej77_ComparacionArboles<E> implements Comparator<BinaryTree<E>> {

	// Apartado A: si el minimo de elementos es n, en el peor de los casos se comparan
	// n elementos. Esto significa que en el peor caso la complejidad es O(n) y no
	// O(log n)

	// Apartado B:
	
	private Comparator<E> compElementos;
	
	
	public Ej77_ComparacionArboles(Comparator<E> compElementos)	{
		
		this.compElementos = compElementos;
	}
	
	
	@Override
	public int compare(BinaryTree<E> o1, BinaryTree<E> o2) {
		
		Iterator<E> it1 = o1.iterator();
		Iterator<E> it2 = o2.iterator();
		int cmp = 0;
		
		while(it1.hasNext() && it2.hasNext() && cmp == 0) {
			
			E val1 = it1.next();
			E val2 = it2.next();
			cmp = this.compElementos.compare(val1, val2);
		}
		
		// Salimos del bucle pq se encontro una diferencia de valores
		
		// Si la comparacion no es o, devolvemos la comparacion
		if(cmp != 0) {
			
			return cmp;
		}
		
		return o1.size() - o2.size();
	}
	
}
