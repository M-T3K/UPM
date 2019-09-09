
// Programa que arranque N Threads
// y que termine cuando los N Threads se hayan terminado
// Cada Thread debe escribir una linea para identificarlos
// luego deben dormir T ms, y volver a imprimir una linea
// identificadora.
// Para terminar, el Thread Principal debera Avisar de que todos
// los hilos han terminado.

public class CC_01_Threads {

    public static int nThreads = 10;
    public static int ms       = 1000;

    private static class MyThread extends Thread {

        private int n; // Numero del Thread

        public MyThread(int n) {

            this.n = n;
        }

        @Override
        public void run() {

            System.out.printf("I am a new Thread. My HashCode is %d. Now I'm going to sleep.\n", this.hashCode());
            
            try {

                Thread.sleep(ms);
            } 
            catch(InterruptedException ex) {

                System.out.println("Mesa called Jar Jar Binks. Mesa thinks The Dark side is strong in the Sequels.\nDissen gonna be bery messy! Me no watchin!:");
                ex.printStackTrace();                
            }

            // De la manera que los profesores querian:
            System.out.printf("I recently woke up. I am Thread %d.\n", this.n);
            
            // De mi manera. hashCode() garantiza que objetos distintos den un numero distinto.
            System.out.printf("I recently woke up. I am Thread %d.\n", this.hashCode());
        }

    }

    public static void main(String[] args) {

        for( int i = 0; i < nThreads; ++i) {

            Thread thread = new Thread(new MyThread(i)); // Creamos el Hilo
            thread.start(); // Corremos el Hilo
            try {

                thread.join(); // Nos aseguramos de que Termine
            } 
            catch(InterruptedException ex) {

                thread.interrupt();
                System.out.println("Mesa called Jar Jar Binks. Mesa thinks The Dark side is strong in the Sequels.\nDissen gonna be bery messy! Me no watchin!:");
                ex.printStackTrace();
                return;
            }
        }

        System.out.println("All Threads executed properly. The Same cannot be said about the Sequels.");
    }

}

