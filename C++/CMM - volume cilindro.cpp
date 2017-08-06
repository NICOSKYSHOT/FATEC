#include <iostream>
#include <cstdlib>
#include <stdio.h>
#include <math.h>

using namespace std;

int main(){
	
	//Vitor Francisco Lamounier
	
	float h, r,v;
	//h = height (altura)
	//r = raio
	//v = volume
	
	system("cls");
	cout << "Algoritmo para calcular volume de um cilindro.\n";
	cout << "Lata de oleo no caso.\n";
	
	cout << "\nInsira o raio da base da lata de oleo: ";
	cin >> r;
	
	cout << "\nInsira a altura da lata de oleo: ";
	cin >> h;

	r = pow(r,2);
	v = 3.14159*r*h;	

	cout << "\nRaio da lata: " << r << endl;
	cout << "Altura da lata: " << h << endl;
	
	cout << "\nVolume da lata: " << v << endl;
	
	system("pause");
	return 0;
}