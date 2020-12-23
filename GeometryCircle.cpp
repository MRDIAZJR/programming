/* GeometryCircle.cpp determines whether a point is within the area of a circle with a given radius.
* 
* Input: circle radius, X & Y coordinates
* Output: finds out whether the given coordinates lie within the circle.
* 
* Written by M. R. Diaz, Jr. on December 22nd, 2020       Programming is fun!
*********************************************************************************************************************************************/

#include <iostream>   // cin, cout, <<, >>
#include <cmath>      // pow, acos
#include <string>     // string
using namespace std;

int main()
{
	string programGoal = "\n\tThis program determines whether a given set of coordinates (x, y) lie within a given circle"
		"\n\twith a radius input by the user. The circle is centered at (0, 0) which is taken as its origin.\n";
	cout << programGoal << endl;

	const double PI = acos(-1);     // approximate value of PI using basic trig identity arccos(-1)

	cout << "\n\tWhat is the radius of the circle (in meters)? ";
	double circleRadius;
	cin >> circleRadius;        // user input radius

	double circleArea = (PI * pow(circleRadius, 2));   // circle area in squared meters

	double X0 = 0;          //Initial points. This is a circle centered at (0, 0), x & y coordinates
	double Y0 = 0;

	cout << "\n\tInput the x and y coordinates to find out whether the point lies within the circle above(x, y): ";
	double X1, Y1;
	cin >> X1 >> Y1;        // user inputs coordinates

	double pointDistance = sqrt(pow((X1 - X0), 2) + pow((Y1 - Y0), 2));  //distance formula/ Pythagorean Theorem 

	if (pointDistance <= circleRadius)      // distance formula always produces a positive distance
	{
	cout << "\n\tThe area of the circle with radius " << circleRadius << " is " << circleArea << " squared meters.";
	cout << "\n\tDistance of the point with coordinates (" << X1 << ", " << Y1 << ") is " << pointDistance << " m. from the origin.";
	cout << "\n\tThe point with the given coordinates shown above is therefore within the circle.\n\n\t";
	}
	else
	{
	cout << "\n\tThe point with given coordinates (" << X1 << ", " << Y1 << ") is not in the circle with radius " <<circleRadius<< " m.\n\n\t";
	}
	system("pause");
	return(0);
	//                                                       End of program
}