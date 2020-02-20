package objects.animals;

public class Humano extends AnimalC {

	private String apellidos;
	private String nacimiento;
	private String ocupacion;
	private int    inteligencia;
	private String genero;
	
	public Humano(String especie, int edad, double peso, double tamano, boolean cola, boolean pulmones,
			boolean espina_dorsal, boolean glandulas_mamarias, boolean cuerpo_peludo, boolean sexo, String nombre,
			String direccion, String apellidos, String nacimiento, String ocupacion, int inteligencia, String genero) {
		
		super(especie, edad, peso, tamano, cola, pulmones, espina_dorsal, glandulas_mamarias, cuerpo_peludo, sexo, nombre,
				direccion);
		
		this.apellidos = apellidos;
		this.nacimiento	= nacimiento;
		this.ocupacion = ocupacion;
		this.inteligencia = inteligencia;
		this.genero = genero;
		
	}
	
	public String getApellidos() {
		
		return this.apellidos;
		
	}
	
	public String getNacimiento() {
		
		return this.nacimiento;
		
	}
	
	public String getOcupacion() {
		
		return this.ocupacion;
		
	}
	
	public int getInteligencia() {
		
		return this.inteligencia;
		
	}
	
	public String getGenero() {
		
		return this.genero;
		
	}
	
	public void setApellidos(String apellidos) {
		
		this.apellidos = apellidos;
		
	}
	
	public void setNacimiento(String nacimiento) {
		
		this.nacimiento = nacimiento;
		
	}
	
	public void setOcupacion(String ocupacion) {
		
		this.ocupacion = ocupacion;
		
	}
	
	public void setInteligencia(int inteligencia) {
		
		this.inteligencia = inteligencia;
		
	}
	
	public void setGenero(String genero) {
		
		this.genero = genero;
		
	}
	
	@Override
	public boolean equals(Object Obj) {
		
		if(Obj instanceof Humano) {
			
			Humano h = (Humano)(Obj);
			return super.equals(h)
					&& (this.apellidos.equals(h.getApellidos()))
					&& (this.nacimiento.equals(h.getNacimiento()))
					&& (this.ocupacion.equals(h.getOcupacion()))
					&& (this.inteligencia == h.getInteligencia())
					&& (this.genero.equals(h.getGenero()));
			
		}
		else {
			
			return false;
			
		}
		
	}
	
	@Override
	public String toString() {
		
		String sex_str = this.getSexo() ? "una mujer" : "un hombre";
		
		return "Esta persona se llama " + this.getNombre() + " " + this.apellidos + 
				". Nació en " + this.nacimiento + " pero ahora vive en " + this.getDireccion()
				+ ". Es " + sex_str + " que se identifica como " + this.genero + " y que se dedica a ser " +
				this.ocupacion + ". Tiene un CI de " + this.inteligencia + ".";
		
	}
	

}
