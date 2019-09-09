import es.upm.babel.cclib.Monitor;


//@author
//Grupo: Kévin Alberto López Porcheron (z170084), Santiago Afanador Arévalo (z170307)
public class EnclavamientoMonitor implements Enclavamiento {

  
  //==============================================================================
  //                                    Campos
  //==============================================================================

  Monitor mutex = new Monitor(); // Monitor para el Mutual Exclusion del Codigo

  // Dominio
  private boolean presencia = false;        // self.presencia
  private int[]   tren      = {0, 0, 0, 0}; // tren: id -> Z
  private Control.Color[] color = { // Color: id -> Z
                                    Control.Color.VERDE, // El Primero [0] no es relevante en cuanto a color
                                    Control.Color.VERDE,
                                    Control.Color.VERDE,
                                    Control.Color.VERDE
                                  };
  
  // Campos Requeridos por la Implementacion Concurrente del Enclavamiento
  
  // Estos dos atributos  se encargan de bloquear la lectura de la Barrera hasta 
  // que la CPRE se cumpla
  private Monitor.Cond condBarrera = mutex.newCond(); // Condicion para el Bloqueo 
  private boolean almacenBarrera   = false;           // Almacen para "actual" de leerCambioBarrera()

  
  // Estos dos atributos se encargan de bloquear la lectura de freno hasta 
  // que la CPRE se cumpla
  private Monitor.Cond condFreno = mutex.newCond(); // Condicion para el Bloqueo
  private boolean almacenFreno    = false;            // Almacen para "actual" de leerCambioFreno()

  // Estos dos atributos se encargan de bloquear la lectura de la Semaforos hasta 
  // que la CPRE se cumpla  
  private Monitor.Cond[] condSem = { // 4 Condiciones para el Bloqueo individual de Semaforos (Colores)
                                        mutex.newCond(), 
                                        mutex.newCond(), 
                                        mutex.newCond(), 
                                        mutex.newCond()  
                                      };
  private Control.Color[] almacenSem = new Control.Color[4]; // 4 Colores que sirven como Almacen Individual de Semaforos (Colores)


  //==============================================================================
  //                             Metodos Auxiliares
  //==============================================================================

  /**
   * @see No tiene ninguna condicion previa como requerimiento.
   * @return Se asegura de que todos los Colores en this.color[] son correctos.
   */
  private void ColoresCorrectos() {

    if( this.tren[1] > 0) {
      this.color[1] = Control.Color.ROJO;
    }
    if( this.tren[1] == 0 && (this.tren[2] > 0 || this.presencia)) {
      this.color[1] = Control.Color.AMARILLO;
    }
    if( this.tren[1] == 0 && this.tren[2] == 0 && !this.presencia) {
      this.color[1] = Control.Color.VERDE;
    }
    if( this.tren[2] > 0 || this.presencia) {
      this.color[2] = Control.Color.ROJO;
    }
    if( this.tren[2] == 0 && !this.presencia) {
      this.color[2] = Control.Color.VERDE;
    }
    this.color[3] = Control.Color.VERDE;
  }
  //------------------------------------------------------------------------------

  /**
   * @see No tiene ninguna condicion previa como requerimiento.
   * @return Este metodo se encarga de realizar desbloqueos globales
   */
  private void realizarDesbloqueos() {

    // Comprobando si es necesario desbloquear la Barrera
    boolean comp = (this.tren[1] + this.tren[2] != 0); // Para las comprobaciones
    
    if( this.condBarrera.waiting() > 0
        && this.almacenBarrera == comp) {
        
        this.condBarrera.signal();
        return;
    }
    
    // Comprobando si es necesario desbloquear los frenos
    comp = (this.tren[1] > 1 || this.tren[2] > 1 || this.tren[2] == 1 && this.presencia);
    if( this.condFreno.waiting() > 0 && this.almacenFreno != comp) {
      this.condFreno.signal();
      return;
    }

    // Comprobando si es necesario desbloquear los Semaforos (Colores)
    // Empezamos en 1 por que el primer semaforo nos da igual
    boolean shouldExit = false;
    for( int i = 1; i < this.almacenSem.length && !shouldExit; ++i) {

      comp = (this.color[i] != this.almacenSem[i]);
      if(this.condSem[i].waiting() > 0 && comp) {
        this.condSem[i].signal();
        shouldExit = true;
      }
    }

    // Fin de las Comprobaciones    
  }
  //------------------------------------------------------------------------------

  //==============================================================================
  //                             Metodos Principales
  //==============================================================================

  /**
   * @param presencia boolean que indica la presencia de la que se va a avisar
   * @see No tiene ninguna condicion previa como requerimiento.
   * @return No Devuelve nada.
   */
  @Override
  public void avisarPresencia(boolean presencia) {
    
    // Entramos en Exclusion Mutua
    mutex.enter();
   
    // Ninguna PRE;
    // Ninguna CPRE;

    // SCOPE de la SECCION CRITICA
    {
        this.presencia = presencia;
      
        // Ejecutamos el Protocolo de Correccion de Colores
        this.ColoresCorrectos(); 
    };

    // Realizamos los desbloqueos necesarios
    this.realizarDesbloqueos();    

    // Salimos de la Exclusion Mutua
    mutex.leave();
  }
  //------------------------------------------------------------------------------

