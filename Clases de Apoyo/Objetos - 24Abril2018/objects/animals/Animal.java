package objects.animals;

/**
 * 
 * @author Kevin
 *
 */
public class Animal {
	

	// Variables de Campo / Atributos del Objeto

	private String especie; // La especie de nuestro animalito
	private int edad; // La edad de nuestro animalito
	private double peso; // El peso de nuestro animal
	private double tamano; // La altura de nuestro animal
	
	
	
	// Esto es un constructor
	public Animal() {
		
		// Y en este caso, esta vacio
		
	}
	//-----------------------------------------
	
	// Esto es un constructor
	public Animal(String especie, int edad, double peso, double tamano) {
		
		this.especie = especie;
		this.edad = edad;
		this.peso = peso;
		this.tamano = tamano;
		
	}
	//-----------------------------------------
	
	//=========================================================
	//						GETTERS
	//=========================================================
	
	public String getEspecie() {
		
		return this.especie;
		
	}
	//-----------------------------------------
	
	public int getEdad() {
		
		return this.edad;
		
	}
	//-----------------------------------------
	
	public double getPeso() {
		
		return this.peso;
		
	}
	//-----------------------------------------
	
	public double getTamano() {
		
		return this.tamano;
		
	}
	//-----------------------------------------
	
	//=========================================================
	//						SETTERS
	//=========================================================
	
	public void setEspecie(String especie) {
		
		this.especie = especie;
		
	}
	//-----------------------------------------
	
	public void setEdad(int edad) {
		
		this.edad = edad;
		
	}
	//-----------------------------------------
	
	public void setPeso(double peso) {
		
		this.peso = peso;
		
	}
	//-----------------------------------------
	
	public void setTamano(double tamano) {
		
		this.tamano = tamano;
		
	}
	//-----------------------------------------
	
	//=========================================================
	//					METODOS AUXILIARES
	//=========================================================
		
	/**
	* @return En este metodo devolvemos el objeto animal convertido a un String
	*/
	@Override
	public String toString() {
		
		return "Un Especimen de " + this.especie + " de " + this.edad 
				+ " años de edad, un peso de " + this.peso 
				+ "kg y un tamano de " + this.tamano + " metros.";
		
	}
	//-----------------------------------------
	
	/**
	 * @return true if both objects are of the same type and contain the same information
	 * 
	 */
	@Override
	public boolean equals(Object obj) {
		
		if(obj instanceof Animal) {
			
			Animal animal = (Animal)(obj);
			return (this.edad == animal.getEdad())
					&& (this.especie.equals(animal.getEspecie()))
					&& (this.peso == animal.getPeso())
					&& (this.tamano == animal.getTamano());
			
		}
		else {
			
			return false;
			
		}
		
	}
	
}
