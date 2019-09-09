package aed.cache;

import es.upm.aedlib.Position;
import es.upm.aedlib.map.*;
import es.upm.aedlib.positionlist.*;

public class Cache<Key, Value> {

  private int maxCacheSize;
  private Storage<Key, Value> mainMemory;
  private Map<Key, CacheCell<Key, Value>> cacheContents;
  private PositionList<Key> keyListLRU;

  public Cache(int maxCacheSize, Storage<Key, Value> mainMemory) {

    this.mainMemory = mainMemory;
    this.cacheContents = new HashTableMap<Key, CacheCell<Key, Value>>();
    this.keyListLRU = new NodePositionList<Key>();
    this.maxCacheSize = maxCacheSize;

  }
  // --------------------------------------------------------------------

  /**
   * @param key : Argumento del tipo "Key" que representa la clave bajo la que se almacena un dato.
   */
  public Value get(Key key) {

    if (this.cacheContents.containsKey(key)) {

      Position<Key> pos = this.cacheContents.get(key).getPos();
      this.keyListLRU.remove(pos);
      this.keyListLRU.addFirst(key);
      this.cacheContents.get(key).setPos(this.keyListLRU.first());
    } 
    else {

      Value v = this.mainMemory.read(key);
      this.keyListLRU.addFirst(key);
      CacheCell<Key, Value> cell = new CacheCell<Key, Value>(v, false, this.keyListLRU.first());
      this.cacheContents.put(key, cell);
      if (this.cacheContents.size() > this.maxCacheSize) {

        Position<Key> pos = this.keyListLRU.last();
        CacheCell<Key, Value> cell2 = this.cacheContents.get(pos.element());
        if (cell2.getDirty()) {

          this.mainMemory.write(pos.element(), cell2.getValue());
        }

        this.cacheContents.remove(pos.element());
        this.keyListLRU.remove(pos);
      }
    }

    return this.cacheContents.get(key).getValue();
  }
  // --------------------------------------------------------------------

  /**
   * @param key : Argumento del tipo "Key" que representa la clave bajo la que se almacena un dato.
   * @param value : Argumento del tipo "Value" que representa el valor bajo la que se almacena un dato.
   */
  public void put(Key key, Value value) {

    if (this.cacheContents.containsKey(key)) {

      Position<Key> pos = this.cacheContents.get(key).getPos();
      this.keyListLRU.remove(pos);
      this.keyListLRU.addFirst(key);
      this.cacheContents.get(key).setPos(this.keyListLRU.first());
    } 
    else {

      this.keyListLRU.addFirst(key);
      CacheCell<Key, Value> cell = new CacheCell<Key, Value>(value, false, this.keyListLRU.first());
      this.cacheContents.put(key, cell);
      if (this.cacheContents.size() > this.maxCacheSize) {

        // Debemos eliminar un valor antiguo
        Position<Key> pos = this.keyListLRU.last();
        CacheCell<Key, Value> cell2 = this.cacheContents.get(pos.element());
        if (cell2.getDirty()) {

          this.mainMemory.write(pos.element(), cell2.getValue());
        }

        this.cacheContents.remove(pos.element());
        this.keyListLRU.remove(pos);
      }
    }

    CacheCell<Key, Value> cell = this.cacheContents.get(key);
    cell.setValue(value);
    cell.setDirty(true);
  }
  // --------------------------------------------------------------------

}
