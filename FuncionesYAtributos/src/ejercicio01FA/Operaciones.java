package ejercicio01FA;

public class Operaciones {

	//Se crea una variable para igualar posteriormente el valor del la clase main y hacer las operaciones
	double num1, num2;

	public Operaciones() {

	}
	//Se recogen los valores y se iguala a los creados en esta clase
	public Operaciones(double num1, double num2) {
		this.num1 = num1;
		this.num2 = num2;
	}
	//Se crea una funcion para la suma de los numeros
	public double suma() {
		//Se devuelve la suma de los dos numeros
		return num1 + num2;
	}
	//Se crea una funcion para la resta de los numeros
	public double resta() {
		//Se devuelve la resta de los dos numeros
		return num1 - num2;
	}
	//Se crea una funcion para la multiplicacion de los numeros
	public double multi() {
		//Se devuelve la multiplicacion de los dos numeros
		return num1 * num2;
	}
	//Se crea una funcion para la division de los numeros
	public double div() {
		//Se devuelve la divisiom de los dos numeros
		return num1 / num2;
	}
	//Se crea una funcion para calcular el numero mayor de los numeros
	public double max() {
		/*
		 * Se devuelve un ternario que selecciona en caso de que sea 
		 * verdadero la condicion(el primer numero es mayor al segundo)
		 * el primer numero y en caso contrario el segundo numero
		*/
		return (num1 > num2) ? num1 : num2;
	}
	//Se crea una funcion para calcular el numero menor de los numeros
	public double min() {
		/*
		 * Se devuelve un ternario que selecciona en caso de que sea 
		 * verdadero la condicion(el primer numero es menor al segundo)
		 * el primer numero y en caso contrario el segundo numero
		*/
		return (num1 < num2) ? num1 : num2;
	}

}
