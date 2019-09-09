package aed.individual4;

import java.util.Iterator;

import es.upm.aedlib.positionlist.NodePositionList;
import es.upm.aedlib.positionlist.PositionList;

public class OperacionCompactar {

	/**
	 * 
	 * @param elem1 : Primer elemento del tipo <E> a comparar.
	 * @param elem2 : Segundo elemento del tipo <E> a comparar.
	 * @return <true> o <false> dependiendo si se deberían añadir
	 * 			a la lista (es decir, que son distintos).
	 */
	private <E> boolean nullNotEquals(E elem1, E elem2) {

		// Debemos comprobar que ambos elementos no sean null, ya 
		// que eso significaría que son iguales. Una vez se cumpla
		// este requerimiento, debemos asegurarnos de que solo 1
		// de los elementos  pueda ser <null>, de manera que sean distintos.
		// Por último debemos comprobar si los elemento son iguales 
		// mediante <.equals()>. Es importante comprobar que los elementos 
		// no sean <null> antes para evitar errores.
	
		return !((elem1 == null) && (elem2 == null))
				&& (((elem1 == null) || (elem2 == null))
				|| !(elem1.equals(elem2)));


	}
	// ---------------------------------------------------------------

	/**
	 * Metodo que reduce los elementos iguales consecutivos de una lista a una 
	 * unica repeticion
	 * @param lista Lista de entrada
	 * @return Lista nueva compactada sin elementos iguales consecutivos
	 */
	public <E> PositionList<E> compactar (Iterable<E> lista) throws IllegalArgumentException {
		
		// If null then we throw an exception
		if(lista == null) {

			throw new IllegalArgumentException();

		}

		PositionList<E> list = new NodePositionList<E>();

		// If it is empty, it.hasNext() == false and thus 
		// it won't go into the loop. Therefore, return list 
		// will really return an empty list.

		Iterator<E> it = lista.iterator();
		E prev = null;

		while(it.hasNext()) {
			
			E curr = it.next();

			if(list.isEmpty()) {
				
				list.addFirst(curr);

			} 
			else {

				if(nullNotEquals(curr, prev)) {

					list.addLast(curr);

				}

			}

			prev = curr;

		}
		
		return list;
	}
	// ---------------------------------------------------------------

}
