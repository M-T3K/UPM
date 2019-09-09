// Exclusión mutua con espera activa.
//
// Intentar garantizar la exclusión mutua en sc_inc y sc_dec sin
// utilizar más mecanismo de concurrencia que el de la espera activa
// (nuevas variables y bucles).
//
// Las propiedades que deberán cumplirse:
// - Garantía mutual exclusión (exclusión mútua): nunca hay dos
//   procesos ejecutando secciones críticas de forma simultánea.
// - Ausencia de deadlock (interbloqueo): los procesos no quedan
//   "atrapados" para siempre.
// - Ausencia de starvation (inanición): si un proceso quiere acceder
//   a su sección crítica entonces es seguro que alguna vez lo hace.
// - Ausencia de esperas innecesarias: si un proceso quiere acceder a
//   su sección crítica y ningún otro proceso está accediendo ni
//   quiere acceder entonces el primero puede acceder.
//
// Ideas:
// - Una variable booleana en_sc que indica que algún proceso está
//   ejecutando en la sección crítica?
// - Una variable booleana turno?
// - Dos variables booleanas en_sc_inc y en_sc_dec que indican que un
//   determinado proceso (el incrementador o el decrementador) está
//   ejecutando su sección crítica?
// - Combinaciones?

class CC_03_MutexEA {
    static final int N_PASOS = 10000;

   // Generador de números aleatorios para simular tiempos de
   // ejecución
    static final java.util.Random RNG = new java.util.Random(0);

   // Variable compartida
   volatile static int n = 0;

   // Variables para asegurar exclusión mutua
   volatile static boolean en_sc = false;

   // Sección no crítica
   static void no_sc() {
//       System.out.println("No SC");
       try {
          // No más de 2ms
          Thread.sleep(RNG.nextInt(3));
       }
       catch (Exception e) {
          e.printStackTrace();
       }
   }

   // Secciones críticas
   static void sc_inc() {
      // System.out.println("Incrementando");
      n++;
   }

   static void sc_dec() {
      // System.out.println("Decrementando");
      n--;
   }

   // La labor del proceso incrementador es ejecutar no_sc() y luego
   // sc_inc() durante N_PASOS asegurando exclusión mutua sobre
   // sc_inc().
   static class Incrementador extends Thread {
      public void run () {
         for (int i = 0; i < N_PASOS; i++) {
            System.out.println("ni = " + n);

            // Sección no crítica


            // Protocolo de acceso a la sección crítica
            // Mietras que el otro este en la seccion critica, este no esta en la sc
            // I'm Starving
            while (en_sc) { no_sc();}
            en_sc = true;

            // Sección crítica
            sc_inc();

            // Protocolo de salida de la sección crítica
            en_sc = false;
         }
      }
   }

   // La labor del proceso incrementador es ejecutar no_sc() y luego
   // sc_dec() durante N_PASOS asegurando exclusión mutua sobre
   // sc_dec().
   static class Decrementador extends Thread {
      public void run () {
         for (int i = 0; i < N_PASOS; i++) {
            System.out.println("nd = " + n);
            
            // Sección no crítica


            // Protocolo de acceso a la sección crítica
            while (en_sc) { no_sc();}
            en_sc = true;

            // Sección crítica
            sc_dec();

            // Protocolo de salida de la sección crítica
            en_sc = false;
         }
      }
   }

   public static final void main(final String[] args)
      throws InterruptedException
   {
      // Creamos las tareas
      Thread t1 = new Incrementador();
      Thread t2 = new Decrementador();

      // Las ponemos en marcha
      t1.start();
      t2.start();

      // Esperamos a que terminen
      t1.join();
      t2.join();

      // Simplemente se muestra el valor final de la variable:
      System.out.println(n);
   }
}
