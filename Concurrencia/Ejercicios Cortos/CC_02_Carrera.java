// Crear una variable compartida para todos los Threads n = 0
// Procesos que Incrementen y Decrementen esta variable.
// Se deberian hacer M procesos de cada tipo, y el resultado deberia ser 0
// pero no lo sera debido a las Race Conditions

public class CC_02_Carrera {

    private static final int nOps     = 20; // Numero de Operaciones
    private static final int nThreads = 10; // Numero de Procesos

    private static volatile int n = 0;

    private static void increment() {++n;}
    private static void decrement() {--n;}

    private static class IRun implements Runnable {

        @Override
        public void run() {
            increment();
        }
    }

    private static class DRun implements Runnable {

        @Override
        public void run() {
            decrement();
        }
    }

    public static void main(String[] args) {

        System.out.printf("n := %d\n", n);

        while(n == 0) {

            Thread[] iThreads = new Thread[nThreads];
            Thread[] dThreads = new Thread[nThreads];

            

            for( int i = 0; i < nThreads; ++i) {
                
                iThreads[i] = new Thread(new IRun());
                dThreads[i] = new Thread(new DRun());

                iThreads[i].start();
                dThreads[i].start();
            }

            for( int i = 0; i < nThreads; ++i) {
                
                try {
                    iThreads[i].join();
                    dThreads[i].join();
                }
                catch(InterruptedException ex) {
    
                    System.out.println("Mesa called Jar Jar Binks. Mesa thinks The Dark side is strong in the Sequels.\nDissen gonna be bery messy! Me no watchin!:");
                    ex.printStackTrace();
                    System.out.println("Nossa gungans interrupt the separatist army...");
                    iThreads[i].interrupt(); // Squadron of B1 Battle Droids
                    dThreads[i].interrupt(); // Squadron of B2 Super Battle Droids
                }
            }
        }

        System.out.printf("n := %d\n", n);
        
    }

}
