/*findMileage.cpp computes the distance (in miles) between two cities.
Basic use of multidimensional Arrays and Vectors

Input: City1 & City2, each represented by an integer.
Precondition: for n cities, City1 & City 2 are in the range 0..n-1
Output: the mileage between City1 & City2

January 9th, 2019
**********************************************************************************/

#include <iostream>      //cin, cout, <<, >>
#include <string>       // string
using namespace std;

int main()
{
	const int NUMBER_OF_CITIES = 6;   // initial # of cities. More can be added later
	const int MILEAGE_CHART[NUMBER_OF_CITIES][NUMBER_OF_CITIES]
	= { 
		{ 0, 97, 90, 268, 262, 130 },     //Daytona Beach
	    { 97, 0, 74, 337, 144, 128 },    //Gainesville
	    { 90, 74, 0, 354, 174, 201 },     // Jacksonville
	    { 268, 337, 354, 0, 475, 269 },  // Miami
	    { 262, 144, 174, 475, 0, 238 },   // Tallahassee
	    { 130, 128, 201, 269, 238 0 }    //Tampa
																
	  };
	const string CITY_MENU 
	= "\nTo determine the mileage between two cities, \n"
		"please enter the number of two cities from this menu:\n\n"
		"   0 for Daytona Beach, 1 for Gainesville\n"
		"   2 for Jacksonville,  3 for Miami\n"
		"   4 for Tallahassee,   5 for Tampa\n\n";

	cout << CITY_MENU;
	int city1, city2;   //the two places to determine distance from each other
	cin >> city1 >> city2;   //Readies keyboard to accept user input

	int mileage = MILEAGE_CHART[city1][city2];
	cout << "\nThe mileage between those two cities is " << mileage << " miles.\n";

	system("PAUSE");
	return 0;

	//End of program
}