import java.util.Arrays;

public class OrdenacionBurbuja {

 public static void burbuja(int[] arr) {
  int tmp;
  boolean ordered = false;
  while(!ordered){
    ordered = true;
    for (int i = 1; i < arr.length; i++) {
      if(arr[i] < arr[i - 1]){
        tmp = arr[i];
        arr[i] = arr[i - 1];
        arr[i - 1] = tmp;
        ordered = false;
      }
    }
  }
 }


 private static void do_check(int[] arr, int[] solucion){
  try{

   int[] arr0=null;
   if (arr!=null)
    arr0=Arrays.copyOf(arr, arr.length); //el array se va a modificar, conservo copia original
   burbuja(arr);
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
