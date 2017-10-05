
public class Recursion {

	
	
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
	
	
	public static void main(String[] args)	{
		
		System.out.println(productoEntre(3, 2));
		System.out.println(factorialInverso(8));
		System.out.println(sumaEntre(2, 8));
		System.out.println(sumaCuadradosEntre(2, 8));
		System.out.println(sumaCuadradosParesEntre(2, 8));
		
	}
}
