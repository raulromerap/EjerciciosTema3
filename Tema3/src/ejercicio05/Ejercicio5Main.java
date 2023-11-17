package ejercicio05;

import java.util.Scanner;

public class Ejercicio5Main {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		int n;
		
		System.out.print("Introduce un número: ");
		n = sc.nextInt();
		
		TablaMulti.tabla(n, n);
		
		sc.close();
	}

}
