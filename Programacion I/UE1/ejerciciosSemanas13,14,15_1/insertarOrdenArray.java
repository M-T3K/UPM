import java.util.Arrays;

public class insertarOrdenArray {




	/**
	 * En los ejercicios a continuacion, suponed que trabajamos con arrays de enteros positivos, en los que los elementos
	 * almacenados aparecen agrupados a la izquierda, y los 0s denotan posiciones vac�as y aparecen agrupados a la derecha
	 */





	//Devuelve -1 si el el elemento para el que se busca el hueco donde insertarlo no es positivo o si no hay posiciones vac�as, es decir, que contengan 0.
	static int buscaHueco(int[] arr, int elem){
		if(arr.length == 0 || arr[arr.length - 1] != 0){
			return -1;
		}
		int idx = 0;
		boolean foundPos = false;
		for (int i = 0; i < arr.length && !foundPos; i++) {
			if(elem < arr[i] || arr[i] == 0){
				idx = i;
				foundPos = true;
			}
		}
		return idx;
	}





	public static void insertaOrden(int[] arr, int elem){
		int idx = buscaHueco(arr, elem);
		if(idx != -1){
			for (int i = arr.length - 1; i > idx; i--) {
				arr[i] = arr[i-1];
			}
			arr[idx] = elem;
		}
	}


	private static void do_check1(int[] arr, int elem, int[] solucion){
		try{
			int[] arr0=null;
			if (arr!=null)
				arr0=Arrays.copyOf(arr, arr.length); //el array se va a modificar, conservo copia original
			insertaOrden(arr,elem);
			if ( !Arrays.equals(arr,solucion)){
					System.out.println("Error en insertar: el codigo del alumno produce un resultado incorrecto");
					System.out.println("El resultado esperado para el array  " + Arrays.toString(arr0) + ", y el elemento " + elem + ", ");
					System.out.println("deberia ser " + Arrays.toString(solucion));
					System.out.println("pero el resultado obtenido es " + Arrays.toString(arr));
					throw new Error();
			}
		} catch (Exception e){
			System.out.println(e.toString());
			throw new Error("Error en test: el codigo del alumno produce una excepcion");
		}
	}




	public static void main(String[] args) {
		{
			int[] arr = {};
			int elem = 4;
			int[] solucion = {};
			do_check1(arr, elem, solucion);
		}
		{
			int[] arr = {0,0};
			int elem = 4;
			int[] solucion = {4,0};
			do_check1(arr, elem, solucion);
		}
		{
			int[] arr = {1,0,0,0};
			int elem = 4;
			int[] solucion = {1,4,0,0};
			do_check1(arr, elem, solucion);
		}
		{
			int[] arr = {4};
			int elem = 3;
			int[] solucion = {4};
			do_check1(arr, elem, solucion);
		}
		{
			int[] arr = {1,2,3,0};
			int elem = 4;
			int[] solucion = {1,2,3,4};
			do_check1(arr, elem, solucion);
		}
		{
			int[] arr = {1,2,3,4,5,0,0};
			int elem = 1;
			int[] solucion = {1,1,2,3,4,5,0};
			do_check1(arr, elem, solucion);
		}
		{
			int[] arr = {1,2,3,5,6,0};
			int elem = 4;
			int[] solucion = {1,2,3,4,5,6};
			do_check1(arr, elem, solucion);
		}
		{
			int[] arr = {5,6,7,8,9,0};
			int elem = 8;
			int[] solucion = {5,6,7,8,8,9};
			do_check1(arr, elem, solucion);
		}
		{
			int[] arr = {1,2,3,4,5};
			int elem = 6;
			int[] solucion ={1,2,3,4,5};
			do_check1(arr, elem, solucion);
		}
		{
			int[] arr = {1,2,3,4,5,0};
			int elem = 6;
			int[] solucion ={1,2,3,4,5,6};
			do_check1(arr, elem, solucion);
		}
		System.out.println("Test finalizado correctamente.");
	}

}
