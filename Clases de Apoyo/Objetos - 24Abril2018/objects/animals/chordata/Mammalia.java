package objects.animals.chordata;

import objects.animals.Chordata;

public class Mammalia extends Chordata {

	private boolean glandulas_mamarias;
	private boolean cuerpo_peludo;
	private boolean sexo;
	
	public Mammalia(String especie, int edad, double peso, double tamano, boolean cola,
					boolean pulmones,boolean espina_dorsal, boolean glandulas_mamarias, 
					boolean cuerpo_peludo, boolean sexo) {
		
		super(especie, edad, peso, tamano, cola, pulmones, espina_dorsal);
		this.glandulas_mamarias = glandulas_mamarias;
		this.cuerpo_peludo = cuerpo_peludo;
		this.sexo = sexo;
		
	}
	
	public boolean getGlandulas() {
		
		return this.glandulas_mamarias;
		
	}
	
	public boolean getPelo() {
		
		return this.cuerpo_peludo;
		
	}
	
	public boolean getSexo() {
		
		return this.sexo;
		
	}
	
	public void setGlandulas(boolean glandulas_mamarias) {
		
		this.glandulas_mamarias = glandulas_mamarias;
		
	}
	
	public void setPelo(boolean cuerpo_peludo) {
		
		this.cuerpo_peludo = cuerpo_peludo;
		
	}
	
	public void setSexo(boolean sexo) {
		
		this.sexo = sexo;
		
	}
	
	
	@Override
	public boolean equals(Object Obj) {
		
		if(Obj instanceof Mammalia) {
			
			Mammalia mamifero = (Mammalia)(Obj);
			return (super.equals(mamifero))
					&& (this.cuerpo_peludo == mamifero.getPelo())
					&& (this.glandulas_mamarias == mamifero.getGlandulas())
					&& (this.sexo == mamifero.sexo);
			
		}
		else {
			
			return false;
			
		}
		
	}
	
	@Override
	public String toString() {
		
		String sex_str = (this.sexo) ? "hembra" : "macho";
		String pelo_str = (this.cuerpo_peludo) ? "cuerpo peludo" : "cuerpo sin pelo";
		String mamas_str = (this.glandulas_mamarias) ? "y capaz" : "e incapaz";
		
		return super.toString() + " Es " + sex_str + ", de " + pelo_str + ", " + mamas_str + " de generar leche.";
		
	}
	
}
