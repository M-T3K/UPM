/*
  Código escrito por Rubén Aguado Cosano
  Modificado por @PrinceKiwii
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
    
  }
  //------------------------------------------------
  
  /*
   * Este Metodo Comprueba si un numero es primo de manera muchos mas eficiente
   * Para ello, usa los siguientes avances matematicos:
   * - Teorema de Fermat
   * - Todos los numeros primos mayores que 3 pueden ser expresados en la forma 6n +- 1
   * Esta es la version que yo, @PrinceKiwii uso generalmente, porque es rapida y eficiente
   * Ademas, puede ser extendida a numeros negativos muy facilmente
   * De todas maneras, siempre puede mejorarse con el Pequeno Teorema de Fermat (Que no es este) y otras tecnicas
   * 
   */
  public static boolean esPrimoEficiente(int n)	{
	  
	  // No puede ser el 0 o el 1 (No son numeros primos)
	  if(n == 0 || n == 1)	{
		  
		  return false;
		  
	  }
	  // Si es el 2 o el 3, SI son primos
	  else if(n == 2 || n == 3)	{
		  
		  return true;
		  
	  }
	  // si n / 2 || n / 3 => !Primo
	  else if(n % 2 == 0 || n % 3 == 0)	{
		  
		  return false;
		  
	  }
	  // este else if se podria haber puesto en el primero 
	  // pero prefiero dejarlo asi, mas ordenado
	  
	  // Como ya dije antes: ∀ n > 3 ∈ P, n puede ser expresado como:
	  // 6k ± 1
	  // ∴ inicializamos las siguientes variables:
	  
	  int w = 2;
	  int sqrt_n = (int)Math.sqrt(n); // Para no tener que calcular i * i cada iteracion del bucle
	  // Implementacion:
	  for(int i = 5; i <= sqrt_n; i += w)	{
		  
		  if(n % i == 0){
			  
			  return false;
			  
		  }
		  
		  w = 6 - w;
		  
	  }
	  
	  return true;
	  
	  
  }
  //------------------------------------------------
  
  public static void main(String[] args) {
	  
    System.out.println("esPrimo(997) --> " + esPrimo(997));
    System.out.println("EsPrimo(12341) --> " + esPrimo(12341));
       
    
    System.out.println("esPrimoEficiente(997) --> " + esPrimoEficiente(997));
    System.out.println("EsPrimoEficiente(12341) --> " + esPrimoEficiente(12341));
  
  }
  //------------------------------------------------
  
}
