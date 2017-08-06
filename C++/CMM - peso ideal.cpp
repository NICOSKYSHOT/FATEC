#include <iostream>
#include <cstdlib>
#include <stdio.h>
#include <math.h>

using namespace std;

int main(){
	
	//Vitor Francisco Lamounier
	
	float k, h, p;
	//h = height (altura)
	//k = sexo
	//p = peso ideal
	
	system("cls");
	cout << "Algoritmo para calculo de peso ideal.\n";
	cout << "Obs: Via formula de Lorentz.\n";
	
	cout << "\nInsira a altura em cm: ";
	cin >> h;
	
	cout << "\nDefina seu sexo:\n1-Masculino;\n2-Feminino;\n";
	cin >> k;
	
	if (k==1){
		p = h-100-((h-150)/4);	
	}else if (k==2){
		p = h-100-((h-150)/2);
	}else{
		cout << "\nERRO\nInsira um dos sexos indicados.\n";
		system("pause");
		return 0;
	}
	
	cout << "\nPeso ideal: " << p << "kg\n";
	system("pause");
	return 0;
}