package ejercicio.com;

import java.util.Scanner;

import javax.swing.JOptionPane;

public class heightCalculatorArray {

	public static void main(String[] args) {
		Scanner dash = new Scanner(System.in);
		float height;
		float heights[];
		int nElements;
		float sum = 0;
		float average;
		
		nElements = Integer.parseInt(JOptionPane.showInputDialog("Digit the height of the array"));
		heights = new float [nElements];

		for (int i = 0; i < heights.length; i++) {
			System.out.println("Digit the " +i+ "* height");
			heights[i] = dash.nextFloat();
			sum = sum + heights[i];	
		}
		
		System.out.println("");
		System.out.println("The heights are : ");
		
		for (int i = 0; i < heights.length; i++) {
			System.out.println(heights[i]);
		}
		
		
		System.out.println("");
		average = sum/nElements;
		System.out.println("The average of heights is : " + average);
		
		int mayor =0;
		int menor =0;
		
		for (int i = 0; i < heights.length; i++) {
			
			if (heights[i] > average) {
				mayor++;
			} else if (heights[i]<average) {
				
				menor++;

			}
		}
		
		System.out.println("");
		System.out.println("The amount of elemnets mayor that the average are : " + mayor);
		System.out.println("The amount of elements menor that the average are : " + menor);
		
		
		
	}

}
