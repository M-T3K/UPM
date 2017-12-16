import java.util.Arrays;


public class MezclaOrdenada {

  //Mezcla ordenada de dos arrays ordenados
  public static int[] merge(int[] arr1, int[] arr2) {
    int[] res = new int[arr1.length + arr2.length];
    int pointer1 = 0;
    int pointer2 = 0;
    for (int i = 0; i < res.length; i++) {
      if(pointer1 >= arr1.length){
        res[i] = arr2[pointer2];
        pointer2++;
      }else if(pointer2 >= arr2.length || arr1[pointer1] < arr2[pointer2]){
        res[i] = arr1[pointer1];
        pointer1++;
      }else{
        res[i] = arr2[pointer2];
        pointer2++;
      }
    }
    return res;
  }


  private static void do_check(int[] arr1, int[] arr2, int[] solucion){

    try{

      int[] solAlumno=merge(arr1,arr2);
      if (solAlumno==arr1 || solAlumno==arr2){
        System.out.println("Error: el c�digo del alumno produce un resultado incorrecto.");
        System.out.println("El array devuelto para los argumentos: " +
                           Arrays.toString(arr1) + ", " + Arrays.toString(arr2));
        System.out.println("deber�a contener una referencia DISTINTA a las de los vectores argumento, pero no es asi");
        throw new Error();

      }
      if (!Arrays.equals(solAlumno, solucion)){
        System.out.println("Error: el c�digo del alumno produce un resultado incorrecto.");
        System.out.println("El resultado esperado para los argumentos: " +
                           Arrays.toString(arr1) + ", " + Arrays.toString(arr2));
        System.out.println("deber�a ser " + Arrays.toString(solucion));
        System.out.println("pero el resultado obtenido es " + Arrays.toString(solAlumno));
        throw new Error("Error en test: el c�digo del alumno produce un resultado incorrecto");
      }
    } catch (Exception e){
      System.out.println("**** El c�digo del alumno ha lanzado una excepci�n: " + e.toString());
      throw new Error();
    }
  }






