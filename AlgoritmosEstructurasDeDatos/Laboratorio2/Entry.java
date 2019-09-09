package aed.orderedmap;

/**
 * The Entry interface represents an association between a key and a value.
 */
public interface Entry<K,V> {
    /**
     * Returns the entry key.
     * @return The entry key.
     */
  public K getKey();

    /**
     * Returns the entry value.
     * @return The entry value.
     */
  public V getValue();
}
