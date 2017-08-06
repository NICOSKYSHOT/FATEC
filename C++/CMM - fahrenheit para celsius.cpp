#include <iostream>
#include <cstdlib>
#include <stdio.h>
#include <math.h>

using namespace std;

int main(){
	
	//Vitor Francisco Lamounier
	
	float f,c;
	//f = fahrenheit
	//c = celsius
	
	system("cls");
	cout << "Algoritmo para converter temperatura.\n";
	cout << "Fahrenheit para Celsius.\n";
	
	cout << "\nInsira a temperatua em fahrenheit: ";
	cin >> f;

	c = (f-32)*1.8;	

	cout << "\nTemperatura em Fahrenheit: " << f << endl;
	cout << "Temperatura em Celsius: " << c << endl;
	system("pause");
	return 0;
}