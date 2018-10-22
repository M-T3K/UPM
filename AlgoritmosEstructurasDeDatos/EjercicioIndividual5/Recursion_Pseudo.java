package aed.individual5;

import es.upm.aedlib.Position;
import es.upm.aedlib.positionlist.PositionList;
import es.upm.aedlib.indexedlist.IndexedList;


class Recursion {
  
  
  ;; Metodos Auxiliares de uso general
  
  ;;
   ;; @param n : <double> Número.
   ;; @return El valor absoluto |n| de 'n'
   ;;
    abs :: (n) -> double => {
    
        if (n < 0) 
            retn -n;
        else 
            retn n;
    
    }
  ;;--------------------------------------------------
  
  ;;
   ;; @param n : <int> número a comprobar.
   ;; @return 'true' si n es par. 'false' si es impar.
   ;;
    isEven :: (n) -> boolean => {
    
        if (n % 2 == 0) 
            retn TRUE
        else 
            retn FALSE
        
  }
  ;;--------------------------------------------------

  ;;
   ;; @param val: <Integer> valor el cual queremos convertir. 
   ;; @return Una conversión de 'Integer' a 'int' en la que null = 0.
   ;;
    convertNull :: (val) -> int => {
  
        if(val == null) 
            retn 0;
        else
            retn val;
    
    }
    ;;--------------------------------------------------

  ;; Metodos auxiliares de Recursión

  ;;
   ;; @param x : <double> Número original del que intentamos computar la raiz cuadrada 
   ;; @param est : <double> Última Estimación del valor de la raíz cuadrada.
   ;; @return Una nueva estimación recursivamente hasta que se obtiene una apropiada.
   ;;
    babylon :: (x, est) -> double =>  {
    
        nuevoEst = (est + x / est) / 2;
        ;; If guess is < 0.25  
        if(abs(nuevoEst - est) < 0.25) => {

            retn nuevoEst;
        }

        retn babylon(x, nuevoEst);
    }
  ;;--------------------------------------------------

  ;;
   ;; @param l : Lista del tipo IndexedList<Integer>
   ;; @param idx : Indice por el cual vamos.
   ;; @return '0' si idx > l.size o una llamada recursiva para generar la suma.
   ;;
    sumEvenRec :: (l, idx) -> int => {

        if (idx>=l.size()) => {

        retn 0;
        }
        n = convertNull(l.get(idx));
        if(isEven(n)) => {

            retn n + sumEvenRec(l, idx + 1);
        }
        else => {

        retn  sumEvenRec(l, idx + 1);
        }

  }

  ;; Metodos del ejercicio

  ;;
   ;; @param n : <double> Número del cual deseamos computar la raiz cuadrada.
   ;; @return <double> Una aproximación de la raíz cuadrada de n usando el metodo Babilonio.
   ;;
    babylonRoot :: (double n) => {
    
        guess = n / 2; ;; Initial guess
        retn babylon(n, guess);
  }
  ;;--------------------------------------------------

  ;;
   ;; @param l : Lista del tipo IndexedList<Integer>
   ;; @return <int> con la suma de todos los valores pares de <l>.
   ;; Este metodo toma el valor <null> como un 0.
   ;; 
   ;; Ejemplos del funcionamiento:
   ;; 
   ;; Recursion.sumEven([]);             => 0
   ;; Recursion.sumEven([null]);         => 0
   ;; Recursion.sumEven([1]);            => 0
   ;; Recursion.sumEven([2]);            => 2
   ;; Recursion.sumEven([2,1,8,4,3,2]);  => 16
   ;;
    sumEven :: (l) -> int => {
    
        retn sumEvenRec(l, 0);
    }
  ;;--------------------------------------------------

  ;;
   ;; @param l : Lista del tipo PositionList<Integer>
   ;; @return <true> si todos los elementos de <l> son pares. <false> si no lo son.
   ;; Este metodo toma el valor <null> como un 0.
   ;; 
   ;; Ejemplos del funcionamiento:
   ;; 
   ;; Recursion.allEven([])              => true
   ;; Recursion.allEven([null]);         => true
   ;; Recursion.allEven([1]);            => false
   ;; Recursion.allEven([2]);            => true
   ;; Recursion.allEven([2,1,8,4,3,2]);  => false
   ;;
    allEven :: (l) -> boolean => {
	  
    if(l.isEmpty()) => {

      retn TRUE;
    }

    pos = l.first();
    if(pos == null) => {

      l.remove(pos);
      retn allEven(l);
    }

    if(isEven(convertNull(pos.element()))) => {
      
        l.remove(pos);
        retn allEven(l);
    }
    retn FALSE;
	  
	  
  }
  ;;--------------------------------------------------

}
