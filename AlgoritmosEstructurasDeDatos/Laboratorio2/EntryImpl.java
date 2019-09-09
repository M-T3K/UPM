package aed.orderedmap;

public class EntryImpl<K,V> implements Entry<K,V> {
  protected K k; // key
  protected V v; // value

  public EntryImpl(K key, V value) {
    k = key;
    v = value;
  }

  public K getKey() { return k; }
  public V getValue() { return v; }
  public String toString() { return "(" + k  + "," + v + ")"; }

  public boolean equals(Object obj) {
    if (this == obj) return true;
    if (obj instanceof EntryImpl<?,?>) {
      EntryImpl<?,?> otherEntryImpl = (EntryImpl<?,?>) obj;
      boolean ok_sofar = true;

      if (k == null) ok_sofar = (otherEntryImpl.getKey() == null);
      else ok_sofar = k.equals(otherEntryImpl.getKey());

      if (ok_sofar) {
        if (v == null) ok_sofar = (otherEntryImpl.getValue() == null);
        else ok_sofar = v.equals(otherEntryImpl.getValue());
      }

      return ok_sofar;
    } else return false;
  }

  public int hashCode() {
    return k.hashCode() + (37 * v.hashCode());
  }
}
 
