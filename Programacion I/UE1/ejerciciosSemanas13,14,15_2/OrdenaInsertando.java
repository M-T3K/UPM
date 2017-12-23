import java.util.Arrays;


//**** ORDENACI�N DE UN ARRAY, UTILIZANDO OTRO AUXILIAR EN EL QUE SE VAN INSERTANDO UNO A UNO EN ORDEN LOS ELEMENTOS DEL PRIMERO.



public class OrdenaInsertando {

  private static int buscaHueco(int[] arr, int elem){
    int pos=-1;
    int longArr= arr.length;
    if (longArr >0 && elem>0 && arr[longArr-1]==0){ //tiene que haber al menos un 0, un hueco para poder insertar
      int i;
      for (i=0; i<longArr && arr[i]!=0 && arr[i]<elem; i++){}
      pos=i;
    }
    return pos;
  }




  static void inserOrden(int[] arr, int elem){
    int posElem=buscaHueco(arr,elem);
    //System.out.println(posElem);
    if (posElem>=0){
      for (int i=arr.length-1; i>posElem;i--){
        arr[i]=arr[i-1];
      }
      arr[posElem]=elem;
    }
  }

  static void proccess(int[] arr, int pos){
    int elem = arr[pos];
    for (int i = pos; i < arr.length - 1; i++) {
      arr[i] = arr[i + 1];
    }
    arr[arr.length - 1 ] = 0;
    inserOrden(arr, elem);
  }


  static int[] ordenacionInsercion(int[] arr){
    int[] aux = new int[arr.length];
    for (int i = 0; i < aux.length; i++) {
      aux[i] = arr[i];
    }
    for(int j = 0; j < arr.length - 1; j ++){
      for (int i = 0; i < aux.length; i++) {
        proccess(aux, i);
      }
    }
    return aux;
  }



