package aed.caminos;


import es.upm.aedlib.positionlist.NodePositionList;
import es.upm.aedlib.graph.DirectedGraph;

import java.util.Iterator;

import es.upm.aedlib.graph.DirectedAdjacencyListGraph;
import es.upm.aedlib.graph.Edge;
import es.upm.aedlib.graph.Vertex;
import es.upm.aedlib.map.HashTableMap;
import es.upm.aedlib.map.Map;
import es.upm.aedlib.positionlist.PositionList;
import es.upm.aedlib.set.*;

public class Transportistas {

  private DirectedGraph<Point, Integer> graph;
  private Map<Point, Vertex<Point>> points = new HashTableMap<Point, Vertex<Point>>();
  

  private PositionList<Point> vecinos(Point pt) {

    PositionList<Point> list = new NodePositionList<Point>();
    int x = pt.getX();
    int y = pt.getY();

    for(Vertex<Point> v : graph.vertices()) {

      Point p2 = v.element();

      int x1 = p2.getX();
      int y1 = p2.getY();
      
      if((x == x1 && (((y - 1) == y1) || ((y + 1) == y1)))
      || ((y == y1) && (((x - 1) == x1) || ((x + 1) == x1)))) {
          
          list.addLast(p2);          
      }
    }

    return list;
  }
  // --------------------------------------------------------------------

  private Integer coste(Integer h1, Integer h2) {
    return Math.max(h2 - h1, 0) + 1;
  }
  // --------------------------------------------------------------------
  
  private boolean find(Point p, PositionList<Point> list) {

    Iterator<Point> it = list.iterator();
    boolean found = false;

    while(it.hasNext() && !found) {

      if(it.next() == p) {

        found = true;
      }
      
    }

    return found;
  }
  // --------------------------------------------------------------------
  
  private boolean equals(Point p1, Point p2) {

    return p1.getX() == p2.getX() && p1.getY() == p2.getY();
  }
  
  public Transportistas(Integer[][] map) {

    graph = new DirectedAdjacencyListGraph<Point, Integer>();

    // Primero tenemos que insertar todos los Vertices en el grafo

    for (int i = 0; i < map.length; ++i) {

      for (int j = 0; j < map[0].length; ++j) {

        Integer height = map[i][j];
        if(height != null) {

          Point pt = new Point(i, j);
          Vertex<Point> v = graph.insertVertex(pt);
          points.put(pt, v);
        }
      }
    }

    // Una vez el grafo este completo, 
    // Debemos unir cada vertice mediante aristas con peso
    for(Vertex<Point> v : graph.vertices()) {

      Point pt = v.element();
      PositionList<Point> list = vecinos(pt);
      for(Point p : list) {

        Vertex<Point> v1 = points.get(p);
        if(v1 != null) {

          graph.insertDirectedEdge(v, v1, this.coste(map[pt.getX()][pt.getY()], map[p.getX()][p.getY()]));
        }
      }
    }

  }
  
  private Vertex<Point> findMinDistance(Map<Vertex<Point>, Integer> dist, Set<Vertex<Point>> vertices) {
	  
	  Iterator<Vertex<Point>> it = dist.keys();
	  Vertex<Point> v = null;
	  int val = Integer.MAX_VALUE;
	  while(it.hasNext()) {
		  
		  Vertex<Point> u = it.next();
		  if(dist.get(u) <= val && vertices.contains(u)) {
			  
			  v = u;
			  val = dist.get(v);
		  }
	  }
	  
	  return v;
  }

  public PositionList<Point> pathFromTo(Point fromPoint, Point toPoint) {
    
	// Part 1 
	  
    Map<Vertex<Point>, Integer> distance   = new HashTableMap<Vertex<Point>, Integer>();
    Map<Vertex<Point>, Vertex<Point>> prev = new HashTableMap<Vertex<Point>, Vertex<Point>>();
    Set<Vertex<Point>> vertices = new HashTableMapSet<Vertex<Point>>();
    
    for(Vertex<Point> v : graph.vertices()) {
    	
    	Vertex<Point> vt = points.get(fromPoint);
    	if(vt == v)
    		distance.put(v, 0);	// La distancia a si mismo = 0
    	else 
    		distance.put(v, Integer.MAX_VALUE);
    	
    	prev.put(v, null);
    	vertices.add(v);
    }
    
    // Part 2

    while(!vertices.isEmpty()) {
    	
    	Vertex<Point> v = findMinDistance(distance, vertices);
    	vertices.remove(v);
    	Iterable<Edge<Integer>> edges = graph.outgoingEdges(v);
    	
    	for(Edge<Integer> edge : edges) {
    		
    		Vertex<Point> u = graph.endVertex(edge);
    		Integer alt = distance.get(v) + edge.element();
    		if(alt < distance.get(u)) {
    			
    			distance.put(u, alt);
    			prev.put(u, v);
    		}
    		
    	}
    	
    }
    
    // Part 3
    
    PositionList<Point> path = new NodePositionList<Point>();
    Vertex<Point> u = points.get(toPoint);
    
    if(prev.get(u) != null && u != points.get(fromPoint)) {
    	
    	while(u != null) {
    		
    		path.addFirst(u.element());
    		u = prev.get(u);
    	}
    	
    }
    
    return path;
  }

  public PositionList<Point> bestPathFromTo(Point fromPoint, Point toPoint) {
	  
    return pathFromTo(fromPoint, toPoint);
  }
}
