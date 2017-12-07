/*
  Código escrito por Rubén Aguado Cosano
  Grupo 2M-B
  Fecha: 21-10-2017
*/

//Using "stdlib.jar"

class BuclesWhileDoWhile {

  public static int sumaDeMenoresQueSeis(){
    int sumatorio = 0;
    int entrada = 0;
    do{
      sumatorio += entrada;
      System.out.println("Introduzca un número: ");
      entrada = StdIn.readInt();
    }while(entrada <= 6);
    return sumatorio;
  }//ENDOF: sumaDeMenoresQueSeis()

  public static int sumaHasta0(int number){
    int sumatorio = 0;
    int cifra = 0;
    do{
      sumatorio += cifra;
      cifra = number % 10;
      number = number / 10;
    }while(cifra != 0);
    return sumatorio;
  }//ENDOF: sumaHasta0()

  public static boolean estaDigito(int digit, int number){
    boolean is = false;
    int cifra = 0;
    do{
      cifra = number % 10;
      number = number / 10;
      is = (digit == cifra)?true:false;
    }while(!is && number != 0);
    return is;
  }//ENDOF: estaDigito()

  public static int sumatorioSumaPorDigito(int number){
    int sumatorio = 0;
    int cifra = 0;
    int posicion = 0;
    do{
      posicion++;
      cifra = number % 10;
      number = number / 10;
      sumatorio += posicion * cifra;
    }while(number != 0);
    return sumatorio;
  }//ENDOF: sumatorioSumaPorDigito()

  public static void main(String[] args) {
    System.out.println("sumaDeMenoresQueSeis() --> " + sumaDeMenoresQueSeis());
    System.out.println("sumaHasta0(1230456) --> " + sumaHasta0(1230456));
    System.out.println("estaDigito(9, 239423) --> " + estaDigito(9, 239423));
    System.out.println("sumatorioSumaPorDigito(239423) --> " + sumatorioSumaPorDigito(239423));
  }

}//ENDOF: class Primo
