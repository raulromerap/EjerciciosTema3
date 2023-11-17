package ejercicio03;

public class MCD {

	static void mcd (int n, int m) {
		
		int a = Math.max(n, m);
	    int b = Math.min(n, m);
	    int resultado = 0;
	    
	    do {
	    	
	        resultado = b;
	        b = a % b;
	        a = resultado;
	    
	    } while (b != 0);
	    
	    System.out.println("El MCD de los dos números es: " + resultado);
		
	}
}