  /**
   * @param actual: boolean que indica el valor actual
   * @see No tiene ninguna condicion PRE como requerimiento, pero si una CPRE:
   * @CPRE: actual == (this.tren[1] + this.tren[2]) == 0
   * @return esperado: boolean que contiene (self.tren(1) + self.tren(2) == 0)
   */
  @Override
  public boolean leerCambioBarrera(boolean actual) {
    // Entramos en Exclusion Mutua
    mutex.enter();
    
    // Ninguna PRE
    // Comprobamos la CPRE (actual != (self.tren(1) + self.tren(2) == 0))
    boolean esperado = (this.tren[1] + this.tren[2]) == 0;
    if( actual == esperado) {
      
      // Almacenamos el "actual" en su correspondiente Almacen.
      this.almacenBarrera = actual;
      // Bloqueamos futuras lecturas.
      this.condBarrera.await();
    }

    // Recalculamos en caso de que haya cambiado algo.
    esperado = (this.tren[1] + this.tren[2]) == 0; 

    // Realizamos los Desbloqueos Apropiados
    this.realizarDesbloqueos();

    // Salimos de la Exclusion Mutua 
    mutex.leave();
    return esperado;
  }
  //------------------------------------------------------------------------------

   /**
   * @param actual: boolean que indica el valor actual
   * @see No tiene ninguna condicion PRE como requerimiento, pero si una CPRE:
   * @CPRE: (actual != (self.tren(1) > 1 || self.tren(2) > 1 || (self.tren(2) == 1 && self.presencia)))
   * @return esperado: boolean que contiene (this.tren[1] > 1 || this.tren[2] > 1 || this.tren[2] == 1 && this.presencia)
   */
  @Override
  public boolean leerCambioFreno(boolean actual) {
    
    // Entramos en Exclusion Mutua
    mutex.enter();
    
    // NINGUNA PRE

    // Comprobacion de la CPRE:
    // (actual != (self.tren(1) > 1 || self.tren(2) > 1 || (self.tren(2) == 1 && self.presencia)))
    
    boolean esperado = (this.tren[1] > 1 || this.tren[2] > 1 || this.tren[2] == 1 && this.presencia);
    if( actual == esperado) {
      
      // Almacenamos el "actual" en su correspondiente Almacen.
      this.almacenFreno = actual;
      // Bloqueamos futuras lecturas.
      this.condFreno.await();
    }
    
    // Recalculamos en caso de que haya cambiado algo.
    esperado = (this.tren[1] > 1 || this.tren[2] > 1 || this.tren[2] == 1 && this.presencia);

    // Realizamos los Desbloqueos requeridos
    this.realizarDesbloqueos();    

    // Salimos de la Exclusion Mutua
    mutex.leave();
    
    return esperado;
  }
  //------------------------------------------------------------------------------

   /**
    * @exception PreconditionFailedException si viola la precondicion PRE
   * @param actual: Control.Color que indica el valor actual
   * @param i: Entero que contiene el indice
   * @see Es BLOQUEANTE y tiene tanto PRE como CPRE:
   * @PRE: i != 0
   * @CPRE: (actual != (self.tren(1) > 1 || self.tren(2) > 1 || (self.tren(2) == 1 && self.presencia)))
   * @return esperado: Control.Color que contiene el color del semaforo i
   */
  @Override
  public Control.Color leerCambioSemaforo(int i, Control.Color actual) {
    
    // Comprobacion de la PRE: 
    // (i != 0)
    if( i == 0) {
      throw new PreconditionFailedException("ERROR EN leerCambioSemaforo(): "
                                            + "(i == 0) => Violacion de la Precondicion.");
    }
    
    // Entramos en Exclusion Mutua
    mutex.enter();
    

    // Comprobacion de la CPRE: (actual != self.color(i))
    if( this.color[i] == actual) {
      
      // Guardamos en el Almacen Correspondiente al Color
      this.almacenSem[i] = actual;
      // Bloqueamos ese color de futuras lecturas
      this.condSem[i].await();

    }

    Control.Color esperado = this.color[i];
    
    // Desbloqueamos segun sea preciso
    this.realizarDesbloqueos();

    // Salimos de la Exclusion Mutua
    mutex.leave();

    return esperado;
  }
  //------------------------------------------------------------------------------

   /**
    * @exception PreconditionFailedException si viola la precondicion PRE
   * @param i: Entero que contiene el indice
   * @see Es BLOQUEANTE y tiene tanto PRE como CPRE:
   * @PRE: i != 0
   * @return No tiene return
   */
  @Override
  public void avisarPasoPorBaliza(int i) {
    
    // Comprobacion de la PRE: 
    // (i != 0)
    if( i == 0) {
      throw new PreconditionFailedException("ERROR EN avisarPasoPorBaliza(): "
                                            + "(i == 0) => Violacion de la Precondicion.");
    }

    // Entramos en Exclusion Mutua
    mutex.enter();
    

    // Ninguna CPRE

    // SCOPE de la SECCION CRITICA
    {
      --this.tren[i - 1];
      ++this.tren[i];
  
      // Ejecutamos el Protocolo de Correccion de Colores
      this.ColoresCorrectos();  
    };

    // Realizamos los Desbloqueos Apropiados
    this.realizarDesbloqueos();

    // Salimos de la Exclusion Mutua
    mutex.leave();
  }
  //------------------------------------------------------------------------------
 
}
