import java.util.Arrays;

public class OrdenacionSeleccion {


	private static void permuta(int[] arr, int pos1, int pos2){
		int aux = arr[pos1];
		arr[pos1]=arr[pos2];
		arr[pos2]=aux;
	}


	//Metodo que devuelve la posicion donde se encuentra el minimo elemento desde la posicion "posDesde" hasta el fin del array
	private static int posMinDesde(int[] arr, int posDesde){
		int val = arr[posDesde];
		int pos = posDesde;
		posDesde++;
		for (; posDesde < arr.length; posDesde++) {
			if (arr[posDesde] < val){
				val = arr[posDesde];
				pos = posDesde;
			}
		}
		return pos;
	}





	//Ordenacion de un array aplicando el algoritmo de ordenacion por seleccion
	public static void seleccion(int[] arr) {
		int min;
		for (int i = 0; i < arr.length - 1; i++) {
			min = posMinDesde(arr, i);
			if (arr[min] < arr[i]){
				permuta(arr, min, i);
			}
		}
	// COMPLETAD ESTE CODIGO


	}

/////////////////////////////////// NO TOQUEIS NADA A PARTIR DE ESTE PUNTO

	private static void do_check(int[] arr, int[] solucion){
		try{

			int[] arr0=null;
			if (arr!=null)
				arr0=Arrays.copyOf(arr, arr.length); //el array se va a modificar, conservo copia original
			seleccion(arr);
			if ((arr==null && solucion!=null) || (arr!=null && !Arrays.equals(arr,solucion))){

					System.out.println("Error: el c�digo del alumno produce un resultado incorrecto.");
					System.out.println("El resultado esperado para el argumento: " +
									    Arrays.toString(arr0));
					System.out.println("deber�a ser " + Arrays.toString(solucion));
					System.out.println("pero el resultado obtenido es " + Arrays.toString(arr));
					throw new Error();
			}
		} catch (Exception e){
			System.out.println(e.toString());
			throw new Error("Error en test: el c�digo del alumno produce una excepci�n");
    	}

	}

	public static void main(String[] args){

		{
			int[] arr = {};
			int[] solucion = {};
			do_check(arr,solucion);
		}
		{
			int[] arr = {8};
			int[] solucion = {8};
			do_check(arr,solucion);
		}

		{
			int[] arr = {1, 1};
			int[] solucion = {1, 1};
			do_check(arr,solucion);
		}

		{
			int[] arr = {1, 2};
			int[] solucion = {1,2};
			do_check(arr,solucion);
		}
		{
			int[] arr = {1, 3,2};
			int[] solucion = {1,2, 3};
			do_check(arr,solucion);
		}

		{
			int[] arr = {2,3,1};
			int[] solucion = {1,2,3};
			do_check(arr,solucion);
		}

		{
			int[] arr = {3,2,1};
			int[] solucion = {1,2,3};
			do_check(arr,solucion);
		}

		{
			int[] arr = {2, 1,4,5,3};
			int[] solucion = {1,2,3,4,5};
			do_check(arr,solucion);
		}

		{
			int[] arr = {5,4,3,2,1};
			int[] solucion = {1,2,3,4,5};
			do_check(arr,solucion);
		}

		{
			int[] arr = {1,2,3,5,4};
			int[] solucion = {1,2,3,4,5};
			do_check(arr,solucion);
		}

		{
			int[] arr = {9,1,8,2,7,3,6,4,5};
			int[] solucion = {1,2,3,4,5,6,7,8,9};
			do_check(arr,solucion);
		}
		System.out.println("Test finalizado correctamente.");
	}

}
