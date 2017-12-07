/*
  Código escrito por Rubén Aguado Cosano
  Grupo 2M-B
  Fecha: 11-11-2017
*/

class Arrays{

  public static void mostrarArray(int[] arr){
    for (int i = 0; i < arr.length; i++) {
      System.out.println("[" + i + "] --> " + arr[i]);
    }
  }//ENDOF: mostrarArray()

  public static boolean compararArrays(int[] arr, int[] arr2){
    if(arr.length != arr2.length){
      return false;
    }
    for (int i = 0; i < arr.length; i++) {
      if(arr[i] != arr2[i]){
        return false;
      }
    }
    return true;
  }//ENDOF: compararArrays()

  //PRE: arr.length = arr2.length
  public static int[] sumarArrays(int[] arr, int[] arr2){
    for (int i = 0; i < arr.length; i++) {
      arr[i] += arr2[i];
    }
    return arr;
  }//ENDOF: sumarArrays()

  public static int[] generarArray(int n){
    int[] myArr = new int[n];
    for (int i = 0; i < myArr.length; i++) {
      myArr[i] = i + 1;
    }
    return myArr;
  }//ENDOF: generarArray()

  public static void main(String[] args){
    int[] oneByOne = {1,2,3,4,5,6,7,8,9};
    int[] twoByTwo = {2,4,6,8,10,12,14,16,18};
    System.out.println("int[] oneByOne = {1,2,3,4,5,6,7,8,9};");
    System.out.println("int[] twoByTwo = {2,4,6,8,10,12,14,16,18};");
    System.out.println("mostrarArray(oneByOne):");
    mostrarArray(oneByOne);
    System.out.println("compararArrays(oneByOne, oneByOne) --> " + compararArrays(oneByOne, oneByOne));
    System.out.println("compararArrays(oneByOne, twoByTwo) --> " + compararArrays(oneByOne, twoByTwo));
    System.out.println("sumarArrays(oneByOne, twoByTwo):");
    mostrarArray(sumarArrays(oneByOne, twoByTwo));
    System.out.println("generarArray(6):");
    mostrarArray(generarArray(6));
  }//ENDOF: main()

}//ENDOF: class Arrays

//Generar array de los n primeros primos
