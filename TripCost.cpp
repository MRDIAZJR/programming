/*TripCost.cpp calculates the total cost and miles per gallon of a vehicle, based on the miles traveled,
fuel consumed, cost per gallon of fuel, and operating cost per mile.

Input: The total miles traveled, toatl fuel consumed, unit cost of the fuel and operating cost per mile.
Precondition: miles, gallonsOfFuel, unitFuelCost and unitOperatingCost are all positive.
Output: The miles per gallon, total cost of the trip and the cost per mile.

Written by M. R. D., Jr. on February the 5th, 2020. NVCC Alumnus
**********************************************************************************************************/

#include <iostream>  // cin, cout, <<, >>, fixed, showpoint
#include <string>      // string
#include <iomanip>     // setw(), setprecision()
#include <cassert>        //ensures positive values

using namespace std;
int main()
{
	string programPurpose = "\nThis program calculates the overall cost of operating a vehicle based on distance traveled,\n"
		"cost of fuel per gallon, and vehicle operation cost per mile covered.\n";
	cout << programPurpose << endl;

	const int WIDTH = 7;                  // width of output field
	cout << "\nEnter:\n\ttotal miles traveled,"
		<< "\n\tgallons of fuel used,"
		<< "\n\ttotal cost per gallon of the fuel, and"
		<< "\n\toperating cost per mile."
		<< "\n\t---> ";

	double miles, gallonsOfFuel, unitFuelCost, unitOperatingCost;  // total miles traveled, total gallons used, fuel cost
	cin >> miles >> gallonsOfFuel >> unitFuelCost >> unitOperatingCost;    // operating cost

	assert(miles > 0 && gallonsOfFuel > 0 && unitFuelCost > 0 && unitOperatingCost > 0);

	double milesPerGallon = (miles / gallonsOfFuel);   // average gasoline consumption ratio
	double fuelCost = (unitFuelCost * gallonsOfFuel);
	double operatingCost = (unitOperatingCost * miles);
	double totalTripCost = (fuelCost + operatingCost);     //overall total cost. 
	double costPerMile = (totalTripCost / miles);

	cout << showpoint << fixed << setprecision(2)
		<< "\n\tMiles per gallon: " << setw(WIDTH) << milesPerGallon
		<< "\n\tTotal cost: $" << setw(WIDTH) << totalTripCost
		<< "\n\tCost per mile: $" << setw(WIDTH) << costPerMile
		<< endl << endl;

	system("pause");    // prevents output screen from closing automaticaly. User closes it manually when done.

	return(0);   // end of program
}
