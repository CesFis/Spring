package ejercicio.com;

import java.util.Scanner;

import javax.swing.JOptionPane;

public class growingOrDecreasingArray {
public static void main(String[] args) {
	
	Scanner dash = new Scanner(System.in);
	
	int array[];
	int nElements;
	boolean growing = false;
	boolean decreasing = false;
	boolean isNegative = false;
	
	nElements = Integer.parseInt(JOptionPane.showInputDialog("Digit the correct amount for the array"));
	
	if (nElements <0 ) {
		System.out.println("\n Don't exist an array with negative height");
		System.exit(0);
	}
	
	array = new int [nElements];
	
	//full the array
	
	do {
		System.out.println("");
		for (int i = 0; i < array.length; i++) {
			System.out.println("Digit an element in the position : " + i + "");
		}
		
		//trought the array with an cycle for
		
		for (int i = 0; i < array.length; i++) {
			
			if(array [i]<0) {
				
				isNegative = true;
				
				break;
			}else {
				
				isNegative = false;
			}
			
			if (isNegative == true) {
				System.out.println("\n please retur digit your array, since it contains negative numbers");
			}
			
			
		}
		
		
	} while (isNegative == true );
	
	
	for(int i =0; i <(nElements - 1) ;i++) {
		
		if (array[i] < array[i + 1]) {
			growing = true;
		}else if(array[i] > array[i + 1]) {
			
			decreasing = true;
		}
	}
	
	if (growing == true && decreasing == false) {
		
		System.out.println("\n The array is growing form");
	}
	else if (growing == false && decreasing == true) {
		
		System.out.println("\n The array is decreasing form");
	}else if (growing == true && decreasing == true) {
		System.out.println("\n The arrangement is desordered");
	}
	else {
		System.out.println("\n The arrangement is equals");
	}
	
}
	
}
