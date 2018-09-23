package aed.actasnotas;

import es.upm.aedlib.indexedlist.IndexedList;
import es.upm.aedlib.indexedlist.ArrayIndexedList;
import java.util.Comparator;

public class ActaNotasAED implements ActaNotas {
	
	// Para guardar las actas
	private IndexedList<Calificacion> actas;
	
	// Constructor

	public ActaNotasAED() {
		
		this.actas = new ArrayIndexedList<Calificacion>();
		
	}
	
	// Metodos Auxiliares

	/**
	 * PRE: actas esta ordenada
	 * Buscamos un String <matricula> en la lista <actas> usando la busqueda binaria.
	 * @param matricula : String que representa la matricula cuya posicion queremos buscar.
	 * @return int, -1 si no se encuentra, y la posicion en la ArrayIndexedList <actas> si
	 * 		   se encuentra.
	 */
	private int buscarMatricula(String matricula) {

		int left   = 0; // Parte mas a la "izquierda" del intervalo en el que buscamos
		int right  = this.actas.size(); // Parte mas a la "derecha" del intervalo
		int middle = (int)(Math.floor((left + right) / 2));
		int index  = -1; // Indice

		// No necesitamos comprobar si esta vacia previamente porque 
		// si el tamano de la lista fuera 0, left = right => no entraria
		// en el bucle

		while((left < right) && (index == -1)) {

			String mid = this.actas.get(middle).getMatricula();
			
			if (matricula.compareTo(mid) == 0) {

				index = middle;

			}
			else if(matricula.compareTo(mid) < 0) {

				right = middle;

			}
			else {

				left = middle + 1;

			} 
			
			// Volvemos a calcular la posicion media
			middle = (int)(Math.floor((left + right) / 2));

		}

		return index;


	}
	//-----------------------------------------------------
	
	/**
	 * Implementacion del Quick Sort para ordenar listas
	 * @param califs : IndexedList<Calificacion>
	 * @return califs ordenada
	 */
	private IndexedList<Calificacion> quickSort(IndexedList<Calificacion> califs, Comparator<Calificacion> cmp) {

		if(!califs.isEmpty()) {

			Calificacion pivote = califs.get(califs.size() / 2);
			IndexedList<Calificacion> menores = new ArrayIndexedList<Calificacion>();
			IndexedList<Calificacion> mayores = new ArrayIndexedList<Calificacion>();
			IndexedList<Calificacion> iguales = new ArrayIndexedList<Calificacion>();

			// Organizamos los elementos en listas segun el comparador
			for(Calificacion c : califs) {

				if(cmp.compare(c, pivote) < 0) {

					menores.add(menores.size(), c);

				}
				else if(cmp.compare(c, pivote) == 0) {

					iguales.add(iguales.size(), c);

				}
				else {

					mayores.add(mayores.size(), c);

				}

			}

			// Aplicamos de nuevo el algoritmo en cada una de las 
			// listas generadas (Ignoramos la lista de iguales)
			menores = quickSort(menores, cmp);
			mayores = quickSort(mayores, cmp);
			
			// Anadimos las listas en orden a la lista de menores
			// Para que el resultado final este ordenado
			addAll(menores, iguales);
			addAll(menores, mayores);
			
			return menores;

		}
		// Si llegara a estar vacia, devolvemos la lista original
		return califs;

	}
	//-----------------------------------------------------

	/**
	 * @param addTo : Lista a la que anadimos todos los elementos de la otra lista.
	 * @param toAdd : Lista que anadimos a la otra lista.
	 */
	private void addAll(IndexedList<Calificacion> addTo, 
						IndexedList<Calificacion> toAdd) {

		for(Calificacion c : toAdd) {

			addTo.add(addTo.size(), c);

		}

	}
	//-----------------------------------------------------


	// Metodos de la Interfaz

