package ejercicio.palindromo.com;

import java.util.Scanner;

public class MainPalindromo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		/* Scanner scanner = new Scanner(System.in);

	        System.out.print("Ingrese una palabra: ");
	        String palabra = scanner.nextLine();

	        if (esPalindromo(palabra)) {
	            System.out.println("'" + palabra + "' es un palíndromo.");
	        } else {
	            System.out.println("'" + palabra + "' no es un palíndromo.");
	        }

	        scanner.close();
	    }

	    // Función para verificar si una palabra es un palíndromo
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
	    }*/
		Scanner scanner = new Scanner(System.in);
	     System.out.print("Ingrese una frase: ");
	        String frase = scanner.nextLine();

	        if (esPalindromo(frase)) {
	            System.out.println("'" + frase + "' es un palíndromo.");
	        } else {
	            System.out.println("'" + frase + "' no es un palíndromo.");
	        }

	        scanner.close();
	    }

	    // Función para verificar si una frase es un palíndromo
	    public static boolean esPalindromo(String frase) {
	        // Eliminar espacios y convertir a minúsculas para ignorar mayúsculas y espacios
	        String fraseFormateada = frase.replaceAll("\\s+", "").toLowerCase();

	        int izquierda = 0;
	        int derecha = fraseFormateada.length() - 1;

	        while (izquierda < derecha) {
	            // Comparar caracteres de los extremos hacia el centro
	            if (fraseFormateada.charAt(izquierda) != fraseFormateada.charAt(derecha)) {
	                return false; // No es un palíndromo
	            }
	            izquierda++;
	            derecha--;
	        }
	        return true; // Es un palíndromo

}}

