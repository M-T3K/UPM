package aed.caminos;

import es.upm.aedlib.Pair;


public class Point extends Pair<Integer,Integer> {
  public Point(int xCoord, int yCoord) {
    super(xCoord,yCoord);
  }

  public int getX() {
    return getLeft();
  }

  public int getY() {
    return getRight();
  }

  public String toString() {
    return "("+getLeft()+","+getRight()+")";
  }
}
