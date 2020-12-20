/*Lottery.java determines whether a lottery player wins a prize.
 * 
 * Input: User chooses digits to play
 * Output: Program determines whether a prize is won.
 * 
 * December 19th, 2020  
 *************************************************************************************************/

package simplePrograms;

import java.util.*;   //Gets the Scanner class from the package (library) java.util

public class Lottery 
{
	public static void main(String[] args) 
	{
		String progPurpose = "\nThis program ramdomly generates lottery numbers which are checked to find out winners.\n";
		System.out.println(progPurpose);
		
		int lottery = (int)(Math.random() * 100);   //generates random numbers 
		
		Scanner keyboard = new Scanner(System.in);  // user guesses numbers to play
		System.out.print("\nEnter your lottery pick (two digits): ");
		int guess = keyboard.nextInt();
		
		int lotteryDigit1 = (lottery / 10);  // get digits from lottery
		int lotteryDigit2 = (lottery % 10);
		
		int guessDigit1 = (guess / 10);      // digits from user
		int guessDigit2 = (guess % 10);
		
		System.out.println("\nThe lottery number is " +lottery);
		
		if (lottery == guess)      // criteria to win any prize
		System.out.print("Exact match: You win $10K!");
		else if (guessDigit2 == lotteryDigit1 && guessDigit2 == lotteryDigit2)
		System.out.println("Match all digits: You win $3K!");
		else if (guessDigit1 == lotteryDigit1 || guessDigit1 == lotteryDigit2 
				|| guessDigit2 == lotteryDigit1 || guessDigit2 == lotteryDigit2)
		System.out.println("You match one digit: You win $1K!");
		else
		System.out.println("\nSorry, no match.");
		
		keyboard.close(); //prevents resource leakage
		
		// End of program
	}

}
