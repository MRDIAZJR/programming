/*Homerenovationhw.java calculates the cost involved for a home improvement project. The  actual cost depends
 * on total area of floor and wall to be covered and painted respectively and also considering any furniture inside the room.
 * 
 * Input: length, width, height of the room
 * Output: total area in squared feet to be covered and painted. Cost ($) associated per squared foot.
 * 
 * Written by M. R. Diaz, Jr. on April 20th, 2019
 ***************************************************************************************************************/

package homework;

import java.util.Scanner; //Gets the Scanner class from the package (library) java.util

public class Homerenovationhw 
{
	public static void main(String[] args) 
	{
		String homeimprovement = "\nThis program computes the total cost to renovate a room in terms of flooring and painting.\n"
	    +"The total cost depends upon the area of both floor and wall to be covered and painted respectively.\n"
	    +"Please follow the stated pattern in all measurements, also be certain to input all measurements in feet for accuracy.";
		System.out.println(homeimprovement);
		
		//following a pattern of length, width and height minimizes the likelihood of errors. Consistency is paramount.
		
		double roomLength, roomWidth, roomHeight;                          //1st set of variable declaration.  
		double doorWidth, doorHeight;
		double window1Width, window1Height, window2Width, window2Height;
		double bookshelfLength, bookshelfWidth, bookshelfHeight;
		double floorLength, floorWidth;
		
		Scanner keyboard = new Scanner(System.in);     //readies system to accept input from user.
		
		System.out.print("\nPlease enter the dimensions (separated by space) of the room. (L, W. H) "); 
		roomLength = keyboard.nextDouble();
		roomWidth = keyboard.nextDouble();
		roomHeight = keyboard.nextDouble();
		
		System.out.println("Note: the room's length and width also indicate the floor measurements.");
		floorLength = roomLength;
		floorWidth = roomWidth;          //dealing with a square room. 
		
		System.out.print("\nInput the dimensions of the door, width and height separated by space. (W, H) ");
		doorWidth = keyboard.nextDouble();
		doorHeight = keyboard.nextDouble();
		
		System.out.print("Likewise, please input the dimensions of the window(s). width and height for each: (W, H) ");
		window1Width = keyboard.nextDouble();
		window1Height = keyboard.nextDouble();
		window2Width = keyboard.nextDouble();
		window2Height = keyboard.nextDouble();
		
		//for the following measurements, let the bookshelf stated length equal its width and its deepness its length instead
		
		System.out.print("Enter the length, width and height of the bookshelf inside the room: (L, W. H) ");
		bookshelfLength = keyboard.nextDouble();
		bookshelfWidth = keyboard.nextDouble();
		bookshelfHeight = keyboard.nextDouble();
		
		double doorArea = (doorWidth * doorHeight);
		double window1Area = (window1Width * window1Height);
		double window2Area = (window2Width * window2Height);   //Window dimensions may or may not be the same.
		double floorArea = (floorLength * floorWidth);
		double bookshelfWallArea = (bookshelfWidth * bookshelfHeight);     //variable declaration to give fluidity to the program
		double bookshelfFloorArea = (bookshelfLength * bookshelfWidth);
		double netFloorArea = (floorArea - bookshelfFloorArea);   //shows the actual area of the floor to cover
		
		double paintArea = ((2 * roomLength * roomHeight) + (2 * roomWidth * roomHeight));
		double costOfPainting, paintRate;
		double paintCovered = (paintArea - doorArea - window1Area - window2Area - bookshelfWallArea);
		
		System.out.println("\nThe room has a wall area of " +paintCovered+ " squared feet.");
		System.out.print("\nPlease specify the rate charged (US Dollars, cents OK) per square foot to paint the wall: ");
		paintRate = keyboard.nextDouble();
		costOfPainting = (paintCovered * paintRate);
		
		System.out.println("The cost to paint the room is " +costOfPainting+ " dollars.\n");  //cost associated with painting only.
		
		System.out.println("The room has a floor area of " +floorArea+ " squared feet, however, the bookshelf takes up some space.\n" 
		+"Considering the area where the bookshelf stands, the total floor area to cover is only " +netFloorArea+ " squared feet.");
		
		
		
		// floor cost
		System.out.println("\nHaving the square footage of the room, the program's now ready to compute the total cost to cover the floor.\n"
			+ "This cost is a function of both type of flooring selected and the area to be covered.");
		
		System.out.print("\nWhat is the custome's budget to floor the room? ");
		double budget = keyboard.nextDouble();
		
		System.out.print("What is the cost per square foot for tile? ");
		double tilingCost = keyboard.nextDouble();
		
		System.out.print("What is the cost per square foot for hardwood? ");
		double woodCovering = keyboard.nextDouble();
		
		System.out.print("What is the cost per square foot for carpet? ");
		double carpeting = keyboard.nextDouble();
		
		System.out.print("What is the cost per square foot for linoleum? ");
		double linoCovering = keyboard.nextDouble();
		
		
		
		double tileFloorCost = netFloorArea * tilingCost;
		double woodFloorCost = netFloorArea * woodCovering;             //options available for different budgets
		double carpetFloorCost = netFloorArea * carpeting;
		double linoleumFloorCost = netFloorArea * linoCovering;  
		
	
		
		
		System.out.print("\nSelect one of the following options: 0 - no preference, 1 - tile, 2 - hardwood, 3 - carpet, 4 - linoleum ");
		int selectionOption = keyboard.nextInt();
		
		if ((selectionOption < 0) || (selectionOption > 4))
		{
			System.out.println("Please follow stated instructions. Invalid command.");
			System.exit(0);   // not following given instructions terminates the program.
		}
		
		
		if((selectionOption == 0) && (tileFloorCost <= budget))    //undecided customers or with not preference at all
		{
			System.out.println("\nCustomer budget is sufficient to cover the room's floor with tile. The cost is $ "+tileFloorCost+ 
					"\nPlease advice.");
		}
		
		else if ((selectionOption == 0) && (woodFloorCost <= budget))
		{
			System.out.println("\nCustomer's budget is sufficient to cover the room's floor with hardwood. The cost is $ " +woodFloorCost+ 
					"\nPlease advice.");
		}
		
		else if ((selectionOption == 0) && (carpetFloorCost <= budget))
		{
			System.out.println("\nCustomer's budget is sufficient to cover the room's floor with carpet. The cost is $" +carpetFloorCost+
					"\nPlease advice.");
		}
		
		else if ((selectionOption == 0) && (linoleumFloorCost <= budget))
		{
			System.out.println("\nCustomer's budget is sufficient to cover the room's floor with linoleum. The cost is $" +linoleumFloorCost+ 
					"\nPlease advice.");
		}
		else if ((selectionOption == 0) && (tileFloorCost > budget) && (woodFloorCost > budget) && (carpetFloorCost > budget) && (linoleumFloorCost > budget))
		{
			System.out.println("\nUnable to assist customer. Budget fails to meet the minimum cost to cover the room's floor.\n"
			+"The most affordable option available is linoleum which costs $" +linoleumFloorCost+ " Please advice.");
		}
		
		
		
		
		
		if ((selectionOption == 1) && (budget >= tileFloorCost))     // tile floor option
		{
			System.out.println("\nCustomer has selected tile to cover the room's floor. This option costs $" +tileFloorCost+ " Please advice.");
		}
		else if ((selectionOption == 1) && (budget < tileFloorCost) && (budget >= woodFloorCost))
		{
			System.out.println("\nTile flooring is beyond the custome's budget. This option costs $" +tileFloorCost+ 
			"\nOne alternate option however is hardwood flooring which costs only $" +woodFloorCost+ " Please advice.");
		}
		else if ((selectionOption == 1) && (budget < tileFloorCost) && (budget >= carpetFloorCost))
		{
			System.out.println("\nTile flooring is beyond the customer's budget. This option costs $" +tileFloorCost+
			"\nOne alternate option however is carpeting the room which costs only $" +carpetFloorCost+ " Please advice.");
		}
		else if ((selectionOption == 1) && (budget < tileFloorCost) && (budget >= linoleumFloorCost))
		{
			System.out.println("\nTile flooring is beyond the customer's budget. This option costs $" +tileFloorCost+
			"\nOne alternate option however is linoleum floor covering which costs only $" +linoleumFloorCost+ " Please advice.");
		}
		else if ((selectionOption == 1) && (budget < tileFloorCost) && (budget < linoleumFloorCost))
		{
			System.out.println("\nTile flooring is beyond the customer's budget. This option costs $" +tileFloorCost+
					"\nUnfortunately, we are unable to assist the customer at this time. Budget fails to meet mimimum cost. Please advice.");
		}
		
		
		
		
		
		if ((selectionOption == 2) && (budget >= woodFloorCost))         //Hard wood floor option
		{
			System.out.println("\nCustomer has selected hardwood to cover the room's floor. This option costs $" +woodFloorCost+ " Please advice.");
		}
		else if ((selectionOption == 2) && (budget < woodFloorCost) && (budget >= carpetFloorCost))
		{
			System.out.println("\nHarwood flooring is beyond the customer's budget. This option costs $" +woodFloorCost+ 
			"\nOne alternate option however is carpeting the room which costs only $" +carpetFloorCost+ " Please advice.");
		}
		else if ((selectionOption == 2) && (budget < woodFloorCost) && (budget >= linoleumFloorCost))
		{
			System.out.println("\nHradwood flooring is beyond the customer's budget. This option costs $" +woodFloorCost+
			"\nOne alternate option however is linoleum floor covering which costs only $" +linoleumFloorCost+ " Please advice.");
		}
		else if ((selectionOption == 2) && (budget < woodFloorCost) && (budget < linoleumFloorCost))
		{
			System.out.println("\nHardwood flooring is beyond the customer's budget. This option costs $" +woodFloorCost+
			"\nUnfortunately, we are unable to assist the customer at this time. Budget fails to meet minimum cost. Please advice.");
		}
		
		
		
		if ((selectionOption == 3) && (budget >= carpetFloorCost))         // carpet floor option
		{
			System.out.println("Customer has selected carpet to cover the room's floor. This option costs $" +carpetFloorCost+ " Please advice.");
		}
		else if ((selectionOption == 3) && (budget < carpetFloorCost) && (budget >= linoleumFloorCost))
		{
			System.out.println("\nCarpet flooring is beyond the customer's budget. This option costs $" +carpetFloorCost+
					"\nOne alternate option however is linoleum floor covering which costs only $" +linoleumFloorCost+ " Please advice.");
		}
		else if ((selectionOption == 3) && (budget < carpetFloorCost) && (budget < linoleumFloorCost))
		{
			System.out.println("\nCarpet flooring is beyond the customer's budget. This option costs $" +carpetFloorCost+
			"\nUnfortunately, we are unable to assist the customer at this time. Budget fails to meet minimum cost. Please advice.");
		}
		
		
		if((selectionOption == 4) && (budget >= linoleumFloorCost))       // linoleum floor option or insufficient budget to proceed 
		{
			System.out.println("Customer has selected linoleum to cover the room's floor. This option costs $" +linoleumFloorCost+ " Please advice.");
		}
		else if ((selectionOption == 4) && (budget < linoleumFloorCost))
		{
			System.out.println("\nUnable to assist customer. Budget is insufficient to cover the cost $" +linoleumFloorCost+ 
					"\nor any other option available. Please advice.");
		}	
			
				
		
		keyboard.close();  //prevents resource leakage  
		
     }           //end of method

                                                            //End of program
}
		
		
	