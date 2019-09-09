import es.upm.babel.cclib.ConcIO;
import es.upm.babel.cclib.Semaphore;

public class ControlSimulado implements Control {

  //  private final static int HORA = 60000;
  private final static int HORA = 2000;
  //  private final static int MINUTO = 1000;
  private final static int MINUTO = 5000;
  private final static int SEGUNDO = 17;

  private Semaphore[] segmento = {
      null,
      new Semaphore(0),
      new Semaphore(0),
      new Semaphore(0)
  };

//  private Semaphore mutex = new Semaphore(1);
  private volatile boolean abierta = true;

  private void sleep(int ms) {
    try {Thread.sleep(ms);} catch (InterruptedException e) {};
  }

  public ControlSimulado() {
  }

  public void detectarTren(int n)
  {
    switch (n) {
    case 1:
      sleep(1 * HORA);
      segmento[1].signal();
      break;
    case 2:
      segmento[1].await();
      sleep(30 * SEGUNDO);
      segmento[2].signal();
      break;
    case 3:
      segmento[2].await();
      sleep(30 * SEGUNDO);
      segmento[3].signal();
      break;
    default:
      throw new IllegalArgumentException();
    }
    ConcIO.printfnl("Tren pasando baliza " + n);
  }

  public void encenderSemaforo(int n, Color color)
  {
    ConcIO.printfnl("Semáforo " + n + " " + color);
  }

  public void detectarPresencia(boolean presencia)
  {
    do {
      sleep(1 * MINUTO);
    }
    while (!abierta && presencia);
    ConcIO.printfnl("Detectando presencia: %s",
                    presencia ? "COCHE DETECTADO" : "NO HAY COCHES");
  }

  public void abrirBarrera()
  {
    ConcIO.printfnl("Abriendo barrera");
    sleep(5 * SEGUNDO);
    ConcIO.printfnl("Barrera abierta");
    abierta = true;
  }

  public void cerrarBarrera()
  {
    ConcIO.printfnl("Cerrando barrera");
    sleep(5 * SEGUNDO);
    ConcIO.printfnl("Barrera cerrada");
    abierta = false;
  }

  public void accionarFreno(boolean activo)
  {
    if (activo) {
      ConcIO.printfnl("Freno accionado");
    }
    else {
      ConcIO.printfnl("Freno no accionado");
    }
  }
}