	/**
	 * @param nombre : String que representa el nombre de la calificacion que debemos 
	 * 				 anadir a la lista.
	 * @param matricula : String que representa la matricula de la calificacion que debemos 
	 * 				 anadir a la lista.
	 * @param nota : int que representa la nota de la calificacion que debemos 
	 * 				 anadir a la lista.
	 * @throws CalificacionAlreadyExistsException : Si la matricula especificada ya existe, 
	 * 			lanzamos un error.
	 */
	@Override
	public void addCalificacion(String nombre, String matricula, int nota) 
								throws CalificacionAlreadyExistsException {
		
		// No encontro la matricula
		if(buscarMatricula(matricula) == -1) {

			Calificacion cali = new Calificacion(nombre, matricula, nota);
			this.actas.add(this.actas.size(), cali);
			
			// Mantenemos la lista ordenada para poder usar la busqueda binaria 
			// en el futuro
			this.actas = this.getCalificaciones(new MatriculaComparator());
	
		}
		else {
	
			// Ha encontrado la matricula en actas, por lo que lanzamos excepcion
			throw new CalificacionAlreadyExistsException();
	
		}
		
		
	}
	//-----------------------------------------------------

	/**
	 * @param matricula : Argumento del tipo String que representa la matricula cuya 
	 * 					nota debemos actualizar de la lista <actas>. 
	 * @param nota : int con el que sustituimos la nota de la Calificacion especificada 
	 * 				por <matricula>
	 * @throws InvalidMatriculaException : Si no se encuentra la matricula, lanzamos error.
	 */
	@Override
	public void updateNota(String matricula, int nota) throws InvalidMatriculaException {
		
		int idx = buscarMatricula(matricula);

		if(idx == -1) {
			
			throw new InvalidMatriculaException();
			
		}
		
		this.actas.get(idx).setNota(nota);
		
	}
	//-----------------------------------------------------
	
	/**
	 * @param matricula : Argumento del tipo String que representa la matricula cuya 
	 * 					Calificacion debemos eliminar de la lista <actas>.
	 * @throws InvalidMatriculaException : Si no se encuentra la matricula, lanzamos error.
	 */
	@Override
	public void deleteCalificacion(String matricula) throws InvalidMatriculaException {
		
		int idx = buscarMatricula(matricula);

		if(idx == -1) {
			
			throw new InvalidMatriculaException();
			
		}
		
		this.actas.removeElementAt(idx);
		
	}
	//-----------------------------------------------------
	
	/**
	 * @param matricula : Argumento del tipo String que representa la matricula cuya 
	 * 					Calificacion debemos obtener.
	 * @return La Calificacion cuya Matricula se ha pasado como argumento.
	 * @throws InvalidMatriculaException : Si no se encuentra la matricula, lanzamos error.
	 */
	@Override
	public Calificacion getCalificacion(String matricula) throws InvalidMatriculaException {
		
		int idx = buscarMatricula(matricula);

		if( idx == -1) {
			
			throw new InvalidMatriculaException();
			
		}
				
		return this.actas.get(idx);
			
	}
	//-----------------------------------------------------
	
	/**
	 * Usamos el quicksort para ordenar la lista.
	 * @param cmp : Comparador para ordenar la lista segun lo que se requiera.
	 * @return IndexedList<Calificacion> ordenada.
	 */
	@Override
	public IndexedList<Calificacion> getCalificaciones(Comparator<Calificacion> cmp) {
		
		// Devolvemos una nueva lista aplicando el algoritmo Quick Sort
		return quickSort(this.actas, cmp);

	}
	//-----------------------------------------------------
	
	/**
	 * @param notaMinima : Un dato de tipo int que representa la minima nota necesaria
	 * 					   para estar en la nueva lista.
	 * @return Una lista conteniendo todas las Calificaciones cuya nota >= notaMinima
	 */
	@Override
	public IndexedList<Calificacion> getAprobados(int notaMinima) {
		
		IndexedList<Calificacion> califs = new ArrayIndexedList<Calificacion>();

		for(Calificacion c : this.actas) {

			if(c.getNota() >= notaMinima) {

				califs.add(califs.size(), c);

			}

		}

		return califs;
	}
	//-----------------------------------------------------
	
}
