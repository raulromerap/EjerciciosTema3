package ejercicio02FA;

public class Rectangulo {

	// Se crea una variable para igualar posteriormente el valor del la clase main y hacer las operaciones
	double alto, ancho;

	public Rectangulo() {

	}

	// Se recogen los valores y se iguala a los creados en esta clase
	public Rectangulo(double alto, double ancho) {

		this.alto = alto;
		this.ancho = ancho;
	}

	// Se crea una funcion para hacer el calculo del perimetro
	public double perimetro() {
		//Se devuelve el alto por 2 mas el ancho por dos
		return (alto * 2) + (ancho * 2);
	}
	// Se crea una funcion para hacer el calculo del area
	public double area() {
		//Se devuelve el alto por el ancho
		return alto * ancho;
	}
}
