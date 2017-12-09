/*
  Código escrito por Rubén Aguado Cosano
  Grupo 2M-B
  Fecha: 23-11-2017
*/

import java.util.Arrays;

class EjerciciosArrays23{

  //Función con for y variable booleana auxiliar
  public static boolean apareceCaracterFor(String phrase, char ltr){
    boolean is = false;
    for (int i = 0; i < phrase.length(); i++) {
      if(phrase.charAt(i) == ltr){
        is = true;
      }
    }
    return is;
  }//ENDOF: apareceCaracterFor()

  //Función con while y sin variable booleana auxiliar
  public static boolean apareceCaracterWhile(String phrase, char ltr){
    int i = 0;
    while (i < phrase.length()) {
      if(phrase.charAt(i) == ltr){
        return true;
      }
      i++;
    }
    return false;
  }//ENDOF: apareceCaracterWhile()

  //Función recursiva
  public static boolean apareceCaracterRecursiva(String phrase, char ltr){
    if(phrase.isEmpty()){
      return false;
    }else if(phrase.charAt(0) == ltr){
      return true;
    }else{
      return apareceCaracterRecursiva(phrase.substring(1), ltr);
    }
  }//ENDOF: apareceCaracterRecursiva()

  public static boolean compareChars(char a, char b){
    return a == b;
  }//ENDOF: compareChars()

  //Función recursiva con función auxiliar
  public static boolean apareceCaracterRecursivaConAuxiliar(String phrase, char ltr){
    if(phrase.isEmpty()){
      return false;
    }else if(compareChars(phrase.charAt(0), ltr)){
      return true;
    }else{
      return apareceCaracterRecursiva(phrase.substring(1), ltr);
    }
  }//ENDOF: apareceCaracterRecursivaConAuxiliar()

  public static int[] intercambiaValorEnPosiciones(int[] arr, int pos1, int pos2){
    if(pos1 < 0 || pos2 < 0 || pos1 >= arr.length || pos2 >= arr.length){
      System.out.println("El índice introducido se encuentra fuera del array. (IndexOutOfBound)");
      return arr;
    }

    int[] response = new int[arr.length];
    //System.arraycopy(arr, 0, response, 0, arr.length);
    for(int i = 0; i < arr.length; i++){
      response[i] = arr[i];
    }
    response[pos1] = arr[pos2];
    response[pos2] = arr[pos1];
    return response;
  }//ENDOF: intercambiaValorEnPosiciones()

  public static int minValueInArray(int[] arr){
    if(arr.length == 0){
      System.out.println("Me has pasado un array vacio.");
      return 0;
    }
    int minValue = arr[0];
    for(int i = 1; i < arr.length; i++){
      if(arr[i] < minValue){
        minValue = arr[i];
      }
    }
    return minValue;
  }//ENDOF: minValueInArray()

  public static int[] copia(int[] arr1, int[] arr2){
    arr2=arr1;
    return arr2;
  }//ENDOF: copia()

  static int[] copiaBuena(int[] arr1){
    int[] arr2 = new int[arr1.length];
    for(int i = 0; i < arr1.length; i++){
      arr2[i] = arr1[i];
    }
    return arr2;
  }//ENDOF: minValueInArray()

  public static int lastOccuipedValue(int[] arr){
    if(arr.length == 0 || arr[0] == 0){
      System.out.println("Este arr está vacío ;-;");
      return 0;
    }
    int last = 0;
    for (int i = 0; i < arr.length; i++) {
      if(arr[i] != 0){
        last = arr[i];
      }
    }
    return last;
  }//ENDOF: lastOccuipedValue()

