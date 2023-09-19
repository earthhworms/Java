package copProjects;

import java.util.Scanner;


//Program that takes a character and displays whether character is vowel or consonant

public class vowelOrConsonant {
	public static void main (String[] args) {
		
		boolean endLoop = false;
		
		//While loop to restart the program
		while (endLoop != true) {
			
			//Prompting for input
			Scanner input = new Scanner(System.in);
			System.out.println("Enter a letter. Or type 'end'");
			
			//Assigning input to character
			String ch = input.nextLine();
			char letter = ch.charAt(0);
			
			//Determining length of string
			int lengthOfString = ch.length();
			
			//Checking to see if the string 'ch' is equal to "end", thus ending the program.
			if (ch.equals("end")) {
				System.out.println("The program has ended.");
				System.exit(0);
				endLoop = true;
			}
			
			//If length of initial string is more than one character, error will display
			else if (lengthOfString > 1) {
				System.out.println("Please enter a single character. \n");
			}
			
			//Checking whether or not the character entered is a letter from a-z lowercase OR A-Z uppercase.
			else if ((letter >= 'a' && letter <= 'z') || (letter >= 'A' && letter <= 'Z')) {
				
				//Determining whether the letter is a vowel or consonant
				switch (letter) {
				case 'A', 'E', 'I', 'O', 'U', 'a', 'e', 'i', 'o', 'u': System.out.println(letter + " is a vowel \n"); break;
				default: System.out.println(letter + " is a consonant. \n"); break;
				}
				} 
			
			//Checking whether the character entered is a number, thus deeming it invalid
			else {
					System.out.println(letter + " is an invalid input. \n");
			}	
		}
	}
}