 public static void main(String[] args){
  {
   int[] arr1 = {};
   int[] arr2 = {4,81};
   int[] solucion = {4,81};
   do_check(arr1,arr2,solucion);
  }
  {
   int[] arr1 = {5,10,15};
   int[] arr2 = {};
   int[] solucion = {5,10,15};
   do_check(arr1,arr2,solucion);
  }
  {
   int[] arr1 = {35, 35,70};
   int[] arr2 = {90};
   int[] solucion = {35,35,70,90};
   do_check(arr1,arr2,solucion);
  }




  {
   int[] arr1 = {35, 35};
   int[] arr2 = {1, 40};
   int[] solucion = {1, 35, 35, 40};
   do_check(arr1,arr2,solucion);
  }

  {
   int[] arr1 = {35, 35};
   int[] arr2 = {10, 15};
   int[] solucion = {10, 15, 35, 35};
   do_check(arr1,arr2,solucion);
  }

  {
   int[] arr1 = {35, 35};
   int[] arr2 = {20, 20};
   int[] solucion = {20, 20, 35, 35};
   do_check(arr1,arr2,solucion);
  }

  {
   int[] arr1 = {35, 35};
   int[] arr2 = {1, 40};
   int[] solucion = {1, 35, 35, 40};
   do_check(arr1,arr2,solucion);
  }

  {
   int[] arr1 = {35, 35};
   int[] arr2 = {10, 15};
   int[] solucion = {10, 15, 35, 35};
   do_check(arr1,arr2,solucion);
  }

  {
   int[] arr1 = {35, 35};
   int[] arr2 = {5, 35};
   int[] solucion = {5, 35, 35, 35};
   do_check(arr1,arr2,solucion);
  }

  {
   int[] arr1 = {35, 35};
   int[] arr2 = {10, 20, 20};
   int[] solucion = {10, 20, 20, 35, 35};
   do_check(arr1,arr2,solucion);
  }

  {
   int[] arr1 = {35, 35};
   int[] arr2 = {15, 35, 35};
   int[] solucion = {15, 35, 35, 35, 35};
   do_check(arr1,arr2,solucion);
  }

  {
   int[] arr1 = {35, 35};
   int[] arr2 = {25, 30, 40};
   int[] solucion = {25, 30, 35, 35, 40};
   do_check(arr1,arr2,solucion);
  }

  {
   int[] arr1 = {35, 35};
   int[] arr2 = {5, 5, 25};
   int[] solucion = {5, 5, 25, 35, 35};
   do_check(arr1,arr2,solucion);
  }

  {
   int[] arr1 = {35, 35};
   int[] arr2 = {5, 25, 40};
   int[] solucion = {5, 25, 35, 35, 40};
   do_check(arr1,arr2,solucion);
  }

  {
   int[] arr1 = {35, 35};
   int[] arr2 = {1, 35, 35};
   int[] solucion = {1, 35, 35, 35, 35};
   do_check(arr1,arr2,solucion);
  }

  {
   int[] arr1 = {35, 35};
   int[] arr2 = {5, 10, 20, 35};
   int[] solucion = {5, 10, 20, 35, 35, 35};
   do_check(arr1,arr2,solucion);
  }

  {
   int[] arr1 = {35, 35};
   int[] arr2 = {15, 25, 25, 35};
   int[] solucion = {15, 25, 25, 35, 35, 35};
   do_check(arr1,arr2,solucion);
  }

  {
   int[] arr1 = {35, 35};
   int[] arr2 = {25, 25, 35, 40};
   int[] solucion = {25, 25, 35, 35, 35, 40};
   do_check(arr1,arr2,solucion);
  }

  {
   int[] arr1 = {35, 35};
   int[] arr2 = {10, 15, 30, 30};
   int[] solucion = {10, 15, 30, 30, 35, 35};
   do_check(arr1,arr2,solucion);
  }

  {
   int[] arr1 = {35, 35};
   int[] arr2 = {10, 10, 15, 20};
   int[] solucion = {10, 10, 15, 20, 35, 35};
   do_check(arr1,arr2,solucion);
  }

  {
   int[] arr1 = {35, 35};
   int[] arr2 = {1, 5, 30, 35};
   int[] solucion = {1, 5, 30, 35, 35, 35};
   do_check(arr1,arr2,solucion);
  }

  {
   int[] arr1 = {35, 35};
   int[] arr2 = {1, 5, 15, 15, 25};
   int[] solucion = {1, 5, 15, 15, 25, 35, 35};
   do_check(arr1,arr2,solucion);
  }

  {
   int[] arr1 = {35, 35};
   int[] arr2 = {5, 5, 20, 35};
   int[] solucion = {5, 5, 20, 35, 35, 35};
   do_check(arr1,arr2,solucion);
  }

  {
   int[] arr1 = {35, 35};
   int[] arr2 = {1, 1, 5, 15, 20};
   int[] solucion = {1, 1, 5, 15, 20, 35, 35};
   do_check(arr1,arr2,solucion);
  }

  {
   int[] arr1 = {35, 35};
   int[] arr2 = {25, 35, 35, 40, 40};
   int[] solucion = {25, 35, 35, 35, 35, 40, 40};
   do_check(arr1,arr2,solucion);
  }

  {
   int[] arr1 = {35, 35};
   int[] arr2 = {20, 30, 30, 35, 40};
   int[] solucion = {20, 30, 30, 35, 35, 35, 40};
   do_check(arr1,arr2,solucion);
  }

  {
   int[] arr1 = {35, 35};
   int[] arr2 = {1, 1, 10, 25, 40};
   int[] solucion = {1, 1, 10, 25, 35, 35, 40};
   do_check(arr1,arr2,solucion);
  }

  {
   int[] arr1 = {25, 40};
   int[] arr2 = {1, 40};
   int[] solucion = {1, 25, 40, 40};
   do_check(arr1,arr2,solucion);
  }

  {
   int[] arr1 = {25, 40};
   int[] arr2 = {10, 15};
   int[] solucion = {10, 15, 25, 40};
   do_check(arr1,arr2,solucion);
  }

  {
   int[] arr1 = {25, 40};
   int[] arr2 = {20, 20};
   int[] solucion = {20, 20, 25, 40};
   do_check(arr1,arr2,solucion);
  }

  {
   int[] arr1 = {25, 40};
   int[] arr2 = {1, 40};
   int[] solucion = {1, 25, 40, 40};
   do_check(arr1,arr2,solucion);
  }

  {
   int[] arr1 = {25, 40};
   int[] arr2 = {10, 15};
   int[] solucion = {10, 15, 25, 40};
   do_check(arr1,arr2,solucion);
  }

  {
   int[] arr1 = {25, 40};
   int[] arr2 = {5, 35};
   int[] solucion = {5, 25, 35, 40};
   do_check(arr1,arr2,solucion);
  }

  {
   int[] arr1 = {25, 40};
   int[] arr2 = {10, 20, 20};
   int[] solucion = {10, 20, 20, 25, 40};
   do_check(arr1,arr2,solucion);
  }

  {
   int[] arr1 = {25, 40};
   int[] arr2 = {15, 35, 35};
   int[] solucion = {15, 25, 35, 35, 40};
   do_check(arr1,arr2,solucion);
  }

  {
   int[] arr1 = {25, 40};
   int[] arr2 = {25, 30, 40};
   int[] solucion = {25, 25, 30, 40, 40};
   do_check(arr1,arr2,solucion);
  }

  {
   int[] arr1 = {25, 40};
   int[] arr2 = {5, 5, 25};
   int[] solucion = {5, 5, 25, 25, 40};
   do_check(arr1,arr2,solucion);
  }

  {
   int[] arr1 = {25, 40};
   int[] arr2 = {5, 25, 40};
   int[] solucion = {5, 25, 25, 40, 40};
   do_check(arr1,arr2,solucion);
  }

  {
   int[] arr1 = {25, 40};
   int[] arr2 = {1, 35, 35};
   int[] solucion = {1, 25, 35, 35, 40};
   do_check(arr1,arr2,solucion);
  }

  {
   int[] arr1 = {25, 40};
   int[] arr2 = {5, 10, 20, 35};
   int[] solucion = {5, 10, 20, 25, 35, 40};
   do_check(arr1,arr2,solucion);
  }

  {
   int[] arr1 = {25, 40};
   int[] arr2 = {15, 25, 25, 35};
   int[] solucion = {15, 25, 25, 25, 35, 40};
   do_check(arr1,arr2,solucion);
  }

  {
   int[] arr1 = {25, 40};
   int[] arr2 = {25, 25, 35, 40};
   int[] solucion = {25, 25, 25, 35, 40, 40};
   do_check(arr1,arr2,solucion);
  }

  {
   int[] arr1 = {25, 40};
   int[] arr2 = {10, 15, 30, 30};
   int[] solucion = {10, 15, 25, 30, 30, 40};
   do_check(arr1,arr2,solucion);
  }

  {
   int[] arr1 = {25, 40};
   int[] arr2 = {10, 10, 15, 20};
   int[] solucion = {10, 10, 15, 20, 25, 40};
   do_check(arr1,arr2,solucion);
  }

  {
   int[] arr1 = {25, 40};
   int[] arr2 = {1, 5, 30, 35};
   int[] solucion = {1, 5, 25, 30, 35, 40};
   do_check(arr1,arr2,solucion);
  }

  {
   int[] arr1 = {25, 40};
   int[] arr2 = {1, 5, 15, 15, 25};
   int[] solucion = {1, 5, 15, 15, 25, 25, 40};
   do_check(arr1,arr2,solucion);
  }

  {
   int[] arr1 = {25, 40};
   int[] arr2 = {5, 5, 20, 35};
   int[] solucion = {5, 5, 20, 25, 35, 40};
   do_check(arr1,arr2,solucion);
  }

  {
   int[] arr1 = {25, 40};
   int[] arr2 = {1, 1, 5, 15, 20};
   int[] solucion = {1, 1, 5, 15, 20, 25, 40};
   do_check(arr1,arr2,solucion);
  }

  {
   int[] arr1 = {25, 40};
   int[] arr2 = {25, 35, 35, 40, 40};
   int[] solucion = {25, 25, 35, 35, 40, 40, 40};
   do_check(arr1,arr2,solucion);
  }

  {
   int[] arr1 = {25, 40};
   int[] arr2 = {20, 30, 30, 35, 40};
   int[] solucion = {20, 25, 30, 30, 35, 40, 40};
   do_check(arr1,arr2,solucion);
  }

  {
   int[] arr1 = {25, 40};
   int[] arr2 = {1, 1, 10, 25, 40};
   int[] solucion = {1, 1, 10, 25, 25, 40, 40};
   do_check(arr1,arr2,solucion);
  }

  {
   int[] arr1 = {1, 35};
   int[] arr2 = {1, 40};
   int[] solucion = {1, 1, 35, 40};
   do_check(arr1,arr2,solucion);
  }

  {
   int[] arr1 = {1, 35};
   int[] arr2 = {10, 15};
   int[] solucion = {1, 10, 15, 35};
   do_check(arr1,arr2,solucion);
  }

  {
   int[] arr1 = {1, 35};
   int[] arr2 = {20, 20};
   int[] solucion = {1, 20, 20, 35};
   do_check(arr1,arr2,solucion);
  }

  {
   int[] arr1 = {1, 35};
   int[] arr2 = {1, 40};
   int[] solucion = {1, 1, 35, 40};
   do_check(arr1,arr2,solucion);
  }

  {
   int[] arr1 = {1, 35};
   int[] arr2 = {10, 15};
   int[] solucion = {1, 10, 15, 35};
   do_check(arr1,arr2,solucion);
  }

  {
   int[] arr1 = {1, 35};
   int[] arr2 = {5, 35};
   int[] solucion = {1, 5, 35, 35};
   do_check(arr1,arr2,solucion);
  }

  {
   int[] arr1 = {1, 35};
   int[] arr2 = {10, 20, 20};
   int[] solucion = {1, 10, 20, 20, 35};
   do_check(arr1,arr2,solucion);
  }

  {
   int[] arr1 = {1, 35};
   int[] arr2 = {15, 35, 35};
   int[] solucion = {1, 15, 35, 35, 35};
   do_check(arr1,arr2,solucion);
  }

  {
   int[] arr1 = {1, 35};
   int[] arr2 = {25, 30, 40};
   int[] solucion = {1, 25, 30, 35, 40};
   do_check(arr1,arr2,solucion);
  }

  {
   int[] arr1 = {1, 35};
   int[] arr2 = {5, 5, 25};
   int[] solucion = {1, 5, 5, 25, 35};
   do_check(arr1,arr2,solucion);
  }

  {
   int[] arr1 = {1, 35};
   int[] arr2 = {5, 25, 40};
   int[] solucion = {1, 5, 25, 35, 40};
   do_check(arr1,arr2,solucion);
  }

  {
   int[] arr1 = {1, 35};
   int[] arr2 = {1, 35, 35};
   int[] solucion = {1, 1, 35, 35, 35};
   do_check(arr1,arr2,solucion);
  }

  {
   int[] arr1 = {1, 35};
   int[] arr2 = {5, 10, 20, 35};
   int[] solucion = {1, 5, 10, 20, 35, 35};
   do_check(arr1,arr2,solucion);
  }

  {
   int[] arr1 = {1, 35};
   int[] arr2 = {15, 25, 25, 35};
   int[] solucion = {1, 15, 25, 25, 35, 35};
   do_check(arr1,arr2,solucion);
  }

  {
   int[] arr1 = {1, 35};
   int[] arr2 = {25, 25, 35, 40};
   int[] solucion = {1, 25, 25, 35, 35, 40};
   do_check(arr1,arr2,solucion);
  }

  {
   int[] arr1 = {1, 35};
   int[] arr2 = {10, 15, 30, 30};
   int[] solucion = {1, 10, 15, 30, 30, 35};
   do_check(arr1,arr2,solucion);
  }

  {
   int[] arr1 = {1, 35};
   int[] arr2 = {10, 10, 15, 20};
   int[] solucion = {1, 10, 10, 15, 20, 35};
   do_check(arr1,arr2,solucion);
  }

  {
   int[] arr1 = {1, 35};
   int[] arr2 = {1, 5, 30, 35};
   int[] solucion = {1, 1, 5, 30, 35, 35};
   do_check(arr1,arr2,solucion);
  }

  {
   int[] arr1 = {1, 35};
   int[] arr2 = {1, 5, 15, 15, 25};
   int[] solucion = {1, 1, 5, 15, 15, 25, 35};
   do_check(arr1,arr2,solucion);
  }

  {
   int[] arr1 = {1, 35};
   int[] arr2 = {5, 5, 20, 35};
   int[] solucion = {1, 5, 5, 20, 35, 35};
   do_check(arr1,arr2,solucion);
  }

  {
   int[] arr1 = {1, 35};
   int[] arr2 = {1, 1, 5, 15, 20};
   int[] solucion = {1, 1, 1, 5, 15, 20, 35};
   do_check(arr1,arr2,solucion);
  }

  {
   int[] arr1 = {1, 35};
   int[] arr2 = {25, 35, 35, 40, 40};
   int[] solucion = {1, 25, 35, 35, 35, 40, 40};
   do_check(arr1,arr2,solucion);
  }

  {
   int[] arr1 = {1, 35};
   int[] arr2 = {20, 30, 30, 35, 40};
   int[] solucion = {1, 20, 30, 30, 35, 35, 40};
   do_check(arr1,arr2,solucion);
  }

  {
   int[] arr1 = {1, 35};
   int[] arr2 = {1, 1, 10, 25, 40};
   int[] solucion = {1, 1, 1, 10, 25, 35, 40};
   do_check(arr1,arr2,solucion);
  }

  {
   int[] arr1 = {10, 30};
   int[] arr2 = {1, 40};
   int[] solucion = {1, 10, 30, 40};
   do_check(arr1,arr2,solucion);
  }

  {
   int[] arr1 = {10, 30};
   int[] arr2 = {10, 15};
   int[] solucion = {10, 10, 15, 30};
   do_check(arr1,arr2,solucion);
  }

  {
   int[] arr1 = {10, 30};
   int[] arr2 = {20, 20};
   int[] solucion = {10, 20, 20, 30};
   do_check(arr1,arr2,solucion);
  }

  {
   int[] arr1 = {10, 30};
   int[] arr2 = {1, 40};
   int[] solucion = {1, 10, 30, 40};
   do_check(arr1,arr2,solucion);
  }

  {
   int[] arr1 = {10, 30};
   int[] arr2 = {10, 15};
   int[] solucion = {10, 10, 15, 30};
   do_check(arr1,arr2,solucion);
  }

  {
   int[] arr1 = {10, 30};
   int[] arr2 = {5, 35};
   int[] solucion = {5, 10, 30, 35};
   do_check(arr1,arr2,solucion);
  }

  {
   int[] arr1 = {10, 30};
   int[] arr2 = {10, 20, 20};
   int[] solucion = {10, 10, 20, 20, 30};
   do_check(arr1,arr2,solucion);
  }

  {
   int[] arr1 = {10, 30};
   int[] arr2 = {15, 35, 35};
   int[] solucion = {10, 15, 30, 35, 35};
   do_check(arr1,arr2,solucion);
  }

  {
   int[] arr1 = {10, 30};
   int[] arr2 = {25, 30, 40};
   int[] solucion = {10, 25, 30, 30, 40};
   do_check(arr1,arr2,solucion);
  }

  {
   int[] arr1 = {10, 30};
   int[] arr2 = {5, 5, 25};
   int[] solucion = {5, 5, 10, 25, 30};
   do_check(arr1,arr2,solucion);
  }

  {
   int[] arr1 = {10, 30};
   int[] arr2 = {5, 25, 40};
   int[] solucion = {5, 10, 25, 30, 40};
   do_check(arr1,arr2,solucion);
  }

  {
   int[] arr1 = {10, 30};
   int[] arr2 = {1, 35, 35};
   int[] solucion = {1, 10, 30, 35, 35};
   do_check(arr1,arr2,solucion);
  }

  {
   int[] arr1 = {10, 30};
   int[] arr2 = {5, 10, 20, 35};
   int[] solucion = {5, 10, 10, 20, 30, 35};
   do_check(arr1,arr2,solucion);
  }

  {
   int[] arr1 = {10, 30};
   int[] arr2 = {15, 25, 25, 35};
   int[] solucion = {10, 15, 25, 25, 30, 35};
   do_check(arr1,arr2,solucion);
  }

  {
   int[] arr1 = {10, 30};
   int[] arr2 = {25, 25, 35, 40};
   int[] solucion = {10, 25, 25, 30, 35, 40};
   do_check(arr1,arr2,solucion);
  }

  {
   int[] arr1 = {10, 30};
   int[] arr2 = {10, 15, 30, 30};
   int[] solucion = {10, 10, 15, 30, 30, 30};
   do_check(arr1,arr2,solucion);
  }

  {
   int[] arr1 = {10, 30};
   int[] arr2 = {10, 10, 15, 20};
   int[] solucion = {10, 10, 10, 15, 20, 30};
   do_check(arr1,arr2,solucion);
  }

  {
   int[] arr1 = {10, 30};
   int[] arr2 = {1, 5, 30, 35};
   int[] solucion = {1, 5, 10, 30, 30, 35};
   do_check(arr1,arr2,solucion);
  }

  {
   int[] arr1 = {10, 30};
   int[] arr2 = {1, 5, 15, 15, 25};
   int[] solucion = {1, 5, 10, 15, 15, 25, 30};
   do_check(arr1,arr2,solucion);
  }

  {
   int[] arr1 = {10, 30};
   int[] arr2 = {5, 5, 20, 35};
   int[] solucion = {5, 5, 10, 20, 30, 35};
   do_check(arr1,arr2,solucion);
  }

  {
   int[] arr1 = {10, 30};
   int[] arr2 = {1, 1, 5, 15, 20};
   int[] solucion = {1, 1, 5, 10, 15, 20, 30};
   do_check(arr1,arr2,solucion);
  }

  {
   int[] arr1 = {10, 30};
   int[] arr2 = {25, 35, 35, 40, 40};
   int[] solucion = {10, 25, 30, 35, 35, 40, 40};
   do_check(arr1,arr2,solucion);
  }

  {
   int[] arr1 = {10, 30};
   int[] arr2 = {20, 30, 30, 35, 40};
   int[] solucion = {10, 20, 30, 30, 30, 35, 40};
   do_check(arr1,arr2,solucion);
  }

  {
   int[] arr1 = {10, 30};
   int[] arr2 = {1, 1, 10, 25, 40};
   int[] solucion = {1, 1, 10, 10, 25, 30, 40};
   do_check(arr1,arr2,solucion);
  }

  {
   int[] arr1 = {40, 40};
   int[] arr2 = {1, 40};
   int[] solucion = {1, 40, 40, 40};
   do_check(arr1,arr2,solucion);
  }

  {
   int[] arr1 = {40, 40};
   int[] arr2 = {10, 15};
   int[] solucion = {10, 15, 40, 40};
   do_check(arr1,arr2,solucion);
  }

  {
   int[] arr1 = {40, 40};
   int[] arr2 = {20, 20};
   int[] solucion = {20, 20, 40, 40};
   do_check(arr1,arr2,solucion);
  }

  {
   int[] arr1 = {40, 40};
   int[] arr2 = {1, 40};
   int[] solucion = {1, 40, 40, 40};
   do_check(arr1,arr2,solucion);
  }

  {
   int[] arr1 = {40, 40};
   int[] arr2 = {10, 15};
   int[] solucion = {10, 15, 40, 40};
   do_check(arr1,arr2,solucion);
  }

  {
   int[] arr1 = {40, 40};
   int[] arr2 = {5, 35};
   int[] solucion = {5, 35, 40, 40};
   do_check(arr1,arr2,solucion);
  }

  {
   int[] arr1 = {40, 40};
   int[] arr2 = {10, 20, 20};
   int[] solucion = {10, 20, 20, 40, 40};
   do_check(arr1,arr2,solucion);
  }

  {
   int[] arr1 = {40, 40};
   int[] arr2 = {15, 35, 35};
   int[] solucion = {15, 35, 35, 40, 40};
   do_check(arr1,arr2,solucion);
  }

  {
   int[] arr1 = {40, 40};
   int[] arr2 = {25, 30, 40};
   int[] solucion = {25, 30, 40, 40, 40};
   do_check(arr1,arr2,solucion);
  }

  {
   int[] arr1 = {40, 40};
   int[] arr2 = {5, 5, 25};
   int[] solucion = {5, 5, 25, 40, 40};
   do_check(arr1,arr2,solucion);
  }

  {
   int[] arr1 = {40, 40};
   int[] arr2 = {5, 25, 40};
   int[] solucion = {5, 25, 40, 40, 40};
   do_check(arr1,arr2,solucion);
  }

  {
   int[] arr1 = {40, 40};
   int[] arr2 = {1, 35, 35};
   int[] solucion = {1, 35, 35, 40, 40};
   do_check(arr1,arr2,solucion);
  }

  {
   int[] arr1 = {40, 40};
   int[] arr2 = {5, 10, 20, 35};
   int[] solucion = {5, 10, 20, 35, 40, 40};
   do_check(arr1,arr2,solucion);
  }

  {
   int[] arr1 = {40, 40};
   int[] arr2 = {15, 25, 25, 35};
   int[] solucion = {15, 25, 25, 35, 40, 40};
   do_check(arr1,arr2,solucion);
  }

  {
   int[] arr1 = {40, 40};
   int[] arr2 = {25, 25, 35, 40};
   int[] solucion = {25, 25, 35, 40, 40, 40};
   do_check(arr1,arr2,solucion);
  }

  {
   int[] arr1 = {40, 40};
   int[] arr2 = {10, 15, 30, 30};
   int[] solucion = {10, 15, 30, 30, 40, 40};
   do_check(arr1,arr2,solucion);
  }

  {
   int[] arr1 = {40, 40};
   int[] arr2 = {10, 10, 15, 20};
   int[] solucion = {10, 10, 15, 20, 40, 40};
   do_check(arr1,arr2,solucion);
  }

  {
   int[] arr1 = {40, 40};
   int[] arr2 = {1, 5, 30, 35};
   int[] solucion = {1, 5, 30, 35, 40, 40};
   do_check(arr1,arr2,solucion);
  }

  {
   int[] arr1 = {40, 40};
   int[] arr2 = {1, 5, 15, 15, 25};
   int[] solucion = {1, 5, 15, 15, 25, 40, 40};
   do_check(arr1,arr2,solucion);
  }

  {
   int[] arr1 = {40, 40};
   int[] arr2 = {5, 5, 20, 35};
   int[] solucion = {5, 5, 20, 35, 40, 40};
   do_check(arr1,arr2,solucion);
  }

  {
   int[] arr1 = {40, 40};
   int[] arr2 = {1, 1, 5, 15, 20};
   int[] solucion = {1, 1, 5, 15, 20, 40, 40};
   do_check(arr1,arr2,solucion);
  }

  {
   int[] arr1 = {40, 40};
   int[] arr2 = {25, 35, 35, 40, 40};
   int[] solucion = {25, 35, 35, 40, 40, 40, 40};
   do_check(arr1,arr2,solucion);
  }

  {
   int[] arr1 = {40, 40};
   int[] arr2 = {20, 30, 30, 35, 40};
   int[] solucion = {20, 30, 30, 35, 40, 40, 40};
   do_check(arr1,arr2,solucion);
  }

  {
   int[] arr1 = {40, 40};
   int[] arr2 = {1, 1, 10, 25, 40};
   int[] solucion = {1, 1, 10, 25, 40, 40, 40};
   do_check(arr1,arr2,solucion);
  }

  {
   int[] arr1 = {1, 10};
   int[] arr2 = {1, 40};
   int[] solucion = {1, 1, 10, 40};
   do_check(arr1,arr2,solucion);
  }

  {
   int[] arr1 = {1, 10};
   int[] arr2 = {10, 15};
   int[] solucion = {1, 10, 10, 15};
   do_check(arr1,arr2,solucion);
  }

  {
   int[] arr1 = {1, 10};
   int[] arr2 = {20, 20};
   int[] solucion = {1, 10, 20, 20};
   do_check(arr1,arr2,solucion);
  }

  {
   int[] arr1 = {1, 10};
   int[] arr2 = {1, 40};
   int[] solucion = {1, 1, 10, 40};
   do_check(arr1,arr2,solucion);
  }

  {
   int[] arr1 = {1, 10};
   int[] arr2 = {10, 15};
   int[] solucion = {1, 10, 10, 15};
   do_check(arr1,arr2,solucion);
  }

  {
   int[] arr1 = {1, 10};
   int[] arr2 = {5, 35};
   int[] solucion = {1, 5, 10, 35};
   do_check(arr1,arr2,solucion);
  }

  {
   int[] arr1 = {1, 10};
   int[] arr2 = {10, 20, 20};
   int[] solucion = {1, 10, 10, 20, 20};
   do_check(arr1,arr2,solucion);
  }

  {
   int[] arr1 = {1, 10};
   int[] arr2 = {15, 35, 35};
   int[] solucion = {1, 10, 15, 35, 35};
   do_check(arr1,arr2,solucion);
  }

  {
   int[] arr1 = {1, 10};
   int[] arr2 = {25, 30, 40};
   int[] solucion = {1, 10, 25, 30, 40};
   do_check(arr1,arr2,solucion);
  }

  {
   int[] arr1 = {1, 10};
   int[] arr2 = {5, 5, 25};
   int[] solucion = {1, 5, 5, 10, 25};
   do_check(arr1,arr2,solucion);
  }

  {
   int[] arr1 = {1, 10};
   int[] arr2 = {5, 25, 40};
   int[] solucion = {1, 5, 10, 25, 40};
   do_check(arr1,arr2,solucion);
  }

  {
   int[] arr1 = {1, 10};
   int[] arr2 = {1, 35, 35};
   int[] solucion = {1, 1, 10, 35, 35};
   do_check(arr1,arr2,solucion);
  }

  {
   int[] arr1 = {1, 10};
   int[] arr2 = {5, 10, 20, 35};
   int[] solucion = {1, 5, 10, 10, 20, 35};
   do_check(arr1,arr2,solucion);
  }

  {
   int[] arr1 = {1, 10};
   int[] arr2 = {15, 25, 25, 35};
   int[] solucion = {1, 10, 15, 25, 25, 35};
   do_check(arr1,arr2,solucion);
  }

  {
   int[] arr1 = {1, 10};
   int[] arr2 = {25, 25, 35, 40};
   int[] solucion = {1, 10, 25, 25, 35, 40};
   do_check(arr1,arr2,solucion);
  }

  {
   int[] arr1 = {1, 10};
   int[] arr2 = {10, 15, 30, 30};
   int[] solucion = {1, 10, 10, 15, 30, 30};
   do_check(arr1,arr2,solucion);
  }

  {
   int[] arr1 = {1, 10};
   int[] arr2 = {10, 10, 15, 20};
   int[] solucion = {1, 10, 10, 10, 15, 20};
   do_check(arr1,arr2,solucion);
  }

  {
   int[] arr1 = {1, 10};
   int[] arr2 = {1, 5, 30, 35};
   int[] solucion = {1, 1, 5, 10, 30, 35};
   do_check(arr1,arr2,solucion);
  }

  {
   int[] arr1 = {1, 10};
   int[] arr2 = {1, 5, 15, 15, 25};
   int[] solucion = {1, 1, 5, 10, 15, 15, 25};
   do_check(arr1,arr2,solucion);
  }

  {
   int[] arr1 = {1, 10};
   int[] arr2 = {5, 5, 20, 35};
   int[] solucion = {1, 5, 5, 10, 20, 35};
   do_check(arr1,arr2,solucion);
  }

  {
   int[] arr1 = {1, 10};
   int[] arr2 = {1, 1, 5, 15, 20};
   int[] solucion = {1, 1, 1, 5, 10, 15, 20};
   do_check(arr1,arr2,solucion);
  }

  {
   int[] arr1 = {1, 10};
   int[] arr2 = {25, 35, 35, 40, 40};
   int[] solucion = {1, 10, 25, 35, 35, 40, 40};
   do_check(arr1,arr2,solucion);
  }

  {
   int[] arr1 = {1, 10};
   int[] arr2 = {20, 30, 30, 35, 40};
   int[] solucion = {1, 10, 20, 30, 30, 35, 40};
   do_check(arr1,arr2,solucion);
  }

  {
   int[] arr1 = {1, 10};
   int[] arr2 = {1, 1, 10, 25, 40};
   int[] solucion = {1, 1, 1, 10, 10, 25, 40};
   do_check(arr1,arr2,solucion);
  }

  {
   int[] arr1 = {15, 25};
   int[] arr2 = {1, 40};
   int[] solucion = {1, 15, 25, 40};
   do_check(arr1,arr2,solucion);
  }

  {
   int[] arr1 = {15, 25};
   int[] arr2 = {10, 15};
   int[] solucion = {10, 15, 15, 25};
   do_check(arr1,arr2,solucion);
  }

  {
   int[] arr1 = {15, 25};
   int[] arr2 = {20, 20};
   int[] solucion = {15, 20, 20, 25};
   do_check(arr1,arr2,solucion);
  }

  {
   int[] arr1 = {15, 25};
   int[] arr2 = {1, 40};
   int[] solucion = {1, 15, 25, 40};
   do_check(arr1,arr2,solucion);
  }

  {
   int[] arr1 = {15, 25};
   int[] arr2 = {10, 15};
   int[] solucion = {10, 15, 15, 25};
   do_check(arr1,arr2,solucion);
  }

  {
   int[] arr1 = {15, 25};
   int[] arr2 = {5, 35};
   int[] solucion = {5, 15, 25, 35};
   do_check(arr1,arr2,solucion);
  }

  {
   int[] arr1 = {15, 25};
   int[] arr2 = {10, 20, 20};
   int[] solucion = {10, 15, 20, 20, 25};
   do_check(arr1,arr2,solucion);
  }

  {
   int[] arr1 = {15, 25};
   int[] arr2 = {15, 35, 35};
   int[] solucion = {15, 15, 25, 35, 35};
   do_check(arr1,arr2,solucion);
  }

  {
   int[] arr1 = {15, 25};
   int[] arr2 = {25, 30, 40};
   int[] solucion = {15, 25, 25, 30, 40};
   do_check(arr1,arr2,solucion);
  }

  {
   int[] arr1 = {15, 25};
   int[] arr2 = {5, 5, 25};
   int[] solucion = {5, 5, 15, 25, 25};
   do_check(arr1,arr2,solucion);
  }

  {
   int[] arr1 = {15, 25};
   int[] arr2 = {5, 25, 40};
   int[] solucion = {5, 15, 25, 25, 40};
   do_check(arr1,arr2,solucion);
  }

  {
   int[] arr1 = {15, 25};
   int[] arr2 = {1, 35, 35};
   int[] solucion = {1, 15, 25, 35, 35};
   do_check(arr1,arr2,solucion);
  }

  {
   int[] arr1 = {15, 25};
   int[] arr2 = {5, 10, 20, 35};
   int[] solucion = {5, 10, 15, 20, 25, 35};
   do_check(arr1,arr2,solucion);
  }

  {
   int[] arr1 = {15, 25};
   int[] arr2 = {15, 25, 25, 35};
   int[] solucion = {15, 15, 25, 25, 25, 35};
   do_check(arr1,arr2,solucion);
  }

  {
   int[] arr1 = {15, 25};
   int[] arr2 = {25, 25, 35, 40};
   int[] solucion = {15, 25, 25, 25, 35, 40};
   do_check(arr1,arr2,solucion);
  }

  {
   int[] arr1 = {15, 25};
   int[] arr2 = {10, 15, 30, 30};
   int[] solucion = {10, 15, 15, 25, 30, 30};
   do_check(arr1,arr2,solucion);
  }

  {
   int[] arr1 = {15, 25};
   int[] arr2 = {10, 10, 15, 20};
   int[] solucion = {10, 10, 15, 15, 20, 25};
   do_check(arr1,arr2,solucion);
  }

  {
   int[] arr1 = {15, 25};
   int[] arr2 = {1, 5, 30, 35};
   int[] solucion = {1, 5, 15, 25, 30, 35};
   do_check(arr1,arr2,solucion);
  }

  {
   int[] arr1 = {15, 25};
   int[] arr2 = {1, 5, 15, 15, 25};
   int[] solucion = {1, 5, 15, 15, 15, 25, 25};
   do_check(arr1,arr2,solucion);
  }

  {
   int[] arr1 = {15, 25};
   int[] arr2 = {5, 5, 20, 35};
   int[] solucion = {5, 5, 15, 20, 25, 35};
   do_check(arr1,arr2,solucion);
  }

  {
   int[] arr1 = {15, 25};
   int[] arr2 = {1, 1, 5, 15, 20};
   int[] solucion = {1, 1, 5, 15, 15, 20, 25};
   do_check(arr1,arr2,solucion);
  }

  {
   int[] arr1 = {15, 25};
   int[] arr2 = {25, 35, 35, 40, 40};
   int[] solucion = {15, 25, 25, 35, 35, 40, 40};
   do_check(arr1,arr2,solucion);
  }

  {
   int[] arr1 = {15, 25};
   int[] arr2 = {20, 30, 30, 35, 40};
   int[] solucion = {15, 20, 25, 30, 30, 35, 40};
   do_check(arr1,arr2,solucion);
  }

  {
   int[] arr1 = {15, 25};
   int[] arr2 = {1, 1, 10, 25, 40};
   int[] solucion = {1, 1, 10, 15, 25, 25, 40};
   do_check(arr1,arr2,solucion);
  }

  {
   int[] arr1 = {10, 20, 20};
   int[] arr2 = {1, 40};
   int[] solucion = {1, 10, 20, 20, 40};
   do_check(arr1,arr2,solucion);
  }

  {
   int[] arr1 = {10, 20, 20};
   int[] arr2 = {10, 15};
   int[] solucion = {10, 10, 15, 20, 20};
   do_check(arr1,arr2,solucion);
  }

  {
   int[] arr1 = {10, 20, 20};
   int[] arr2 = {20, 20};
   int[] solucion = {10, 20, 20, 20, 20};
   do_check(arr1,arr2,solucion);
  }

  {
   int[] arr1 = {10, 20, 20};
   int[] arr2 = {1, 40};
   int[] solucion = {1, 10, 20, 20, 40};
   do_check(arr1,arr2,solucion);
  }

  {
   int[] arr1 = {10, 20, 20};
   int[] arr2 = {10, 15};
   int[] solucion = {10, 10, 15, 20, 20};
   do_check(arr1,arr2,solucion);
  }

  {
   int[] arr1 = {10, 20, 20};
   int[] arr2 = {5, 35};
   int[] solucion = {5, 10, 20, 20, 35};
   do_check(arr1,arr2,solucion);
  }

  {
   int[] arr1 = {10, 20, 20};
   int[] arr2 = {10, 20, 20};
   int[] solucion = {10, 10, 20, 20, 20, 20};
   do_check(arr1,arr2,solucion);
  }

  {
   int[] arr1 = {10, 20, 20};
   int[] arr2 = {15, 35, 35};
   int[] solucion = {10, 15, 20, 20, 35, 35};
   do_check(arr1,arr2,solucion);
  }

  {
   int[] arr1 = {10, 20, 20};
   int[] arr2 = {25, 30, 40};
   int[] solucion = {10, 20, 20, 25, 30, 40};
   do_check(arr1,arr2,solucion);
  }

  {
   int[] arr1 = {10, 20, 20};
   int[] arr2 = {5, 5, 25};
   int[] solucion = {5, 5, 10, 20, 20, 25};
   do_check(arr1,arr2,solucion);
  }

  {
   int[] arr1 = {10, 20, 20};
   int[] arr2 = {5, 25, 40};
   int[] solucion = {5, 10, 20, 20, 25, 40};
   do_check(arr1,arr2,solucion);
  }

  {
   int[] arr1 = {10, 20, 20};
   int[] arr2 = {1, 35, 35};
   int[] solucion = {1, 10, 20, 20, 35, 35};
   do_check(arr1,arr2,solucion);
  }

  {
   int[] arr1 = {10, 20, 20};
   int[] arr2 = {5, 10, 20, 35};
   int[] solucion = {5, 10, 10, 20, 20, 20, 35};
   do_check(arr1,arr2,solucion);
  }

  {
   int[] arr1 = {10, 20, 20};
   int[] arr2 = {15, 25, 25, 35};
   int[] solucion = {10, 15, 20, 20, 25, 25, 35};
   do_check(arr1,arr2,solucion);
  }

  {
   int[] arr1 = {10, 20, 20};
   int[] arr2 = {25, 25, 35, 40};
   int[] solucion = {10, 20, 20, 25, 25, 35, 40};
   do_check(arr1,arr2,solucion);
  }

  {
   int[] arr1 = {10, 20, 20};
   int[] arr2 = {10, 15, 30, 30};
   int[] solucion = {10, 10, 15, 20, 20, 30, 30};
   do_check(arr1,arr2,solucion);
  }

  {
   int[] arr1 = {10, 20, 20};
   int[] arr2 = {10, 10, 15, 20};
   int[] solucion = {10, 10, 10, 15, 20, 20, 20};
   do_check(arr1,arr2,solucion);
  }

  {
   int[] arr1 = {10, 20, 20};
   int[] arr2 = {1, 5, 30, 35};
   int[] solucion = {1, 5, 10, 20, 20, 30, 35};
   do_check(arr1,arr2,solucion);
  }

  {
   int[] arr1 = {10, 20, 20};
   int[] arr2 = {1, 5, 15, 15, 25};
   int[] solucion = {1, 5, 10, 15, 15, 20, 20, 25};
   do_check(arr1,arr2,solucion);
  }

  {
   int[] arr1 = {10, 20, 20};
   int[] arr2 = {5, 5, 20, 35};
   int[] solucion = {5, 5, 10, 20, 20, 20, 35};
   do_check(arr1,arr2,solucion);
  }

  {
   int[] arr1 = {10, 20, 20};
   int[] arr2 = {1, 1, 5, 15, 20};
   int[] solucion = {1, 1, 5, 10, 15, 20, 20, 20};
   do_check(arr1,arr2,solucion);
  }

  {
   int[] arr1 = {10, 20, 20};
   int[] arr2 = {25, 35, 35, 40, 40};
   int[] solucion = {10, 20, 20, 25, 35, 35, 40, 40};
   do_check(arr1,arr2,solucion);
  }

  {
   int[] arr1 = {10, 20, 20};
   int[] arr2 = {20, 30, 30, 35, 40};
   int[] solucion = {10, 20, 20, 20, 30, 30, 35, 40};
   do_check(arr1,arr2,solucion);
  }

  {
   int[] arr1 = {10, 20, 20};
   int[] arr2 = {1, 1, 10, 25, 40};
   int[] solucion = {1, 1, 10, 10, 20, 20, 25, 40};
   do_check(arr1,arr2,solucion);
  }

  {
   int[] arr1 = {5, 15, 35};
   int[] arr2 = {1, 40};
   int[] solucion = {1, 5, 15, 35, 40};
   do_check(arr1,arr2,solucion);
  }

  {
   int[] arr1 = {5, 15, 35};
   int[] arr2 = {10, 15};
   int[] solucion = {5, 10, 15, 15, 35};
   do_check(arr1,arr2,solucion);
  }

  {
   int[] arr1 = {5, 15, 35};
   int[] arr2 = {20, 20};
   int[] solucion = {5, 15, 20, 20, 35};
   do_check(arr1,arr2,solucion);
  }

  {
   int[] arr1 = {5, 15, 35};
   int[] arr2 = {1, 40};
   int[] solucion = {1, 5, 15, 35, 40};
   do_check(arr1,arr2,solucion);
  }

  {
   int[] arr1 = {5, 15, 35};
   int[] arr2 = {10, 15};
   int[] solucion = {5, 10, 15, 15, 35};
   do_check(arr1,arr2,solucion);
  }

  {
   int[] arr1 = {5, 15, 35};
   int[] arr2 = {5, 35};
   int[] solucion = {5, 5, 15, 35, 35};
   do_check(arr1,arr2,solucion);
  }

  {
   int[] arr1 = {5, 15, 35};
   int[] arr2 = {10, 20, 20};
   int[] solucion = {5, 10, 15, 20, 20, 35};
   do_check(arr1,arr2,solucion);
  }

  {
   int[] arr1 = {5, 15, 35};
   int[] arr2 = {15, 35, 35};
   int[] solucion = {5, 15, 15, 35, 35, 35};
   do_check(arr1,arr2,solucion);
  }

  {
   int[] arr1 = {5, 15, 35};
   int[] arr2 = {25, 30, 40};
   int[] solucion = {5, 15, 25, 30, 35, 40};
   do_check(arr1,arr2,solucion);
  }

  {
   int[] arr1 = {5, 15, 35};
   int[] arr2 = {5, 5, 25};
   int[] solucion = {5, 5, 5, 15, 25, 35};
   do_check(arr1,arr2,solucion);
  }

  {
   int[] arr1 = {5, 15, 35};
   int[] arr2 = {5, 25, 40};
   int[] solucion = {5, 5, 15, 25, 35, 40};
   do_check(arr1,arr2,solucion);
  }

  {
   int[] arr1 = {5, 15, 35};
   int[] arr2 = {1, 35, 35};
   int[] solucion = {1, 5, 15, 35, 35, 35};
   do_check(arr1,arr2,solucion);
  }

  {
   int[] arr1 = {5, 15, 35};
   int[] arr2 = {5, 10, 20, 35};
   int[] solucion = {5, 5, 10, 15, 20, 35, 35};
   do_check(arr1,arr2,solucion);
  }

  {
   int[] arr1 = {5, 15, 35};
   int[] arr2 = {15, 25, 25, 35};
   int[] solucion = {5, 15, 15, 25, 25, 35, 35};
   do_check(arr1,arr2,solucion);
  }

  {
   int[] arr1 = {5, 15, 35};
   int[] arr2 = {25, 25, 35, 40};
   int[] solucion = {5, 15, 25, 25, 35, 35, 40};
   do_check(arr1,arr2,solucion);
  }

  {
   int[] arr1 = {5, 15, 35};
   int[] arr2 = {10, 15, 30, 30};
   int[] solucion = {5, 10, 15, 15, 30, 30, 35};
   do_check(arr1,arr2,solucion);
  }

  {
   int[] arr1 = {5, 15, 35};
   int[] arr2 = {10, 10, 15, 20};
   int[] solucion = {5, 10, 10, 15, 15, 20, 35};
   do_check(arr1,arr2,solucion);
  }

  {
   int[] arr1 = {5, 15, 35};
   int[] arr2 = {1, 5, 30, 35};
   int[] solucion = {1, 5, 5, 15, 30, 35, 35};
   do_check(arr1,arr2,solucion);
  }

  {
   int[] arr1 = {5, 15, 35};
   int[] arr2 = {1, 5, 15, 15, 25};
   int[] solucion = {1, 5, 5, 15, 15, 15, 25, 35};
   do_check(arr1,arr2,solucion);
  }

  {
   int[] arr1 = {5, 15, 35};
   int[] arr2 = {5, 5, 20, 35};
   int[] solucion = {5, 5, 5, 15, 20, 35, 35};
   do_check(arr1,arr2,solucion);
  }

  {
   int[] arr1 = {5, 15, 35};
   int[] arr2 = {1, 1, 5, 15, 20};
   int[] solucion = {1, 1, 5, 5, 15, 15, 20, 35};
   do_check(arr1,arr2,solucion);
  }

  {
   int[] arr1 = {5, 15, 35};
   int[] arr2 = {25, 35, 35, 40, 40};
   int[] solucion = {5, 15, 25, 35, 35, 35, 40, 40};
   do_check(arr1,arr2,solucion);
  }

  {
   int[] arr1 = {5, 15, 35};
   int[] arr2 = {20, 30, 30, 35, 40};
   int[] solucion = {5, 15, 20, 30, 30, 35, 35, 40};
   do_check(arr1,arr2,solucion);
  }

  {
   int[] arr1 = {5, 15, 35};
   int[] arr2 = {1, 1, 10, 25, 40};
   int[] solucion = {1, 1, 5, 10, 15, 25, 35, 40};
   do_check(arr1,arr2,solucion);
  }

  {
   int[] arr1 = {20, 25, 30};
   int[] arr2 = {1, 40};
   int[] solucion = {1, 20, 25, 30, 40};
   do_check(arr1,arr2,solucion);
  }

  {
   int[] arr1 = {20, 25, 30};
   int[] arr2 = {10, 15};
   int[] solucion = {10, 15, 20, 25, 30};
   do_check(arr1,arr2,solucion);
  }

  {
   int[] arr1 = {20, 25, 30};
   int[] arr2 = {20, 20};
   int[] solucion = {20, 20, 20, 25, 30};
   do_check(arr1,arr2,solucion);
  }

  {
   int[] arr1 = {20, 25, 30};
   int[] arr2 = {1, 40};
   int[] solucion = {1, 20, 25, 30, 40};
   do_check(arr1,arr2,solucion);
  }

  {
   int[] arr1 = {20, 25, 30};
   int[] arr2 = {10, 15};
   int[] solucion = {10, 15, 20, 25, 30};
   do_check(arr1,arr2,solucion);
  }

  {
   int[] arr1 = {20, 25, 30};
   int[] arr2 = {5, 35};
   int[] solucion = {5, 20, 25, 30, 35};
   do_check(arr1,arr2,solucion);
  }

  {
   int[] arr1 = {20, 25, 30};
   int[] arr2 = {10, 20, 20};
   int[] solucion = {10, 20, 20, 20, 25, 30};
   do_check(arr1,arr2,solucion);
  }

  {
   int[] arr1 = {20, 25, 30};
   int[] arr2 = {15, 35, 35};
   int[] solucion = {15, 20, 25, 30, 35, 35};
   do_check(arr1,arr2,solucion);
  }

  {
   int[] arr1 = {20, 25, 30};
   int[] arr2 = {25, 30, 40};
   int[] solucion = {20, 25, 25, 30, 30, 40};
   do_check(arr1,arr2,solucion);
  }

  {
   int[] arr1 = {20, 25, 30};
   int[] arr2 = {5, 5, 25};
   int[] solucion = {5, 5, 20, 25, 25, 30};
   do_check(arr1,arr2,solucion);
  }

  {
   int[] arr1 = {20, 25, 30};
   int[] arr2 = {5, 25, 40};
   int[] solucion = {5, 20, 25, 25, 30, 40};
   do_check(arr1,arr2,solucion);
  }

  {
   int[] arr1 = {20, 25, 30};
   int[] arr2 = {1, 35, 35};
   int[] solucion = {1, 20, 25, 30, 35, 35};
   do_check(arr1,arr2,solucion);
  }

  {
   int[] arr1 = {20, 25, 30};
   int[] arr2 = {5, 10, 20, 35};
   int[] solucion = {5, 10, 20, 20, 25, 30, 35};
   do_check(arr1,arr2,solucion);
  }

  {
   int[] arr1 = {20, 25, 30};
   int[] arr2 = {15, 25, 25, 35};
   int[] solucion = {15, 20, 25, 25, 25, 30, 35};
   do_check(arr1,arr2,solucion);
  }

  {
   int[] arr1 = {20, 25, 30};
   int[] arr2 = {25, 25, 35, 40};
   int[] solucion = {20, 25, 25, 25, 30, 35, 40};
   do_check(arr1,arr2,solucion);
  }

  {
   int[] arr1 = {20, 25, 30};
   int[] arr2 = {10, 15, 30, 30};
   int[] solucion = {10, 15, 20, 25, 30, 30, 30};
   do_check(arr1,arr2,solucion);
  }

  {
   int[] arr1 = {20, 25, 30};
   int[] arr2 = {10, 10, 15, 20};
   int[] solucion = {10, 10, 15, 20, 20, 25, 30};
   do_check(arr1,arr2,solucion);
  }

  {
   int[] arr1 = {20, 25, 30};
   int[] arr2 = {1, 5, 30, 35};
   int[] solucion = {1, 5, 20, 25, 30, 30, 35};
   do_check(arr1,arr2,solucion);
  }

  {
   int[] arr1 = {20, 25, 30};
   int[] arr2 = {1, 5, 15, 15, 25};
   int[] solucion = {1, 5, 15, 15, 20, 25, 25, 30};
   do_check(arr1,arr2,solucion);
  }

  {
   int[] arr1 = {20, 25, 30};
   int[] arr2 = {5, 5, 20, 35};
   int[] solucion = {5, 5, 20, 20, 25, 30, 35};
   do_check(arr1,arr2,solucion);
  }

  {
   int[] arr1 = {20, 25, 30};
   int[] arr2 = {1, 1, 5, 15, 20};
   int[] solucion = {1, 1, 5, 15, 20, 20, 25, 30};
   do_check(arr1,arr2,solucion);
  }

  {
   int[] arr1 = {20, 25, 30};
   int[] arr2 = {25, 35, 35, 40, 40};
   int[] solucion = {20, 25, 25, 30, 35, 35, 40, 40};
   do_check(arr1,arr2,solucion);
  }

  {
   int[] arr1 = {20, 25, 30};
   int[] arr2 = {20, 30, 30, 35, 40};
   int[] solucion = {20, 20, 25, 30, 30, 30, 35, 40};
   do_check(arr1,arr2,solucion);
  }

  {
   int[] arr1 = {20, 25, 30};
   int[] arr2 = {1, 1, 10, 25, 40};
   int[] solucion = {1, 1, 10, 20, 25, 25, 30, 40};
   do_check(arr1,arr2,solucion);
  }

  {
   int[] arr1 = {10, 15, 40};
   int[] arr2 = {1, 40};
   int[] solucion = {1, 10, 15, 40, 40};
   do_check(arr1,arr2,solucion);
  }

  {
   int[] arr1 = {10, 15, 40};
   int[] arr2 = {10, 15};
   int[] solucion = {10, 10, 15, 15, 40};
   do_check(arr1,arr2,solucion);
  }

  {
   int[] arr1 = {10, 15, 40};
   int[] arr2 = {20, 20};
   int[] solucion = {10, 15, 20, 20, 40};
   do_check(arr1,arr2,solucion);
  }

  {
   int[] arr1 = {10, 15, 40};
   int[] arr2 = {1, 40};
   int[] solucion = {1, 10, 15, 40, 40};
   do_check(arr1,arr2,solucion);
  }

  {
   int[] arr1 = {10, 15, 40};
   int[] arr2 = {10, 15};
   int[] solucion = {10, 10, 15, 15, 40};
   do_check(arr1,arr2,solucion);
  }

  {
   int[] arr1 = {10, 15, 40};
   int[] arr2 = {5, 35};
   int[] solucion = {5, 10, 15, 35, 40};
   do_check(arr1,arr2,solucion);
  }

  {
   int[] arr1 = {10, 15, 40};
   int[] arr2 = {10, 20, 20};
   int[] solucion = {10, 10, 15, 20, 20, 40};
   do_check(arr1,arr2,solucion);
  }

  {
   int[] arr1 = {10, 15, 40};
   int[] arr2 = {15, 35, 35};
   int[] solucion = {10, 15, 15, 35, 35, 40};
   do_check(arr1,arr2,solucion);
  }

  {
   int[] arr1 = {10, 15, 40};
   int[] arr2 = {25, 30, 40};
   int[] solucion = {10, 15, 25, 30, 40, 40};
   do_check(arr1,arr2,solucion);
  }

  {
   int[] arr1 = {10, 15, 40};
   int[] arr2 = {5, 5, 25};
   int[] solucion = {5, 5, 10, 15, 25, 40};
   do_check(arr1,arr2,solucion);
  }

  {
   int[] arr1 = {10, 15, 40};
   int[] arr2 = {5, 25, 40};
   int[] solucion = {5, 10, 15, 25, 40, 40};
   do_check(arr1,arr2,solucion);
  }

  {
   int[] arr1 = {10, 15, 40};
   int[] arr2 = {1, 35, 35};
   int[] solucion = {1, 10, 15, 35, 35, 40};
   do_check(arr1,arr2,solucion);
  }

  {
   int[] arr1 = {10, 15, 40};
   int[] arr2 = {5, 10, 20, 35};
   int[] solucion = {5, 10, 10, 15, 20, 35, 40};
   do_check(arr1,arr2,solucion);
  }

  {
   int[] arr1 = {10, 15, 40};
   int[] arr2 = {15, 25, 25, 35};
   int[] solucion = {10, 15, 15, 25, 25, 35, 40};
   do_check(arr1,arr2,solucion);
  }

  {
   int[] arr1 = {10, 15, 40};
   int[] arr2 = {25, 25, 35, 40};
   int[] solucion = {10, 15, 25, 25, 35, 40, 40};
   do_check(arr1,arr2,solucion);
  }

  {
   int[] arr1 = {10, 15, 40};
   int[] arr2 = {10, 15, 30, 30};
   int[] solucion = {10, 10, 15, 15, 30, 30, 40};
   do_check(arr1,arr2,solucion);
  }

  {
   int[] arr1 = {10, 15, 40};
   int[] arr2 = {10, 10, 15, 20};
   int[] solucion = {10, 10, 10, 15, 15, 20, 40};
   do_check(arr1,arr2,solucion);
  }

  {
   int[] arr1 = {10, 15, 40};
   int[] arr2 = {1, 5, 30, 35};
   int[] solucion = {1, 5, 10, 15, 30, 35, 40};
   do_check(arr1,arr2,solucion);
  }

  {
   int[] arr1 = {10, 15, 40};
   int[] arr2 = {1, 5, 15, 15, 25};
   int[] solucion = {1, 5, 10, 15, 15, 15, 25, 40};
   do_check(arr1,arr2,solucion);
  }

  {
   int[] arr1 = {10, 15, 40};
   int[] arr2 = {5, 5, 20, 35};
   int[] solucion = {5, 5, 10, 15, 20, 35, 40};
   do_check(arr1,arr2,solucion);
  }

  {
   int[] arr1 = {10, 15, 40};
   int[] arr2 = {1, 1, 5, 15, 20};
   int[] solucion = {1, 1, 5, 10, 15, 15, 20, 40};
   do_check(arr1,arr2,solucion);
  }

  {
   int[] arr1 = {10, 15, 40};
   int[] arr2 = {25, 35, 35, 40, 40};
   int[] solucion = {10, 15, 25, 35, 35, 40, 40, 40};
   do_check(arr1,arr2,solucion);
  }

  {
   int[] arr1 = {10, 15, 40};
   int[] arr2 = {20, 30, 30, 35, 40};
   int[] solucion = {10, 15, 20, 30, 30, 35, 40, 40};
   do_check(arr1,arr2,solucion);
  }

  {
   int[] arr1 = {10, 15, 40};
   int[] arr2 = {1, 1, 10, 25, 40};
   int[] solucion = {1, 1, 10, 10, 15, 25, 40, 40};
   do_check(arr1,arr2,solucion);
  }

  {
   int[] arr1 = {1, 10};
   int[] arr2 = {1, 40};
   int[] solucion = {1, 1, 10, 40};
   do_check(arr1,arr2,solucion);
  }

  {
   int[] arr1 = {1, 10};
   int[] arr2 = {10, 15};
   int[] solucion = {1, 10, 10, 15};
   do_check(arr1,arr2,solucion);
  }

  {
   int[] arr1 = {1, 10};
   int[] arr2 = {20, 20};
   int[] solucion = {1, 10, 20, 20};
   do_check(arr1,arr2,solucion);
  }

  {
   int[] arr1 = {1, 10};
   int[] arr2 = {1, 40};
   int[] solucion = {1, 1, 10, 40};
   do_check(arr1,arr2,solucion);
  }

  {
   int[] arr1 = {1, 10};
   int[] arr2 = {10, 15};
   int[] solucion = {1, 10, 10, 15};
   do_check(arr1,arr2,solucion);
  }

  {
   int[] arr1 = {1, 10};
   int[] arr2 = {5, 35};
   int[] solucion = {1, 5, 10, 35};
   do_check(arr1,arr2,solucion);
  }

  {
   int[] arr1 = {1, 10};
   int[] arr2 = {10, 20, 20};
   int[] solucion = {1, 10, 10, 20, 20};
   do_check(arr1,arr2,solucion);
  }

  {
   int[] arr1 = {1, 10};
   int[] arr2 = {15, 35, 35};
   int[] solucion = {1, 10, 15, 35, 35};
   do_check(arr1,arr2,solucion);
  }

  {
   int[] arr1 = {1, 10};
   int[] arr2 = {25, 30, 40};
   int[] solucion = {1, 10, 25, 30, 40};
   do_check(arr1,arr2,solucion);
  }

  {
   int[] arr1 = {1, 10};
   int[] arr2 = {5, 5, 25};
   int[] solucion = {1, 5, 5, 10, 25};
   do_check(arr1,arr2,solucion);
  }

  {
   int[] arr1 = {1, 10};
   int[] arr2 = {5, 25, 40};
   int[] solucion = {1, 5, 10, 25, 40};
   do_check(arr1,arr2,solucion);
  }

  {
   int[] arr1 = {1, 10};
   int[] arr2 = {1, 35, 35};
   int[] solucion = {1, 1, 10, 35, 35};
   do_check(arr1,arr2,solucion);
  }

  {
   int[] arr1 = {1, 10};
   int[] arr2 = {5, 10, 20, 35};
   int[] solucion = {1, 5, 10, 10, 20, 35};
   do_check(arr1,arr2,solucion);
  }

  {
   int[] arr1 = {1, 10};
   int[] arr2 = {15, 25, 25, 35};
   int[] solucion = {1, 10, 15, 25, 25, 35};
   do_check(arr1,arr2,solucion);
  }

  {
   int[] arr1 = {1, 10};
   int[] arr2 = {25, 25, 35, 40};
   int[] solucion = {1, 10, 25, 25, 35, 40};
   do_check(arr1,arr2,solucion);
  }

  {
   int[] arr1 = {1, 10};
   int[] arr2 = {10, 15, 30, 30};
   int[] solucion = {1, 10, 10, 15, 30, 30};
   do_check(arr1,arr2,solucion);
  }

  {
   int[] arr1 = {1, 10};
   int[] arr2 = {10, 10, 15, 20};
   int[] solucion = {1, 10, 10, 10, 15, 20};
   do_check(arr1,arr2,solucion);
  }

  {
   int[] arr1 = {1, 10};
   int[] arr2 = {1, 5, 30, 35};
   int[] solucion = {1, 1, 5, 10, 30, 35};
   do_check(arr1,arr2,solucion);
  }

  {
   int[] arr1 = {1, 10};
   int[] arr2 = {1, 5, 15, 15, 25};
   int[] solucion = {1, 1, 5, 10, 15, 15, 25};
   do_check(arr1,arr2,solucion);
  }

  {
   int[] arr1 = {1, 10};
   int[] arr2 = {5, 5, 20, 35};
   int[] solucion = {1, 5, 5, 10, 20, 35};
   do_check(arr1,arr2,solucion);
  }

  {
   int[] arr1 = {1, 10};
   int[] arr2 = {1, 1, 5, 15, 20};
   int[] solucion = {1, 1, 1, 5, 10, 15, 20};
   do_check(arr1,arr2,solucion);
  }

  {
   int[] arr1 = {1, 10};
   int[] arr2 = {25, 35, 35, 40, 40};
   int[] solucion = {1, 10, 25, 35, 35, 40, 40};
   do_check(arr1,arr2,solucion);
  }

  {
   int[] arr1 = {1, 10};
   int[] arr2 = {20, 30, 30, 35, 40};
   int[] solucion = {1, 10, 20, 30, 30, 35, 40};
   do_check(arr1,arr2,solucion);
  }

  {
   int[] arr1 = {1, 10};
   int[] arr2 = {1, 1, 10, 25, 40};
   int[] solucion = {1, 1, 1, 10, 10, 25, 40};
   do_check(arr1,arr2,solucion);
  }

  {
   int[] arr1 = {15, 25, 35};
   int[] arr2 = {1, 40};
   int[] solucion = {1, 15, 25, 35, 40};
   do_check(arr1,arr2,solucion);
  }

  {
   int[] arr1 = {15, 25, 35};
   int[] arr2 = {10, 15};
   int[] solucion = {10, 15, 15, 25, 35};
   do_check(arr1,arr2,solucion);
  }

  {
   int[] arr1 = {15, 25, 35};
   int[] arr2 = {20, 20};
   int[] solucion = {15, 20, 20, 25, 35};
   do_check(arr1,arr2,solucion);
  }

  {
   int[] arr1 = {15, 25, 35};
   int[] arr2 = {1, 40};
   int[] solucion = {1, 15, 25, 35, 40};
   do_check(arr1,arr2,solucion);
  }

  {
   int[] arr1 = {15, 25, 35};
   int[] arr2 = {10, 15};
   int[] solucion = {10, 15, 15, 25, 35};
   do_check(arr1,arr2,solucion);
  }

  {
   int[] arr1 = {15, 25, 35};
   int[] arr2 = {5, 35};
   int[] solucion = {5, 15, 25, 35, 35};
   do_check(arr1,arr2,solucion);
  }

  {
   int[] arr1 = {15, 25, 35};
   int[] arr2 = {10, 20, 20};
   int[] solucion = {10, 15, 20, 20, 25, 35};
   do_check(arr1,arr2,solucion);
  }

  {
   int[] arr1 = {15, 25, 35};
   int[] arr2 = {15, 35, 35};
   int[] solucion = {15, 15, 25, 35, 35, 35};
   do_check(arr1,arr2,solucion);
  }

  {
   int[] arr1 = {15, 25, 35};
   int[] arr2 = {25, 30, 40};
   int[] solucion = {15, 25, 25, 30, 35, 40};
   do_check(arr1,arr2,solucion);
  }

  {
   int[] arr1 = {15, 25, 35};
   int[] arr2 = {5, 5, 25};
   int[] solucion = {5, 5, 15, 25, 25, 35};
   do_check(arr1,arr2,solucion);
  }

  {
   int[] arr1 = {15, 25, 35};
   int[] arr2 = {5, 25, 40};
   int[] solucion = {5, 15, 25, 25, 35, 40};
   do_check(arr1,arr2,solucion);
  }

  {
   int[] arr1 = {15, 25, 35};
   int[] arr2 = {1, 35, 35};
   int[] solucion = {1, 15, 25, 35, 35, 35};
   do_check(arr1,arr2,solucion);
  }

  {
   int[] arr1 = {15, 25, 35};
   int[] arr2 = {5, 10, 20, 35};
   int[] solucion = {5, 10, 15, 20, 25, 35, 35};
   do_check(arr1,arr2,solucion);
  }

  {
   int[] arr1 = {15, 25, 35};
   int[] arr2 = {15, 25, 25, 35};
   int[] solucion = {15, 15, 25, 25, 25, 35, 35};
   do_check(arr1,arr2,solucion);
  }

  {
   int[] arr1 = {15, 25, 35};
   int[] arr2 = {25, 25, 35, 40};
   int[] solucion = {15, 25, 25, 25, 35, 35, 40};
   do_check(arr1,arr2,solucion);
  }

  {
   int[] arr1 = {15, 25, 35};
   int[] arr2 = {10, 15, 30, 30};
   int[] solucion = {10, 15, 15, 25, 30, 30, 35};
   do_check(arr1,arr2,solucion);
  }

  {
   int[] arr1 = {15, 25, 35};
   int[] arr2 = {10, 10, 15, 20};
   int[] solucion = {10, 10, 15, 15, 20, 25, 35};
   do_check(arr1,arr2,solucion);
  }

  {
   int[] arr1 = {15, 25, 35};
   int[] arr2 = {1, 5, 30, 35};
   int[] solucion = {1, 5, 15, 25, 30, 35, 35};
   do_check(arr1,arr2,solucion);
  }

  {
   int[] arr1 = {15, 25, 35};
   int[] arr2 = {1, 5, 15, 15, 25};
   int[] solucion = {1, 5, 15, 15, 15, 25, 25, 35};
   do_check(arr1,arr2,solucion);
  }

  {
   int[] arr1 = {15, 25, 35};
   int[] arr2 = {5, 5, 20, 35};
   int[] solucion = {5, 5, 15, 20, 25, 35, 35};
   do_check(arr1,arr2,solucion);
  }

  {
   int[] arr1 = {15, 25, 35};
   int[] arr2 = {1, 1, 5, 15, 20};
   int[] solucion = {1, 1, 5, 15, 15, 20, 25, 35};
   do_check(arr1,arr2,solucion);
  }

  {
   int[] arr1 = {15, 25, 35};
   int[] arr2 = {25, 35, 35, 40, 40};
   int[] solucion = {15, 25, 25, 35, 35, 35, 40, 40};
   do_check(arr1,arr2,solucion);
  }

  {
   int[] arr1 = {15, 25, 35};
   int[] arr2 = {20, 30, 30, 35, 40};
   int[] solucion = {15, 20, 25, 30, 30, 35, 35, 40};
   do_check(arr1,arr2,solucion);
  }

  {
   int[] arr1 = {15, 25, 35};
   int[] arr2 = {1, 1, 10, 25, 40};
   int[] solucion = {1, 1, 10, 15, 25, 25, 35, 40};
   do_check(arr1,arr2,solucion);
  }

  {
   int[] arr1 = {10, 10, 15, 40};
   int[] arr2 = {1, 40};
   int[] solucion = {1, 10, 10, 15, 40, 40};
   do_check(arr1,arr2,solucion);
  }

  {
   int[] arr1 = {10, 10, 15, 40};
   int[] arr2 = {10, 15};
   int[] solucion = {10, 10, 10, 15, 15, 40};
   do_check(arr1,arr2,solucion);
  }

  {
   int[] arr1 = {10, 10, 15, 40};
   int[] arr2 = {20, 20};
   int[] solucion = {10, 10, 15, 20, 20, 40};
   do_check(arr1,arr2,solucion);
  }

  {
   int[] arr1 = {10, 10, 15, 40};
   int[] arr2 = {1, 40};
   int[] solucion = {1, 10, 10, 15, 40, 40};
   do_check(arr1,arr2,solucion);
  }

  {
   int[] arr1 = {10, 10, 15, 40};
   int[] arr2 = {10, 15};
   int[] solucion = {10, 10, 10, 15, 15, 40};
   do_check(arr1,arr2,solucion);
  }

  {
   int[] arr1 = {10, 10, 15, 40};
   int[] arr2 = {5, 35};
   int[] solucion = {5, 10, 10, 15, 35, 40};
   do_check(arr1,arr2,solucion);
  }

  {
   int[] arr1 = {10, 10, 15, 40};
   int[] arr2 = {10, 20, 20};
   int[] solucion = {10, 10, 10, 15, 20, 20, 40};
   do_check(arr1,arr2,solucion);
  }

  {
   int[] arr1 = {10, 10, 15, 40};
   int[] arr2 = {15, 35, 35};
   int[] solucion = {10, 10, 15, 15, 35, 35, 40};
   do_check(arr1,arr2,solucion);
  }

  {
   int[] arr1 = {10, 10, 15, 40};
   int[] arr2 = {25, 30, 40};
   int[] solucion = {10, 10, 15, 25, 30, 40, 40};
   do_check(arr1,arr2,solucion);
  }

  {
   int[] arr1 = {10, 10, 15, 40};
   int[] arr2 = {5, 5, 25};
   int[] solucion = {5, 5, 10, 10, 15, 25, 40};
   do_check(arr1,arr2,solucion);
  }

  {
   int[] arr1 = {10, 10, 15, 40};
   int[] arr2 = {5, 25, 40};
   int[] solucion = {5, 10, 10, 15, 25, 40, 40};
   do_check(arr1,arr2,solucion);
  }

  {
   int[] arr1 = {10, 10, 15, 40};
   int[] arr2 = {1, 35, 35};
   int[] solucion = {1, 10, 10, 15, 35, 35, 40};
   do_check(arr1,arr2,solucion);
  }

  {
   int[] arr1 = {10, 10, 15, 40};
   int[] arr2 = {5, 10, 20, 35};
   int[] solucion = {5, 10, 10, 10, 15, 20, 35, 40};
   do_check(arr1,arr2,solucion);
  }

  {
   int[] arr1 = {10, 10, 15, 40};
   int[] arr2 = {15, 25, 25, 35};
   int[] solucion = {10, 10, 15, 15, 25, 25, 35, 40};
   do_check(arr1,arr2,solucion);
  }

  {
   int[] arr1 = {10, 10, 15, 40};
   int[] arr2 = {25, 25, 35, 40};
   int[] solucion = {10, 10, 15, 25, 25, 35, 40, 40};
   do_check(arr1,arr2,solucion);
  }

  {
   int[] arr1 = {10, 10, 15, 40};
   int[] arr2 = {10, 15, 30, 30};
   int[] solucion = {10, 10, 10, 15, 15, 30, 30, 40};
   do_check(arr1,arr2,solucion);
  }

  {
   int[] arr1 = {10, 10, 15, 40};
   int[] arr2 = {10, 10, 15, 20};
   int[] solucion = {10, 10, 10, 10, 15, 15, 20, 40};
   do_check(arr1,arr2,solucion);
  }

  {
   int[] arr1 = {10, 10, 15, 40};
   int[] arr2 = {1, 5, 30, 35};
   int[] solucion = {1, 5, 10, 10, 15, 30, 35, 40};
   do_check(arr1,arr2,solucion);
  }

  {
   int[] arr1 = {10, 10, 15, 40};
   int[] arr2 = {1, 5, 15, 15, 25};
   int[] solucion = {1, 5, 10, 10, 15, 15, 15, 25, 40};
   do_check(arr1,arr2,solucion);
  }

  {
   int[] arr1 = {10, 10, 15, 40};
   int[] arr2 = {5, 5, 20, 35};
   int[] solucion = {5, 5, 10, 10, 15, 20, 35, 40};
   do_check(arr1,arr2,solucion);
  }

  {
   int[] arr1 = {10, 10, 15, 40};
   int[] arr2 = {1, 1, 5, 15, 20};
   int[] solucion = {1, 1, 5, 10, 10, 15, 15, 20, 40};
   do_check(arr1,arr2,solucion);
  }

  {
   int[] arr1 = {10, 10, 15, 40};
   int[] arr2 = {25, 35, 35, 40, 40};
   int[] solucion = {10, 10, 15, 25, 35, 35, 40, 40, 40};
   do_check(arr1,arr2,solucion);
  }

  {
   int[] arr1 = {10, 10, 15, 40};
   int[] arr2 = {20, 30, 30, 35, 40};
   int[] solucion = {10, 10, 15, 20, 30, 30, 35, 40, 40};
   do_check(arr1,arr2,solucion);
  }

  {
   int[] arr1 = {10, 10, 15, 40};
   int[] arr2 = {1, 1, 10, 25, 40};
   int[] solucion = {1, 1, 10, 10, 10, 15, 25, 40, 40};
   do_check(arr1,arr2,solucion);
  }

  {
   int[] arr1 = {20, 20, 25, 35};
   int[] arr2 = {1, 40};
   int[] solucion = {1, 20, 20, 25, 35, 40};
   do_check(arr1,arr2,solucion);
  }

  {
   int[] arr1 = {20, 20, 25, 35};
   int[] arr2 = {10, 15};
   int[] solucion = {10, 15, 20, 20, 25, 35};
   do_check(arr1,arr2,solucion);
  }

  {
   int[] arr1 = {20, 20, 25, 35};
   int[] arr2 = {20, 20};
   int[] solucion = {20, 20, 20, 20, 25, 35};
   do_check(arr1,arr2,solucion);
  }

  {
   int[] arr1 = {20, 20, 25, 35};
   int[] arr2 = {1, 40};
   int[] solucion = {1, 20, 20, 25, 35, 40};
   do_check(arr1,arr2,solucion);
  }

  {
   int[] arr1 = {20, 20, 25, 35};
   int[] arr2 = {10, 15};
   int[] solucion = {10, 15, 20, 20, 25, 35};
   do_check(arr1,arr2,solucion);
  }

  {
   int[] arr1 = {20, 20, 25, 35};
   int[] arr2 = {5, 35};
   int[] solucion = {5, 20, 20, 25, 35, 35};
   do_check(arr1,arr2,solucion);
  }

  {
   int[] arr1 = {20, 20, 25, 35};
   int[] arr2 = {10, 20, 20};
   int[] solucion = {10, 20, 20, 20, 20, 25, 35};
   do_check(arr1,arr2,solucion);
  }

  {
   int[] arr1 = {20, 20, 25, 35};
   int[] arr2 = {15, 35, 35};
   int[] solucion = {15, 20, 20, 25, 35, 35, 35};
   do_check(arr1,arr2,solucion);
  }

  {
   int[] arr1 = {20, 20, 25, 35};
   int[] arr2 = {25, 30, 40};
   int[] solucion = {20, 20, 25, 25, 30, 35, 40};
   do_check(arr1,arr2,solucion);
  }

  {
   int[] arr1 = {20, 20, 25, 35};
   int[] arr2 = {5, 5, 25};
   int[] solucion = {5, 5, 20, 20, 25, 25, 35};
   do_check(arr1,arr2,solucion);
  }

  {
   int[] arr1 = {20, 20, 25, 35};
   int[] arr2 = {5, 25, 40};
   int[] solucion = {5, 20, 20, 25, 25, 35, 40};
   do_check(arr1,arr2,solucion);
  }

  {
   int[] arr1 = {20, 20, 25, 35};
   int[] arr2 = {1, 35, 35};
   int[] solucion = {1, 20, 20, 25, 35, 35, 35};
   do_check(arr1,arr2,solucion);
  }

  {
   int[] arr1 = {20, 20, 25, 35};
   int[] arr2 = {5, 10, 20, 35};
   int[] solucion = {5, 10, 20, 20, 20, 25, 35, 35};
   do_check(arr1,arr2,solucion);
  }

  {
   int[] arr1 = {20, 20, 25, 35};
   int[] arr2 = {15, 25, 25, 35};
   int[] solucion = {15, 20, 20, 25, 25, 25, 35, 35};
   do_check(arr1,arr2,solucion);
  }

  {
   int[] arr1 = {20, 20, 25, 35};
   int[] arr2 = {25, 25, 35, 40};
   int[] solucion = {20, 20, 25, 25, 25, 35, 35, 40};
   do_check(arr1,arr2,solucion);
  }

  {
   int[] arr1 = {20, 20, 25, 35};
   int[] arr2 = {10, 15, 30, 30};
   int[] solucion = {10, 15, 20, 20, 25, 30, 30, 35};
   do_check(arr1,arr2,solucion);
  }

  {
   int[] arr1 = {20, 20, 25, 35};
   int[] arr2 = {10, 10, 15, 20};
   int[] solucion = {10, 10, 15, 20, 20, 20, 25, 35};
   do_check(arr1,arr2,solucion);
  }

  {
   int[] arr1 = {20, 20, 25, 35};
   int[] arr2 = {1, 5, 30, 35};
   int[] solucion = {1, 5, 20, 20, 25, 30, 35, 35};
   do_check(arr1,arr2,solucion);
  }

  {
   int[] arr1 = {20, 20, 25, 35};
   int[] arr2 = {1, 5, 15, 15, 25};
   int[] solucion = {1, 5, 15, 15, 20, 20, 25, 25, 35};
   do_check(arr1,arr2,solucion);
  }

  {
   int[] arr1 = {20, 20, 25, 35};
   int[] arr2 = {5, 5, 20, 35};
   int[] solucion = {5, 5, 20, 20, 20, 25, 35, 35};
   do_check(arr1,arr2,solucion);
  }

  {
   int[] arr1 = {20, 20, 25, 35};
   int[] arr2 = {1, 1, 5, 15, 20};
   int[] solucion = {1, 1, 5, 15, 20, 20, 20, 25, 35};
   do_check(arr1,arr2,solucion);
  }

  {
   int[] arr1 = {20, 20, 25, 35};
   int[] arr2 = {25, 35, 35, 40, 40};
   int[] solucion = {20, 20, 25, 25, 35, 35, 35, 40, 40};
   do_check(arr1,arr2,solucion);
  }

  {
   int[] arr1 = {20, 20, 25, 35};
   int[] arr2 = {20, 30, 30, 35, 40};
   int[] solucion = {20, 20, 20, 25, 30, 30, 35, 35, 40};
   do_check(arr1,arr2,solucion);
  }

  {
   int[] arr1 = {20, 20, 25, 35};
   int[] arr2 = {1, 1, 10, 25, 40};
   int[] solucion = {1, 1, 10, 20, 20, 25, 25, 35, 40};
   do_check(arr1,arr2,solucion);
  }

  {
   int[] arr1 = {1, 5, 10, 40};
   int[] arr2 = {1, 40};
   int[] solucion = {1, 1, 5, 10, 40, 40};
   do_check(arr1,arr2,solucion);
  }

  {
   int[] arr1 = {1, 5, 10, 40};
   int[] arr2 = {10, 15};
   int[] solucion = {1, 5, 10, 10, 15, 40};
   do_check(arr1,arr2,solucion);
  }

  {
   int[] arr1 = {1, 5, 10, 40};
   int[] arr2 = {20, 20};
   int[] solucion = {1, 5, 10, 20, 20, 40};
   do_check(arr1,arr2,solucion);
  }

  {
   int[] arr1 = {1, 5, 10, 40};
   int[] arr2 = {1, 40};
   int[] solucion = {1, 1, 5, 10, 40, 40};
   do_check(arr1,arr2,solucion);
  }

  {
   int[] arr1 = {1, 5, 10, 40};
   int[] arr2 = {10, 15};
   int[] solucion = {1, 5, 10, 10, 15, 40};
   do_check(arr1,arr2,solucion);
  }

  {
   int[] arr1 = {1, 5, 10, 40};
   int[] arr2 = {5, 35};
   int[] solucion = {1, 5, 5, 10, 35, 40};
   do_check(arr1,arr2,solucion);
  }

  {
   int[] arr1 = {1, 5, 10, 40};
   int[] arr2 = {10, 20, 20};
   int[] solucion = {1, 5, 10, 10, 20, 20, 40};
   do_check(arr1,arr2,solucion);
  }

  {
   int[] arr1 = {1, 5, 10, 40};
   int[] arr2 = {15, 35, 35};
   int[] solucion = {1, 5, 10, 15, 35, 35, 40};
   do_check(arr1,arr2,solucion);
  }

  {
   int[] arr1 = {1, 5, 10, 40};
   int[] arr2 = {25, 30, 40};
   int[] solucion = {1, 5, 10, 25, 30, 40, 40};
   do_check(arr1,arr2,solucion);
  }

  {
   int[] arr1 = {1, 5, 10, 40};
   int[] arr2 = {5, 5, 25};
   int[] solucion = {1, 5, 5, 5, 10, 25, 40};
   do_check(arr1,arr2,solucion);
  }

  {
   int[] arr1 = {1, 5, 10, 40};
   int[] arr2 = {5, 25, 40};
   int[] solucion = {1, 5, 5, 10, 25, 40, 40};
   do_check(arr1,arr2,solucion);
  }

  {
   int[] arr1 = {1, 5, 10, 40};
   int[] arr2 = {1, 35, 35};
   int[] solucion = {1, 1, 5, 10, 35, 35, 40};
   do_check(arr1,arr2,solucion);
  }

  {
   int[] arr1 = {1, 5, 10, 40};
   int[] arr2 = {5, 10, 20, 35};
   int[] solucion = {1, 5, 5, 10, 10, 20, 35, 40};
   do_check(arr1,arr2,solucion);
  }

  {
   int[] arr1 = {1, 5, 10, 40};
   int[] arr2 = {15, 25, 25, 35};
   int[] solucion = {1, 5, 10, 15, 25, 25, 35, 40};
   do_check(arr1,arr2,solucion);
  }

  {
   int[] arr1 = {1, 5, 10, 40};
   int[] arr2 = {25, 25, 35, 40};
   int[] solucion = {1, 5, 10, 25, 25, 35, 40, 40};
   do_check(arr1,arr2,solucion);
  }

  {
   int[] arr1 = {1, 5, 10, 40};
   int[] arr2 = {10, 15, 30, 30};
   int[] solucion = {1, 5, 10, 10, 15, 30, 30, 40};
   do_check(arr1,arr2,solucion);
  }

  {
   int[] arr1 = {1, 5, 10, 40};
   int[] arr2 = {10, 10, 15, 20};
   int[] solucion = {1, 5, 10, 10, 10, 15, 20, 40};
   do_check(arr1,arr2,solucion);
  }

  {
   int[] arr1 = {1, 5, 10, 40};
   int[] arr2 = {1, 5, 30, 35};
   int[] solucion = {1, 1, 5, 5, 10, 30, 35, 40};
   do_check(arr1,arr2,solucion);
  }

  {
   int[] arr1 = {1, 5, 10, 40};
   int[] arr2 = {1, 5, 15, 15, 25};
   int[] solucion = {1, 1, 5, 5, 10, 15, 15, 25, 40};
   do_check(arr1,arr2,solucion);
  }

  {
   int[] arr1 = {1, 5, 10, 40};
   int[] arr2 = {5, 5, 20, 35};
   int[] solucion = {1, 5, 5, 5, 10, 20, 35, 40};
   do_check(arr1,arr2,solucion);
  }

  {
   int[] arr1 = {1, 5, 10, 40};
   int[] arr2 = {1, 1, 5, 15, 20};
   int[] solucion = {1, 1, 1, 5, 5, 10, 15, 20, 40};
   do_check(arr1,arr2,solucion);
  }

  {
   int[] arr1 = {1, 5, 10, 40};
   int[] arr2 = {25, 35, 35, 40, 40};
   int[] solucion = {1, 5, 10, 25, 35, 35, 40, 40, 40};
   do_check(arr1,arr2,solucion);
  }

  {
   int[] arr1 = {1, 5, 10, 40};
   int[] arr2 = {20, 30, 30, 35, 40};
   int[] solucion = {1, 5, 10, 20, 30, 30, 35, 40, 40};
   do_check(arr1,arr2,solucion);
  }

  {
   int[] arr1 = {1, 5, 10, 40};
   int[] arr2 = {1, 1, 10, 25, 40};
   int[] solucion = {1, 1, 1, 5, 10, 10, 25, 40, 40};
   do_check(arr1,arr2,solucion);
  }

  {
   int[] arr1 = {5, 5, 10, 10};
   int[] arr2 = {1, 40};
   int[] solucion = {1, 5, 5, 10, 10, 40};
   do_check(arr1,arr2,solucion);
  }

  {
   int[] arr1 = {5, 5, 10, 10};
   int[] arr2 = {10, 15};
   int[] solucion = {5, 5, 10, 10, 10, 15};
   do_check(arr1,arr2,solucion);
  }

  {
   int[] arr1 = {5, 5, 10, 10};
   int[] arr2 = {20, 20};
   int[] solucion = {5, 5, 10, 10, 20, 20};
   do_check(arr1,arr2,solucion);
  }

  {
   int[] arr1 = {5, 5, 10, 10};
   int[] arr2 = {1, 40};
   int[] solucion = {1, 5, 5, 10, 10, 40};
   do_check(arr1,arr2,solucion);
  }

  {
   int[] arr1 = {5, 5, 10, 10};
   int[] arr2 = {10, 15};
   int[] solucion = {5, 5, 10, 10, 10, 15};
   do_check(arr1,arr2,solucion);
  }

  {
   int[] arr1 = {5, 5, 10, 10};
   int[] arr2 = {5, 35};
   int[] solucion = {5, 5, 5, 10, 10, 35};
   do_check(arr1,arr2,solucion);
  }

  {
   int[] arr1 = {5, 5, 10, 10};
   int[] arr2 = {10, 20, 20};
   int[] solucion = {5, 5, 10, 10, 10, 20, 20};
   do_check(arr1,arr2,solucion);
  }

  {
   int[] arr1 = {5, 5, 10, 10};
   int[] arr2 = {15, 35, 35};
   int[] solucion = {5, 5, 10, 10, 15, 35, 35};
   do_check(arr1,arr2,solucion);
  }

  {
   int[] arr1 = {5, 5, 10, 10};
   int[] arr2 = {25, 30, 40};
   int[] solucion = {5, 5, 10, 10, 25, 30, 40};
   do_check(arr1,arr2,solucion);
  }

  {
   int[] arr1 = {5, 5, 10, 10};
   int[] arr2 = {5, 5, 25};
   int[] solucion = {5, 5, 5, 5, 10, 10, 25};
   do_check(arr1,arr2,solucion);
  }

  {
   int[] arr1 = {5, 5, 10, 10};
   int[] arr2 = {5, 25, 40};
   int[] solucion = {5, 5, 5, 10, 10, 25, 40};
   do_check(arr1,arr2,solucion);
  }

  {
   int[] arr1 = {5, 5, 10, 10};
   int[] arr2 = {1, 35, 35};
   int[] solucion = {1, 5, 5, 10, 10, 35, 35};
   do_check(arr1,arr2,solucion);
  }

  {
   int[] arr1 = {5, 5, 10, 10};
   int[] arr2 = {5, 10, 20, 35};
   int[] solucion = {5, 5, 5, 10, 10, 10, 20, 35};
   do_check(arr1,arr2,solucion);
  }

  {
   int[] arr1 = {5, 5, 10, 10};
   int[] arr2 = {15, 25, 25, 35};
   int[] solucion = {5, 5, 10, 10, 15, 25, 25, 35};
   do_check(arr1,arr2,solucion);
  }

  {
   int[] arr1 = {5, 5, 10, 10};
   int[] arr2 = {25, 25, 35, 40};
   int[] solucion = {5, 5, 10, 10, 25, 25, 35, 40};
   do_check(arr1,arr2,solucion);
  }

  {
   int[] arr1 = {5, 5, 10, 10};
   int[] arr2 = {10, 15, 30, 30};
   int[] solucion = {5, 5, 10, 10, 10, 15, 30, 30};
   do_check(arr1,arr2,solucion);
  }

  {
   int[] arr1 = {5, 5, 10, 10};
   int[] arr2 = {10, 10, 15, 20};
   int[] solucion = {5, 5, 10, 10, 10, 10, 15, 20};
   do_check(arr1,arr2,solucion);
  }

  {
   int[] arr1 = {5, 5, 10, 10};
   int[] arr2 = {1, 5, 30, 35};
   int[] solucion = {1, 5, 5, 5, 10, 10, 30, 35};
   do_check(arr1,arr2,solucion);
  }

  {
   int[] arr1 = {5, 5, 10, 10};
   int[] arr2 = {1, 5, 15, 15, 25};
   int[] solucion = {1, 5, 5, 5, 10, 10, 15, 15, 25};
   do_check(arr1,arr2,solucion);
  }

  {
   int[] arr1 = {5, 5, 10, 10};
   int[] arr2 = {5, 5, 20, 35};
   int[] solucion = {5, 5, 5, 5, 10, 10, 20, 35};
   do_check(arr1,arr2,solucion);
  }

  {
   int[] arr1 = {5, 5, 10, 10};
   int[] arr2 = {1, 1, 5, 15, 20};
   int[] solucion = {1, 1, 5, 5, 5, 10, 10, 15, 20};
   do_check(arr1,arr2,solucion);
  }

  {
   int[] arr1 = {5, 5, 10, 10};
   int[] arr2 = {25, 35, 35, 40, 40};
   int[] solucion = {5, 5, 10, 10, 25, 35, 35, 40, 40};
   do_check(arr1,arr2,solucion);
  }

  {
   int[] arr1 = {5, 5, 10, 10};
   int[] arr2 = {20, 30, 30, 35, 40};
   int[] solucion = {5, 5, 10, 10, 20, 30, 30, 35, 40};
   do_check(arr1,arr2,solucion);
  }

  {
   int[] arr1 = {5, 5, 10, 10};
   int[] arr2 = {1, 1, 10, 25, 40};
   int[] solucion = {1, 1, 5, 5, 10, 10, 10, 25, 40};
   do_check(arr1,arr2,solucion);
  }

  {
   int[] arr1 = {10, 10, 25, 30};
   int[] arr2 = {1, 40};
   int[] solucion = {1, 10, 10, 25, 30, 40};
   do_check(arr1,arr2,solucion);
  }

  {
   int[] arr1 = {10, 10, 25, 30};
   int[] arr2 = {10, 15};
   int[] solucion = {10, 10, 10, 15, 25, 30};
   do_check(arr1,arr2,solucion);
  }

  {
   int[] arr1 = {10, 10, 25, 30};
   int[] arr2 = {20, 20};
   int[] solucion = {10, 10, 20, 20, 25, 30};
   do_check(arr1,arr2,solucion);
  }

  {
   int[] arr1 = {10, 10, 25, 30};
   int[] arr2 = {1, 40};
   int[] solucion = {1, 10, 10, 25, 30, 40};
   do_check(arr1,arr2,solucion);
  }

  {
   int[] arr1 = {10, 10, 25, 30};
   int[] arr2 = {10, 15};
   int[] solucion = {10, 10, 10, 15, 25, 30};
   do_check(arr1,arr2,solucion);
  }

  {
   int[] arr1 = {10, 10, 25, 30};
   int[] arr2 = {5, 35};
   int[] solucion = {5, 10, 10, 25, 30, 35};
   do_check(arr1,arr2,solucion);
  }

  {
   int[] arr1 = {10, 10, 25, 30};
   int[] arr2 = {10, 20, 20};
   int[] solucion = {10, 10, 10, 20, 20, 25, 30};
   do_check(arr1,arr2,solucion);
  }

  {
   int[] arr1 = {10, 10, 25, 30};
   int[] arr2 = {15, 35, 35};
   int[] solucion = {10, 10, 15, 25, 30, 35, 35};
   do_check(arr1,arr2,solucion);
  }

  {
   int[] arr1 = {10, 10, 25, 30};
   int[] arr2 = {25, 30, 40};
   int[] solucion = {10, 10, 25, 25, 30, 30, 40};
   do_check(arr1,arr2,solucion);
  }

  {
   int[] arr1 = {10, 10, 25, 30};
   int[] arr2 = {5, 5, 25};
   int[] solucion = {5, 5, 10, 10, 25, 25, 30};
   do_check(arr1,arr2,solucion);
  }

  {
   int[] arr1 = {10, 10, 25, 30};
   int[] arr2 = {5, 25, 40};
   int[] solucion = {5, 10, 10, 25, 25, 30, 40};
   do_check(arr1,arr2,solucion);
  }

  {
   int[] arr1 = {10, 10, 25, 30};
   int[] arr2 = {1, 35, 35};
   int[] solucion = {1, 10, 10, 25, 30, 35, 35};
   do_check(arr1,arr2,solucion);
  }

  {
   int[] arr1 = {10, 10, 25, 30};
   int[] arr2 = {5, 10, 20, 35};
   int[] solucion = {5, 10, 10, 10, 20, 25, 30, 35};
   do_check(arr1,arr2,solucion);
  }

  {
   int[] arr1 = {10, 10, 25, 30};
   int[] arr2 = {15, 25, 25, 35};
   int[] solucion = {10, 10, 15, 25, 25, 25, 30, 35};
   do_check(arr1,arr2,solucion);
  }

  {
   int[] arr1 = {10, 10, 25, 30};
   int[] arr2 = {25, 25, 35, 40};
   int[] solucion = {10, 10, 25, 25, 25, 30, 35, 40};
   do_check(arr1,arr2,solucion);
  }

  {
   int[] arr1 = {10, 10, 25, 30};
   int[] arr2 = {10, 15, 30, 30};
   int[] solucion = {10, 10, 10, 15, 25, 30, 30, 30};
   do_check(arr1,arr2,solucion);
  }

  {
   int[] arr1 = {10, 10, 25, 30};
   int[] arr2 = {10, 10, 15, 20};
   int[] solucion = {10, 10, 10, 10, 15, 20, 25, 30};
   do_check(arr1,arr2,solucion);
  }

  {
   int[] arr1 = {10, 10, 25, 30};
   int[] arr2 = {1, 5, 30, 35};
   int[] solucion = {1, 5, 10, 10, 25, 30, 30, 35};
   do_check(arr1,arr2,solucion);
  }

  {
   int[] arr1 = {10, 10, 25, 30};
   int[] arr2 = {1, 5, 15, 15, 25};
   int[] solucion = {1, 5, 10, 10, 15, 15, 25, 25, 30};
   do_check(arr1,arr2,solucion);
  }

  {
   int[] arr1 = {10, 10, 25, 30};
   int[] arr2 = {5, 5, 20, 35};
   int[] solucion = {5, 5, 10, 10, 20, 25, 30, 35};
   do_check(arr1,arr2,solucion);
  }

  {
   int[] arr1 = {10, 10, 25, 30};
   int[] arr2 = {1, 1, 5, 15, 20};
   int[] solucion = {1, 1, 5, 10, 10, 15, 20, 25, 30};
   do_check(arr1,arr2,solucion);
  }

  {
   int[] arr1 = {10, 10, 25, 30};
   int[] arr2 = {25, 35, 35, 40, 40};
   int[] solucion = {10, 10, 25, 25, 30, 35, 35, 40, 40};
   do_check(arr1,arr2,solucion);
  }

  {
   int[] arr1 = {10, 10, 25, 30};
   int[] arr2 = {20, 30, 30, 35, 40};
   int[] solucion = {10, 10, 20, 25, 30, 30, 30, 35, 40};
   do_check(arr1,arr2,solucion);
  }

  {
   int[] arr1 = {10, 10, 25, 30};
   int[] arr2 = {1, 1, 10, 25, 40};
   int[] solucion = {1, 1, 10, 10, 10, 25, 25, 30, 40};
   do_check(arr1,arr2,solucion);
  }

  {
   int[] arr1 = {15, 20, 20, 30, 35};
   int[] arr2 = {1, 40};
   int[] solucion = {1, 15, 20, 20, 30, 35, 40};
   do_check(arr1,arr2,solucion);
  }

  {
   int[] arr1 = {15, 20, 20, 30, 35};
   int[] arr2 = {10, 15};
   int[] solucion = {10, 15, 15, 20, 20, 30, 35};
   do_check(arr1,arr2,solucion);
  }

  {
   int[] arr1 = {15, 20, 20, 30, 35};
   int[] arr2 = {20, 20};
   int[] solucion = {15, 20, 20, 20, 20, 30, 35};
   do_check(arr1,arr2,solucion);
  }

  {
   int[] arr1 = {15, 20, 20, 30, 35};
   int[] arr2 = {1, 40};
   int[] solucion = {1, 15, 20, 20, 30, 35, 40};
   do_check(arr1,arr2,solucion);
  }

  {
   int[] arr1 = {15, 20, 20, 30, 35};
   int[] arr2 = {10, 15};
   int[] solucion = {10, 15, 15, 20, 20, 30, 35};
   do_check(arr1,arr2,solucion);
  }

  {
   int[] arr1 = {15, 20, 20, 30, 35};
   int[] arr2 = {5, 35};
   int[] solucion = {5, 15, 20, 20, 30, 35, 35};
   do_check(arr1,arr2,solucion);
  }

  {
   int[] arr1 = {15, 20, 20, 30, 35};
   int[] arr2 = {10, 20, 20};
   int[] solucion = {10, 15, 20, 20, 20, 20, 30, 35};
   do_check(arr1,arr2,solucion);
  }

  {
   int[] arr1 = {15, 20, 20, 30, 35};
   int[] arr2 = {15, 35, 35};
   int[] solucion = {15, 15, 20, 20, 30, 35, 35, 35};
   do_check(arr1,arr2,solucion);
  }

  {
   int[] arr1 = {15, 20, 20, 30, 35};
   int[] arr2 = {25, 30, 40};
   int[] solucion = {15, 20, 20, 25, 30, 30, 35, 40};
   do_check(arr1,arr2,solucion);
  }

  {
   int[] arr1 = {15, 20, 20, 30, 35};
   int[] arr2 = {5, 5, 25};
   int[] solucion = {5, 5, 15, 20, 20, 25, 30, 35};
   do_check(arr1,arr2,solucion);
  }

  {
   int[] arr1 = {15, 20, 20, 30, 35};
   int[] arr2 = {5, 25, 40};
   int[] solucion = {5, 15, 20, 20, 25, 30, 35, 40};
   do_check(arr1,arr2,solucion);
  }

  {
   int[] arr1 = {15, 20, 20, 30, 35};
   int[] arr2 = {1, 35, 35};
   int[] solucion = {1, 15, 20, 20, 30, 35, 35, 35};
   do_check(arr1,arr2,solucion);
  }

  {
   int[] arr1 = {15, 20, 20, 30, 35};
   int[] arr2 = {5, 10, 20, 35};
   int[] solucion = {5, 10, 15, 20, 20, 20, 30, 35, 35};
   do_check(arr1,arr2,solucion);
  }

  {
   int[] arr1 = {15, 20, 20, 30, 35};
   int[] arr2 = {15, 25, 25, 35};
   int[] solucion = {15, 15, 20, 20, 25, 25, 30, 35, 35};
   do_check(arr1,arr2,solucion);
  }

  {
   int[] arr1 = {15, 20, 20, 30, 35};
   int[] arr2 = {25, 25, 35, 40};
   int[] solucion = {15, 20, 20, 25, 25, 30, 35, 35, 40};
   do_check(arr1,arr2,solucion);
  }

  {
   int[] arr1 = {15, 20, 20, 30, 35};
   int[] arr2 = {10, 15, 30, 30};
   int[] solucion = {10, 15, 15, 20, 20, 30, 30, 30, 35};
   do_check(arr1,arr2,solucion);
  }

  {
   int[] arr1 = {15, 20, 20, 30, 35};
   int[] arr2 = {10, 10, 15, 20};
   int[] solucion = {10, 10, 15, 15, 20, 20, 20, 30, 35};
   do_check(arr1,arr2,solucion);
  }

  {
   int[] arr1 = {15, 20, 20, 30, 35};
   int[] arr2 = {1, 5, 30, 35};
   int[] solucion = {1, 5, 15, 20, 20, 30, 30, 35, 35};
   do_check(arr1,arr2,solucion);
  }

  {
   int[] arr1 = {15, 20, 20, 30, 35};
   int[] arr2 = {1, 5, 15, 15, 25};
   int[] solucion = {1, 5, 15, 15, 15, 20, 20, 25, 30, 35};
   do_check(arr1,arr2,solucion);
  }

  {
   int[] arr1 = {15, 20, 20, 30, 35};
   int[] arr2 = {5, 5, 20, 35};
   int[] solucion = {5, 5, 15, 20, 20, 20, 30, 35, 35};
   do_check(arr1,arr2,solucion);
  }

  {
   int[] arr1 = {15, 20, 20, 30, 35};
   int[] arr2 = {1, 1, 5, 15, 20};
   int[] solucion = {1, 1, 5, 15, 15, 20, 20, 20, 30, 35};
   do_check(arr1,arr2,solucion);
  }

  {
   int[] arr1 = {15, 20, 20, 30, 35};
   int[] arr2 = {25, 35, 35, 40, 40};
   int[] solucion = {15, 20, 20, 25, 30, 35, 35, 35, 40, 40};
   do_check(arr1,arr2,solucion);
  }

  {
   int[] arr1 = {15, 20, 20, 30, 35};
   int[] arr2 = {20, 30, 30, 35, 40};
   int[] solucion = {15, 20, 20, 20, 30, 30, 30, 35, 35, 40};
   do_check(arr1,arr2,solucion);
  }

  {
   int[] arr1 = {15, 20, 20, 30, 35};
   int[] arr2 = {1, 1, 10, 25, 40};
   int[] solucion = {1, 1, 10, 15, 20, 20, 25, 30, 35, 40};
   do_check(arr1,arr2,solucion);
  }

  {
   int[] arr1 = {1, 30, 40, 40, 40};
   int[] arr2 = {1, 40};
   int[] solucion = {1, 1, 30, 40, 40, 40, 40};
   do_check(arr1,arr2,solucion);
  }

  {
   int[] arr1 = {1, 30, 40, 40, 40};
   int[] arr2 = {10, 15};
   int[] solucion = {1, 10, 15, 30, 40, 40, 40};
   do_check(arr1,arr2,solucion);
  }

  {
   int[] arr1 = {1, 30, 40, 40, 40};
   int[] arr2 = {20, 20};
   int[] solucion = {1, 20, 20, 30, 40, 40, 40};
   do_check(arr1,arr2,solucion);
  }

  {
   int[] arr1 = {1, 30, 40, 40, 40};
   int[] arr2 = {1, 40};
   int[] solucion = {1, 1, 30, 40, 40, 40, 40};
   do_check(arr1,arr2,solucion);
  }

  {
   int[] arr1 = {1, 30, 40, 40, 40};
   int[] arr2 = {10, 15};
   int[] solucion = {1, 10, 15, 30, 40, 40, 40};
   do_check(arr1,arr2,solucion);
  }

  {
   int[] arr1 = {1, 30, 40, 40, 40};
   int[] arr2 = {5, 35};
   int[] solucion = {1, 5, 30, 35, 40, 40, 40};
   do_check(arr1,arr2,solucion);
  }

  {
   int[] arr1 = {1, 30, 40, 40, 40};
   int[] arr2 = {10, 20, 20};
   int[] solucion = {1, 10, 20, 20, 30, 40, 40, 40};
   do_check(arr1,arr2,solucion);
  }

  {
   int[] arr1 = {1, 30, 40, 40, 40};
   int[] arr2 = {15, 35, 35};
   int[] solucion = {1, 15, 30, 35, 35, 40, 40, 40};
   do_check(arr1,arr2,solucion);
  }

  {
   int[] arr1 = {1, 30, 40, 40, 40};
   int[] arr2 = {25, 30, 40};
   int[] solucion = {1, 25, 30, 30, 40, 40, 40, 40};
   do_check(arr1,arr2,solucion);
  }

  {
   int[] arr1 = {1, 30, 40, 40, 40};
   int[] arr2 = {5, 5, 25};
   int[] solucion = {1, 5, 5, 25, 30, 40, 40, 40};
   do_check(arr1,arr2,solucion);
  }

  {
   int[] arr1 = {1, 30, 40, 40, 40};
   int[] arr2 = {5, 25, 40};
   int[] solucion = {1, 5, 25, 30, 40, 40, 40, 40};
   do_check(arr1,arr2,solucion);
  }

  {
   int[] arr1 = {1, 30, 40, 40, 40};
   int[] arr2 = {1, 35, 35};
   int[] solucion = {1, 1, 30, 35, 35, 40, 40, 40};
   do_check(arr1,arr2,solucion);
  }

  {
   int[] arr1 = {1, 30, 40, 40, 40};
   int[] arr2 = {5, 10, 20, 35};
   int[] solucion = {1, 5, 10, 20, 30, 35, 40, 40, 40};
   do_check(arr1,arr2,solucion);
  }

  {
   int[] arr1 = {1, 30, 40, 40, 40};
   int[] arr2 = {15, 25, 25, 35};
   int[] solucion = {1, 15, 25, 25, 30, 35, 40, 40, 40};
   do_check(arr1,arr2,solucion);
  }

  {
   int[] arr1 = {1, 30, 40, 40, 40};
   int[] arr2 = {25, 25, 35, 40};
   int[] solucion = {1, 25, 25, 30, 35, 40, 40, 40, 40};
   do_check(arr1,arr2,solucion);
  }

  {
   int[] arr1 = {1, 30, 40, 40, 40};
   int[] arr2 = {10, 15, 30, 30};
   int[] solucion = {1, 10, 15, 30, 30, 30, 40, 40, 40};
   do_check(arr1,arr2,solucion);
  }

  {
   int[] arr1 = {1, 30, 40, 40, 40};
   int[] arr2 = {10, 10, 15, 20};
   int[] solucion = {1, 10, 10, 15, 20, 30, 40, 40, 40};
   do_check(arr1,arr2,solucion);
  }

  {
   int[] arr1 = {1, 30, 40, 40, 40};
   int[] arr2 = {1, 5, 30, 35};
   int[] solucion = {1, 1, 5, 30, 30, 35, 40, 40, 40};
   do_check(arr1,arr2,solucion);
  }

  {
   int[] arr1 = {1, 30, 40, 40, 40};
   int[] arr2 = {1, 5, 15, 15, 25};
   int[] solucion = {1, 1, 5, 15, 15, 25, 30, 40, 40, 40};
   do_check(arr1,arr2,solucion);
  }

  {
   int[] arr1 = {1, 30, 40, 40, 40};
   int[] arr2 = {5, 5, 20, 35};
   int[] solucion = {1, 5, 5, 20, 30, 35, 40, 40, 40};
   do_check(arr1,arr2,solucion);
  }

  {
   int[] arr1 = {1, 30, 40, 40, 40};
   int[] arr2 = {1, 1, 5, 15, 20};
   int[] solucion = {1, 1, 1, 5, 15, 20, 30, 40, 40, 40};
   do_check(arr1,arr2,solucion);
  }

  {
   int[] arr1 = {1, 30, 40, 40, 40};
   int[] arr2 = {25, 35, 35, 40, 40};
   int[] solucion = {1, 25, 30, 35, 35, 40, 40, 40, 40, 40};
   do_check(arr1,arr2,solucion);
  }

  {
   int[] arr1 = {1, 30, 40, 40, 40};
   int[] arr2 = {20, 30, 30, 35, 40};
   int[] solucion = {1, 20, 30, 30, 30, 35, 40, 40, 40, 40};
   do_check(arr1,arr2,solucion);
  }

  {
   int[] arr1 = {1, 30, 40, 40, 40};
   int[] arr2 = {1, 1, 10, 25, 40};
   int[] solucion = {1, 1, 1, 10, 25, 30, 40, 40, 40, 40};
   do_check(arr1,arr2,solucion);
  }

  {
   int[] arr1 = {10, 15, 25, 30, 30};
   int[] arr2 = {1, 40};
   int[] solucion = {1, 10, 15, 25, 30, 30, 40};
   do_check(arr1,arr2,solucion);
  }

  {
   int[] arr1 = {10, 15, 25, 30, 30};
   int[] arr2 = {10, 15};
   int[] solucion = {10, 10, 15, 15, 25, 30, 30};
   do_check(arr1,arr2,solucion);
  }

  {
   int[] arr1 = {10, 15, 25, 30, 30};
   int[] arr2 = {20, 20};
   int[] solucion = {10, 15, 20, 20, 25, 30, 30};
   do_check(arr1,arr2,solucion);
  }

  {
   int[] arr1 = {10, 15, 25, 30, 30};
   int[] arr2 = {1, 40};
   int[] solucion = {1, 10, 15, 25, 30, 30, 40};
   do_check(arr1,arr2,solucion);
  }

  {
   int[] arr1 = {10, 15, 25, 30, 30};
   int[] arr2 = {10, 15};
   int[] solucion = {10, 10, 15, 15, 25, 30, 30};
   do_check(arr1,arr2,solucion);
  }

  {
   int[] arr1 = {10, 15, 25, 30, 30};
   int[] arr2 = {5, 35};
   int[] solucion = {5, 10, 15, 25, 30, 30, 35};
   do_check(arr1,arr2,solucion);
  }

  {
   int[] arr1 = {10, 15, 25, 30, 30};
   int[] arr2 = {10, 20, 20};
   int[] solucion = {10, 10, 15, 20, 20, 25, 30, 30};
   do_check(arr1,arr2,solucion);
  }

  {
   int[] arr1 = {10, 15, 25, 30, 30};
   int[] arr2 = {15, 35, 35};
   int[] solucion = {10, 15, 15, 25, 30, 30, 35, 35};
   do_check(arr1,arr2,solucion);
  }

  {
   int[] arr1 = {10, 15, 25, 30, 30};
   int[] arr2 = {25, 30, 40};
   int[] solucion = {10, 15, 25, 25, 30, 30, 30, 40};
   do_check(arr1,arr2,solucion);
  }

  {
   int[] arr1 = {10, 15, 25, 30, 30};
   int[] arr2 = {5, 5, 25};
   int[] solucion = {5, 5, 10, 15, 25, 25, 30, 30};
   do_check(arr1,arr2,solucion);
  }

  {
   int[] arr1 = {10, 15, 25, 30, 30};
   int[] arr2 = {5, 25, 40};
   int[] solucion = {5, 10, 15, 25, 25, 30, 30, 40};
   do_check(arr1,arr2,solucion);
  }

  {
   int[] arr1 = {10, 15, 25, 30, 30};
   int[] arr2 = {1, 35, 35};
   int[] solucion = {1, 10, 15, 25, 30, 30, 35, 35};
   do_check(arr1,arr2,solucion);
  }

  {
   int[] arr1 = {10, 15, 25, 30, 30};
   int[] arr2 = {5, 10, 20, 35};
   int[] solucion = {5, 10, 10, 15, 20, 25, 30, 30, 35};
   do_check(arr1,arr2,solucion);
  }

  {
   int[] arr1 = {10, 15, 25, 30, 30};
   int[] arr2 = {15, 25, 25, 35};
   int[] solucion = {10, 15, 15, 25, 25, 25, 30, 30, 35};
   do_check(arr1,arr2,solucion);
  }

  {
   int[] arr1 = {10, 15, 25, 30, 30};
   int[] arr2 = {25, 25, 35, 40};
   int[] solucion = {10, 15, 25, 25, 25, 30, 30, 35, 40};
   do_check(arr1,arr2,solucion);
  }

  {
   int[] arr1 = {10, 15, 25, 30, 30};
   int[] arr2 = {10, 15, 30, 30};
   int[] solucion = {10, 10, 15, 15, 25, 30, 30, 30, 30};
   do_check(arr1,arr2,solucion);
  }

  {
   int[] arr1 = {10, 15, 25, 30, 30};
   int[] arr2 = {10, 10, 15, 20};
   int[] solucion = {10, 10, 10, 15, 15, 20, 25, 30, 30};
   do_check(arr1,arr2,solucion);
  }

  {
   int[] arr1 = {10, 15, 25, 30, 30};
   int[] arr2 = {1, 5, 30, 35};
   int[] solucion = {1, 5, 10, 15, 25, 30, 30, 30, 35};
   do_check(arr1,arr2,solucion);
  }

  {
   int[] arr1 = {10, 15, 25, 30, 30};
   int[] arr2 = {1, 5, 15, 15, 25};
   int[] solucion = {1, 5, 10, 15, 15, 15, 25, 25, 30, 30};
   do_check(arr1,arr2,solucion);
  }

  {
   int[] arr1 = {10, 15, 25, 30, 30};
   int[] arr2 = {5, 5, 20, 35};
   int[] solucion = {5, 5, 10, 15, 20, 25, 30, 30, 35};
   do_check(arr1,arr2,solucion);
  }

  {
   int[] arr1 = {10, 15, 25, 30, 30};
   int[] arr2 = {1, 1, 5, 15, 20};
   int[] solucion = {1, 1, 5, 10, 15, 15, 20, 25, 30, 30};
   do_check(arr1,arr2,solucion);
  }

  {
   int[] arr1 = {10, 15, 25, 30, 30};
   int[] arr2 = {25, 35, 35, 40, 40};
   int[] solucion = {10, 15, 25, 25, 30, 30, 35, 35, 40, 40};
   do_check(arr1,arr2,solucion);
  }

  {
   int[] arr1 = {10, 15, 25, 30, 30};
   int[] arr2 = {20, 30, 30, 35, 40};
   int[] solucion = {10, 15, 20, 25, 30, 30, 30, 30, 35, 40};
   do_check(arr1,arr2,solucion);
  }

  {
   int[] arr1 = {10, 15, 25, 30, 30};
   int[] arr2 = {1, 1, 10, 25, 40};
   int[] solucion = {1, 1, 10, 10, 15, 25, 25, 30, 30, 40};
   do_check(arr1,arr2,solucion);
  }

  {
   int[] arr1 = {1, 25, 35, 40, 40};
   int[] arr2 = {1, 40};
   int[] solucion = {1, 1, 25, 35, 40, 40, 40};
   do_check(arr1,arr2,solucion);
  }

  {
   int[] arr1 = {1, 25, 35, 40, 40};
   int[] arr2 = {10, 15};
   int[] solucion = {1, 10, 15, 25, 35, 40, 40};
   do_check(arr1,arr2,solucion);
  }

  {
   int[] arr1 = {1, 25, 35, 40, 40};
   int[] arr2 = {20, 20};
   int[] solucion = {1, 20, 20, 25, 35, 40, 40};
   do_check(arr1,arr2,solucion);
  }

  {
   int[] arr1 = {1, 25, 35, 40, 40};
   int[] arr2 = {1, 40};
   int[] solucion = {1, 1, 25, 35, 40, 40, 40};
   do_check(arr1,arr2,solucion);
  }

  {
   int[] arr1 = {1, 25, 35, 40, 40};
   int[] arr2 = {10, 15};
   int[] solucion = {1, 10, 15, 25, 35, 40, 40};
   do_check(arr1,arr2,solucion);
  }

  {
   int[] arr1 = {1, 25, 35, 40, 40};
   int[] arr2 = {5, 35};
   int[] solucion = {1, 5, 25, 35, 35, 40, 40};
   do_check(arr1,arr2,solucion);
  }

  {
   int[] arr1 = {1, 25, 35, 40, 40};
   int[] arr2 = {10, 20, 20};
   int[] solucion = {1, 10, 20, 20, 25, 35, 40, 40};
   do_check(arr1,arr2,solucion);
  }

  {
   int[] arr1 = {1, 25, 35, 40, 40};
   int[] arr2 = {15, 35, 35};
   int[] solucion = {1, 15, 25, 35, 35, 35, 40, 40};
   do_check(arr1,arr2,solucion);
  }

  {
   int[] arr1 = {1, 25, 35, 40, 40};
   int[] arr2 = {25, 30, 40};
   int[] solucion = {1, 25, 25, 30, 35, 40, 40, 40};
   do_check(arr1,arr2,solucion);
  }

  {
   int[] arr1 = {1, 25, 35, 40, 40};
   int[] arr2 = {5, 5, 25};
   int[] solucion = {1, 5, 5, 25, 25, 35, 40, 40};
   do_check(arr1,arr2,solucion);
  }

  {
   int[] arr1 = {1, 25, 35, 40, 40};
   int[] arr2 = {5, 25, 40};
   int[] solucion = {1, 5, 25, 25, 35, 40, 40, 40};
   do_check(arr1,arr2,solucion);
  }

  {
   int[] arr1 = {1, 25, 35, 40, 40};
   int[] arr2 = {1, 35, 35};
   int[] solucion = {1, 1, 25, 35, 35, 35, 40, 40};
   do_check(arr1,arr2,solucion);
  }

  {
   int[] arr1 = {1, 25, 35, 40, 40};
   int[] arr2 = {5, 10, 20, 35};
   int[] solucion = {1, 5, 10, 20, 25, 35, 35, 40, 40};
   do_check(arr1,arr2,solucion);
  }

  {
   int[] arr1 = {1, 25, 35, 40, 40};
   int[] arr2 = {15, 25, 25, 35};
   int[] solucion = {1, 15, 25, 25, 25, 35, 35, 40, 40};
   do_check(arr1,arr2,solucion);
  }

  {
   int[] arr1 = {1, 25, 35, 40, 40};
   int[] arr2 = {25, 25, 35, 40};
   int[] solucion = {1, 25, 25, 25, 35, 35, 40, 40, 40};
   do_check(arr1,arr2,solucion);
  }

  {
   int[] arr1 = {1, 25, 35, 40, 40};
   int[] arr2 = {10, 15, 30, 30};
   int[] solucion = {1, 10, 15, 25, 30, 30, 35, 40, 40};
   do_check(arr1,arr2,solucion);
  }

  {
   int[] arr1 = {1, 25, 35, 40, 40};
   int[] arr2 = {10, 10, 15, 20};
   int[] solucion = {1, 10, 10, 15, 20, 25, 35, 40, 40};
   do_check(arr1,arr2,solucion);
  }

  {
   int[] arr1 = {1, 25, 35, 40, 40};
   int[] arr2 = {1, 5, 30, 35};
   int[] solucion = {1, 1, 5, 25, 30, 35, 35, 40, 40};
   do_check(arr1,arr2,solucion);
  }

  {
   int[] arr1 = {1, 25, 35, 40, 40};
   int[] arr2 = {1, 5, 15, 15, 25};
   int[] solucion = {1, 1, 5, 15, 15, 25, 25, 35, 40, 40};
   do_check(arr1,arr2,solucion);
  }

  {
   int[] arr1 = {1, 25, 35, 40, 40};
   int[] arr2 = {5, 5, 20, 35};
   int[] solucion = {1, 5, 5, 20, 25, 35, 35, 40, 40};
   do_check(arr1,arr2,solucion);
  }

  {
   int[] arr1 = {1, 25, 35, 40, 40};
   int[] arr2 = {1, 1, 5, 15, 20};
   int[] solucion = {1, 1, 1, 5, 15, 20, 25, 35, 40, 40};
   do_check(arr1,arr2,solucion);
  }

  {
   int[] arr1 = {1, 25, 35, 40, 40};
   int[] arr2 = {25, 35, 35, 40, 40};
   int[] solucion = {1, 25, 25, 35, 35, 35, 40, 40, 40, 40};
   do_check(arr1,arr2,solucion);
  }

  {
   int[] arr1 = {1, 25, 35, 40, 40};
   int[] arr2 = {20, 30, 30, 35, 40};
   int[] solucion = {1, 20, 25, 30, 30, 35, 35, 40, 40, 40};
   do_check(arr1,arr2,solucion);
  }

  {
   int[] arr1 = {1, 25, 35, 40, 40};
   int[] arr2 = {1, 1, 10, 25, 40};
   int[] solucion = {1, 1, 1, 10, 25, 25, 35, 40, 40, 40};
   do_check(arr1,arr2,solucion);
  }

  {
   int[] arr1 = {1, 5, 5, 35, 40};
   int[] arr2 = {1, 40};
   int[] solucion = {1, 1, 5, 5, 35, 40, 40};
   do_check(arr1,arr2,solucion);
  }

  {
   int[] arr1 = {1, 5, 5, 35, 40};
   int[] arr2 = {10, 15};
   int[] solucion = {1, 5, 5, 10, 15, 35, 40};
   do_check(arr1,arr2,solucion);
  }

  {
   int[] arr1 = {1, 5, 5, 35, 40};
   int[] arr2 = {20, 20};
   int[] solucion = {1, 5, 5, 20, 20, 35, 40};
   do_check(arr1,arr2,solucion);
  }

  {
   int[] arr1 = {1, 5, 5, 35, 40};
   int[] arr2 = {1, 40};
   int[] solucion = {1, 1, 5, 5, 35, 40, 40};
   do_check(arr1,arr2,solucion);
  }

  {
   int[] arr1 = {1, 5, 5, 35, 40};
   int[] arr2 = {10, 15};
   int[] solucion = {1, 5, 5, 10, 15, 35, 40};
   do_check(arr1,arr2,solucion);
  }

  {
   int[] arr1 = {1, 5, 5, 35, 40};
   int[] arr2 = {5, 35};
   int[] solucion = {1, 5, 5, 5, 35, 35, 40};
   do_check(arr1,arr2,solucion);
  }

  {
   int[] arr1 = {1, 5, 5, 35, 40};
   int[] arr2 = {10, 20, 20};
   int[] solucion = {1, 5, 5, 10, 20, 20, 35, 40};
   do_check(arr1,arr2,solucion);
  }

  {
   int[] arr1 = {1, 5, 5, 35, 40};
   int[] arr2 = {15, 35, 35};
   int[] solucion = {1, 5, 5, 15, 35, 35, 35, 40};
   do_check(arr1,arr2,solucion);
  }

  {
   int[] arr1 = {1, 5, 5, 35, 40};
   int[] arr2 = {25, 30, 40};
   int[] solucion = {1, 5, 5, 25, 30, 35, 40, 40};
   do_check(arr1,arr2,solucion);
  }

  {
   int[] arr1 = {1, 5, 5, 35, 40};
   int[] arr2 = {5, 5, 25};
   int[] solucion = {1, 5, 5, 5, 5, 25, 35, 40};
   do_check(arr1,arr2,solucion);
  }

  {
   int[] arr1 = {1, 5, 5, 35, 40};
   int[] arr2 = {5, 25, 40};
   int[] solucion = {1, 5, 5, 5, 25, 35, 40, 40};
   do_check(arr1,arr2,solucion);
  }

  {
   int[] arr1 = {1, 5, 5, 35, 40};
   int[] arr2 = {1, 35, 35};
   int[] solucion = {1, 1, 5, 5, 35, 35, 35, 40};
   do_check(arr1,arr2,solucion);
  }

  {
   int[] arr1 = {1, 5, 5, 35, 40};
   int[] arr2 = {5, 10, 20, 35};
   int[] solucion = {1, 5, 5, 5, 10, 20, 35, 35, 40};
   do_check(arr1,arr2,solucion);
  }

  {
   int[] arr1 = {1, 5, 5, 35, 40};
   int[] arr2 = {15, 25, 25, 35};
   int[] solucion = {1, 5, 5, 15, 25, 25, 35, 35, 40};
   do_check(arr1,arr2,solucion);
  }

  {
   int[] arr1 = {1, 5, 5, 35, 40};
   int[] arr2 = {25, 25, 35, 40};
   int[] solucion = {1, 5, 5, 25, 25, 35, 35, 40, 40};
   do_check(arr1,arr2,solucion);
  }

  {
   int[] arr1 = {1, 5, 5, 35, 40};
   int[] arr2 = {10, 15, 30, 30};
   int[] solucion = {1, 5, 5, 10, 15, 30, 30, 35, 40};
   do_check(arr1,arr2,solucion);
  }

  {
   int[] arr1 = {1, 5, 5, 35, 40};
   int[] arr2 = {10, 10, 15, 20};
   int[] solucion = {1, 5, 5, 10, 10, 15, 20, 35, 40};
   do_check(arr1,arr2,solucion);
  }

  {
   int[] arr1 = {1, 5, 5, 35, 40};
   int[] arr2 = {1, 5, 30, 35};
   int[] solucion = {1, 1, 5, 5, 5, 30, 35, 35, 40};
   do_check(arr1,arr2,solucion);
  }

  {
   int[] arr1 = {1, 5, 5, 35, 40};
   int[] arr2 = {1, 5, 15, 15, 25};
   int[] solucion = {1, 1, 5, 5, 5, 15, 15, 25, 35, 40};
   do_check(arr1,arr2,solucion);
  }

  {
   int[] arr1 = {1, 5, 5, 35, 40};
   int[] arr2 = {5, 5, 20, 35};
   int[] solucion = {1, 5, 5, 5, 5, 20, 35, 35, 40};
   do_check(arr1,arr2,solucion);
  }

  {
   int[] arr1 = {1, 5, 5, 35, 40};
   int[] arr2 = {1, 1, 5, 15, 20};
   int[] solucion = {1, 1, 1, 5, 5, 5, 15, 20, 35, 40};
   do_check(arr1,arr2,solucion);
  }

  {
   int[] arr1 = {1, 5, 5, 35, 40};
   int[] arr2 = {25, 35, 35, 40, 40};
   int[] solucion = {1, 5, 5, 25, 35, 35, 35, 40, 40, 40};
   do_check(arr1,arr2,solucion);
  }

  {
   int[] arr1 = {1, 5, 5, 35, 40};
   int[] arr2 = {20, 30, 30, 35, 40};
   int[] solucion = {1, 5, 5, 20, 30, 30, 35, 35, 40, 40};
   do_check(arr1,arr2,solucion);
  }

  {
   int[] arr1 = {1, 5, 5, 35, 40};
   int[] arr2 = {1, 1, 10, 25, 40};
   int[] solucion = {1, 1, 1, 5, 5, 10, 25, 35, 40, 40};
   do_check(arr1,arr2,solucion);
  }

  {
   int[] arr1 = {15, 20, 25, 35, 40};
   int[] arr2 = {1, 40};
   int[] solucion = {1, 15, 20, 25, 35, 40, 40};
   do_check(arr1,arr2,solucion);
  }

  {
   int[] arr1 = {15, 20, 25, 35, 40};
   int[] arr2 = {10, 15};
   int[] solucion = {10, 15, 15, 20, 25, 35, 40};
   do_check(arr1,arr2,solucion);
  }

  {
   int[] arr1 = {15, 20, 25, 35, 40};
   int[] arr2 = {20, 20};
   int[] solucion = {15, 20, 20, 20, 25, 35, 40};
   do_check(arr1,arr2,solucion);
  }

  {
   int[] arr1 = {15, 20, 25, 35, 40};
   int[] arr2 = {1, 40};
   int[] solucion = {1, 15, 20, 25, 35, 40, 40};
   do_check(arr1,arr2,solucion);
  }

  {
   int[] arr1 = {15, 20, 25, 35, 40};
   int[] arr2 = {10, 15};
   int[] solucion = {10, 15, 15, 20, 25, 35, 40};
   do_check(arr1,arr2,solucion);
  }

  {
   int[] arr1 = {15, 20, 25, 35, 40};
   int[] arr2 = {5, 35};
   int[] solucion = {5, 15, 20, 25, 35, 35, 40};
   do_check(arr1,arr2,solucion);
  }

  {
   int[] arr1 = {15, 20, 25, 35, 40};
   int[] arr2 = {10, 20, 20};
   int[] solucion = {10, 15, 20, 20, 20, 25, 35, 40};
   do_check(arr1,arr2,solucion);
  }

  {
   int[] arr1 = {15, 20, 25, 35, 40};
   int[] arr2 = {15, 35, 35};
   int[] solucion = {15, 15, 20, 25, 35, 35, 35, 40};
   do_check(arr1,arr2,solucion);
  }

  {
   int[] arr1 = {15, 20, 25, 35, 40};
   int[] arr2 = {25, 30, 40};
   int[] solucion = {15, 20, 25, 25, 30, 35, 40, 40};
   do_check(arr1,arr2,solucion);
  }

  {
   int[] arr1 = {15, 20, 25, 35, 40};
   int[] arr2 = {5, 5, 25};
   int[] solucion = {5, 5, 15, 20, 25, 25, 35, 40};
   do_check(arr1,arr2,solucion);
  }

  {
   int[] arr1 = {15, 20, 25, 35, 40};
   int[] arr2 = {5, 25, 40};
   int[] solucion = {5, 15, 20, 25, 25, 35, 40, 40};
   do_check(arr1,arr2,solucion);
  }

  {
   int[] arr1 = {15, 20, 25, 35, 40};
   int[] arr2 = {1, 35, 35};
   int[] solucion = {1, 15, 20, 25, 35, 35, 35, 40};
   do_check(arr1,arr2,solucion);
  }

  {
   int[] arr1 = {15, 20, 25, 35, 40};
   int[] arr2 = {5, 10, 20, 35};
   int[] solucion = {5, 10, 15, 20, 20, 25, 35, 35, 40};
   do_check(arr1,arr2,solucion);
  }

  {
   int[] arr1 = {15, 20, 25, 35, 40};
   int[] arr2 = {15, 25, 25, 35};
   int[] solucion = {15, 15, 20, 25, 25, 25, 35, 35, 40};
   do_check(arr1,arr2,solucion);
  }

  {
   int[] arr1 = {15, 20, 25, 35, 40};
   int[] arr2 = {25, 25, 35, 40};
   int[] solucion = {15, 20, 25, 25, 25, 35, 35, 40, 40};
   do_check(arr1,arr2,solucion);
  }

  {
   int[] arr1 = {15, 20, 25, 35, 40};
   int[] arr2 = {10, 15, 30, 30};
   int[] solucion = {10, 15, 15, 20, 25, 30, 30, 35, 40};
   do_check(arr1,arr2,solucion);
  }

  {
   int[] arr1 = {15, 20, 25, 35, 40};
   int[] arr2 = {10, 10, 15, 20};
   int[] solucion = {10, 10, 15, 15, 20, 20, 25, 35, 40};
   do_check(arr1,arr2,solucion);
  }

  {
   int[] arr1 = {15, 20, 25, 35, 40};
   int[] arr2 = {1, 5, 30, 35};
   int[] solucion = {1, 5, 15, 20, 25, 30, 35, 35, 40};
   do_check(arr1,arr2,solucion);
  }

  {
   int[] arr1 = {15, 20, 25, 35, 40};
   int[] arr2 = {1, 5, 15, 15, 25};
   int[] solucion = {1, 5, 15, 15, 15, 20, 25, 25, 35, 40};
   do_check(arr1,arr2,solucion);
  }

  {
   int[] arr1 = {15, 20, 25, 35, 40};
   int[] arr2 = {5, 5, 20, 35};
   int[] solucion = {5, 5, 15, 20, 20, 25, 35, 35, 40};
   do_check(arr1,arr2,solucion);
  }

  {
   int[] arr1 = {15, 20, 25, 35, 40};
   int[] arr2 = {1, 1, 5, 15, 20};
   int[] solucion = {1, 1, 5, 15, 15, 20, 20, 25, 35, 40};
   do_check(arr1,arr2,solucion);
  }

  {
   int[] arr1 = {15, 20, 25, 35, 40};
   int[] arr2 = {25, 35, 35, 40, 40};
   int[] solucion = {15, 20, 25, 25, 35, 35, 35, 40, 40, 40};
   do_check(arr1,arr2,solucion);
  }

  {
   int[] arr1 = {15, 20, 25, 35, 40};
   int[] arr2 = {20, 30, 30, 35, 40};
   int[] solucion = {15, 20, 20, 25, 30, 30, 35, 35, 40, 40};
   do_check(arr1,arr2,solucion);
  }

  {
   int[] arr1 = {15, 20, 25, 35, 40};
   int[] arr2 = {1, 1, 10, 25, 40};
   int[] solucion = {1, 1, 10, 15, 20, 25, 25, 35, 40, 40};
   do_check(arr1,arr2,solucion);
  }
  System.out.println("Test Superado");
 }
}