  private static void do_check(int[] arr, int[] solucion){
    try{

      int[] solAlumno=ordenacionInsercion(arr);

      if (!Arrays.equals(solAlumno,solucion)){
        System.out.println("Error: el c�digo del alumno produce un resultado incorrecto.");
        System.out.println("El resultado esperado para el argumento: " +
                           Arrays.toString(arr));
        System.out.println("deber�a ser " + Arrays.toString(solucion));
        System.out.println("pero el resultado obtenido es " + Arrays.toString(solAlumno));
        throw new Error();
      }
    } catch (Exception e){
      System.out.println("**** El c�digo del alumno ha lanzado una excepci�n: " + e.toString());
      throw new Error();
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
      int[] solucion = {1, 2};
      do_check(arr,solucion);
    }

    {
      int[] arr = {1, 3};
      int[] solucion = {1, 3};
      do_check(arr,solucion);
    }

    {
      int[] arr = {1, 4};
      int[] solucion = {1, 4};
      do_check(arr,solucion);
    }

    {
      int[] arr = {1, 5};
      int[] solucion = {1, 5};
      do_check(arr,solucion);
    }

    {
      int[] arr = {2, 1};
      int[] solucion = {1, 2};
      do_check(arr,solucion);
    }

    {
      int[] arr = {2, 2};
      int[] solucion = {2, 2};
      do_check(arr,solucion);
    }

    {
      int[] arr = {2, 3};
      int[] solucion = {2, 3};
      do_check(arr,solucion);
    }

    {
      int[] arr = {2, 4};
      int[] solucion = {2, 4};
      do_check(arr,solucion);
    }

    {
      int[] arr = {2, 5};
      int[] solucion = {2, 5};
      do_check(arr,solucion);
    }

    {
      int[] arr = {3, 1};
      int[] solucion = {1, 3};
      do_check(arr,solucion);
    }

    {
      int[] arr = {3, 2};
      int[] solucion = {2, 3};
      do_check(arr,solucion);
    }

    {
      int[] arr = {3, 3};
      int[] solucion = {3, 3};
      do_check(arr,solucion);
    }

    {
      int[] arr = {3, 4};
      int[] solucion = {3, 4};
      do_check(arr,solucion);
    }

    {
      int[] arr = {3, 5};
      int[] solucion = {3, 5};
      do_check(arr,solucion);
    }

    {
      int[] arr = {4, 1};
      int[] solucion = {1, 4};
      do_check(arr,solucion);
    }

    {
      int[] arr = {4, 2};
      int[] solucion = {2, 4};
      do_check(arr,solucion);
    }

    {
      int[] arr = {4, 3};
      int[] solucion = {3, 4};
      do_check(arr,solucion);
    }

    {
      int[] arr = {4, 4};
      int[] solucion = {4, 4};
      do_check(arr,solucion);
    }

    {
      int[] arr = {4, 5};
      int[] solucion = {4, 5};
      do_check(arr,solucion);
    }

    {
      int[] arr = {5, 1};
      int[] solucion = {1, 5};
      do_check(arr,solucion);
    }

    {
      int[] arr = {5, 2};
      int[] solucion = {2, 5};
      do_check(arr,solucion);
    }

    {
      int[] arr = {5, 3};
      int[] solucion = {3, 5};
      do_check(arr,solucion);
    }

    {
      int[] arr = {5, 4};
      int[] solucion = {4, 5};
      do_check(arr,solucion);
    }

    {
      int[] arr = {5, 5};
      int[] solucion = {5, 5};
      do_check(arr,solucion);
    }

    {
      int[] arr = {1, 1, 1};
      int[] solucion = {1, 1, 1};
      do_check(arr,solucion);
    }

    {
      int[] arr = {1, 1, 2};
      int[] solucion = {1, 1, 2};
      do_check(arr,solucion);
    }

    {
      int[] arr = {1, 1, 3};
      int[] solucion = {1, 1, 3};
      do_check(arr,solucion);
    }

    {
      int[] arr = {1, 1, 4};
      int[] solucion = {1, 1, 4};
      do_check(arr,solucion);
    }

    {
      int[] arr = {1, 1, 5};
      int[] solucion = {1, 1, 5};
      do_check(arr,solucion);
    }

    {
      int[] arr = {1, 2, 1};
      int[] solucion = {1, 1, 2};
      do_check(arr,solucion);
    }

    {
      int[] arr = {1, 2, 2};
      int[] solucion = {1, 2, 2};
      do_check(arr,solucion);
    }

    {
      int[] arr = {1, 2, 3};
      int[] solucion = {1, 2, 3};
      do_check(arr,solucion);
    }

    {
      int[] arr = {1, 2, 4};
      int[] solucion = {1, 2, 4};
      do_check(arr,solucion);
    }

    {
      int[] arr = {1, 2, 5};
      int[] solucion = {1, 2, 5};
      do_check(arr,solucion);
    }

    {
      int[] arr = {1, 3, 1};
      int[] solucion = {1, 1, 3};
      do_check(arr,solucion);
    }

    {
      int[] arr = {1, 3, 2};
      int[] solucion = {1, 2, 3};
      do_check(arr,solucion);
    }

    {
      int[] arr = {1, 3, 3};
      int[] solucion = {1, 3, 3};
      do_check(arr,solucion);
    }

    {
      int[] arr = {1, 3, 4};
      int[] solucion = {1, 3, 4};
      do_check(arr,solucion);
    }

    {
      int[] arr = {1, 3, 5};
      int[] solucion = {1, 3, 5};
      do_check(arr,solucion);
    }

    {
      int[] arr = {1, 4, 1};
      int[] solucion = {1, 1, 4};
      do_check(arr,solucion);
    }

    {
      int[] arr = {1, 4, 2};
      int[] solucion = {1, 2, 4};
      do_check(arr,solucion);
    }

    {
      int[] arr = {1, 4, 3};
      int[] solucion = {1, 3, 4};
      do_check(arr,solucion);
    }

    {
      int[] arr = {1, 4, 4};
      int[] solucion = {1, 4, 4};
      do_check(arr,solucion);
    }

    {
      int[] arr = {1, 4, 5};
      int[] solucion = {1, 4, 5};
      do_check(arr,solucion);
    }

    {
      int[] arr = {1, 5, 1};
      int[] solucion = {1, 1, 5};
      do_check(arr,solucion);
    }

    {
      int[] arr = {1, 5, 2};
      int[] solucion = {1, 2, 5};
      do_check(arr,solucion);
    }

    {
      int[] arr = {1, 5, 3};
      int[] solucion = {1, 3, 5};
      do_check(arr,solucion);
    }

    {
      int[] arr = {1, 5, 4};
      int[] solucion = {1, 4, 5};
      do_check(arr,solucion);
    }

    {
      int[] arr = {1, 5, 5};
      int[] solucion = {1, 5, 5};
      do_check(arr,solucion);
    }

    {
      int[] arr = {2, 1, 1};
      int[] solucion = {1, 1, 2};
      do_check(arr,solucion);
    }

    {
      int[] arr = {2, 1, 2};
      int[] solucion = {1, 2, 2};
      do_check(arr,solucion);
    }

    {
      int[] arr = {2, 1, 3};
      int[] solucion = {1, 2, 3};
      do_check(arr,solucion);
    }

    {
      int[] arr = {2, 1, 4};
      int[] solucion = {1, 2, 4};
      do_check(arr,solucion);
    }

    {
      int[] arr = {2, 1, 5};
      int[] solucion = {1, 2, 5};
      do_check(arr,solucion);
    }

    {
      int[] arr = {2, 2, 1};
      int[] solucion = {1, 2, 2};
      do_check(arr,solucion);
    }

    {
      int[] arr = {2, 2, 2};
      int[] solucion = {2, 2, 2};
      do_check(arr,solucion);
    }

    {
      int[] arr = {2, 2, 3};
      int[] solucion = {2, 2, 3};
      do_check(arr,solucion);
    }

    {
      int[] arr = {2, 2, 4};
      int[] solucion = {2, 2, 4};
      do_check(arr,solucion);
    }

    {
      int[] arr = {2, 2, 5};
      int[] solucion = {2, 2, 5};
      do_check(arr,solucion);
    }

    {
      int[] arr = {2, 3, 1};
      int[] solucion = {1, 2, 3};
      do_check(arr,solucion);
    }

    {
      int[] arr = {2, 3, 2};
      int[] solucion = {2, 2, 3};
      do_check(arr,solucion);
    }

    {
      int[] arr = {2, 3, 3};
      int[] solucion = {2, 3, 3};
      do_check(arr,solucion);
    }

    {
      int[] arr = {2, 3, 4};
      int[] solucion = {2, 3, 4};
      do_check(arr,solucion);
    }

    {
      int[] arr = {2, 3, 5};
      int[] solucion = {2, 3, 5};
      do_check(arr,solucion);
    }

    {
      int[] arr = {2, 4, 1};
      int[] solucion = {1, 2, 4};
      do_check(arr,solucion);
    }

    {
      int[] arr = {2, 4, 2};
      int[] solucion = {2, 2, 4};
      do_check(arr,solucion);
    }

    {
      int[] arr = {2, 4, 3};
      int[] solucion = {2, 3, 4};
      do_check(arr,solucion);
    }

    {
      int[] arr = {2, 4, 4};
      int[] solucion = {2, 4, 4};
      do_check(arr,solucion);
    }

    {
      int[] arr = {2, 4, 5};
      int[] solucion = {2, 4, 5};
      do_check(arr,solucion);
    }

    {
      int[] arr = {2, 5, 1};
      int[] solucion = {1, 2, 5};
      do_check(arr,solucion);
    }

    {
      int[] arr = {2, 5, 2};
      int[] solucion = {2, 2, 5};
      do_check(arr,solucion);
    }

    {
      int[] arr = {2, 5, 3};
      int[] solucion = {2, 3, 5};
      do_check(arr,solucion);
    }

    {
      int[] arr = {2, 5, 4};
      int[] solucion = {2, 4, 5};
      do_check(arr,solucion);
    }

    {
      int[] arr = {2, 5, 5};
      int[] solucion = {2, 5, 5};
      do_check(arr,solucion);
    }

    {
      int[] arr = {3, 1, 1};
      int[] solucion = {1, 1, 3};
      do_check(arr,solucion);
    }

    {
      int[] arr = {3, 1, 2};
      int[] solucion = {1, 2, 3};
      do_check(arr,solucion);
    }

    {
      int[] arr = {3, 1, 3};
      int[] solucion = {1, 3, 3};
      do_check(arr,solucion);
    }

    {
      int[] arr = {3, 1, 4};
      int[] solucion = {1, 3, 4};
      do_check(arr,solucion);
    }

    {
      int[] arr = {3, 1, 5};
      int[] solucion = {1, 3, 5};
      do_check(arr,solucion);
    }

    {
      int[] arr = {3, 2, 1};
      int[] solucion = {1, 2, 3};
      do_check(arr,solucion);
    }

    {
      int[] arr = {3, 2, 2};
      int[] solucion = {2, 2, 3};
      do_check(arr,solucion);
    }

    {
      int[] arr = {3, 2, 3};
      int[] solucion = {2, 3, 3};
      do_check(arr,solucion);
    }

    {
      int[] arr = {3, 2, 4};
      int[] solucion = {2, 3, 4};
      do_check(arr,solucion);
    }

    {
      int[] arr = {3, 2, 5};
      int[] solucion = {2, 3, 5};
      do_check(arr,solucion);
    }

    {
      int[] arr = {3, 3, 1};
      int[] solucion = {1, 3, 3};
      do_check(arr,solucion);
    }

    {
      int[] arr = {3, 3, 2};
      int[] solucion = {2, 3, 3};
      do_check(arr,solucion);
    }

    {
      int[] arr = {3, 3, 3};
      int[] solucion = {3, 3, 3};
      do_check(arr,solucion);
    }

    {
      int[] arr = {3, 3, 4};
      int[] solucion = {3, 3, 4};
      do_check(arr,solucion);
    }

    {
      int[] arr = {3, 3, 5};
      int[] solucion = {3, 3, 5};
      do_check(arr,solucion);
    }

    {
      int[] arr = {3, 4, 1};
      int[] solucion = {1, 3, 4};
      do_check(arr,solucion);
    }

    {
      int[] arr = {3, 4, 2};
      int[] solucion = {2, 3, 4};
      do_check(arr,solucion);
    }

    {
      int[] arr = {3, 4, 3};
      int[] solucion = {3, 3, 4};
      do_check(arr,solucion);
    }

    {
      int[] arr = {3, 4, 4};
      int[] solucion = {3, 4, 4};
      do_check(arr,solucion);
    }

    {
      int[] arr = {3, 4, 5};
      int[] solucion = {3, 4, 5};
      do_check(arr,solucion);
    }

    {
      int[] arr = {3, 5, 1};
      int[] solucion = {1, 3, 5};
      do_check(arr,solucion);
    }

    {
      int[] arr = {3, 5, 2};
      int[] solucion = {2, 3, 5};
      do_check(arr,solucion);
    }

    {
      int[] arr = {3, 5, 3};
      int[] solucion = {3, 3, 5};
      do_check(arr,solucion);
    }

    {
      int[] arr = {3, 5, 4};
      int[] solucion = {3, 4, 5};
      do_check(arr,solucion);
    }

    {
      int[] arr = {3, 5, 5};
      int[] solucion = {3, 5, 5};
      do_check(arr,solucion);
    }

    {
      int[] arr = {4, 1, 1};
      int[] solucion = {1, 1, 4};
      do_check(arr,solucion);
    }

    {
      int[] arr = {4, 1, 2};
      int[] solucion = {1, 2, 4};
      do_check(arr,solucion);
    }

    {
      int[] arr = {4, 1, 3};
      int[] solucion = {1, 3, 4};
      do_check(arr,solucion);
    }

    {
      int[] arr = {4, 1, 4};
      int[] solucion = {1, 4, 4};
      do_check(arr,solucion);
    }

    {
      int[] arr = {4, 1, 5};
      int[] solucion = {1, 4, 5};
      do_check(arr,solucion);
    }

    {
      int[] arr = {4, 2, 1};
      int[] solucion = {1, 2, 4};
      do_check(arr,solucion);
    }

    {
      int[] arr = {4, 2, 2};
      int[] solucion = {2, 2, 4};
      do_check(arr,solucion);
    }

    {
      int[] arr = {4, 2, 3};
      int[] solucion = {2, 3, 4};
      do_check(arr,solucion);
    }

    {
      int[] arr = {4, 2, 4};
      int[] solucion = {2, 4, 4};
      do_check(arr,solucion);
    }

    {
      int[] arr = {4, 2, 5};
      int[] solucion = {2, 4, 5};
      do_check(arr,solucion);
    }

    {
      int[] arr = {4, 3, 1};
      int[] solucion = {1, 3, 4};
      do_check(arr,solucion);
    }

    {
      int[] arr = {4, 3, 2};
      int[] solucion = {2, 3, 4};
      do_check(arr,solucion);
    }

    {
      int[] arr = {4, 3, 3};
      int[] solucion = {3, 3, 4};
      do_check(arr,solucion);
    }

    {
      int[] arr = {4, 3, 4};
      int[] solucion = {3, 4, 4};
      do_check(arr,solucion);
    }

    {
      int[] arr = {4, 3, 5};
      int[] solucion = {3, 4, 5};
      do_check(arr,solucion);
    }

    {
      int[] arr = {4, 4, 1};
      int[] solucion = {1, 4, 4};
      do_check(arr,solucion);
    }

    {
      int[] arr = {4, 4, 2};
      int[] solucion = {2, 4, 4};
      do_check(arr,solucion);
    }

    {
      int[] arr = {4, 4, 3};
      int[] solucion = {3, 4, 4};
      do_check(arr,solucion);
    }

    {
      int[] arr = {4, 4, 4};
      int[] solucion = {4, 4, 4};
      do_check(arr,solucion);
    }

    {
      int[] arr = {4, 4, 5};
      int[] solucion = {4, 4, 5};
      do_check(arr,solucion);
    }

    {
      int[] arr = {4, 5, 1};
      int[] solucion = {1, 4, 5};
      do_check(arr,solucion);
    }

    {
      int[] arr = {4, 5, 2};
      int[] solucion = {2, 4, 5};
      do_check(arr,solucion);
    }

    {
      int[] arr = {4, 5, 3};
      int[] solucion = {3, 4, 5};
      do_check(arr,solucion);
    }

    {
      int[] arr = {4, 5, 4};
      int[] solucion = {4, 4, 5};
      do_check(arr,solucion);
    }

    {
      int[] arr = {4, 5, 5};
      int[] solucion = {4, 5, 5};
      do_check(arr,solucion);
    }

    {
      int[] arr = {5, 1, 1};
      int[] solucion = {1, 1, 5};
      do_check(arr,solucion);
    }

    {
      int[] arr = {5, 1, 2};
      int[] solucion = {1, 2, 5};
      do_check(arr,solucion);
    }

    {
      int[] arr = {5, 1, 3};
      int[] solucion = {1, 3, 5};
      do_check(arr,solucion);
    }

    {
      int[] arr = {5, 1, 4};
      int[] solucion = {1, 4, 5};
      do_check(arr,solucion);
    }

    {
      int[] arr = {5, 1, 5};
      int[] solucion = {1, 5, 5};
      do_check(arr,solucion);
    }

    {
      int[] arr = {5, 2, 1};
      int[] solucion = {1, 2, 5};
      do_check(arr,solucion);
    }

    {
      int[] arr = {5, 2, 2};
      int[] solucion = {2, 2, 5};
      do_check(arr,solucion);
    }

    {
      int[] arr = {5, 2, 3};
      int[] solucion = {2, 3, 5};
      do_check(arr,solucion);
    }

    {
      int[] arr = {5, 2, 4};
      int[] solucion = {2, 4, 5};
      do_check(arr,solucion);
    }

    {
      int[] arr = {5, 2, 5};
      int[] solucion = {2, 5, 5};
      do_check(arr,solucion);
    }

    {
      int[] arr = {5, 3, 1};
      int[] solucion = {1, 3, 5};
      do_check(arr,solucion);
    }

    {
      int[] arr = {5, 3, 2};
      int[] solucion = {2, 3, 5};
      do_check(arr,solucion);
    }

    {
      int[] arr = {5, 3, 3};
      int[] solucion = {3, 3, 5};
      do_check(arr,solucion);
    }

    {
      int[] arr = {5, 3, 4};
      int[] solucion = {3, 4, 5};
      do_check(arr,solucion);
    }

    {
      int[] arr = {5, 3, 5};
      int[] solucion = {3, 5, 5};
      do_check(arr,solucion);
    }

    {
      int[] arr = {5, 4, 1};
      int[] solucion = {1, 4, 5};
      do_check(arr,solucion);
    }

    {
      int[] arr = {5, 4, 2};
      int[] solucion = {2, 4, 5};
      do_check(arr,solucion);
    }

    {
      int[] arr = {5, 4, 3};
      int[] solucion = {3, 4, 5};
      do_check(arr,solucion);
    }

    {
      int[] arr = {5, 4, 4};
      int[] solucion = {4, 4, 5};
      do_check(arr,solucion);
    }

    {
      int[] arr = {5, 4, 5};
      int[] solucion = {4, 5, 5};
      do_check(arr,solucion);
    }

    {
      int[] arr = {5, 5, 1};
      int[] solucion = {1, 5, 5};
      do_check(arr,solucion);
    }

    {
      int[] arr = {5, 5, 2};
      int[] solucion = {2, 5, 5};
      do_check(arr,solucion);
    }

    {
      int[] arr = {5, 5, 3};
      int[] solucion = {3, 5, 5};
      do_check(arr,solucion);
    }

    {
      int[] arr = {5, 5, 4};
      int[] solucion = {4, 5, 5};
      do_check(arr,solucion);
    }

    {
      int[] arr = {5, 5, 5};
      int[] solucion = {5, 5, 5};
      do_check(arr,solucion);
    }

    {
      int[] arr = {1, 1, 1, 1};
      int[] solucion = {1, 1, 1, 1};
      do_check(arr,solucion);
    }

    {
      int[] arr = {1, 1, 1, 2};
      int[] solucion = {1, 1, 1, 2};
      do_check(arr,solucion);
    }

    {
      int[] arr = {1, 1, 1, 3};
      int[] solucion = {1, 1, 1, 3};
      do_check(arr,solucion);
    }

    {
      int[] arr = {1, 1, 1, 4};
      int[] solucion = {1, 1, 1, 4};
      do_check(arr,solucion);
    }

    {
      int[] arr = {1, 1, 1, 5};
      int[] solucion = {1, 1, 1, 5};
      do_check(arr,solucion);
    }

    {
      int[] arr = {1, 1, 2, 1};
      int[] solucion = {1, 1, 1, 2};
      do_check(arr,solucion);
    }

    {
      int[] arr = {1, 1, 2, 2};
      int[] solucion = {1, 1, 2, 2};
      do_check(arr,solucion);
    }

    {
      int[] arr = {1, 1, 2, 3};
      int[] solucion = {1, 1, 2, 3};
      do_check(arr,solucion);
    }

    {
      int[] arr = {1, 1, 2, 4};
      int[] solucion = {1, 1, 2, 4};
      do_check(arr,solucion);
    }

    {
      int[] arr = {1, 1, 2, 5};
      int[] solucion = {1, 1, 2, 5};
      do_check(arr,solucion);
    }

    {
      int[] arr = {1, 1, 3, 1};
      int[] solucion = {1, 1, 1, 3};
      do_check(arr,solucion);
    }

    {
      int[] arr = {1, 1, 3, 2};
      int[] solucion = {1, 1, 2, 3};
      do_check(arr,solucion);
    }

    {
      int[] arr = {1, 1, 3, 3};
      int[] solucion = {1, 1, 3, 3};
      do_check(arr,solucion);
    }

    {
      int[] arr = {1, 1, 3, 4};
      int[] solucion = {1, 1, 3, 4};
      do_check(arr,solucion);
    }

    {
      int[] arr = {1, 1, 3, 5};
      int[] solucion = {1, 1, 3, 5};
      do_check(arr,solucion);
    }

    {
      int[] arr = {1, 1, 4, 1};
      int[] solucion = {1, 1, 1, 4};
      do_check(arr,solucion);
    }

    {
      int[] arr = {1, 1, 4, 2};
      int[] solucion = {1, 1, 2, 4};
      do_check(arr,solucion);
    }

    {
      int[] arr = {1, 1, 4, 3};
      int[] solucion = {1, 1, 3, 4};
      do_check(arr,solucion);
    }

    {
      int[] arr = {1, 1, 4, 4};
      int[] solucion = {1, 1, 4, 4};
      do_check(arr,solucion);
    }

    {
      int[] arr = {1, 1, 4, 5};
      int[] solucion = {1, 1, 4, 5};
      do_check(arr,solucion);
    }

    {
      int[] arr = {1, 1, 5, 1};
      int[] solucion = {1, 1, 1, 5};
      do_check(arr,solucion);
    }

    {
      int[] arr = {1, 1, 5, 2};
      int[] solucion = {1, 1, 2, 5};
      do_check(arr,solucion);
    }

    {
      int[] arr = {1, 1, 5, 3};
      int[] solucion = {1, 1, 3, 5};
      do_check(arr,solucion);
    }

    {
      int[] arr = {1, 1, 5, 4};
      int[] solucion = {1, 1, 4, 5};
      do_check(arr,solucion);
    }

    {
      int[] arr = {1, 1, 5, 5};
      int[] solucion = {1, 1, 5, 5};
      do_check(arr,solucion);
    }

    {
      int[] arr = {1, 2, 1, 1};
      int[] solucion = {1, 1, 1, 2};
      do_check(arr,solucion);
    }

    {
      int[] arr = {1, 2, 1, 2};
      int[] solucion = {1, 1, 2, 2};
      do_check(arr,solucion);
    }

    {
      int[] arr = {1, 2, 1, 3};
      int[] solucion = {1, 1, 2, 3};
      do_check(arr,solucion);
    }

    {
      int[] arr = {1, 2, 1, 4};
      int[] solucion = {1, 1, 2, 4};
      do_check(arr,solucion);
    }

    {
      int[] arr = {1, 2, 1, 5};
      int[] solucion = {1, 1, 2, 5};
      do_check(arr,solucion);
    }

    {
      int[] arr = {1, 2, 2, 1};
      int[] solucion = {1, 1, 2, 2};
      do_check(arr,solucion);
    }

    {
      int[] arr = {1, 2, 2, 2};
      int[] solucion = {1, 2, 2, 2};
      do_check(arr,solucion);
    }

    {
      int[] arr = {1, 2, 2, 3};
      int[] solucion = {1, 2, 2, 3};
      do_check(arr,solucion);
    }

    {
      int[] arr = {1, 2, 2, 4};
      int[] solucion = {1, 2, 2, 4};
      do_check(arr,solucion);
    }

    {
      int[] arr = {1, 2, 2, 5};
      int[] solucion = {1, 2, 2, 5};
      do_check(arr,solucion);
    }

    {
      int[] arr = {1, 2, 3, 1};
      int[] solucion = {1, 1, 2, 3};
      do_check(arr,solucion);
    }

    {
      int[] arr = {1, 2, 3, 2};
      int[] solucion = {1, 2, 2, 3};
      do_check(arr,solucion);
    }

    {
      int[] arr = {1, 2, 3, 3};
      int[] solucion = {1, 2, 3, 3};
      do_check(arr,solucion);
    }

    {
      int[] arr = {1, 2, 3, 4};
      int[] solucion = {1, 2, 3, 4};
      do_check(arr,solucion);
    }

    {
      int[] arr = {1, 2, 3, 5};
      int[] solucion = {1, 2, 3, 5};
      do_check(arr,solucion);
    }

    {
      int[] arr = {1, 2, 4, 1};
      int[] solucion = {1, 1, 2, 4};
      do_check(arr,solucion);
    }

    {
      int[] arr = {1, 2, 4, 2};
      int[] solucion = {1, 2, 2, 4};
      do_check(arr,solucion);
    }

    {
      int[] arr = {1, 2, 4, 3};
      int[] solucion = {1, 2, 3, 4};
      do_check(arr,solucion);
    }

    {
      int[] arr = {1, 2, 4, 4};
      int[] solucion = {1, 2, 4, 4};
      do_check(arr,solucion);
    }

    {
      int[] arr = {1, 2, 4, 5};
      int[] solucion = {1, 2, 4, 5};
      do_check(arr,solucion);
    }

    {
      int[] arr = {1, 2, 5, 1};
      int[] solucion = {1, 1, 2, 5};
      do_check(arr,solucion);
    }

    {
      int[] arr = {1, 2, 5, 2};
      int[] solucion = {1, 2, 2, 5};
      do_check(arr,solucion);
    }

    {
      int[] arr = {1, 2, 5, 3};
      int[] solucion = {1, 2, 3, 5};
      do_check(arr,solucion);
    }

    {
      int[] arr = {1, 2, 5, 4};
      int[] solucion = {1, 2, 4, 5};
      do_check(arr,solucion);
    }

    {
      int[] arr = {1, 2, 5, 5};
      int[] solucion = {1, 2, 5, 5};
      do_check(arr,solucion);
    }

    {
      int[] arr = {1, 3, 1, 1};
      int[] solucion = {1, 1, 1, 3};
      do_check(arr,solucion);
    }

    {
      int[] arr = {1, 3, 1, 2};
      int[] solucion = {1, 1, 2, 3};
      do_check(arr,solucion);
    }

    {
      int[] arr = {1, 3, 1, 3};
      int[] solucion = {1, 1, 3, 3};
      do_check(arr,solucion);
    }

    {
      int[] arr = {1, 3, 1, 4};
      int[] solucion = {1, 1, 3, 4};
      do_check(arr,solucion);
    }

    {
      int[] arr = {1, 3, 1, 5};
      int[] solucion = {1, 1, 3, 5};
      do_check(arr,solucion);
    }

    {
      int[] arr = {1, 3, 2, 1};
      int[] solucion = {1, 1, 2, 3};
      do_check(arr,solucion);
    }

    {
      int[] arr = {1, 3, 2, 2};
      int[] solucion = {1, 2, 2, 3};
      do_check(arr,solucion);
    }

    {
      int[] arr = {1, 3, 2, 3};
      int[] solucion = {1, 2, 3, 3};
      do_check(arr,solucion);
    }

    {
      int[] arr = {1, 3, 2, 4};
      int[] solucion = {1, 2, 3, 4};
      do_check(arr,solucion);
    }

    {
      int[] arr = {1, 3, 2, 5};
      int[] solucion = {1, 2, 3, 5};
      do_check(arr,solucion);
    }

    {
      int[] arr = {1, 3, 3, 1};
      int[] solucion = {1, 1, 3, 3};
      do_check(arr,solucion);
    }

    {
      int[] arr = {1, 3, 3, 2};
      int[] solucion = {1, 2, 3, 3};
      do_check(arr,solucion);
    }

    {
      int[] arr = {1, 3, 3, 3};
      int[] solucion = {1, 3, 3, 3};
      do_check(arr,solucion);
    }

    {
      int[] arr = {1, 3, 3, 4};
      int[] solucion = {1, 3, 3, 4};
      do_check(arr,solucion);
    }

    {
      int[] arr = {1, 3, 3, 5};
      int[] solucion = {1, 3, 3, 5};
      do_check(arr,solucion);
    }

    {
      int[] arr = {1, 3, 4, 1};
      int[] solucion = {1, 1, 3, 4};
      do_check(arr,solucion);
    }

    {
      int[] arr = {1, 3, 4, 2};
      int[] solucion = {1, 2, 3, 4};
      do_check(arr,solucion);
    }

    {
      int[] arr = {1, 3, 4, 3};
      int[] solucion = {1, 3, 3, 4};
      do_check(arr,solucion);
    }

    {
      int[] arr = {1, 3, 4, 4};
      int[] solucion = {1, 3, 4, 4};
      do_check(arr,solucion);
    }

    {
      int[] arr = {1, 3, 4, 5};
      int[] solucion = {1, 3, 4, 5};
      do_check(arr,solucion);
    }

    {
      int[] arr = {1, 3, 5, 1};
      int[] solucion = {1, 1, 3, 5};
      do_check(arr,solucion);
    }

    {
      int[] arr = {1, 3, 5, 2};
      int[] solucion = {1, 2, 3, 5};
      do_check(arr,solucion);
    }

    {
      int[] arr = {1, 3, 5, 3};
      int[] solucion = {1, 3, 3, 5};
      do_check(arr,solucion);
    }

    {
      int[] arr = {1, 3, 5, 4};
      int[] solucion = {1, 3, 4, 5};
      do_check(arr,solucion);
    }

    {
      int[] arr = {1, 3, 5, 5};
      int[] solucion = {1, 3, 5, 5};
      do_check(arr,solucion);
    }

    {
      int[] arr = {1, 4, 1, 1};
      int[] solucion = {1, 1, 1, 4};
      do_check(arr,solucion);
    }

    {
      int[] arr = {1, 4, 1, 2};
      int[] solucion = {1, 1, 2, 4};
      do_check(arr,solucion);
    }

    {
      int[] arr = {1, 4, 1, 3};
      int[] solucion = {1, 1, 3, 4};
      do_check(arr,solucion);
    }

    {
      int[] arr = {1, 4, 1, 4};
      int[] solucion = {1, 1, 4, 4};
      do_check(arr,solucion);
    }

    {
      int[] arr = {1, 4, 1, 5};
      int[] solucion = {1, 1, 4, 5};
      do_check(arr,solucion);
    }

    {
      int[] arr = {1, 4, 2, 1};
      int[] solucion = {1, 1, 2, 4};
      do_check(arr,solucion);
    }

    {
      int[] arr = {1, 4, 2, 2};
      int[] solucion = {1, 2, 2, 4};
      do_check(arr,solucion);
    }

    {
      int[] arr = {1, 4, 2, 3};
      int[] solucion = {1, 2, 3, 4};
      do_check(arr,solucion);
    }

    {
      int[] arr = {1, 4, 2, 4};
      int[] solucion = {1, 2, 4, 4};
      do_check(arr,solucion);
    }

    {
      int[] arr = {1, 4, 2, 5};
      int[] solucion = {1, 2, 4, 5};
      do_check(arr,solucion);
    }

    {
      int[] arr = {1, 4, 3, 1};
      int[] solucion = {1, 1, 3, 4};
      do_check(arr,solucion);
    }

    {
      int[] arr = {1, 4, 3, 2};
      int[] solucion = {1, 2, 3, 4};
      do_check(arr,solucion);
    }

    {
      int[] arr = {1, 4, 3, 3};
      int[] solucion = {1, 3, 3, 4};
      do_check(arr,solucion);
    }

    {
      int[] arr = {1, 4, 3, 4};
      int[] solucion = {1, 3, 4, 4};
      do_check(arr,solucion);
    }

    {
      int[] arr = {1, 4, 3, 5};
      int[] solucion = {1, 3, 4, 5};
      do_check(arr,solucion);
    }

    {
      int[] arr = {1, 4, 4, 1};
      int[] solucion = {1, 1, 4, 4};
      do_check(arr,solucion);
    }

    {
      int[] arr = {1, 4, 4, 2};
      int[] solucion = {1, 2, 4, 4};
      do_check(arr,solucion);
    }

    {
      int[] arr = {1, 4, 4, 3};
      int[] solucion = {1, 3, 4, 4};
      do_check(arr,solucion);
    }

    {
      int[] arr = {1, 4, 4, 4};
      int[] solucion = {1, 4, 4, 4};
      do_check(arr,solucion);
    }

    {
      int[] arr = {1, 4, 4, 5};
      int[] solucion = {1, 4, 4, 5};
      do_check(arr,solucion);
    }

    {
      int[] arr = {1, 4, 5, 1};
      int[] solucion = {1, 1, 4, 5};
      do_check(arr,solucion);
    }

    {
      int[] arr = {1, 4, 5, 2};
      int[] solucion = {1, 2, 4, 5};
      do_check(arr,solucion);
    }

    {
      int[] arr = {1, 4, 5, 3};
      int[] solucion = {1, 3, 4, 5};
      do_check(arr,solucion);
    }

    {
      int[] arr = {1, 4, 5, 4};
      int[] solucion = {1, 4, 4, 5};
      do_check(arr,solucion);
    }

    {
      int[] arr = {1, 4, 5, 5};
      int[] solucion = {1, 4, 5, 5};
      do_check(arr,solucion);
    }

    {
      int[] arr = {1, 5, 1, 1};
      int[] solucion = {1, 1, 1, 5};
      do_check(arr,solucion);
    }

    {
      int[] arr = {1, 5, 1, 2};
      int[] solucion = {1, 1, 2, 5};
      do_check(arr,solucion);
    }

    {
      int[] arr = {1, 5, 1, 3};
      int[] solucion = {1, 1, 3, 5};
      do_check(arr,solucion);
    }

    {
      int[] arr = {1, 5, 1, 4};
      int[] solucion = {1, 1, 4, 5};
      do_check(arr,solucion);
    }

    {
      int[] arr = {1, 5, 1, 5};
      int[] solucion = {1, 1, 5, 5};
      do_check(arr,solucion);
    }

    {
      int[] arr = {1, 5, 2, 1};
      int[] solucion = {1, 1, 2, 5};
      do_check(arr,solucion);
    }

    {
      int[] arr = {1, 5, 2, 2};
      int[] solucion = {1, 2, 2, 5};
      do_check(arr,solucion);
    }

    {
      int[] arr = {1, 5, 2, 3};
      int[] solucion = {1, 2, 3, 5};
      do_check(arr,solucion);
    }

    {
      int[] arr = {1, 5, 2, 4};
      int[] solucion = {1, 2, 4, 5};
      do_check(arr,solucion);
    }

    {
      int[] arr = {1, 5, 2, 5};
      int[] solucion = {1, 2, 5, 5};
      do_check(arr,solucion);
    }

    {
      int[] arr = {1, 5, 3, 1};
      int[] solucion = {1, 1, 3, 5};
      do_check(arr,solucion);
    }

    {
      int[] arr = {1, 5, 3, 2};
      int[] solucion = {1, 2, 3, 5};
      do_check(arr,solucion);
    }

    {
      int[] arr = {1, 5, 3, 3};
      int[] solucion = {1, 3, 3, 5};
      do_check(arr,solucion);
    }

    {
      int[] arr = {1, 5, 3, 4};
      int[] solucion = {1, 3, 4, 5};
      do_check(arr,solucion);
    }

    {
      int[] arr = {1, 5, 3, 5};
      int[] solucion = {1, 3, 5, 5};
      do_check(arr,solucion);
    }

    {
      int[] arr = {1, 5, 4, 1};
      int[] solucion = {1, 1, 4, 5};
      do_check(arr,solucion);
    }

    {
      int[] arr = {1, 5, 4, 2};
      int[] solucion = {1, 2, 4, 5};
      do_check(arr,solucion);
    }

    {
      int[] arr = {1, 5, 4, 3};
      int[] solucion = {1, 3, 4, 5};
      do_check(arr,solucion);
    }

    {
      int[] arr = {1, 5, 4, 4};
      int[] solucion = {1, 4, 4, 5};
      do_check(arr,solucion);
    }

    {
      int[] arr = {1, 5, 4, 5};
      int[] solucion = {1, 4, 5, 5};
      do_check(arr,solucion);
    }

    {
      int[] arr = {1, 5, 5, 1};
      int[] solucion = {1, 1, 5, 5};
      do_check(arr,solucion);
    }

    {
      int[] arr = {1, 5, 5, 2};
      int[] solucion = {1, 2, 5, 5};
      do_check(arr,solucion);
    }

    {
      int[] arr = {1, 5, 5, 3};
      int[] solucion = {1, 3, 5, 5};
      do_check(arr,solucion);
    }

    {
      int[] arr = {1, 5, 5, 4};
      int[] solucion = {1, 4, 5, 5};
      do_check(arr,solucion);
    }

    {
      int[] arr = {1, 5, 5, 5};
      int[] solucion = {1, 5, 5, 5};
      do_check(arr,solucion);
    }

    {
      int[] arr = {2, 1, 1, 1};
      int[] solucion = {1, 1, 1, 2};
      do_check(arr,solucion);
    }

    {
      int[] arr = {2, 1, 1, 2};
      int[] solucion = {1, 1, 2, 2};
      do_check(arr,solucion);
    }

    {
      int[] arr = {2, 1, 1, 3};
      int[] solucion = {1, 1, 2, 3};
      do_check(arr,solucion);
    }

    {
      int[] arr = {2, 1, 1, 4};
      int[] solucion = {1, 1, 2, 4};
      do_check(arr,solucion);
    }

    {
      int[] arr = {2, 1, 1, 5};
      int[] solucion = {1, 1, 2, 5};
      do_check(arr,solucion);
    }

    {
      int[] arr = {2, 1, 2, 1};
      int[] solucion = {1, 1, 2, 2};
      do_check(arr,solucion);
    }

    {
      int[] arr = {2, 1, 2, 2};
      int[] solucion = {1, 2, 2, 2};
      do_check(arr,solucion);
    }

    {
      int[] arr = {2, 1, 2, 3};
      int[] solucion = {1, 2, 2, 3};
      do_check(arr,solucion);
    }

    {
      int[] arr = {2, 1, 2, 4};
      int[] solucion = {1, 2, 2, 4};
      do_check(arr,solucion);
    }

    {
      int[] arr = {2, 1, 2, 5};
      int[] solucion = {1, 2, 2, 5};
      do_check(arr,solucion);
    }

    {
      int[] arr = {2, 1, 3, 1};
      int[] solucion = {1, 1, 2, 3};
      do_check(arr,solucion);
    }

    {
      int[] arr = {2, 1, 3, 2};
      int[] solucion = {1, 2, 2, 3};
      do_check(arr,solucion);
    }

    {
      int[] arr = {2, 1, 3, 3};
      int[] solucion = {1, 2, 3, 3};
      do_check(arr,solucion);
    }

    {
      int[] arr = {2, 1, 3, 4};
      int[] solucion = {1, 2, 3, 4};
      do_check(arr,solucion);
    }

    {
      int[] arr = {2, 1, 3, 5};
      int[] solucion = {1, 2, 3, 5};
      do_check(arr,solucion);
    }

    {
      int[] arr = {2, 1, 4, 1};
      int[] solucion = {1, 1, 2, 4};
      do_check(arr,solucion);
    }

    {
      int[] arr = {2, 1, 4, 2};
      int[] solucion = {1, 2, 2, 4};
      do_check(arr,solucion);
    }

    {
      int[] arr = {2, 1, 4, 3};
      int[] solucion = {1, 2, 3, 4};
      do_check(arr,solucion);
    }

    {
      int[] arr = {2, 1, 4, 4};
      int[] solucion = {1, 2, 4, 4};
      do_check(arr,solucion);
    }

    {
      int[] arr = {2, 1, 4, 5};
      int[] solucion = {1, 2, 4, 5};
      do_check(arr,solucion);
    }

    {
      int[] arr = {2, 1, 5, 1};
      int[] solucion = {1, 1, 2, 5};
      do_check(arr,solucion);
    }

    {
      int[] arr = {2, 1, 5, 2};
      int[] solucion = {1, 2, 2, 5};
      do_check(arr,solucion);
    }

    {
      int[] arr = {2, 1, 5, 3};
      int[] solucion = {1, 2, 3, 5};
      do_check(arr,solucion);
    }

    {
      int[] arr = {2, 1, 5, 4};
      int[] solucion = {1, 2, 4, 5};
      do_check(arr,solucion);
    }

    {
      int[] arr = {2, 1, 5, 5};
      int[] solucion = {1, 2, 5, 5};
      do_check(arr,solucion);
    }

    {
      int[] arr = {2, 2, 1, 1};
      int[] solucion = {1, 1, 2, 2};
      do_check(arr,solucion);
    }

    {
      int[] arr = {2, 2, 1, 2};
      int[] solucion = {1, 2, 2, 2};
      do_check(arr,solucion);
    }

    {
      int[] arr = {2, 2, 1, 3};
      int[] solucion = {1, 2, 2, 3};
      do_check(arr,solucion);
    }

    {
      int[] arr = {2, 2, 1, 4};
      int[] solucion = {1, 2, 2, 4};
      do_check(arr,solucion);
    }

    {
      int[] arr = {2, 2, 1, 5};
      int[] solucion = {1, 2, 2, 5};
      do_check(arr,solucion);
    }

    {
      int[] arr = {2, 2, 2, 1};
      int[] solucion = {1, 2, 2, 2};
      do_check(arr,solucion);
    }

    {
      int[] arr = {2, 2, 2, 2};
      int[] solucion = {2, 2, 2, 2};
      do_check(arr,solucion);
    }

    {
      int[] arr = {2, 2, 2, 3};
      int[] solucion = {2, 2, 2, 3};
      do_check(arr,solucion);
    }

    {
      int[] arr = {2, 2, 2, 4};
      int[] solucion = {2, 2, 2, 4};
      do_check(arr,solucion);
    }

    {
      int[] arr = {2, 2, 2, 5};
      int[] solucion = {2, 2, 2, 5};
      do_check(arr,solucion);
    }

    {
      int[] arr = {2, 2, 3, 1};
      int[] solucion = {1, 2, 2, 3};
      do_check(arr,solucion);
    }

    {
      int[] arr = {2, 2, 3, 2};
      int[] solucion = {2, 2, 2, 3};
      do_check(arr,solucion);
    }

    {
      int[] arr = {2, 2, 3, 3};
      int[] solucion = {2, 2, 3, 3};
      do_check(arr,solucion);
    }

    {
      int[] arr = {2, 2, 3, 4};
      int[] solucion = {2, 2, 3, 4};
      do_check(arr,solucion);
    }

    {
      int[] arr = {2, 2, 3, 5};
      int[] solucion = {2, 2, 3, 5};
      do_check(arr,solucion);
    }

    {
      int[] arr = {2, 2, 4, 1};
      int[] solucion = {1, 2, 2, 4};
      do_check(arr,solucion);
    }

    {
      int[] arr = {2, 2, 4, 2};
      int[] solucion = {2, 2, 2, 4};
      do_check(arr,solucion);
    }

    {
      int[] arr = {2, 2, 4, 3};
      int[] solucion = {2, 2, 3, 4};
      do_check(arr,solucion);
    }

    {
      int[] arr = {2, 2, 4, 4};
      int[] solucion = {2, 2, 4, 4};
      do_check(arr,solucion);
    }

    {
      int[] arr = {2, 2, 4, 5};
      int[] solucion = {2, 2, 4, 5};
      do_check(arr,solucion);
    }

    {
      int[] arr = {2, 2, 5, 1};
      int[] solucion = {1, 2, 2, 5};
      do_check(arr,solucion);
    }

    {
      int[] arr = {2, 2, 5, 2};
      int[] solucion = {2, 2, 2, 5};
      do_check(arr,solucion);
    }

    {
      int[] arr = {2, 2, 5, 3};
      int[] solucion = {2, 2, 3, 5};
      do_check(arr,solucion);
    }

    {
      int[] arr = {2, 2, 5, 4};
      int[] solucion = {2, 2, 4, 5};
      do_check(arr,solucion);
    }

    {
      int[] arr = {2, 2, 5, 5};
      int[] solucion = {2, 2, 5, 5};
      do_check(arr,solucion);
    }

    {
      int[] arr = {2, 3, 1, 1};
      int[] solucion = {1, 1, 2, 3};
      do_check(arr,solucion);
    }

    {
      int[] arr = {2, 3, 1, 2};
      int[] solucion = {1, 2, 2, 3};
      do_check(arr,solucion);
    }

    {
      int[] arr = {2, 3, 1, 3};
      int[] solucion = {1, 2, 3, 3};
      do_check(arr,solucion);
    }

    {
      int[] arr = {2, 3, 1, 4};
      int[] solucion = {1, 2, 3, 4};
      do_check(arr,solucion);
    }

    {
      int[] arr = {2, 3, 1, 5};
      int[] solucion = {1, 2, 3, 5};
      do_check(arr,solucion);
    }

    {
      int[] arr = {2, 3, 2, 1};
      int[] solucion = {1, 2, 2, 3};
      do_check(arr,solucion);
    }

    {
      int[] arr = {2, 3, 2, 2};
      int[] solucion = {2, 2, 2, 3};
      do_check(arr,solucion);
    }

    {
      int[] arr = {2, 3, 2, 3};
      int[] solucion = {2, 2, 3, 3};
      do_check(arr,solucion);
    }

    {
      int[] arr = {2, 3, 2, 4};
      int[] solucion = {2, 2, 3, 4};
      do_check(arr,solucion);
    }

    {
      int[] arr = {2, 3, 2, 5};
      int[] solucion = {2, 2, 3, 5};
      do_check(arr,solucion);
    }

    {
      int[] arr = {2, 3, 3, 1};
      int[] solucion = {1, 2, 3, 3};
      do_check(arr,solucion);
    }

    {
      int[] arr = {2, 3, 3, 2};
      int[] solucion = {2, 2, 3, 3};
      do_check(arr,solucion);
    }

    {
      int[] arr = {2, 3, 3, 3};
      int[] solucion = {2, 3, 3, 3};
      do_check(arr,solucion);
    }

    {
      int[] arr = {2, 3, 3, 4};
      int[] solucion = {2, 3, 3, 4};
      do_check(arr,solucion);
    }

    {
      int[] arr = {2, 3, 3, 5};
      int[] solucion = {2, 3, 3, 5};
      do_check(arr,solucion);
    }

    {
      int[] arr = {2, 3, 4, 1};
      int[] solucion = {1, 2, 3, 4};
      do_check(arr,solucion);
    }

    {
      int[] arr = {2, 3, 4, 2};
      int[] solucion = {2, 2, 3, 4};
      do_check(arr,solucion);
    }

    {
      int[] arr = {2, 3, 4, 3};
      int[] solucion = {2, 3, 3, 4};
      do_check(arr,solucion);
    }

    {
      int[] arr = {2, 3, 4, 4};
      int[] solucion = {2, 3, 4, 4};
      do_check(arr,solucion);
    }

    {
      int[] arr = {2, 3, 4, 5};
      int[] solucion = {2, 3, 4, 5};
      do_check(arr,solucion);
    }

    {
      int[] arr = {2, 3, 5, 1};
      int[] solucion = {1, 2, 3, 5};
      do_check(arr,solucion);
    }

    {
      int[] arr = {2, 3, 5, 2};
      int[] solucion = {2, 2, 3, 5};
      do_check(arr,solucion);
    }

    {
      int[] arr = {2, 3, 5, 3};
      int[] solucion = {2, 3, 3, 5};
      do_check(arr,solucion);
    }

    {
      int[] arr = {2, 3, 5, 4};
      int[] solucion = {2, 3, 4, 5};
      do_check(arr,solucion);
    }

    {
      int[] arr = {2, 3, 5, 5};
      int[] solucion = {2, 3, 5, 5};
      do_check(arr,solucion);
    }

    {
      int[] arr = {2, 4, 1, 1};
      int[] solucion = {1, 1, 2, 4};
      do_check(arr,solucion);
    }

    {
      int[] arr = {2, 4, 1, 2};
      int[] solucion = {1, 2, 2, 4};
      do_check(arr,solucion);
    }

    {
      int[] arr = {2, 4, 1, 3};
      int[] solucion = {1, 2, 3, 4};
      do_check(arr,solucion);
    }

    {
      int[] arr = {2, 4, 1, 4};
      int[] solucion = {1, 2, 4, 4};
      do_check(arr,solucion);
    }

    {
      int[] arr = {2, 4, 1, 5};
      int[] solucion = {1, 2, 4, 5};
      do_check(arr,solucion);
    }

    {
      int[] arr = {2, 4, 2, 1};
      int[] solucion = {1, 2, 2, 4};
      do_check(arr,solucion);
    }

    {
      int[] arr = {2, 4, 2, 2};
      int[] solucion = {2, 2, 2, 4};
      do_check(arr,solucion);
    }

    {
      int[] arr = {2, 4, 2, 3};
      int[] solucion = {2, 2, 3, 4};
      do_check(arr,solucion);
    }

    {
      int[] arr = {2, 4, 2, 4};
      int[] solucion = {2, 2, 4, 4};
      do_check(arr,solucion);
    }

    {
      int[] arr = {2, 4, 2, 5};
      int[] solucion = {2, 2, 4, 5};
      do_check(arr,solucion);
    }

    {
      int[] arr = {2, 4, 3, 1};
      int[] solucion = {1, 2, 3, 4};
      do_check(arr,solucion);
    }

    {
      int[] arr = {2, 4, 3, 2};
      int[] solucion = {2, 2, 3, 4};
      do_check(arr,solucion);
    }

    {
      int[] arr = {2, 4, 3, 3};
      int[] solucion = {2, 3, 3, 4};
      do_check(arr,solucion);
    }

    {
      int[] arr = {2, 4, 3, 4};
      int[] solucion = {2, 3, 4, 4};
      do_check(arr,solucion);
    }

    {
      int[] arr = {2, 4, 3, 5};
      int[] solucion = {2, 3, 4, 5};
      do_check(arr,solucion);
    }

    {
      int[] arr = {2, 4, 4, 1};
      int[] solucion = {1, 2, 4, 4};
      do_check(arr,solucion);
    }

    {
      int[] arr = {2, 4, 4, 2};
      int[] solucion = {2, 2, 4, 4};
      do_check(arr,solucion);
    }

    {
      int[] arr = {2, 4, 4, 3};
      int[] solucion = {2, 3, 4, 4};
      do_check(arr,solucion);
    }

    {
      int[] arr = {2, 4, 4, 4};
      int[] solucion = {2, 4, 4, 4};
      do_check(arr,solucion);
    }

    {
      int[] arr = {2, 4, 4, 5};
      int[] solucion = {2, 4, 4, 5};
      do_check(arr,solucion);
    }

    {
      int[] arr = {2, 4, 5, 1};
      int[] solucion = {1, 2, 4, 5};
      do_check(arr,solucion);
    }

    {
      int[] arr = {2, 4, 5, 2};
      int[] solucion = {2, 2, 4, 5};
      do_check(arr,solucion);
    }

    {
      int[] arr = {2, 4, 5, 3};
      int[] solucion = {2, 3, 4, 5};
      do_check(arr,solucion);
    }

    {
      int[] arr = {2, 4, 5, 4};
      int[] solucion = {2, 4, 4, 5};
      do_check(arr,solucion);
    }

    {
      int[] arr = {2, 4, 5, 5};
      int[] solucion = {2, 4, 5, 5};
      do_check(arr,solucion);
    }

    {
      int[] arr = {2, 5, 1, 1};
      int[] solucion = {1, 1, 2, 5};
      do_check(arr,solucion);
    }

    {
      int[] arr = {2, 5, 1, 2};
      int[] solucion = {1, 2, 2, 5};
      do_check(arr,solucion);
    }

    {
      int[] arr = {2, 5, 1, 3};
      int[] solucion = {1, 2, 3, 5};
      do_check(arr,solucion);
    }

    {
      int[] arr = {2, 5, 1, 4};
      int[] solucion = {1, 2, 4, 5};
      do_check(arr,solucion);
    }

    {
      int[] arr = {2, 5, 1, 5};
      int[] solucion = {1, 2, 5, 5};
      do_check(arr,solucion);
    }

    {
      int[] arr = {2, 5, 2, 1};
      int[] solucion = {1, 2, 2, 5};
      do_check(arr,solucion);
    }

    {
      int[] arr = {2, 5, 2, 2};
      int[] solucion = {2, 2, 2, 5};
      do_check(arr,solucion);
    }

    {
      int[] arr = {2, 5, 2, 3};
      int[] solucion = {2, 2, 3, 5};
      do_check(arr,solucion);
    }

    {
      int[] arr = {2, 5, 2, 4};
      int[] solucion = {2, 2, 4, 5};
      do_check(arr,solucion);
    }

    {
      int[] arr = {2, 5, 2, 5};
      int[] solucion = {2, 2, 5, 5};
      do_check(arr,solucion);
    }

    {
      int[] arr = {2, 5, 3, 1};
      int[] solucion = {1, 2, 3, 5};
      do_check(arr,solucion);
    }

    {
      int[] arr = {2, 5, 3, 2};
      int[] solucion = {2, 2, 3, 5};
      do_check(arr,solucion);
    }

    {
      int[] arr = {2, 5, 3, 3};
      int[] solucion = {2, 3, 3, 5};
      do_check(arr,solucion);
    }

    {
      int[] arr = {2, 5, 3, 4};
      int[] solucion = {2, 3, 4, 5};
      do_check(arr,solucion);
    }

    {
      int[] arr = {2, 5, 3, 5};
      int[] solucion = {2, 3, 5, 5};
      do_check(arr,solucion);
    }

    {
      int[] arr = {2, 5, 4, 1};
      int[] solucion = {1, 2, 4, 5};
      do_check(arr,solucion);
    }

    {
      int[] arr = {2, 5, 4, 2};
      int[] solucion = {2, 2, 4, 5};
      do_check(arr,solucion);
    }

    {
      int[] arr = {2, 5, 4, 3};
      int[] solucion = {2, 3, 4, 5};
      do_check(arr,solucion);
    }

    {
      int[] arr = {2, 5, 4, 4};
      int[] solucion = {2, 4, 4, 5};
      do_check(arr,solucion);
    }

    {
      int[] arr = {2, 5, 4, 5};
      int[] solucion = {2, 4, 5, 5};
      do_check(arr,solucion);
    }

    {
      int[] arr = {2, 5, 5, 1};
      int[] solucion = {1, 2, 5, 5};
      do_check(arr,solucion);
    }

    {
      int[] arr = {2, 5, 5, 2};
      int[] solucion = {2, 2, 5, 5};
      do_check(arr,solucion);
    }

    {
      int[] arr = {2, 5, 5, 3};
      int[] solucion = {2, 3, 5, 5};
      do_check(arr,solucion);
    }

    {
      int[] arr = {2, 5, 5, 4};
      int[] solucion = {2, 4, 5, 5};
      do_check(arr,solucion);
    }

    {
      int[] arr = {2, 5, 5, 5};
      int[] solucion = {2, 5, 5, 5};
      do_check(arr,solucion);
    }

    {
      int[] arr = {3, 1, 1, 1};
      int[] solucion = {1, 1, 1, 3};
      do_check(arr,solucion);
    }

    {
      int[] arr = {3, 1, 1, 2};
      int[] solucion = {1, 1, 2, 3};
      do_check(arr,solucion);
    }

    {
      int[] arr = {3, 1, 1, 3};
      int[] solucion = {1, 1, 3, 3};
      do_check(arr,solucion);
    }

    {
      int[] arr = {3, 1, 1, 4};
      int[] solucion = {1, 1, 3, 4};
      do_check(arr,solucion);
    }

    {
      int[] arr = {3, 1, 1, 5};
      int[] solucion = {1, 1, 3, 5};
      do_check(arr,solucion);
    }

    {
      int[] arr = {3, 1, 2, 1};
      int[] solucion = {1, 1, 2, 3};
      do_check(arr,solucion);
    }

    {
      int[] arr = {3, 1, 2, 2};
      int[] solucion = {1, 2, 2, 3};
      do_check(arr,solucion);
    }

    {
      int[] arr = {3, 1, 2, 3};
      int[] solucion = {1, 2, 3, 3};
      do_check(arr,solucion);
    }

    {
      int[] arr = {3, 1, 2, 4};
      int[] solucion = {1, 2, 3, 4};
      do_check(arr,solucion);
    }

    {
      int[] arr = {3, 1, 2, 5};
      int[] solucion = {1, 2, 3, 5};
      do_check(arr,solucion);
    }

    {
      int[] arr = {3, 1, 3, 1};
      int[] solucion = {1, 1, 3, 3};
      do_check(arr,solucion);
    }

    {
      int[] arr = {3, 1, 3, 2};
      int[] solucion = {1, 2, 3, 3};
      do_check(arr,solucion);
    }

    {
      int[] arr = {3, 1, 3, 3};
      int[] solucion = {1, 3, 3, 3};
      do_check(arr,solucion);
    }

    {
      int[] arr = {3, 1, 3, 4};
      int[] solucion = {1, 3, 3, 4};
      do_check(arr,solucion);
    }

    {
      int[] arr = {3, 1, 3, 5};
      int[] solucion = {1, 3, 3, 5};
      do_check(arr,solucion);
    }

    {
      int[] arr = {3, 1, 4, 1};
      int[] solucion = {1, 1, 3, 4};
      do_check(arr,solucion);
    }

    {
      int[] arr = {3, 1, 4, 2};
      int[] solucion = {1, 2, 3, 4};
      do_check(arr,solucion);
    }

    {
      int[] arr = {3, 1, 4, 3};
      int[] solucion = {1, 3, 3, 4};
      do_check(arr,solucion);
    }

    {
      int[] arr = {3, 1, 4, 4};
      int[] solucion = {1, 3, 4, 4};
      do_check(arr,solucion);
    }

    {
      int[] arr = {3, 1, 4, 5};
      int[] solucion = {1, 3, 4, 5};
      do_check(arr,solucion);
    }

    {
      int[] arr = {3, 1, 5, 1};
      int[] solucion = {1, 1, 3, 5};
      do_check(arr,solucion);
    }

    {
      int[] arr = {3, 1, 5, 2};
      int[] solucion = {1, 2, 3, 5};
      do_check(arr,solucion);
    }

    {
      int[] arr = {3, 1, 5, 3};
      int[] solucion = {1, 3, 3, 5};
      do_check(arr,solucion);
    }

    {
      int[] arr = {3, 1, 5, 4};
      int[] solucion = {1, 3, 4, 5};
      do_check(arr,solucion);
    }

    {
      int[] arr = {3, 1, 5, 5};
      int[] solucion = {1, 3, 5, 5};
      do_check(arr,solucion);
    }

    {
      int[] arr = {3, 2, 1, 1};
      int[] solucion = {1, 1, 2, 3};
      do_check(arr,solucion);
    }

    {
      int[] arr = {3, 2, 1, 2};
      int[] solucion = {1, 2, 2, 3};
      do_check(arr,solucion);
    }

    {
      int[] arr = {3, 2, 1, 3};
      int[] solucion = {1, 2, 3, 3};
      do_check(arr,solucion);
    }

    {
      int[] arr = {3, 2, 1, 4};
      int[] solucion = {1, 2, 3, 4};
      do_check(arr,solucion);
    }

    {
      int[] arr = {3, 2, 1, 5};
      int[] solucion = {1, 2, 3, 5};
      do_check(arr,solucion);
    }

    {
      int[] arr = {3, 2, 2, 1};
      int[] solucion = {1, 2, 2, 3};
      do_check(arr,solucion);
    }

    {
      int[] arr = {3, 2, 2, 2};
      int[] solucion = {2, 2, 2, 3};
      do_check(arr,solucion);
    }

    {
      int[] arr = {3, 2, 2, 3};
      int[] solucion = {2, 2, 3, 3};
      do_check(arr,solucion);
    }

    {
      int[] arr = {3, 2, 2, 4};
      int[] solucion = {2, 2, 3, 4};
      do_check(arr,solucion);
    }

    {
      int[] arr = {3, 2, 2, 5};
      int[] solucion = {2, 2, 3, 5};
      do_check(arr,solucion);
    }

    {
      int[] arr = {3, 2, 3, 1};
      int[] solucion = {1, 2, 3, 3};
      do_check(arr,solucion);
    }

    {
      int[] arr = {3, 2, 3, 2};
      int[] solucion = {2, 2, 3, 3};
      do_check(arr,solucion);
    }

    {
      int[] arr = {3, 2, 3, 3};
      int[] solucion = {2, 3, 3, 3};
      do_check(arr,solucion);
    }

    {
      int[] arr = {3, 2, 3, 4};
      int[] solucion = {2, 3, 3, 4};
      do_check(arr,solucion);
    }

    {
      int[] arr = {3, 2, 3, 5};
      int[] solucion = {2, 3, 3, 5};
      do_check(arr,solucion);
    }

    {
      int[] arr = {3, 2, 4, 1};
      int[] solucion = {1, 2, 3, 4};
      do_check(arr,solucion);
    }

    {
      int[] arr = {3, 2, 4, 2};
      int[] solucion = {2, 2, 3, 4};
      do_check(arr,solucion);
    }

    {
      int[] arr = {3, 2, 4, 3};
      int[] solucion = {2, 3, 3, 4};
      do_check(arr,solucion);
    }

    {
      int[] arr = {3, 2, 4, 4};
      int[] solucion = {2, 3, 4, 4};
      do_check(arr,solucion);
    }

    {
      int[] arr = {3, 2, 4, 5};
      int[] solucion = {2, 3, 4, 5};
      do_check(arr,solucion);
    }

    {
      int[] arr = {3, 2, 5, 1};
      int[] solucion = {1, 2, 3, 5};
      do_check(arr,solucion);
    }

    {
      int[] arr = {3, 2, 5, 2};
      int[] solucion = {2, 2, 3, 5};
      do_check(arr,solucion);
    }

    {
      int[] arr = {3, 2, 5, 3};
      int[] solucion = {2, 3, 3, 5};
      do_check(arr,solucion);
    }

    {
      int[] arr = {3, 2, 5, 4};
      int[] solucion = {2, 3, 4, 5};
      do_check(arr,solucion);
    }

    {
      int[] arr = {3, 2, 5, 5};
      int[] solucion = {2, 3, 5, 5};
      do_check(arr,solucion);
    }

    {
      int[] arr = {3, 3, 1, 1};
      int[] solucion = {1, 1, 3, 3};
      do_check(arr,solucion);
    }

    {
      int[] arr = {3, 3, 1, 2};
      int[] solucion = {1, 2, 3, 3};
      do_check(arr,solucion);
    }

    {
      int[] arr = {3, 3, 1, 3};
      int[] solucion = {1, 3, 3, 3};
      do_check(arr,solucion);
    }

    {
      int[] arr = {3, 3, 1, 4};
      int[] solucion = {1, 3, 3, 4};
      do_check(arr,solucion);
    }

    {
      int[] arr = {3, 3, 1, 5};
      int[] solucion = {1, 3, 3, 5};
      do_check(arr,solucion);
    }

    {
      int[] arr = {3, 3, 2, 1};
      int[] solucion = {1, 2, 3, 3};
      do_check(arr,solucion);
    }

    {
      int[] arr = {3, 3, 2, 2};
      int[] solucion = {2, 2, 3, 3};
      do_check(arr,solucion);
    }

    {
      int[] arr = {3, 3, 2, 3};
      int[] solucion = {2, 3, 3, 3};
      do_check(arr,solucion);
    }

    {
      int[] arr = {3, 3, 2, 4};
      int[] solucion = {2, 3, 3, 4};
      do_check(arr,solucion);
    }

    {
      int[] arr = {3, 3, 2, 5};
      int[] solucion = {2, 3, 3, 5};
      do_check(arr,solucion);
    }

    {
      int[] arr = {3, 3, 3, 1};
      int[] solucion = {1, 3, 3, 3};
      do_check(arr,solucion);
    }

    {
      int[] arr = {3, 3, 3, 2};
      int[] solucion = {2, 3, 3, 3};
      do_check(arr,solucion);
    }

    {
      int[] arr = {3, 3, 3, 3};
      int[] solucion = {3, 3, 3, 3};
      do_check(arr,solucion);
    }

    {
      int[] arr = {3, 3, 3, 4};
      int[] solucion = {3, 3, 3, 4};
      do_check(arr,solucion);
    }

    {
      int[] arr = {3, 3, 3, 5};
      int[] solucion = {3, 3, 3, 5};
      do_check(arr,solucion);
    }

    {
      int[] arr = {3, 3, 4, 1};
      int[] solucion = {1, 3, 3, 4};
      do_check(arr,solucion);
    }

    {
      int[] arr = {3, 3, 4, 2};
      int[] solucion = {2, 3, 3, 4};
      do_check(arr,solucion);
    }

    {
      int[] arr = {3, 3, 4, 3};
      int[] solucion = {3, 3, 3, 4};
      do_check(arr,solucion);
    }

    {
      int[] arr = {3, 3, 4, 4};
      int[] solucion = {3, 3, 4, 4};
      do_check(arr,solucion);
    }

    {
      int[] arr = {3, 3, 4, 5};
      int[] solucion = {3, 3, 4, 5};
      do_check(arr,solucion);
    }

    {
      int[] arr = {3, 3, 5, 1};
      int[] solucion = {1, 3, 3, 5};
      do_check(arr,solucion);
    }

    {
      int[] arr = {3, 3, 5, 2};
      int[] solucion = {2, 3, 3, 5};
      do_check(arr,solucion);
    }

    {
      int[] arr = {3, 3, 5, 3};
      int[] solucion = {3, 3, 3, 5};
      do_check(arr,solucion);
    }

    {
      int[] arr = {3, 3, 5, 4};
      int[] solucion = {3, 3, 4, 5};
      do_check(arr,solucion);
    }

    {
      int[] arr = {3, 3, 5, 5};
      int[] solucion = {3, 3, 5, 5};
      do_check(arr,solucion);
    }

    {
      int[] arr = {3, 4, 1, 1};
      int[] solucion = {1, 1, 3, 4};
      do_check(arr,solucion);
    }

    {
      int[] arr = {3, 4, 1, 2};
      int[] solucion = {1, 2, 3, 4};
      do_check(arr,solucion);
    }

    {
      int[] arr = {3, 4, 1, 3};
      int[] solucion = {1, 3, 3, 4};
      do_check(arr,solucion);
    }

    {
      int[] arr = {3, 4, 1, 4};
      int[] solucion = {1, 3, 4, 4};
      do_check(arr,solucion);
    }

    {
      int[] arr = {3, 4, 1, 5};
      int[] solucion = {1, 3, 4, 5};
      do_check(arr,solucion);
    }

    {
      int[] arr = {3, 4, 2, 1};
      int[] solucion = {1, 2, 3, 4};
      do_check(arr,solucion);
    }

    {
      int[] arr = {3, 4, 2, 2};
      int[] solucion = {2, 2, 3, 4};
      do_check(arr,solucion);
    }

    {
      int[] arr = {3, 4, 2, 3};
      int[] solucion = {2, 3, 3, 4};
      do_check(arr,solucion);
    }

    {
      int[] arr = {3, 4, 2, 4};
      int[] solucion = {2, 3, 4, 4};
      do_check(arr,solucion);
    }

    {
      int[] arr = {3, 4, 2, 5};
      int[] solucion = {2, 3, 4, 5};
      do_check(arr,solucion);
    }

    {
      int[] arr = {3, 4, 3, 1};
      int[] solucion = {1, 3, 3, 4};
      do_check(arr,solucion);
    }

    {
      int[] arr = {3, 4, 3, 2};
      int[] solucion = {2, 3, 3, 4};
      do_check(arr,solucion);
    }

    {
      int[] arr = {3, 4, 3, 3};
      int[] solucion = {3, 3, 3, 4};
      do_check(arr,solucion);
    }

    {
      int[] arr = {3, 4, 3, 4};
      int[] solucion = {3, 3, 4, 4};
      do_check(arr,solucion);
    }

    {
      int[] arr = {3, 4, 3, 5};
      int[] solucion = {3, 3, 4, 5};
      do_check(arr,solucion);
    }

    {
      int[] arr = {3, 4, 4, 1};
      int[] solucion = {1, 3, 4, 4};
      do_check(arr,solucion);
    }

    {
      int[] arr = {3, 4, 4, 2};
      int[] solucion = {2, 3, 4, 4};
      do_check(arr,solucion);
    }

    {
      int[] arr = {3, 4, 4, 3};
      int[] solucion = {3, 3, 4, 4};
      do_check(arr,solucion);
    }

    {
      int[] arr = {3, 4, 4, 4};
      int[] solucion = {3, 4, 4, 4};
      do_check(arr,solucion);
    }

    {
      int[] arr = {3, 4, 4, 5};
      int[] solucion = {3, 4, 4, 5};
      do_check(arr,solucion);
    }

    {
      int[] arr = {3, 4, 5, 1};
      int[] solucion = {1, 3, 4, 5};
      do_check(arr,solucion);
    }

    {
      int[] arr = {3, 4, 5, 2};
      int[] solucion = {2, 3, 4, 5};
      do_check(arr,solucion);
    }

    {
      int[] arr = {3, 4, 5, 3};
      int[] solucion = {3, 3, 4, 5};
      do_check(arr,solucion);
    }

    {
      int[] arr = {3, 4, 5, 4};
      int[] solucion = {3, 4, 4, 5};
      do_check(arr,solucion);
    }

    {
      int[] arr = {3, 4, 5, 5};
      int[] solucion = {3, 4, 5, 5};
      do_check(arr,solucion);
    }

    {
      int[] arr = {3, 5, 1, 1};
      int[] solucion = {1, 1, 3, 5};
      do_check(arr,solucion);
    }

    {
      int[] arr = {3, 5, 1, 2};
      int[] solucion = {1, 2, 3, 5};
      do_check(arr,solucion);
    }

    {
      int[] arr = {3, 5, 1, 3};
      int[] solucion = {1, 3, 3, 5};
      do_check(arr,solucion);
    }

    {
      int[] arr = {3, 5, 1, 4};
      int[] solucion = {1, 3, 4, 5};
      do_check(arr,solucion);
    }

    {
      int[] arr = {3, 5, 1, 5};
      int[] solucion = {1, 3, 5, 5};
      do_check(arr,solucion);
    }

    {
      int[] arr = {3, 5, 2, 1};
      int[] solucion = {1, 2, 3, 5};
      do_check(arr,solucion);
    }

    {
      int[] arr = {3, 5, 2, 2};
      int[] solucion = {2, 2, 3, 5};
      do_check(arr,solucion);
    }

    {
      int[] arr = {3, 5, 2, 3};
      int[] solucion = {2, 3, 3, 5};
      do_check(arr,solucion);
    }

    {
      int[] arr = {3, 5, 2, 4};
      int[] solucion = {2, 3, 4, 5};
      do_check(arr,solucion);
    }

    {
      int[] arr = {3, 5, 2, 5};
      int[] solucion = {2, 3, 5, 5};
      do_check(arr,solucion);
    }

    {
      int[] arr = {3, 5, 3, 1};
      int[] solucion = {1, 3, 3, 5};
      do_check(arr,solucion);
    }

    {
      int[] arr = {3, 5, 3, 2};
      int[] solucion = {2, 3, 3, 5};
      do_check(arr,solucion);
    }

    {
      int[] arr = {3, 5, 3, 3};
      int[] solucion = {3, 3, 3, 5};
      do_check(arr,solucion);
    }

    {
      int[] arr = {3, 5, 3, 4};
      int[] solucion = {3, 3, 4, 5};
      do_check(arr,solucion);
    }

    {
      int[] arr = {3, 5, 3, 5};
      int[] solucion = {3, 3, 5, 5};
      do_check(arr,solucion);
    }

    {
      int[] arr = {3, 5, 4, 1};
      int[] solucion = {1, 3, 4, 5};
      do_check(arr,solucion);
    }

    {
      int[] arr = {3, 5, 4, 2};
      int[] solucion = {2, 3, 4, 5};
      do_check(arr,solucion);
    }

    {
      int[] arr = {3, 5, 4, 3};
      int[] solucion = {3, 3, 4, 5};
      do_check(arr,solucion);
    }

    {
      int[] arr = {3, 5, 4, 4};
      int[] solucion = {3, 4, 4, 5};
      do_check(arr,solucion);
    }

    {
      int[] arr = {3, 5, 4, 5};
      int[] solucion = {3, 4, 5, 5};
      do_check(arr,solucion);
    }

    {
      int[] arr = {3, 5, 5, 1};
      int[] solucion = {1, 3, 5, 5};
      do_check(arr,solucion);
    }

    {
      int[] arr = {3, 5, 5, 2};
      int[] solucion = {2, 3, 5, 5};
      do_check(arr,solucion);
    }

    {
      int[] arr = {3, 5, 5, 3};
      int[] solucion = {3, 3, 5, 5};
      do_check(arr,solucion);
    }

    {
      int[] arr = {3, 5, 5, 4};
      int[] solucion = {3, 4, 5, 5};
      do_check(arr,solucion);
    }

    {
      int[] arr = {3, 5, 5, 5};
      int[] solucion = {3, 5, 5, 5};
      do_check(arr,solucion);
    }

    {
      int[] arr = {4, 1, 1, 1};
      int[] solucion = {1, 1, 1, 4};
      do_check(arr,solucion);
    }

    {
      int[] arr = {4, 1, 1, 2};
      int[] solucion = {1, 1, 2, 4};
      do_check(arr,solucion);
    }

    {
      int[] arr = {4, 1, 1, 3};
      int[] solucion = {1, 1, 3, 4};
      do_check(arr,solucion);
    }

    {
      int[] arr = {4, 1, 1, 4};
      int[] solucion = {1, 1, 4, 4};
      do_check(arr,solucion);
    }

    {
      int[] arr = {4, 1, 1, 5};
      int[] solucion = {1, 1, 4, 5};
      do_check(arr,solucion);
    }

    {
      int[] arr = {4, 1, 2, 1};
      int[] solucion = {1, 1, 2, 4};
      do_check(arr,solucion);
    }

    {
      int[] arr = {4, 1, 2, 2};
      int[] solucion = {1, 2, 2, 4};
      do_check(arr,solucion);
    }

    {
      int[] arr = {4, 1, 2, 3};
      int[] solucion = {1, 2, 3, 4};
      do_check(arr,solucion);
    }

    {
      int[] arr = {4, 1, 2, 4};
      int[] solucion = {1, 2, 4, 4};
      do_check(arr,solucion);
    }

    {
      int[] arr = {4, 1, 2, 5};
      int[] solucion = {1, 2, 4, 5};
      do_check(arr,solucion);
    }

    {
      int[] arr = {4, 1, 3, 1};
      int[] solucion = {1, 1, 3, 4};
      do_check(arr,solucion);
    }

    {
      int[] arr = {4, 1, 3, 2};
      int[] solucion = {1, 2, 3, 4};
      do_check(arr,solucion);
    }

    {
      int[] arr = {4, 1, 3, 3};
      int[] solucion = {1, 3, 3, 4};
      do_check(arr,solucion);
    }

    {
      int[] arr = {4, 1, 3, 4};
      int[] solucion = {1, 3, 4, 4};
      do_check(arr,solucion);
    }

    {
      int[] arr = {4, 1, 3, 5};
      int[] solucion = {1, 3, 4, 5};
      do_check(arr,solucion);
    }

    {
      int[] arr = {4, 1, 4, 1};
      int[] solucion = {1, 1, 4, 4};
      do_check(arr,solucion);
    }

    {
      int[] arr = {4, 1, 4, 2};
      int[] solucion = {1, 2, 4, 4};
      do_check(arr,solucion);
    }

    {
      int[] arr = {4, 1, 4, 3};
      int[] solucion = {1, 3, 4, 4};
      do_check(arr,solucion);
    }

    {
      int[] arr = {4, 1, 4, 4};
      int[] solucion = {1, 4, 4, 4};
      do_check(arr,solucion);
    }

    {
      int[] arr = {4, 1, 4, 5};
      int[] solucion = {1, 4, 4, 5};
      do_check(arr,solucion);
    }

    {
      int[] arr = {4, 1, 5, 1};
      int[] solucion = {1, 1, 4, 5};
      do_check(arr,solucion);
    }

    {
      int[] arr = {4, 1, 5, 2};
      int[] solucion = {1, 2, 4, 5};
      do_check(arr,solucion);
    }

    {
      int[] arr = {4, 1, 5, 3};
      int[] solucion = {1, 3, 4, 5};
      do_check(arr,solucion);
    }

    {
      int[] arr = {4, 1, 5, 4};
      int[] solucion = {1, 4, 4, 5};
      do_check(arr,solucion);
    }

    {
      int[] arr = {4, 1, 5, 5};
      int[] solucion = {1, 4, 5, 5};
      do_check(arr,solucion);
    }

    {
      int[] arr = {4, 2, 1, 1};
      int[] solucion = {1, 1, 2, 4};
      do_check(arr,solucion);
    }

    {
      int[] arr = {4, 2, 1, 2};
      int[] solucion = {1, 2, 2, 4};
      do_check(arr,solucion);
    }

    {
      int[] arr = {4, 2, 1, 3};
      int[] solucion = {1, 2, 3, 4};
      do_check(arr,solucion);
    }

    {
      int[] arr = {4, 2, 1, 4};
      int[] solucion = {1, 2, 4, 4};
      do_check(arr,solucion);
    }

    {
      int[] arr = {4, 2, 1, 5};
      int[] solucion = {1, 2, 4, 5};
      do_check(arr,solucion);
    }

    {
      int[] arr = {4, 2, 2, 1};
      int[] solucion = {1, 2, 2, 4};
      do_check(arr,solucion);
    }

    {
      int[] arr = {4, 2, 2, 2};
      int[] solucion = {2, 2, 2, 4};
      do_check(arr,solucion);
    }

    {
      int[] arr = {4, 2, 2, 3};
      int[] solucion = {2, 2, 3, 4};
      do_check(arr,solucion);
    }

    {
      int[] arr = {4, 2, 2, 4};
      int[] solucion = {2, 2, 4, 4};
      do_check(arr,solucion);
    }

    {
      int[] arr = {4, 2, 2, 5};
      int[] solucion = {2, 2, 4, 5};
      do_check(arr,solucion);
    }

    {
      int[] arr = {4, 2, 3, 1};
      int[] solucion = {1, 2, 3, 4};
      do_check(arr,solucion);
    }

    {
      int[] arr = {4, 2, 3, 2};
      int[] solucion = {2, 2, 3, 4};
      do_check(arr,solucion);
    }

    {
      int[] arr = {4, 2, 3, 3};
      int[] solucion = {2, 3, 3, 4};
      do_check(arr,solucion);
    }

    {
      int[] arr = {4, 2, 3, 4};
      int[] solucion = {2, 3, 4, 4};
      do_check(arr,solucion);
    }

    {
      int[] arr = {4, 2, 3, 5};
      int[] solucion = {2, 3, 4, 5};
      do_check(arr,solucion);
    }

    {
      int[] arr = {4, 2, 4, 1};
      int[] solucion = {1, 2, 4, 4};
      do_check(arr,solucion);
    }

    {
      int[] arr = {4, 2, 4, 2};
      int[] solucion = {2, 2, 4, 4};
      do_check(arr,solucion);
    }

    {
      int[] arr = {4, 2, 4, 3};
      int[] solucion = {2, 3, 4, 4};
      do_check(arr,solucion);
    }

    {
      int[] arr = {4, 2, 4, 4};
      int[] solucion = {2, 4, 4, 4};
      do_check(arr,solucion);
    }

    {
      int[] arr = {4, 2, 4, 5};
      int[] solucion = {2, 4, 4, 5};
      do_check(arr,solucion);
    }

    {
      int[] arr = {4, 2, 5, 1};
      int[] solucion = {1, 2, 4, 5};
      do_check(arr,solucion);
    }

    {
      int[] arr = {4, 2, 5, 2};
      int[] solucion = {2, 2, 4, 5};
      do_check(arr,solucion);
    }

    {
      int[] arr = {4, 2, 5, 3};
      int[] solucion = {2, 3, 4, 5};
      do_check(arr,solucion);
    }

    {
      int[] arr = {4, 2, 5, 4};
      int[] solucion = {2, 4, 4, 5};
      do_check(arr,solucion);
    }

    {
      int[] arr = {4, 2, 5, 5};
      int[] solucion = {2, 4, 5, 5};
      do_check(arr,solucion);
    }

    {
      int[] arr = {4, 3, 1, 1};
      int[] solucion = {1, 1, 3, 4};
      do_check(arr,solucion);
    }

    {
      int[] arr = {4, 3, 1, 2};
      int[] solucion = {1, 2, 3, 4};
      do_check(arr,solucion);
    }

    {
      int[] arr = {4, 3, 1, 3};
      int[] solucion = {1, 3, 3, 4};
      do_check(arr,solucion);
    }

    {
      int[] arr = {4, 3, 1, 4};
      int[] solucion = {1, 3, 4, 4};
      do_check(arr,solucion);
    }

    {
      int[] arr = {4, 3, 1, 5};
      int[] solucion = {1, 3, 4, 5};
      do_check(arr,solucion);
    }

    {
      int[] arr = {4, 3, 2, 1};
      int[] solucion = {1, 2, 3, 4};
      do_check(arr,solucion);
    }

    {
      int[] arr = {4, 3, 2, 2};
      int[] solucion = {2, 2, 3, 4};
      do_check(arr,solucion);
    }

    {
      int[] arr = {4, 3, 2, 3};
      int[] solucion = {2, 3, 3, 4};
      do_check(arr,solucion);
    }

    {
      int[] arr = {4, 3, 2, 4};
      int[] solucion = {2, 3, 4, 4};
      do_check(arr,solucion);
    }

    {
      int[] arr = {4, 3, 2, 5};
      int[] solucion = {2, 3, 4, 5};
      do_check(arr,solucion);
    }

    {
      int[] arr = {4, 3, 3, 1};
      int[] solucion = {1, 3, 3, 4};
      do_check(arr,solucion);
    }

    {
      int[] arr = {4, 3, 3, 2};
      int[] solucion = {2, 3, 3, 4};
      do_check(arr,solucion);
    }

    {
      int[] arr = {4, 3, 3, 3};
      int[] solucion = {3, 3, 3, 4};
      do_check(arr,solucion);
    }

    {
      int[] arr = {4, 3, 3, 4};
      int[] solucion = {3, 3, 4, 4};
      do_check(arr,solucion);
    }

    {
      int[] arr = {4, 3, 3, 5};
      int[] solucion = {3, 3, 4, 5};
      do_check(arr,solucion);
    }

    {
      int[] arr = {4, 3, 4, 1};
      int[] solucion = {1, 3, 4, 4};
      do_check(arr,solucion);
    }

    {
      int[] arr = {4, 3, 4, 2};
      int[] solucion = {2, 3, 4, 4};
      do_check(arr,solucion);
    }

    {
      int[] arr = {4, 3, 4, 3};
      int[] solucion = {3, 3, 4, 4};
      do_check(arr,solucion);
    }

    {
      int[] arr = {4, 3, 4, 4};
      int[] solucion = {3, 4, 4, 4};
      do_check(arr,solucion);
    }

    {
      int[] arr = {4, 3, 4, 5};
      int[] solucion = {3, 4, 4, 5};
      do_check(arr,solucion);
    }

    {
      int[] arr = {4, 3, 5, 1};
      int[] solucion = {1, 3, 4, 5};
      do_check(arr,solucion);
    }

    {
      int[] arr = {4, 3, 5, 2};
      int[] solucion = {2, 3, 4, 5};
      do_check(arr,solucion);
    }

    {
      int[] arr = {4, 3, 5, 3};
      int[] solucion = {3, 3, 4, 5};
      do_check(arr,solucion);
    }

    {
      int[] arr = {4, 3, 5, 4};
      int[] solucion = {3, 4, 4, 5};
      do_check(arr,solucion);
    }

    {
      int[] arr = {4, 3, 5, 5};
      int[] solucion = {3, 4, 5, 5};
      do_check(arr,solucion);
    }

    {
      int[] arr = {4, 4, 1, 1};
      int[] solucion = {1, 1, 4, 4};
      do_check(arr,solucion);
    }

    {
      int[] arr = {4, 4, 1, 2};
      int[] solucion = {1, 2, 4, 4};
      do_check(arr,solucion);
    }

    {
      int[] arr = {4, 4, 1, 3};
      int[] solucion = {1, 3, 4, 4};
      do_check(arr,solucion);
    }

    {
      int[] arr = {4, 4, 1, 4};
      int[] solucion = {1, 4, 4, 4};
      do_check(arr,solucion);
    }

    {
      int[] arr = {4, 4, 1, 5};
      int[] solucion = {1, 4, 4, 5};
      do_check(arr,solucion);
    }

    {
      int[] arr = {4, 4, 2, 1};
      int[] solucion = {1, 2, 4, 4};
      do_check(arr,solucion);
    }

    {
      int[] arr = {4, 4, 2, 2};
      int[] solucion = {2, 2, 4, 4};
      do_check(arr,solucion);
    }

    {
      int[] arr = {4, 4, 2, 3};
      int[] solucion = {2, 3, 4, 4};
      do_check(arr,solucion);
    }

    {
      int[] arr = {4, 4, 2, 4};
      int[] solucion = {2, 4, 4, 4};
      do_check(arr,solucion);
    }

    {
      int[] arr = {4, 4, 2, 5};
      int[] solucion = {2, 4, 4, 5};
      do_check(arr,solucion);
    }

    {
      int[] arr = {4, 4, 3, 1};
      int[] solucion = {1, 3, 4, 4};
      do_check(arr,solucion);
    }

    {
      int[] arr = {4, 4, 3, 2};
      int[] solucion = {2, 3, 4, 4};
      do_check(arr,solucion);
    }

    {
      int[] arr = {4, 4, 3, 3};
      int[] solucion = {3, 3, 4, 4};
      do_check(arr,solucion);
    }

    {
      int[] arr = {4, 4, 3, 4};
      int[] solucion = {3, 4, 4, 4};
      do_check(arr,solucion);
    }

    {
      int[] arr = {4, 4, 3, 5};
      int[] solucion = {3, 4, 4, 5};
      do_check(arr,solucion);
    }

    {
      int[] arr = {4, 4, 4, 1};
      int[] solucion = {1, 4, 4, 4};
      do_check(arr,solucion);
    }

    {
      int[] arr = {4, 4, 4, 2};
      int[] solucion = {2, 4, 4, 4};
      do_check(arr,solucion);
    }

    {
      int[] arr = {4, 4, 4, 3};
      int[] solucion = {3, 4, 4, 4};
      do_check(arr,solucion);
    }

    {
      int[] arr = {4, 4, 4, 4};
      int[] solucion = {4, 4, 4, 4};
      do_check(arr,solucion);
    }

    {
      int[] arr = {4, 4, 4, 5};
      int[] solucion = {4, 4, 4, 5};
      do_check(arr,solucion);
    }

    {
      int[] arr = {4, 4, 5, 1};
      int[] solucion = {1, 4, 4, 5};
      do_check(arr,solucion);
    }

    {
      int[] arr = {4, 4, 5, 2};
      int[] solucion = {2, 4, 4, 5};
      do_check(arr,solucion);
    }

    {
      int[] arr = {4, 4, 5, 3};
      int[] solucion = {3, 4, 4, 5};
      do_check(arr,solucion);
    }

    {
      int[] arr = {4, 4, 5, 4};
      int[] solucion = {4, 4, 4, 5};
      do_check(arr,solucion);
    }

    {
      int[] arr = {4, 4, 5, 5};
      int[] solucion = {4, 4, 5, 5};
      do_check(arr,solucion);
    }

    {
      int[] arr = {4, 5, 1, 1};
      int[] solucion = {1, 1, 4, 5};
      do_check(arr,solucion);
    }

    {
      int[] arr = {4, 5, 1, 2};
      int[] solucion = {1, 2, 4, 5};
      do_check(arr,solucion);
    }

    {
      int[] arr = {4, 5, 1, 3};
      int[] solucion = {1, 3, 4, 5};
      do_check(arr,solucion);
    }

    {
      int[] arr = {4, 5, 1, 4};
      int[] solucion = {1, 4, 4, 5};
      do_check(arr,solucion);
    }

    {
      int[] arr = {4, 5, 1, 5};
      int[] solucion = {1, 4, 5, 5};
      do_check(arr,solucion);
    }

    {
      int[] arr = {4, 5, 2, 1};
      int[] solucion = {1, 2, 4, 5};
      do_check(arr,solucion);
    }

    {
      int[] arr = {4, 5, 2, 2};
      int[] solucion = {2, 2, 4, 5};
      do_check(arr,solucion);
    }

    {
      int[] arr = {4, 5, 2, 3};
      int[] solucion = {2, 3, 4, 5};
      do_check(arr,solucion);
    }

    {
      int[] arr = {4, 5, 2, 4};
      int[] solucion = {2, 4, 4, 5};
      do_check(arr,solucion);
    }

    {
      int[] arr = {4, 5, 2, 5};
      int[] solucion = {2, 4, 5, 5};
      do_check(arr,solucion);
    }

    {
      int[] arr = {4, 5, 3, 1};
      int[] solucion = {1, 3, 4, 5};
      do_check(arr,solucion);
    }

    {
      int[] arr = {4, 5, 3, 2};
      int[] solucion = {2, 3, 4, 5};
      do_check(arr,solucion);
    }

    {
      int[] arr = {4, 5, 3, 3};
      int[] solucion = {3, 3, 4, 5};
      do_check(arr,solucion);
    }

    {
      int[] arr = {4, 5, 3, 4};
      int[] solucion = {3, 4, 4, 5};
      do_check(arr,solucion);
    }

    {
      int[] arr = {4, 5, 3, 5};
      int[] solucion = {3, 4, 5, 5};
      do_check(arr,solucion);
    }

    {
      int[] arr = {4, 5, 4, 1};
      int[] solucion = {1, 4, 4, 5};
      do_check(arr,solucion);
    }

    {
      int[] arr = {4, 5, 4, 2};
      int[] solucion = {2, 4, 4, 5};
      do_check(arr,solucion);
    }

    {
      int[] arr = {4, 5, 4, 3};
      int[] solucion = {3, 4, 4, 5};
      do_check(arr,solucion);
    }

    {
      int[] arr = {4, 5, 4, 4};
      int[] solucion = {4, 4, 4, 5};
      do_check(arr,solucion);
    }

    {
      int[] arr = {4, 5, 4, 5};
      int[] solucion = {4, 4, 5, 5};
      do_check(arr,solucion);
    }

    {
      int[] arr = {4, 5, 5, 1};
      int[] solucion = {1, 4, 5, 5};
      do_check(arr,solucion);
    }

    {
      int[] arr = {4, 5, 5, 2};
      int[] solucion = {2, 4, 5, 5};
      do_check(arr,solucion);
    }

    {
      int[] arr = {4, 5, 5, 3};
      int[] solucion = {3, 4, 5, 5};
      do_check(arr,solucion);
    }

    {
      int[] arr = {4, 5, 5, 4};
      int[] solucion = {4, 4, 5, 5};
      do_check(arr,solucion);
    }

    {
      int[] arr = {4, 5, 5, 5};
      int[] solucion = {4, 5, 5, 5};
      do_check(arr,solucion);
    }

    {
      int[] arr = {5, 1, 1, 1};
      int[] solucion = {1, 1, 1, 5};
      do_check(arr,solucion);
    }

    {
      int[] arr = {5, 1, 1, 2};
      int[] solucion = {1, 1, 2, 5};
      do_check(arr,solucion);
    }

    {
      int[] arr = {5, 1, 1, 3};
      int[] solucion = {1, 1, 3, 5};
      do_check(arr,solucion);
    }

    {
      int[] arr = {5, 1, 1, 4};
      int[] solucion = {1, 1, 4, 5};
      do_check(arr,solucion);
    }

    {
      int[] arr = {5, 1, 1, 5};
      int[] solucion = {1, 1, 5, 5};
      do_check(arr,solucion);
    }

    {
      int[] arr = {5, 1, 2, 1};
      int[] solucion = {1, 1, 2, 5};
      do_check(arr,solucion);
    }

    {
      int[] arr = {5, 1, 2, 2};
      int[] solucion = {1, 2, 2, 5};
      do_check(arr,solucion);
    }

    {
      int[] arr = {5, 1, 2, 3};
      int[] solucion = {1, 2, 3, 5};
      do_check(arr,solucion);
    }

    {
      int[] arr = {5, 1, 2, 4};
      int[] solucion = {1, 2, 4, 5};
      do_check(arr,solucion);
    }

    {
      int[] arr = {5, 1, 2, 5};
      int[] solucion = {1, 2, 5, 5};
      do_check(arr,solucion);
    }

    {
      int[] arr = {5, 1, 3, 1};
      int[] solucion = {1, 1, 3, 5};
      do_check(arr,solucion);
    }

    {
      int[] arr = {5, 1, 3, 2};
      int[] solucion = {1, 2, 3, 5};
      do_check(arr,solucion);
    }

    {
      int[] arr = {5, 1, 3, 3};
      int[] solucion = {1, 3, 3, 5};
      do_check(arr,solucion);
    }

    {
      int[] arr = {5, 1, 3, 4};
      int[] solucion = {1, 3, 4, 5};
      do_check(arr,solucion);
    }

    {
      int[] arr = {5, 1, 3, 5};
      int[] solucion = {1, 3, 5, 5};
      do_check(arr,solucion);
    }

    {
      int[] arr = {5, 1, 4, 1};
      int[] solucion = {1, 1, 4, 5};
      do_check(arr,solucion);
    }

    {
      int[] arr = {5, 1, 4, 2};
      int[] solucion = {1, 2, 4, 5};
      do_check(arr,solucion);
    }

    {
      int[] arr = {5, 1, 4, 3};
      int[] solucion = {1, 3, 4, 5};
      do_check(arr,solucion);
    }

    {
      int[] arr = {5, 1, 4, 4};
      int[] solucion = {1, 4, 4, 5};
      do_check(arr,solucion);
    }

    {
      int[] arr = {5, 1, 4, 5};
      int[] solucion = {1, 4, 5, 5};
      do_check(arr,solucion);
    }

    {
      int[] arr = {5, 1, 5, 1};
      int[] solucion = {1, 1, 5, 5};
      do_check(arr,solucion);
    }

    {
      int[] arr = {5, 1, 5, 2};
      int[] solucion = {1, 2, 5, 5};
      do_check(arr,solucion);
    }

    {
      int[] arr = {5, 1, 5, 3};
      int[] solucion = {1, 3, 5, 5};
      do_check(arr,solucion);
    }

    {
      int[] arr = {5, 1, 5, 4};
      int[] solucion = {1, 4, 5, 5};
      do_check(arr,solucion);
    }

    {
      int[] arr = {5, 1, 5, 5};
      int[] solucion = {1, 5, 5, 5};
      do_check(arr,solucion);
    }

    {
      int[] arr = {5, 2, 1, 1};
      int[] solucion = {1, 1, 2, 5};
      do_check(arr,solucion);
    }

    {
      int[] arr = {5, 2, 1, 2};
      int[] solucion = {1, 2, 2, 5};
      do_check(arr,solucion);
    }

    {
      int[] arr = {5, 2, 1, 3};
      int[] solucion = {1, 2, 3, 5};
      do_check(arr,solucion);
    }

    {
      int[] arr = {5, 2, 1, 4};
      int[] solucion = {1, 2, 4, 5};
      do_check(arr,solucion);
    }

    {
      int[] arr = {5, 2, 1, 5};
      int[] solucion = {1, 2, 5, 5};
      do_check(arr,solucion);
    }

    {
      int[] arr = {5, 2, 2, 1};
      int[] solucion = {1, 2, 2, 5};
      do_check(arr,solucion);
    }

    {
      int[] arr = {5, 2, 2, 2};
      int[] solucion = {2, 2, 2, 5};
      do_check(arr,solucion);
    }

    {
      int[] arr = {5, 2, 2, 3};
      int[] solucion = {2, 2, 3, 5};
      do_check(arr,solucion);
    }

    {
      int[] arr = {5, 2, 2, 4};
      int[] solucion = {2, 2, 4, 5};
      do_check(arr,solucion);
    }

    {
      int[] arr = {5, 2, 2, 5};
      int[] solucion = {2, 2, 5, 5};
      do_check(arr,solucion);
    }

    {
      int[] arr = {5, 2, 3, 1};
      int[] solucion = {1, 2, 3, 5};
      do_check(arr,solucion);
    }

    {
      int[] arr = {5, 2, 3, 2};
      int[] solucion = {2, 2, 3, 5};
      do_check(arr,solucion);
    }

    {
      int[] arr = {5, 2, 3, 3};
      int[] solucion = {2, 3, 3, 5};
      do_check(arr,solucion);
    }

    {
      int[] arr = {5, 2, 3, 4};
      int[] solucion = {2, 3, 4, 5};
      do_check(arr,solucion);
    }

    {
      int[] arr = {5, 2, 3, 5};
      int[] solucion = {2, 3, 5, 5};
      do_check(arr,solucion);
    }

    {
      int[] arr = {5, 2, 4, 1};
      int[] solucion = {1, 2, 4, 5};
      do_check(arr,solucion);
    }

    {
      int[] arr = {5, 2, 4, 2};
      int[] solucion = {2, 2, 4, 5};
      do_check(arr,solucion);
    }

    {
      int[] arr = {5, 2, 4, 3};
      int[] solucion = {2, 3, 4, 5};
      do_check(arr,solucion);
    }

    {
      int[] arr = {5, 2, 4, 4};
      int[] solucion = {2, 4, 4, 5};
      do_check(arr,solucion);
    }

    {
      int[] arr = {5, 2, 4, 5};
      int[] solucion = {2, 4, 5, 5};
      do_check(arr,solucion);
    }

    {
      int[] arr = {5, 2, 5, 1};
      int[] solucion = {1, 2, 5, 5};
      do_check(arr,solucion);
    }

    {
      int[] arr = {5, 2, 5, 2};
      int[] solucion = {2, 2, 5, 5};
      do_check(arr,solucion);
    }

    {
      int[] arr = {5, 2, 5, 3};
      int[] solucion = {2, 3, 5, 5};
      do_check(arr,solucion);
    }

    {
      int[] arr = {5, 2, 5, 4};
      int[] solucion = {2, 4, 5, 5};
      do_check(arr,solucion);
    }

    {
      int[] arr = {5, 2, 5, 5};
      int[] solucion = {2, 5, 5, 5};
      do_check(arr,solucion);
    }

    {
      int[] arr = {5, 3, 1, 1};
      int[] solucion = {1, 1, 3, 5};
      do_check(arr,solucion);
    }

    {
      int[] arr = {5, 3, 1, 2};
      int[] solucion = {1, 2, 3, 5};
      do_check(arr,solucion);
    }

    {
      int[] arr = {5, 3, 1, 3};
      int[] solucion = {1, 3, 3, 5};
      do_check(arr,solucion);
    }

    {
      int[] arr = {5, 3, 1, 4};
      int[] solucion = {1, 3, 4, 5};
      do_check(arr,solucion);
    }

    {
      int[] arr = {5, 3, 1, 5};
      int[] solucion = {1, 3, 5, 5};
      do_check(arr,solucion);
    }

    {
      int[] arr = {5, 3, 2, 1};
      int[] solucion = {1, 2, 3, 5};
      do_check(arr,solucion);
    }

    {
      int[] arr = {5, 3, 2, 2};
      int[] solucion = {2, 2, 3, 5};
      do_check(arr,solucion);
    }

    {
      int[] arr = {5, 3, 2, 3};
      int[] solucion = {2, 3, 3, 5};
      do_check(arr,solucion);
    }

    {
      int[] arr = {5, 3, 2, 4};
      int[] solucion = {2, 3, 4, 5};
      do_check(arr,solucion);
    }

    {
      int[] arr = {5, 3, 2, 5};
      int[] solucion = {2, 3, 5, 5};
      do_check(arr,solucion);
    }

    {
      int[] arr = {5, 3, 3, 1};
      int[] solucion = {1, 3, 3, 5};
      do_check(arr,solucion);
    }

    {
      int[] arr = {5, 3, 3, 2};
      int[] solucion = {2, 3, 3, 5};
      do_check(arr,solucion);
    }

    {
      int[] arr = {5, 3, 3, 3};
      int[] solucion = {3, 3, 3, 5};
      do_check(arr,solucion);
    }

    {
      int[] arr = {5, 3, 3, 4};
      int[] solucion = {3, 3, 4, 5};
      do_check(arr,solucion);
    }

    {
      int[] arr = {5, 3, 3, 5};
      int[] solucion = {3, 3, 5, 5};
      do_check(arr,solucion);
    }

    {
      int[] arr = {5, 3, 4, 1};
      int[] solucion = {1, 3, 4, 5};
      do_check(arr,solucion);
    }

    {
      int[] arr = {5, 3, 4, 2};
      int[] solucion = {2, 3, 4, 5};
      do_check(arr,solucion);
    }

    {
      int[] arr = {5, 3, 4, 3};
      int[] solucion = {3, 3, 4, 5};
      do_check(arr,solucion);
    }

    {
      int[] arr = {5, 3, 4, 4};
      int[] solucion = {3, 4, 4, 5};
      do_check(arr,solucion);
    }

    {
      int[] arr = {5, 3, 4, 5};
      int[] solucion = {3, 4, 5, 5};
      do_check(arr,solucion);
    }

    {
      int[] arr = {5, 3, 5, 1};
      int[] solucion = {1, 3, 5, 5};
      do_check(arr,solucion);
    }

    {
      int[] arr = {5, 3, 5, 2};
      int[] solucion = {2, 3, 5, 5};
      do_check(arr,solucion);
    }

    {
      int[] arr = {5, 3, 5, 3};
      int[] solucion = {3, 3, 5, 5};
      do_check(arr,solucion);
    }

    {
      int[] arr = {5, 3, 5, 4};
      int[] solucion = {3, 4, 5, 5};
      do_check(arr,solucion);
    }

    {
      int[] arr = {5, 3, 5, 5};
      int[] solucion = {3, 5, 5, 5};
      do_check(arr,solucion);
    }

    {
      int[] arr = {5, 4, 1, 1};
      int[] solucion = {1, 1, 4, 5};
      do_check(arr,solucion);
    }

    {
      int[] arr = {5, 4, 1, 2};
      int[] solucion = {1, 2, 4, 5};
      do_check(arr,solucion);
    }

    {
      int[] arr = {5, 4, 1, 3};
      int[] solucion = {1, 3, 4, 5};
      do_check(arr,solucion);
    }

    {
      int[] arr = {5, 4, 1, 4};
      int[] solucion = {1, 4, 4, 5};
      do_check(arr,solucion);
    }

    {
      int[] arr = {5, 4, 1, 5};
      int[] solucion = {1, 4, 5, 5};
      do_check(arr,solucion);
    }

    {
      int[] arr = {5, 4, 2, 1};
      int[] solucion = {1, 2, 4, 5};
      do_check(arr,solucion);
    }

    {
      int[] arr = {5, 4, 2, 2};
      int[] solucion = {2, 2, 4, 5};
      do_check(arr,solucion);
    }

    {
      int[] arr = {5, 4, 2, 3};
      int[] solucion = {2, 3, 4, 5};
      do_check(arr,solucion);
    }

    {
      int[] arr = {5, 4, 2, 4};
      int[] solucion = {2, 4, 4, 5};
      do_check(arr,solucion);
    }

    {
      int[] arr = {5, 4, 2, 5};
      int[] solucion = {2, 4, 5, 5};
      do_check(arr,solucion);
    }

    {
      int[] arr = {5, 4, 3, 1};
      int[] solucion = {1, 3, 4, 5};
      do_check(arr,solucion);
    }

    {
      int[] arr = {5, 4, 3, 2};
      int[] solucion = {2, 3, 4, 5};
      do_check(arr,solucion);
    }

    {
      int[] arr = {5, 4, 3, 3};
      int[] solucion = {3, 3, 4, 5};
      do_check(arr,solucion);
    }

    {
      int[] arr = {5, 4, 3, 4};
      int[] solucion = {3, 4, 4, 5};
      do_check(arr,solucion);
    }

    {
      int[] arr = {5, 4, 3, 5};
      int[] solucion = {3, 4, 5, 5};
      do_check(arr,solucion);
    }

    {
      int[] arr = {5, 4, 4, 1};
      int[] solucion = {1, 4, 4, 5};
      do_check(arr,solucion);
    }

    {
      int[] arr = {5, 4, 4, 2};
      int[] solucion = {2, 4, 4, 5};
      do_check(arr,solucion);
    }

    {
      int[] arr = {5, 4, 4, 3};
      int[] solucion = {3, 4, 4, 5};
      do_check(arr,solucion);
    }

    {
      int[] arr = {5, 4, 4, 4};
      int[] solucion = {4, 4, 4, 5};
      do_check(arr,solucion);
    }

    {
      int[] arr = {5, 4, 4, 5};
      int[] solucion = {4, 4, 5, 5};
      do_check(arr,solucion);
    }

    {
      int[] arr = {5, 4, 5, 1};
      int[] solucion = {1, 4, 5, 5};
      do_check(arr,solucion);
    }

    {
      int[] arr = {5, 4, 5, 2};
      int[] solucion = {2, 4, 5, 5};
      do_check(arr,solucion);
    }

    {
      int[] arr = {5, 4, 5, 3};
      int[] solucion = {3, 4, 5, 5};
      do_check(arr,solucion);
    }

    {
      int[] arr = {5, 4, 5, 4};
      int[] solucion = {4, 4, 5, 5};
      do_check(arr,solucion);
    }

    {
      int[] arr = {5, 4, 5, 5};
      int[] solucion = {4, 5, 5, 5};
      do_check(arr,solucion);
    }

    {
      int[] arr = {5, 5, 1, 1};
      int[] solucion = {1, 1, 5, 5};
      do_check(arr,solucion);
    }

    {
      int[] arr = {5, 5, 1, 2};
      int[] solucion = {1, 2, 5, 5};
      do_check(arr,solucion);
    }

    {
      int[] arr = {5, 5, 1, 3};
      int[] solucion = {1, 3, 5, 5};
      do_check(arr,solucion);
    }

    {
      int[] arr = {5, 5, 1, 4};
      int[] solucion = {1, 4, 5, 5};
      do_check(arr,solucion);
    }

    {
      int[] arr = {5, 5, 1, 5};
      int[] solucion = {1, 5, 5, 5};
      do_check(arr,solucion);
    }

    {
      int[] arr = {5, 5, 2, 1};
      int[] solucion = {1, 2, 5, 5};
      do_check(arr,solucion);
    }

    {
      int[] arr = {5, 5, 2, 2};
      int[] solucion = {2, 2, 5, 5};
      do_check(arr,solucion);
    }

    {
      int[] arr = {5, 5, 2, 3};
      int[] solucion = {2, 3, 5, 5};
      do_check(arr,solucion);
    }

    {
      int[] arr = {5, 5, 2, 4};
      int[] solucion = {2, 4, 5, 5};
      do_check(arr,solucion);
    }

    {
      int[] arr = {5, 5, 2, 5};
      int[] solucion = {2, 5, 5, 5};
      do_check(arr,solucion);
    }

    {
      int[] arr = {5, 5, 3, 1};
      int[] solucion = {1, 3, 5, 5};
      do_check(arr,solucion);
    }

    {
      int[] arr = {5, 5, 3, 2};
      int[] solucion = {2, 3, 5, 5};
      do_check(arr,solucion);
    }

    {
      int[] arr = {5, 5, 3, 3};
      int[] solucion = {3, 3, 5, 5};
      do_check(arr,solucion);
    }

    {
      int[] arr = {5, 5, 3, 4};
      int[] solucion = {3, 4, 5, 5};
      do_check(arr,solucion);
    }

    {
      int[] arr = {5, 5, 3, 5};
      int[] solucion = {3, 5, 5, 5};
      do_check(arr,solucion);
    }

    {
      int[] arr = {5, 5, 4, 1};
      int[] solucion = {1, 4, 5, 5};
      do_check(arr,solucion);
    }

    {
      int[] arr = {5, 5, 4, 2};
      int[] solucion = {2, 4, 5, 5};
      do_check(arr,solucion);
    }

    {
      int[] arr = {5, 5, 4, 3};
      int[] solucion = {3, 4, 5, 5};
      do_check(arr,solucion);
    }

    {
      int[] arr = {5, 5, 4, 4};
      int[] solucion = {4, 4, 5, 5};
      do_check(arr,solucion);
    }

    {
      int[] arr = {5, 5, 4, 5};
      int[] solucion = {4, 5, 5, 5};
      do_check(arr,solucion);
    }

    {
      int[] arr = {5, 5, 5, 1};
      int[] solucion = {1, 5, 5, 5};
      do_check(arr,solucion);
    }

    {
      int[] arr = {5, 5, 5, 2};
      int[] solucion = {2, 5, 5, 5};
      do_check(arr,solucion);
    }

    {
      int[] arr = {5, 5, 5, 3};
      int[] solucion = {3, 5, 5, 5};
      do_check(arr,solucion);
    }

    {
      int[] arr = {5, 5, 5, 4};
      int[] solucion = {4, 5, 5, 5};
      do_check(arr,solucion);
    }

    {
      int[] arr = {5, 5, 5, 5};
      int[] solucion = {5, 5, 5, 5};
      do_check(arr,solucion);
    }
    {
      int[] arr = {20,13,5,10,14,15,6,19,3,18,11,9,17,1,4,2,16,7,8,12};
      int[] solucion = {1, 2,3,4,5,6,7,8,9,10,11,12,13,14,15,16,17,18,19,20};
      do_check(arr,solucion);
    }

    System.out.println("Test Superado");
  }
}
