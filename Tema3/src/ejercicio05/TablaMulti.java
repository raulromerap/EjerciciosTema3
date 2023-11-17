package ejercicio05;

public class TablaMulti {

	static void tabla (int n, int tabla) {
		
		int multi, cont = 0;
		
		while(cont<10) {
			cont++;
			multi = n * cont;
			System.out.println(n + " · " + cont + " = " + multi);
		}
		
	}
	
}
