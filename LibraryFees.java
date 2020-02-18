/*LibraryFees.java computes the total amount due to a local library as a function of items borrowed which
 * become overdue. The amount is calculated based on borrower's age and type of item such as a book or a DVD disk.
 * 
 * Input: Time (in days) of item overdue and type of item (e.g.book, DVD, magazine)
 * Output: amount due to the library. Not to exceed established limits based on age and item type. 
 * 
 * Written by M. Robert Diaz for CSC 200 on April 29th, 2019
 * 
 **********************************************************************************************************************/


package homework;

import java.util.*;   //Gets the Scanner class from the library/package java.util

public class LibraryFees 
{

	public static void main(String[] args) 
	{
		String programobjective = "\nThis program computes the the total fee balance associated with overdue items for a local library.\n"
		+"Total fee is calculated considering item borrowed, age of patron & the number of days item is past due.\n"
		+"NOTE: Restrictions and conditions do apply.\n";
		
		System.out.println(programobjective);  //briefly states the program purpose to user
		
		int age, itemType;   //variable declaration
		
		Scanner keyboard = new Scanner(System.in);  //readies system to accept user input
		
		System.out.print("Please input patron's 5-digit library card number followed by ENTER: ");
		int libraryCard = keyboard.nextInt();
		
		System.out.print("\nEnter the patron's age: ");
		age = keyboard.nextInt();
		
		System.out.print("\nPlease specify the item type: (e.g. 1 for Book, 2 for Magazine & 3 for DVD) ");
		itemType = keyboard.nextInt();
		
		if ((itemType <= 0) || (itemType >=4))
		{
			System.out.println("Read stated instructions. Invalid command.");
			System.exit(0);  // not following stated directions causes program to terminate
		}
		else
		
			System.out.print("Please enter the number of days item is overdue: ");
			int daysOverDue = keyboard.nextInt();
		
		double feeBalBook = 0.50 * daysOverDue;     //fees associated with each type of item 
		double feeBalMagazine = 0.25 * daysOverDue;
		double feeBalDVD = 1.50 * daysOverDue;
		
		
		if ((itemType == 1) && (age >= 70))           //conditions for one's golden years.
		{ 
			System.out.print("\nYou have entered library card number " +libraryCard+ " and a book as the item borrowed.\n" 
		+   "The total charge balance is $" +feeBalBook+ "0, however, library fee(s) are waived for senior citizens.");
		}
		else if ((itemType == 2) && (age >= 70))
		{
			System.out.print("\nYou have entered library card number " +libraryCard+ " and a magazine as the item borrowed.\n"
			+ "The total charge balance is $" +feeBalMagazine+ "0, however, library fee(s) are waived for senior citizens.");
		}
		else if ((itemType == 3) && (age >= 70))
		{
			System.out.print("\nYou have entered library card number " +libraryCard+ " and a digital video disk as the item borrowed.\n"
			+ "The total charge balance is $" +feeBalDVD+ "0, however, library fee(s) are waived for senior citizens.");
		}
		else if ((itemType < 1) || (itemType > 3))
		{
			System.out.println("\nPlease follow stated instructions. Invalid command");
			System.exit(0);
		}
		
	
		
		if ((itemType == 1) && (age < 18) && (feeBalBook > 1))    //conditions for juvenile patrons aged 18 or less. 
		{
			System.out.println("\nYou have entered library card number " +libraryCard+ " and a book as the item borrowed.\n"
			+ "The total charge balance is $" +feeBalBook+ "0, however, per library policy, juvenile patrons fee(s) may not exceed $1.00\n"
			+ "regardless of item borrowed or day(s) item is overdue. Please adjust.");
		}
		else if ((itemType == 1) && (age < 10) && (feeBalBook < 1))
		{
			System.out.println("\nYou have entered library card number " +libraryCard+ " and a book as the item borrowed.\n"
			+"The total charge balance is $" +feeBalBook+ " Please collect fee(s) due.");
		}
		
		else if ((itemType == 2) && (age < 18) && (feeBalMagazine > 1))
		{
			System.out.println("\nYou have entered library card number " +libraryCard+ " and a magazine as the item borrowed.\n"
			+"The total charge balance is $" +feeBalMagazine+ "0, however, per library policy, juvenile patrons fee(s) may not exceed $1.00\n"
			+ "regardless of item borrowed or day(s) item is overdue. Please adjust.");
		}
		else if ((itemType == 2) && (age < 18) && (feeBalMagazine < 1))
		{
			System.out.println("\nYou have entered library card number " +libraryCard+ " and a magazine as the item borrowed.\n"
			+"The total charge balance is $" +feeBalMagazine+ " Please collect fee(s) due.");
		}
		
		else if ((itemType == 3) && (age < 18) && (feeBalDVD > 1))
		{
			System.out.println("\nYou have entered library card number " +libraryCard+ " and a digital video disk as the item borrowed.\n"
			+"The total charge balance is $" +feeBalDVD+ "0, however, per library policy, juvenile patrons fee(s) may not exceed $1.00\n"
			+"regardless of item borrowed or day(s) item is overdue. Please adjust. ");
		}
		else if ((itemType == 3) && (age < 18) && (feeBalDVD < 1))
		{
			System.out.println("\nYou have entered library card number " +libraryCard+ " and a digital video disk as the item borrowed.\n"
					+"The total charge balance is $" +feeBalBook+ " Please collect fee(s) due.");
		}
		
		
	
		if ((itemType == 1) && (age >= 18) && (age < 70) && (feeBalBook <= 5))  //general public fees calculator conditions
		{
			System.out.println("\nYou have entered library card number " +libraryCard+ " and a book as the item borrowed.\n"
			+"The total charge balance is $" +feeBalBook+ " Please collect fee(s) due.");	
		}
		else if ((itemType == 1) && (age >= 18) && (age < 70) && (feeBalBook > 5))
		{
			System.out.println("\nYou have entered library card number " +libraryCard+ " and a book as the item borrowed.\n"
			+ "The total charge balance is $" +feeBalBook+ "0, however, per library policy, patrons fee(s) may not exceed $5.00\n"
			+ "regardless of item borrowed or day(s) item is overdue. Please adjust.");
		}
		else if ((itemType == 2) && (age >= 18) && (age < 70) && (feeBalMagazine <= 5))
		{
			System.out.println("\nYou have entered library card number " +libraryCard+ " and a magazine as the item borrowed.\n"
			+"The total charge balance is $" +feeBalMagazine+ " Please collect fee(s) due.");	
		}
		else if ((itemType == 2) && (age >= 18) && (age < 70) && (feeBalMagazine > 5))
		{
			System.out.println("\nYou have entered library card number " +libraryCard+ " and a magazine as the item borrowed.\n"
			+"The total charge balance is $" +feeBalMagazine+ "0, however, per library policy, patrons fee(s) may not exceed $5.00\n"
			+ "regardless of item borrowed or day(s) item is overdue. Please adjust.");
		}
		else if ((itemType == 3) && (age >= 18) && (age < 70) && (feeBalDVD <= 5))
		{
			System.out.println("\nYou have entered library card number " +libraryCard+ " and a digital video disk as the item borrowed.\n"
			+"The total charge balance is $" +feeBalDVD+ " Please collect fee(s) due.");	
		}
		else if ((itemType == 3) && (age >= 18) && (age < 70) && (feeBalDVD > 5))
		{
			System.out.println("\nYou have entered library card number " +libraryCard+ " and a digital video disk as the item borrowed.\n"
			+"The total charge balance is $" +feeBalDVD+ "0, however, per library policy, patrons fee(s) may not exceed $5.00\n"
			+"regardless of item borrowed or day(s) item is overdue. Please adjust. ");
		}
		
		
		
			keyboard.close();  //prevents resource leakage
	}  
	
										                            //End of main, end of program
}
