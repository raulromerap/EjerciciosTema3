package ejercicio01FA;

import java.util.InputMismatchException;
import java.util.Scanner;

/*
 * CASOS DE PRUEBA
 * ENTRADA: 1, 7 + 8 	| ESPERA: 15 					| OBTENIDO: El resultado es: 15.0
 * ENTRADA: 2, 8 - 15 	| ESPERA: -7 					| OBTENIDO: El resultado es: -7.0
 * ENTRADA: 0 				| ESPERA: Salida 				| OBTENIDO: Gracias por usar este programa
 * ENTRADA: 1, h + 7 	| ESPERA: Error 				| OBTENIDO: El tipo de numero debe ser decimal
 * ENTRADA: 4, 7.5 / 9 	| ESPERA: 0.83(Periódico) | OBTENIDO: El resultado es: 0.833333333333333
 */

public class Main {

	//Se crea una varaible tipo escaner para recoger los datos introducidos por el usuario
	static Scanner sc = new Scanner(System.in);

	public static void main(String[] args) {
		
		//Se crea una variable que viene de la clase Operaciones y se registra con el nombre op
		Operaciones op;
		
		//Se crea una variable para la recoger el valor del numero introducido por el usuario para escoger un menú
		int opc;
		//Se crea variables para recoger los dos números introducidos por el usuario y otro para recoger el valor del resultado final
		double num1, num2, resultado = 0;

		//La variable opc se iguala al atributo que muestra el menú
		opc = menu();
		//Se crea una condicion para saber si el usuario a introducido el valor cero, de ser así se muestra un mensaje de despedida
		if (opc == 0) {
			System.out.println("Gracias por usar este programa");
		//En caso de que no sea igual a cero se empieza a hacer los cálculos
		} else {
			//Este registra el primer uso del atributo pideNumero(), mostrando sus mensajes y esperando el valor del usuario
			num1 = pideNumero();
			//Este registra el segundo uso del atributo pideNumero(), haciendo exactamente lo mismo que el primero
			num2 = pideNumero();
			
			//La variable adopta la clase de las operaciones haciendo que este pueda registrar sus llamadas a atributos
			op = new Operaciones(num1, num2);
			
			//Se da de nuevo una condicion, en este caso tipo switch, para saber que tipo de operacion quiere realizar el usuario 
			switch (opc) {
			//En caso de que el usuario haya puesto "1" se llama al atributo de la suma y se iguala a la variable resultado
			case 1 -> resultado = op.suma();
			//En caso de que el usuario haya puesto "2" se llama al atributo de la resta y se iguala a la variable resultado
			case 2 -> resultado = op.resta();
			//En caso de que el usuario haya puesto "3" se llama al atributo de la multiplicacion y se iguala a la variable resultado
			case 3 -> resultado = op.multi();
			//En caso de que el usuario haya puesto "4" se llama al atributo de la division y se iguala a la variable resultado
			case 4 -> resultado = op.div();
			//En caso de que el usuario haya puesto "5" se llama al atributo del maximo y se iguala a la variable resultado
			case 5 -> resultado = op.max();
			//En caso de que el usuario haya puesto "6" se llama al atributo del minimo y se iguala a la variable resultado
			case 6 -> resultado = op.min();
			}
			//Una vez se iguale el resultado se mostrará en pantalla dando como resulado un mensaje con la variable
			System.out.println("El resultado es: " + resultado);
		}
		
		//Se cierra el escaner
		sc.close();
	}

	public static int menu() {
		
		//Se crea una variable para saber que escoge el usuario en el menu
		int opc;
		
		//Se imprime la primera linea para que el usuario pueda ver que el numero 1 es la opcion de suma
		System.out.println("1.Suma");
		//Se imprime la primera linea para que el usuario pueda ver que el numero 2 es la opcion de resta
		System.out.println("2.Resta");
		//Se imprime la primera linea para que el usuario pueda ver que el numero 3 es la opcion de multiplicacion
		System.out.println("3.Multiplicación");
		//Se imprime la primera linea para que el usuario pueda ver que el numero 4 es la opcion de division
		System.out.println("4.División");
		//Se imprime la primera linea para que el usuario pueda ver que el numero 5 es la opcion de maximo
		System.out.println("5.Máximo");
		//Se imprime la primera linea para que el usuario pueda ver que el numero 6 es la opcion de minimo
		System.out.println("6.Mínimo");
		//Se imprime la primera linea para que el usuario pueda ver que el numero 0 es la opcion de salir del programa
		System.out.println("0.Salir");
		
		//Se iguala la variable para recoger el valor introducido por el usuario
		opc = sc.nextInt();
		
		//Se devuelve el valor de la varible del atributo
		return opc;
	}

	public static double pideNumero() {

		//Se crea una variable para introducir el valor del numero que quiere introducir el usuario
		double num = 0;
		//Se crea una variable tipo boolean para saber si se puede seguir para el siguiente paso o no
		boolean sigue = true;
		
		//Se crea un bucle para empezar a imprimir por pantalla el mensaje para introducir un numero
		do {
			/* 
			 * Se intenta seguir el paso mostrandole el mensaje y 
			 * recogiendo el valor que el usuario quiere introducir para la operacion,
			 * recogiendo el valor que introduce y cambia el booleano a false para salir del bucle
			*/
			try {
				System.out.print("Introduzca un número: ");
				num = sc.nextDouble();
				sigue = false;
			//Si el usuario introduce un valor erroneo se coge dicho valor y se envia un mensaje de error
			} catch (InputMismatchException e) {
				System.out.println("El tipo de numero debe ser decimal");
			//Y finalmente se manda a limpiar la cadena
			} finally {
				sc.nextLine();
			}
		//Si la variable no es true se sale del bucle
		} while (sigue);
		//Se devuelve el valor del numero introducido por el usuario para enviarlo a la funcion main
		return num;
	}

}
