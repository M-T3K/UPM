package aed.loops;

public class Utils {
	
  public static int maxNumRepeated(Integer[] a, Integer elem)  {

    int currRep = 0; // Contador 
    int maxReps = 0; // Previo contador con maxima repeticion
    
    for(Integer n : a) {

      if(n.equals(elem)) {

        ++currRep;

      } 
      else {

        maxReps = (maxReps>=currRep) ? maxReps : currRep;
        currRep = 0; // Reiniciamos el contador

      }
      
    }

    return (currRep>=maxReps) ? currRep : maxReps;

  }
  //----------------------------------------------------
  
}