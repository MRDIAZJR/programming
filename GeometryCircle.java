/* GeometryCircle.java determines whether a point with x & y coordinates lies within a circle with a given radius.
 * 
 * Input: Circle radius, x and y coordinates
 * Output: finds out whether the given point (x, y) is within the circle area.
 * 
 * Written by M. Robert Díaz, Jr. on December 22nd, 2020         Programming is fun!
 ****************************************************************************************************************************/

package simplePrograms;
import java.util.*;        //Gets the Scanner class 

public class GeometryCircle 
{
	public static void main(String[] args) 
	{
		String programGoal = "\nThis program determines whether a point with given coordinates(x, y) lies within a circle\n" +
				"with a radius input by the user. The circle is centered at (0, 0) which is taken as its origin.\n";
		System.out.print(programGoal);
		
		Scanner keyboard = new Scanner(System.in);    // readies system to accept user's input
		System.out.print("\nWhat is the radius of the circle (in meters): ");
		double circleRadius = keyboard.nextDouble();
		
		final double PI = Math.acos(-1);   //approximate value of PI using the inverse trigonometry identity arc cosine(-1)
		
		double circleArea = (PI * Math.pow(circleRadius, 2));
		
		double X0 = 0;            // circle centered at (0, 0)
		double Y0 = 0; 
		double X1, Y1;           // coordinates given by user
		
		System.out.print("\nInput the x and y coordinates to check whether their point is within the circle above: ");
		X1 = keyboard.nextDouble();
		Y1 = keyboard.nextDouble();
		
		double pointDistance = Math.sqrt(Math.pow((X1 - X0), 2) + Math.pow((Y1 - Y0), 2)); // distance between two points on a plane
		
		if (pointDistance <= circleRadius)
		{
			System.out.println("\n\tThe area of the circle with radius " +circleRadius+ " is " +circleArea+ " squared meters.\n\t" +
			"The distance of the point with coordinates ("+X1+ ", " +Y1+") is " +pointDistance+ " m. from the origin.\n\t" +
			"The point with the given coordinates shown above is therefore within the circle.\n\t");
		}
		else 
		{
			System.out.println("\n\tThe point with the give coordinates ("+X1+ ", " +Y1+") is not within the circle with radius " +circleRadius+ " m.\n");
		}
		keyboard.close();       // End of program
	}
}
