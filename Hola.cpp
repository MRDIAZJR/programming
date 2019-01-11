// hola.cpp greets the user with a personalized message.
// Friday, January 10th 2019
//Written by M. R. Diaz, Jr.

#include <iostream>  //cin, cout, <<, >>
#include <string>   // string
using namespace std;

int main()
{
	string mensaje = "\nThis program greets the user with a personalized message.";
	cout << mensaje;

	string userName;
	cout << "\nPlease enter your first name: ";
	cin >> userName;

	cout << "\nWelcome to the wonderful world of C++ " << userName << "!" << endl;

	system("PAUSE");
	return 0;

	//Fin del programa
}


