//@author Kevin Alberto Lopez Porcheron
public class SolucionDirecta  {

// Suma
	public static int funcionSuma(int x, int y)	{
		
		return x + y;
		
	}
	//-----------------------------------------------------------------------
	
	// Multiplica
	public static int funcionProducto(int x, int y)	{
		
		return x * y;
		
	}
	//-----------------------------------------------------------------------
	
	// DIV
	public static int cociente(int x, int y)	{
		
		return x / y;
		
	}
	//-----------------------------------------------------------------------
	
	// Mod
	public static int resto(int x, int y)	{
		
		return x % y;
		
	}
	//-----------------------------------------------------------------------
	
	// Es Par
	public static boolean esPar(int n)	{
		
		return n % 2 == 0;
		
	}
	//-----------------------------------------------------------------------
	
	// Es multiplo
	public static boolean esMultiplo(int x, int y)	{
		
		return x % y == 0;
		
	}
	//-----------------------------------------------------------------------
	
	// Es Divisor
	public static boolean esDivisor(int x, int y)	{
		
		return y % x == 0;
		
	}
	//-----------------------------------------------------------------------
	
	// Es Multiplo y Par
	public static boolean esMultiploYPar(int x, int y)	{
		
		return x % y == 0 && esPar(x);
		 
	}
	//-----------------------------------------------------------------------
	
	// A Mayus
	public static char aMayus(char c){
		
		return (char)((int) c - 32);
		
	}
	//-----------------------------------------------------------------------
	
	// A Minus
	public static char aMinus(char c)	{
		
		return (char)((int) c + 32);
		
	}
	//-----------------------------------------------------------------------
	
	// Incrementar
	public static int incrementar(int n)	{
		
		return n + 1;
		
	}
	//-----------------------------------------------------------------------
	
	// Incrementar Decenas
	public static int incrementarDecenas(int n)	{
		
		return n + 10;
		
	}
	//-----------------------------------------------------------------------
	
	// Es Par? O Negativo?
	public static boolean esParONegativo(int n)	{
		
		return esPar(n) || n < 0;
		
	}
	//-----------------------------------------------------------------------
	
	// Es Multiplo de 3 e Impar?
	public static boolean esImparYMultiploDe3(int n)	{
		
		return (!esPar(n) && (n % 3 == 0));
		
	}
	//-----------------------------------------------------------------------
	
	// Devolver Signo
	public static int devolverSigno(int n)	{
		
		return esCero(n)? 0 : (n > 0) ? 1 : -1;
		
	}
	//-----------------------------------------------------------------------
	
	// Es Cero?
	public static boolean esCero(int n)	{
		
		return n == 0;
		
	}
	//-----------------------------------------------------------------------
	
	/* Si la suma es positiva, devolver la suma.
	 * Si  la suma es negativa, devolver 0
	 * Asumo que si la suma es 0 tambien se considera negativa */
	public static int sumaPositiva(int x, int y)	{
		
		int sum = x + y;
		return (sum > 0)? sum : 0;
		
	}
	//-----------------------------------------------------------------------
	
	// Main
	public static void main(String[] args)	{
		
		System.out.println("Comenzando las pruebas: ");
		// #REGION: TESTS
	
		// Prueba de la Suma
		System.out.printf("El Resultado de %d + %d = %d%n", 3, 4, funcionSuma(3, 4));
		
		// Prueba del Producto
		System.out.printf("El Resultado de %d * %d = %d%n", 8, 9, funcionProducto(8, 9));
		
		// Prueba del Cociente
		System.out.printf("El Resultado de %d / %d = %d%n", 9, 3, cociente(9, 3));
		
		// Prueba del Resto
		System.out.printf("El Resto de %d / %d = %d%n", 128, 11, resto(128, 11));
		
		// Prueba si Es Par
		System.out.printf("2 deberia ser Par, y la funcion devuelve %b%n", esPar(2));
		System.out.printf("3 Deberia ser Impar, y la funcion devuelve %b%n", esPar(3));
		
		// Prueba si Es Multiplo
		System.out.printf("%d es Multiplo de %d? %b%n", 6, 3, esMultiplo(6, 3));
		System.out.printf("%d es Multiplo de %d? %b%n", 11, 3, esMultiplo(11, 3));
		
		// Prueba si Es Divisor
		System.out.printf("%d es Divisor de %d? %b%n", 3, 6, esDivisor(3, 6));
		System.out.printf("%d es Divisor de %d? %b%n", 3, 11, esDivisor(3, 11));
		
		// Prueba si Es Multiplo Y par
		System.out.printf("Es %d Multiplo par de %d? %b%n", 6, 3, esMultiploYPar(6, 3));
		System.out.printf("Es %d Multiplo par de %d? %b%n", 15, 3, esMultiploYPar(15, 3));
		
		// Prueba conversion a Mayusculas y Minusculas
		System.out.printf("La letra %c en mayusculas es %c%n", 'c', aMayus('c'));
		System.out.printf("La letra %c en Minusculas es %c%n", 'C', aMinus('C'));
		
		// Prueba de Incrementar
		System.out.printf("%d incrementado por uno es %d%n", 1, incrementar(1));
		System.out.printf("%d incrementado por 10 es %d%n", 2, incrementarDecenas(2));
		
		// Prueba de  Es Par O negativo
		System.out.printf("El Numero %d es Par O negativo?%n", 3, esParONegativo(3));
		System.out.printf("El Numero %d es Par O Negativo?%n", -20, esParONegativo(-20));
		
		// Prueba de Es Impar Y Multiplo de 3
		System.out.printf("El numero %d es Impar y Multiplo de 3?%b%n", 15, esImparYMultiploDe3(15));
		System.out.printf("El numero %d es Impar y Multiplo de 3?%b%n", 12, esImparYMultiploDe3(12));
		
		// Prueba de Devolver Signo
		
		System.out.printf("El Numero %d es Positivo: %b%n", 21, devolverSigno(21));
		System.out.printf("El Numero %d es Negativo: %b%n", -12, devolverSigno(12));
		System.out.printf("El Numero 0 es 0: %b%n", devolverSigno(0));
		
		// Prueba Es Cero
		
		System.out.printf("El numero 0 es 0? %b%n", esCero(0));
		System.out.printf("El Numero %d es 0? %b%n", -12, esCero(-12));
		
		// Prueba de suma positiva
		
		System.out.printf("La suma positiva de %d + %d = %d%n", 2, 3, sumaPositiva(2, 3));
		System.out.printf("La suma positiva de %d + %d = %d%n", -4, 1, sumaPositiva(-4, 1));
		
	}
	//-----------------------------------------------------------------------


}//-----------------------------------------------------------------------
