
import org.jcsp.lang.Alternative;
import org.jcsp.lang.Any2OneChannel;
import org.jcsp.lang.CSProcess;
import org.jcsp.lang.ProcessManager;
import org.jcsp.lang.Channel;
import org.jcsp.lang.Guard;
import org.jcsp.lang.One2OneChannel;

// Importo ArrayList por su comodidad, al combinar el tamano ilimitado de una lista con 
// el indexing de un array, pero si veo que es overkill o un desperdicio de recursos ya 
// la cambiare.
import java.util.ArrayList; 

//@author
//Grupo: Kévin Alberto López Porcheron (z170084), Santiago Afanador Arévalo (z170307)
/**
 * Implementation using CSP (Mixed).
 * Técnica de peticiones aplazadas
 * excepto en las ops. de aviso (no bloqueantes)
 *
 * @author rul0
 */
public class EnclavamientoCSP implements CSProcess, Enclavamiento {


  //==============================================================================
  //                             CAMPOS
  //==============================================================================

  /** WRAPPER IMPLEMENTATION */
  //** Channels for receiving external requests
  // Un canal por op. del recurso
  private final Any2OneChannel chAvisarPresencia     = Channel.any2one();
  private final Any2OneChannel chLeerCambioBarrera   = Channel.any2one();
  private final Any2OneChannel chLeerCambioFreno     = Channel.any2one();
  private final Any2OneChannel chLeerCambioSemaforo  = Channel.any2one();
  private final Any2OneChannel chAvisarPasoPorBaliza = Channel.any2one();

  //==============================================================================
  //                             CONSTRUCTOR
  //==============================================================================

  public EnclavamientoCSP() {
    new ProcessManager(this).start();
  }
  //------------------------------------------------------------------------------

  //==============================================================================
  //                             CLASES AUXILIARES
  //==============================================================================
  
  public static class PeticionLeerCambioBarrera{
    protected One2OneChannel channel;
    protected boolean value;

    public PeticionLeerCambioBarrera(One2OneChannel channel, boolean value) {
      this.channel = channel;
      this.value = value;
    }
  }
  //------------------------------------------------------------------------------

  public static class PeticionLeerCambioFreno{
    protected One2OneChannel channel;
    protected boolean value;

    public PeticionLeerCambioFreno(One2OneChannel channel, boolean value) {
      this.channel = channel;
      this.value = value;
    }
  }
  //------------------------------------------------------------------------------

  public static class PeticionLeerCambioSemaforo{
    protected One2OneChannel channel;
    protected Control.Color color;
    protected int index;

    public PeticionLeerCambioSemaforo(One2OneChannel channel,
                                      Control.Color color,
                                      int index) {
      this.channel = channel;
      this.color = color;
      this.index = index;
    }
  }
  //------------------------------------------------------------------------------


  
  //==============================================================================
  //                        Metodos de Enclavamiento
  //==============================================================================

  @Override
  public void avisarPresencia(boolean presencia) {
    chAvisarPresencia.out().write(presencia);
  }
  //------------------------------------------------------------------------------

  @Override
  public boolean leerCambioBarrera(boolean abierta) {
    One2OneChannel ch = Channel.one2one();
    chLeerCambioBarrera.out().write(new PeticionLeerCambioBarrera(ch, abierta));

    return (Boolean) ch.in().read();
  }
  //------------------------------------------------------------------------------

  @Override
  public boolean leerCambioFreno(boolean accionado) {
    One2OneChannel ch = Channel.one2one();
    chLeerCambioFreno.out().write(new PeticionLeerCambioFreno(ch, accionado));

    return (Boolean) ch.in().read();
  }
  //------------------------------------------------------------------------------

  /** notice that exceptions can be thrown outside the server */
  @Override
  public Control.Color leerCambioSemaforo(int i, Control.Color color) {
    if (i == 0 )
      throw new PreconditionFailedException("Semaforo 0 no existe");

    One2OneChannel ch = Channel.one2one();
    chLeerCambioSemaforo.out().write(new PeticionLeerCambioSemaforo(ch, color, i));

    return (Control.Color) ch.in().read();
  }
  //------------------------------------------------------------------------------

  @Override
  public void avisarPasoPorBaliza(int i) {
    if (i == 0 )
      throw new PreconditionFailedException("Baliza 0 no existe");

    chAvisarPasoPorBaliza.out().write(i);
  }
  //------------------------------------------------------------------------------

  //==============================================================================
  //                             RUN
  //==============================================================================

  /** SERVER IMPLEMENTATION */
  static final int AVISAR_PRESENCIA = 0;
  static final int LEER_CAMBIO_BARRERA = 1;
  static final int LEER_CAMBIO_FRENO  = 2;
  static final int LEER_CAMBIO_SEMAFORO  = 3;
  static final int AVISAR_PASO_POR_BALIZA = 4;


  //==============================================================================
  //                             Metodos Auxiliares
  //==============================================================================


  /**
   * @see No tiene ninguna condicion previa como requerimiento.
   * @return Se asegura de que todos los Colores en this.color[] son correctos.
   */
  private void ColoresCorrectos(int[] tren, Control.Color[] color, boolean presencia) {

    if( tren[1] > 0) {
      color[1] = Control.Color.ROJO;
    }
    if( tren[1] == 0 && (tren[2] > 0 || presencia)) {
      color[1] = Control.Color.AMARILLO;
    }
    if( tren[1] == 0 && tren[2] == 0 && !presencia) {
      color[1] = Control.Color.VERDE;
    }
    if( tren[2] > 0 || presencia) {
      color[2] = Control.Color.ROJO;
    }
    if( tren[2] == 0 && !presencia) {
      color[2] = Control.Color.VERDE;
    }
    color[3] = Control.Color.VERDE;
  }
  //------------------------------------------------------------------------------

