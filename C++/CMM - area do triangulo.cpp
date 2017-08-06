#include <iostream>
#include <cstdlib>
#include <stdio.h>
#include <math.h>

using namespace std;

int main(){
	
	//Vitor Francisco Lamounier
	
	float alt, base, area;
	//alt = altura
	
	system("cls");
	cout << "Algoritmo para calculo da area de trangulo.\n";
	
	cout << "\nInsira a base em cm: ";
	cin >> base;
	
	cout << "\nInsira a altura em cm: ";
	cin >> alt;
	
	area = (base*alt)/2;
	
	cout << "\nArea do Triangulo em centimetros quadrados: " << area << "\n";
	system("pause");
	return 0;
}