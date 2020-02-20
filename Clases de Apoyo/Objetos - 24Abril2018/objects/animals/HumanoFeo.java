package objects.animals;

public class HumanoFeo {

	// Variables de Campo / Atributos del Objeto

	private boolean espina_dorsal;
	private boolean cola;
	private boolean pulmones;
	private boolean glandulas_mamarias;
	private boolean cuerpo_peludo;
	private boolean sexo;
	private int 	edad; 
	private int     inteligencia;
	private double  peso; 
	private double  tamano;
	//private String  especie; // Esta nos la podemos ahorrar, la especie Homo Sapiens no va a cambiar
	private String  nombre;
	private String  direccion;
	private String  apellidos;
	private String  nacimiento;
	private String  ocupacion;
	private String  genero;
	
	HumanoFeo(boolean espina_dorsal, boolean cola, boolean pulmones, boolean glandulas_mamarias, 
			boolean cuerpo_peludo, boolean sexo, int edad, int inteligencia, double peso, double tamano,
			String nombre, String direccion, String apellidos, String nacimiento, String ocupacion, String genero) {
		
		this.espina_dorsal = espina_dorsal;
		this.cola = cola;
		this.pulmones = pulmones;
		this.glandulas_mamarias = glandulas_mamarias;
		this.cuerpo_peludo = cuerpo_peludo;
		this.sexo = sexo;
		this.edad = edad;
		this.inteligencia = inteligencia;
		this.peso = peso;
		this.tamano = tamano;
		this.nombre = nombre;
		this.direccion = direccion;
		this.apellidos = apellidos;
		this.nacimiento = nacimiento;
		this.ocupacion = ocupacion;
		this.genero = genero;
		
	}
	
	//=========================================================
	//						GETTERS
	//=========================================================
		
		
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
		
	public boolean getGlandulas() {
		
		return this.glandulas_mamarias;
		
	}
	//--------------------------------------------------------
	
	public boolean getPelo() {
		
		return this.cuerpo_peludo;
		
	}
	//--------------------------------------------------------
	
	public boolean getSexo() {
		
		return this.sexo;
		
	}	
	//--------------------------------------------------------
	
	public String getNombre() {
		
		return this.nombre;
		
	}
	//--------------------------------------------------------
	
	public String getDireccion() {
		
		return this.direccion;
		
	}
	//--------------------------------------------------------
	
	public String getApellidos() {
		
		return this.apellidos;
		
	}
	//--------------------------------------------------------
	
	public String getNacimiento() {
		
		return this.nacimiento;
		
	}
	//--------------------------------------------------------
	
	public String getOcupacion() {
		
		return this.ocupacion;
		
	}
	//--------------------------------------------------------
	
	public int getInteligencia() {
		
		return this.inteligencia;
		
	}
	//--------------------------------------------------------
	
	public String getGenero() {
		
		return this.genero;
		
	}
	//--------------------------------------------------------
	
	//=========================================================
	//						SETTERS
	//=========================================================
		
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
	
	public void setGlandulas(boolean glandulas_mamarias) {
		
		this.glandulas_mamarias = glandulas_mamarias;
		
	}
	//-----------------------------------------
	
	public void setPelo(boolean cuerpo_peludo) {
		
		this.cuerpo_peludo = cuerpo_peludo;
		
	}
	//-----------------------------------------
	
	public void setSexo(boolean sexo) {
		
		this.sexo = sexo;
		
	}
	//-----------------------------------------
	
	public void setNombre(String nombre) {
		
		this.nombre = nombre;
		
	}
	//-----------------------------------------
	
	public void setDireccion(String direccion) {
		
		this.direccion = direccion;
		
	}
	//-----------------------------------------
	
	public void setApellidos(String apellidos) {
		
		this.apellidos = apellidos;
		
	}
	//-----------------------------------------
	
	public void setNacimiento(String nacimiento) {
		
		this.nacimiento = nacimiento;
		
	}
	//-----------------------------------------
	
	public void setOcupacion(String ocupacion) {
		
		this.ocupacion = ocupacion;
		
	}
	//-----------------------------------------
	
	public void setInteligencia(int inteligencia) {
		
		this.inteligencia = inteligencia;
		
	}
	//-----------------------------------------
	
	public void setGenero(String genero) {
		
		this.genero = genero;
		
	}
	//-----------------------------------------
	
	//=========================================================
	//					METODOS AUXILIARES
	//=========================================================
	
	@Override
	public boolean equals(Object Obj) {
		
		if(Obj instanceof HumanoFeo) {
			
			HumanoFeo h = (HumanoFeo)(Obj);
			return true; 
			// Completar este metodo
			
		}
		else {
			
			return false;
			
		}
		
	}
	//--------------------------------------------------------
	
	@Override
	public String toString() {
		
		return ""; // Completar este Metodo
		
	}
		
	
}
