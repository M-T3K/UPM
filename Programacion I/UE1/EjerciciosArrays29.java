/*
  Código escrito por Rubén Aguado Cosano
  Grupo 2M-B
  Fecha: 30-11-2017
*/

import java.util.Arrays;

class EjerciciosArrays29{

  /* PRE GLOBAL:
  El array que se pasa como argumento debe cumplir que:
  Los numeros crecen de uno en uno.
  Si en el orden falta un número, su hueco estará vacío, pero presente. */

  /* POS GLOBAL:
  Para todas las siguientes funciones que devuelvan una posición,
  se considera la primera posición como posición '0' */

  public static int buscaOrden(int[] arr, int elem){
    if(arr.length == 0 || elem <= 0){
      return -1;
    }
    boolean found = false;
    int pos = 0;
    for(int i = 0; i < arr.length && !found; i++){
      if(arr[i] == elem){
        pos = i;
        found = true;
      }
    }
    return found?pos:-1;
  }//ENDOF: buscaOrden()

  public static int buscaHueco(int[] arr, int elem){
    if(arr.length == 0 || elem <= 0){
      return -1;
    }
    boolean found = false;
    int pos = 0;
    for(int i = 0; i < arr.length && !found; i++){
      if(arr[i] == elem){
        pos = i;
        found = true;
      }
      if(arr[i] == 0 && arr[i - 1] == elem - 1){
        pos = i;
        found = true;
      }
    }
    return found?pos:-1;
  }//ENDOF: buscaHueco()

  public static void borrar(int[] arr, int elem){
    int pos = buscaOrden(arr, elem);
    if(pos == -1){
      return;
    }
    for(; pos < arr.length - 1; pos++){
      arr[pos] = arr[pos + 1];
    }
    arr[arr.length - 1] = 0;
  }//ENDOF: borrar()

  public static void insertar(int[] arr, int elem){
    int pos = buscaHueco(arr, elem);
    if(pos == -1){
      return;
    }
    arr[pos] = elem;
  }//ENDOF: insertar()

  public static boolean busquedaBinaria(int[] arr, int elem){
    return buscaOrden(arr, elem) != -1?true:false;
  }//ENDOF: busquedaBinaria()

  public static void main(String[] args){
    System.out.println("buscaOrden([1,2,3,4,5,0,0,0], 3) --> " + buscaOrden(new int[]{1,2,3,4,5,0,0,0}, 3));
    System.out.println("buscaOrden([1,2,3,4,5], 5) --> " + buscaOrden(new int[]{1,2,3,4,5}, 5));
    System.out.println("buscaOrden([1,2,3,4,5], 6) --> " + buscaOrden(new int[]{1,2,3,4,5}, 6));
    System.out.println("buscaOrden([], -2) --> " + buscaOrden(new int[]{}, -2));

    System.out.println("buscaHueco([1,2,0,4,5,0,0,0], 3) --> " + buscaHueco(new int[]{1,2,0,4,5,0,0,0}, 3));
    System.out.println("buscaHueco([1,2,3,4,5], 6) --> " + buscaHueco(new int[]{1,2,3,4,5}, 6));
    System.out.println("buscaHueco([1,2,3,4,5,0,0,0], 6) --> " + buscaHueco(new int[]{1,2,3,4,5,0,0,0}, 6));
    System.out.println("buscaHueco([], -2) --> " + buscaHueco(new int[]{}, -2));

    int[] pruebas1 = {1,2,3,4,5,0,0,0};
    System.out.print("borrar(" + Arrays.toString(pruebas1) + ", 3) --> ");
    borrar(pruebas1, 3);
    System.out.println(Arrays.toString(pruebas1));

    int[] pruebas2 = {1,2,3,4,5};
    System.out.print("borrar(" + Arrays.toString(pruebas2) + ", 6) --> ");
    borrar(pruebas2, 6);
    System.out.println(Arrays.toString(pruebas2));

    System.out.print("borrar(" + Arrays.toString(pruebas2) + ", 5) --> ");
    borrar(pruebas2, 5);
    System.out.println(Arrays.toString(pruebas2));

    int[] pruebas3 = {1,2,0,4,5,0,0,0};
    System.out.print("insertar(" + Arrays.toString(pruebas3) + ", 3) --> ");
    insertar(pruebas3, 3);
    System.out.println(Arrays.toString(pruebas3));

    System.out.print("insertar(" + Arrays.toString(pruebas3) + ", 6) --> ");
    insertar(pruebas3, 6);
    System.out.println(Arrays.toString(pruebas3));

    int[] pruebas4 = {1,2,3,4,5};
    System.out.print("insertar(" + Arrays.toString(pruebas4) + ", 6) --> ");
    insertar(pruebas4, 6);
    System.out.println(Arrays.toString(pruebas4));

    System.out.println("busquedaBinaria([1,2,3,4,5,0,0,0], 3) --> " + busquedaBinaria(new int[]{1,2,3,4,5,0,0,0}, 3));
    System.out.println("busquedaBinaria([1,2,3,4,5], 5) --> " + busquedaBinaria(new int[]{1,2,3,4,5}, 5));
    System.out.println("busquedaBinaria([1,2,3,4,5], 6) --> " + busquedaBinaria(new int[]{1,2,3,4,5}, 6));
    System.out.println("busquedaBinaria([], -2) --> " + busquedaBinaria(new int[]{}, -2));
  }//ENDOF: main()

}//ENDOF: class EjerciciosArrays29
