package ejercicio.palindromo.com;

public class EsPalindromo {
	
	  public static boolean esPalindromo(String palabra) {
	        palabra = palabra.toLowerCase(); // Convertir a minúsculas para ignorar mayúsculas

	        int izquierda = 0;
	        int derecha = palabra.length() - 1;

	        while (izquierda < derecha) {
	            // Comparar caracteres de los extremos hacia el centro
	            if (palabra.charAt(izquierda) != palabra.charAt(derecha)) {
	                return false; // No es un palíndromo
	            }
	            izquierda++;
	            derecha--;
	        }
	        return true; // Es un palíndromo
	    }
	}


