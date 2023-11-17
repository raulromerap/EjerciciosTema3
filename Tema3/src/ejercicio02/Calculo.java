package ejercicio02;

public class Calculo {

	static void calc(int n, int m) {
		
		int i=n;
		
		System.out.print("Entre los numeros " + n + " y " + m + " se encuentran: ");
		
		do {
			
			i++;
			System.out.print(i + " ");
			
		}while(i<m-1);
	}
	
}
