
public interface Enclavamiento {
  
  void avisarPresencia(boolean presencia);

  boolean leerCambioBarrera(boolean actual);

  boolean leerCambioFreno(boolean actual);

  Control.Color leerCambioSemaforo(int i,
      Control.Color actual);

  void avisarPasoPorBaliza(int i);
}