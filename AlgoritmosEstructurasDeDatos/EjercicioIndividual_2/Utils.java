package aed.indexedlist;
import java.awt.List;

import es.upm.aedlib.indexedlist.*;

public class Utils {
  
  /**
   * 
   * @param l : Lista del tipo 'IndexedList'
   * @return Una Lista del tipo 'IndexedList' sin elementos repetidos
   */
  public static <E> IndexedList<E> deleteRepeated(IndexedList<E> l) {
      
    IndexedList<E> list = new ArrayIndexedList<E>();

    for(E elem : l) {

      if(!find(elem, list)) {

        list.add(list.size(), elem);

      }

    }

    return list;

  }

  /**
   * 
   * @param elem : Elemento de tipo 'elem' (generic) que estamos buscando.
   * @param list : Lista del tipo "IndexedList" en la que estamos buscando.
   * @return boolean 'true' si elem existe en la lista, 'false' si no
   */
  private static <E> boolean find(E elem, IndexedList<E> list) {
    
    boolean found = false;
    for(int i = 0; i < list.size() && !found; ++i) {

      if(elem.equals(list.get(i))) {

        found = true;

      }

    }

    return found;

  }

}
