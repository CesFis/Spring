package piramides.com;

public class PyramidWithArrays {

	public static void main(String[] args) {

		/*
		 * int niveles = 9; // Puedes ajustar el número de niveles según tus necesidades
		 * 
		 * // Bucle para iterar a través de cada nivel for (int i = 1; i <= niveles;
		 * i++) { // Bucle para imprimir los números en cada nivel for (int j = 1; j <=
		 * i; j++) { System.out.print(i); // Imprimir el número correspondiente al nivel
		 * } System.out.println(); // Cambiar de línea después de imprimir una fila }
		 */

		int niveles = 9; // Puedes ajustar el número de niveles según tus necesidades

		// Bucle para iterar a través de cada nivel
		for (int i = 1; i <= niveles; i++) {
			// Bucle para imprimir espacios en blanco antes de cada fila
			for (int j = 0; j < niveles - i; j++) {
				System.out.print(" ");
			}

			// Bucle para imprimir los números en cada nivel
			for (int k = 1; k <= i * 2 - 1; k++) {
				System.out.print(i); // Imprimir el número correspondiente al nivel
			}

			System.out.println(); // Cambiar de línea después de imprimir una fila
		}

	}

}
