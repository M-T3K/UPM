
public class TesterPersonal {

	private static class Presencia extends Thread {

		private boolean bool;
		private Enclavamiento e;
		
		public Presencia(boolean bool, Enclavamiento e) {

			this.bool = bool;
			this.e = e;
		}

		public void run() {

			System.out.printf("AvisarPresencia(%b)\n", bool);
			e.avisarPresencia(bool);
			System.out.printf("Terminado AvisarPresencia(%b)\n", bool);
		}

	}

	private static class Semaforo extends Thread {

		private int i;
		private Control.Color c;
		private Enclavamiento e;

		public Semaforo(int i, Control.Color c, Enclavamiento e) {

			this.i = i;
			this.c = c;
			this.e = e;
		}

		public void run() {

			System.out.printf("leerCambioSemaforo(%d, %s)\n", i, c.toString());
			e.leerCambioSemaforo(i, c);
			System.out.printf("Terminado leerCambioSemaforo(%d, %s)\n", i, c.toString());
		}

	}

	public static void main(String[] args) {

		// Debemos sacar algo que haga LeerCambioSemaforo
		// y AvisarPresencia con los valores necesarios
		Enclavamiento e = new EnclavamientoMonitor();
		new Semaforo(1, Control.Color.VERDE, e).run();
		new Semaforo(2, Control.Color.VERDE, e).run();
		new Presencia(false, e).run();
		new Presencia(true, e).run();
	}

}
