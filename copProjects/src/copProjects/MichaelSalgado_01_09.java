package copProjects;

import java.util.Scanner;

//Program that takes in width and height of rectangle and outputs the area and perimeter.
public class MichaelSalgado_01_09 {
	public static void main (String[] args) {
		
		// Boolean to end while loop in case of '0'
		boolean endLoop = false; 
		
		//While loop to restart program 
		while (endLoop == false) {
			
			// User prompt
			Scanner objects = new Scanner(System.in);
			System.out.println("Enter width and height of rectangle, or enter '0' to end");
			
			//Assigning first input
			double width = objects.nextDouble();
			
			//Testing and ending program in case of '0'
			if (width == 0) {
				endLoop = true;
				System.out.println("The program has ended, goodbye :]");
				System.exit(0);
			}
			
			//Assignment of second input
			double height = objects.nextDouble();
			
			//Fallback in case of negative integer
			if (width < 0 || height < 0) {
				System.out.println("Must be a positive number");
			}
			
			//Formula execution
			else {
				double area = width * height, perimeter = 2 * (width + height);
				System.out.println("The area of your rectangle is: " + area);
				System.out.println("The perimeter of your rectangle is: " + perimeter);
				
			}
		}
	}
}