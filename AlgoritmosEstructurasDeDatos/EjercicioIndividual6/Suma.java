package aed.individual6;

import es.upm.aedlib.graph.Edge;
import es.upm.aedlib.graph.Vertex;

import java.util.Iterator;

import es.upm.aedlib.graph.DirectedGraph;
import es.upm.aedlib.map.Map;
import es.upm.aedlib.positionlist.NodePositionList;
import es.upm.aedlib.positionlist.PositionList;
import es.upm.aedlib.map.HashTableMap;


public class Suma {
  public static <E> Map<Vertex<Integer>,Integer> sumVertices(DirectedGraph<Integer,E> g) {
	  
	  Map<Vertex<Integer>,Integer> map=new HashTableMap<Vertex<Integer>,Integer>();
	 
	  
	  Iterator<Vertex<Integer>> it=g.vertices().iterator();
	 
	  while(it.hasNext()) {
		  PositionList<Vertex<Integer>> visited = new NodePositionList<Vertex<Integer>>();
		  Vertex<Integer> vertex=it.next();
		  //visited.addLast(vertex); Aqui esta tu error
		  Integer sumMap=sumVerticesAux(g, vertex, visited,vertex.element());
		  
		  map.put(vertex, sumMap);
		  
		  
	  }
	  
    return map;
  }
  


public static <E> Integer sumVerticesAux(DirectedGraph<Integer,E> g, 
		Vertex<Integer>vertex,PositionList<Vertex<Integer>> visited, Integer sum){
	
	if(find(visited, vertex)) {
		return 0;
	}
	else {
		
		visited.addLast(vertex);
		Iterator<Edge<E>> edges=g.outgoingEdges(vertex).iterator();
		
		while(edges.hasNext()) {
			
			Edge<E> edge=edges.next();
			
			  
			sum=sum+sumVerticesAux(g, g.endVertex(edge),visited,/*sum*/g.endVertex(edge).element());
			//sum=sum+vertex.element(); Esto no lo necesitas porque nada mas empezar estas
			// llamando a esta funcion con sum = vertex.element() (en el metodo sumVertices)
			// aparte, para que no se te vaya sumando varias veces la suma todo el rato, en vez de pasar 
			// la suma en si pasas el siguiente vertice.
		}
	
	return sum;
  }
}

private static boolean find(PositionList<Vertex<Integer>> visited, Vertex<Integer> vertex) {
	boolean found= false;
	
	Iterator<Vertex<Integer>> it=visited.iterator();
	
	while(it.hasNext() && !found) {
		if(it.next().equals(vertex))
			found=true;
		
	}
	return found;
}
}
