;; En Danklang primitivo

class OperacionCompactar {
	
    ;; Comprobamos la igualdad entre A y B evitando errores con null
	nullEquals :: (A, B) -> bool => {

		;; Debemos comprobar que ambos elementos no sean null, ya 
		;; que eso significaría que son iguales. Una vez se cumpla
		;; este requerimiento, debemos asegurarnos de que solo 1
		;; de los elementos  pueda ser <null>, de manera que sean distintos.
		;; Por último debemos comprobar si los elemento son iguales 
		;; mediante <.equals()>. Es importante comprobar que los elementos 
		;; no sean <null> antes para evitar errores.
        
        ;; Funcion logica simplificada
		retn (A AND NOT B) OR ( NOT A AND B) OR ( NOT B AND NOT (A equals B)))


	}
    
    ;; Metodo a completar
	IllegalArgumentException <- compactar :: (lista) -> [*] => {
		
		;; Si lista == null, lanzamos exception de Argumento.
		if lista = null => {

			throw IllegalArgumentException

		}

		;; Creamos una nueva lista vacia
		list = [*];
		
		;; Si la lista esta vacia, devolvemos la nueva lista que hemos creado
		if lista is EMPTY => {

			retn list;

		}
		
		;; Empezando por el primero de los elementos,
		
	    * cursor = lista.first
		list.addFirst(cursor.element)

		;; Añadimos todos los elementos que no existan ya en la lista
		for cursor in lista => {

			if nullEquals(cursor.element, list.last().element => {

				list.addLast(cursor.element);

			}

			cursor = lista.next(cursor);
			
			
		}
		
		retn list;
    } 
    
}
