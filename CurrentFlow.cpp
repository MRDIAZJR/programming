/*CurrentFlow.cpp computes the current output (in amperes) of an AC circuit element. 

Input: Voltage, Resistance, Frequency, Inductance and Capactance
Output: Current output flow in amperes.

Written by M. R. D., Jr. on February 22nd, 2020        NVCC Alumnus 
*********************************************************************************************************/

#include <iostream>     // cin, cout, <<, >>
#include <cmath>        // pow(), sqrt()
#include <string>       // string
#include <iomanip>      // exit()

using namespace std;

int main()
{
	string progPurpose = "\nThis program computes the current output of a circuit element with known voltage (E), frequency (f),\n"
	"capacitance (C) and inductance (H). Output in amperes. (A).\n";
	cout << progPurpose;

	const double PI = 3.14159;     // approximate magnitude for PI
	
	//voltage (E in volts), resistance (R in ohms), inductance (L in henries), capacitance (C in fards) 
	//and frequency (F in hertz)
	double voltage, resistance, inductance, capacitance, frequency; 
   //current (I in amperes) as output

	cout << "\n\tEnter circuit's voltage: ";
	cin >> voltage;
	cout << "\n\tEnter circuit's resistance: ";
	cin >> resistance;
	cout << "\n\tEnter circuit's inductance: ";
	cin >> inductance;
	cout << "\n\tEnter circuit's capacitance: ";
	cin >> capacitance;
	cout << "\n\tEnter circuit's frequency: ";
	cin >> frequency;

	double E, R, f, L, C;   // abreviations to make current formula easier to read
	
	E = voltage;
	R = resistance;
	L = inductance;
	C = capacitance;
	f = frequency; 

	double current = ( E / (sqrt(pow(R, 2)) + pow((2 * PI * f * L) - (1 / (2 * PI * f * C)), 2)) ); //output formula

		cout << "\n\tThe current output of the circuit is " << current << " ampers.\n\n\t";
		system("pause");   // prevents output screen to close automatically.

		return(0);

}