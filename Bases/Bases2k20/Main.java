package pokemon;

import java.util.ArrayList;
import java.util.Scanner;

public class Main {

	public static void main (String[] args) {

		Scanner sc = new Scanner(System.in);

		PokemonDatabase poke = new PokemonDatabase();
		char menuOption = 'a';

		// Main menu loop
		do {
			System.out.println("Escoja una opción: ");
			System.out.println("  1) Crear las tablas \"aprende\" y \"conoce\".");
			System.out.println("  2) Cargar datos sobre aprendizaje de ataques (aprende y conoce).");
			System.out.println("  3) Mostrar la Pokedex.");
			System.out.println("  4) Extender el coronapokerus.");
			System.out.println("  5) Descargar sprite de dos pokemon (uno tiene sprite almacenado y otro no).");
			System.out.println("  0) Salir de la aplicación.");

			// Read user's option and check that it is a valid option
			menuOption = 'a';
			do {
				String line = sc.nextLine();
				if (line.length()==1) {
					menuOption = line.charAt(0);
				}
				if (menuOption<'0' || menuOption>'7') {
					System.out.println("Opción incorrecta.");
				}
			} while (menuOption<'0' || menuOption>'7');

			ArrayList<Especie> especies;

			// Call a specific method depending on the option
			switch (menuOption) {
			case '1':
				System.out.println("Creando tabla \"aprende\"...");
				poke.createTableAprende();
				System.out.println("Creando tabla \"conoce\"...");
				poke.createTableConoce();
				break;
			case '2':
				System.out.println("Cargando datos de la tabla \"aprende\"...");
				int n = poke.loadAprende("aprende.csv");
				System.out.println("Se han cargado " + n + " entradas.");
				System.out.println("Cargando datos de la tabla \"conoce\"...");
				n = poke.loadConoce("conoce.csv");
				System.out.println("Se han cargado " + n + " entradas.");
				break;
			case '3':
				especies = poke.pokedex();
				System.out.println(Especie.toStringArrayList(especies) + '\n');
				break;
			case '4':
				System.out.println("¿Cuántos días quieres que dure la pandemia?");
				String dias_texto;
				do {
					dias_texto = sc.nextLine();
					if (!Main.isNatural(dias_texto))
						System.out.println("Introduce un número natural de días.");
				} while (!Main.isNatural(dias_texto));
				int dias = Integer.parseInt(dias_texto);
				
				int infectados = poke.coronapokerus(poke.getEjemplares(), dias);
				System.out.println("Se han infectado " + infectados + " pokémon.");
				break;
			case '5':
				System.out.println("Descargando sprite de Charmander...");
				poke.getSprite(4, "charmander.jpg");
				
				System.out.println("Descargando sprite de Squirtle...");
				poke.getSprite(7, "squirtle.jpg");
				break;
			}

			if (menuOption!='0')
				System.out.println("¿Qué más desea hacer?");
			else
				System.out.println("¡Hasta pronto!");
		} while (menuOption!='0');

		sc.close();
		
		poke.disconnect();
	}

	private static boolean isNatural(String n) {
		if (n == null)
			return false;

		try {
			int n_int = Integer.parseInt(n);
			if (n_int<=0)
				return false;
		} catch (NumberFormatException nfe) {
			return false;
		}
		return true;
	}

}
