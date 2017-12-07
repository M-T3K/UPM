/*
 * Clara Benac Earle
 * 10/11/2017
 * 
 * Ejercicios para entregar
 * Fecha: 1/12/2017
 * Autor/a: Kevin Alberto Lopez Porcheron
 * 
 * http://lml.ls.fi.upm.es/~entrega/
 */ 

class Entreg2MA_2{
  
  
  /* FUNCION alCubo(Colección de enteros col) -> Colección de enteros
   * PRE: cierto
   * POST: el resultado es una nueva colección de enteros
   * donde cada elemento es un elemento de col al cubo
   * EJEMPLOS:
   *   alCubo([4]) -> [16]
   *   alCubo([1,2,3]) -> [1,4,9]
   */ 
	public static int[] alCubo(int[] arr)	{
		
		// Creo este porque no me gusta modificar el argumento
		int[] col = new int[arr.length]; 
		
		for(int i = 0; i < arr.length; ++i)	{
			
			col[i] = arr[i] * arr[i] * arr[i];
			
		}
		
		return col;
		
	}
 
  
  /* FUNCION posElem(Colección de enteros col, Entero n) -> Entero
   * PRE: cierto
   * POST: el resultado es la posición (indice) en la que está n
   * Si n no está en col el resultado es -1
   * EJEMPLO: 
   *   posElem([3,5,-1],3) -> 0
   *   posElem([3,5,-1],-1) -> 2
   *   posElem([3,5,-1],4) -> -1
   */
	public static int posElem(int[] arr, int n)	{
		
		boolean found = false;
		int pos = -1;
		for(int i = 0; i < arr.length && !found; ++i)	{
			
			if(n == arr[i])	{
				
				found = true;
				pos = i;
				
			}
			
		}
		
		return pos;
		
	}
	

                                
  /*
   * FUNCIÓN: mostrarColeccion(Coleccion de enteros col) -> 
   *                    cadena de caracteres
   * PRE: col.length > 0
   * POST: el resultado es una cadena de caracteres (String) 
   * que contiene todos los elementos contenidos en la 
   * colección col separados por comas y entre corchetes
   * EJEMPLOS:
   *   mostrarColeccion([1,2,4]) -> [1,2,4]
   *   mostrarColeccion([8]) -> [8]
   *   mostrarColeccion([1,6,3,0,0]) -> [1,6,3,0,0]
   */
  
  
  static String mostrarColeccion(int[] col){
    String resultado = "[";
    for(int i = 0; i < col.length - 1; i++){
      resultado = resultado + col[i] + ",";
    }
    return resultado + col[col.length - 1] + "]";
  }
  

  
  public static void main(String[] args){
    
	  System.out.println("Pruebas");
	  // Pruebas
	  int[] arr = {1, 2, 3, 4};
	  
	  System.out.println(mostrarColeccion(alCubo(arr)));
	  System.out.println(posElem(arr, 3));
	  System.out.println(posElem(arr, 0));
	  
  }
  
} 
