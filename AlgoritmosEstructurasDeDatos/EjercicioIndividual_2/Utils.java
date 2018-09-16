package aed.indexedlist;
import java.awt.List;

import es.upm.aedlib.indexedlist.*;

public class Utils {
	
  public static <E> IndexedList<E> deleteRepeated(IndexedList<E> l) {
      
    IndexedList<E> list = new ArrayIndexedList<E>();

    for(E elem : l) {

      boolean found = false;
      for(int i = 0; i < list.size() && !found; ++i) {

        if(elem.equals(list.get(i))) {

          found = true;

        }

      }

      if(!found) {

        list.add(list.size(), elem);

      }

      found = false;

    }

    return list;

  }

}
