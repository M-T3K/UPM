/*
  Código escrito por Rubén Aguado Cosano
  Grupo 2M-B
  Fecha: 19-10-2017
*/
class Primo {

  public static boolean esPrimo(int n){
    boolean is = true;
    for(int i = n - 1; i>1; i--){
      if(n%i == 0){
        is = false;
      }
    }
    return is;
  }//ENDOF: esPrimo()

  public static void main(String[] args) {
    System.out.println("esPrimo(3) --> " + esPrimo(3));
    System.out.println("esPrimo(35) --> " + esPrimo(35));
    System.out.println("esPrimo(71) --> " + esPrimo(71));
    System.out.println("esPrimo(997) --> " + esPrimo(997));
  }

}//ENDOF: class Primo
