package ejercicio03;

import java.util.Scanner;

public class Ejercicio3Main {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		int n, m;
		
		System.out.print("Introduce un número: ");
		n=sc.nextInt();
		
		System.out.print("Introduce otro número: ");
		m=sc.nextInt();
		
		MCD.mcd(n,m);
		
		sc.close();
		
	}

}
