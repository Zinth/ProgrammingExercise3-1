import java.util.Scanner;

/** Program: Number Guessing Game
* File: GuessingGame.java
* Summary: Ask the user to guess a number between 1 and 10,000, and give hints on if they are high or low.
* Author: Chris Hyde
* Date: October 24, 2017 
**/

public class GuessingGame {

	public static void main(String[] args) {
		// Import Scanner for user input. 
		 Scanner input = new Scanner(System.in);
		 
		 //Basic integer variables. 
		 int numLow = 1, numHigh = 10000, numGuesses = 0, userNum = 0;
		 
		// Random number between 1 and 10,000
		 int myNum = (int)(Math.random() * 10000) + 1; 
		 
		 // While loop that will run until the user guesses the number
		 while(myNum != userNum) {
			 // Increment number of guesses
			 numGuesses++;
			 
			 // Prompt user to enter a number
			 System.out.println("I'm thinking of a number between " +numLow + " and " + numHigh +", what is it? \nEnter you guess:");
			 
			 // Set userNum to input
			 userNum = input.nextInt();
			 
			 // Make sure the guess isn't now the winning number.
			 if(myNum != userNum) {
				//Check to see if the user guessed high or low and tell them.
				 if(myNum > userNum) {
					 //change the value of numLow to show that the number is higher than the user guess.
					 numLow = userNum + 1;
					 System.out.println("Guess higher!");
				 }else {
					 //change the value of numLow to show that the number is lower than the user guess.
					 numHigh = userNum - 1;
					 System.out.println("Guess lower!");
				 }
			 }
			 
		 }
		 
		 // Tell the user they won and how many guesses it took them.
		 System.out.println("You WON!! \nIt took you " + numGuesses + " guesses.");
		 

		
	}

}