  public static void deleteAndMove(int[] arr, int value){
    boolean found = false;
    boolean workEnd = false;
    if(arr[0] == 0){
      System.out.println("Array vacío ;-;");
      return;
    }
    for(int i = 0; i < arr.length && !workEnd; i++){
      if(!found && arr[i] == value){
        arr[i] = lastOccuipedValue(arr);
        found = true;
      }
      if(found && arr[i] == 0){
        arr[i - 1] = 0;
        workEnd = true;
      }
      if(found && i + 1 == arr.length){
        arr[i] = 0;
        workEnd = true;
      }
    }
    if(!found){
      System.out.println("Ese número no estaba.");
    }
  }//ENDOF: deleteAndMove()

  public static void addToArr(int[] arr, int n){
    if(arr[arr.length - 1] != 0){
      System.out.println("Este array está hasta arriba.");
      return;
    }
    boolean done = false;
    for (int i = 0; i < arr.length && !done; i++) {
      if(arr[i] == 0){
        arr[i] = n;
        done = true;
      }
    }
  }//ENDOF: addToArr()

  public static void main(String[] args){
    System.out.println("apareceCaracterFor(\"Holiwi :3\", 'i') --> " + apareceCaracterFor("Holiwi :3", 'i'));
    System.out.println("apareceCaracterWhile(\"Holiwi :3\", 'i') --> " + apareceCaracterWhile("Holiwi :3", 'i'));
    System.out.println("apareceCaracterRecursiva(\"Holiwi :3\", 'i') --> " + apareceCaracterRecursiva("Holiwi :3", 'i'));
    System.out.println("apareceCaracterRecursivaConAuxiliar(\"Holiwi :3\", 'i') --> " + apareceCaracterRecursivaConAuxiliar("Holiwi :3", 'i'));
    int[] myArr4Pruebas = {1,2,3,4,-5,6,7,8,9};
    System.out.println("intercambiaValorEnPosiciones(" + Arrays.toString(myArr4Pruebas) + ", 4, 8) --> " + Arrays.toString(intercambiaValorEnPosiciones(myArr4Pruebas, 4, 8)));
    System.out.println("intercambiaValorEnPosiciones(" + Arrays.toString(myArr4Pruebas) + ", 4, 9) --> " + Arrays.toString(intercambiaValorEnPosiciones(myArr4Pruebas, 4, 9)));
    System.out.println("minValueInArray(" + Arrays.toString(myArr4Pruebas) + ") --> " + minValueInArray(myArr4Pruebas));
    System.out.println("Lo que ocurre en el ejercicio 4: copia asigna a arr2 el puntero de arr1, copia1 crea un array 'arr2' y le asigna el puntero de arr1, y lo devuelve, de manera ce crea una referencia duplicada a los valores de arr1.");
    System.out.println("copia() es inutil. Es más senciallo hacer directamente int[] arr2 = arr1;");
    int[] copiaArr = copiaBuena(myArr4Pruebas);
    System.out.println("copiaBuena(" + Arrays.toString(myArr4Pruebas) + ") --> " + Arrays.toString(copiaArr));
    System.out.println("Cambio un valor del nuevo array:");
    copiaArr[2] = 0;
    System.out.println("myArr4Pruebas = " + Arrays.toString(myArr4Pruebas) + "; copiaDelArrayEditado = " + Arrays.toString(copiaArr));
    int[] myArr4Pruebas2 = {1,3,2,3,5,0,0,0,0};
    System.out.println("lastOccuipedValue(" + Arrays.toString(myArr4Pruebas2) + ") --> " + lastOccuipedValue(myArr4Pruebas2));
    System.out.print("deleteAndMove(" + Arrays.toString(myArr4Pruebas2) + ", 3) --> ");
    deleteAndMove(myArr4Pruebas2, 3);
    System.out.println(Arrays.toString(myArr4Pruebas2));
    System.out.print("addToArr(" + Arrays.toString(myArr4Pruebas2) + ", 9) --> ");
    addToArr(myArr4Pruebas2, 9);
    System.out.println(Arrays.toString(myArr4Pruebas2));
  }//ENDOF: main()

}//ENDOF: class EjerciciosArrays23
