import org.jcsp.lang.Alternative;
import org.jcsp.lang.AltingChannelInput;
import org.jcsp.lang.CSProcess;
import org.jcsp.lang.Channel;
import org.jcsp.lang.Guard;
import org.jcsp.lang.One2OneChannel;
import org.jcsp.lang.ProcessManager;

//@author
//Grupo: Kévin Alberto López Porcheron (z170084), Santiago Afanador Arévalo (z170307)
/**
 * Implementation using channel replication
 */
public class EnclavamientoCSP_skel_rc implements CSProcess, Enclavamiento {

  /** WRAPPER IMPLEMENTATION */
  /**
   * Channels for receiving external requests
   * just one channel for nonblocking requests
   */
  private final One2OneChannel chAvisarPresencia     = Channel.one2one();
  private final One2OneChannel chAvisarPasoPorBaliza = Channel.one2one();
  // leerCambioBarrera blocks depending on a boolean parameter
  private final One2OneChannel chLeerCambioBarreraT  = Channel.one2one();
  private final One2OneChannel chLeerCambioBarreraF  = Channel.one2one();
  // leerCambioFreno blocks depending on a boolean parameter
  private final One2OneChannel chLeerCambioFrenoT    = Channel.one2one();
  private final One2OneChannel chLeerCambioFrenoF    = Channel.one2one();
  // leerCambioSemaforo blocks depending on a semaphore id and a colour
  private final One2OneChannel[][] chLeerCambioSemaforo =
      new One2OneChannel[3][3];


  public EnclavamientoCSP_skel_rc () {
    // pending initializations
    for (int i = 0; i < 3; i++) {
      for (int j = 0; j < 3; j++) {
        chLeerCambioSemaforo[i][j] = Channel.one2one();
      }
    }
    new ProcessManager(this).start();
  }

  @Override
  public void avisarPresencia(boolean presencia) {
    chAvisarPresencia.out().write(presencia);
  }

  @Override
  public void avisarPasoPorBaliza(int i) {
    if (i == 0 )
      throw new PreconditionFailedException("Baliza 0 no existe");

    chAvisarPasoPorBaliza.out().write(i);
  }

  @Override
  public boolean leerCambioBarrera(boolean abierta) {
    One2OneChannel chreply = Channel.one2one();
    if (abierta) {
      chLeerCambioBarreraT.out().write(chreply);
    } else {
      chLeerCambioBarreraF.out().write(chreply);
    }
    return (Boolean) chreply.in().read();
  }

  @Override
  public boolean leerCambioFreno(boolean accionado) {
    One2OneChannel chreply = Channel.one2one();
    if (accionado) {
      chLeerCambioFrenoT.out().write(chreply);
    } else {
      chLeerCambioFrenoF.out().write(chreply);
    }
    return (Boolean) chreply.in().read();
  }

  /** notice that the exception must be thrown outside the server */
  @Override
  public Control.Color leerCambioSemaforo (int i, Control.Color color) {
    if (i == 0 || i > 3)
      throw new PreconditionFailedException("Semaforo 0 no existe");

    One2OneChannel chreply = Channel.one2one();

    chLeerCambioSemaforo[i-1][color.ordinal()].out().write(chreply);

    return (Control.Color) chreply.in().read();
  }

  /** SERVER IMPLEMENTATION */
  @Override
  public void run() {
    // resource state is kept in the server
    // TODO : Declarar el estado del recurso
    // TODO : presencia
    //
    // TODO : tren
    //
    // TODO : color
    //

    // state initialization
    // TODO : inicializar vuestra representación del estado del recurso
    //
    //
    //
    //
    //
    //
    //

    // mapping request numbers to channels and vice versa
    // 0 <--> chAvisarPresencia
    // 1 <--> chAvisarPasoPorBaliza
    // 2 <--> chLeerCambioBarreraT
    // 3 <--> chLeerCambioBarreraF
    // 4 <--> chLeerCambioFrenoT
    // 5 <--> chLeerCambioFrenoF
    // 6 + (3*(i-1)) + j <--> chLeerCambioSemaforo[i][j]
    Guard[] inputs = new AltingChannelInput[15];
    inputs[0] = chAvisarPresencia.in();
    inputs[1] = chAvisarPasoPorBaliza.in();
    inputs[2] = chLeerCambioBarreraT.in();
    inputs[3] = chLeerCambioBarreraF.in();
    inputs[4] = chLeerCambioFrenoT.in();
    inputs[5] = chLeerCambioFrenoF.in();
    for (int i = 6; i < 15; i++) {
      inputs[i] = chLeerCambioSemaforo[(i-6) / 3][(i-6) % 3].in();
    };

    Alternative services = new Alternative(inputs);
    int chosenService = 0;

    // conditional sincronization
    boolean[] sincCond = new boolean[15];
    // algunas condiciones de recepción no varían durante
    // la ejecución del programa
    // sincCond[0] = ...;
    // sincCond[1] = ...;

    while (true){
      // actualizar sincronización condicional
      // TODO : actualizar los demás elementos de sincCond
      //
      //
      //
      //
      //
      //
      //
      //
      //
      //
      //
      //


      // esperar petición
      chosenService = services.fairSelect(sincCond);
      One2OneChannel chreply; // lo usamos para contestar a los clientes

      switch(chosenService){
      case 0: // avisarPresencia
        //@ assume inv & pre && cpre of operation;
        // TODO : leer mensaje del canal
        // TODO : actualizar estado del recurso
        break;
      case 1: // avisarPasoPorBaliza
        //@ assume inv & pre && cpre of operation;
        // TODO : leer mensaje del canal
        // TODO : actualizar estado del recurso
        //
        //
        //
        break;
      case 2: // leerCambioBarrera(true)
        //@ assume inv & pre && cpre of operation;
        // TODO : leer mensaje del canal y procesar peticion
        //
        // TODO : calcular valor a devolver al cliente
        //
        // TODO : contestar al cliente
        break;
      case 3: // leerCambioBarrera(false)
        //@ assume inv & pre && cpre of operation;
        // TODO : leer mensaje del canal y procesar peticion
        //
        // TODO : calcular valor a devolver al cliente
        //
        // TODO : contestar al cliente
        break;
      case 4: // leerCambioFreno(true)
        //@ assume inv & pre && cpre of operation;
        // TODO : leer mensaje del canal y procesar peticion
        //
        // TODO : calcular valor a devolver al cliente
        //
        // TODO : contestar al cliente
        break;
      case 5: // leerCambioFreno(false)
        //@ assume inv & pre && cpre of operation;
        // TODO : leer mensaje del canal y procesar peticion
        //
        // TODO : calcular valor a devolver al cliente
        //
        // TODO : contestar al cliente
        break;
      default: // leerCambioSemaforo(queSemaforo,queColor)
        // TODO : decodificar número de semáforo y color a partir del
        //        valor de chosenService
        //
        //
        // TODO : leer mensaje del canal
        //
        // TODO : contestar al cliente
        break;
      } // SWITCH
    } // SERVER LOOP
  } // run()

  // métodos auxiliares varios
  // TODO : coloca aquí aquellos métodos que hayais
  //        usado en la otra práctica para ajustar
  //        luces de semaforos, evaluar CPREs, etc.
  //
  //
  //
  //
  //
  //
  //
  //
  //
  //
  //
  //
  //
  //
  //
  //
  //
  //

} // end CLASS
