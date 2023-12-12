package ejercicio03FA;

public class Circulo {
	// Se crea una variable para igualar posteriormente el valor del la clase main y hacer las operaciones
	double radio;
	
	// Se recogen los valores y se iguala a los creados en esta clase
	public Circulo(double radio) {
		this.radio = radio;
	}
	// Se crea una funcion para hacer el calculo de la circunferencia
	public double circunferencia() {
		//Se devuelve el valor de la operacion de 2 por PI por el radio
		return 2 * Math.PI * radio;
	}
	// Se crea una funcion para hacer el calculo del area
	public double area() {
		//Se devuelve el valor de la operacion de PI por radio al cuadrado
		return Math.PI * (Math.pow(radio, 2));
	}

}
