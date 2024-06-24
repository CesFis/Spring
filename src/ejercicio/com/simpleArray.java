package ejercicio.com;

import java.util.Iterator;
import java.util.Scanner;

public class simpleArray {

	public static void main(String[] args) {
		Scanner dash = new Scanner(System.in);
		int array[]= new int[5];
		int value;
		
		for(int i=0; i < array.length; i++) {
			System.out.println("Digit an element in the psotion ["+ i +"] : ");
			array[i] = dash.nextInt();
			
			
		}
		
		System.out.println("");
		System.out.println("This is the array");
		for (int i = 0; i < array.length; i++) {
			System.out.println(array[i]);
			
		}
		

	}

}
