
public class Recursion {

	// #Region: Ejercicios de Clase
	
	//-------------------------------------------------------------------
	public static int productoEntre(int x, int y)	{
		
		return (x > y)? 1 : x * productoEntre(x + 1, y);
		
	}
	//-------------------------------------------------------------------
	
	public static int factorialInverso(int x)	{
				
		return productoEntre(1, x);
		
	}
	//-------------------------------------------------------------------
	
	public static int sumaEntre(int x, int y)	{
			
		return (x > y)? 0 : x + sumaEntre(x + 1, y);
			
	}
	//-------------------------------------------------------------------
	
	public static int sumaCuadradosEntre(int x, int y)	{
		
		return (x > y)? 1 : x * x + sumaCuadradosEntre(x + 1, y);
			
	}
	//-------------------------------------------------------------------
	
	public static int sumaCuadradosParesEntre(int x, int y)	{
		
		return (x > y)? 0 : (x % 2 != 0)? sumaCuadradosParesEntre(x + 1, y) : x * x + sumaCuadradosParesEntre(x + 2, y);
			
	}
	//-------------------------------------------------------------------
		
	public static int factorialRec(int n)	{
		
		if(n < 1)	{
			
			return n;
			
		}
		
		return n * factorialRec(n - 1);
		
	}
	//---------------------------------------------------------------
	
	public static int numeroCifras(int n)	{
		
		
		if(n < 1)	{
			
			return 0;
			
		}
		
		return 1 + numeroCifras(n / 10);
		
	}
	//---------------------------------------------------------------
	
	public static int sumaCifras(int n)	{
		
		if(n < 1)	{
			
			return 0;
			
		}
		
		return n % 10 + sumaCifras(n / 10);
		
	}
	//---------------------------------------------------------------
	
	public static int sumaCifrasPares(int n)	{
		
		if(n < 1)	{
			
			return 0;
			
		}
		return ((n % 10) % 2 == 0) ?  n % 10 + sumaCifrasPares(n / 10) : sumaCifrasPares(n / 10);
	}
	//---------------------------------------------------------------
	
	public static int sumaCifrasParesPosImpar(int n)	{
		
		if(n < 1)	{
			
			return 0;
			
		}	else if(((n % 10) % 2 == 0) && (numeroCifras(n) % 2 == 0))	{
			
			return n % 10 + sumaCifrasParesPosImpar(n / 10);
			
		}
		return sumaCifrasParesPosImpar(n / 10);
		
	}
	//---------------------------------------------------------------
	
	public static void main(String[] args)	{
		
		System.out.println(productoEntre(3, 2));
		System.out.println(factorialInverso(8));
		System.out.println(sumaEntre(2, 8));
		System.out.println(sumaCuadradosEntre(2, 8));
		System.out.println(sumaCuadradosParesEntre(2, 8));
		System.out.println("////////");
		System.out.println(factorialRec(6));
		System.out.println(numeroCifras(1234));
		System.out.println(sumaCifras(1234));
		System.out.println(sumaCifrasPares(1234));
		System.out.println(sumaCifrasParesPosImpar(12345521));
		
		
	}
}