  @Override
  public void run() {


    // Requerimientos de la implementacion del Enclavamiento como parte del estado
    
    boolean presencia = false;        // self.presencia
    int[]   tren      = {0, 0, 0, 0}; // tren: id -> Z
    Control.Color[] color = {         // Color: id -> Z
                              Control.Color.VERDE, // El Primero [0] no es relevante en cuanto a color
                              Control.Color.VERDE,
                              Control.Color.VERDE,
                              Control.Color.VERDE
                            };

   
    // Almacenes de peticiones 

    ArrayList<PeticionLeerCambioBarrera>  almacenBarrera = new ArrayList<PeticionLeerCambioBarrera>();
    ArrayList<PeticionLeerCambioFreno>    almacenFreno   = new ArrayList<PeticionLeerCambioFreno>();
    ArrayList<PeticionLeerCambioSemaforo> almacenSem     = new ArrayList<PeticionLeerCambioSemaforo>();;


    // Construcción de la recepción alternativa
    Guard[] inputs = {
        chAvisarPresencia.in(),
        chLeerCambioBarrera.in(),
        chLeerCambioFreno.in(),
        chLeerCambioSemaforo.in(),
        chAvisarPasoPorBaliza.in()
    };

    Alternative services = new Alternative(inputs);
    int chosenService = 0;

    // Bucle de servicio
    while (true) {
      chosenService = services.fairSelect();

      switch (chosenService) {

          case AVISAR_PRESENCIA: {
            
            // Asumimos las condiciones PRE y CPRE

            // Leemos el cambio del canal, y actualizamos presencia
            presencia = (Boolean)(chAvisarPresencia.in().read());
            
            // Actualizamos los colores mediante el protocolo de correccion de colores.
            this.ColoresCorrectos(tren, color, presencia);
          } break;
          case LEER_CAMBIO_BARRERA: {

            // Asumimos la condicion PRE

            // Leemos la Peticion del canal
            PeticionLeerCambioBarrera p = (PeticionLeerCambioBarrera)(chLeerCambioBarrera.in().read());
            // Almacenamos dicha peticion en el almacen
            almacenBarrera.add(p);
            
            
          } break;
          case LEER_CAMBIO_FRENO:{
            
            // Asumimos la condicion PRE
            
            // Leemos la Peticion del canal
            PeticionLeerCambioFreno p = (PeticionLeerCambioFreno)(chLeerCambioFreno.in().read());
            // Almacenamos dicha peticion en el almacen
            almacenFreno.add(p);
            
          } break;
          case LEER_CAMBIO_SEMAFORO: {
              
            // Asumimos la condicion PRE
            
            // Leemos la Peticion del canal
            PeticionLeerCambioSemaforo p = (PeticionLeerCambioSemaforo)(chLeerCambioSemaforo.in().read());
            // Almacenamos dicha peticion en el almacen
            almacenSem.add(p);
            
          } break;
          case AVISAR_PASO_POR_BALIZA: {
            
            // Asumimos la condicion PRE

            // Leemos la peticion del canal

            int i = (Integer)(chAvisarPasoPorBaliza.in().read());

            // Actualizamos el estado del recurso
            
            --tren[i - 1];
            ++tren[i];
            // Aplicamos el protocolo de correccion de colores
            this.ColoresCorrectos(tren, color, presencia);

          } break;
          default: {
            // Esto no deberia haber ocurrido...
          };
          
      } // switch



      // Desbloqueo de las Barreras
      boolean comp = (tren[1] + tren[2] != 0); // Para las comprobaciones

      // Iteramos por todas las peticiones
      for( int i = 0; i < almacenBarrera.size(); ++i) {
        
        PeticionLeerCambioBarrera p = almacenBarrera.get(i);

        // Si resulta que la comprobacion tiene exito
        if( p.value == comp) {
          // Debemos escribirle al canal
          p.channel.out().write(!comp);
          // y borrar esta peticion ya que ha sido satisfecha
          almacenBarrera.remove(p);
          --i; // Debemos reducir el indice ya que hemos borrado un elemento
        }
      }

      // Desbloqueo de los frenos
      comp = (tren[1] > 1 || tren[2] > 1 || tren[2] == 1 && presencia);

      // Iteramos por todas las peticiones
      for(int i = 0; i < almacenFreno.size(); ++i) {

        PeticionLeerCambioFreno p = almacenFreno.get(i);
        // Si se da el caso de que la comprobacion tiene exito
        if( p.value != comp) {
          // Escribimos al canal
          p.channel.out().write(comp);
          // y borramos esta peticion al haber sido satisfecha
          almacenFreno.remove(p);
          --i; // Debemos reducir el indice ya que hemos borrado un elemento
        }
      }

      // Desbloqueo de los semaforos
      for( int i = 0; i < almacenSem.size(); ++i) {
        
        PeticionLeerCambioSemaforo p = almacenSem.get(i);
        // Preparamos el booleano para la comprobacion
        comp = (color[p.index] != p.color);
        // Si se da el caso de que la comprobacion tiene exito
        if( comp) {
          // Escribimos al canal
          p.channel.out().write(color[p.index]);
          // y borramos esta peticion al haber sido satisfecha
          almacenSem.remove(p);
          --i; // Debemos reducir el indice ya que hemos borrado un elemento
        }

      }

      
    } // end bucle servicio
  } // end run method
  //------------------------------------------------------------------------------

} // end CLASS
