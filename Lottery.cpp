/* Lottery.cpp determines whether a lotto player wins a prize.

Written by M. R. Diaz on December 20th, 2020
*******************************************************************************************************************************************/

#include <iostream>    // cin, cout, <<, >>
#include <string>      // string 
#include <ctime>       // for time function
#include <cstdlib>     // for rand and strand functions

using namespace std;

int main()
{
	string progPurpose = "\nThis program randomly generates lottery numbers which are checked to find out winners.\n";
	cout << progPurpose << endl;

	srand(time(0));
	int lottery = (rand() % 100);    // generates lottery numbers

	// prompt the player to enter a guess for the numbers
	cout << "\nEnter your lottery pick (two digits): ";
	int guess;
	cin >> guess;

	int lotteryDigit1 = (lottery / 10);  // get digits from lottery
	int lotteryDigit2 = (lottery % 10);

	int guessDigit1 = (guess / 10);    // get digits from lotto player
	int guessDigit2 = (guess % 10);

	cout << "\nThe lottery number is " << lottery << endl;

	if (guess == lottery)
	{
		cout << "\nExact match: You win $10K! " << endl;
	}
	else if (guessDigit2 == lotteryDigit1 && guessDigit1 == lotteryDigit2)
	{
		cout << "\nMatch all digits: You win $3K " << endl;
	}
	else if (guessDigit1 == lotteryDigit1
		|| guessDigit1 == lotteryDigit2
		|| guessDigit2 == lotteryDigit1
		|| guessDigit2 == lotteryDigit2)
	{

		cout << "\nMatch one digit: You win $1K " << endl;
	}
	else
	{
		cout << "\nSorry, no match.\n" << endl;

		system("pause");   // console output stays on 
		return(0);

			// End of program
	}


}