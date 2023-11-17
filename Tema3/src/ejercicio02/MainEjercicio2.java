package ejercicio02;

import java.util.Scanner;

public class MainEjercicio2 {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		int n, m;
		
		System.out.print("Introduce un número: ");
		n = sc.nextInt();
		
		System.out.print("Introduce otro número: ");
		m = sc.nextInt();
		
		Calculo.calc(n, m);
		
		sc.close();
	}
}
