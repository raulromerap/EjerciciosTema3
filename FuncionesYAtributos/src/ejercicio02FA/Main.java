package ejercicio02FA;

import java.util.InputMismatchException;
import java.util.Scanner;

/*
 * CASOS DE PRUEBA
 * ENTRADA: 1, 7 y 8 	| ESPERA: 30						| OBTENIDO: El resultado es: 30.0
 * ENTRADA: 2, 8 y 15 	| ESPERA:  120						| OBTENIDO: El resultado es: 120.0
 * ENTRADA: 0 				| ESPERA: Salida 					| OBTENIDO: Gracias por usar este programa
 * ENTRADA: 1, h y 7 	| ESPERA: Error 					| OBTENIDO: El tipo de numero debe ser decimal
 * ENTRADA: 2, 4.5 y 3.1 	| ESPERA: 13.95				| OBTENIDO: El resultado es: 13.950000000000001
 */

public class Main {

	// Se crea una varaible tipo escaner para recoger los datos introducidos por el usuario
	static Scanner sc = new Scanner(System.in);

	public static void main(String[] args) {
		//Se crea una variable que se crea a partir de una clase donde haremos nuestros propios calculos
		Rectangulo rectangulo;

		// Se crea una variable para la recoger el valor del numero introducido por el usuario para escoger un menú
		int opc;
		//Se crea tres variables tipo double(decimal) para el ancho y alto del rectangulo y uno para el resultado final
		double ancho, alto, resultado = 0;
		
		//Se iguala la variable del ancho con el valor devuelto de la variable pideAncho
		ancho = pideAncho();
		//Se iguala la variable del alto con el valor devuelto de la variable pideAlto
		alto = pideAlto();

		// La variable opc se iguala al atributo que muestra el menú
		opc = menu();
		
		//Se crea un bucle el cual seguirá preguntando por el alto y el ancho cuando el valor de las opciones sea distinto a cero
		while (opc != 0) {
			//La variable adopta la clase de las operaciones haciendo que este pueda registrar sus llamadas a atributos
			rectangulo = new Rectangulo(alto, ancho);
			
			//Se da de nuevo una condicion, en este caso tipo switch, para saber que tipo de operacion quiere realizar el usuario 
			switch (opc) {
			//En caso de que el usuario haya puesto "1" se llama al atributo del perimetro y se iguala a la variable resultado
			case 1 -> resultado = rectangulo.perimetro();
			//En caso de que el usuario haya puesto "1" se llama al atributo del área y se iguala a la variable resultado
			case 2 -> resultado = rectangulo.area();
			}
			//Una vez se iguale el resultado se mostrará en pantalla dando como resulado un mensaje con la variable
			System.out.println("El resultado es: " + resultado);
			
			//Se iguala la variable del ancho con el valor devuelto de la variable pideAncho para volver a preguntar
			ancho = pideAncho();
			//Se iguala la variable del alto con el valor devuelto de la variable pideAlto
			alto = pideAlto();
			// La variable opc se iguala al atributo que muestra el menú
			opc = menu();

		}
		//Se crea un mensaje de despedida por cerrar el programa
		System.out.println("Gracias por usar este programa");
		
		//Se cierra el escaner
		sc.close();
	}

	public static int menu() {
		
		//Se crea una variable para saber que escoge el usuario en el menu
		int opc;
		
		//Se imprime la primera linea para que el usuario pueda ver que el numero 1 es la opcion de perimetro
		System.out.println("1.Perímetro");
		//Se imprime la primera linea para que el usuario pueda ver que el numero 2 es la opcion de área
		System.out.println("2.Área");
		//Se imprime la primera linea para que el usuario pueda ver que el numero 0 es la opcion de salir del programa
		System.out.println("0.Salir");

		//Se iguala la variable para recoger el valor introducido por el usuario
		opc = sc.nextInt();

		//Se devuelve el valor de la varible del atributo
		return opc;

	}

	public static double pideAncho() {
		
		//Se crea una variable tipo double para recoger el valor que inserte el usuario para el ancho
		double ancho = 0;
		//Se crea una variable tipo boolean para saber si se puede seguir para el siguiente paso o no
		boolean seguir = true;
		//Se crea un bucle para empezar a imprimir por pantalla el mensaje para introducir el ancho
		do {
			/* 
			 * Se intenta seguir el paso mostrandole el mensaje y 
			 * recogiendo el valor que el usuario quiere introducir para la operacion,
			 * recogiendo el valor que introduce y cambia el booleano a false para salir del bucle
			*/
			try {
				System.out.print("Introduca el ancho: ");
				ancho = sc.nextDouble();
				seguir = false;
			//Si el usuario introduce un valor erroneo se coge dicho valor y se envia un mensaje de error
			} catch (InputMismatchException e) {
				System.out.println("Tipo de valor erroneo");
			//Y finalmente se manda a limpiar la cadena
			} finally {
				sc.nextLine();
			}
		//Si la variable no es true se sale del bucle
		} while (seguir);
		//Se devuelve el valor del numero introducido por el usuario para enviarlo a la funcion main
		return ancho;

	}

	public static double pideAlto() {
		
		//Se crea una variable tipo double para recoger el valor que inserte el usuario para el alto
		double alto = 0;
		//Se crea una variable tipo boolean para saber si se puede seguir para el siguiente paso o no
		boolean seguir = true;
		//Se crea un bucle para empezar a imprimir por pantalla el mensaje para introducir el alto
		do {
			/* 
			 * Se intenta seguir el paso mostrandole el mensaje y 
			 * recogiendo el valor que el usuario quiere introducir para la operacion,
			 * recogiendo el valor que introduce y cambia el booleano a false para salir del bucle
			*/
			try {
				System.out.print("Introduca el alto: ");
				alto = sc.nextDouble();
				seguir = false;
			//Si el usuario introduce un valor erroneo se coge dicho valor y se envia un mensaje de error
			} catch (InputMismatchException e) {
				System.out.println("Tipo de valor erroneo");
			//Y finalmente se manda a limpiar la cadena
			} finally {
				sc.nextLine();
			}
		//Si la variable no es true se sale del bucle
		} while (seguir);
		//Se devuelve el valor del numero introducido por el usuario para enviarlo a la funcion main
		return alto;
	}
}
