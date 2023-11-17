package ejercicio06;

public class Calculo {

	static void calculo(int menu, double radio, double altura) {
		
		double resultado;
		final double PI = Math.PI;
		
		if(menu == 1) {
			resultado = 2 * PI * radio * (altura + radio);
			System.out.println("El resultado del área es: " + resultado);
		}else if(menu == 2) {
			resultado = PI * Math.pow(radio, 2) * altura;
			System.out.println("El resultado del volumen es: " + resultado);
		}else {
			System.err.println("ERROR");
		}
		
	}

}
