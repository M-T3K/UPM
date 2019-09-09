package aed.cache;

import es.upm.aedlib.Position;


public class CacheCell<Key,Value> {
  private Value value;
  private boolean dirty;
  private Position<Key> pos;

  public CacheCell(Value value, boolean dirty, Position<Key> pos) {
    this.value = value;
    this.dirty = dirty;
    this.pos = pos;
  }

  public Value getValue() {
    return this.value;
  }

  public boolean getDirty() {
    return this.dirty;
  }

  public Position<Key> getPos() {
    return this.pos;
  }

  public void setValue(Value value) {
    this.value = value;
  }

  public void setDirty(boolean dirty) {
    this.dirty = dirty;
  }

  public void setPos(Position<Key> pos) {
    this.pos = pos;
  }

  public String toString() {
    String valueString = "";
    if (value != null) valueString = "value=\""+value.toString()+"\"";
    else valueString = "value=null";

    String dirtyString = "";
    if (dirty) dirtyString = ",dirty";

    String posString = "";
    if (pos == null) posString = ",pos=null";
    else posString = ",pos("+pos.toString()+")";

    return "<" + valueString + dirtyString + posString + ">";
  }
}
