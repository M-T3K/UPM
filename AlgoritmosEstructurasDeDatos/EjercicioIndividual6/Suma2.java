package aed.individual6;

import es.upm.aedlib.set.Set;
import es.upm.aedlib.set.HashTableMapSet;
import es.upm.aedlib.graph.Edge;
import es.upm.aedlib.graph.Vertex;
import es.upm.aedlib.graph.DirectedGraph;
import es.upm.aedlib.map.Map;
import es.upm.aedlib.map.HashTableMap;

public class Suma2 {

  /**
   * @param : Argumento del tipo DirectedGraph<Integer, E> que representa el grafo
   *        en el que buscamos.
   * @param : Vertex<Integer> contenido en 'graph' que representa el Vertice a
   *        partir del cual queremos encontrar la suma de todos los conexos.
   * @param : Set<Vertex<Integer> que almacena los Vertices ya visitados.
   */
  private static <E> int sumRec(DirectedGraph<Integer, E> graph, Vertex<Integer> vInitial, Set<Vertex<Integer>> vSet) {

    if(vSet.contains(vInitial))
      return 0;

    Iterable<Edge<E>> edges = graph.outgoingEdges(vInitial);

    int sum = vInitial.element().intValue();
    vSet.add(vInitial);

    for(Edge<E> edge : edges) {

      sum += sumRec(graph, graph.endVertex(edge), vSet);
    }

    return sum;
  }

  /**
   * @param g : Estructura de datos del tipo DirectedGraph<Integer, E> que
   *          representa un grafo direccionado.
   * @return Map del tipo Map<Vertex<Integer, Integer>> que contiene pares
   *         formados por Un Vertex<Integer> y la suma de todos los vertices a los
   *         que esta unido.
   */
  public static <E> Map<Vertex<Integer>, Integer> sumVertices(DirectedGraph<Integer, E> g) {

    Map<Vertex<Integer>, Integer> map = new HashTableMap<Vertex<Integer>, Integer>();
    Iterable<Vertex<Integer>> vertices = g.vertices();

    for(Vertex<Integer> vertex : vertices) {

      // Usamos un Set para no tener que implementar nuestro propio metodo de busqueda
      Set<Vertex<Integer>> vSet = new HashTableMapSet<Vertex<Integer>>();

      // Calculamos la suma recursivamente
      int sum = sumRec(g, vertex, vSet);

      // Ponemos el par <Vertice, suma> en el map
      map.put(vertex, new Integer(sum));
    }

    return map;
  }

}
