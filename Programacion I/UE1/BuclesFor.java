
public class BucleFor {

	
	public static int factorial(int n)	{
		
		if(n < 2)	{
			
			return 1;
			
		}	else	{
			
			int res = 1;
			for(int i = n; i > 1; --i)	{
				
				res *= i;
				
			}
			return res;
			
		}
		
	}
	//----------------------------------------------------------
	
	public static int sumaHasta(int n)	{
		
		int res = 0;
		
		for(int i = 1; i <= n; ++i)	{
			
			res += i;
			
		}
		
		return res;
		
	}
	//----------------------------------------------------------
	
	
	public static int sumaEntre(int a, int b)	{
		
		int res = 0;
		for(; b >= a; --b)	{
			
			res += b;
			
		}
		return res;
		
	}
	//----------------------------------------------------------
	
	public static int sumaCubosEntre(int a, int b)	{
		
		int res = 0;
		
		for(; a <= b; ++a)	{
			
			res += a * a;
			
		}
		
		return res;
		
	}
	//----------------------------------------------------------
	
	public static int sumaParesEntre(int a, int b)	{
		
		if(a % 2 != 0)	{
			
			++a;
			
		}
		
		int res = 0;
		for(; a <= b; a += 2)	{
			
			res += a;
			
		}
		return res;
		
	}
	//----------------------------------------------------------
	
	public static int sumaMultiplosNEntre(int a, int b, int n)	{
		
		
		int res = 0;
		for(; a <= b; ++a)	{
			
			if(a % n == 0)	{
				
				res += a;
				
			}
			
		}
		
		return res;
		
		
	}
	//----------------------------------------------------------
	
	public static int numeroCifras(int n)	{
		
		int c = 0;
		for( ; n > 0; n /= 10)	{
			/* Esto arregla el caso n = 0, pero realmente esto no deberia pasar
			porque un numero que sea 0123 no es mas que 123.
			if(c < 10)	{
			
			    c++;
			    break; // O quizas return c++
			
			}
			*/
			c++;
			
		}
		return c;
		
	}
	//----------------------------------------------------------
	
	public static int sumaCifras(int n)	{
		
		int res = 0;
		for(int i = 0; n > 0; n /= 10)	{
			
			res += n % 10;
			
		}
		
		return res;
		
	}
	//----------------------------------------------------------
	
	public static int sumaCuadradosCifras(int n)	{
		
		int res = 0;
		for(int i = 0; n > 0; n /= 10)	{
			
			res += (n % 10) * (n % 10);
			
		}
		
		return res;
		
	}
	//----------------------------------------------------------
	
	public static int sumaCifrasPares(int n)	{
		
		int res = 0;
		for(int i = 0; n > 0; n /= 10)	{
			
			if((n % 10) % 2 == 0)	{
				
				res += (n % 10);
				
			}
			
		}
		
		return res;
	}
	//----------------------------------------------------------
	
	public static boolean estaEntre(int a, int b, int n)	{
		
		// La version mala poco optimizada de esto usando un for loop
		// Mejoremoslo un poco
		// Miramos si n es a o b (entonces estaria en el intervalo) y asi no tiene que iterar a traves de estos y nos ahorramos unos ms
		if(n == a || n == b)	{
			
			return true;
			
		}
		++a;	 // No es necesario que volvamos a mirar a, sumamos una a A y ya procedemos de manera normal	
		for(; a < b; ++a)	{
			
			if(a == n)	{
				
				return true;
				
			}
			
		}
		return false;
		
		
	}
	//----------------------------------------------------------
	
	
	// En esta funcion siempre podemos llamar al funcion suma de multiplos, y si el valor != 0 entonces habra un multiplo
	// Pero eso seria muy poco optimo
	public static boolean hayMultiploEntre(int a, int b, int n)	{
		
		for(; a <= b; ++a)	{
			
			if(a % n == 0)	{
				
				return true;
				
			}
			
		}
		return false;
		
	}
	//----------------------------------------------------------
	
	public static boolean todosMultiplosEntre(int a, int b, int n)	{
				
		for(; a <= b; ++a)	{
			
			if(a % n != 0)	{
				
				return false;
				
			}
			
		}
		return true;
			
	}
	//----------------------------------------------------------
	
	public static boolean todasCifrasPares(int n)	{
		
		for(; n > 0; n /= 10)	{
			
			if((n % 10) % 2 != 0)	{
				
				return false;
								
			}
			
		}
		
		return true;
		
	}
	//----------------------------------------------------------
	
	public static boolean hayCifraImpar(int n)	{
		
		for(; n > 0; n /= 10)	{
			
			if((n % 10) % 2 != 0)	{
				
				return true;
								
			}
			
		}
		
		return false;
		
	}
	//----------------------------------------------------------
	
	
	public static void main(String[] args)	{
		
		System.out.println(sumaEntre(3, 5));
		System.out.println(factorial(5));
		System.out.println(sumaHasta(12));
		System.out.println(sumaCubosEntre(1, 5));
		System.out.println(sumaParesEntre(1, 4));
		System.out.println(sumaMultiplosNEntre(2, 40, 3));
		System.out.println(numeroCifras(1234));
		System.out.println(sumaCifras(1234));
		System.out.println(sumaCuadradosCifras(12345));
		System.out.println(sumaCifrasPares(12345));
		System.out.println(estaEntre(5, 15, 10));
		System.out.println(hayMultiploEntre(2, 10, 5));
		System.out.println(todosMultiplosEntre(3, 5, 1));
		System.out.println(todasCifrasPares(1234));
		System.out.println(hayCifraImpar(1234));
		
	}
	
}
