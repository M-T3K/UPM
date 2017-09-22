//@author Kevin Alberto Lopez Porcheron
public class NotaProgI {
	
	// #Region: Funcs

	// Nota Prog I por evaluacion Continua, eval2 > 5 o return 0
	static double notaProgICont(double eval, double eval2, double ent, double clase)	{
		
		System.out.println(eval);
		if(eval2 < 5)	{
			
			return 0.0;
			
		}
	
		return eval * 0.2 + eval2 * 0.5 + ent * 0.2 + clase * 0.1;
		
	}
	//-----------------------------------------------------------------------
	
	// Nota ProgI por Final
	static double notaProgI(final boolean porFinal, double exFinal, double eval, double eval2, double ent, double clase)	{
		
		return porFinal ? exFinal : notaProgICont(eval, eval2, ent, clase);
		
	}
	//-----------------------------------------------------------------------
	
	
	// #Region: Main
	public static void main(String[] args)	{
		
		System.out.println("Por Examen Final, Deberia dar 4 > " + notaProgI(true, 4.0, 0.0, 0.0, 0.0, 0.0));
		System.out.println("Por Evaluacion Continua, deberia dar 0 (Porque saco menos de 5 en eval2) > " + notaProgI(false, 0.0, 2.0, 4.0, 2.0, 2.0));
		System.out.println("Por Evaluacion Continua, deberia dar 5 > " + notaProgI(false, 0.0, 8.0, 7.0, 2.0, 2.0));
		
	}
	//-----------------------------------------------------------------------
	
}
