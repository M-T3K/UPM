
public class Cartas {

	public static String paloCartas(int c)	{
		
		switch(c)	{
		
			case 0:
				return "Oros";
			case 1:
				return "Copas";
			case 2:
				return "Espadas";
			case 3:
				return "Bastos";
			default:
				return "UNKNOWN";
			
		}
		
		
		
	}
	//---------------------------------------------------------------
	
	public static String figuraCartas(int c)	{
		
		switch(c)	{
		
			case 1:
				return "1";
			case 2:
				return "2";
			case 3:
				return "3";
			case 4:
				return "4";
			case 5:
				return "5";
			case 6:
				return "6";
			case 7:
				return "7";
			case 10:
				return "Sota";
			case 11:
				return "Caballo";
			case 12:
				return "Rey";
			default:
				return "Not In DataBase";
			
		}
		
		
	}
	//---------------------------------------------------------------
	
	public static void main(String[] args)	{
		
		System.out.println("Elija una carta de la baraja española: 1, 2, 3, 4, 5, 6, 7, 10(sota), 11(caballo), 12(rey) ");
		String fig = figuraCartas(StdIn.readInt());
		System.out.println("Elija un palo de la baraja española: 0(oros), 1(copas), 2(espadas), 3(bastos) ");
		String palo = paloCartas(StdIn.readInt());
		
		System.out.println("La carta que elegiste es: " + fig + " de " + palo);
		
	}
	//---------------------------------------------------------------
	
}
