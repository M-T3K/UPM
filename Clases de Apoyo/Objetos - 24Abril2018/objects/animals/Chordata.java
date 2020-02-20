package objects.animals;

/**
 * 
 * @author Kevin
 *
 */
public class Chordata extends Animal {

	private boolean cola;
	private boolean pulmones;
	private boolean espina_dorsal;
	
	public Chordata(String especie, int edad, double peso, double tamano, 
					boolean cola, boolean pulmones, boolean espina_dorsal) {
		
		super(especie, edad, peso, tamano);
		this.cola = cola;
		this.pulmones = pulmones;
		this.espina_dorsal = espina_dorsal;
		
	}
	//--------------------------------------------------------
	
	// Getters
	
	public boolean getCola() {
		
		return this.cola;
		
	}
	//--------------------------------------------------------
	
	public boolean getPulmones() {
		
		return this.pulmones;
		
	}
	//--------------------------------------------------------
	
	public boolean getEspina() {
		
		return this.espina_dorsal;
		
	}
	//--------------------------------------------------------
	
	// Setters
	
	public void setCola(boolean cola) {
		
		this.cola = cola;
		
	}
	//--------------------------------------------------------
	
	public void setPulmones(boolean pulmones) {
		
		this.pulmones = pulmones;
		
	}
	//--------------------------------------------------------
	
	public void setEspina(boolean espina) {
		
		this.espina_dorsal = espina;
		
	}
	//--------------------------------------------------------
	
	/**
	 * @return Si este objeto es igual a otro del mismo tipo
	 */
	@Override
	public boolean equals(Object Obj) {
		
		if(Obj instanceof Chordata) {
			
			Chordata animal = (Chordata)(Obj);
			
			return super.equals(animal)
					&& (animal.getCola() == this.cola)
					&& (animal.getPulmones() == this.pulmones)
					&& (animal.getEspina() == this.espina_dorsal);
			
		}
		else {
			
			return false;
			
		}
		
	}
	//--------------------------------------------------------
	
	/**
	 * @return El objeto transformado a un String de manera que sea legible
	 */
	@Override
	public String toString() {
		
		String cola_string = "No tiene cola";
		String pulmon_string = "Tiene Branquias";
		String espina_string = "Notocorda";
		
		if(this.cola) {
			
			cola_string = "Tiene cola";
			
		}
		if(this.pulmones) {
			
			pulmon_string = "Tiene pulmones";
			
		}
		if(this.espina_dorsal) {
			
			espina_string = "Espina Dorsal";
			
		}
		
		return super.toString() + " Es un miembro del Filo Chordata, que " + cola_string
				+ ", " + pulmon_string + " y posee una " + espina_string + ".";
		
	}
	//--------------------------------------------------------
	
	
	
	
}
