package ejercicio04;

import java.util.Scanner;

public class Ejercicio4Main {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		String letra;
		
		System.out.print("Introduce una letra: ");
		letra = sc.next();
		
		
		if(Vocales.vocal(letra, true)) {
			System.out.println("La letra " + letra + " es una vocal");
		}else {
			System.out.println("La letra " + letra + " es una consonante");
		}
		
		sc.close();
	}
}
