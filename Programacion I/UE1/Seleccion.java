
// @author Marco Ferrero; Primeras 2 secciones, Seccion Recursiva : Kevin
public class Seleccion {

	//#Region Seccion I y II
	
	//Calcula el Area de un Triangulo, PRE b & h != 0
	public static double areaTriang(double b, double h){
		
		return b * h / 2 ;
		
	}
	//---------------------------------------------------------------
	
	//Calcula el Area de un Triangulo en el Plano Cartesiano (Los Lados pueden ser Negativos)
	public static double areaTriang1(double b, double h){
		
		double c = b * h / 2;
	
		return Math.abs(c);
		
	}
	//---------------------------------------------------------------
	
	// Calcula f(x) = ax^2 + bx + c
	public static int cuadratica(int a, int b, int c, int x) {
		
		
		return a*(x*x)+ b*x+ c;
		
	}
	//---------------------------------------------------------------

	// Calcula el Area de un Circulo teniendo en cuenta el Radio
	public static double areaCirculo(int r) {
		
		return Math.PI * 2 * r * r; 
		
	}
	//---------------------------------------------------------------	
	
	// Calcula una Corona a partir de 2 Circulos de radio r1 y r2, r1 > r2 > 0
	public static double areaCorona(int r1, int r2) {
		
		return areaCirculo(r1) - areaCirculo(r2);
		
	}
	//---------------------------------------------------------------
	
	// Calcula el Area de una corona a partir de 2 circulos , incluso si los circulos se generan de Manera inversa (radio < 0)
	public static double areaCorona1(int r1, int r2) {
		
		return Math.abs(areaCirculo(r1) - areaCirculo(r2));
		
	}
	//---------------------------------------------------------------
	
	// Tests para Corona
	public static void areaCoronaTest() {
		
		System.out.println("input areaCorona, PRE r1 > r2 > 0");
		
		System.out.println(areaCorona(StdIn.readInt(),StdIn.readInt()));
		
		System.out.println("input areaCorona1, PRE r1,r2 > 0");
		
		System.out.println(areaCorona1(StdIn.readInt(),StdIn.readInt()));
	}
	//---------------------------------------------------------------
	
	// Devuelve el Maximo entre dos numeros enteros
	public static int max(int a, int b) {
		
		return Math.max(a, b);
		
	}
	//---------------------------------------------------------------
	
	// Devuelve el Minimo entre dos numeros enteros
	public static int min( int a, int b) {
		
		return Math.min(a, b);
		
	}
	//---------------------------------------------------------------

	// Devuelve el valor (A o B) segun la mayor posicion (posA o posB)
	public static int maxPos(int A, int posA, int B, int posB) {
		
		return (posA >= posB)? A:B;
		
	}
	//---------------------------------------------------------------

	// Calcula el valor absoluto de un valor del tipo Double	
	public static double abs(double x) {
				
		return (x <= 0)? x*-1:x;
		
	}
	//---------------------------------------------------------------
	
	//Calculates the Integer value of the boolean a
	public static int delta(boolean a) {
		
		return a? 1: 0;
		
	}
	//---------------------------------------------------------------

	//Calcula la tasa con interes aplicado
	public 	static double tasaInteres(int n) {
		
		return (n < 1000)? n* 0.04:(n < 5000)? n*0.045: n* 0.05;
		
	}
	
	//---------------------------------------------------------------
	public static void tasaInteresTest() {
		
		System.out.println(tasaInteres(900));
		System.out.println("900 * 0.04 =" + 900* 0.04);
		System.out.println(tasaInteres(3000));
		System.out.println("3000 * 0.045 =" + 3000* 0.045);
		System.out.println(tasaInteres(5200));
		System.out.println("5200 * 0.05 =" + 5200* 0.05);
	}
	
	//---------------------------------------------------------------

	//---------------------------------------------------------------
	public static int escalonada(int n)	{
		
		return (n == 1)? 2 : (n == 2 || n == 3)? 4 : (n == 4 || n == 5)? 1 : 3;
		
	}
	//---------------------------------------------------------------

	//Region Recursive
	
	//---------------------------------------------------------------
	
	// #REgion: Recursivas
	public int factorialRec(int n)	{
		
		if(n < 1)	{
			
			return n;
			
		}
		
		return n * factorialRec(n - 1);
		
	}
	//---------------------------------------------------------------
	public int numeroCifras(int n)	{
		
		
		if(n < 1)	{
			
			return 0;
			
		}
		
		return 1 + numeroCifras(n / 10);
		
	}
	
	//---------------------------------------------------------------
	// PRE n > 0
	public int numeroCifras1(int n)	{
		
		if(n == 0)	{
			
			return -1;
			
		}
		
		if(n < 1)	{
			
			return 0;
			
		}
		
		return 1 + numeroCifras(n / 10);
		
	}
	//---------------------------------------------------------------

	//Main
	public static void main(String[] args)	{
		
		boolean areaTriangTest = areaTriang(2,3) == 3;
		System.out.println("areaTriang(2,3)" + areaTriangTest);
		boolean areaTriang1Test = areaTriang1(-2,3) == 3;
		System.out.println("areaTriang1(-2.0, 3.0)" + areaTriang1Test);
		boolean cuadraticaTest = cuadratica(2,3,4,5) == 69;
		System.out.println("cuadratica(2, 3, 4, 5)" + cuadraticaTest);
		boolean areaCirculoTest = areaCirculo(5)== Math.PI*2*5*5;
		System.out.println("areaCirculo(5)" + areaCirculoTest);
		boolean areaCoronaTest = areaCorona(3,2) == (Math.PI*2*3*3) - (Math.PI*2*2*2);
		System.out.println("areaCorona(3, 2)" + areaCoronaTest);
		boolean areaCorona1Test = areaCorona1(-3,2) == (Math.PI*2*3*3) - (Math.PI*2*2*2);
		System.out.println("areaCorona1(-3,2" + areaCorona1Test);
		
		//tasaInteresTest();
		
		
		
	}
	
}
