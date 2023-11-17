package ejercicio04;

public class Vocales {

	static boolean vocal (String letra, boolean vocal) {
		
		switch(letra) {
			
			case "a" -> vocal = true;
			case "e" -> vocal = true;
			case "i" -> vocal = true;
			case "o" -> vocal = true;
			case "u" -> vocal = true;
			default -> vocal = false;
		}
		return vocal;
	}
	
}
