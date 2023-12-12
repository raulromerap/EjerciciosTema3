package ejercicio04FA;

public class Cilindro {
	// Se crea una variable para igualar posteriormente el valor del la clase main y hacer las operaciones
	double radioBase, altura;
	
	public Cilindro() {
		
	}
	// Se recogen los valores y se iguala a los creados en esta clase
	public Cilindro(double radioBase, double altura) {
		
		this.radioBase = radioBase;
		this.altura = altura;
		
	}
	// Se crea una funcion para hacer el calculo del volumen
	public double volumen() {
		//Se devuelve el valor de la operacion de radio al cuadrado por la altura
		return Math.pow(radioBase, 2) * altura;
	}
	// Se crea una funcion para hacer el calculo del area
	public double area() {
		//Se devuelve el valor de la operacion de dos por radio por, entre parentesis, altura mas el radio
		return 2 * radioBase * (altura + radioBase);
	}
	
}
