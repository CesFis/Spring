package ejercicio.com;

import java.util.Scanner;

public class invertirPalabra {
	
public static void main(String[] args) {
	
	Scanner teclado = new Scanner(System.in);
	int longitud = 0;
	String cadenaActual;
	String cadenaInvertida = "";
	
	System.out.println("Digite una cadena : ");
	cadenaActual = teclado.next();
	
	longitud = cadenaActual.length();
	
	while (longitud != 0){
		cadenaInvertida += cadenaActual.substring(longitud -1, longitud);
		longitud --;
	
	}
	
	System.out.println("La cadena actual es : " + cadenaActual);
	System.out.println("La cadena invertida es : " + cadenaInvertida);
	
}

}
