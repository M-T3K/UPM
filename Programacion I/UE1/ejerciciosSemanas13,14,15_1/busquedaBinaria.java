import java.util.Arrays;

public class busquedaBinaria {


	//Version iterativa de la busqueda binaria
	static   boolean  busquedaBinaria(int[]  v, int elem){
		if(v.length == 0){
			return false;
		}
		int mainPointer = 0;
		int pointer1 = 0;
		int pointer2 = v.length - 1;
		while(pointer2 - pointer1 > 1){
			mainPointer = (pointer1 + pointer2) / 2;
			if(v[mainPointer] == elem){
				return true;
			}
			if(elem < v[mainPointer]){
				pointer2 = mainPointer;
			}else{
				pointer1 = mainPointer;
			}
		}
		if(v[pointer1] == elem || v[pointer2] == elem){
			return true;
		}else{
			return false;
		}
	}


	//Version recursiva de la busqueda binaria
	public static   boolean  binRec(int[]  arr, int elem){
		if(arr.length == 0 || (arr.length == 1 && arr[0] != elem)){
			return false;
		}
		int mainPointer = (arr.length - 1) / 2;
		if(arr[mainPointer] == elem){
			return true;
		}
		if(elem < arr[mainPointer]){
			int[] arr2 = new int[mainPointer];
			for (int i = 0; i < mainPointer; i++) {
				arr2[i] = arr[i];
			}
			return binRec(arr2, elem);
		}else{
			int[] arr2 = new int[arr.length - mainPointer - 1];
			int j = 0;
			for (int i = mainPointer + 1; i < arr.length; i++) {
				arr2[j] = arr[i];
				j++;
			}
			return binRec(arr2, elem);
		}
	}

	private static void do_check(int[] arr, int elem, boolean solucion){
		try{
			boolean solAlumno = busquedaBinaria(arr,elem);
			if (solAlumno!=solucion){
				System.out.println("Error: el codigo del alumno produce un resultado incorrecto");
				System.out.println("El resultado esperado para el array  " + Arrays.toString(arr) + ", y el elemento " + elem + ", ");
				System.out.println("deberia ser " + solucion);
				System.out.println("pero el resultado obtenido es " + solAlumno);
				throw new Error("");

			}
		} catch (Exception e){
			System.out.println(e.toString());
			throw new Error("Error en test: el codigo del alumno produce una excepcion");
		}
	}


	private static void do_check1(int[] arr, int elem, boolean solucion){
		try{
			boolean solAlumno = binRec(arr,elem);
			if (solAlumno!=solucion){
				System.out.println("Error: el codigo del alumno produce un resultado incorrecto");
				System.out.println("El resultado esperado para el array  " + Arrays.toString(arr) + ", y el elemento " + elem + ", ");
				System.out.println("deberia ser " + solucion);
				System.out.println("pero el resultado obtenido es " + solAlumno);
				throw new Error("");

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
			boolean solucion = false;
			do_check(arr, elem, solucion);
		}
		{
			int[] arr = {1};
			int elem = 4;
			boolean solucion = false;
			do_check(arr, elem, solucion);
		}
		{
			int[] arr = {4};
			int elem = 4;
			boolean solucion = true;
			do_check(arr, elem, solucion);
		}
		{
			int[] arr = {1,2,3};
			int elem = 4;
			boolean solucion = false;
			do_check(arr, elem, solucion);
		}
		{
			int[] arr = {1,2,3,4,5};
			int elem = 1;
			boolean solucion = true;
			do_check(arr, elem, solucion);
		}
		{
			int[] arr = {1,2,3,4,5,6};
			int elem = 4;
			boolean solucion = true;
			do_check(arr, elem, solucion);
		}
		{
			int[] arr = {5,6,7,8,9};
			int elem = 4;
			boolean solucion = false;
			do_check(arr, elem, solucion);
		}
		{
			int[] arr = {1,2,3,4,5};
			int elem = 5;
			boolean solucion = true;
			do_check(arr, elem, solucion);
		}

		System.out.println("Superadas las pruebas para busquedaBinaria");

		{
			int[] arr = {};
			int elem = 4;
			boolean solucion = false;
			do_check1(arr, elem, solucion);
		}
		{
			int[] arr = {1};
			int elem = 4;
			boolean solucion = false;
			do_check1(arr, elem, solucion);
		}
		{
			int[] arr = {4};
			int elem = 4;
			boolean solucion = true;
			do_check1(arr, elem, solucion);
		}
		{
			int[] arr = {1,2,3};
			int elem = 4;
			boolean solucion = false;
			do_check1(arr, elem, solucion);
		}
		{
			int[] arr = {1,2,3,4,5};
			int elem = 1;
			boolean solucion = true;
			do_check1(arr, elem, solucion);
		}
		{
			int[] arr = {1,2,3,4,5,6};
			int elem = 4;
			boolean solucion = true;
			do_check1(arr, elem, solucion);
		}
		{
			int[] arr = {5,6,7,8,9};
			int elem = 4;
			boolean solucion = false;
			do_check1(arr, elem, solucion);
		}
		{
			int[] arr = {1,2,3,4,5};
			int elem = 5;
			boolean solucion = true;
			do_check1(arr, elem, solucion);
		}
		System.out.println("Superadas las pruebas para binRec");

	}
}
