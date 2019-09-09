package aed.cache;

import java.util.Hashtable;
import java.util.Set;
import java.util.Map;
import java.util.Map.Entry;


public class Storage<Key,Value> {
  Hashtable<Key,Value> table;

  public Storage(Key[] keys, Value[] values) {
    table = new Hashtable<Key,Value>();
    for (int i=0; i<keys.length; i++)
      table.put(keys[i],values[i]);
  }

  public Value read(Key key) {
    return table.get(key);
  }

  public void write(Key key, Value value) {
    table.put(key,value);
  }

  public Set<Map.Entry<Key,Value>> entrySet() {
    return table.entrySet();
  }

  public String toString() {
    StringBuilder result = new StringBuilder();
    result.append("[");
    for (Map.Entry<Key,Value> entry : table.entrySet()) {
      if (result.length() > 1)
        result.append(",");
      result.append("<"+entry.getKey()+","+entry.getValue()+">");
    }
    result.append("]");
    return result.toString();
  }
}
