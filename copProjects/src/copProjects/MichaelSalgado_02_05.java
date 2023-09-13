package copProjects;

import java.util.Scanner;

public class MichaelSalgado_02_05 {
	public static void main(String[] args) {
		
		//Assigning boolean to identify when to end loop, which is in case of '0'
		boolean endLoop = false;
		
		//While loop to restart program after each use
		while (endLoop == false) {
			
			//Scanner and prompt for user input
			Scanner input = new Scanner(System.in);
			System.out.println("Enter subtotal or type 0 to exit: ");
			
			//Assigning user input to variable 'subtotal'
			double subtotal = input.nextDouble();
			
			//Error message in case of negative number, restarts program
			if (subtotal < 0) {
				System.out.println("Please enter a positive number");
			}
			
			
			//Ending program in case of '0'. Changes boolean to true
			else if (subtotal == 0) {
				System.out.println("This program has ended, goodbye");
				System.exit(0);
				endLoop = true;		
			}
			
			
			//If no errors occur, follows to regular program
			else {
				
				//Prompt for user input
				System.out.println("Enter gratuity percentage: ");
				
				//Assignment for second variable
				double tip = input.nextDouble();
				
				//Error message in case gratuity is a negative number
				if (tip < 0) {
					System.out.println("Please enter a positive number");
				}
				
				
				//If no errors occur, follows to regular program
				else {
					
					//Converting gratuity to decimal format
					tip /= 100;
					
					//Standard arithmetic for calculating gratuity and final total
					double finalTip = subtotal * tip;
					double finalTotal = subtotal + finalTip;
					
					//Printing results.
					System.out.println("$" + finalTip + " is your gratuity.");
					System.out.println("$" + finalTotal + " is your final total.");
				}
			}
		}
	}
}