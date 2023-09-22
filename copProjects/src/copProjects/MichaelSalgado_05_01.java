package copProjects;

import java.util.Scanner;

public class MichaelSalgado_05_01 {

	public static void main(String[] args) {
		
		//Assigning counter, negative variable for counting negative nums, positive for counting positive nums, and total for counting the total of all nums
		int counter = 0, negative = 0, positive = 0, total = 0;
		
		//Assigning average variable to determine the average of all nums 
		float average = 0;
		
		while (true) {
			
			//While loop to recieve input of 5 total integers
			while (counter != 5) {
				
				//Receiving input for integer
				Scanner input = new Scanner(System.in);
				System.out.println("Enter an integer: ");
				
				//Assigning integer to 'num'
				int num = input.nextInt();
				
				//Determining if num is negative or positive
				if (num < 0) {
					negative ++;
				} else if (num > 0) {
					positive++;
				} else {
					System.out.println("Enter a valid number");
					break;
				}
				
				//Compounding the numbers into the variable 'total'
				total = total + num;
				
				//Counting amount of times loop occurred
				counter++;
				
				//In case that counter is 5, print out the results, and gather the average
				switch (counter) {
				case 5: average = total / 5; System.out.println("Negative is: " + negative + "\nPositive is: " + positive + "\nTotal is: " + total + "\nAverage is: " + average);
				}
			}
			
			Scanner restart = new Scanner(System.in);
			System.out.println("\nRestart program? [0 for no, 1 for yes]: ");
			
			if (restart.nextByte() == 0) {
				System.out.print("Goodbye.");
				break;
			} else {
				counter = 0;
				continue;
			}
		}
	}
}
