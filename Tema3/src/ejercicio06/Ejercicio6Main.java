package ejercicio06;

import java.util.Scanner;

public class Ejercicio6Main {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		double radio, altura;
		int menu;
		
		System.out.print("Introduce el valor del radio: ");
		radio = sc.nextInt();
		
		System.out.print("Introduce el valor de la altura: ");
		altura = sc.nextInt();
		
		System.out.println("1.CALCULAR ÁREA \n2.CALCULAR VOLÚMEN");
		menu = sc.nextInt();
		
		Calculo.calculo(menu, radio, altura);
		
		sc.close();
		
	}

}
