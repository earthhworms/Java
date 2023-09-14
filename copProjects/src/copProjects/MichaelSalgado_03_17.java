package copProjects;

import java.util.Scanner;
public class MichaelSalgado_03_17 {
	public static void main(String[] args) {
		
		//Boolean to determine when to end program.
		boolean endLoop = false;
		
		//While loop to restart program until "end" is typed
		while (endLoop != true) {
			
			//Scanner and prompt for user input
			Scanner input = new Scanner(System.in);
			System.out.println("Enter rock, paper, scissors, or end to quit program");
			
			//Assigning user input to string "userHand"
			String userHand = input.nextLine();
			
			//Generating random number between 0 - 2 inclusive
			int random = (int)(Math.random() * 3);
			
			//Assigning random integer to a string
			String opponentHand = "default";
			
			switch (random) {
			case 0: opponentHand = "rock"; break;
			case 1: opponentHand = "paper"; break;
			case 2: opponentHand = "scissors"; break;
			}
			
			//If statement to determine what to do when user chooses rock
			if (userHand.equals("rock")) {
				
				//Method for counting down 
				readySetGo();
				
				//Logic for displaying output
				if (opponentHand.equals("paper")) {
					System.out.println("Sorry! Paper won. Try again: ");
				} else if (opponentHand.equals("rock")) {
					System.out.println("It's a draw! Try again: ");
				} else {
					System.out.println("You won! Opponent chose " + opponentHand);
				}
			}
			
			//If statement to determine what to do when user chooses paper
			else if (userHand.equals("paper")) {
				
				//Method for counting down
				readySetGo();
				
				//Logic for displaying output
				if (opponentHand.equals("scissors")) {
					System.out.println("Sorry, Scissors won. Try again: ");
				} else if (opponentHand.equals("paper")) {
					System.out.println("It's a draw! Try again: ");
				} else {
					System.out.println("You won! Opponent chose " + opponentHand);
				}
			}
			
			//If statement to determine what to do when user chooses scissors
			else if (userHand.equals("scissors")){
				
				//Method for counting down
				readySetGo();
				
				//Logic for displaying output
				if (opponentHand.equals("rock")) {
					System.out.println("Sorry, Rock won. Try again: ");
				} else if (opponentHand.equals("scissors")) {
					System.out.println("It's a draw! Try again: ");
				} else {
					System.out.println("You won! Opponent chose " + opponentHand);
				}
			}
			
			//If statement to determine whether users chooses to end program
			else if (userHand.equals("end")) {
				System.out.println("Thanks for playing! Goodbye");
				endLoop = true;
				System.exit(5);
			}
			
			//If user input is anything other than the 4 choices, displays error
			else {
				System.out.println("Please choose a valid option.");
			}
			
		}	
		
	}

	
	//Method for displaying count down
	private static void readySetGo() {
		
		//Starting counter at 0
		int counter = 0;
		
		//When counter is at 4, count down ends
		while (counter != 4) {
			
			//Delaying the program for 650 milliseconds
			try {
				Thread.sleep(650);
			} catch (InterruptedException e) {
				e.printStackTrace();
			}
			
			switch (counter) {
			case 0: System.out.println("Rock..."); break;
			case 1: System.out.println("Paper..."); break;
			case 2: System.out.println("Scissors..."); break;
			case 3: System.out.println("Shoot!"); break;
			}
			
			counter += 1;
		}
		
	}

}