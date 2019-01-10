/*circle.cpp calculates the diameter, circumference and the area of a circle.

Written by: M. R. Diaz, Jr. on July 26th, 2018

Input: radius of circle
Output: the area, circumference and diameter of circle.
***********************************************************************************/

#include <iostream>       // needed for cin, cout, <<, >>
#include <cmath>          // needed for power expression.
#include <string>         // string, message display.

using namespace std;

int main()
{
	string programObjective = "\nThis program computes the area, circumference and diameter of a circle.\n";
	cout << programObjective;

	cout << "Please enter the radius in meters (decimals OK) of circle: ";
	double radius;
	cin >> radius;

	double diameter, circumference, area, PI;  //Variable declaration

	diameter = (2 * radius);
	PI = 3.14159;                                     //Approx value of PI
	circumference = (2 * PI * radius);
	area = (PI * pow(radius, 2 ));

	cout << "\nA circle with a " << radius << " meter(s) radius has an area of " << area << " squared meters\n"
		<< "and a diameter of " << diameter << " meters " << " with a circumference of " << circumference << " meters.\n";

	system("PAUSE");  //console output window remains on
	return 0;
	
	//End of program. 
}

Sample Output:

This program computes the area, circumference and diameter of a circle.
Please enter the radius in meters (decimals OK) of circle: 1.84

A circle with a 1.84 meter(s) radius has an area of 10.6362 squared meters
and a diameter of 3.68 meters  with a circumference of 11.5611 meters.
Press any key to continue . . .
