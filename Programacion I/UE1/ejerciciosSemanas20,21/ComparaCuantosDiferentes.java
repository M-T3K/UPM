import java.util.Arrays;

public class ComparaCuantosDiferentes {


	//METODO AUXILIAR QUE CUENTA EL NUMERO DE ELEMENTOS DIFERENTES QUE HAY EN UN ARRAY DE DIGITOS
	//UTILIZA UN ARRAY AUXILIAR
	static int cuentaDiferentes(int[] arr){
		boolean[] arr2 = new boolean[10];
		int count = 0;
		for (int i = 0; i < arr.length; i++) {
			if (!arr2[arr[i]]){
				count++;
				arr2[arr[i]] = true;
			}
		}
    return count;
	}



	//METODO PRINCIPAL
	//Dados dos arrays que contienen digitos (enteros entre 0 y 9), devolver la diferencia entre el numero de
	//digitos diferentes que hay en el primero y en el segundo (numero de diferentes en el primero menos numero diferentes del segundo)
	static int comparaNumDiferentes(int[] arrDigitos1, int[] arrDigitos2){
		return cuentaDiferentes(arrDigitos1) - cuentaDiferentes(arrDigitos2);
	}





	private static void do_check(int[] arr1,int[] arr2,int solucion){
		try{

			int solAlumno=comparaNumDiferentes(arr1, arr2);
			if (solAlumno!=solucion){
				System.out.println("Error: el c�digo del alumno produce un resultado incorrecto.");
				System.out.println("El resultado esperado para los argumentos: " + Arrays.toString(arr1) + ", " + Arrays.toString(arr2));
				System.out.println("deber�a ser " + solucion);
				System.out.println("pero el resultado obtenido es " + solAlumno);
				throw new Error();
			}
		} catch (Exception e){
			System.out.println("**** El c�digo del alumno ha lanzado una excepci�n: " + e.toString());
			throw new Error();
    		}
	}
	public static void main(String[] args) {
		{
			int[] arr1 = {};
			int[] arr2 = {};
			int solucion = 0;
			do_check(arr1,arr2,solucion);

		}
		{
			int[] arr1 = {};
			int[] arr2 = {1,2,3};
			int solucion = -3;
			do_check(arr1,arr2,solucion);

		}
		{
			int[] arr1 = {1,2,3,1,2};
			int[] arr2 = {};
			int solucion = 3;
			do_check(arr1,arr2,solucion);

		}
		{
			int[] arr1 = {1};
			int[] arr2 = {1};
			int solucion = 0;
			do_check(arr1,arr2,solucion);
		}

		{
			int[] arr1 = {1};
			int[] arr2 = {5};
			int solucion = 0;
			do_check(arr1,arr2,solucion);
		}

		{
			int[] arr1 = {1};
			int[] arr2 = {3};
			int solucion = 0;
			do_check(arr1,arr2,solucion);
		}

		{
			int[] arr1 = {1};
			int[] arr2 = {4};
			int solucion = 0;
			do_check(arr1,arr2,solucion);
		}

		{
			int[] arr1 = {1};
			int[] arr2 = {2};
			int solucion = 0;
			do_check(arr1,arr2,solucion);
		}

		{
			int[] arr1 = {1};
			int[] arr2 = {3, 4};
			int solucion = -1;
			do_check(arr1,arr2,solucion);
		}

		{
			int[] arr1 = {1};
			int[] arr2 = {4};
			int solucion = 0;
			do_check(arr1,arr2,solucion);
		}

		{
			int[] arr1 = {1};
			int[] arr2 = {4, 5};
			int solucion = -1;
			do_check(arr1,arr2,solucion);
		}

		{
			int[] arr1 = {1};
			int[] arr2 = {1, 4};
			int solucion = -1;
			do_check(arr1,arr2,solucion);
		}

		{
			int[] arr1 = {1};
			int[] arr2 = {2, 3};
			int solucion = -1;
			do_check(arr1,arr2,solucion);
		}

		{
			int[] arr1 = {1};
			int[] arr2 = {5, 3, 3};
			int solucion = -1;
			do_check(arr1,arr2,solucion);
		}

		{
			int[] arr1 = {1};
			int[] arr2 = {3, 2, 5};
			int solucion = -2;
			do_check(arr1,arr2,solucion);
		}

		{
			int[] arr1 = {1};
			int[] arr2 = {4, 1, 2};
			int solucion = -2;
			do_check(arr1,arr2,solucion);
		}

		{
			int[] arr1 = {1};
			int[] arr2 = {5, 2, 3};
			int solucion = -2;
			do_check(arr1,arr2,solucion);
		}

		{
			int[] arr1 = {1};
			int[] arr2 = {1, 5, 2};
			int solucion = -2;
			do_check(arr1,arr2,solucion);
		}

		{
			int[] arr1 = {1};
			int[] arr2 = {2, 1, 1, 5};
			int solucion = -2;
			do_check(arr1,arr2,solucion);
		}

		{
			int[] arr1 = {1};
			int[] arr2 = {4, 2, 5, 4};
			int solucion = -2;
			do_check(arr1,arr2,solucion);
		}

		{
			int[] arr1 = {1};
			int[] arr2 = {3, 4, 3, 2};
			int solucion = -2;
			do_check(arr1,arr2,solucion);
		}

		{
			int[] arr1 = {1};
			int[] arr2 = {1, 3, 1, 3};
			int solucion = -1;
			do_check(arr1,arr2,solucion);
		}

		{
			int[] arr1 = {1};
			int[] arr2 = {2, 1, 4, 3};
			int solucion = -3;
			do_check(arr1,arr2,solucion);
		}

		{
			int[] arr1 = {1};
			int[] arr2 = {4, 5, 2};
			int solucion = -2;
			do_check(arr1,arr2,solucion);
		}

		{
			int[] arr1 = {1};
			int[] arr2 = {4, 5, 4, 2, 5};
			int solucion = -2;
			do_check(arr1,arr2,solucion);
		}

		{
			int[] arr1 = {1};
			int[] arr2 = {5, 2, 4, 3, 5};
			int solucion = -3;
			do_check(arr1,arr2,solucion);
		}

		{
			int[] arr1 = {1};
			int[] arr2 = {2, 5, 4, 1, 5};
			int solucion = -3;
			do_check(arr1,arr2,solucion);
		}

		{
			int[] arr1 = {1};
			int[] arr2 = {1, 2, 4, 2, 1};
			int solucion = -2;
			do_check(arr1,arr2,solucion);
		}

		{
			int[] arr1 = {1};
			int[] arr2 = {5, 2, 5, 5, 3, 4};
			int solucion = -3;
			do_check(arr1,arr2,solucion);
		}

		{
			int[] arr1 = {1};
			int[] arr2 = {5, 3, 1, 4, 4, 2};
			int solucion = -4;
			do_check(arr1,arr2,solucion);
		}

		{
			int[] arr1 = {1};
			int[] arr2 = {2, 3, 5, 5, 1, 3};
			int solucion = -3;
			do_check(arr1,arr2,solucion);
		}

		{
			int[] arr1 = {1};
			int[] arr2 = {2, 4, 3, 2, 2, 4};
			int solucion = -2;
			do_check(arr1,arr2,solucion);
		}

		{
			int[] arr1 = {1};
			int[] arr2 = {1, 4, 2, 2, 3, 3};
			int solucion = -3;
			do_check(arr1,arr2,solucion);
		}

		{
			int[] arr1 = {1};
			int[] arr2 = {5, 1, 3, 1, 3, 5};
			int solucion = -2;
			do_check(arr1,arr2,solucion);
		}

		{
			int[] arr1 = {1};
			int[] arr2 = {1, 3, 3, 4, 3, 4};
			int solucion = -2;
			do_check(arr1,arr2,solucion);
		}

		{
			int[] arr1 = {1};
			int[] arr2 = {3, 5, 4, 4, 2, 4, 1};
			int solucion = -4;
			do_check(arr1,arr2,solucion);
		}

		{
			int[] arr1 = {1};
			int[] arr2 = {1, 3, 3, 4, 1, 1, 5};
			int solucion = -3;
			do_check(arr1,arr2,solucion);
		}

		{
			int[] arr1 = {1};
			int[] arr2 = {3, 5, 1, 5, 4, 5, 3};
			int solucion = -3;
			do_check(arr1,arr2,solucion);
		}

		{
			int[] arr1 = {2};
			int[] arr2 = {1};
			int solucion = 0;
			do_check(arr1,arr2,solucion);
		}

		{
			int[] arr1 = {2};
			int[] arr2 = {5};
			int solucion = 0;
			do_check(arr1,arr2,solucion);
		}

		{
			int[] arr1 = {2};
			int[] arr2 = {3};
			int solucion = 0;
			do_check(arr1,arr2,solucion);
		}

		{
			int[] arr1 = {2};
			int[] arr2 = {4};
			int solucion = 0;
			do_check(arr1,arr2,solucion);
		}

		{
			int[] arr1 = {2};
			int[] arr2 = {2};
			int solucion = 0;
			do_check(arr1,arr2,solucion);
		}

		{
			int[] arr1 = {2};
			int[] arr2 = {3, 4};
			int solucion = -1;
			do_check(arr1,arr2,solucion);
		}

		{
			int[] arr1 = {2};
			int[] arr2 = {4};
			int solucion = 0;
			do_check(arr1,arr2,solucion);
		}

		{
			int[] arr1 = {2};
			int[] arr2 = {4, 5};
			int solucion = -1;
			do_check(arr1,arr2,solucion);
		}

		{
			int[] arr1 = {2};
			int[] arr2 = {1, 4};
			int solucion = -1;
			do_check(arr1,arr2,solucion);
		}

		{
			int[] arr1 = {2};
			int[] arr2 = {2, 3};
			int solucion = -1;
			do_check(arr1,arr2,solucion);
		}

		{
			int[] arr1 = {2};
			int[] arr2 = {5, 3, 3};
			int solucion = -1;
			do_check(arr1,arr2,solucion);
		}

		{
			int[] arr1 = {2};
			int[] arr2 = {3, 2, 5};
			int solucion = -2;
			do_check(arr1,arr2,solucion);
		}

		{
			int[] arr1 = {2};
			int[] arr2 = {4, 1, 2};
			int solucion = -2;
			do_check(arr1,arr2,solucion);
		}

		{
			int[] arr1 = {2};
			int[] arr2 = {5, 2, 3};
			int solucion = -2;
			do_check(arr1,arr2,solucion);
		}

		{
			int[] arr1 = {2};
			int[] arr2 = {1, 5, 2};
			int solucion = -2;
			do_check(arr1,arr2,solucion);
		}

		{
			int[] arr1 = {2};
			int[] arr2 = {2, 1, 1, 5};
			int solucion = -2;
			do_check(arr1,arr2,solucion);
		}

		{
			int[] arr1 = {2};
			int[] arr2 = {4, 2, 5, 4};
			int solucion = -2;
			do_check(arr1,arr2,solucion);
		}

		{
			int[] arr1 = {2};
			int[] arr2 = {3, 4, 3, 2};
			int solucion = -2;
			do_check(arr1,arr2,solucion);
		}

		{
			int[] arr1 = {2};
			int[] arr2 = {1, 3, 1, 3};
			int solucion = -1;
			do_check(arr1,arr2,solucion);
		}

		{
			int[] arr1 = {2};
			int[] arr2 = {2, 1, 4, 3};
			int solucion = -3;
			do_check(arr1,arr2,solucion);
		}

		{
			int[] arr1 = {2};
			int[] arr2 = {4, 5, 2};
			int solucion = -2;
			do_check(arr1,arr2,solucion);
		}

		{
			int[] arr1 = {2};
			int[] arr2 = {4, 5, 4, 2, 5};
			int solucion = -2;
			do_check(arr1,arr2,solucion);
		}

		{
			int[] arr1 = {2};
			int[] arr2 = {5, 2, 4, 3, 5};
			int solucion = -3;
			do_check(arr1,arr2,solucion);
		}

		{
			int[] arr1 = {2};
			int[] arr2 = {2, 5, 4, 1, 5};
			int solucion = -3;
			do_check(arr1,arr2,solucion);
		}

		{
			int[] arr1 = {2};
			int[] arr2 = {1, 2, 4, 2, 1};
			int solucion = -2;
			do_check(arr1,arr2,solucion);
		}

		{
			int[] arr1 = {2};
			int[] arr2 = {5, 2, 5, 5, 3, 4};
			int solucion = -3;
			do_check(arr1,arr2,solucion);
		}

		{
			int[] arr1 = {2};
			int[] arr2 = {5, 3, 1, 4, 4, 2};
			int solucion = -4;
			do_check(arr1,arr2,solucion);
		}

		{
			int[] arr1 = {2};
			int[] arr2 = {2, 3, 5, 5, 1, 3};
			int solucion = -3;
			do_check(arr1,arr2,solucion);
		}

		{
			int[] arr1 = {2};
			int[] arr2 = {2, 4, 3, 2, 2, 4};
			int solucion = -2;
			do_check(arr1,arr2,solucion);
		}

		{
			int[] arr1 = {2};
			int[] arr2 = {1, 4, 2, 2, 3, 3};
			int solucion = -3;
			do_check(arr1,arr2,solucion);
		}

		{
			int[] arr1 = {2};
			int[] arr2 = {5, 1, 3, 1, 3, 5};
			int solucion = -2;
			do_check(arr1,arr2,solucion);
		}

		{
			int[] arr1 = {2};
			int[] arr2 = {1, 3, 3, 4, 3, 4};
			int solucion = -2;
			do_check(arr1,arr2,solucion);
		}

		{
			int[] arr1 = {2};
			int[] arr2 = {3, 5, 4, 4, 2, 4, 1};
			int solucion = -4;
			do_check(arr1,arr2,solucion);
		}

		{
			int[] arr1 = {2};
			int[] arr2 = {1, 3, 3, 4, 1, 1, 5};
			int solucion = -3;
			do_check(arr1,arr2,solucion);
		}

		{
			int[] arr1 = {2};
			int[] arr2 = {3, 5, 1, 5, 4, 5, 3};
			int solucion = -3;
			do_check(arr1,arr2,solucion);
		}

		{
			int[] arr1 = {5};
			int[] arr2 = {1};
			int solucion = 0;
			do_check(arr1,arr2,solucion);
		}

		{
			int[] arr1 = {5};
			int[] arr2 = {5};
			int solucion = 0;
			do_check(arr1,arr2,solucion);
		}

		{
			int[] arr1 = {5};
			int[] arr2 = {3};
			int solucion = 0;
			do_check(arr1,arr2,solucion);
		}

		{
			int[] arr1 = {5};
			int[] arr2 = {4};
			int solucion = 0;
			do_check(arr1,arr2,solucion);
		}

		{
			int[] arr1 = {5};
			int[] arr2 = {2};
			int solucion = 0;
			do_check(arr1,arr2,solucion);
		}

		{
			int[] arr1 = {5};
			int[] arr2 = {3, 4};
			int solucion = -1;
			do_check(arr1,arr2,solucion);
		}

		{
			int[] arr1 = {5};
			int[] arr2 = {4};
			int solucion = 0;
			do_check(arr1,arr2,solucion);
		}

		{
			int[] arr1 = {5};
			int[] arr2 = {4, 5};
			int solucion = -1;
			do_check(arr1,arr2,solucion);
		}

		{
			int[] arr1 = {5};
			int[] arr2 = {1, 4};
			int solucion = -1;
			do_check(arr1,arr2,solucion);
		}

		{
			int[] arr1 = {5};
			int[] arr2 = {2, 3};
			int solucion = -1;
			do_check(arr1,arr2,solucion);
		}

		{
			int[] arr1 = {5};
			int[] arr2 = {5, 3, 3};
			int solucion = -1;
			do_check(arr1,arr2,solucion);
		}

		{
			int[] arr1 = {5};
			int[] arr2 = {3, 2, 5};
			int solucion = -2;
			do_check(arr1,arr2,solucion);
		}

		{
			int[] arr1 = {5};
			int[] arr2 = {4, 1, 2};
			int solucion = -2;
			do_check(arr1,arr2,solucion);
		}

		{
			int[] arr1 = {5};
			int[] arr2 = {5, 2, 3};
			int solucion = -2;
			do_check(arr1,arr2,solucion);
		}

		{
			int[] arr1 = {5};
			int[] arr2 = {1, 5, 2};
			int solucion = -2;
			do_check(arr1,arr2,solucion);
		}

		{
			int[] arr1 = {5};
			int[] arr2 = {2, 1, 1, 5};
			int solucion = -2;
			do_check(arr1,arr2,solucion);
		}

		{
			int[] arr1 = {5};
			int[] arr2 = {4, 2, 5, 4};
			int solucion = -2;
			do_check(arr1,arr2,solucion);
		}

		{
			int[] arr1 = {5};
			int[] arr2 = {3, 4, 3, 2};
			int solucion = -2;
			do_check(arr1,arr2,solucion);
		}

		{
			int[] arr1 = {5};
			int[] arr2 = {1, 3, 1, 3};
			int solucion = -1;
			do_check(arr1,arr2,solucion);
		}

		{
			int[] arr1 = {5};
			int[] arr2 = {2, 1, 4, 3};
			int solucion = -3;
			do_check(arr1,arr2,solucion);
		}

		{
			int[] arr1 = {5};
			int[] arr2 = {4, 5, 2};
			int solucion = -2;
			do_check(arr1,arr2,solucion);
		}

		{
			int[] arr1 = {5};
			int[] arr2 = {4, 5, 4, 2, 5};
			int solucion = -2;
			do_check(arr1,arr2,solucion);
		}

		{
			int[] arr1 = {5};
			int[] arr2 = {5, 2, 4, 3, 5};
			int solucion = -3;
			do_check(arr1,arr2,solucion);
		}

		{
			int[] arr1 = {5};
			int[] arr2 = {2, 5, 4, 1, 5};
			int solucion = -3;
			do_check(arr1,arr2,solucion);
		}

		{
			int[] arr1 = {5};
			int[] arr2 = {1, 2, 4, 2, 1};
			int solucion = -2;
			do_check(arr1,arr2,solucion);
		}

		{
			int[] arr1 = {5};
			int[] arr2 = {5, 2, 5, 5, 3, 4};
			int solucion = -3;
			do_check(arr1,arr2,solucion);
		}

		{
			int[] arr1 = {5};
			int[] arr2 = {5, 3, 1, 4, 4, 2};
			int solucion = -4;
			do_check(arr1,arr2,solucion);
		}

		{
			int[] arr1 = {5};
			int[] arr2 = {2, 3, 5, 5, 1, 3};
			int solucion = -3;
			do_check(arr1,arr2,solucion);
		}

		{
			int[] arr1 = {5};
			int[] arr2 = {2, 4, 3, 2, 2, 4};
			int solucion = -2;
			do_check(arr1,arr2,solucion);
		}

		{
			int[] arr1 = {5};
			int[] arr2 = {1, 4, 2, 2, 3, 3};
			int solucion = -3;
			do_check(arr1,arr2,solucion);
		}

		{
			int[] arr1 = {5};
			int[] arr2 = {5, 1, 3, 1, 3, 5};
			int solucion = -2;
			do_check(arr1,arr2,solucion);
		}

		{
			int[] arr1 = {5};
			int[] arr2 = {1, 3, 3, 4, 3, 4};
			int solucion = -2;
			do_check(arr1,arr2,solucion);
		}

		{
			int[] arr1 = {5};
			int[] arr2 = {3, 5, 4, 4, 2, 4, 1};
			int solucion = -4;
			do_check(arr1,arr2,solucion);
		}

		{
			int[] arr1 = {5};
			int[] arr2 = {1, 3, 3, 4, 1, 1, 5};
			int solucion = -3;
			do_check(arr1,arr2,solucion);
		}

		{
			int[] arr1 = {5};
			int[] arr2 = {3, 5, 1, 5, 4, 5, 3};
			int solucion = -3;
			do_check(arr1,arr2,solucion);
		}

		{
			int[] arr1 = {3};
			int[] arr2 = {1};
			int solucion = 0;
			do_check(arr1,arr2,solucion);
		}

		{
			int[] arr1 = {3};
			int[] arr2 = {5};
			int solucion = 0;
			do_check(arr1,arr2,solucion);
		}

		{
			int[] arr1 = {3};
			int[] arr2 = {3};
			int solucion = 0;
			do_check(arr1,arr2,solucion);
		}

		{
			int[] arr1 = {3};
			int[] arr2 = {4};
			int solucion = 0;
			do_check(arr1,arr2,solucion);
		}

		{
			int[] arr1 = {3};
			int[] arr2 = {2};
			int solucion = 0;
			do_check(arr1,arr2,solucion);
		}

		{
			int[] arr1 = {3};
			int[] arr2 = {3, 4};
			int solucion = -1;
			do_check(arr1,arr2,solucion);
		}

		{
			int[] arr1 = {3};
			int[] arr2 = {4};
			int solucion = 0;
			do_check(arr1,arr2,solucion);
		}

		{
			int[] arr1 = {3};
			int[] arr2 = {4, 5};
			int solucion = -1;
			do_check(arr1,arr2,solucion);
		}

		{
			int[] arr1 = {3};
			int[] arr2 = {1, 4};
			int solucion = -1;
			do_check(arr1,arr2,solucion);
		}

		{
			int[] arr1 = {3};
			int[] arr2 = {2, 3};
			int solucion = -1;
			do_check(arr1,arr2,solucion);
		}

		{
			int[] arr1 = {3};
			int[] arr2 = {5, 3, 3};
			int solucion = -1;
			do_check(arr1,arr2,solucion);
		}

		{
			int[] arr1 = {3};
			int[] arr2 = {3, 2, 5};
			int solucion = -2;
			do_check(arr1,arr2,solucion);
		}

		{
			int[] arr1 = {3};
			int[] arr2 = {4, 1, 2};
			int solucion = -2;
			do_check(arr1,arr2,solucion);
		}

		{
			int[] arr1 = {3};
			int[] arr2 = {5, 2, 3};
			int solucion = -2;
			do_check(arr1,arr2,solucion);
		}

		{
			int[] arr1 = {3};
			int[] arr2 = {1, 5, 2};
			int solucion = -2;
			do_check(arr1,arr2,solucion);
		}

		{
			int[] arr1 = {3};
			int[] arr2 = {2, 1, 1, 5};
			int solucion = -2;
			do_check(arr1,arr2,solucion);
		}

		{
			int[] arr1 = {3};
			int[] arr2 = {4, 2, 5, 4};
			int solucion = -2;
			do_check(arr1,arr2,solucion);
		}

		{
			int[] arr1 = {3};
			int[] arr2 = {3, 4, 3, 2};
			int solucion = -2;
			do_check(arr1,arr2,solucion);
		}

		{
			int[] arr1 = {3};
			int[] arr2 = {1, 3, 1, 3};
			int solucion = -1;
			do_check(arr1,arr2,solucion);
		}

		{
			int[] arr1 = {3};
			int[] arr2 = {2, 1, 4, 3};
			int solucion = -3;
			do_check(arr1,arr2,solucion);
		}

		{
			int[] arr1 = {3};
			int[] arr2 = {4, 5, 2};
			int solucion = -2;
			do_check(arr1,arr2,solucion);
		}

		{
			int[] arr1 = {3};
			int[] arr2 = {4, 5, 4, 2, 5};
			int solucion = -2;
			do_check(arr1,arr2,solucion);
		}

		{
			int[] arr1 = {3};
			int[] arr2 = {5, 2, 4, 3, 5};
			int solucion = -3;
			do_check(arr1,arr2,solucion);
		}

		{
			int[] arr1 = {3};
			int[] arr2 = {2, 5, 4, 1, 5};
			int solucion = -3;
			do_check(arr1,arr2,solucion);
		}

		{
			int[] arr1 = {3};
			int[] arr2 = {1, 2, 4, 2, 1};
			int solucion = -2;
			do_check(arr1,arr2,solucion);
		}

		{
			int[] arr1 = {3};
			int[] arr2 = {5, 2, 5, 5, 3, 4};
			int solucion = -3;
			do_check(arr1,arr2,solucion);
		}

		{
			int[] arr1 = {3};
			int[] arr2 = {5, 3, 1, 4, 4, 2};
			int solucion = -4;
			do_check(arr1,arr2,solucion);
		}

		{
			int[] arr1 = {3};
			int[] arr2 = {2, 3, 5, 5, 1, 3};
			int solucion = -3;
			do_check(arr1,arr2,solucion);
		}

		{
			int[] arr1 = {3};
			int[] arr2 = {2, 4, 3, 2, 2, 4};
			int solucion = -2;
			do_check(arr1,arr2,solucion);
		}

		{
			int[] arr1 = {3};
			int[] arr2 = {1, 4, 2, 2, 3, 3};
			int solucion = -3;
			do_check(arr1,arr2,solucion);
		}

		{
			int[] arr1 = {3};
			int[] arr2 = {5, 1, 3, 1, 3, 5};
			int solucion = -2;
			do_check(arr1,arr2,solucion);
		}

		{
			int[] arr1 = {3};
			int[] arr2 = {1, 3, 3, 4, 3, 4};
			int solucion = -2;
			do_check(arr1,arr2,solucion);
		}

		{
			int[] arr1 = {3};
			int[] arr2 = {3, 5, 4, 4, 2, 4, 1};
			int solucion = -4;
			do_check(arr1,arr2,solucion);
		}

		{
			int[] arr1 = {3};
			int[] arr2 = {1, 3, 3, 4, 1, 1, 5};
			int solucion = -3;
			do_check(arr1,arr2,solucion);
		}

		{
			int[] arr1 = {3};
			int[] arr2 = {3, 5, 1, 5, 4, 5, 3};
			int solucion = -3;
			do_check(arr1,arr2,solucion);
		}

		{
			int[] arr1 = {4};
			int[] arr2 = {1};
			int solucion = 0;
			do_check(arr1,arr2,solucion);
		}

		{
			int[] arr1 = {4};
			int[] arr2 = {5};
			int solucion = 0;
			do_check(arr1,arr2,solucion);
		}

		{
			int[] arr1 = {4};
			int[] arr2 = {3};
			int solucion = 0;
			do_check(arr1,arr2,solucion);
		}

		{
			int[] arr1 = {4};
			int[] arr2 = {4};
			int solucion = 0;
			do_check(arr1,arr2,solucion);
		}

		{
			int[] arr1 = {4};
			int[] arr2 = {2};
			int solucion = 0;
			do_check(arr1,arr2,solucion);
		}

		{
			int[] arr1 = {4};
			int[] arr2 = {3, 4};
			int solucion = -1;
			do_check(arr1,arr2,solucion);
		}

		{
			int[] arr1 = {4};
			int[] arr2 = {4};
			int solucion = 0;
			do_check(arr1,arr2,solucion);
		}

		{
			int[] arr1 = {4};
			int[] arr2 = {4, 5};
			int solucion = -1;
			do_check(arr1,arr2,solucion);
		}

		{
			int[] arr1 = {4};
			int[] arr2 = {1, 4};
			int solucion = -1;
			do_check(arr1,arr2,solucion);
		}

		{
			int[] arr1 = {4};
			int[] arr2 = {2, 3};
			int solucion = -1;
			do_check(arr1,arr2,solucion);
		}

		{
			int[] arr1 = {4};
			int[] arr2 = {5, 3, 3};
			int solucion = -1;
			do_check(arr1,arr2,solucion);
		}

		{
			int[] arr1 = {4};
			int[] arr2 = {3, 2, 5};
			int solucion = -2;
			do_check(arr1,arr2,solucion);
		}

		{
			int[] arr1 = {4};
			int[] arr2 = {4, 1, 2};
			int solucion = -2;
			do_check(arr1,arr2,solucion);
		}

		{
			int[] arr1 = {4};
			int[] arr2 = {5, 2, 3};
			int solucion = -2;
			do_check(arr1,arr2,solucion);
		}

		{
			int[] arr1 = {4};
			int[] arr2 = {1, 5, 2};
			int solucion = -2;
			do_check(arr1,arr2,solucion);
		}

		{
			int[] arr1 = {4};
			int[] arr2 = {2, 1, 1, 5};
			int solucion = -2;
			do_check(arr1,arr2,solucion);
		}

		{
			int[] arr1 = {4};
			int[] arr2 = {4, 2, 5, 4};
			int solucion = -2;
			do_check(arr1,arr2,solucion);
		}

		{
			int[] arr1 = {4};
			int[] arr2 = {3, 4, 3, 2};
			int solucion = -2;
			do_check(arr1,arr2,solucion);
		}

		{
			int[] arr1 = {4};
			int[] arr2 = {1, 3, 1, 3};
			int solucion = -1;
			do_check(arr1,arr2,solucion);
		}

		{
			int[] arr1 = {4};
			int[] arr2 = {2, 1, 4, 3};
			int solucion = -3;
			do_check(arr1,arr2,solucion);
		}

		{
			int[] arr1 = {4};
			int[] arr2 = {4, 5, 2};
			int solucion = -2;
			do_check(arr1,arr2,solucion);
		}

		{
			int[] arr1 = {4};
			int[] arr2 = {4, 5, 4, 2, 5};
			int solucion = -2;
			do_check(arr1,arr2,solucion);
		}

		{
			int[] arr1 = {4};
			int[] arr2 = {5, 2, 4, 3, 5};
			int solucion = -3;
			do_check(arr1,arr2,solucion);
		}

		{
			int[] arr1 = {4};
			int[] arr2 = {2, 5, 4, 1, 5};
			int solucion = -3;
			do_check(arr1,arr2,solucion);
		}

		{
			int[] arr1 = {4};
			int[] arr2 = {1, 2, 4, 2, 1};
			int solucion = -2;
			do_check(arr1,arr2,solucion);
		}

		{
			int[] arr1 = {4};
			int[] arr2 = {5, 2, 5, 5, 3, 4};
			int solucion = -3;
			do_check(arr1,arr2,solucion);
		}

		{
			int[] arr1 = {4};
			int[] arr2 = {5, 3, 1, 4, 4, 2};
			int solucion = -4;
			do_check(arr1,arr2,solucion);
		}

		{
			int[] arr1 = {4};
			int[] arr2 = {2, 3, 5, 5, 1, 3};
			int solucion = -3;
			do_check(arr1,arr2,solucion);
		}

		{
			int[] arr1 = {4};
			int[] arr2 = {2, 4, 3, 2, 2, 4};
			int solucion = -2;
			do_check(arr1,arr2,solucion);
		}

		{
			int[] arr1 = {4};
			int[] arr2 = {1, 4, 2, 2, 3, 3};
			int solucion = -3;
			do_check(arr1,arr2,solucion);
		}

		{
			int[] arr1 = {4};
			int[] arr2 = {5, 1, 3, 1, 3, 5};
			int solucion = -2;
			do_check(arr1,arr2,solucion);
		}

		{
			int[] arr1 = {4};
			int[] arr2 = {1, 3, 3, 4, 3, 4};
			int solucion = -2;
			do_check(arr1,arr2,solucion);
		}

		{
			int[] arr1 = {4};
			int[] arr2 = {3, 5, 4, 4, 2, 4, 1};
			int solucion = -4;
			do_check(arr1,arr2,solucion);
		}

		{
			int[] arr1 = {4};
			int[] arr2 = {1, 3, 3, 4, 1, 1, 5};
			int solucion = -3;
			do_check(arr1,arr2,solucion);
		}

		{
			int[] arr1 = {4};
			int[] arr2 = {3, 5, 1, 5, 4, 5, 3};
			int solucion = -3;
			do_check(arr1,arr2,solucion);
		}

		{
			int[] arr1 = {2, 1};
			int[] arr2 = {1};
			int solucion = 1;
			do_check(arr1,arr2,solucion);
		}

		{
			int[] arr1 = {2, 1};
			int[] arr2 = {5};
			int solucion = 1;
			do_check(arr1,arr2,solucion);
		}

		{
			int[] arr1 = {2, 1};
			int[] arr2 = {3};
			int solucion = 1;
			do_check(arr1,arr2,solucion);
		}

		{
			int[] arr1 = {2, 1};
			int[] arr2 = {4};
			int solucion = 1;
			do_check(arr1,arr2,solucion);
		}

		{
			int[] arr1 = {2, 1};
			int[] arr2 = {2};
			int solucion = 1;
			do_check(arr1,arr2,solucion);
		}

		{
			int[] arr1 = {2, 1};
			int[] arr2 = {3, 4};
			int solucion = 0;
			do_check(arr1,arr2,solucion);
		}

		{
			int[] arr1 = {2, 1};
			int[] arr2 = {4};
			int solucion = 1;
			do_check(arr1,arr2,solucion);
		}

		{
			int[] arr1 = {2, 1};
			int[] arr2 = {4, 5};
			int solucion = 0;
			do_check(arr1,arr2,solucion);
		}

		{
			int[] arr1 = {2, 1};
			int[] arr2 = {1, 4};
			int solucion = 0;
			do_check(arr1,arr2,solucion);
		}

		{
			int[] arr1 = {2, 1};
			int[] arr2 = {2, 3};
			int solucion = 0;
			do_check(arr1,arr2,solucion);
		}

		{
			int[] arr1 = {2, 1};
			int[] arr2 = {5, 3, 3};
			int solucion = 0;
			do_check(arr1,arr2,solucion);
		}

		{
			int[] arr1 = {2, 1};
			int[] arr2 = {3, 2, 5};
			int solucion = -1;
			do_check(arr1,arr2,solucion);
		}

		{
			int[] arr1 = {2, 1};
			int[] arr2 = {4, 1, 2};
			int solucion = -1;
			do_check(arr1,arr2,solucion);
		}

		{
			int[] arr1 = {2, 1};
			int[] arr2 = {5, 2, 3};
			int solucion = -1;
			do_check(arr1,arr2,solucion);
		}

		{
			int[] arr1 = {2, 1};
			int[] arr2 = {1, 5, 2};
			int solucion = -1;
			do_check(arr1,arr2,solucion);
		}

		{
			int[] arr1 = {2, 1};
			int[] arr2 = {2, 1, 1, 5};
			int solucion = -1;
			do_check(arr1,arr2,solucion);
		}

		{
			int[] arr1 = {2, 1};
			int[] arr2 = {4, 2, 5, 4};
			int solucion = -1;
			do_check(arr1,arr2,solucion);
		}

		{
			int[] arr1 = {2, 1};
			int[] arr2 = {3, 4, 3, 2};
			int solucion = -1;
			do_check(arr1,arr2,solucion);
		}

		{
			int[] arr1 = {2, 1};
			int[] arr2 = {1, 3, 1, 3};
			int solucion = 0;
			do_check(arr1,arr2,solucion);
		}

		{
			int[] arr1 = {2, 1};
			int[] arr2 = {2, 1, 4, 3};
			int solucion = -2;
			do_check(arr1,arr2,solucion);
		}

		{
			int[] arr1 = {2, 1};
			int[] arr2 = {4, 5, 2};
			int solucion = -1;
			do_check(arr1,arr2,solucion);
		}

		{
			int[] arr1 = {2, 1};
			int[] arr2 = {4, 5, 4, 2, 5};
			int solucion = -1;
			do_check(arr1,arr2,solucion);
		}

		{
			int[] arr1 = {2, 1};
			int[] arr2 = {5, 2, 4, 3, 5};
			int solucion = -2;
			do_check(arr1,arr2,solucion);
		}

		{
			int[] arr1 = {2, 1};
			int[] arr2 = {2, 5, 4, 1, 5};
			int solucion = -2;
			do_check(arr1,arr2,solucion);
		}

		{
			int[] arr1 = {2, 1};
			int[] arr2 = {1, 2, 4, 2, 1};
			int solucion = -1;
			do_check(arr1,arr2,solucion);
		}

		{
			int[] arr1 = {2, 1};
			int[] arr2 = {5, 2, 5, 5, 3, 4};
			int solucion = -2;
			do_check(arr1,arr2,solucion);
		}

		{
			int[] arr1 = {2, 1};
			int[] arr2 = {5, 3, 1, 4, 4, 2};
			int solucion = -3;
			do_check(arr1,arr2,solucion);
		}

		{
			int[] arr1 = {2, 1};
			int[] arr2 = {2, 3, 5, 5, 1, 3};
			int solucion = -2;
			do_check(arr1,arr2,solucion);
		}

		{
			int[] arr1 = {2, 1};
			int[] arr2 = {2, 4, 3, 2, 2, 4};
			int solucion = -1;
			do_check(arr1,arr2,solucion);
		}

		{
			int[] arr1 = {2, 1};
			int[] arr2 = {1, 4, 2, 2, 3, 3};
			int solucion = -2;
			do_check(arr1,arr2,solucion);
		}

		{
			int[] arr1 = {2, 1};
			int[] arr2 = {5, 1, 3, 1, 3, 5};
			int solucion = -1;
			do_check(arr1,arr2,solucion);
		}

		{
			int[] arr1 = {2, 1};
			int[] arr2 = {1, 3, 3, 4, 3, 4};
			int solucion = -1;
			do_check(arr1,arr2,solucion);
		}

		{
			int[] arr1 = {2, 1};
			int[] arr2 = {3, 5, 4, 4, 2, 4, 1};
			int solucion = -3;
			do_check(arr1,arr2,solucion);
		}

		{
			int[] arr1 = {2, 1};
			int[] arr2 = {1, 3, 3, 4, 1, 1, 5};
			int solucion = -2;
			do_check(arr1,arr2,solucion);
		}

		{
			int[] arr1 = {2, 1};
			int[] arr2 = {3, 5, 1, 5, 4, 5, 3};
			int solucion = -2;
			do_check(arr1,arr2,solucion);
		}

		{
			int[] arr1 = {5, 3};
			int[] arr2 = {1};
			int solucion = 1;
			do_check(arr1,arr2,solucion);
		}

		{
			int[] arr1 = {5, 3};
			int[] arr2 = {5};
			int solucion = 1;
			do_check(arr1,arr2,solucion);
		}

		{
			int[] arr1 = {5, 3};
			int[] arr2 = {3};
			int solucion = 1;
			do_check(arr1,arr2,solucion);
		}

		{
			int[] arr1 = {5, 3};
			int[] arr2 = {4};
			int solucion = 1;
			do_check(arr1,arr2,solucion);
		}

		{
			int[] arr1 = {5, 3};
			int[] arr2 = {2};
			int solucion = 1;
			do_check(arr1,arr2,solucion);
		}

		{
			int[] arr1 = {5, 3};
			int[] arr2 = {3, 4};
			int solucion = 0;
			do_check(arr1,arr2,solucion);
		}

		{
			int[] arr1 = {5, 3};
			int[] arr2 = {4};
			int solucion = 1;
			do_check(arr1,arr2,solucion);
		}

		{
			int[] arr1 = {5, 3};
			int[] arr2 = {4, 5};
			int solucion = 0;
			do_check(arr1,arr2,solucion);
		}

		{
			int[] arr1 = {5, 3};
			int[] arr2 = {1, 4};
			int solucion = 0;
			do_check(arr1,arr2,solucion);
		}

		{
			int[] arr1 = {5, 3};
			int[] arr2 = {2, 3};
			int solucion = 0;
			do_check(arr1,arr2,solucion);
		}

		{
			int[] arr1 = {5, 3};
			int[] arr2 = {5, 3, 3};
			int solucion = 0;
			do_check(arr1,arr2,solucion);
		}

		{
			int[] arr1 = {5, 3};
			int[] arr2 = {3, 2, 5};
			int solucion = -1;
			do_check(arr1,arr2,solucion);
		}

		{
			int[] arr1 = {5, 3};
			int[] arr2 = {4, 1, 2};
			int solucion = -1;
			do_check(arr1,arr2,solucion);
		}

		{
			int[] arr1 = {5, 3};
			int[] arr2 = {5, 2, 3};
			int solucion = -1;
			do_check(arr1,arr2,solucion);
		}

		{
			int[] arr1 = {5, 3};
			int[] arr2 = {1, 5, 2};
			int solucion = -1;
			do_check(arr1,arr2,solucion);
		}

		{
			int[] arr1 = {5, 3};
			int[] arr2 = {2, 1, 1, 5};
			int solucion = -1;
			do_check(arr1,arr2,solucion);
		}

		{
			int[] arr1 = {5, 3};
			int[] arr2 = {4, 2, 5, 4};
			int solucion = -1;
			do_check(arr1,arr2,solucion);
		}

		{
			int[] arr1 = {5, 3};
			int[] arr2 = {3, 4, 3, 2};
			int solucion = -1;
			do_check(arr1,arr2,solucion);
		}

		{
			int[] arr1 = {5, 3};
			int[] arr2 = {1, 3, 1, 3};
			int solucion = 0;
			do_check(arr1,arr2,solucion);
		}

		{
			int[] arr1 = {5, 3};
			int[] arr2 = {2, 1, 4, 3};
			int solucion = -2;
			do_check(arr1,arr2,solucion);
		}

		{
			int[] arr1 = {5, 3};
			int[] arr2 = {4, 5, 2};
			int solucion = -1;
			do_check(arr1,arr2,solucion);
		}

		{
			int[] arr1 = {5, 3};
			int[] arr2 = {4, 5, 4, 2, 5};
			int solucion = -1;
			do_check(arr1,arr2,solucion);
		}

		{
			int[] arr1 = {5, 3};
			int[] arr2 = {5, 2, 4, 3, 5};
			int solucion = -2;
			do_check(arr1,arr2,solucion);
		}

		{
			int[] arr1 = {5, 3};
			int[] arr2 = {2, 5, 4, 1, 5};
			int solucion = -2;
			do_check(arr1,arr2,solucion);
		}

		{
			int[] arr1 = {5, 3};
			int[] arr2 = {1, 2, 4, 2, 1};
			int solucion = -1;
			do_check(arr1,arr2,solucion);
		}

		{
			int[] arr1 = {5, 3};
			int[] arr2 = {5, 2, 5, 5, 3, 4};
			int solucion = -2;
			do_check(arr1,arr2,solucion);
		}

		{
			int[] arr1 = {5, 3};
			int[] arr2 = {5, 3, 1, 4, 4, 2};
			int solucion = -3;
			do_check(arr1,arr2,solucion);
		}

		{
			int[] arr1 = {5, 3};
			int[] arr2 = {2, 3, 5, 5, 1, 3};
			int solucion = -2;
			do_check(arr1,arr2,solucion);
		}

		{
			int[] arr1 = {5, 3};
			int[] arr2 = {2, 4, 3, 2, 2, 4};
			int solucion = -1;
			do_check(arr1,arr2,solucion);
		}

		{
			int[] arr1 = {5, 3};
			int[] arr2 = {1, 4, 2, 2, 3, 3};
			int solucion = -2;
			do_check(arr1,arr2,solucion);
		}

		{
			int[] arr1 = {5, 3};
			int[] arr2 = {5, 1, 3, 1, 3, 5};
			int solucion = -1;
			do_check(arr1,arr2,solucion);
		}

		{
			int[] arr1 = {5, 3};
			int[] arr2 = {1, 3, 3, 4, 3, 4};
			int solucion = -1;
			do_check(arr1,arr2,solucion);
		}

		{
			int[] arr1 = {5, 3};
			int[] arr2 = {3, 5, 4, 4, 2, 4, 1};
			int solucion = -3;
			do_check(arr1,arr2,solucion);
		}

		{
			int[] arr1 = {5, 3};
			int[] arr2 = {1, 3, 3, 4, 1, 1, 5};
			int solucion = -2;
			do_check(arr1,arr2,solucion);
		}

		{
			int[] arr1 = {5, 3};
			int[] arr2 = {3, 5, 1, 5, 4, 5, 3};
			int solucion = -2;
			do_check(arr1,arr2,solucion);
		}

		{
			int[] arr1 = {1, 4};
			int[] arr2 = {1};
			int solucion = 1;
			do_check(arr1,arr2,solucion);
		}

		{
			int[] arr1 = {1, 4};
			int[] arr2 = {5};
			int solucion = 1;
			do_check(arr1,arr2,solucion);
		}

		{
			int[] arr1 = {1, 4};
			int[] arr2 = {3};
			int solucion = 1;
			do_check(arr1,arr2,solucion);
		}

		{
			int[] arr1 = {1, 4};
			int[] arr2 = {4};
			int solucion = 1;
			do_check(arr1,arr2,solucion);
		}

		{
			int[] arr1 = {1, 4};
			int[] arr2 = {2};
			int solucion = 1;
			do_check(arr1,arr2,solucion);
		}

		{
			int[] arr1 = {1, 4};
			int[] arr2 = {3, 4};
			int solucion = 0;
			do_check(arr1,arr2,solucion);
		}

		{
			int[] arr1 = {1, 4};
			int[] arr2 = {4};
			int solucion = 1;
			do_check(arr1,arr2,solucion);
		}

		{
			int[] arr1 = {1, 4};
			int[] arr2 = {4, 5};
			int solucion = 0;
			do_check(arr1,arr2,solucion);
		}

		{
			int[] arr1 = {1, 4};
			int[] arr2 = {1, 4};
			int solucion = 0;
			do_check(arr1,arr2,solucion);
		}

		{
			int[] arr1 = {1, 4};
			int[] arr2 = {2, 3};
			int solucion = 0;
			do_check(arr1,arr2,solucion);
		}

		{
			int[] arr1 = {1, 4};
			int[] arr2 = {5, 3, 3};
			int solucion = 0;
			do_check(arr1,arr2,solucion);
		}

		{
			int[] arr1 = {1, 4};
			int[] arr2 = {3, 2, 5};
			int solucion = -1;
			do_check(arr1,arr2,solucion);
		}

		{
			int[] arr1 = {1, 4};
			int[] arr2 = {4, 1, 2};
			int solucion = -1;
			do_check(arr1,arr2,solucion);
		}

		{
			int[] arr1 = {1, 4};
			int[] arr2 = {5, 2, 3};
			int solucion = -1;
			do_check(arr1,arr2,solucion);
		}

		{
			int[] arr1 = {1, 4};
			int[] arr2 = {1, 5, 2};
			int solucion = -1;
			do_check(arr1,arr2,solucion);
		}

		{
			int[] arr1 = {1, 4};
			int[] arr2 = {2, 1, 1, 5};
			int solucion = -1;
			do_check(arr1,arr2,solucion);
		}

		{
			int[] arr1 = {1, 4};
			int[] arr2 = {4, 2, 5, 4};
			int solucion = -1;
			do_check(arr1,arr2,solucion);
		}

		{
			int[] arr1 = {1, 4};
			int[] arr2 = {3, 4, 3, 2};
			int solucion = -1;
			do_check(arr1,arr2,solucion);
		}

		{
			int[] arr1 = {1, 4};
			int[] arr2 = {1, 3, 1, 3};
			int solucion = 0;
			do_check(arr1,arr2,solucion);
		}

		{
			int[] arr1 = {1, 4};
			int[] arr2 = {2, 1, 4, 3};
			int solucion = -2;
			do_check(arr1,arr2,solucion);
		}

		{
			int[] arr1 = {1, 4};
			int[] arr2 = {4, 5, 2};
			int solucion = -1;
			do_check(arr1,arr2,solucion);
		}

		{
			int[] arr1 = {1, 4};
			int[] arr2 = {4, 5, 4, 2, 5};
			int solucion = -1;
			do_check(arr1,arr2,solucion);
		}

		{
			int[] arr1 = {1, 4};
			int[] arr2 = {5, 2, 4, 3, 5};
			int solucion = -2;
			do_check(arr1,arr2,solucion);
		}

		{
			int[] arr1 = {1, 4};
			int[] arr2 = {2, 5, 4, 1, 5};
			int solucion = -2;
			do_check(arr1,arr2,solucion);
		}

		{
			int[] arr1 = {1, 4};
			int[] arr2 = {1, 2, 4, 2, 1};
			int solucion = -1;
			do_check(arr1,arr2,solucion);
		}

		{
			int[] arr1 = {1, 4};
			int[] arr2 = {5, 2, 5, 5, 3, 4};
			int solucion = -2;
			do_check(arr1,arr2,solucion);
		}

		{
			int[] arr1 = {1, 4};
			int[] arr2 = {5, 3, 1, 4, 4, 2};
			int solucion = -3;
			do_check(arr1,arr2,solucion);
		}

		{
			int[] arr1 = {1, 4};
			int[] arr2 = {2, 3, 5, 5, 1, 3};
			int solucion = -2;
			do_check(arr1,arr2,solucion);
		}

		{
			int[] arr1 = {1, 4};
			int[] arr2 = {2, 4, 3, 2, 2, 4};
			int solucion = -1;
			do_check(arr1,arr2,solucion);
		}

		{
			int[] arr1 = {1, 4};
			int[] arr2 = {1, 4, 2, 2, 3, 3};
			int solucion = -2;
			do_check(arr1,arr2,solucion);
		}

		{
			int[] arr1 = {1, 4};
			int[] arr2 = {5, 1, 3, 1, 3, 5};
			int solucion = -1;
			do_check(arr1,arr2,solucion);
		}

		{
			int[] arr1 = {1, 4};
			int[] arr2 = {1, 3, 3, 4, 3, 4};
			int solucion = -1;
			do_check(arr1,arr2,solucion);
		}

		{
			int[] arr1 = {1, 4};
			int[] arr2 = {3, 5, 4, 4, 2, 4, 1};
			int solucion = -3;
			do_check(arr1,arr2,solucion);
		}

		{
			int[] arr1 = {1, 4};
			int[] arr2 = {1, 3, 3, 4, 1, 1, 5};
			int solucion = -2;
			do_check(arr1,arr2,solucion);
		}

		{
			int[] arr1 = {1, 4};
			int[] arr2 = {3, 5, 1, 5, 4, 5, 3};
			int solucion = -2;
			do_check(arr1,arr2,solucion);
		}

		{
			int[] arr1 = {4, 5};
			int[] arr2 = {1};
			int solucion = 1;
			do_check(arr1,arr2,solucion);
		}

		{
			int[] arr1 = {4, 5};
			int[] arr2 = {5};
			int solucion = 1;
			do_check(arr1,arr2,solucion);
		}

		{
			int[] arr1 = {4, 5};
			int[] arr2 = {3};
			int solucion = 1;
			do_check(arr1,arr2,solucion);
		}

		{
			int[] arr1 = {4, 5};
			int[] arr2 = {4};
			int solucion = 1;
			do_check(arr1,arr2,solucion);
		}

		{
			int[] arr1 = {4, 5};
			int[] arr2 = {2};
			int solucion = 1;
			do_check(arr1,arr2,solucion);
		}

		{
			int[] arr1 = {4, 5};
			int[] arr2 = {3, 4};
			int solucion = 0;
			do_check(arr1,arr2,solucion);
		}

		{
			int[] arr1 = {4, 5};
			int[] arr2 = {4};
			int solucion = 1;
			do_check(arr1,arr2,solucion);
		}

		{
			int[] arr1 = {4, 5};
			int[] arr2 = {4, 5};
			int solucion = 0;
			do_check(arr1,arr2,solucion);
		}

		{
			int[] arr1 = {4, 5};
			int[] arr2 = {1, 4};
			int solucion = 0;
			do_check(arr1,arr2,solucion);
		}

		{
			int[] arr1 = {4, 5};
			int[] arr2 = {2, 3};
			int solucion = 0;
			do_check(arr1,arr2,solucion);
		}

		{
			int[] arr1 = {4, 5};
			int[] arr2 = {5, 3, 3};
			int solucion = 0;
			do_check(arr1,arr2,solucion);
		}

		{
			int[] arr1 = {4, 5};
			int[] arr2 = {3, 2, 5};
			int solucion = -1;
			do_check(arr1,arr2,solucion);
		}

		{
			int[] arr1 = {4, 5};
			int[] arr2 = {4, 1, 2};
			int solucion = -1;
			do_check(arr1,arr2,solucion);
		}

		{
			int[] arr1 = {4, 5};
			int[] arr2 = {5, 2, 3};
			int solucion = -1;
			do_check(arr1,arr2,solucion);
		}

		{
			int[] arr1 = {4, 5};
			int[] arr2 = {1, 5, 2};
			int solucion = -1;
			do_check(arr1,arr2,solucion);
		}

		{
			int[] arr1 = {4, 5};
			int[] arr2 = {2, 1, 1, 5};
			int solucion = -1;
			do_check(arr1,arr2,solucion);
		}

		{
			int[] arr1 = {4, 5};
			int[] arr2 = {4, 2, 5, 4};
			int solucion = -1;
			do_check(arr1,arr2,solucion);
		}

		{
			int[] arr1 = {4, 5};
			int[] arr2 = {3, 4, 3, 2};
			int solucion = -1;
			do_check(arr1,arr2,solucion);
		}

		{
			int[] arr1 = {4, 5};
			int[] arr2 = {1, 3, 1, 3};
			int solucion = 0;
			do_check(arr1,arr2,solucion);
		}

		{
			int[] arr1 = {4, 5};
			int[] arr2 = {2, 1, 4, 3};
			int solucion = -2;
			do_check(arr1,arr2,solucion);
		}

		{
			int[] arr1 = {4, 5};
			int[] arr2 = {4, 5, 2};
			int solucion = -1;
			do_check(arr1,arr2,solucion);
		}

		{
			int[] arr1 = {4, 5};
			int[] arr2 = {4, 5, 4, 2, 5};
			int solucion = -1;
			do_check(arr1,arr2,solucion);
		}

		{
			int[] arr1 = {4, 5};
			int[] arr2 = {5, 2, 4, 3, 5};
			int solucion = -2;
			do_check(arr1,arr2,solucion);
		}

		{
			int[] arr1 = {4, 5};
			int[] arr2 = {2, 5, 4, 1, 5};
			int solucion = -2;
			do_check(arr1,arr2,solucion);
		}

		{
			int[] arr1 = {4, 5};
			int[] arr2 = {1, 2, 4, 2, 1};
			int solucion = -1;
			do_check(arr1,arr2,solucion);
		}

		{
			int[] arr1 = {4, 5};
			int[] arr2 = {5, 2, 5, 5, 3, 4};
			int solucion = -2;
			do_check(arr1,arr2,solucion);
		}

		{
			int[] arr1 = {4, 5};
			int[] arr2 = {5, 3, 1, 4, 4, 2};
			int solucion = -3;
			do_check(arr1,arr2,solucion);
		}

		{
			int[] arr1 = {4, 5};
			int[] arr2 = {2, 3, 5, 5, 1, 3};
			int solucion = -2;
			do_check(arr1,arr2,solucion);
		}

		{
			int[] arr1 = {4, 5};
			int[] arr2 = {2, 4, 3, 2, 2, 4};
			int solucion = -1;
			do_check(arr1,arr2,solucion);
		}

		{
			int[] arr1 = {4, 5};
			int[] arr2 = {1, 4, 2, 2, 3, 3};
			int solucion = -2;
			do_check(arr1,arr2,solucion);
		}

		{
			int[] arr1 = {4, 5};
			int[] arr2 = {5, 1, 3, 1, 3, 5};
			int solucion = -1;
			do_check(arr1,arr2,solucion);
		}

		{
			int[] arr1 = {4, 5};
			int[] arr2 = {1, 3, 3, 4, 3, 4};
			int solucion = -1;
			do_check(arr1,arr2,solucion);
		}

		{
			int[] arr1 = {4, 5};
			int[] arr2 = {3, 5, 4, 4, 2, 4, 1};
			int solucion = -3;
			do_check(arr1,arr2,solucion);
		}

		{
			int[] arr1 = {4, 5};
			int[] arr2 = {1, 3, 3, 4, 1, 1, 5};
			int solucion = -2;
			do_check(arr1,arr2,solucion);
		}

		{
			int[] arr1 = {4, 5};
			int[] arr2 = {3, 5, 1, 5, 4, 5, 3};
			int solucion = -2;
			do_check(arr1,arr2,solucion);
		}

		{
			int[] arr1 = {2, 2};
			int[] arr2 = {1};
			int solucion = 0;
			do_check(arr1,arr2,solucion);
		}

		{
			int[] arr1 = {2, 2};
			int[] arr2 = {5};
			int solucion = 0;
			do_check(arr1,arr2,solucion);
		}

		{
			int[] arr1 = {2, 2};
			int[] arr2 = {3};
			int solucion = 0;
			do_check(arr1,arr2,solucion);
		}

		{
			int[] arr1 = {2, 2};
			int[] arr2 = {4};
			int solucion = 0;
			do_check(arr1,arr2,solucion);
		}

		{
			int[] arr1 = {2, 2};
			int[] arr2 = {2};
			int solucion = 0;
			do_check(arr1,arr2,solucion);
		}

		{
			int[] arr1 = {2, 2};
			int[] arr2 = {3, 4};
			int solucion = -1;
			do_check(arr1,arr2,solucion);
		}

		{
			int[] arr1 = {2, 2};
			int[] arr2 = {4};
			int solucion = 0;
			do_check(arr1,arr2,solucion);
		}

		{
			int[] arr1 = {2, 2};
			int[] arr2 = {4, 5};
			int solucion = -1;
			do_check(arr1,arr2,solucion);
		}

		{
			int[] arr1 = {2, 2};
			int[] arr2 = {1, 4};
			int solucion = -1;
			do_check(arr1,arr2,solucion);
		}

		{
			int[] arr1 = {2, 2};
			int[] arr2 = {2, 3};
			int solucion = -1;
			do_check(arr1,arr2,solucion);
		}

		{
			int[] arr1 = {2, 2};
			int[] arr2 = {5, 3, 3};
			int solucion = -1;
			do_check(arr1,arr2,solucion);
		}

		{
			int[] arr1 = {2, 2};
			int[] arr2 = {3, 2, 5};
			int solucion = -2;
			do_check(arr1,arr2,solucion);
		}

		{
			int[] arr1 = {2, 2};
			int[] arr2 = {4, 1, 2};
			int solucion = -2;
			do_check(arr1,arr2,solucion);
		}

		{
			int[] arr1 = {2, 2};
			int[] arr2 = {5, 2, 3};
			int solucion = -2;
			do_check(arr1,arr2,solucion);
		}

		{
			int[] arr1 = {2, 2};
			int[] arr2 = {1, 5, 2};
			int solucion = -2;
			do_check(arr1,arr2,solucion);
		}

		{
			int[] arr1 = {2, 2};
			int[] arr2 = {2, 1, 1, 5};
			int solucion = -2;
			do_check(arr1,arr2,solucion);
		}

		{
			int[] arr1 = {2, 2};
			int[] arr2 = {4, 2, 5, 4};
			int solucion = -2;
			do_check(arr1,arr2,solucion);
		}

		{
			int[] arr1 = {2, 2};
			int[] arr2 = {3, 4, 3, 2};
			int solucion = -2;
			do_check(arr1,arr2,solucion);
		}

		{
			int[] arr1 = {2, 2};
			int[] arr2 = {1, 3, 1, 3};
			int solucion = -1;
			do_check(arr1,arr2,solucion);
		}

		{
			int[] arr1 = {2, 2};
			int[] arr2 = {2, 1, 4, 3};
			int solucion = -3;
			do_check(arr1,arr2,solucion);
		}

		{
			int[] arr1 = {2, 2};
			int[] arr2 = {4, 5, 2};
			int solucion = -2;
			do_check(arr1,arr2,solucion);
		}

		{
			int[] arr1 = {2, 2};
			int[] arr2 = {4, 5, 4, 2, 5};
			int solucion = -2;
			do_check(arr1,arr2,solucion);
		}

		{
			int[] arr1 = {2, 2};
			int[] arr2 = {5, 2, 4, 3, 5};
			int solucion = -3;
			do_check(arr1,arr2,solucion);
		}

		{
			int[] arr1 = {2, 2};
			int[] arr2 = {2, 5, 4, 1, 5};
			int solucion = -3;
			do_check(arr1,arr2,solucion);
		}

		{
			int[] arr1 = {2, 2};
			int[] arr2 = {1, 2, 4, 2, 1};
			int solucion = -2;
			do_check(arr1,arr2,solucion);
		}

		{
			int[] arr1 = {2, 2};
			int[] arr2 = {5, 2, 5, 5, 3, 4};
			int solucion = -3;
			do_check(arr1,arr2,solucion);
		}

		{
			int[] arr1 = {2, 2};
			int[] arr2 = {5, 3, 1, 4, 4, 2};
			int solucion = -4;
			do_check(arr1,arr2,solucion);
		}

		{
			int[] arr1 = {2, 2};
			int[] arr2 = {2, 3, 5, 5, 1, 3};
			int solucion = -3;
			do_check(arr1,arr2,solucion);
		}

		{
			int[] arr1 = {2, 2};
			int[] arr2 = {2, 4, 3, 2, 2, 4};
			int solucion = -2;
			do_check(arr1,arr2,solucion);
		}

		{
			int[] arr1 = {2, 2};
			int[] arr2 = {1, 4, 2, 2, 3, 3};
			int solucion = -3;
			do_check(arr1,arr2,solucion);
		}

		{
			int[] arr1 = {2, 2};
			int[] arr2 = {5, 1, 3, 1, 3, 5};
			int solucion = -2;
			do_check(arr1,arr2,solucion);
		}

		{
			int[] arr1 = {2, 2};
			int[] arr2 = {1, 3, 3, 4, 3, 4};
			int solucion = -2;
			do_check(arr1,arr2,solucion);
		}

		{
			int[] arr1 = {2, 2};
			int[] arr2 = {3, 5, 4, 4, 2, 4, 1};
			int solucion = -4;
			do_check(arr1,arr2,solucion);
		}

		{
			int[] arr1 = {2, 2};
			int[] arr2 = {1, 3, 3, 4, 1, 1, 5};
			int solucion = -3;
			do_check(arr1,arr2,solucion);
		}

		{
			int[] arr1 = {2, 2};
			int[] arr2 = {3, 5, 1, 5, 4, 5, 3};
			int solucion = -3;
			do_check(arr1,arr2,solucion);
		}

		{
			int[] arr1 = {4, 1, 3};
			int[] arr2 = {1};
			int solucion = 2;
			do_check(arr1,arr2,solucion);
		}

		{
			int[] arr1 = {4, 1, 3};
			int[] arr2 = {5};
			int solucion = 2;
			do_check(arr1,arr2,solucion);
		}

		{
			int[] arr1 = {4, 1, 3};
			int[] arr2 = {3};
			int solucion = 2;
			do_check(arr1,arr2,solucion);
		}

		{
			int[] arr1 = {4, 1, 3};
			int[] arr2 = {4};
			int solucion = 2;
			do_check(arr1,arr2,solucion);
		}

		{
			int[] arr1 = {4, 1, 3};
			int[] arr2 = {2};
			int solucion = 2;
			do_check(arr1,arr2,solucion);
		}

		{
			int[] arr1 = {4, 1, 3};
			int[] arr2 = {3, 4};
			int solucion = 1;
			do_check(arr1,arr2,solucion);
		}

		{
			int[] arr1 = {4, 1, 3};
			int[] arr2 = {4};
			int solucion = 2;
			do_check(arr1,arr2,solucion);
		}

		{
			int[] arr1 = {4, 1, 3};
			int[] arr2 = {4, 5};
			int solucion = 1;
			do_check(arr1,arr2,solucion);
		}

		{
			int[] arr1 = {4, 1, 3};
			int[] arr2 = {1, 4};
			int solucion = 1;
			do_check(arr1,arr2,solucion);
		}

		{
			int[] arr1 = {4, 1, 3};
			int[] arr2 = {2, 3};
			int solucion = 1;
			do_check(arr1,arr2,solucion);
		}

		{
			int[] arr1 = {4, 1, 3};
			int[] arr2 = {5, 3, 3};
			int solucion = 1;
			do_check(arr1,arr2,solucion);
		}

		{
			int[] arr1 = {4, 1, 3};
			int[] arr2 = {3, 2, 5};
			int solucion = 0;
			do_check(arr1,arr2,solucion);
		}

		{
			int[] arr1 = {4, 1, 3};
			int[] arr2 = {4, 1, 2};
			int solucion = 0;
			do_check(arr1,arr2,solucion);
		}

		{
			int[] arr1 = {4, 1, 3};
			int[] arr2 = {5, 2, 3};
			int solucion = 0;
			do_check(arr1,arr2,solucion);
		}

		{
			int[] arr1 = {4, 1, 3};
			int[] arr2 = {1, 5, 2};
			int solucion = 0;
			do_check(arr1,arr2,solucion);
		}

		{
			int[] arr1 = {4, 1, 3};
			int[] arr2 = {2, 1, 1, 5};
			int solucion = 0;
			do_check(arr1,arr2,solucion);
		}

		{
			int[] arr1 = {4, 1, 3};
			int[] arr2 = {4, 2, 5, 4};
			int solucion = 0;
			do_check(arr1,arr2,solucion);
		}

		{
			int[] arr1 = {4, 1, 3};
			int[] arr2 = {3, 4, 3, 2};
			int solucion = 0;
			do_check(arr1,arr2,solucion);
		}

		{
			int[] arr1 = {4, 1, 3};
			int[] arr2 = {1, 3, 1, 3};
			int solucion = 1;
			do_check(arr1,arr2,solucion);
		}

		{
			int[] arr1 = {4, 1, 3};
			int[] arr2 = {2, 1, 4, 3};
			int solucion = -1;
			do_check(arr1,arr2,solucion);
		}

		{
			int[] arr1 = {4, 1, 3};
			int[] arr2 = {4, 5, 2};
			int solucion = 0;
			do_check(arr1,arr2,solucion);
		}

		{
			int[] arr1 = {4, 1, 3};
			int[] arr2 = {4, 5, 4, 2, 5};
			int solucion = 0;
			do_check(arr1,arr2,solucion);
		}

		{
			int[] arr1 = {4, 1, 3};
			int[] arr2 = {5, 2, 4, 3, 5};
			int solucion = -1;
			do_check(arr1,arr2,solucion);
		}

		{
			int[] arr1 = {4, 1, 3};
			int[] arr2 = {2, 5, 4, 1, 5};
			int solucion = -1;
			do_check(arr1,arr2,solucion);
		}

		{
			int[] arr1 = {4, 1, 3};
			int[] arr2 = {1, 2, 4, 2, 1};
			int solucion = 0;
			do_check(arr1,arr2,solucion);
		}

		{
			int[] arr1 = {4, 1, 3};
			int[] arr2 = {5, 2, 5, 5, 3, 4};
			int solucion = -1;
			do_check(arr1,arr2,solucion);
		}

		{
			int[] arr1 = {4, 1, 3};
			int[] arr2 = {5, 3, 1, 4, 4, 2};
			int solucion = -2;
			do_check(arr1,arr2,solucion);
		}

		{
			int[] arr1 = {4, 1, 3};
			int[] arr2 = {2, 3, 5, 5, 1, 3};
			int solucion = -1;
			do_check(arr1,arr2,solucion);
		}

		{
			int[] arr1 = {4, 1, 3};
			int[] arr2 = {2, 4, 3, 2, 2, 4};
			int solucion = 0;
			do_check(arr1,arr2,solucion);
		}

		{
			int[] arr1 = {4, 1, 3};
			int[] arr2 = {1, 4, 2, 2, 3, 3};
			int solucion = -1;
			do_check(arr1,arr2,solucion);
		}

		{
			int[] arr1 = {4, 1, 3};
			int[] arr2 = {5, 1, 3, 1, 3, 5};
			int solucion = 0;
			do_check(arr1,arr2,solucion);
		}

		{
			int[] arr1 = {4, 1, 3};
			int[] arr2 = {1, 3, 3, 4, 3, 4};
			int solucion = 0;
			do_check(arr1,arr2,solucion);
		}

		{
			int[] arr1 = {4, 1, 3};
			int[] arr2 = {3, 5, 4, 4, 2, 4, 1};
			int solucion = -2;
			do_check(arr1,arr2,solucion);
		}

		{
			int[] arr1 = {4, 1, 3};
			int[] arr2 = {1, 3, 3, 4, 1, 1, 5};
			int solucion = -1;
			do_check(arr1,arr2,solucion);
		}

		{
			int[] arr1 = {4, 1, 3};
			int[] arr2 = {3, 5, 1, 5, 4, 5, 3};
			int solucion = -1;
			do_check(arr1,arr2,solucion);
		}

		{
			int[] arr1 = {2, 1, 5};
			int[] arr2 = {1};
			int solucion = 2;
			do_check(arr1,arr2,solucion);
		}

		{
			int[] arr1 = {2, 1, 5};
			int[] arr2 = {5};
			int solucion = 2;
			do_check(arr1,arr2,solucion);
		}

		{
			int[] arr1 = {2, 1, 5};
			int[] arr2 = {3};
			int solucion = 2;
			do_check(arr1,arr2,solucion);
		}

		{
			int[] arr1 = {2, 1, 5};
			int[] arr2 = {4};
			int solucion = 2;
			do_check(arr1,arr2,solucion);
		}

		{
			int[] arr1 = {2, 1, 5};
			int[] arr2 = {2};
			int solucion = 2;
			do_check(arr1,arr2,solucion);
		}

		{
			int[] arr1 = {2, 1, 5};
			int[] arr2 = {3, 4};
			int solucion = 1;
			do_check(arr1,arr2,solucion);
		}

		{
			int[] arr1 = {2, 1, 5};
			int[] arr2 = {4};
			int solucion = 2;
			do_check(arr1,arr2,solucion);
		}

		{
			int[] arr1 = {2, 1, 5};
			int[] arr2 = {4, 5};
			int solucion = 1;
			do_check(arr1,arr2,solucion);
		}

		{
			int[] arr1 = {2, 1, 5};
			int[] arr2 = {1, 4};
			int solucion = 1;
			do_check(arr1,arr2,solucion);
		}

		{
			int[] arr1 = {2, 1, 5};
			int[] arr2 = {2, 3};
			int solucion = 1;
			do_check(arr1,arr2,solucion);
		}

		{
			int[] arr1 = {2, 1, 5};
			int[] arr2 = {5, 3, 3};
			int solucion = 1;
			do_check(arr1,arr2,solucion);
		}

		{
			int[] arr1 = {2, 1, 5};
			int[] arr2 = {3, 2, 5};
			int solucion = 0;
			do_check(arr1,arr2,solucion);
		}

		{
			int[] arr1 = {2, 1, 5};
			int[] arr2 = {4, 1, 2};
			int solucion = 0;
			do_check(arr1,arr2,solucion);
		}

		{
			int[] arr1 = {2, 1, 5};
			int[] arr2 = {5, 2, 3};
			int solucion = 0;
			do_check(arr1,arr2,solucion);
		}

		{
			int[] arr1 = {2, 1, 5};
			int[] arr2 = {1, 5, 2};
			int solucion = 0;
			do_check(arr1,arr2,solucion);
		}

		{
			int[] arr1 = {2, 1, 5};
			int[] arr2 = {2, 1, 1, 5};
			int solucion = 0;
			do_check(arr1,arr2,solucion);
		}

		{
			int[] arr1 = {2, 1, 5};
			int[] arr2 = {4, 2, 5, 4};
			int solucion = 0;
			do_check(arr1,arr2,solucion);
		}

		{
			int[] arr1 = {2, 1, 5};
			int[] arr2 = {3, 4, 3, 2};
			int solucion = 0;
			do_check(arr1,arr2,solucion);
		}

		{
			int[] arr1 = {2, 1, 5};
			int[] arr2 = {1, 3, 1, 3};
			int solucion = 1;
			do_check(arr1,arr2,solucion);
		}

		{
			int[] arr1 = {2, 1, 5};
			int[] arr2 = {2, 1, 4, 3};
			int solucion = -1;
			do_check(arr1,arr2,solucion);
		}

		{
			int[] arr1 = {2, 1, 5};
			int[] arr2 = {4, 5, 2};
			int solucion = 0;
			do_check(arr1,arr2,solucion);
		}

		{
			int[] arr1 = {2, 1, 5};
			int[] arr2 = {4, 5, 4, 2, 5};
			int solucion = 0;
			do_check(arr1,arr2,solucion);
		}

		{
			int[] arr1 = {2, 1, 5};
			int[] arr2 = {5, 2, 4, 3, 5};
			int solucion = -1;
			do_check(arr1,arr2,solucion);
		}

		{
			int[] arr1 = {2, 1, 5};
			int[] arr2 = {2, 5, 4, 1, 5};
			int solucion = -1;
			do_check(arr1,arr2,solucion);
		}

		{
			int[] arr1 = {2, 1, 5};
			int[] arr2 = {1, 2, 4, 2, 1};
			int solucion = 0;
			do_check(arr1,arr2,solucion);
		}

		{
			int[] arr1 = {2, 1, 5};
			int[] arr2 = {5, 2, 5, 5, 3, 4};
			int solucion = -1;
			do_check(arr1,arr2,solucion);
		}

		{
			int[] arr1 = {2, 1, 5};
			int[] arr2 = {5, 3, 1, 4, 4, 2};
			int solucion = -2;
			do_check(arr1,arr2,solucion);
		}

		{
			int[] arr1 = {2, 1, 5};
			int[] arr2 = {2, 3, 5, 5, 1, 3};
			int solucion = -1;
			do_check(arr1,arr2,solucion);
		}

		{
			int[] arr1 = {2, 1, 5};
			int[] arr2 = {2, 4, 3, 2, 2, 4};
			int solucion = 0;
			do_check(arr1,arr2,solucion);
		}

		{
			int[] arr1 = {2, 1, 5};
			int[] arr2 = {1, 4, 2, 2, 3, 3};
			int solucion = -1;
			do_check(arr1,arr2,solucion);
		}

		{
			int[] arr1 = {2, 1, 5};
			int[] arr2 = {5, 1, 3, 1, 3, 5};
			int solucion = 0;
			do_check(arr1,arr2,solucion);
		}

		{
			int[] arr1 = {2, 1, 5};
			int[] arr2 = {1, 3, 3, 4, 3, 4};
			int solucion = 0;
			do_check(arr1,arr2,solucion);
		}

		{
			int[] arr1 = {2, 1, 5};
			int[] arr2 = {3, 5, 4, 4, 2, 4, 1};
			int solucion = -2;
			do_check(arr1,arr2,solucion);
		}

		{
			int[] arr1 = {2, 1, 5};
			int[] arr2 = {1, 3, 3, 4, 1, 1, 5};
			int solucion = -1;
			do_check(arr1,arr2,solucion);
		}

		{
			int[] arr1 = {2, 1, 5};
			int[] arr2 = {3, 5, 1, 5, 4, 5, 3};
			int solucion = -1;
			do_check(arr1,arr2,solucion);
		}

		{
			int[] arr1 = {2, 2, 3};
			int[] arr2 = {1};
			int solucion = 1;
			do_check(arr1,arr2,solucion);
		}

		{
			int[] arr1 = {2, 2, 3};
			int[] arr2 = {5};
			int solucion = 1;
			do_check(arr1,arr2,solucion);
		}

		{
			int[] arr1 = {2, 2, 3};
			int[] arr2 = {3};
			int solucion = 1;
			do_check(arr1,arr2,solucion);
		}

		{
			int[] arr1 = {2, 2, 3};
			int[] arr2 = {4};
			int solucion = 1;
			do_check(arr1,arr2,solucion);
		}

		{
			int[] arr1 = {2, 2, 3};
			int[] arr2 = {2};
			int solucion = 1;
			do_check(arr1,arr2,solucion);
		}

		{
			int[] arr1 = {2, 2, 3};
			int[] arr2 = {3, 4};
			int solucion = 0;
			do_check(arr1,arr2,solucion);
		}

		{
			int[] arr1 = {2, 2, 3};
			int[] arr2 = {4};
			int solucion = 1;
			do_check(arr1,arr2,solucion);
		}

		{
			int[] arr1 = {2, 2, 3};
			int[] arr2 = {4, 5};
			int solucion = 0;
			do_check(arr1,arr2,solucion);
		}

		{
			int[] arr1 = {2, 2, 3};
			int[] arr2 = {1, 4};
			int solucion = 0;
			do_check(arr1,arr2,solucion);
		}

		{
			int[] arr1 = {2, 2, 3};
			int[] arr2 = {2, 3};
			int solucion = 0;
			do_check(arr1,arr2,solucion);
		}

		{
			int[] arr1 = {2, 2, 3};
			int[] arr2 = {5, 3, 3};
			int solucion = 0;
			do_check(arr1,arr2,solucion);
		}

		{
			int[] arr1 = {2, 2, 3};
			int[] arr2 = {3, 2, 5};
			int solucion = -1;
			do_check(arr1,arr2,solucion);
		}

		{
			int[] arr1 = {2, 2, 3};
			int[] arr2 = {4, 1, 2};
			int solucion = -1;
			do_check(arr1,arr2,solucion);
		}

		{
			int[] arr1 = {2, 2, 3};
			int[] arr2 = {5, 2, 3};
			int solucion = -1;
			do_check(arr1,arr2,solucion);
		}

		{
			int[] arr1 = {2, 2, 3};
			int[] arr2 = {1, 5, 2};
			int solucion = -1;
			do_check(arr1,arr2,solucion);
		}

		{
			int[] arr1 = {2, 2, 3};
			int[] arr2 = {2, 1, 1, 5};
			int solucion = -1;
			do_check(arr1,arr2,solucion);
		}

		{
			int[] arr1 = {2, 2, 3};
			int[] arr2 = {4, 2, 5, 4};
			int solucion = -1;
			do_check(arr1,arr2,solucion);
		}

		{
			int[] arr1 = {2, 2, 3};
			int[] arr2 = {3, 4, 3, 2};
			int solucion = -1;
			do_check(arr1,arr2,solucion);
		}

		{
			int[] arr1 = {2, 2, 3};
			int[] arr2 = {1, 3, 1, 3};
			int solucion = 0;
			do_check(arr1,arr2,solucion);
		}

		{
			int[] arr1 = {2, 2, 3};
			int[] arr2 = {2, 1, 4, 3};
			int solucion = -2;
			do_check(arr1,arr2,solucion);
		}

		{
			int[] arr1 = {2, 2, 3};
			int[] arr2 = {4, 5, 2};
			int solucion = -1;
			do_check(arr1,arr2,solucion);
		}

		{
			int[] arr1 = {2, 2, 3};
			int[] arr2 = {4, 5, 4, 2, 5};
			int solucion = -1;
			do_check(arr1,arr2,solucion);
		}

		{
			int[] arr1 = {2, 2, 3};
			int[] arr2 = {5, 2, 4, 3, 5};
			int solucion = -2;
			do_check(arr1,arr2,solucion);
		}

		{
			int[] arr1 = {2, 2, 3};
			int[] arr2 = {2, 5, 4, 1, 5};
			int solucion = -2;
			do_check(arr1,arr2,solucion);
		}

		{
			int[] arr1 = {2, 2, 3};
			int[] arr2 = {1, 2, 4, 2, 1};
			int solucion = -1;
			do_check(arr1,arr2,solucion);
		}

		{
			int[] arr1 = {2, 2, 3};
			int[] arr2 = {5, 2, 5, 5, 3, 4};
			int solucion = -2;
			do_check(arr1,arr2,solucion);
		}

		{
			int[] arr1 = {2, 2, 3};
			int[] arr2 = {5, 3, 1, 4, 4, 2};
			int solucion = -3;
			do_check(arr1,arr2,solucion);
		}

		{
			int[] arr1 = {2, 2, 3};
			int[] arr2 = {2, 3, 5, 5, 1, 3};
			int solucion = -2;
			do_check(arr1,arr2,solucion);
		}

		{
			int[] arr1 = {2, 2, 3};
			int[] arr2 = {2, 4, 3, 2, 2, 4};
			int solucion = -1;
			do_check(arr1,arr2,solucion);
		}

		{
			int[] arr1 = {2, 2, 3};
			int[] arr2 = {1, 4, 2, 2, 3, 3};
			int solucion = -2;
			do_check(arr1,arr2,solucion);
		}

		{
			int[] arr1 = {2, 2, 3};
			int[] arr2 = {5, 1, 3, 1, 3, 5};
			int solucion = -1;
			do_check(arr1,arr2,solucion);
		}

		{
			int[] arr1 = {2, 2, 3};
			int[] arr2 = {1, 3, 3, 4, 3, 4};
			int solucion = -1;
			do_check(arr1,arr2,solucion);
		}

		{
			int[] arr1 = {2, 2, 3};
			int[] arr2 = {3, 5, 4, 4, 2, 4, 1};
			int solucion = -3;
			do_check(arr1,arr2,solucion);
		}

		{
			int[] arr1 = {2, 2, 3};
			int[] arr2 = {1, 3, 3, 4, 1, 1, 5};
			int solucion = -2;
			do_check(arr1,arr2,solucion);
		}

		{
			int[] arr1 = {2, 2, 3};
			int[] arr2 = {3, 5, 1, 5, 4, 5, 3};
			int solucion = -2;
			do_check(arr1,arr2,solucion);
		}

		{
			int[] arr1 = {3, 3, 2};
			int[] arr2 = {1};
			int solucion = 1;
			do_check(arr1,arr2,solucion);
		}

		{
			int[] arr1 = {3, 3, 2};
			int[] arr2 = {5};
			int solucion = 1;
			do_check(arr1,arr2,solucion);
		}

		{
			int[] arr1 = {3, 3, 2};
			int[] arr2 = {3};
			int solucion = 1;
			do_check(arr1,arr2,solucion);
		}

		{
			int[] arr1 = {3, 3, 2};
			int[] arr2 = {4};
			int solucion = 1;
			do_check(arr1,arr2,solucion);
		}

		{
			int[] arr1 = {3, 3, 2};
			int[] arr2 = {2};
			int solucion = 1;
			do_check(arr1,arr2,solucion);
		}

		{
			int[] arr1 = {3, 3, 2};
			int[] arr2 = {3, 4};
			int solucion = 0;
			do_check(arr1,arr2,solucion);
		}

		{
			int[] arr1 = {3, 3, 2};
			int[] arr2 = {4};
			int solucion = 1;
			do_check(arr1,arr2,solucion);
		}

		{
			int[] arr1 = {3, 3, 2};
			int[] arr2 = {4, 5};
			int solucion = 0;
			do_check(arr1,arr2,solucion);
		}

		{
			int[] arr1 = {3, 3, 2};
			int[] arr2 = {1, 4};
			int solucion = 0;
			do_check(arr1,arr2,solucion);
		}

		{
			int[] arr1 = {3, 3, 2};
			int[] arr2 = {2, 3};
			int solucion = 0;
			do_check(arr1,arr2,solucion);
		}

		{
			int[] arr1 = {3, 3, 2};
			int[] arr2 = {5, 3, 3};
			int solucion = 0;
			do_check(arr1,arr2,solucion);
		}

		{
			int[] arr1 = {3, 3, 2};
			int[] arr2 = {3, 2, 5};
			int solucion = -1;
			do_check(arr1,arr2,solucion);
		}

		{
			int[] arr1 = {3, 3, 2};
			int[] arr2 = {4, 1, 2};
			int solucion = -1;
			do_check(arr1,arr2,solucion);
		}

		{
			int[] arr1 = {3, 3, 2};
			int[] arr2 = {5, 2, 3};
			int solucion = -1;
			do_check(arr1,arr2,solucion);
		}

		{
			int[] arr1 = {3, 3, 2};
			int[] arr2 = {1, 5, 2};
			int solucion = -1;
			do_check(arr1,arr2,solucion);
		}

		{
			int[] arr1 = {3, 3, 2};
			int[] arr2 = {2, 1, 1, 5};
			int solucion = -1;
			do_check(arr1,arr2,solucion);
		}

		{
			int[] arr1 = {3, 3, 2};
			int[] arr2 = {4, 2, 5, 4};
			int solucion = -1;
			do_check(arr1,arr2,solucion);
		}

		{
			int[] arr1 = {3, 3, 2};
			int[] arr2 = {3, 4, 3, 2};
			int solucion = -1;
			do_check(arr1,arr2,solucion);
		}

		{
			int[] arr1 = {3, 3, 2};
			int[] arr2 = {1, 3, 1, 3};
			int solucion = 0;
			do_check(arr1,arr2,solucion);
		}

		{
			int[] arr1 = {3, 3, 2};
			int[] arr2 = {2, 1, 4, 3};
			int solucion = -2;
			do_check(arr1,arr2,solucion);
		}

		{
			int[] arr1 = {3, 3, 2};
			int[] arr2 = {4, 5, 2};
			int solucion = -1;
			do_check(arr1,arr2,solucion);
		}

		{
			int[] arr1 = {3, 3, 2};
			int[] arr2 = {4, 5, 4, 2, 5};
			int solucion = -1;
			do_check(arr1,arr2,solucion);
		}

		{
			int[] arr1 = {3, 3, 2};
			int[] arr2 = {5, 2, 4, 3, 5};
			int solucion = -2;
			do_check(arr1,arr2,solucion);
		}

		{
			int[] arr1 = {3, 3, 2};
			int[] arr2 = {2, 5, 4, 1, 5};
			int solucion = -2;
			do_check(arr1,arr2,solucion);
		}

		{
			int[] arr1 = {3, 3, 2};
			int[] arr2 = {1, 2, 4, 2, 1};
			int solucion = -1;
			do_check(arr1,arr2,solucion);
		}

		{
			int[] arr1 = {3, 3, 2};
			int[] arr2 = {5, 2, 5, 5, 3, 4};
			int solucion = -2;
			do_check(arr1,arr2,solucion);
		}

		{
			int[] arr1 = {3, 3, 2};
			int[] arr2 = {5, 3, 1, 4, 4, 2};
			int solucion = -3;
			do_check(arr1,arr2,solucion);
		}

		{
			int[] arr1 = {3, 3, 2};
			int[] arr2 = {2, 3, 5, 5, 1, 3};
			int solucion = -2;
			do_check(arr1,arr2,solucion);
		}

		{
			int[] arr1 = {3, 3, 2};
			int[] arr2 = {2, 4, 3, 2, 2, 4};
			int solucion = -1;
			do_check(arr1,arr2,solucion);
		}

		{
			int[] arr1 = {3, 3, 2};
			int[] arr2 = {1, 4, 2, 2, 3, 3};
			int solucion = -2;
			do_check(arr1,arr2,solucion);
		}

		{
			int[] arr1 = {3, 3, 2};
			int[] arr2 = {5, 1, 3, 1, 3, 5};
			int solucion = -1;
			do_check(arr1,arr2,solucion);
		}

		{
			int[] arr1 = {3, 3, 2};
			int[] arr2 = {1, 3, 3, 4, 3, 4};
			int solucion = -1;
			do_check(arr1,arr2,solucion);
		}

		{
			int[] arr1 = {3, 3, 2};
			int[] arr2 = {3, 5, 4, 4, 2, 4, 1};
			int solucion = -3;
			do_check(arr1,arr2,solucion);
		}

		{
			int[] arr1 = {3, 3, 2};
			int[] arr2 = {1, 3, 3, 4, 1, 1, 5};
			int solucion = -2;
			do_check(arr1,arr2,solucion);
		}

		{
			int[] arr1 = {3, 3, 2};
			int[] arr2 = {3, 5, 1, 5, 4, 5, 3};
			int solucion = -2;
			do_check(arr1,arr2,solucion);
		}

		{
			int[] arr1 = {4, 1};
			int[] arr2 = {1};
			int solucion = 1;
			do_check(arr1,arr2,solucion);
		}

		{
			int[] arr1 = {4, 1};
			int[] arr2 = {5};
			int solucion = 1;
			do_check(arr1,arr2,solucion);
		}

		{
			int[] arr1 = {4, 1};
			int[] arr2 = {3};
			int solucion = 1;
			do_check(arr1,arr2,solucion);
		}

		{
			int[] arr1 = {4, 1};
			int[] arr2 = {4};
			int solucion = 1;
			do_check(arr1,arr2,solucion);
		}

		{
			int[] arr1 = {4, 1};
			int[] arr2 = {2};
			int solucion = 1;
			do_check(arr1,arr2,solucion);
		}

		{
			int[] arr1 = {4, 1};
			int[] arr2 = {3, 4};
			int solucion = 0;
			do_check(arr1,arr2,solucion);
		}

		{
			int[] arr1 = {4, 1};
			int[] arr2 = {4};
			int solucion = 1;
			do_check(arr1,arr2,solucion);
		}

		{
			int[] arr1 = {4, 1};
			int[] arr2 = {4, 5};
			int solucion = 0;
			do_check(arr1,arr2,solucion);
		}

		{
			int[] arr1 = {4, 1};
			int[] arr2 = {1, 4};
			int solucion = 0;
			do_check(arr1,arr2,solucion);
		}

		{
			int[] arr1 = {4, 1};
			int[] arr2 = {2, 3};
			int solucion = 0;
			do_check(arr1,arr2,solucion);
		}

		{
			int[] arr1 = {4, 1};
			int[] arr2 = {5, 3, 3};
			int solucion = 0;
			do_check(arr1,arr2,solucion);
		}

		{
			int[] arr1 = {4, 1};
			int[] arr2 = {3, 2, 5};
			int solucion = -1;
			do_check(arr1,arr2,solucion);
		}

		{
			int[] arr1 = {4, 1};
			int[] arr2 = {4, 1, 2};
			int solucion = -1;
			do_check(arr1,arr2,solucion);
		}

		{
			int[] arr1 = {4, 1};
			int[] arr2 = {5, 2, 3};
			int solucion = -1;
			do_check(arr1,arr2,solucion);
		}

		{
			int[] arr1 = {4, 1};
			int[] arr2 = {1, 5, 2};
			int solucion = -1;
			do_check(arr1,arr2,solucion);
		}

		{
			int[] arr1 = {4, 1};
			int[] arr2 = {2, 1, 1, 5};
			int solucion = -1;
			do_check(arr1,arr2,solucion);
		}

		{
			int[] arr1 = {4, 1};
			int[] arr2 = {4, 2, 5, 4};
			int solucion = -1;
			do_check(arr1,arr2,solucion);
		}

		{
			int[] arr1 = {4, 1};
			int[] arr2 = {3, 4, 3, 2};
			int solucion = -1;
			do_check(arr1,arr2,solucion);
		}

		{
			int[] arr1 = {4, 1};
			int[] arr2 = {1, 3, 1, 3};
			int solucion = 0;
			do_check(arr1,arr2,solucion);
		}

		{
			int[] arr1 = {4, 1};
			int[] arr2 = {2, 1, 4, 3};
			int solucion = -2;
			do_check(arr1,arr2,solucion);
		}

		{
			int[] arr1 = {4, 1};
			int[] arr2 = {4, 5, 2};
			int solucion = -1;
			do_check(arr1,arr2,solucion);
		}

		{
			int[] arr1 = {4, 1};
			int[] arr2 = {4, 5, 4, 2, 5};
			int solucion = -1;
			do_check(arr1,arr2,solucion);
		}

		{
			int[] arr1 = {4, 1};
			int[] arr2 = {5, 2, 4, 3, 5};
			int solucion = -2;
			do_check(arr1,arr2,solucion);
		}

		{
			int[] arr1 = {4, 1};
			int[] arr2 = {2, 5, 4, 1, 5};
			int solucion = -2;
			do_check(arr1,arr2,solucion);
		}

		{
			int[] arr1 = {4, 1};
			int[] arr2 = {1, 2, 4, 2, 1};
			int solucion = -1;
			do_check(arr1,arr2,solucion);
		}

		{
			int[] arr1 = {4, 1};
			int[] arr2 = {5, 2, 5, 5, 3, 4};
			int solucion = -2;
			do_check(arr1,arr2,solucion);
		}

		{
			int[] arr1 = {4, 1};
			int[] arr2 = {5, 3, 1, 4, 4, 2};
			int solucion = -3;
			do_check(arr1,arr2,solucion);
		}

		{
			int[] arr1 = {4, 1};
			int[] arr2 = {2, 3, 5, 5, 1, 3};
			int solucion = -2;
			do_check(arr1,arr2,solucion);
		}

		{
			int[] arr1 = {4, 1};
			int[] arr2 = {2, 4, 3, 2, 2, 4};
			int solucion = -1;
			do_check(arr1,arr2,solucion);
		}

		{
			int[] arr1 = {4, 1};
			int[] arr2 = {1, 4, 2, 2, 3, 3};
			int solucion = -2;
			do_check(arr1,arr2,solucion);
		}

		{
			int[] arr1 = {4, 1};
			int[] arr2 = {5, 1, 3, 1, 3, 5};
			int solucion = -1;
			do_check(arr1,arr2,solucion);
		}

		{
			int[] arr1 = {4, 1};
			int[] arr2 = {1, 3, 3, 4, 3, 4};
			int solucion = -1;
			do_check(arr1,arr2,solucion);
		}

		{
			int[] arr1 = {4, 1};
			int[] arr2 = {3, 5, 4, 4, 2, 4, 1};
			int solucion = -3;
			do_check(arr1,arr2,solucion);
		}

		{
			int[] arr1 = {4, 1};
			int[] arr2 = {1, 3, 3, 4, 1, 1, 5};
			int solucion = -2;
			do_check(arr1,arr2,solucion);
		}

		{
			int[] arr1 = {4, 1};
			int[] arr2 = {3, 5, 1, 5, 4, 5, 3};
			int solucion = -2;
			do_check(arr1,arr2,solucion);
		}

		{
			int[] arr1 = {2, 1, 1, 5};
			int[] arr2 = {1};
			int solucion = 2;
			do_check(arr1,arr2,solucion);
		}

		{
			int[] arr1 = {2, 1, 1, 5};
			int[] arr2 = {5};
			int solucion = 2;
			do_check(arr1,arr2,solucion);
		}

		{
			int[] arr1 = {2, 1, 1, 5};
			int[] arr2 = {3};
			int solucion = 2;
			do_check(arr1,arr2,solucion);
		}

		{
			int[] arr1 = {2, 1, 1, 5};
			int[] arr2 = {4};
			int solucion = 2;
			do_check(arr1,arr2,solucion);
		}

		{
			int[] arr1 = {2, 1, 1, 5};
			int[] arr2 = {2};
			int solucion = 2;
			do_check(arr1,arr2,solucion);
		}

		{
			int[] arr1 = {2, 1, 1, 5};
			int[] arr2 = {3, 4};
			int solucion = 1;
			do_check(arr1,arr2,solucion);
		}

		{
			int[] arr1 = {2, 1, 1, 5};
			int[] arr2 = {4};
			int solucion = 2;
			do_check(arr1,arr2,solucion);
		}

		{
			int[] arr1 = {2, 1, 1, 5};
			int[] arr2 = {4, 5};
			int solucion = 1;
			do_check(arr1,arr2,solucion);
		}

		{
			int[] arr1 = {2, 1, 1, 5};
			int[] arr2 = {1, 4};
			int solucion = 1;
			do_check(arr1,arr2,solucion);
		}

		{
			int[] arr1 = {2, 1, 1, 5};
			int[] arr2 = {2, 3};
			int solucion = 1;
			do_check(arr1,arr2,solucion);
		}

		{
			int[] arr1 = {2, 1, 1, 5};
			int[] arr2 = {5, 3, 3};
			int solucion = 1;
			do_check(arr1,arr2,solucion);
		}

		{
			int[] arr1 = {2, 1, 1, 5};
			int[] arr2 = {3, 2, 5};
			int solucion = 0;
			do_check(arr1,arr2,solucion);
		}

		{
			int[] arr1 = {2, 1, 1, 5};
			int[] arr2 = {4, 1, 2};
			int solucion = 0;
			do_check(arr1,arr2,solucion);
		}

		{
			int[] arr1 = {2, 1, 1, 5};
			int[] arr2 = {5, 2, 3};
			int solucion = 0;
			do_check(arr1,arr2,solucion);
		}

		{
			int[] arr1 = {2, 1, 1, 5};
			int[] arr2 = {1, 5, 2};
			int solucion = 0;
			do_check(arr1,arr2,solucion);
		}

		{
			int[] arr1 = {2, 1, 1, 5};
			int[] arr2 = {2, 1, 1, 5};
			int solucion = 0;
			do_check(arr1,arr2,solucion);
		}

		{
			int[] arr1 = {2, 1, 1, 5};
			int[] arr2 = {4, 2, 5, 4};
			int solucion = 0;
			do_check(arr1,arr2,solucion);
		}

		{
			int[] arr1 = {2, 1, 1, 5};
			int[] arr2 = {3, 4, 3, 2};
			int solucion = 0;
			do_check(arr1,arr2,solucion);
		}

		{
			int[] arr1 = {2, 1, 1, 5};
			int[] arr2 = {1, 3, 1, 3};
			int solucion = 1;
			do_check(arr1,arr2,solucion);
		}

		{
			int[] arr1 = {2, 1, 1, 5};
			int[] arr2 = {2, 1, 4, 3};
			int solucion = -1;
			do_check(arr1,arr2,solucion);
		}

		{
			int[] arr1 = {2, 1, 1, 5};
			int[] arr2 = {4, 5, 2};
			int solucion = 0;
			do_check(arr1,arr2,solucion);
		}

		{
			int[] arr1 = {2, 1, 1, 5};
			int[] arr2 = {4, 5, 4, 2, 5};
			int solucion = 0;
			do_check(arr1,arr2,solucion);
		}

		{
			int[] arr1 = {2, 1, 1, 5};
			int[] arr2 = {5, 2, 4, 3, 5};
			int solucion = -1;
			do_check(arr1,arr2,solucion);
		}

		{
			int[] arr1 = {2, 1, 1, 5};
			int[] arr2 = {2, 5, 4, 1, 5};
			int solucion = -1;
			do_check(arr1,arr2,solucion);
		}

		{
			int[] arr1 = {2, 1, 1, 5};
			int[] arr2 = {1, 2, 4, 2, 1};
			int solucion = 0;
			do_check(arr1,arr2,solucion);
		}

		{
			int[] arr1 = {2, 1, 1, 5};
			int[] arr2 = {5, 2, 5, 5, 3, 4};
			int solucion = -1;
			do_check(arr1,arr2,solucion);
		}

		{
			int[] arr1 = {2, 1, 1, 5};
			int[] arr2 = {5, 3, 1, 4, 4, 2};
			int solucion = -2;
			do_check(arr1,arr2,solucion);
		}

		{
			int[] arr1 = {2, 1, 1, 5};
			int[] arr2 = {2, 3, 5, 5, 1, 3};
			int solucion = -1;
			do_check(arr1,arr2,solucion);
		}

		{
			int[] arr1 = {2, 1, 1, 5};
			int[] arr2 = {2, 4, 3, 2, 2, 4};
			int solucion = 0;
			do_check(arr1,arr2,solucion);
		}

		{
			int[] arr1 = {2, 1, 1, 5};
			int[] arr2 = {1, 4, 2, 2, 3, 3};
			int solucion = -1;
			do_check(arr1,arr2,solucion);
		}

		{
			int[] arr1 = {2, 1, 1, 5};
			int[] arr2 = {5, 1, 3, 1, 3, 5};
			int solucion = 0;
			do_check(arr1,arr2,solucion);
		}

		{
			int[] arr1 = {2, 1, 1, 5};
			int[] arr2 = {1, 3, 3, 4, 3, 4};
			int solucion = 0;
			do_check(arr1,arr2,solucion);
		}

		{
			int[] arr1 = {2, 1, 1, 5};
			int[] arr2 = {3, 5, 4, 4, 2, 4, 1};
			int solucion = -2;
			do_check(arr1,arr2,solucion);
		}

		{
			int[] arr1 = {2, 1, 1, 5};
			int[] arr2 = {1, 3, 3, 4, 1, 1, 5};
			int solucion = -1;
			do_check(arr1,arr2,solucion);
		}

		{
			int[] arr1 = {2, 1, 1, 5};
			int[] arr2 = {3, 5, 1, 5, 4, 5, 3};
			int solucion = -1;
			do_check(arr1,arr2,solucion);
		}

		{
			int[] arr1 = {3, 1, 5};
			int[] arr2 = {1};
			int solucion = 2;
			do_check(arr1,arr2,solucion);
		}

		{
			int[] arr1 = {3, 1, 5};
			int[] arr2 = {5};
			int solucion = 2;
			do_check(arr1,arr2,solucion);
		}

		{
			int[] arr1 = {3, 1, 5};
			int[] arr2 = {3};
			int solucion = 2;
			do_check(arr1,arr2,solucion);
		}

		{
			int[] arr1 = {3, 1, 5};
			int[] arr2 = {4};
			int solucion = 2;
			do_check(arr1,arr2,solucion);
		}

		{
			int[] arr1 = {3, 1, 5};
			int[] arr2 = {2};
			int solucion = 2;
			do_check(arr1,arr2,solucion);
		}

		{
			int[] arr1 = {3, 1, 5};
			int[] arr2 = {3, 4};
			int solucion = 1;
			do_check(arr1,arr2,solucion);
		}

		{
			int[] arr1 = {3, 1, 5};
			int[] arr2 = {4};
			int solucion = 2;
			do_check(arr1,arr2,solucion);
		}

		{
			int[] arr1 = {3, 1, 5};
			int[] arr2 = {4, 5};
			int solucion = 1;
			do_check(arr1,arr2,solucion);
		}

		{
			int[] arr1 = {3, 1, 5};
			int[] arr2 = {1, 4};
			int solucion = 1;
			do_check(arr1,arr2,solucion);
		}

		{
			int[] arr1 = {3, 1, 5};
			int[] arr2 = {2, 3};
			int solucion = 1;
			do_check(arr1,arr2,solucion);
		}

		{
			int[] arr1 = {3, 1, 5};
			int[] arr2 = {5, 3, 3};
			int solucion = 1;
			do_check(arr1,arr2,solucion);
		}

		{
			int[] arr1 = {3, 1, 5};
			int[] arr2 = {3, 2, 5};
			int solucion = 0;
			do_check(arr1,arr2,solucion);
		}

		{
			int[] arr1 = {3, 1, 5};
			int[] arr2 = {4, 1, 2};
			int solucion = 0;
			do_check(arr1,arr2,solucion);
		}

		{
			int[] arr1 = {3, 1, 5};
			int[] arr2 = {5, 2, 3};
			int solucion = 0;
			do_check(arr1,arr2,solucion);
		}

		{
			int[] arr1 = {3, 1, 5};
			int[] arr2 = {1, 5, 2};
			int solucion = 0;
			do_check(arr1,arr2,solucion);
		}

		{
			int[] arr1 = {3, 1, 5};
			int[] arr2 = {2, 1, 1, 5};
			int solucion = 0;
			do_check(arr1,arr2,solucion);
		}

		{
			int[] arr1 = {3, 1, 5};
			int[] arr2 = {4, 2, 5, 4};
			int solucion = 0;
			do_check(arr1,arr2,solucion);
		}

		{
			int[] arr1 = {3, 1, 5};
			int[] arr2 = {3, 4, 3, 2};
			int solucion = 0;
			do_check(arr1,arr2,solucion);
		}

		{
			int[] arr1 = {3, 1, 5};
			int[] arr2 = {1, 3, 1, 3};
			int solucion = 1;
			do_check(arr1,arr2,solucion);
		}

		{
			int[] arr1 = {3, 1, 5};
			int[] arr2 = {2, 1, 4, 3};
			int solucion = -1;
			do_check(arr1,arr2,solucion);
		}

		{
			int[] arr1 = {3, 1, 5};
			int[] arr2 = {4, 5, 2};
			int solucion = 0;
			do_check(arr1,arr2,solucion);
		}

		{
			int[] arr1 = {3, 1, 5};
			int[] arr2 = {4, 5, 4, 2, 5};
			int solucion = 0;
			do_check(arr1,arr2,solucion);
		}

		{
			int[] arr1 = {3, 1, 5};
			int[] arr2 = {5, 2, 4, 3, 5};
			int solucion = -1;
			do_check(arr1,arr2,solucion);
		}

		{
			int[] arr1 = {3, 1, 5};
			int[] arr2 = {2, 5, 4, 1, 5};
			int solucion = -1;
			do_check(arr1,arr2,solucion);
		}

		{
			int[] arr1 = {3, 1, 5};
			int[] arr2 = {1, 2, 4, 2, 1};
			int solucion = 0;
			do_check(arr1,arr2,solucion);
		}

		{
			int[] arr1 = {3, 1, 5};
			int[] arr2 = {5, 2, 5, 5, 3, 4};
			int solucion = -1;
			do_check(arr1,arr2,solucion);
		}

		{
			int[] arr1 = {3, 1, 5};
			int[] arr2 = {5, 3, 1, 4, 4, 2};
			int solucion = -2;
			do_check(arr1,arr2,solucion);
		}

		{
			int[] arr1 = {3, 1, 5};
			int[] arr2 = {2, 3, 5, 5, 1, 3};
			int solucion = -1;
			do_check(arr1,arr2,solucion);
		}

		{
			int[] arr1 = {3, 1, 5};
			int[] arr2 = {2, 4, 3, 2, 2, 4};
			int solucion = 0;
			do_check(arr1,arr2,solucion);
		}

		{
			int[] arr1 = {3, 1, 5};
			int[] arr2 = {1, 4, 2, 2, 3, 3};
			int solucion = -1;
			do_check(arr1,arr2,solucion);
		}

		{
			int[] arr1 = {3, 1, 5};
			int[] arr2 = {5, 1, 3, 1, 3, 5};
			int solucion = 0;
			do_check(arr1,arr2,solucion);
		}

		{
			int[] arr1 = {3, 1, 5};
			int[] arr2 = {1, 3, 3, 4, 3, 4};
			int solucion = 0;
			do_check(arr1,arr2,solucion);
		}

		{
			int[] arr1 = {3, 1, 5};
			int[] arr2 = {3, 5, 4, 4, 2, 4, 1};
			int solucion = -2;
			do_check(arr1,arr2,solucion);
		}

		{
			int[] arr1 = {3, 1, 5};
			int[] arr2 = {1, 3, 3, 4, 1, 1, 5};
			int solucion = -1;
			do_check(arr1,arr2,solucion);
		}

		{
			int[] arr1 = {3, 1, 5};
			int[] arr2 = {3, 5, 1, 5, 4, 5, 3};
			int solucion = -1;
			do_check(arr1,arr2,solucion);
		}

		{
			int[] arr1 = {4, 4, 4};
			int[] arr2 = {1};
			int solucion = 0;
			do_check(arr1,arr2,solucion);
		}

		{
			int[] arr1 = {4, 4, 4};
			int[] arr2 = {5};
			int solucion = 0;
			do_check(arr1,arr2,solucion);
		}

		{
			int[] arr1 = {4, 4, 4};
			int[] arr2 = {3};
			int solucion = 0;
			do_check(arr1,arr2,solucion);
		}

		{
			int[] arr1 = {4, 4, 4};
			int[] arr2 = {4};
			int solucion = 0;
			do_check(arr1,arr2,solucion);
		}

		{
			int[] arr1 = {4, 4, 4};
			int[] arr2 = {2};
			int solucion = 0;
			do_check(arr1,arr2,solucion);
		}

		{
			int[] arr1 = {4, 4, 4};
			int[] arr2 = {3, 4};
			int solucion = -1;
			do_check(arr1,arr2,solucion);
		}

		{
			int[] arr1 = {4, 4, 4};
			int[] arr2 = {4};
			int solucion = 0;
			do_check(arr1,arr2,solucion);
		}

		{
			int[] arr1 = {4, 4, 4};
			int[] arr2 = {4, 5};
			int solucion = -1;
			do_check(arr1,arr2,solucion);
		}

		{
			int[] arr1 = {4, 4, 4};
			int[] arr2 = {1, 4};
			int solucion = -1;
			do_check(arr1,arr2,solucion);
		}

		{
			int[] arr1 = {4, 4, 4};
			int[] arr2 = {2, 3};
			int solucion = -1;
			do_check(arr1,arr2,solucion);
		}

		{
			int[] arr1 = {4, 4, 4};
			int[] arr2 = {5, 3, 3};
			int solucion = -1;
			do_check(arr1,arr2,solucion);
		}

		{
			int[] arr1 = {4, 4, 4};
			int[] arr2 = {3, 2, 5};
			int solucion = -2;
			do_check(arr1,arr2,solucion);
		}

		{
			int[] arr1 = {4, 4, 4};
			int[] arr2 = {4, 1, 2};
			int solucion = -2;
			do_check(arr1,arr2,solucion);
		}

		{
			int[] arr1 = {4, 4, 4};
			int[] arr2 = {5, 2, 3};
			int solucion = -2;
			do_check(arr1,arr2,solucion);
		}

		{
			int[] arr1 = {4, 4, 4};
			int[] arr2 = {1, 5, 2};
			int solucion = -2;
			do_check(arr1,arr2,solucion);
		}

		{
			int[] arr1 = {4, 4, 4};
			int[] arr2 = {2, 1, 1, 5};
			int solucion = -2;
			do_check(arr1,arr2,solucion);
		}

		{
			int[] arr1 = {4, 4, 4};
			int[] arr2 = {4, 2, 5, 4};
			int solucion = -2;
			do_check(arr1,arr2,solucion);
		}

		{
			int[] arr1 = {4, 4, 4};
			int[] arr2 = {3, 4, 3, 2};
			int solucion = -2;
			do_check(arr1,arr2,solucion);
		}

		{
			int[] arr1 = {4, 4, 4};
			int[] arr2 = {1, 3, 1, 3};
			int solucion = -1;
			do_check(arr1,arr2,solucion);
		}

		{
			int[] arr1 = {4, 4, 4};
			int[] arr2 = {2, 1, 4, 3};
			int solucion = -3;
			do_check(arr1,arr2,solucion);
		}

		{
			int[] arr1 = {4, 4, 4};
			int[] arr2 = {4, 5, 2};
			int solucion = -2;
			do_check(arr1,arr2,solucion);
		}

		{
			int[] arr1 = {4, 4, 4};
			int[] arr2 = {4, 5, 4, 2, 5};
			int solucion = -2;
			do_check(arr1,arr2,solucion);
		}

		{
			int[] arr1 = {4, 4, 4};
			int[] arr2 = {5, 2, 4, 3, 5};
			int solucion = -3;
			do_check(arr1,arr2,solucion);
		}

		{
			int[] arr1 = {4, 4, 4};
			int[] arr2 = {2, 5, 4, 1, 5};
			int solucion = -3;
			do_check(arr1,arr2,solucion);
		}

		{
			int[] arr1 = {4, 4, 4};
			int[] arr2 = {1, 2, 4, 2, 1};
			int solucion = -2;
			do_check(arr1,arr2,solucion);
		}

		{
			int[] arr1 = {4, 4, 4};
			int[] arr2 = {5, 2, 5, 5, 3, 4};
			int solucion = -3;
			do_check(arr1,arr2,solucion);
		}

		{
			int[] arr1 = {4, 4, 4};
			int[] arr2 = {5, 3, 1, 4, 4, 2};
			int solucion = -4;
			do_check(arr1,arr2,solucion);
		}

		{
			int[] arr1 = {4, 4, 4};
			int[] arr2 = {2, 3, 5, 5, 1, 3};
			int solucion = -3;
			do_check(arr1,arr2,solucion);
		}

		{
			int[] arr1 = {4, 4, 4};
			int[] arr2 = {2, 4, 3, 2, 2, 4};
			int solucion = -2;
			do_check(arr1,arr2,solucion);
		}

		{
			int[] arr1 = {4, 4, 4};
			int[] arr2 = {1, 4, 2, 2, 3, 3};
			int solucion = -3;
			do_check(arr1,arr2,solucion);
		}

		{
			int[] arr1 = {4, 4, 4};
			int[] arr2 = {5, 1, 3, 1, 3, 5};
			int solucion = -2;
			do_check(arr1,arr2,solucion);
		}

		{
			int[] arr1 = {4, 4, 4};
			int[] arr2 = {1, 3, 3, 4, 3, 4};
			int solucion = -2;
			do_check(arr1,arr2,solucion);
		}

		{
			int[] arr1 = {4, 4, 4};
			int[] arr2 = {3, 5, 4, 4, 2, 4, 1};
			int solucion = -4;
			do_check(arr1,arr2,solucion);
		}

		{
			int[] arr1 = {4, 4, 4};
			int[] arr2 = {1, 3, 3, 4, 1, 1, 5};
			int solucion = -3;
			do_check(arr1,arr2,solucion);
		}

		{
			int[] arr1 = {4, 4, 4};
			int[] arr2 = {3, 5, 1, 5, 4, 5, 3};
			int solucion = -3;
			do_check(arr1,arr2,solucion);
		}

		{
			int[] arr1 = {5, 2, 3, 4};
			int[] arr2 = {1};
			int solucion = 3;
			do_check(arr1,arr2,solucion);
		}

		{
			int[] arr1 = {5, 2, 3, 4};
			int[] arr2 = {5};
			int solucion = 3;
			do_check(arr1,arr2,solucion);
		}

		{
			int[] arr1 = {5, 2, 3, 4};
			int[] arr2 = {3};
			int solucion = 3;
			do_check(arr1,arr2,solucion);
		}

		{
			int[] arr1 = {5, 2, 3, 4};
			int[] arr2 = {4};
			int solucion = 3;
			do_check(arr1,arr2,solucion);
		}

		{
			int[] arr1 = {5, 2, 3, 4};
			int[] arr2 = {2};
			int solucion = 3;
			do_check(arr1,arr2,solucion);
		}

		{
			int[] arr1 = {5, 2, 3, 4};
			int[] arr2 = {3, 4};
			int solucion = 2;
			do_check(arr1,arr2,solucion);
		}

		{
			int[] arr1 = {5, 2, 3, 4};
			int[] arr2 = {4};
			int solucion = 3;
			do_check(arr1,arr2,solucion);
		}

		{
			int[] arr1 = {5, 2, 3, 4};
			int[] arr2 = {4, 5};
			int solucion = 2;
			do_check(arr1,arr2,solucion);
		}

		{
			int[] arr1 = {5, 2, 3, 4};
			int[] arr2 = {1, 4};
			int solucion = 2;
			do_check(arr1,arr2,solucion);
		}

		{
			int[] arr1 = {5, 2, 3, 4};
			int[] arr2 = {2, 3};
			int solucion = 2;
			do_check(arr1,arr2,solucion);
		}

		{
			int[] arr1 = {5, 2, 3, 4};
			int[] arr2 = {5, 3, 3};
			int solucion = 2;
			do_check(arr1,arr2,solucion);
		}

		{
			int[] arr1 = {5, 2, 3, 4};
			int[] arr2 = {3, 2, 5};
			int solucion = 1;
			do_check(arr1,arr2,solucion);
		}

		{
			int[] arr1 = {5, 2, 3, 4};
			int[] arr2 = {4, 1, 2};
			int solucion = 1;
			do_check(arr1,arr2,solucion);
		}

		{
			int[] arr1 = {5, 2, 3, 4};
			int[] arr2 = {5, 2, 3};
			int solucion = 1;
			do_check(arr1,arr2,solucion);
		}

		{
			int[] arr1 = {5, 2, 3, 4};
			int[] arr2 = {1, 5, 2};
			int solucion = 1;
			do_check(arr1,arr2,solucion);
		}

		{
			int[] arr1 = {5, 2, 3, 4};
			int[] arr2 = {2, 1, 1, 5};
			int solucion = 1;
			do_check(arr1,arr2,solucion);
		}

		{
			int[] arr1 = {5, 2, 3, 4};
			int[] arr2 = {4, 2, 5, 4};
			int solucion = 1;
			do_check(arr1,arr2,solucion);
		}

		{
			int[] arr1 = {5, 2, 3, 4};
			int[] arr2 = {3, 4, 3, 2};
			int solucion = 1;
			do_check(arr1,arr2,solucion);
		}

		{
			int[] arr1 = {5, 2, 3, 4};
			int[] arr2 = {1, 3, 1, 3};
			int solucion = 2;
			do_check(arr1,arr2,solucion);
		}

		{
			int[] arr1 = {5, 2, 3, 4};
			int[] arr2 = {2, 1, 4, 3};
			int solucion = 0;
			do_check(arr1,arr2,solucion);
		}

		{
			int[] arr1 = {5, 2, 3, 4};
			int[] arr2 = {4, 5, 2};
			int solucion = 1;
			do_check(arr1,arr2,solucion);
		}

		{
			int[] arr1 = {5, 2, 3, 4};
			int[] arr2 = {4, 5, 4, 2, 5};
			int solucion = 1;
			do_check(arr1,arr2,solucion);
		}

		{
			int[] arr1 = {5, 2, 3, 4};
			int[] arr2 = {5, 2, 4, 3, 5};
			int solucion = 0;
			do_check(arr1,arr2,solucion);
		}

		{
			int[] arr1 = {5, 2, 3, 4};
			int[] arr2 = {2, 5, 4, 1, 5};
			int solucion = 0;
			do_check(arr1,arr2,solucion);
		}

		{
			int[] arr1 = {5, 2, 3, 4};
			int[] arr2 = {1, 2, 4, 2, 1};
			int solucion = 1;
			do_check(arr1,arr2,solucion);
		}

		{
			int[] arr1 = {5, 2, 3, 4};
			int[] arr2 = {5, 2, 5, 5, 3, 4};
			int solucion = 0;
			do_check(arr1,arr2,solucion);
		}

		{
			int[] arr1 = {5, 2, 3, 4};
			int[] arr2 = {5, 3, 1, 4, 4, 2};
			int solucion = -1;
			do_check(arr1,arr2,solucion);
		}

		{
			int[] arr1 = {5, 2, 3, 4};
			int[] arr2 = {2, 3, 5, 5, 1, 3};
			int solucion = 0;
			do_check(arr1,arr2,solucion);
		}

		{
			int[] arr1 = {5, 2, 3, 4};
			int[] arr2 = {2, 4, 3, 2, 2, 4};
			int solucion = 1;
			do_check(arr1,arr2,solucion);
		}

		{
			int[] arr1 = {5, 2, 3, 4};
			int[] arr2 = {1, 4, 2, 2, 3, 3};
			int solucion = 0;
			do_check(arr1,arr2,solucion);
		}

		{
			int[] arr1 = {5, 2, 3, 4};
			int[] arr2 = {5, 1, 3, 1, 3, 5};
			int solucion = 1;
			do_check(arr1,arr2,solucion);
		}

		{
			int[] arr1 = {5, 2, 3, 4};
			int[] arr2 = {1, 3, 3, 4, 3, 4};
			int solucion = 1;
			do_check(arr1,arr2,solucion);
		}

		{
			int[] arr1 = {5, 2, 3, 4};
			int[] arr2 = {3, 5, 4, 4, 2, 4, 1};
			int solucion = -1;
			do_check(arr1,arr2,solucion);
		}

		{
			int[] arr1 = {5, 2, 3, 4};
			int[] arr2 = {1, 3, 3, 4, 1, 1, 5};
			int solucion = 0;
			do_check(arr1,arr2,solucion);
		}

		{
			int[] arr1 = {5, 2, 3, 4};
			int[] arr2 = {3, 5, 1, 5, 4, 5, 3};
			int solucion = 0;
			do_check(arr1,arr2,solucion);
		}

		{
			int[] arr1 = {1, 4, 3, 2};
			int[] arr2 = {1};
			int solucion = 3;
			do_check(arr1,arr2,solucion);
		}

		{
			int[] arr1 = {1, 4, 3, 2};
			int[] arr2 = {5};
			int solucion = 3;
			do_check(arr1,arr2,solucion);
		}

		{
			int[] arr1 = {1, 4, 3, 2};
			int[] arr2 = {3};
			int solucion = 3;
			do_check(arr1,arr2,solucion);
		}

		{
			int[] arr1 = {1, 4, 3, 2};
			int[] arr2 = {4};
			int solucion = 3;
			do_check(arr1,arr2,solucion);
		}

		{
			int[] arr1 = {1, 4, 3, 2};
			int[] arr2 = {2};
			int solucion = 3;
			do_check(arr1,arr2,solucion);
		}

		{
			int[] arr1 = {1, 4, 3, 2};
			int[] arr2 = {3, 4};
			int solucion = 2;
			do_check(arr1,arr2,solucion);
		}

		{
			int[] arr1 = {1, 4, 3, 2};
			int[] arr2 = {4};
			int solucion = 3;
			do_check(arr1,arr2,solucion);
		}

		{
			int[] arr1 = {1, 4, 3, 2};
			int[] arr2 = {4, 5};
			int solucion = 2;
			do_check(arr1,arr2,solucion);
		}

		{
			int[] arr1 = {1, 4, 3, 2};
			int[] arr2 = {1, 4};
			int solucion = 2;
			do_check(arr1,arr2,solucion);
		}

		{
			int[] arr1 = {1, 4, 3, 2};
			int[] arr2 = {2, 3};
			int solucion = 2;
			do_check(arr1,arr2,solucion);
		}

		{
			int[] arr1 = {1, 4, 3, 2};
			int[] arr2 = {5, 3, 3};
			int solucion = 2;
			do_check(arr1,arr2,solucion);
		}

		{
			int[] arr1 = {1, 4, 3, 2};
			int[] arr2 = {3, 2, 5};
			int solucion = 1;
			do_check(arr1,arr2,solucion);
		}

		{
			int[] arr1 = {1, 4, 3, 2};
			int[] arr2 = {4, 1, 2};
			int solucion = 1;
			do_check(arr1,arr2,solucion);
		}

		{
			int[] arr1 = {1, 4, 3, 2};
			int[] arr2 = {5, 2, 3};
			int solucion = 1;
			do_check(arr1,arr2,solucion);
		}

		{
			int[] arr1 = {1, 4, 3, 2};
			int[] arr2 = {1, 5, 2};
			int solucion = 1;
			do_check(arr1,arr2,solucion);
		}

		{
			int[] arr1 = {1, 4, 3, 2};
			int[] arr2 = {2, 1, 1, 5};
			int solucion = 1;
			do_check(arr1,arr2,solucion);
		}

		{
			int[] arr1 = {1, 4, 3, 2};
			int[] arr2 = {4, 2, 5, 4};
			int solucion = 1;
			do_check(arr1,arr2,solucion);
		}

		{
			int[] arr1 = {1, 4, 3, 2};
			int[] arr2 = {3, 4, 3, 2};
			int solucion = 1;
			do_check(arr1,arr2,solucion);
		}

		{
			int[] arr1 = {1, 4, 3, 2};
			int[] arr2 = {1, 3, 1, 3};
			int solucion = 2;
			do_check(arr1,arr2,solucion);
		}

		{
			int[] arr1 = {1, 4, 3, 2};
			int[] arr2 = {2, 1, 4, 3};
			int solucion = 0;
			do_check(arr1,arr2,solucion);
		}

		{
			int[] arr1 = {1, 4, 3, 2};
			int[] arr2 = {4, 5, 2};
			int solucion = 1;
			do_check(arr1,arr2,solucion);
		}

		{
			int[] arr1 = {1, 4, 3, 2};
			int[] arr2 = {4, 5, 4, 2, 5};
			int solucion = 1;
			do_check(arr1,arr2,solucion);
		}

		{
			int[] arr1 = {1, 4, 3, 2};
			int[] arr2 = {5, 2, 4, 3, 5};
			int solucion = 0;
			do_check(arr1,arr2,solucion);
		}

		{
			int[] arr1 = {1, 4, 3, 2};
			int[] arr2 = {2, 5, 4, 1, 5};
			int solucion = 0;
			do_check(arr1,arr2,solucion);
		}

		{
			int[] arr1 = {1, 4, 3, 2};
			int[] arr2 = {1, 2, 4, 2, 1};
			int solucion = 1;
			do_check(arr1,arr2,solucion);
		}

		{
			int[] arr1 = {1, 4, 3, 2};
			int[] arr2 = {5, 2, 5, 5, 3, 4};
			int solucion = 0;
			do_check(arr1,arr2,solucion);
		}

		{
			int[] arr1 = {1, 4, 3, 2};
			int[] arr2 = {5, 3, 1, 4, 4, 2};
			int solucion = -1;
			do_check(arr1,arr2,solucion);
		}

		{
			int[] arr1 = {1, 4, 3, 2};
			int[] arr2 = {2, 3, 5, 5, 1, 3};
			int solucion = 0;
			do_check(arr1,arr2,solucion);
		}

		{
			int[] arr1 = {1, 4, 3, 2};
			int[] arr2 = {2, 4, 3, 2, 2, 4};
			int solucion = 1;
			do_check(arr1,arr2,solucion);
		}

		{
			int[] arr1 = {1, 4, 3, 2};
			int[] arr2 = {1, 4, 2, 2, 3, 3};
			int solucion = 0;
			do_check(arr1,arr2,solucion);
		}

		{
			int[] arr1 = {1, 4, 3, 2};
			int[] arr2 = {5, 1, 3, 1, 3, 5};
			int solucion = 1;
			do_check(arr1,arr2,solucion);
		}

		{
			int[] arr1 = {1, 4, 3, 2};
			int[] arr2 = {1, 3, 3, 4, 3, 4};
			int solucion = 1;
			do_check(arr1,arr2,solucion);
		}

		{
			int[] arr1 = {1, 4, 3, 2};
			int[] arr2 = {3, 5, 4, 4, 2, 4, 1};
			int solucion = -1;
			do_check(arr1,arr2,solucion);
		}

		{
			int[] arr1 = {1, 4, 3, 2};
			int[] arr2 = {1, 3, 3, 4, 1, 1, 5};
			int solucion = 0;
			do_check(arr1,arr2,solucion);
		}

		{
			int[] arr1 = {1, 4, 3, 2};
			int[] arr2 = {3, 5, 1, 5, 4, 5, 3};
			int solucion = 0;
			do_check(arr1,arr2,solucion);
		}

		{
			int[] arr1 = {2, 3, 1, 4, 4};
			int[] arr2 = {1};
			int solucion = 3;
			do_check(arr1,arr2,solucion);
		}

		{
			int[] arr1 = {2, 3, 1, 4, 4};
			int[] arr2 = {5};
			int solucion = 3;
			do_check(arr1,arr2,solucion);
		}

		{
			int[] arr1 = {2, 3, 1, 4, 4};
			int[] arr2 = {3};
			int solucion = 3;
			do_check(arr1,arr2,solucion);
		}

		{
			int[] arr1 = {2, 3, 1, 4, 4};
			int[] arr2 = {4};
			int solucion = 3;
			do_check(arr1,arr2,solucion);
		}

		{
			int[] arr1 = {2, 3, 1, 4, 4};
			int[] arr2 = {2};
			int solucion = 3;
			do_check(arr1,arr2,solucion);
		}

		{
			int[] arr1 = {2, 3, 1, 4, 4};
			int[] arr2 = {3, 4};
			int solucion = 2;
			do_check(arr1,arr2,solucion);
		}

		{
			int[] arr1 = {2, 3, 1, 4, 4};
			int[] arr2 = {4};
			int solucion = 3;
			do_check(arr1,arr2,solucion);
		}

		{
			int[] arr1 = {2, 3, 1, 4, 4};
			int[] arr2 = {4, 5};
			int solucion = 2;
			do_check(arr1,arr2,solucion);
		}

		{
			int[] arr1 = {2, 3, 1, 4, 4};
			int[] arr2 = {1, 4};
			int solucion = 2;
			do_check(arr1,arr2,solucion);
		}

		{
			int[] arr1 = {2, 3, 1, 4, 4};
			int[] arr2 = {2, 3};
			int solucion = 2;
			do_check(arr1,arr2,solucion);
		}

		{
			int[] arr1 = {2, 3, 1, 4, 4};
			int[] arr2 = {5, 3, 3};
			int solucion = 2;
			do_check(arr1,arr2,solucion);
		}

		{
			int[] arr1 = {2, 3, 1, 4, 4};
			int[] arr2 = {3, 2, 5};
			int solucion = 1;
			do_check(arr1,arr2,solucion);
		}

		{
			int[] arr1 = {2, 3, 1, 4, 4};
			int[] arr2 = {4, 1, 2};
			int solucion = 1;
			do_check(arr1,arr2,solucion);
		}

		{
			int[] arr1 = {2, 3, 1, 4, 4};
			int[] arr2 = {5, 2, 3};
			int solucion = 1;
			do_check(arr1,arr2,solucion);
		}

		{
			int[] arr1 = {2, 3, 1, 4, 4};
			int[] arr2 = {1, 5, 2};
			int solucion = 1;
			do_check(arr1,arr2,solucion);
		}

		{
			int[] arr1 = {2, 3, 1, 4, 4};
			int[] arr2 = {2, 1, 1, 5};
			int solucion = 1;
			do_check(arr1,arr2,solucion);
		}

		{
			int[] arr1 = {2, 3, 1, 4, 4};
			int[] arr2 = {4, 2, 5, 4};
			int solucion = 1;
			do_check(arr1,arr2,solucion);
		}

		{
			int[] arr1 = {2, 3, 1, 4, 4};
			int[] arr2 = {3, 4, 3, 2};
			int solucion = 1;
			do_check(arr1,arr2,solucion);
		}

		{
			int[] arr1 = {2, 3, 1, 4, 4};
			int[] arr2 = {1, 3, 1, 3};
			int solucion = 2;
			do_check(arr1,arr2,solucion);
		}

		{
			int[] arr1 = {2, 3, 1, 4, 4};
			int[] arr2 = {2, 1, 4, 3};
			int solucion = 0;
			do_check(arr1,arr2,solucion);
		}

		{
			int[] arr1 = {2, 3, 1, 4, 4};
			int[] arr2 = {4, 5, 2};
			int solucion = 1;
			do_check(arr1,arr2,solucion);
		}

		{
			int[] arr1 = {2, 3, 1, 4, 4};
			int[] arr2 = {4, 5, 4, 2, 5};
			int solucion = 1;
			do_check(arr1,arr2,solucion);
		}

		{
			int[] arr1 = {2, 3, 1, 4, 4};
			int[] arr2 = {5, 2, 4, 3, 5};
			int solucion = 0;
			do_check(arr1,arr2,solucion);
		}

		{
			int[] arr1 = {2, 3, 1, 4, 4};
			int[] arr2 = {2, 5, 4, 1, 5};
			int solucion = 0;
			do_check(arr1,arr2,solucion);
		}

		{
			int[] arr1 = {2, 3, 1, 4, 4};
			int[] arr2 = {1, 2, 4, 2, 1};
			int solucion = 1;
			do_check(arr1,arr2,solucion);
		}

		{
			int[] arr1 = {2, 3, 1, 4, 4};
			int[] arr2 = {5, 2, 5, 5, 3, 4};
			int solucion = 0;
			do_check(arr1,arr2,solucion);
		}

		{
			int[] arr1 = {2, 3, 1, 4, 4};
			int[] arr2 = {5, 3, 1, 4, 4, 2};
			int solucion = -1;
			do_check(arr1,arr2,solucion);
		}

		{
			int[] arr1 = {2, 3, 1, 4, 4};
			int[] arr2 = {2, 3, 5, 5, 1, 3};
			int solucion = 0;
			do_check(arr1,arr2,solucion);
		}

		{
			int[] arr1 = {2, 3, 1, 4, 4};
			int[] arr2 = {2, 4, 3, 2, 2, 4};
			int solucion = 1;
			do_check(arr1,arr2,solucion);
		}

		{
			int[] arr1 = {2, 3, 1, 4, 4};
			int[] arr2 = {1, 4, 2, 2, 3, 3};
			int solucion = 0;
			do_check(arr1,arr2,solucion);
		}

		{
			int[] arr1 = {2, 3, 1, 4, 4};
			int[] arr2 = {5, 1, 3, 1, 3, 5};
			int solucion = 1;
			do_check(arr1,arr2,solucion);
		}

		{
			int[] arr1 = {2, 3, 1, 4, 4};
			int[] arr2 = {1, 3, 3, 4, 3, 4};
			int solucion = 1;
			do_check(arr1,arr2,solucion);
		}

		{
			int[] arr1 = {2, 3, 1, 4, 4};
			int[] arr2 = {3, 5, 4, 4, 2, 4, 1};
			int solucion = -1;
			do_check(arr1,arr2,solucion);
		}

		{
			int[] arr1 = {2, 3, 1, 4, 4};
			int[] arr2 = {1, 3, 3, 4, 1, 1, 5};
			int solucion = 0;
			do_check(arr1,arr2,solucion);
		}

		{
			int[] arr1 = {2, 3, 1, 4, 4};
			int[] arr2 = {3, 5, 1, 5, 4, 5, 3};
			int solucion = 0;
			do_check(arr1,arr2,solucion);
		}

		{
			int[] arr1 = {4, 4, 4, 3, 4};
			int[] arr2 = {1};
			int solucion = 1;
			do_check(arr1,arr2,solucion);
		}

		{
			int[] arr1 = {4, 4, 4, 3, 4};
			int[] arr2 = {5};
			int solucion = 1;
			do_check(arr1,arr2,solucion);
		}

		{
			int[] arr1 = {4, 4, 4, 3, 4};
			int[] arr2 = {3};
			int solucion = 1;
			do_check(arr1,arr2,solucion);
		}

		{
			int[] arr1 = {4, 4, 4, 3, 4};
			int[] arr2 = {4};
			int solucion = 1;
			do_check(arr1,arr2,solucion);
		}

		{
			int[] arr1 = {4, 4, 4, 3, 4};
			int[] arr2 = {2};
			int solucion = 1;
			do_check(arr1,arr2,solucion);
		}

		{
			int[] arr1 = {4, 4, 4, 3, 4};
			int[] arr2 = {3, 4};
			int solucion = 0;
			do_check(arr1,arr2,solucion);
		}

		{
			int[] arr1 = {4, 4, 4, 3, 4};
			int[] arr2 = {4};
			int solucion = 1;
			do_check(arr1,arr2,solucion);
		}

		{
			int[] arr1 = {4, 4, 4, 3, 4};
			int[] arr2 = {4, 5};
			int solucion = 0;
			do_check(arr1,arr2,solucion);
		}

		{
			int[] arr1 = {4, 4, 4, 3, 4};
			int[] arr2 = {1, 4};
			int solucion = 0;
			do_check(arr1,arr2,solucion);
		}

		{
			int[] arr1 = {4, 4, 4, 3, 4};
			int[] arr2 = {2, 3};
			int solucion = 0;
			do_check(arr1,arr2,solucion);
		}

		{
			int[] arr1 = {4, 4, 4, 3, 4};
			int[] arr2 = {5, 3, 3};
			int solucion = 0;
			do_check(arr1,arr2,solucion);
		}

		{
			int[] arr1 = {4, 4, 4, 3, 4};
			int[] arr2 = {3, 2, 5};
			int solucion = -1;
			do_check(arr1,arr2,solucion);
		}

		{
			int[] arr1 = {4, 4, 4, 3, 4};
			int[] arr2 = {4, 1, 2};
			int solucion = -1;
			do_check(arr1,arr2,solucion);
		}

		{
			int[] arr1 = {4, 4, 4, 3, 4};
			int[] arr2 = {5, 2, 3};
			int solucion = -1;
			do_check(arr1,arr2,solucion);
		}

		{
			int[] arr1 = {4, 4, 4, 3, 4};
			int[] arr2 = {1, 5, 2};
			int solucion = -1;
			do_check(arr1,arr2,solucion);
		}

		{
			int[] arr1 = {4, 4, 4, 3, 4};
			int[] arr2 = {2, 1, 1, 5};
			int solucion = -1;
			do_check(arr1,arr2,solucion);
		}

		{
			int[] arr1 = {4, 4, 4, 3, 4};
			int[] arr2 = {4, 2, 5, 4};
			int solucion = -1;
			do_check(arr1,arr2,solucion);
		}

		{
			int[] arr1 = {4, 4, 4, 3, 4};
			int[] arr2 = {3, 4, 3, 2};
			int solucion = -1;
			do_check(arr1,arr2,solucion);
		}

		{
			int[] arr1 = {4, 4, 4, 3, 4};
			int[] arr2 = {1, 3, 1, 3};
			int solucion = 0;
			do_check(arr1,arr2,solucion);
		}

		{
			int[] arr1 = {4, 4, 4, 3, 4};
			int[] arr2 = {2, 1, 4, 3};
			int solucion = -2;
			do_check(arr1,arr2,solucion);
		}

		{
			int[] arr1 = {4, 4, 4, 3, 4};
			int[] arr2 = {4, 5, 2};
			int solucion = -1;
			do_check(arr1,arr2,solucion);
		}

		{
			int[] arr1 = {4, 4, 4, 3, 4};
			int[] arr2 = {4, 5, 4, 2, 5};
			int solucion = -1;
			do_check(arr1,arr2,solucion);
		}

		{
			int[] arr1 = {4, 4, 4, 3, 4};
			int[] arr2 = {5, 2, 4, 3, 5};
			int solucion = -2;
			do_check(arr1,arr2,solucion);
		}

		{
			int[] arr1 = {4, 4, 4, 3, 4};
			int[] arr2 = {2, 5, 4, 1, 5};
			int solucion = -2;
			do_check(arr1,arr2,solucion);
		}

		{
			int[] arr1 = {4, 4, 4, 3, 4};
			int[] arr2 = {1, 2, 4, 2, 1};
			int solucion = -1;
			do_check(arr1,arr2,solucion);
		}

		{
			int[] arr1 = {4, 4, 4, 3, 4};
			int[] arr2 = {5, 2, 5, 5, 3, 4};
			int solucion = -2;
			do_check(arr1,arr2,solucion);
		}

		{
			int[] arr1 = {4, 4, 4, 3, 4};
			int[] arr2 = {5, 3, 1, 4, 4, 2};
			int solucion = -3;
			do_check(arr1,arr2,solucion);
		}

		{
			int[] arr1 = {4, 4, 4, 3, 4};
			int[] arr2 = {2, 3, 5, 5, 1, 3};
			int solucion = -2;
			do_check(arr1,arr2,solucion);
		}

		{
			int[] arr1 = {4, 4, 4, 3, 4};
			int[] arr2 = {2, 4, 3, 2, 2, 4};
			int solucion = -1;
			do_check(arr1,arr2,solucion);
		}

		{
			int[] arr1 = {4, 4, 4, 3, 4};
			int[] arr2 = {1, 4, 2, 2, 3, 3};
			int solucion = -2;
			do_check(arr1,arr2,solucion);
		}

		{
			int[] arr1 = {4, 4, 4, 3, 4};
			int[] arr2 = {5, 1, 3, 1, 3, 5};
			int solucion = -1;
			do_check(arr1,arr2,solucion);
		}

		{
			int[] arr1 = {4, 4, 4, 3, 4};
			int[] arr2 = {1, 3, 3, 4, 3, 4};
			int solucion = -1;
			do_check(arr1,arr2,solucion);
		}

		{
			int[] arr1 = {4, 4, 4, 3, 4};
			int[] arr2 = {3, 5, 4, 4, 2, 4, 1};
			int solucion = -3;
			do_check(arr1,arr2,solucion);
		}

		{
			int[] arr1 = {4, 4, 4, 3, 4};
			int[] arr2 = {1, 3, 3, 4, 1, 1, 5};
			int solucion = -2;
			do_check(arr1,arr2,solucion);
		}

		{
			int[] arr1 = {4, 4, 4, 3, 4};
			int[] arr2 = {3, 5, 1, 5, 4, 5, 3};
			int solucion = -2;
			do_check(arr1,arr2,solucion);
		}

		{
			int[] arr1 = {5, 4, 3, 5, 4};
			int[] arr2 = {1};
			int solucion = 2;
			do_check(arr1,arr2,solucion);
		}

		{
			int[] arr1 = {5, 4, 3, 5, 4};
			int[] arr2 = {5};
			int solucion = 2;
			do_check(arr1,arr2,solucion);
		}

		{
			int[] arr1 = {5, 4, 3, 5, 4};
			int[] arr2 = {3};
			int solucion = 2;
			do_check(arr1,arr2,solucion);
		}

		{
			int[] arr1 = {5, 4, 3, 5, 4};
			int[] arr2 = {4};
			int solucion = 2;
			do_check(arr1,arr2,solucion);
		}

		{
			int[] arr1 = {5, 4, 3, 5, 4};
			int[] arr2 = {2};
			int solucion = 2;
			do_check(arr1,arr2,solucion);
		}

		{
			int[] arr1 = {5, 4, 3, 5, 4};
			int[] arr2 = {3, 4};
			int solucion = 1;
			do_check(arr1,arr2,solucion);
		}

		{
			int[] arr1 = {5, 4, 3, 5, 4};
			int[] arr2 = {4};
			int solucion = 2;
			do_check(arr1,arr2,solucion);
		}

		{
			int[] arr1 = {5, 4, 3, 5, 4};
			int[] arr2 = {4, 5};
			int solucion = 1;
			do_check(arr1,arr2,solucion);
		}

		{
			int[] arr1 = {5, 4, 3, 5, 4};
			int[] arr2 = {1, 4};
			int solucion = 1;
			do_check(arr1,arr2,solucion);
		}

		{
			int[] arr1 = {5, 4, 3, 5, 4};
			int[] arr2 = {2, 3};
			int solucion = 1;
			do_check(arr1,arr2,solucion);
		}

		{
			int[] arr1 = {5, 4, 3, 5, 4};
			int[] arr2 = {5, 3, 3};
			int solucion = 1;
			do_check(arr1,arr2,solucion);
		}

		{
			int[] arr1 = {5, 4, 3, 5, 4};
			int[] arr2 = {3, 2, 5};
			int solucion = 0;
			do_check(arr1,arr2,solucion);
		}

		{
			int[] arr1 = {5, 4, 3, 5, 4};
			int[] arr2 = {4, 1, 2};
			int solucion = 0;
			do_check(arr1,arr2,solucion);
		}

		{
			int[] arr1 = {5, 4, 3, 5, 4};
			int[] arr2 = {5, 2, 3};
			int solucion = 0;
			do_check(arr1,arr2,solucion);
		}

		{
			int[] arr1 = {5, 4, 3, 5, 4};
			int[] arr2 = {1, 5, 2};
			int solucion = 0;
			do_check(arr1,arr2,solucion);
		}

		{
			int[] arr1 = {5, 4, 3, 5, 4};
			int[] arr2 = {2, 1, 1, 5};
			int solucion = 0;
			do_check(arr1,arr2,solucion);
		}

		{
			int[] arr1 = {5, 4, 3, 5, 4};
			int[] arr2 = {4, 2, 5, 4};
			int solucion = 0;
			do_check(arr1,arr2,solucion);
		}

		{
			int[] arr1 = {5, 4, 3, 5, 4};
			int[] arr2 = {3, 4, 3, 2};
			int solucion = 0;
			do_check(arr1,arr2,solucion);
		}

		{
			int[] arr1 = {5, 4, 3, 5, 4};
			int[] arr2 = {1, 3, 1, 3};
			int solucion = 1;
			do_check(arr1,arr2,solucion);
		}

		{
			int[] arr1 = {5, 4, 3, 5, 4};
			int[] arr2 = {2, 1, 4, 3};
			int solucion = -1;
			do_check(arr1,arr2,solucion);
		}

		{
			int[] arr1 = {5, 4, 3, 5, 4};
			int[] arr2 = {4, 5, 2};
			int solucion = 0;
			do_check(arr1,arr2,solucion);
		}

		{
			int[] arr1 = {5, 4, 3, 5, 4};
			int[] arr2 = {4, 5, 4, 2, 5};
			int solucion = 0;
			do_check(arr1,arr2,solucion);
		}

		{
			int[] arr1 = {5, 4, 3, 5, 4};
			int[] arr2 = {5, 2, 4, 3, 5};
			int solucion = -1;
			do_check(arr1,arr2,solucion);
		}

		{
			int[] arr1 = {5, 4, 3, 5, 4};
			int[] arr2 = {2, 5, 4, 1, 5};
			int solucion = -1;
			do_check(arr1,arr2,solucion);
		}

		{
			int[] arr1 = {5, 4, 3, 5, 4};
			int[] arr2 = {1, 2, 4, 2, 1};
			int solucion = 0;
			do_check(arr1,arr2,solucion);
		}

		{
			int[] arr1 = {5, 4, 3, 5, 4};
			int[] arr2 = {5, 2, 5, 5, 3, 4};
			int solucion = -1;
			do_check(arr1,arr2,solucion);
		}

		{
			int[] arr1 = {5, 4, 3, 5, 4};
			int[] arr2 = {5, 3, 1, 4, 4, 2};
			int solucion = -2;
			do_check(arr1,arr2,solucion);
		}

		{
			int[] arr1 = {5, 4, 3, 5, 4};
			int[] arr2 = {2, 3, 5, 5, 1, 3};
			int solucion = -1;
			do_check(arr1,arr2,solucion);
		}

		{
			int[] arr1 = {5, 4, 3, 5, 4};
			int[] arr2 = {2, 4, 3, 2, 2, 4};
			int solucion = 0;
			do_check(arr1,arr2,solucion);
		}

		{
			int[] arr1 = {5, 4, 3, 5, 4};
			int[] arr2 = {1, 4, 2, 2, 3, 3};
			int solucion = -1;
			do_check(arr1,arr2,solucion);
		}

		{
			int[] arr1 = {5, 4, 3, 5, 4};
			int[] arr2 = {5, 1, 3, 1, 3, 5};
			int solucion = 0;
			do_check(arr1,arr2,solucion);
		}

		{
			int[] arr1 = {5, 4, 3, 5, 4};
			int[] arr2 = {1, 3, 3, 4, 3, 4};
			int solucion = 0;
			do_check(arr1,arr2,solucion);
		}

		{
			int[] arr1 = {5, 4, 3, 5, 4};
			int[] arr2 = {3, 5, 4, 4, 2, 4, 1};
			int solucion = -2;
			do_check(arr1,arr2,solucion);
		}

		{
			int[] arr1 = {5, 4, 3, 5, 4};
			int[] arr2 = {1, 3, 3, 4, 1, 1, 5};
			int solucion = -1;
			do_check(arr1,arr2,solucion);
		}

		{
			int[] arr1 = {5, 4, 3, 5, 4};
			int[] arr2 = {3, 5, 1, 5, 4, 5, 3};
			int solucion = -1;
			do_check(arr1,arr2,solucion);
		}

		{
			int[] arr1 = {3, 5, 3, 1, 5};
			int[] arr2 = {1};
			int solucion = 2;
			do_check(arr1,arr2,solucion);
		}

		{
			int[] arr1 = {3, 5, 3, 1, 5};
			int[] arr2 = {5};
			int solucion = 2;
			do_check(arr1,arr2,solucion);
		}

		{
			int[] arr1 = {3, 5, 3, 1, 5};
			int[] arr2 = {3};
			int solucion = 2;
			do_check(arr1,arr2,solucion);
		}

		{
			int[] arr1 = {3, 5, 3, 1, 5};
			int[] arr2 = {4};
			int solucion = 2;
			do_check(arr1,arr2,solucion);
		}

		{
			int[] arr1 = {3, 5, 3, 1, 5};
			int[] arr2 = {2};
			int solucion = 2;
			do_check(arr1,arr2,solucion);
		}

		{
			int[] arr1 = {3, 5, 3, 1, 5};
			int[] arr2 = {3, 4};
			int solucion = 1;
			do_check(arr1,arr2,solucion);
		}

		{
			int[] arr1 = {3, 5, 3, 1, 5};
			int[] arr2 = {4};
			int solucion = 2;
			do_check(arr1,arr2,solucion);
		}

		{
			int[] arr1 = {3, 5, 3, 1, 5};
			int[] arr2 = {4, 5};
			int solucion = 1;
			do_check(arr1,arr2,solucion);
		}

		{
			int[] arr1 = {3, 5, 3, 1, 5};
			int[] arr2 = {1, 4};
			int solucion = 1;
			do_check(arr1,arr2,solucion);
		}

		{
			int[] arr1 = {3, 5, 3, 1, 5};
			int[] arr2 = {2, 3};
			int solucion = 1;
			do_check(arr1,arr2,solucion);
		}

		{
			int[] arr1 = {3, 5, 3, 1, 5};
			int[] arr2 = {5, 3, 3};
			int solucion = 1;
			do_check(arr1,arr2,solucion);
		}

		{
			int[] arr1 = {3, 5, 3, 1, 5};
			int[] arr2 = {3, 2, 5};
			int solucion = 0;
			do_check(arr1,arr2,solucion);
		}

		{
			int[] arr1 = {3, 5, 3, 1, 5};
			int[] arr2 = {4, 1, 2};
			int solucion = 0;
			do_check(arr1,arr2,solucion);
		}

		{
			int[] arr1 = {3, 5, 3, 1, 5};
			int[] arr2 = {5, 2, 3};
			int solucion = 0;
			do_check(arr1,arr2,solucion);
		}

		{
			int[] arr1 = {3, 5, 3, 1, 5};
			int[] arr2 = {1, 5, 2};
			int solucion = 0;
			do_check(arr1,arr2,solucion);
		}

		{
			int[] arr1 = {3, 5, 3, 1, 5};
			int[] arr2 = {2, 1, 1, 5};
			int solucion = 0;
			do_check(arr1,arr2,solucion);
		}

		{
			int[] arr1 = {3, 5, 3, 1, 5};
			int[] arr2 = {4, 2, 5, 4};
			int solucion = 0;
			do_check(arr1,arr2,solucion);
		}

		{
			int[] arr1 = {3, 5, 3, 1, 5};
			int[] arr2 = {3, 4, 3, 2};
			int solucion = 0;
			do_check(arr1,arr2,solucion);
		}

		{
			int[] arr1 = {3, 5, 3, 1, 5};
			int[] arr2 = {1, 3, 1, 3};
			int solucion = 1;
			do_check(arr1,arr2,solucion);
		}

		{
			int[] arr1 = {3, 5, 3, 1, 5};
			int[] arr2 = {2, 1, 4, 3};
			int solucion = -1;
			do_check(arr1,arr2,solucion);
		}

		{
			int[] arr1 = {3, 5, 3, 1, 5};
			int[] arr2 = {4, 5, 2};
			int solucion = 0;
			do_check(arr1,arr2,solucion);
		}

		{
			int[] arr1 = {3, 5, 3, 1, 5};
			int[] arr2 = {4, 5, 4, 2, 5};
			int solucion = 0;
			do_check(arr1,arr2,solucion);
		}

		{
			int[] arr1 = {3, 5, 3, 1, 5};
			int[] arr2 = {5, 2, 4, 3, 5};
			int solucion = -1;
			do_check(arr1,arr2,solucion);
		}

		{
			int[] arr1 = {3, 5, 3, 1, 5};
			int[] arr2 = {2, 5, 4, 1, 5};
			int solucion = -1;
			do_check(arr1,arr2,solucion);
		}

		{
			int[] arr1 = {3, 5, 3, 1, 5};
			int[] arr2 = {1, 2, 4, 2, 1};
			int solucion = 0;
			do_check(arr1,arr2,solucion);
		}

		{
			int[] arr1 = {3, 5, 3, 1, 5};
			int[] arr2 = {5, 2, 5, 5, 3, 4};
			int solucion = -1;
			do_check(arr1,arr2,solucion);
		}

		{
			int[] arr1 = {3, 5, 3, 1, 5};
			int[] arr2 = {5, 3, 1, 4, 4, 2};
			int solucion = -2;
			do_check(arr1,arr2,solucion);
		}

		{
			int[] arr1 = {3, 5, 3, 1, 5};
			int[] arr2 = {2, 3, 5, 5, 1, 3};
			int solucion = -1;
			do_check(arr1,arr2,solucion);
		}

		{
			int[] arr1 = {3, 5, 3, 1, 5};
			int[] arr2 = {2, 4, 3, 2, 2, 4};
			int solucion = 0;
			do_check(arr1,arr2,solucion);
		}

		{
			int[] arr1 = {3, 5, 3, 1, 5};
			int[] arr2 = {1, 4, 2, 2, 3, 3};
			int solucion = -1;
			do_check(arr1,arr2,solucion);
		}

		{
			int[] arr1 = {3, 5, 3, 1, 5};
			int[] arr2 = {5, 1, 3, 1, 3, 5};
			int solucion = 0;
			do_check(arr1,arr2,solucion);
		}

		{
			int[] arr1 = {3, 5, 3, 1, 5};
			int[] arr2 = {1, 3, 3, 4, 3, 4};
			int solucion = 0;
			do_check(arr1,arr2,solucion);
		}

		{
			int[] arr1 = {3, 5, 3, 1, 5};
			int[] arr2 = {3, 5, 4, 4, 2, 4, 1};
			int solucion = -2;
			do_check(arr1,arr2,solucion);
		}

		{
			int[] arr1 = {3, 5, 3, 1, 5};
			int[] arr2 = {1, 3, 3, 4, 1, 1, 5};
			int solucion = -1;
			do_check(arr1,arr2,solucion);
		}

		{
			int[] arr1 = {3, 5, 3, 1, 5};
			int[] arr2 = {3, 5, 1, 5, 4, 5, 3};
			int solucion = -1;
			do_check(arr1,arr2,solucion);
		}

		{
			int[] arr1 = {3, 2, 4, 1, 1};
			int[] arr2 = {1};
			int solucion = 3;
			do_check(arr1,arr2,solucion);
		}

		{
			int[] arr1 = {3, 2, 4, 1, 1};
			int[] arr2 = {5};
			int solucion = 3;
			do_check(arr1,arr2,solucion);
		}

		{
			int[] arr1 = {3, 2, 4, 1, 1};
			int[] arr2 = {3};
			int solucion = 3;
			do_check(arr1,arr2,solucion);
		}

		{
			int[] arr1 = {3, 2, 4, 1, 1};
			int[] arr2 = {4};
			int solucion = 3;
			do_check(arr1,arr2,solucion);
		}

		{
			int[] arr1 = {3, 2, 4, 1, 1};
			int[] arr2 = {2};
			int solucion = 3;
			do_check(arr1,arr2,solucion);
		}

		{
			int[] arr1 = {3, 2, 4, 1, 1};
			int[] arr2 = {3, 4};
			int solucion = 2;
			do_check(arr1,arr2,solucion);
		}

		{
			int[] arr1 = {3, 2, 4, 1, 1};
			int[] arr2 = {4};
			int solucion = 3;
			do_check(arr1,arr2,solucion);
		}

		{
			int[] arr1 = {3, 2, 4, 1, 1};
			int[] arr2 = {4, 5};
			int solucion = 2;
			do_check(arr1,arr2,solucion);
		}

		{
			int[] arr1 = {3, 2, 4, 1, 1};
			int[] arr2 = {1, 4};
			int solucion = 2;
			do_check(arr1,arr2,solucion);
		}

		{
			int[] arr1 = {3, 2, 4, 1, 1};
			int[] arr2 = {2, 3};
			int solucion = 2;
			do_check(arr1,arr2,solucion);
		}

		{
			int[] arr1 = {3, 2, 4, 1, 1};
			int[] arr2 = {5, 3, 3};
			int solucion = 2;
			do_check(arr1,arr2,solucion);
		}

		{
			int[] arr1 = {3, 2, 4, 1, 1};
			int[] arr2 = {3, 2, 5};
			int solucion = 1;
			do_check(arr1,arr2,solucion);
		}

		{
			int[] arr1 = {3, 2, 4, 1, 1};
			int[] arr2 = {4, 1, 2};
			int solucion = 1;
			do_check(arr1,arr2,solucion);
		}

		{
			int[] arr1 = {3, 2, 4, 1, 1};
			int[] arr2 = {5, 2, 3};
			int solucion = 1;
			do_check(arr1,arr2,solucion);
		}

		{
			int[] arr1 = {3, 2, 4, 1, 1};
			int[] arr2 = {1, 5, 2};
			int solucion = 1;
			do_check(arr1,arr2,solucion);
		}

		{
			int[] arr1 = {3, 2, 4, 1, 1};
			int[] arr2 = {2, 1, 1, 5};
			int solucion = 1;
			do_check(arr1,arr2,solucion);
		}

		{
			int[] arr1 = {3, 2, 4, 1, 1};
			int[] arr2 = {4, 2, 5, 4};
			int solucion = 1;
			do_check(arr1,arr2,solucion);
		}

		{
			int[] arr1 = {3, 2, 4, 1, 1};
			int[] arr2 = {3, 4, 3, 2};
			int solucion = 1;
			do_check(arr1,arr2,solucion);
		}

		{
			int[] arr1 = {3, 2, 4, 1, 1};
			int[] arr2 = {1, 3, 1, 3};
			int solucion = 2;
			do_check(arr1,arr2,solucion);
		}

		{
			int[] arr1 = {3, 2, 4, 1, 1};
			int[] arr2 = {2, 1, 4, 3};
			int solucion = 0;
			do_check(arr1,arr2,solucion);
		}

		{
			int[] arr1 = {3, 2, 4, 1, 1};
			int[] arr2 = {4, 5, 2};
			int solucion = 1;
			do_check(arr1,arr2,solucion);
		}

		{
			int[] arr1 = {3, 2, 4, 1, 1};
			int[] arr2 = {4, 5, 4, 2, 5};
			int solucion = 1;
			do_check(arr1,arr2,solucion);
		}

		{
			int[] arr1 = {3, 2, 4, 1, 1};
			int[] arr2 = {5, 2, 4, 3, 5};
			int solucion = 0;
			do_check(arr1,arr2,solucion);
		}

		{
			int[] arr1 = {3, 2, 4, 1, 1};
			int[] arr2 = {2, 5, 4, 1, 5};
			int solucion = 0;
			do_check(arr1,arr2,solucion);
		}

		{
			int[] arr1 = {3, 2, 4, 1, 1};
			int[] arr2 = {1, 2, 4, 2, 1};
			int solucion = 1;
			do_check(arr1,arr2,solucion);
		}

		{
			int[] arr1 = {3, 2, 4, 1, 1};
			int[] arr2 = {5, 2, 5, 5, 3, 4};
			int solucion = 0;
			do_check(arr1,arr2,solucion);
		}

		{
			int[] arr1 = {3, 2, 4, 1, 1};
			int[] arr2 = {5, 3, 1, 4, 4, 2};
			int solucion = -1;
			do_check(arr1,arr2,solucion);
		}

		{
			int[] arr1 = {3, 2, 4, 1, 1};
			int[] arr2 = {2, 3, 5, 5, 1, 3};
			int solucion = 0;
			do_check(arr1,arr2,solucion);
		}

		{
			int[] arr1 = {3, 2, 4, 1, 1};
			int[] arr2 = {2, 4, 3, 2, 2, 4};
			int solucion = 1;
			do_check(arr1,arr2,solucion);
		}

		{
			int[] arr1 = {3, 2, 4, 1, 1};
			int[] arr2 = {1, 4, 2, 2, 3, 3};
			int solucion = 0;
			do_check(arr1,arr2,solucion);
		}

		{
			int[] arr1 = {3, 2, 4, 1, 1};
			int[] arr2 = {5, 1, 3, 1, 3, 5};
			int solucion = 1;
			do_check(arr1,arr2,solucion);
		}

		{
			int[] arr1 = {3, 2, 4, 1, 1};
			int[] arr2 = {1, 3, 3, 4, 3, 4};
			int solucion = 1;
			do_check(arr1,arr2,solucion);
		}

		{
			int[] arr1 = {3, 2, 4, 1, 1};
			int[] arr2 = {3, 5, 4, 4, 2, 4, 1};
			int solucion = -1;
			do_check(arr1,arr2,solucion);
		}

		{
			int[] arr1 = {3, 2, 4, 1, 1};
			int[] arr2 = {1, 3, 3, 4, 1, 1, 5};
			int solucion = 0;
			do_check(arr1,arr2,solucion);
		}

		{
			int[] arr1 = {3, 2, 4, 1, 1};
			int[] arr2 = {3, 5, 1, 5, 4, 5, 3};
			int solucion = 0;
			do_check(arr1,arr2,solucion);
		}

		{
			int[] arr1 = {5, 2, 2, 2, 2, 1};
			int[] arr2 = {1};
			int solucion = 2;
			do_check(arr1,arr2,solucion);
		}

		{
			int[] arr1 = {5, 2, 2, 2, 2, 1};
			int[] arr2 = {5};
			int solucion = 2;
			do_check(arr1,arr2,solucion);
		}

		{
			int[] arr1 = {5, 2, 2, 2, 2, 1};
			int[] arr2 = {3};
			int solucion = 2;
			do_check(arr1,arr2,solucion);
		}

		{
			int[] arr1 = {5, 2, 2, 2, 2, 1};
			int[] arr2 = {4};
			int solucion = 2;
			do_check(arr1,arr2,solucion);
		}

		{
			int[] arr1 = {5, 2, 2, 2, 2, 1};
			int[] arr2 = {2};
			int solucion = 2;
			do_check(arr1,arr2,solucion);
		}

		{
			int[] arr1 = {5, 2, 2, 2, 2, 1};
			int[] arr2 = {3, 4};
			int solucion = 1;
			do_check(arr1,arr2,solucion);
		}

		{
			int[] arr1 = {5, 2, 2, 2, 2, 1};
			int[] arr2 = {4};
			int solucion = 2;
			do_check(arr1,arr2,solucion);
		}

		{
			int[] arr1 = {5, 2, 2, 2, 2, 1};
			int[] arr2 = {4, 5};
			int solucion = 1;
			do_check(arr1,arr2,solucion);
		}

		{
			int[] arr1 = {5, 2, 2, 2, 2, 1};
			int[] arr2 = {1, 4};
			int solucion = 1;
			do_check(arr1,arr2,solucion);
		}

		{
			int[] arr1 = {5, 2, 2, 2, 2, 1};
			int[] arr2 = {2, 3};
			int solucion = 1;
			do_check(arr1,arr2,solucion);
		}

		{
			int[] arr1 = {5, 2, 2, 2, 2, 1};
			int[] arr2 = {5, 3, 3};
			int solucion = 1;
			do_check(arr1,arr2,solucion);
		}

		{
			int[] arr1 = {5, 2, 2, 2, 2, 1};
			int[] arr2 = {3, 2, 5};
			int solucion = 0;
			do_check(arr1,arr2,solucion);
		}

		{
			int[] arr1 = {5, 2, 2, 2, 2, 1};
			int[] arr2 = {4, 1, 2};
			int solucion = 0;
			do_check(arr1,arr2,solucion);
		}

		{
			int[] arr1 = {5, 2, 2, 2, 2, 1};
			int[] arr2 = {5, 2, 3};
			int solucion = 0;
			do_check(arr1,arr2,solucion);
		}

		{
			int[] arr1 = {5, 2, 2, 2, 2, 1};
			int[] arr2 = {1, 5, 2};
			int solucion = 0;
			do_check(arr1,arr2,solucion);
		}

		{
			int[] arr1 = {5, 2, 2, 2, 2, 1};
			int[] arr2 = {2, 1, 1, 5};
			int solucion = 0;
			do_check(arr1,arr2,solucion);
		}

		{
			int[] arr1 = {5, 2, 2, 2, 2, 1};
			int[] arr2 = {4, 2, 5, 4};
			int solucion = 0;
			do_check(arr1,arr2,solucion);
		}

		{
			int[] arr1 = {5, 2, 2, 2, 2, 1};
			int[] arr2 = {3, 4, 3, 2};
			int solucion = 0;
			do_check(arr1,arr2,solucion);
		}

		{
			int[] arr1 = {5, 2, 2, 2, 2, 1};
			int[] arr2 = {1, 3, 1, 3};
			int solucion = 1;
			do_check(arr1,arr2,solucion);
		}

		{
			int[] arr1 = {5, 2, 2, 2, 2, 1};
			int[] arr2 = {2, 1, 4, 3};
			int solucion = -1;
			do_check(arr1,arr2,solucion);
		}

		{
			int[] arr1 = {5, 2, 2, 2, 2, 1};
			int[] arr2 = {4, 5, 2};
			int solucion = 0;
			do_check(arr1,arr2,solucion);
		}

		{
			int[] arr1 = {5, 2, 2, 2, 2, 1};
			int[] arr2 = {4, 5, 4, 2, 5};
			int solucion = 0;
			do_check(arr1,arr2,solucion);
		}

		{
			int[] arr1 = {5, 2, 2, 2, 2, 1};
			int[] arr2 = {5, 2, 4, 3, 5};
			int solucion = -1;
			do_check(arr1,arr2,solucion);
		}

		{
			int[] arr1 = {5, 2, 2, 2, 2, 1};
			int[] arr2 = {2, 5, 4, 1, 5};
			int solucion = -1;
			do_check(arr1,arr2,solucion);
		}

		{
			int[] arr1 = {5, 2, 2, 2, 2, 1};
			int[] arr2 = {1, 2, 4, 2, 1};
			int solucion = 0;
			do_check(arr1,arr2,solucion);
		}

		{
			int[] arr1 = {5, 2, 2, 2, 2, 1};
			int[] arr2 = {5, 2, 5, 5, 3, 4};
			int solucion = -1;
			do_check(arr1,arr2,solucion);
		}

		{
			int[] arr1 = {5, 2, 2, 2, 2, 1};
			int[] arr2 = {5, 3, 1, 4, 4, 2};
			int solucion = -2;
			do_check(arr1,arr2,solucion);
		}

		{
			int[] arr1 = {5, 2, 2, 2, 2, 1};
			int[] arr2 = {2, 3, 5, 5, 1, 3};
			int solucion = -1;
			do_check(arr1,arr2,solucion);
		}

		{
			int[] arr1 = {5, 2, 2, 2, 2, 1};
			int[] arr2 = {2, 4, 3, 2, 2, 4};
			int solucion = 0;
			do_check(arr1,arr2,solucion);
		}

		{
			int[] arr1 = {5, 2, 2, 2, 2, 1};
			int[] arr2 = {1, 4, 2, 2, 3, 3};
			int solucion = -1;
			do_check(arr1,arr2,solucion);
		}

		{
			int[] arr1 = {5, 2, 2, 2, 2, 1};
			int[] arr2 = {5, 1, 3, 1, 3, 5};
			int solucion = 0;
			do_check(arr1,arr2,solucion);
		}

		{
			int[] arr1 = {5, 2, 2, 2, 2, 1};
			int[] arr2 = {1, 3, 3, 4, 3, 4};
			int solucion = 0;
			do_check(arr1,arr2,solucion);
		}

		{
			int[] arr1 = {5, 2, 2, 2, 2, 1};
			int[] arr2 = {3, 5, 4, 4, 2, 4, 1};
			int solucion = -2;
			do_check(arr1,arr2,solucion);
		}

		{
			int[] arr1 = {5, 2, 2, 2, 2, 1};
			int[] arr2 = {1, 3, 3, 4, 1, 1, 5};
			int solucion = -1;
			do_check(arr1,arr2,solucion);
		}

		{
			int[] arr1 = {5, 2, 2, 2, 2, 1};
			int[] arr2 = {3, 5, 1, 5, 4, 5, 3};
			int solucion = -1;
			do_check(arr1,arr2,solucion);
		}

		{
			int[] arr1 = {5, 5, 5, 3};
			int[] arr2 = {1};
			int solucion = 1;
			do_check(arr1,arr2,solucion);
		}

		{
			int[] arr1 = {5, 5, 5, 3};
			int[] arr2 = {5};
			int solucion = 1;
			do_check(arr1,arr2,solucion);
		}

		{
			int[] arr1 = {5, 5, 5, 3};
			int[] arr2 = {3};
			int solucion = 1;
			do_check(arr1,arr2,solucion);
		}

		{
			int[] arr1 = {5, 5, 5, 3};
			int[] arr2 = {4};
			int solucion = 1;
			do_check(arr1,arr2,solucion);
		}

		{
			int[] arr1 = {5, 5, 5, 3};
			int[] arr2 = {2};
			int solucion = 1;
			do_check(arr1,arr2,solucion);
		}

		{
			int[] arr1 = {5, 5, 5, 3};
			int[] arr2 = {3, 4};
			int solucion = 0;
			do_check(arr1,arr2,solucion);
		}

		{
			int[] arr1 = {5, 5, 5, 3};
			int[] arr2 = {4};
			int solucion = 1;
			do_check(arr1,arr2,solucion);
		}

		{
			int[] arr1 = {5, 5, 5, 3};
			int[] arr2 = {4, 5};
			int solucion = 0;
			do_check(arr1,arr2,solucion);
		}

		{
			int[] arr1 = {5, 5, 5, 3};
			int[] arr2 = {1, 4};
			int solucion = 0;
			do_check(arr1,arr2,solucion);
		}

		{
			int[] arr1 = {5, 5, 5, 3};
			int[] arr2 = {2, 3};
			int solucion = 0;
			do_check(arr1,arr2,solucion);
		}

		{
			int[] arr1 = {5, 5, 5, 3};
			int[] arr2 = {5, 3, 3};
			int solucion = 0;
			do_check(arr1,arr2,solucion);
		}

		{
			int[] arr1 = {5, 5, 5, 3};
			int[] arr2 = {3, 2, 5};
			int solucion = -1;
			do_check(arr1,arr2,solucion);
		}

		{
			int[] arr1 = {5, 5, 5, 3};
			int[] arr2 = {4, 1, 2};
			int solucion = -1;
			do_check(arr1,arr2,solucion);
		}

		{
			int[] arr1 = {5, 5, 5, 3};
			int[] arr2 = {5, 2, 3};
			int solucion = -1;
			do_check(arr1,arr2,solucion);
		}

		{
			int[] arr1 = {5, 5, 5, 3};
			int[] arr2 = {1, 5, 2};
			int solucion = -1;
			do_check(arr1,arr2,solucion);
		}

		{
			int[] arr1 = {5, 5, 5, 3};
			int[] arr2 = {2, 1, 1, 5};
			int solucion = -1;
			do_check(arr1,arr2,solucion);
		}

		{
			int[] arr1 = {5, 5, 5, 3};
			int[] arr2 = {4, 2, 5, 4};
			int solucion = -1;
			do_check(arr1,arr2,solucion);
		}

		{
			int[] arr1 = {5, 5, 5, 3};
			int[] arr2 = {3, 4, 3, 2};
			int solucion = -1;
			do_check(arr1,arr2,solucion);
		}

		{
			int[] arr1 = {5, 5, 5, 3};
			int[] arr2 = {1, 3, 1, 3};
			int solucion = 0;
			do_check(arr1,arr2,solucion);
		}

		{
			int[] arr1 = {5, 5, 5, 3};
			int[] arr2 = {2, 1, 4, 3};
			int solucion = -2;
			do_check(arr1,arr2,solucion);
		}

		{
			int[] arr1 = {5, 5, 5, 3};
			int[] arr2 = {4, 5, 2};
			int solucion = -1;
			do_check(arr1,arr2,solucion);
		}

		{
			int[] arr1 = {5, 5, 5, 3};
			int[] arr2 = {4, 5, 4, 2, 5};
			int solucion = -1;
			do_check(arr1,arr2,solucion);
		}

		{
			int[] arr1 = {5, 5, 5, 3};
			int[] arr2 = {5, 2, 4, 3, 5};
			int solucion = -2;
			do_check(arr1,arr2,solucion);
		}

		{
			int[] arr1 = {5, 5, 5, 3};
			int[] arr2 = {2, 5, 4, 1, 5};
			int solucion = -2;
			do_check(arr1,arr2,solucion);
		}

		{
			int[] arr1 = {5, 5, 5, 3};
			int[] arr2 = {1, 2, 4, 2, 1};
			int solucion = -1;
			do_check(arr1,arr2,solucion);
		}

		{
			int[] arr1 = {5, 5, 5, 3};
			int[] arr2 = {5, 2, 5, 5, 3, 4};
			int solucion = -2;
			do_check(arr1,arr2,solucion);
		}

		{
			int[] arr1 = {5, 5, 5, 3};
			int[] arr2 = {5, 3, 1, 4, 4, 2};
			int solucion = -3;
			do_check(arr1,arr2,solucion);
		}

		{
			int[] arr1 = {5, 5, 5, 3};
			int[] arr2 = {2, 3, 5, 5, 1, 3};
			int solucion = -2;
			do_check(arr1,arr2,solucion);
		}

		{
			int[] arr1 = {5, 5, 5, 3};
			int[] arr2 = {2, 4, 3, 2, 2, 4};
			int solucion = -1;
			do_check(arr1,arr2,solucion);
		}

		{
			int[] arr1 = {5, 5, 5, 3};
			int[] arr2 = {1, 4, 2, 2, 3, 3};
			int solucion = -2;
			do_check(arr1,arr2,solucion);
		}

		{
			int[] arr1 = {5, 5, 5, 3};
			int[] arr2 = {5, 1, 3, 1, 3, 5};
			int solucion = -1;
			do_check(arr1,arr2,solucion);
		}

		{
			int[] arr1 = {5, 5, 5, 3};
			int[] arr2 = {1, 3, 3, 4, 3, 4};
			int solucion = -1;
			do_check(arr1,arr2,solucion);
		}

		{
			int[] arr1 = {5, 5, 5, 3};
			int[] arr2 = {3, 5, 4, 4, 2, 4, 1};
			int solucion = -3;
			do_check(arr1,arr2,solucion);
		}

		{
			int[] arr1 = {5, 5, 5, 3};
			int[] arr2 = {1, 3, 3, 4, 1, 1, 5};
			int solucion = -2;
			do_check(arr1,arr2,solucion);
		}

		{
			int[] arr1 = {5, 5, 5, 3};
			int[] arr2 = {3, 5, 1, 5, 4, 5, 3};
			int solucion = -2;
			do_check(arr1,arr2,solucion);
		}

		{
			int[] arr1 = {4, 4, 4, 1, 4, 4};
			int[] arr2 = {1};
			int solucion = 1;
			do_check(arr1,arr2,solucion);
		}

		{
			int[] arr1 = {4, 4, 4, 1, 4, 4};
			int[] arr2 = {5};
			int solucion = 1;
			do_check(arr1,arr2,solucion);
		}

		{
			int[] arr1 = {4, 4, 4, 1, 4, 4};
			int[] arr2 = {3};
			int solucion = 1;
			do_check(arr1,arr2,solucion);
		}

		{
			int[] arr1 = {4, 4, 4, 1, 4, 4};
			int[] arr2 = {4};
			int solucion = 1;
			do_check(arr1,arr2,solucion);
		}

		{
			int[] arr1 = {4, 4, 4, 1, 4, 4};
			int[] arr2 = {2};
			int solucion = 1;
			do_check(arr1,arr2,solucion);
		}

		{
			int[] arr1 = {4, 4, 4, 1, 4, 4};
			int[] arr2 = {3, 4};
			int solucion = 0;
			do_check(arr1,arr2,solucion);
		}

		{
			int[] arr1 = {4, 4, 4, 1, 4, 4};
			int[] arr2 = {4};
			int solucion = 1;
			do_check(arr1,arr2,solucion);
		}

		{
			int[] arr1 = {4, 4, 4, 1, 4, 4};
			int[] arr2 = {4, 5};
			int solucion = 0;
			do_check(arr1,arr2,solucion);
		}

		{
			int[] arr1 = {4, 4, 4, 1, 4, 4};
			int[] arr2 = {1, 4};
			int solucion = 0;
			do_check(arr1,arr2,solucion);
		}

		{
			int[] arr1 = {4, 4, 4, 1, 4, 4};
			int[] arr2 = {2, 3};
			int solucion = 0;
			do_check(arr1,arr2,solucion);
		}

		{
			int[] arr1 = {4, 4, 4, 1, 4, 4};
			int[] arr2 = {5, 3, 3};
			int solucion = 0;
			do_check(arr1,arr2,solucion);
		}

		{
			int[] arr1 = {4, 4, 4, 1, 4, 4};
			int[] arr2 = {3, 2, 5};
			int solucion = -1;
			do_check(arr1,arr2,solucion);
		}

		{
			int[] arr1 = {4, 4, 4, 1, 4, 4};
			int[] arr2 = {4, 1, 2};
			int solucion = -1;
			do_check(arr1,arr2,solucion);
		}

		{
			int[] arr1 = {4, 4, 4, 1, 4, 4};
			int[] arr2 = {5, 2, 3};
			int solucion = -1;
			do_check(arr1,arr2,solucion);
		}

		{
			int[] arr1 = {4, 4, 4, 1, 4, 4};
			int[] arr2 = {1, 5, 2};
			int solucion = -1;
			do_check(arr1,arr2,solucion);
		}

		{
			int[] arr1 = {4, 4, 4, 1, 4, 4};
			int[] arr2 = {2, 1, 1, 5};
			int solucion = -1;
			do_check(arr1,arr2,solucion);
		}

		{
			int[] arr1 = {4, 4, 4, 1, 4, 4};
			int[] arr2 = {4, 2, 5, 4};
			int solucion = -1;
			do_check(arr1,arr2,solucion);
		}

		{
			int[] arr1 = {4, 4, 4, 1, 4, 4};
			int[] arr2 = {3, 4, 3, 2};
			int solucion = -1;
			do_check(arr1,arr2,solucion);
		}

		{
			int[] arr1 = {4, 4, 4, 1, 4, 4};
			int[] arr2 = {1, 3, 1, 3};
			int solucion = 0;
			do_check(arr1,arr2,solucion);
		}

		{
			int[] arr1 = {4, 4, 4, 1, 4, 4};
			int[] arr2 = {2, 1, 4, 3};
			int solucion = -2;
			do_check(arr1,arr2,solucion);
		}

		{
			int[] arr1 = {4, 4, 4, 1, 4, 4};
			int[] arr2 = {4, 5, 2};
			int solucion = -1;
			do_check(arr1,arr2,solucion);
		}

		{
			int[] arr1 = {4, 4, 4, 1, 4, 4};
			int[] arr2 = {4, 5, 4, 2, 5};
			int solucion = -1;
			do_check(arr1,arr2,solucion);
		}

		{
			int[] arr1 = {4, 4, 4, 1, 4, 4};
			int[] arr2 = {5, 2, 4, 3, 5};
			int solucion = -2;
			do_check(arr1,arr2,solucion);
		}

		{
			int[] arr1 = {4, 4, 4, 1, 4, 4};
			int[] arr2 = {2, 5, 4, 1, 5};
			int solucion = -2;
			do_check(arr1,arr2,solucion);
		}

		{
			int[] arr1 = {4, 4, 4, 1, 4, 4};
			int[] arr2 = {1, 2, 4, 2, 1};
			int solucion = -1;
			do_check(arr1,arr2,solucion);
		}

		{
			int[] arr1 = {4, 4, 4, 1, 4, 4};
			int[] arr2 = {5, 2, 5, 5, 3, 4};
			int solucion = -2;
			do_check(arr1,arr2,solucion);
		}

		{
			int[] arr1 = {4, 4, 4, 1, 4, 4};
			int[] arr2 = {5, 3, 1, 4, 4, 2};
			int solucion = -3;
			do_check(arr1,arr2,solucion);
		}

		{
			int[] arr1 = {4, 4, 4, 1, 4, 4};
			int[] arr2 = {2, 3, 5, 5, 1, 3};
			int solucion = -2;
			do_check(arr1,arr2,solucion);
		}

		{
			int[] arr1 = {4, 4, 4, 1, 4, 4};
			int[] arr2 = {2, 4, 3, 2, 2, 4};
			int solucion = -1;
			do_check(arr1,arr2,solucion);
		}

		{
			int[] arr1 = {4, 4, 4, 1, 4, 4};
			int[] arr2 = {1, 4, 2, 2, 3, 3};
			int solucion = -2;
			do_check(arr1,arr2,solucion);
		}

		{
			int[] arr1 = {4, 4, 4, 1, 4, 4};
			int[] arr2 = {5, 1, 3, 1, 3, 5};
			int solucion = -1;
			do_check(arr1,arr2,solucion);
		}

		{
			int[] arr1 = {4, 4, 4, 1, 4, 4};
			int[] arr2 = {1, 3, 3, 4, 3, 4};
			int solucion = -1;
			do_check(arr1,arr2,solucion);
		}

		{
			int[] arr1 = {4, 4, 4, 1, 4, 4};
			int[] arr2 = {3, 5, 4, 4, 2, 4, 1};
			int solucion = -3;
			do_check(arr1,arr2,solucion);
		}

		{
			int[] arr1 = {4, 4, 4, 1, 4, 4};
			int[] arr2 = {1, 3, 3, 4, 1, 1, 5};
			int solucion = -2;
			do_check(arr1,arr2,solucion);
		}

		{
			int[] arr1 = {4, 4, 4, 1, 4, 4};
			int[] arr2 = {3, 5, 1, 5, 4, 5, 3};
			int solucion = -2;
			do_check(arr1,arr2,solucion);
		}

		{
			int[] arr1 = {2, 3, 4, 5, 5, 3};
			int[] arr2 = {1};
			int solucion = 3;
			do_check(arr1,arr2,solucion);
		}

		{
			int[] arr1 = {2, 3, 4, 5, 5, 3};
			int[] arr2 = {5};
			int solucion = 3;
			do_check(arr1,arr2,solucion);
		}

		{
			int[] arr1 = {2, 3, 4, 5, 5, 3};
			int[] arr2 = {3};
			int solucion = 3;
			do_check(arr1,arr2,solucion);
		}

		{
			int[] arr1 = {2, 3, 4, 5, 5, 3};
			int[] arr2 = {4};
			int solucion = 3;
			do_check(arr1,arr2,solucion);
		}

		{
			int[] arr1 = {2, 3, 4, 5, 5, 3};
			int[] arr2 = {2};
			int solucion = 3;
			do_check(arr1,arr2,solucion);
		}

		{
			int[] arr1 = {2, 3, 4, 5, 5, 3};
			int[] arr2 = {3, 4};
			int solucion = 2;
			do_check(arr1,arr2,solucion);
		}

		{
			int[] arr1 = {2, 3, 4, 5, 5, 3};
			int[] arr2 = {4};
			int solucion = 3;
			do_check(arr1,arr2,solucion);
		}

		{
			int[] arr1 = {2, 3, 4, 5, 5, 3};
			int[] arr2 = {4, 5};
			int solucion = 2;
			do_check(arr1,arr2,solucion);
		}

		{
			int[] arr1 = {2, 3, 4, 5, 5, 3};
			int[] arr2 = {1, 4};
			int solucion = 2;
			do_check(arr1,arr2,solucion);
		}

		{
			int[] arr1 = {2, 3, 4, 5, 5, 3};
			int[] arr2 = {2, 3};
			int solucion = 2;
			do_check(arr1,arr2,solucion);
		}

		{
			int[] arr1 = {2, 3, 4, 5, 5, 3};
			int[] arr2 = {5, 3, 3};
			int solucion = 2;
			do_check(arr1,arr2,solucion);
		}

		{
			int[] arr1 = {2, 3, 4, 5, 5, 3};
			int[] arr2 = {3, 2, 5};
			int solucion = 1;
			do_check(arr1,arr2,solucion);
		}

		{
			int[] arr1 = {2, 3, 4, 5, 5, 3};
			int[] arr2 = {4, 1, 2};
			int solucion = 1;
			do_check(arr1,arr2,solucion);
		}

		{
			int[] arr1 = {2, 3, 4, 5, 5, 3};
			int[] arr2 = {5, 2, 3};
			int solucion = 1;
			do_check(arr1,arr2,solucion);
		}

		{
			int[] arr1 = {2, 3, 4, 5, 5, 3};
			int[] arr2 = {1, 5, 2};
			int solucion = 1;
			do_check(arr1,arr2,solucion);
		}

		{
			int[] arr1 = {2, 3, 4, 5, 5, 3};
			int[] arr2 = {2, 1, 1, 5};
			int solucion = 1;
			do_check(arr1,arr2,solucion);
		}

		{
			int[] arr1 = {2, 3, 4, 5, 5, 3};
			int[] arr2 = {4, 2, 5, 4};
			int solucion = 1;
			do_check(arr1,arr2,solucion);
		}

		{
			int[] arr1 = {2, 3, 4, 5, 5, 3};
			int[] arr2 = {3, 4, 3, 2};
			int solucion = 1;
			do_check(arr1,arr2,solucion);
		}

		{
			int[] arr1 = {2, 3, 4, 5, 5, 3};
			int[] arr2 = {1, 3, 1, 3};
			int solucion = 2;
			do_check(arr1,arr2,solucion);
		}

		{
			int[] arr1 = {2, 3, 4, 5, 5, 3};
			int[] arr2 = {2, 1, 4, 3};
			int solucion = 0;
			do_check(arr1,arr2,solucion);
		}

		{
			int[] arr1 = {2, 3, 4, 5, 5, 3};
			int[] arr2 = {4, 5, 2};
			int solucion = 1;
			do_check(arr1,arr2,solucion);
		}

		{
			int[] arr1 = {2, 3, 4, 5, 5, 3};
			int[] arr2 = {4, 5, 4, 2, 5};
			int solucion = 1;
			do_check(arr1,arr2,solucion);
		}

		{
			int[] arr1 = {2, 3, 4, 5, 5, 3};
			int[] arr2 = {5, 2, 4, 3, 5};
			int solucion = 0;
			do_check(arr1,arr2,solucion);
		}

		{
			int[] arr1 = {2, 3, 4, 5, 5, 3};
			int[] arr2 = {2, 5, 4, 1, 5};
			int solucion = 0;
			do_check(arr1,arr2,solucion);
		}

		{
			int[] arr1 = {2, 3, 4, 5, 5, 3};
			int[] arr2 = {1, 2, 4, 2, 1};
			int solucion = 1;
			do_check(arr1,arr2,solucion);
		}

		{
			int[] arr1 = {2, 3, 4, 5, 5, 3};
			int[] arr2 = {5, 2, 5, 5, 3, 4};
			int solucion = 0;
			do_check(arr1,arr2,solucion);
		}

		{
			int[] arr1 = {2, 3, 4, 5, 5, 3};
			int[] arr2 = {5, 3, 1, 4, 4, 2};
			int solucion = -1;
			do_check(arr1,arr2,solucion);
		}

		{
			int[] arr1 = {2, 3, 4, 5, 5, 3};
			int[] arr2 = {2, 3, 5, 5, 1, 3};
			int solucion = 0;
			do_check(arr1,arr2,solucion);
		}

		{
			int[] arr1 = {2, 3, 4, 5, 5, 3};
			int[] arr2 = {2, 4, 3, 2, 2, 4};
			int solucion = 1;
			do_check(arr1,arr2,solucion);
		}

		{
			int[] arr1 = {2, 3, 4, 5, 5, 3};
			int[] arr2 = {1, 4, 2, 2, 3, 3};
			int solucion = 0;
			do_check(arr1,arr2,solucion);
		}

		{
			int[] arr1 = {2, 3, 4, 5, 5, 3};
			int[] arr2 = {5, 1, 3, 1, 3, 5};
			int solucion = 1;
			do_check(arr1,arr2,solucion);
		}

		{
			int[] arr1 = {2, 3, 4, 5, 5, 3};
			int[] arr2 = {1, 3, 3, 4, 3, 4};
			int solucion = 1;
			do_check(arr1,arr2,solucion);
		}

		{
			int[] arr1 = {2, 3, 4, 5, 5, 3};
			int[] arr2 = {3, 5, 4, 4, 2, 4, 1};
			int solucion = -1;
			do_check(arr1,arr2,solucion);
		}

		{
			int[] arr1 = {2, 3, 4, 5, 5, 3};
			int[] arr2 = {1, 3, 3, 4, 1, 1, 5};
			int solucion = 0;
			do_check(arr1,arr2,solucion);
		}

		{
			int[] arr1 = {2, 3, 4, 5, 5, 3};
			int[] arr2 = {3, 5, 1, 5, 4, 5, 3};
			int solucion = 0;
			do_check(arr1,arr2,solucion);
		}

		{
			int[] arr1 = {3, 2, 1, 5, 2, 1};
			int[] arr2 = {1};
			int solucion = 3;
			do_check(arr1,arr2,solucion);
		}

		{
			int[] arr1 = {3, 2, 1, 5, 2, 1};
			int[] arr2 = {5};
			int solucion = 3;
			do_check(arr1,arr2,solucion);
		}

		{
			int[] arr1 = {3, 2, 1, 5, 2, 1};
			int[] arr2 = {3};
			int solucion = 3;
			do_check(arr1,arr2,solucion);
		}

		{
			int[] arr1 = {3, 2, 1, 5, 2, 1};
			int[] arr2 = {4};
			int solucion = 3;
			do_check(arr1,arr2,solucion);
		}

		{
			int[] arr1 = {3, 2, 1, 5, 2, 1};
			int[] arr2 = {2};
			int solucion = 3;
			do_check(arr1,arr2,solucion);
		}

		{
			int[] arr1 = {3, 2, 1, 5, 2, 1};
			int[] arr2 = {3, 4};
			int solucion = 2;
			do_check(arr1,arr2,solucion);
		}

		{
			int[] arr1 = {3, 2, 1, 5, 2, 1};
			int[] arr2 = {4};
			int solucion = 3;
			do_check(arr1,arr2,solucion);
		}

		{
			int[] arr1 = {3, 2, 1, 5, 2, 1};
			int[] arr2 = {4, 5};
			int solucion = 2;
			do_check(arr1,arr2,solucion);
		}

		{
			int[] arr1 = {3, 2, 1, 5, 2, 1};
			int[] arr2 = {1, 4};
			int solucion = 2;
			do_check(arr1,arr2,solucion);
		}

		{
			int[] arr1 = {3, 2, 1, 5, 2, 1};
			int[] arr2 = {2, 3};
			int solucion = 2;
			do_check(arr1,arr2,solucion);
		}

		{
			int[] arr1 = {3, 2, 1, 5, 2, 1};
			int[] arr2 = {5, 3, 3};
			int solucion = 2;
			do_check(arr1,arr2,solucion);
		}

		{
			int[] arr1 = {3, 2, 1, 5, 2, 1};
			int[] arr2 = {3, 2, 5};
			int solucion = 1;
			do_check(arr1,arr2,solucion);
		}

		{
			int[] arr1 = {3, 2, 1, 5, 2, 1};
			int[] arr2 = {4, 1, 2};
			int solucion = 1;
			do_check(arr1,arr2,solucion);
		}

		{
			int[] arr1 = {3, 2, 1, 5, 2, 1};
			int[] arr2 = {5, 2, 3};
			int solucion = 1;
			do_check(arr1,arr2,solucion);
		}

		{
			int[] arr1 = {3, 2, 1, 5, 2, 1};
			int[] arr2 = {1, 5, 2};
			int solucion = 1;
			do_check(arr1,arr2,solucion);
		}

		{
			int[] arr1 = {3, 2, 1, 5, 2, 1};
			int[] arr2 = {2, 1, 1, 5};
			int solucion = 1;
			do_check(arr1,arr2,solucion);
		}

		{
			int[] arr1 = {3, 2, 1, 5, 2, 1};
			int[] arr2 = {4, 2, 5, 4};
			int solucion = 1;
			do_check(arr1,arr2,solucion);
		}

		{
			int[] arr1 = {3, 2, 1, 5, 2, 1};
			int[] arr2 = {3, 4, 3, 2};
			int solucion = 1;
			do_check(arr1,arr2,solucion);
		}

		{
			int[] arr1 = {3, 2, 1, 5, 2, 1};
			int[] arr2 = {1, 3, 1, 3};
			int solucion = 2;
			do_check(arr1,arr2,solucion);
		}

		{
			int[] arr1 = {3, 2, 1, 5, 2, 1};
			int[] arr2 = {2, 1, 4, 3};
			int solucion = 0;
			do_check(arr1,arr2,solucion);
		}

		{
			int[] arr1 = {3, 2, 1, 5, 2, 1};
			int[] arr2 = {4, 5, 2};
			int solucion = 1;
			do_check(arr1,arr2,solucion);
		}

		{
			int[] arr1 = {3, 2, 1, 5, 2, 1};
			int[] arr2 = {4, 5, 4, 2, 5};
			int solucion = 1;
			do_check(arr1,arr2,solucion);
		}

		{
			int[] arr1 = {3, 2, 1, 5, 2, 1};
			int[] arr2 = {5, 2, 4, 3, 5};
			int solucion = 0;
			do_check(arr1,arr2,solucion);
		}

		{
			int[] arr1 = {3, 2, 1, 5, 2, 1};
			int[] arr2 = {2, 5, 4, 1, 5};
			int solucion = 0;
			do_check(arr1,arr2,solucion);
		}

		{
			int[] arr1 = {3, 2, 1, 5, 2, 1};
			int[] arr2 = {1, 2, 4, 2, 1};
			int solucion = 1;
			do_check(arr1,arr2,solucion);
		}

		{
			int[] arr1 = {3, 2, 1, 5, 2, 1};
			int[] arr2 = {5, 2, 5, 5, 3, 4};
			int solucion = 0;
			do_check(arr1,arr2,solucion);
		}

		{
			int[] arr1 = {3, 2, 1, 5, 2, 1};
			int[] arr2 = {5, 3, 1, 4, 4, 2};
			int solucion = -1;
			do_check(arr1,arr2,solucion);
		}

		{
			int[] arr1 = {3, 2, 1, 5, 2, 1};
			int[] arr2 = {2, 3, 5, 5, 1, 3};
			int solucion = 0;
			do_check(arr1,arr2,solucion);
		}

		{
			int[] arr1 = {3, 2, 1, 5, 2, 1};
			int[] arr2 = {2, 4, 3, 2, 2, 4};
			int solucion = 1;
			do_check(arr1,arr2,solucion);
		}

		{
			int[] arr1 = {3, 2, 1, 5, 2, 1};
			int[] arr2 = {1, 4, 2, 2, 3, 3};
			int solucion = 0;
			do_check(arr1,arr2,solucion);
		}

		{
			int[] arr1 = {3, 2, 1, 5, 2, 1};
			int[] arr2 = {5, 1, 3, 1, 3, 5};
			int solucion = 1;
			do_check(arr1,arr2,solucion);
		}

		{
			int[] arr1 = {3, 2, 1, 5, 2, 1};
			int[] arr2 = {1, 3, 3, 4, 3, 4};
			int solucion = 1;
			do_check(arr1,arr2,solucion);
		}

		{
			int[] arr1 = {3, 2, 1, 5, 2, 1};
			int[] arr2 = {3, 5, 4, 4, 2, 4, 1};
			int solucion = -1;
			do_check(arr1,arr2,solucion);
		}

		{
			int[] arr1 = {3, 2, 1, 5, 2, 1};
			int[] arr2 = {1, 3, 3, 4, 1, 1, 5};
			int solucion = 0;
			do_check(arr1,arr2,solucion);
		}

		{
			int[] arr1 = {3, 2, 1, 5, 2, 1};
			int[] arr2 = {3, 5, 1, 5, 4, 5, 3};
			int solucion = 0;
			do_check(arr1,arr2,solucion);
		}

		{
			int[] arr1 = {5, 3, 3, 3, 3, 5, 5};
			int[] arr2 = {1};
			int solucion = 1;
			do_check(arr1,arr2,solucion);
		}

		{
			int[] arr1 = {5, 3, 3, 3, 3, 5, 5};
			int[] arr2 = {5};
			int solucion = 1;
			do_check(arr1,arr2,solucion);
		}

		{
			int[] arr1 = {5, 3, 3, 3, 3, 5, 5};
			int[] arr2 = {3};
			int solucion = 1;
			do_check(arr1,arr2,solucion);
		}

		{
			int[] arr1 = {5, 3, 3, 3, 3, 5, 5};
			int[] arr2 = {4};
			int solucion = 1;
			do_check(arr1,arr2,solucion);
		}

		{
			int[] arr1 = {5, 3, 3, 3, 3, 5, 5};
			int[] arr2 = {2};
			int solucion = 1;
			do_check(arr1,arr2,solucion);
		}

		{
			int[] arr1 = {5, 3, 3, 3, 3, 5, 5};
			int[] arr2 = {3, 4};
			int solucion = 0;
			do_check(arr1,arr2,solucion);
		}

		{
			int[] arr1 = {5, 3, 3, 3, 3, 5, 5};
			int[] arr2 = {4};
			int solucion = 1;
			do_check(arr1,arr2,solucion);
		}

		{
			int[] arr1 = {5, 3, 3, 3, 3, 5, 5};
			int[] arr2 = {4, 5};
			int solucion = 0;
			do_check(arr1,arr2,solucion);
		}

		{
			int[] arr1 = {5, 3, 3, 3, 3, 5, 5};
			int[] arr2 = {1, 4};
			int solucion = 0;
			do_check(arr1,arr2,solucion);
		}

		{
			int[] arr1 = {5, 3, 3, 3, 3, 5, 5};
			int[] arr2 = {2, 3};
			int solucion = 0;
			do_check(arr1,arr2,solucion);
		}

		{
			int[] arr1 = {5, 3, 3, 3, 3, 5, 5};
			int[] arr2 = {5, 3, 3};
			int solucion = 0;
			do_check(arr1,arr2,solucion);
		}

		{
			int[] arr1 = {5, 3, 3, 3, 3, 5, 5};
			int[] arr2 = {3, 2, 5};
			int solucion = -1;
			do_check(arr1,arr2,solucion);
		}

		{
			int[] arr1 = {5, 3, 3, 3, 3, 5, 5};
			int[] arr2 = {4, 1, 2};
			int solucion = -1;
			do_check(arr1,arr2,solucion);
		}

		{
			int[] arr1 = {5, 3, 3, 3, 3, 5, 5};
			int[] arr2 = {5, 2, 3};
			int solucion = -1;
			do_check(arr1,arr2,solucion);
		}

		{
			int[] arr1 = {5, 3, 3, 3, 3, 5, 5};
			int[] arr2 = {1, 5, 2};
			int solucion = -1;
			do_check(arr1,arr2,solucion);
		}

		{
			int[] arr1 = {5, 3, 3, 3, 3, 5, 5};
			int[] arr2 = {2, 1, 1, 5};
			int solucion = -1;
			do_check(arr1,arr2,solucion);
		}

		{
			int[] arr1 = {5, 3, 3, 3, 3, 5, 5};
			int[] arr2 = {4, 2, 5, 4};
			int solucion = -1;
			do_check(arr1,arr2,solucion);
		}

		{
			int[] arr1 = {5, 3, 3, 3, 3, 5, 5};
			int[] arr2 = {3, 4, 3, 2};
			int solucion = -1;
			do_check(arr1,arr2,solucion);
		}

		{
			int[] arr1 = {5, 3, 3, 3, 3, 5, 5};
			int[] arr2 = {1, 3, 1, 3};
			int solucion = 0;
			do_check(arr1,arr2,solucion);
		}

		{
			int[] arr1 = {5, 3, 3, 3, 3, 5, 5};
			int[] arr2 = {2, 1, 4, 3};
			int solucion = -2;
			do_check(arr1,arr2,solucion);
		}

		{
			int[] arr1 = {5, 3, 3, 3, 3, 5, 5};
			int[] arr2 = {4, 5, 2};
			int solucion = -1;
			do_check(arr1,arr2,solucion);
		}

		{
			int[] arr1 = {5, 3, 3, 3, 3, 5, 5};
			int[] arr2 = {4, 5, 4, 2, 5};
			int solucion = -1;
			do_check(arr1,arr2,solucion);
		}

		{
			int[] arr1 = {5, 3, 3, 3, 3, 5, 5};
			int[] arr2 = {5, 2, 4, 3, 5};
			int solucion = -2;
			do_check(arr1,arr2,solucion);
		}

		{
			int[] arr1 = {5, 3, 3, 3, 3, 5, 5};
			int[] arr2 = {2, 5, 4, 1, 5};
			int solucion = -2;
			do_check(arr1,arr2,solucion);
		}

		{
			int[] arr1 = {5, 3, 3, 3, 3, 5, 5};
			int[] arr2 = {1, 2, 4, 2, 1};
			int solucion = -1;
			do_check(arr1,arr2,solucion);
		}

		{
			int[] arr1 = {5, 3, 3, 3, 3, 5, 5};
			int[] arr2 = {5, 2, 5, 5, 3, 4};
			int solucion = -2;
			do_check(arr1,arr2,solucion);
		}

		{
			int[] arr1 = {5, 3, 3, 3, 3, 5, 5};
			int[] arr2 = {5, 3, 1, 4, 4, 2};
			int solucion = -3;
			do_check(arr1,arr2,solucion);
		}

		{
			int[] arr1 = {5, 3, 3, 3, 3, 5, 5};
			int[] arr2 = {2, 3, 5, 5, 1, 3};
			int solucion = -2;
			do_check(arr1,arr2,solucion);
		}

		{
			int[] arr1 = {5, 3, 3, 3, 3, 5, 5};
			int[] arr2 = {2, 4, 3, 2, 2, 4};
			int solucion = -1;
			do_check(arr1,arr2,solucion);
		}

		{
			int[] arr1 = {5, 3, 3, 3, 3, 5, 5};
			int[] arr2 = {1, 4, 2, 2, 3, 3};
			int solucion = -2;
			do_check(arr1,arr2,solucion);
		}

		{
			int[] arr1 = {5, 3, 3, 3, 3, 5, 5};
			int[] arr2 = {5, 1, 3, 1, 3, 5};
			int solucion = -1;
			do_check(arr1,arr2,solucion);
		}

		{
			int[] arr1 = {5, 3, 3, 3, 3, 5, 5};
			int[] arr2 = {1, 3, 3, 4, 3, 4};
			int solucion = -1;
			do_check(arr1,arr2,solucion);
		}

		{
			int[] arr1 = {5, 3, 3, 3, 3, 5, 5};
			int[] arr2 = {3, 5, 4, 4, 2, 4, 1};
			int solucion = -3;
			do_check(arr1,arr2,solucion);
		}

		{
			int[] arr1 = {5, 3, 3, 3, 3, 5, 5};
			int[] arr2 = {1, 3, 3, 4, 1, 1, 5};
			int solucion = -2;
			do_check(arr1,arr2,solucion);
		}

		{
			int[] arr1 = {5, 3, 3, 3, 3, 5, 5};
			int[] arr2 = {3, 5, 1, 5, 4, 5, 3};
			int solucion = -2;
			do_check(arr1,arr2,solucion);
		}

		{
			int[] arr1 = {2, 1, 3, 5, 3, 2};
			int[] arr2 = {1};
			int solucion = 3;
			do_check(arr1,arr2,solucion);
		}

		{
			int[] arr1 = {2, 1, 3, 5, 3, 2};
			int[] arr2 = {5};
			int solucion = 3;
			do_check(arr1,arr2,solucion);
		}

		{
			int[] arr1 = {2, 1, 3, 5, 3, 2};
			int[] arr2 = {3};
			int solucion = 3;
			do_check(arr1,arr2,solucion);
		}

		{
			int[] arr1 = {2, 1, 3, 5, 3, 2};
			int[] arr2 = {4};
			int solucion = 3;
			do_check(arr1,arr2,solucion);
		}

		{
			int[] arr1 = {2, 1, 3, 5, 3, 2};
			int[] arr2 = {2};
			int solucion = 3;
			do_check(arr1,arr2,solucion);
		}

		{
			int[] arr1 = {2, 1, 3, 5, 3, 2};
			int[] arr2 = {3, 4};
			int solucion = 2;
			do_check(arr1,arr2,solucion);
		}

		{
			int[] arr1 = {2, 1, 3, 5, 3, 2};
			int[] arr2 = {4};
			int solucion = 3;
			do_check(arr1,arr2,solucion);
		}

		{
			int[] arr1 = {2, 1, 3, 5, 3, 2};
			int[] arr2 = {4, 5};
			int solucion = 2;
			do_check(arr1,arr2,solucion);
		}

		{
			int[] arr1 = {2, 1, 3, 5, 3, 2};
			int[] arr2 = {1, 4};
			int solucion = 2;
			do_check(arr1,arr2,solucion);
		}

		{
			int[] arr1 = {2, 1, 3, 5, 3, 2};
			int[] arr2 = {2, 3};
			int solucion = 2;
			do_check(arr1,arr2,solucion);
		}

		{
			int[] arr1 = {2, 1, 3, 5, 3, 2};
			int[] arr2 = {5, 3, 3};
			int solucion = 2;
			do_check(arr1,arr2,solucion);
		}

		{
			int[] arr1 = {2, 1, 3, 5, 3, 2};
			int[] arr2 = {3, 2, 5};
			int solucion = 1;
			do_check(arr1,arr2,solucion);
		}

		{
			int[] arr1 = {2, 1, 3, 5, 3, 2};
			int[] arr2 = {4, 1, 2};
			int solucion = 1;
			do_check(arr1,arr2,solucion);
		}

		{
			int[] arr1 = {2, 1, 3, 5, 3, 2};
			int[] arr2 = {5, 2, 3};
			int solucion = 1;
			do_check(arr1,arr2,solucion);
		}

		{
			int[] arr1 = {2, 1, 3, 5, 3, 2};
			int[] arr2 = {1, 5, 2};
			int solucion = 1;
			do_check(arr1,arr2,solucion);
		}

		{
			int[] arr1 = {2, 1, 3, 5, 3, 2};
			int[] arr2 = {2, 1, 1, 5};
			int solucion = 1;
			do_check(arr1,arr2,solucion);
		}

		{
			int[] arr1 = {2, 1, 3, 5, 3, 2};
			int[] arr2 = {4, 2, 5, 4};
			int solucion = 1;
			do_check(arr1,arr2,solucion);
		}

		{
			int[] arr1 = {2, 1, 3, 5, 3, 2};
			int[] arr2 = {3, 4, 3, 2};
			int solucion = 1;
			do_check(arr1,arr2,solucion);
		}

		{
			int[] arr1 = {2, 1, 3, 5, 3, 2};
			int[] arr2 = {1, 3, 1, 3};
			int solucion = 2;
			do_check(arr1,arr2,solucion);
		}

		{
			int[] arr1 = {2, 1, 3, 5, 3, 2};
			int[] arr2 = {2, 1, 4, 3};
			int solucion = 0;
			do_check(arr1,arr2,solucion);
		}

		{
			int[] arr1 = {2, 1, 3, 5, 3, 2};
			int[] arr2 = {4, 5, 2};
			int solucion = 1;
			do_check(arr1,arr2,solucion);
		}

		{
			int[] arr1 = {2, 1, 3, 5, 3, 2};
			int[] arr2 = {4, 5, 4, 2, 5};
			int solucion = 1;
			do_check(arr1,arr2,solucion);
		}

		{
			int[] arr1 = {2, 1, 3, 5, 3, 2};
			int[] arr2 = {5, 2, 4, 3, 5};
			int solucion = 0;
			do_check(arr1,arr2,solucion);
		}

		{
			int[] arr1 = {2, 1, 3, 5, 3, 2};
			int[] arr2 = {2, 5, 4, 1, 5};
			int solucion = 0;
			do_check(arr1,arr2,solucion);
		}

		{
			int[] arr1 = {2, 1, 3, 5, 3, 2};
			int[] arr2 = {1, 2, 4, 2, 1};
			int solucion = 1;
			do_check(arr1,arr2,solucion);
		}

		{
			int[] arr1 = {2, 1, 3, 5, 3, 2};
			int[] arr2 = {5, 2, 5, 5, 3, 4};
			int solucion = 0;
			do_check(arr1,arr2,solucion);
		}

		{
			int[] arr1 = {2, 1, 3, 5, 3, 2};
			int[] arr2 = {5, 3, 1, 4, 4, 2};
			int solucion = -1;
			do_check(arr1,arr2,solucion);
		}

		{
			int[] arr1 = {2, 1, 3, 5, 3, 2};
			int[] arr2 = {2, 3, 5, 5, 1, 3};
			int solucion = 0;
			do_check(arr1,arr2,solucion);
		}

		{
			int[] arr1 = {2, 1, 3, 5, 3, 2};
			int[] arr2 = {2, 4, 3, 2, 2, 4};
			int solucion = 1;
			do_check(arr1,arr2,solucion);
		}

		{
			int[] arr1 = {2, 1, 3, 5, 3, 2};
			int[] arr2 = {1, 4, 2, 2, 3, 3};
			int solucion = 0;
			do_check(arr1,arr2,solucion);
		}

		{
			int[] arr1 = {2, 1, 3, 5, 3, 2};
			int[] arr2 = {5, 1, 3, 1, 3, 5};
			int solucion = 1;
			do_check(arr1,arr2,solucion);
		}

		{
			int[] arr1 = {2, 1, 3, 5, 3, 2};
			int[] arr2 = {1, 3, 3, 4, 3, 4};
			int solucion = 1;
			do_check(arr1,arr2,solucion);
		}

		{
			int[] arr1 = {2, 1, 3, 5, 3, 2};
			int[] arr2 = {3, 5, 4, 4, 2, 4, 1};
			int solucion = -1;
			do_check(arr1,arr2,solucion);
		}

		{
			int[] arr1 = {2, 1, 3, 5, 3, 2};
			int[] arr2 = {1, 3, 3, 4, 1, 1, 5};
			int solucion = 0;
			do_check(arr1,arr2,solucion);
		}

		{
			int[] arr1 = {2, 1, 3, 5, 3, 2};
			int[] arr2 = {3, 5, 1, 5, 4, 5, 3};
			int solucion = 0;
			do_check(arr1,arr2,solucion);
		}

		{
			int[] arr1 = {2, 1, 1, 4, 4, 1, 4};
			int[] arr2 = {1};
			int solucion = 2;
			do_check(arr1,arr2,solucion);
		}

		{
			int[] arr1 = {2, 1, 1, 4, 4, 1, 4};
			int[] arr2 = {5};
			int solucion = 2;
			do_check(arr1,arr2,solucion);
		}

		{
			int[] arr1 = {2, 1, 1, 4, 4, 1, 4};
			int[] arr2 = {3};
			int solucion = 2;
			do_check(arr1,arr2,solucion);
		}

		{
			int[] arr1 = {2, 1, 1, 4, 4, 1, 4};
			int[] arr2 = {4};
			int solucion = 2;
			do_check(arr1,arr2,solucion);
		}

		{
			int[] arr1 = {2, 1, 1, 4, 4, 1, 4};
			int[] arr2 = {2};
			int solucion = 2;
			do_check(arr1,arr2,solucion);
		}

		{
			int[] arr1 = {2, 1, 1, 4, 4, 1, 4};
			int[] arr2 = {3, 4};
			int solucion = 1;
			do_check(arr1,arr2,solucion);
		}

		{
			int[] arr1 = {2, 1, 1, 4, 4, 1, 4};
			int[] arr2 = {4};
			int solucion = 2;
			do_check(arr1,arr2,solucion);
		}

		{
			int[] arr1 = {2, 1, 1, 4, 4, 1, 4};
			int[] arr2 = {4, 5};
			int solucion = 1;
			do_check(arr1,arr2,solucion);
		}

		{
			int[] arr1 = {2, 1, 1, 4, 4, 1, 4};
			int[] arr2 = {1, 4};
			int solucion = 1;
			do_check(arr1,arr2,solucion);
		}

		{
			int[] arr1 = {2, 1, 1, 4, 4, 1, 4};
			int[] arr2 = {2, 3};
			int solucion = 1;
			do_check(arr1,arr2,solucion);
		}

		{
			int[] arr1 = {2, 1, 1, 4, 4, 1, 4};
			int[] arr2 = {5, 3, 3};
			int solucion = 1;
			do_check(arr1,arr2,solucion);
		}

		{
			int[] arr1 = {2, 1, 1, 4, 4, 1, 4};
			int[] arr2 = {3, 2, 5};
			int solucion = 0;
			do_check(arr1,arr2,solucion);
		}

		{
			int[] arr1 = {2, 1, 1, 4, 4, 1, 4};
			int[] arr2 = {4, 1, 2};
			int solucion = 0;
			do_check(arr1,arr2,solucion);
		}

		{
			int[] arr1 = {2, 1, 1, 4, 4, 1, 4};
			int[] arr2 = {5, 2, 3};
			int solucion = 0;
			do_check(arr1,arr2,solucion);
		}

		{
			int[] arr1 = {2, 1, 1, 4, 4, 1, 4};
			int[] arr2 = {1, 5, 2};
			int solucion = 0;
			do_check(arr1,arr2,solucion);
		}

		{
			int[] arr1 = {2, 1, 1, 4, 4, 1, 4};
			int[] arr2 = {2, 1, 1, 5};
			int solucion = 0;
			do_check(arr1,arr2,solucion);
		}

		{
			int[] arr1 = {2, 1, 1, 4, 4, 1, 4};
			int[] arr2 = {4, 2, 5, 4};
			int solucion = 0;
			do_check(arr1,arr2,solucion);
		}

		{
			int[] arr1 = {2, 1, 1, 4, 4, 1, 4};
			int[] arr2 = {3, 4, 3, 2};
			int solucion = 0;
			do_check(arr1,arr2,solucion);
		}

		{
			int[] arr1 = {2, 1, 1, 4, 4, 1, 4};
			int[] arr2 = {1, 3, 1, 3};
			int solucion = 1;
			do_check(arr1,arr2,solucion);
		}

		{
			int[] arr1 = {2, 1, 1, 4, 4, 1, 4};
			int[] arr2 = {2, 1, 4, 3};
			int solucion = -1;
			do_check(arr1,arr2,solucion);
		}

		{
			int[] arr1 = {2, 1, 1, 4, 4, 1, 4};
			int[] arr2 = {4, 5, 2};
			int solucion = 0;
			do_check(arr1,arr2,solucion);
		}

		{
			int[] arr1 = {2, 1, 1, 4, 4, 1, 4};
			int[] arr2 = {4, 5, 4, 2, 5};
			int solucion = 0;
			do_check(arr1,arr2,solucion);
		}

		{
			int[] arr1 = {2, 1, 1, 4, 4, 1, 4};
			int[] arr2 = {5, 2, 4, 3, 5};
			int solucion = -1;
			do_check(arr1,arr2,solucion);
		}

		{
			int[] arr1 = {2, 1, 1, 4, 4, 1, 4};
			int[] arr2 = {2, 5, 4, 1, 5};
			int solucion = -1;
			do_check(arr1,arr2,solucion);
		}

		{
			int[] arr1 = {2, 1, 1, 4, 4, 1, 4};
			int[] arr2 = {1, 2, 4, 2, 1};
			int solucion = 0;
			do_check(arr1,arr2,solucion);
		}

		{
			int[] arr1 = {2, 1, 1, 4, 4, 1, 4};
			int[] arr2 = {5, 2, 5, 5, 3, 4};
			int solucion = -1;
			do_check(arr1,arr2,solucion);
		}

		{
			int[] arr1 = {2, 1, 1, 4, 4, 1, 4};
			int[] arr2 = {5, 3, 1, 4, 4, 2};
			int solucion = -2;
			do_check(arr1,arr2,solucion);
		}

		{
			int[] arr1 = {2, 1, 1, 4, 4, 1, 4};
			int[] arr2 = {2, 3, 5, 5, 1, 3};
			int solucion = -1;
			do_check(arr1,arr2,solucion);
		}

		{
			int[] arr1 = {2, 1, 1, 4, 4, 1, 4};
			int[] arr2 = {2, 4, 3, 2, 2, 4};
			int solucion = 0;
			do_check(arr1,arr2,solucion);
		}

		{
			int[] arr1 = {2, 1, 1, 4, 4, 1, 4};
			int[] arr2 = {1, 4, 2, 2, 3, 3};
			int solucion = -1;
			do_check(arr1,arr2,solucion);
		}

		{
			int[] arr1 = {2, 1, 1, 4, 4, 1, 4};
			int[] arr2 = {5, 1, 3, 1, 3, 5};
			int solucion = 0;
			do_check(arr1,arr2,solucion);
		}

		{
			int[] arr1 = {2, 1, 1, 4, 4, 1, 4};
			int[] arr2 = {1, 3, 3, 4, 3, 4};
			int solucion = 0;
			do_check(arr1,arr2,solucion);
		}

		{
			int[] arr1 = {2, 1, 1, 4, 4, 1, 4};
			int[] arr2 = {3, 5, 4, 4, 2, 4, 1};
			int solucion = -2;
			do_check(arr1,arr2,solucion);
		}

		{
			int[] arr1 = {2, 1, 1, 4, 4, 1, 4};
			int[] arr2 = {1, 3, 3, 4, 1, 1, 5};
			int solucion = -1;
			do_check(arr1,arr2,solucion);
		}

		{
			int[] arr1 = {2, 1, 1, 4, 4, 1, 4};
			int[] arr2 = {3, 5, 1, 5, 4, 5, 3};
			int solucion = -1;
			do_check(arr1,arr2,solucion);
		}

		{
			int[] arr1 = {4, 4, 3, 3, 1, 2, 1};
			int[] arr2 = {1};
			int solucion = 3;
			do_check(arr1,arr2,solucion);
		}

		{
			int[] arr1 = {4, 4, 3, 3, 1, 2, 1};
			int[] arr2 = {5};
			int solucion = 3;
			do_check(arr1,arr2,solucion);
		}

		{
			int[] arr1 = {4, 4, 3, 3, 1, 2, 1};
			int[] arr2 = {3};
			int solucion = 3;
			do_check(arr1,arr2,solucion);
		}

		{
			int[] arr1 = {4, 4, 3, 3, 1, 2, 1};
			int[] arr2 = {4};
			int solucion = 3;
			do_check(arr1,arr2,solucion);
		}

		{
			int[] arr1 = {4, 4, 3, 3, 1, 2, 1};
			int[] arr2 = {2};
			int solucion = 3;
			do_check(arr1,arr2,solucion);
		}

		{
			int[] arr1 = {4, 4, 3, 3, 1, 2, 1};
			int[] arr2 = {3, 4};
			int solucion = 2;
			do_check(arr1,arr2,solucion);
		}

		{
			int[] arr1 = {4, 4, 3, 3, 1, 2, 1};
			int[] arr2 = {4};
			int solucion = 3;
			do_check(arr1,arr2,solucion);
		}

		{
			int[] arr1 = {4, 4, 3, 3, 1, 2, 1};
			int[] arr2 = {4, 5};
			int solucion = 2;
			do_check(arr1,arr2,solucion);
		}

		{
			int[] arr1 = {4, 4, 3, 3, 1, 2, 1};
			int[] arr2 = {1, 4};
			int solucion = 2;
			do_check(arr1,arr2,solucion);
		}

		{
			int[] arr1 = {4, 4, 3, 3, 1, 2, 1};
			int[] arr2 = {2, 3};
			int solucion = 2;
			do_check(arr1,arr2,solucion);
		}

		{
			int[] arr1 = {4, 4, 3, 3, 1, 2, 1};
			int[] arr2 = {5, 3, 3};
			int solucion = 2;
			do_check(arr1,arr2,solucion);
		}

		{
			int[] arr1 = {4, 4, 3, 3, 1, 2, 1};
			int[] arr2 = {3, 2, 5};
			int solucion = 1;
			do_check(arr1,arr2,solucion);
		}

		{
			int[] arr1 = {4, 4, 3, 3, 1, 2, 1};
			int[] arr2 = {4, 1, 2};
			int solucion = 1;
			do_check(arr1,arr2,solucion);
		}

		{
			int[] arr1 = {4, 4, 3, 3, 1, 2, 1};
			int[] arr2 = {5, 2, 3};
			int solucion = 1;
			do_check(arr1,arr2,solucion);
		}

		{
			int[] arr1 = {4, 4, 3, 3, 1, 2, 1};
			int[] arr2 = {1, 5, 2};
			int solucion = 1;
			do_check(arr1,arr2,solucion);
		}

		{
			int[] arr1 = {4, 4, 3, 3, 1, 2, 1};
			int[] arr2 = {2, 1, 1, 5};
			int solucion = 1;
			do_check(arr1,arr2,solucion);
		}

		{
			int[] arr1 = {4, 4, 3, 3, 1, 2, 1};
			int[] arr2 = {4, 2, 5, 4};
			int solucion = 1;
			do_check(arr1,arr2,solucion);
		}

		{
			int[] arr1 = {4, 4, 3, 3, 1, 2, 1};
			int[] arr2 = {3, 4, 3, 2};
			int solucion = 1;
			do_check(arr1,arr2,solucion);
		}

		{
			int[] arr1 = {4, 4, 3, 3, 1, 2, 1};
			int[] arr2 = {1, 3, 1, 3};
			int solucion = 2;
			do_check(arr1,arr2,solucion);
		}

		{
			int[] arr1 = {4, 4, 3, 3, 1, 2, 1};
			int[] arr2 = {2, 1, 4, 3};
			int solucion = 0;
			do_check(arr1,arr2,solucion);
		}

		{
			int[] arr1 = {4, 4, 3, 3, 1, 2, 1};
			int[] arr2 = {4, 5, 2};
			int solucion = 1;
			do_check(arr1,arr2,solucion);
		}

		{
			int[] arr1 = {4, 4, 3, 3, 1, 2, 1};
			int[] arr2 = {4, 5, 4, 2, 5};
			int solucion = 1;
			do_check(arr1,arr2,solucion);
		}

		{
			int[] arr1 = {4, 4, 3, 3, 1, 2, 1};
			int[] arr2 = {5, 2, 4, 3, 5};
			int solucion = 0;
			do_check(arr1,arr2,solucion);
		}

		{
			int[] arr1 = {4, 4, 3, 3, 1, 2, 1};
			int[] arr2 = {2, 5, 4, 1, 5};
			int solucion = 0;
			do_check(arr1,arr2,solucion);
		}

		{
			int[] arr1 = {4, 4, 3, 3, 1, 2, 1};
			int[] arr2 = {1, 2, 4, 2, 1};
			int solucion = 1;
			do_check(arr1,arr2,solucion);
		}

		{
			int[] arr1 = {4, 4, 3, 3, 1, 2, 1};
			int[] arr2 = {5, 2, 5, 5, 3, 4};
			int solucion = 0;
			do_check(arr1,arr2,solucion);
		}

		{
			int[] arr1 = {4, 4, 3, 3, 1, 2, 1};
			int[] arr2 = {5, 3, 1, 4, 4, 2};
			int solucion = -1;
			do_check(arr1,arr2,solucion);
		}

		{
			int[] arr1 = {4, 4, 3, 3, 1, 2, 1};
			int[] arr2 = {2, 3, 5, 5, 1, 3};
			int solucion = 0;
			do_check(arr1,arr2,solucion);
		}

		{
			int[] arr1 = {4, 4, 3, 3, 1, 2, 1};
			int[] arr2 = {2, 4, 3, 2, 2, 4};
			int solucion = 1;
			do_check(arr1,arr2,solucion);
		}

		{
			int[] arr1 = {4, 4, 3, 3, 1, 2, 1};
			int[] arr2 = {1, 4, 2, 2, 3, 3};
			int solucion = 0;
			do_check(arr1,arr2,solucion);
		}

		{
			int[] arr1 = {4, 4, 3, 3, 1, 2, 1};
			int[] arr2 = {5, 1, 3, 1, 3, 5};
			int solucion = 1;
			do_check(arr1,arr2,solucion);
		}

		{
			int[] arr1 = {4, 4, 3, 3, 1, 2, 1};
			int[] arr2 = {1, 3, 3, 4, 3, 4};
			int solucion = 1;
			do_check(arr1,arr2,solucion);
		}

		{
			int[] arr1 = {4, 4, 3, 3, 1, 2, 1};
			int[] arr2 = {3, 5, 4, 4, 2, 4, 1};
			int solucion = -1;
			do_check(arr1,arr2,solucion);
		}

		{
			int[] arr1 = {4, 4, 3, 3, 1, 2, 1};
			int[] arr2 = {1, 3, 3, 4, 1, 1, 5};
			int solucion = 0;
			do_check(arr1,arr2,solucion);
		}

		{
			int[] arr1 = {4, 4, 3, 3, 1, 2, 1};
			int[] arr2 = {3, 5, 1, 5, 4, 5, 3};
			int solucion = 0;
			do_check(arr1,arr2,solucion);
		}

		{
			int[] arr1 = {3, 5, 1, 2, 2, 4, 3};
			int[] arr2 = {1};
			int solucion = 4;
			do_check(arr1,arr2,solucion);
		}

		{
			int[] arr1 = {3, 5, 1, 2, 2, 4, 3};
			int[] arr2 = {5};
			int solucion = 4;
			do_check(arr1,arr2,solucion);
		}

		{
			int[] arr1 = {3, 5, 1, 2, 2, 4, 3};
			int[] arr2 = {3};
			int solucion = 4;
			do_check(arr1,arr2,solucion);
		}

		{
			int[] arr1 = {3, 5, 1, 2, 2, 4, 3};
			int[] arr2 = {4};
			int solucion = 4;
			do_check(arr1,arr2,solucion);
		}

		{
			int[] arr1 = {3, 5, 1, 2, 2, 4, 3};
			int[] arr2 = {2};
			int solucion = 4;
			do_check(arr1,arr2,solucion);
		}

		{
			int[] arr1 = {3, 5, 1, 2, 2, 4, 3};
			int[] arr2 = {3, 4};
			int solucion = 3;
			do_check(arr1,arr2,solucion);
		}

		{
			int[] arr1 = {3, 5, 1, 2, 2, 4, 3};
			int[] arr2 = {4};
			int solucion = 4;
			do_check(arr1,arr2,solucion);
		}

		{
			int[] arr1 = {3, 5, 1, 2, 2, 4, 3};
			int[] arr2 = {4, 5};
			int solucion = 3;
			do_check(arr1,arr2,solucion);
		}

		{
			int[] arr1 = {3, 5, 1, 2, 2, 4, 3};
			int[] arr2 = {1, 4};
			int solucion = 3;
			do_check(arr1,arr2,solucion);
		}

		{
			int[] arr1 = {3, 5, 1, 2, 2, 4, 3};
			int[] arr2 = {2, 3};
			int solucion = 3;
			do_check(arr1,arr2,solucion);
		}

		{
			int[] arr1 = {3, 5, 1, 2, 2, 4, 3};
			int[] arr2 = {5, 3, 3};
			int solucion = 3;
			do_check(arr1,arr2,solucion);
		}

		{
			int[] arr1 = {3, 5, 1, 2, 2, 4, 3};
			int[] arr2 = {3, 2, 5};
			int solucion = 2;
			do_check(arr1,arr2,solucion);
		}

		{
			int[] arr1 = {3, 5, 1, 2, 2, 4, 3};
			int[] arr2 = {4, 1, 2};
			int solucion = 2;
			do_check(arr1,arr2,solucion);
		}

		{
			int[] arr1 = {3, 5, 1, 2, 2, 4, 3};
			int[] arr2 = {5, 2, 3};
			int solucion = 2;
			do_check(arr1,arr2,solucion);
		}

		{
			int[] arr1 = {3, 5, 1, 2, 2, 4, 3};
			int[] arr2 = {1, 5, 2};
			int solucion = 2;
			do_check(arr1,arr2,solucion);
		}

		{
			int[] arr1 = {3, 5, 1, 2, 2, 4, 3};
			int[] arr2 = {2, 1, 1, 5};
			int solucion = 2;
			do_check(arr1,arr2,solucion);
		}

		{
			int[] arr1 = {3, 5, 1, 2, 2, 4, 3};
			int[] arr2 = {4, 2, 5, 4};
			int solucion = 2;
			do_check(arr1,arr2,solucion);
		}

		{
			int[] arr1 = {3, 5, 1, 2, 2, 4, 3};
			int[] arr2 = {3, 4, 3, 2};
			int solucion = 2;
			do_check(arr1,arr2,solucion);
		}

		{
			int[] arr1 = {3, 5, 1, 2, 2, 4, 3};
			int[] arr2 = {1, 3, 1, 3};
			int solucion = 3;
			do_check(arr1,arr2,solucion);
		}

		{
			int[] arr1 = {3, 5, 1, 2, 2, 4, 3};
			int[] arr2 = {2, 1, 4, 3};
			int solucion = 1;
			do_check(arr1,arr2,solucion);
		}

		{
			int[] arr1 = {3, 5, 1, 2, 2, 4, 3};
			int[] arr2 = {4, 5, 2};
			int solucion = 2;
			do_check(arr1,arr2,solucion);
		}

		{
			int[] arr1 = {3, 5, 1, 2, 2, 4, 3};
			int[] arr2 = {4, 5, 4, 2, 5};
			int solucion = 2;
			do_check(arr1,arr2,solucion);
		}

		{
			int[] arr1 = {3, 5, 1, 2, 2, 4, 3};
			int[] arr2 = {5, 2, 4, 3, 5};
			int solucion = 1;
			do_check(arr1,arr2,solucion);
		}

		{
			int[] arr1 = {3, 5, 1, 2, 2, 4, 3};
			int[] arr2 = {2, 5, 4, 1, 5};
			int solucion = 1;
			do_check(arr1,arr2,solucion);
		}

		{
			int[] arr1 = {3, 5, 1, 2, 2, 4, 3};
			int[] arr2 = {1, 2, 4, 2, 1};
			int solucion = 2;
			do_check(arr1,arr2,solucion);
		}

		{
			int[] arr1 = {3, 5, 1, 2, 2, 4, 3};
			int[] arr2 = {5, 2, 5, 5, 3, 4};
			int solucion = 1;
			do_check(arr1,arr2,solucion);
		}

		{
			int[] arr1 = {3, 5, 1, 2, 2, 4, 3};
			int[] arr2 = {5, 3, 1, 4, 4, 2};
			int solucion = 0;
			do_check(arr1,arr2,solucion);
		}

		{
			int[] arr1 = {3, 5, 1, 2, 2, 4, 3};
			int[] arr2 = {2, 3, 5, 5, 1, 3};
			int solucion = 1;
			do_check(arr1,arr2,solucion);
		}

		{
			int[] arr1 = {3, 5, 1, 2, 2, 4, 3};
			int[] arr2 = {2, 4, 3, 2, 2, 4};
			int solucion = 2;
			do_check(arr1,arr2,solucion);
		}

		{
			int[] arr1 = {3, 5, 1, 2, 2, 4, 3};
			int[] arr2 = {1, 4, 2, 2, 3, 3};
			int solucion = 1;
			do_check(arr1,arr2,solucion);
		}

		{
			int[] arr1 = {3, 5, 1, 2, 2, 4, 3};
			int[] arr2 = {5, 1, 3, 1, 3, 5};
			int solucion = 2;
			do_check(arr1,arr2,solucion);
		}

		{
			int[] arr1 = {3, 5, 1, 2, 2, 4, 3};
			int[] arr2 = {1, 3, 3, 4, 3, 4};
			int solucion = 2;
			do_check(arr1,arr2,solucion);
		}

		{
			int[] arr1 = {3, 5, 1, 2, 2, 4, 3};
			int[] arr2 = {3, 5, 4, 4, 2, 4, 1};
			int solucion = 0;
			do_check(arr1,arr2,solucion);
		}

		{
			int[] arr1 = {3, 5, 1, 2, 2, 4, 3};
			int[] arr2 = {1, 3, 3, 4, 1, 1, 5};
			int solucion = 1;
			do_check(arr1,arr2,solucion);
		}

		{
			int[] arr1 = {3, 5, 1, 2, 2, 4, 3};
			int[] arr2 = {3, 5, 1, 5, 4, 5, 3};
			int solucion = 1;
			do_check(arr1,arr2,solucion);
		}



		System.out.println("Test Superado");
	}
}
