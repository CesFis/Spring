package piramides.com;

import java.util.Scanner;

public class Piramide {

	public static void main(String[] args) {
		
		
		 Scanner scanner = new Scanner(System.in);
		    
		    System.out.println("Introduce el número de niveles que tendrá la pirámide: ");
		    int numeroNiveles = scanner.nextInt();
		    
		    int numeroPosiciones = numeroNiveles * 2 -1;
		    int posInicial = numeroNiveles;
		    int posFinal = numeroNiveles;
		    
		    
		    for (int i = 0; i < numeroNiveles; i++) {
		      int contador = 1;
		      String resultado = "";
		      
		      for (int j=0; j <= numeroPosiciones; j++) {
		        if ((j < posInicial) || (j > posFinal)) {
		          resultado += " ";
		        } else {
		          if (j < numeroNiveles) {
		            resultado += contador;
		            contador++;
		          } else {
		            resultado += contador;
		            contador--;
		          }
		        }    
		      }
		      System.out.println(resultado);
		      posFinal++;
		      posInicial--;
		    }

	}

}
