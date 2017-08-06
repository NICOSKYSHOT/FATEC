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
	cout << "Celsius para Fahrenheit.\n";
	
	cout << "\nInsira a temperatua em celsius: ";
	cin >> c;

	f = (9*c+160)/5;	

	cout << "\nTemperatura em Celsius: " << c << endl;
	cout << "Temperatura em Fahrenheit: " << f << endl;
	system("pause");
	return 0;
}