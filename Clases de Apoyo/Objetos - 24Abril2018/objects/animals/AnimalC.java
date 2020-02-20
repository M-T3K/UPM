package objects.animals;

import objects.animals.chordata.Mammalia;

public class AnimalC extends Mammalia {

	private String nombre;
	private String direccion;
	
	public AnimalC(String especie, int edad, double peso, double tamano, boolean cola, boolean pulmones,
			boolean espina_dorsal, boolean glandulas_mamarias, boolean cuerpo_peludo, boolean sexo,
			String nombre, String direccion) {
		
		super(especie, edad, peso, tamano, cola, pulmones, espina_dorsal, glandulas_mamarias, cuerpo_peludo, sexo);
		this.nombre = nombre;
		this.direccion = direccion;
		
	}
	
	public String getNombre() {
		
		return this.nombre;
		
	}
	
	public String getDireccion() {
		
		return this.direccion;
		
	}
	
	public void setNombre(String nombre) {
		
		this.nombre = nombre;
		
	}
	
	public void setDireccion(String direccion) {
		
		this.direccion = direccion;
		
	}

	@Override
	public boolean equals(Object Obj) {
		
		if(Obj instanceof AnimalC) {
			
			AnimalC animal = (AnimalC)(Obj);
			
			return super.equals(animal)
					&& (this.nombre.equals(animal.getNombre()))
					&& (this.direccion.equals(animal.getDireccion()));
			
		}
		else {
			
			return false;
			
		}
		
	}
	
	@Override
	public String toString() {
		
		return super.toString() + " Se llama " + this.nombre + " y  vive en " + this.direccion + ".";
		
	}
	
}
