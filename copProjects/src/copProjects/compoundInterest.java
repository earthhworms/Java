package copProjects;

import java.util.Scanner;

public class compoundInterest {

	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		
		System.out.println("Enter APY: ");
		float APY = input.nextFloat();
		APY = (APY / 100) / 12;
		
		
		boolean endLoop = false;
		while (endLoop == false) {
			
			System.out.println("Enter the monthly saving amount, or '0 to end: ");
			float monthlySavingAmnt = input.nextFloat();
			
			if (monthlySavingAmnt == 0) {
				System.out.println("The system has ended, goodbye.");
				endLoop = true;
				System.exit(0);
			}
			
			System.out.println("Enter amount of months: ");
			float amntOfMonths = input.nextFloat();
			
			int counter = 1;
			
			float compoundSavingAmnt = monthlySavingAmnt * (1 + APY);
			System.out.println("After the " + counter + "st month, the account value is $" + compoundSavingAmnt);
			
			while (counter != (amntOfMonths)) {
				counter += 1;
				
				compoundSavingAmnt = (monthlySavingAmnt + compoundSavingAmnt) * (1 + APY);
			
				System.out.println("After the " + counter + "st month, the account value is $" + compoundSavingAmnt); 
			}
			
		}
	}
}