/* CircleArea.cpp computes the area of a circle with a known radius.

Input: the radius of a circle in meters
Output: Circle's area in squared meters.

Program written by M. R. Diaz, Jr. on February 25th, 2020         NVCC Alumnus
***************************************************************************************************************/

#include <iostream>      // cin, cout, <<, >> 
#include <string>        // string
#include <cmath>         // required for pow()

using namespace std;
int main()
{
	string programGoal = "\n\tThis program computes the area of a circle with known radius in meters.";
	cout << programGoal << endl;

	cout << "\n\tEnter the radius of a circle in meters: ";
	double circleRadius;
	cin >> circleRadius;         // radius of circle to compute its area

	if (circleRadius < 0)
	{
		cout << "\n\tOnly non-negative values accepted. Please re-run the program again.\n\t";
	}
	else
	{
		const double PI = acos(-1.0);    // approximate value of PI as a function of cosine inverse

		double circleArea = (PI * pow(circleRadius, 2));    // basic formula to compute area

		cout << "\n\tThe area of the circle with radius " << circleRadius << " meters is " << circleArea << " meters squared.\n\t";

	}
		system("pause");
		return(0);

}													  // end of program