/* tipping.cpp computes the tipping amount due as a function of cost of food at a restaurant
or with a slight modification services/goods provided ar a hotel or other establishments.

Program designed by M. R. Diaz, Jr. on January 9th, 2018

input: total amount in dollars of food consumed
output: the total bill to be paid including tip(s)
*****************************************************************************************/

#include <iostream>     // cin, cout, <<, >>
#include <string>          // string
using namespace std;

int main()
{
	string message;
	message ="\nThis program calculates the total bill at a restaurant including tip(s).";
	cout << message;
	double amountBeforeTip, tipPercentage, amountWithTip;   // variable declaration
	
	cout << "\nPlease enter the total cost (USD only) of food consumed at restaurant: ";
	cin >> amountBeforeTip;
	cout << "\nPlease enter the expected tipping percentage rate, (e.g. 0.15): ";
	cin >> tipPercentage;
	amountWithTip = (amountBeforeTip + (amountBeforeTip * tipPercentage));
	cout << "\nThe total amount due including tip(s) with an initial bill of "
		<< "$" << amountBeforeTip << " is " << "$" << amountWithTip << endl;
	
	cout << "Thank you for your business. We hope to see you again soon. Good bye.\n";
	system("PAUSE");
	return 0;

	//End of program

}