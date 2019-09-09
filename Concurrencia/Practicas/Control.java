
public interface Control {
  /**
   * Operación bloqueante, el proceso que la llama se queda bloqueado
   * hasta que un tren pasa sobre la baliza n.
  */
  void detectarTren(int n);
  /**
   * Enumerado para los colores de los semáforos.
   */
  public static enum Color {ROJO, AMARILLO, VERDE}
  /**
   * Operación no bloqueante, rápida, enciende la luz indicada en el
   * semáforo n.
   */
  void encenderSemaforo(int n, Color color);
  /**
   * Operación bloqueante, el proceso que la invoca se queda bloqueado
   * hasta que el detector de presencia detecta un cambio con respecto
   * a la presencia indicada.  Por ejempo, si se invoca con
   * detectarPresencia(true) se bloquea hasta que haya un coche en el
   * cruce, si se invoca con detectarPresencia(false) se bloquea hasta
   * detectar que no hay ningún coche en el cruce.
   */
  void detectarPresencia(boolean presencia);
  /**
   * Operación lenta, el proceso que las invoca queda bloqueado hasta
   * que la barrera está abierta.
   */
  void abrirBarrera();
  /**
   * Operación lenta, el proceso que las invoca queda bloqueado hasta
   * que la barrera está cerrada.
   */
  void cerrarBarrera();
  /**
   * Operación no bloqueante, rápida, envía una señal al tren para
   * accionar o desactivar el freno de cualquier tren entre la baliza
   * 2 y 3
   */
  void accionarFreno(boolean activo);
}
