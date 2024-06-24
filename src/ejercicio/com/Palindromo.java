package ejercicio.com;

import java.util.Scanner;



public class Palindromo {

	public static void main(String[] args) {
		Scanner teclado = new Scanner(System.in);
		int longitud = 0;
		String cadenaActual;
		String cadenaInvertida = "";
		
		System.out.println("Digite una cadena : ");
		cadenaActual = teclado.nextLine();
		
		longitud = cadenaActual.length();
		
		while (longitud != 0){
			cadenaInvertida += cadenaActual.substring(longitud -1, longitud);
			longitud --;
		
		}
		
		System.out.println(cadenaInvertida);
		
		if(cadenaActual == cadenaInvertida) {
			
			System.out.println("El palindromo es " + cadenaInvertida);
		}else { System.out.println("No es Un palindromo "  + cadenaActual);
		}
	}

}
