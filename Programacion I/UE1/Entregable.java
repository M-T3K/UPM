
public class Entregable {

	public static void main(String[] args)	{}
	
	
	static int[][] identidad(int dimension)	{
		
		
		int[][] matrix = new int[dimension][dimension];
		
		for(int i = 0; i < dimension; i++)	{
			
			// En otros lenguajes esto podriaa estar mal
			// pero en java todo se inicializa a 0 si es posible
			// y es lo que pasa aqui
			// 
			matrix[i][i] = 1;
			
		}
		
		return matrix;
		
	}
	
	// esto funciona para todos los lenguajes
	static int[][] identidad2(int dimension){
		
		int[][] matrix = new int[dimension][dimension];
		
		for(int i = 0; i < dimension; i++){
			
			
			for(int j = 0; j < dimension; i++)	{
				
				if(i == j){
					
					matrix[i][j] = 1;
					
				}	else	{
					
					matrix[i][j] = 0;
					
				}
				
			}
			
		}
		
		return matrix;
		
	}
	
	static void borrarUltimo(int[] arr, int elem)	{
		
		boolean notFound = true; // Significa "no Encontrado" pueden cambiarlo a 
		// encontrado e invertir la condicion
		// Pueden cambiar este i > -1 por i >= 0 y funciona igual
		// y por favor haganlo para que no les acusen de copiar 
		for(int i = arr.length - 1; i > -1 && notFound; i--)	{
			
			// tambien pueden cambiar esto por elem == arr[i]
			if(arr[i] == elem)	{
				
				arr[i] = 0;
				notFound = false;
				
			}
			
		}
		
	}
	
	
	
}
