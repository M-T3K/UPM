package objects;

import linkedList.ListaEnlazada;
import linkedList.Nodo;
import objects.animals.Animal;
import objects.animals.AnimalC;
import objects.animals.Chordata;
import objects.animals.Humano;
import objects.animals.chordata.Mammalia;

public class MainClass {

	public static void main(String[] args) {
		
		//pruebasReinoAnimalia();
		pruebasListaEnlazada();
		
	}
	
	public static void pruebasReinoAnimalia() {
		
		pruebasAnimalia();
		pruebasChordata();
		pruebasMammalia();
		pruebasAnimalC();
		pruebasHumano();
		
	}
	
	public static void pruebasAnimalia() {
		
		Animal animal = new Animal("Payasus Pagliaccio", 36, 81.5, 1.89);
		Animal animal2 = new Animal("Payasus Pagliaccio", 36, 81.5, 1.89);
		System.out.printf("Animal = Animal2 ? %b(TRUE)%n",animal2.equals(animal));
		animal2.setEdad(38);
		System.out.printf("Animal = Animal2 ?%b(FALSE)%n",animal2.equals(animal));
		System.out.println(animal.toString());
		System.out.println();
		
	}
	
	public static void pruebasChordata() {
		
		Chordata ch = new Chordata("Simius Monus", 2, 35.5, 0.8, true, true, true);
		Chordata ch2 = new Chordata("Simius Monus", 2, 35.5, 0.8, true, true, true);
		System.out.printf("Chordata = Chordata2 ? %b (TRUE)%n", ch2.equals(ch));
		ch2.setCola(false);
		System.out.printf("Chordata = Chordata2 ? %b (FALSE)%n", ch2.equals(ch));
		System.out.println(ch.toString());
		System.out.println();
		
	}
	
	public static void pruebasMammalia() {
		
		Mammalia mam = new Mammalia("Simius Monus", 2, 35.5, 0.8, true, true, true, true, true, true);
		Mammalia mam2 = new Mammalia("Simius Monus", 2, 35.5, 0.8, true, true, true, true, true, true);
		
		System.out.printf("mam1 = mam2 ? %b (TRUE) %n", mam.equals(mam2));
		mam2.setSexo(false);
		mam2.setGlandulas(false);
		System.out.printf("mam1 = mam2 ? %b (FALSE) %n", mam.equals(mam2));
		System.out.println(mam2.toString());
		
	}
	
	public static void pruebasAnimalC() {
		
		AnimalC animal = new AnimalC("Canis Canis", 0, 25.0, 0.6, true, true, false, false, true, true, "Juana", "Calle de Juana 7, Tijuana, Mexico");
		AnimalC animal2 = new AnimalC("Canis Canis", 0, 25.0, 0.6, true, true, false, false, true, true, "Juana", "Calle de Juana 7, Tijuana, Mexico");
		
		System.out.printf("animal = animal2 ? %b (TRUE) %n", animal.equals(animal2));
		animal2.setTamano(0.8);
		animal2.setEspina(true);
		animal2.setPeso(32.0);
		animal2.setGlandulas(true);
		animal2.setEdad(2);
		animal2.setDireccion("Calle de Juan 3, Madrid, España");
		System.out.printf("animal = animal2 ? %b (FALSE) %n", animal.equals(animal2));
		System.out.println(animal.toString());
		System.out.println(animal2.toString());
		
	}
	
	public static void pruebasHumano() {
		
		Humano h = new Humano("Homo Sapiens", 0, 1.3, 0.23, true, false, false, false, false, true, "Juana Juanilla", "Calle de Juana 7, Tijuana, Mexico", "Ju An", "todavia no ha nacido", "Feto", 0, "Feto");
		Humano h2o = new Humano("Homo Sapiens", 0, 1.3, 0.23, true, false, false, false, false, true, "Juana Juanilla", "Calle de Juana 7, Tijuana, Mexico", "Ju An", "todavia no ha nacido", "Feto", 0, "Feto");
		System.out.printf("Humano = Humano2 ? %b (TRUE) %n", h.equals(h2o));
		h2o.setCola(false);
		h2o.setEdad(21);
		h2o.setEspina(true);
		h2o.setGenero("Mujer");
		h2o.setGlandulas(true);
		h2o.setInteligencia(110);
		h2o.setNacimiento("Hospital Santa Juana de Tijuana, Tijuana, Mexico");
		h2o.setOcupacion("Estudiante de Medicina");
		h2o.setPelo(false);
		h2o.setPeso(70.3);
		h2o.setTamano(1.68);
		h2o.setPulmones(true);
		h2o.setSexo(true);
		System.out.printf("Humano = Humano2 ? %b (FALSE) %n", h.equals(h2o));
		System.out.println(h.toString());
		System.out.println(h2o.toString());
	}
	
	public static void pruebasListaEnlazada() {
		
		Humano h = new Humano("Homo Sapiens", 0, 1.3, 0.23, true, false, false, false, false, true, "Juana Juanilla", "Calle de Juana 7, Tijuana, Mexico", "Ju An", "todavia no ha nacido", "Feto", 0, "Feto");
		Nodo n1 = new Nodo(h, null);
		System.out.println(n1);
		h = new Humano("Homo Sapiens", 0, 1.3, 0.23, true, false, false, false, false, true, "Juano Juanillo", "Calle de Juana 7, Tijuana, Mexico", "Ju An", "todavia no ha nacido", "Feto", 0, "Feto");
		Nodo n2 = new Nodo(h, null);
		System.out.println(n2);
		h = new Humano("Homo Sapiens", 0, 25, 0.8, true, false, false, false, false, true, "Victor Victoria", "Calle de Juana 7, Tijuana, Mexico", "Ju An", "todavia no ha nacido", "Feto", 0, "Feto");
		Nodo n3 = new Nodo(h, null);
		h = new Humano("Homo Sapiens", 0, 27, 0.9, true, false, false, false, false, true, "Victoria Victor", "Calle de Juana 7, Tijuana, Mexico", "Ju An", "todavia no ha nacido", "Feto", 0, "Feto");
		Nodo n4 = new Nodo(h, null);
		
		ListaEnlazada lista = new ListaEnlazada();
		lista.setCabeza(n1);
		System.out.println(lista);
		lista.anadir(n2);
		System.out.println(lista);
		lista.anadir(n3);
		lista.anadir(n4);
		System.out.println(lista);
		lista.quitar();
		System.out.println(lista);
		lista.eliminar(1);
		System.out.println(lista);
		lista.insertar(n4, 1);
		System.out.println(lista);
		n2.setSiguiente(null);
		lista.anadir(n2);
		System.out.println(lista);
		System.out.println(lista.getTamano());
		
		
		
	}
	
	
}
