
public class Calculadora {

	public static double suma(double a, double b)	{
		
		return a + b;
		
	}
	//--------------------------------------------------------------------
	
	public static double resta(double a, double b)	{
		
		return a - b; // Alternativamente podriams llamar suma de la siguiente manera: return suma(a, -1 * b)
		
	}
	//--------------------------------------------------------------------
	
	public static int multiplicacion(int a, int b)	{
		
		return a * b;
		
	}
	//--------------------------------------------------------------------
	
	public static int division(int a, int b)	{
		
		return a / b; // Alternativamente podriamos llamar multiplicacion de la siguiente manera: return multiplicacion(a, 1 / b)
		
	}
	//--------------------------------------------------------------------
	
	public static int cambioDeSigno(int n)	{
		
		return -1 * n;  // Alternativamente, podemos llamar multiplicacion tal que: Multiplicacion(-1, n)
		
	}
	//--------------------------------------------------------------------
	
	public static int potencia(int a, int b)	{
		
		return (b == 0) ? 1 : a * potencia(a, b - 1); // Siempre se puede usar Math.Pow()....
		
	}
	//--------------------------------------------------------------------	
	
	public static void main(String[] args)	{
		
		System.out.println("Bienvenido a la calculadora de Prog 1 !! \n Opciones:");
		System.out.println("1. Suma de 2 Numeros"
				+ "\n 2. Resta de 2 Numeros"
				+ "\n 3. Multiplicacion de 2 Numeros"
				+ "\n 4. Division de 2 Numeros"
				+ "\n 5. Cambio de Signo de Un Numero"
				+ "\n 6. Potencia de 2 Numeros"
				+ "\n No se olvide de dar el input necesario (tantas veces como numeros necesite la operacion)");
		
		
		switch(StdIn.readInt())	{
				
			case 1:
				System.out.println(suma(StdIn.readDouble(), StdIn.readDouble()));
				break;
			case 2: 
				System.out.println(resta(StdIn.readDouble(), StdIn.readDouble()));
				break;
				
			case 3: 
				System.out.println(multiplicacion(StdIn.readInt(), StdIn.readInt()));
				break;
				
			case 4:
				System.out.println(division(StdIn.readInt(), StdIn.readInt()));
				break;
				
			case 5:
				System.out.println(cambioDeSigno(StdIn.readInt()));
				break;
				
			case 6:
				System.out.println(potencia(StdIn.readInt(), StdIn.readInt()));
				break;
			default:
				System.out.println("You gave wrong Input!");
			
		}
		
		
	}
	//--------------------------------------------------------------------
	
}
