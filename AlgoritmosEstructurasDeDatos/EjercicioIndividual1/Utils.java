package aed.loops;

public class Utils {
  
  /**
   * 
   * @param a : Array de 'Integer'
   * @param elem : Elemento del tipo 'Integer' 
   * @return La cantidad maxima de veces en las que 'elem' aparece en 'a' consecutivamente
   */
  public static int maxNumRepeated(Integer[] a, Integer elem)  {

    int currRep = 0; // Contador 
    int maxReps = 0; // Previo contador con maxima repeticion
    
    for(Integer n : a) {

      currRep = (n.equals(elem)) ? ++currRep : 0;

      /* if(n.equals(elem)) {

        ++currRep;

      } 
      else {

        currRep = 0; // Reiniciamos el contador

      } */

      if (currRep>=maxReps)  {

        maxReps = currRep;

      }
      
    }

    return maxReps;

  }
  //----------------------------------------------------
  
}
