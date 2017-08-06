#include <iostream>
#include <stdlib.h>
#include <math.h>
#include <conio.h>
#include <locale.h>

using namespace std;

//Vitor Francisco Lamounier

float menu(){
	char op;
	
	cout << "Menu";
	cout << "\nEscolha o Algoritmo que prefere usar\n";
	cout << "\n1 - Área do Triangulo";
	cout << "\n2 - Equação do Segundo Grau\n";
	cout << "\nESC - Sair\n";
	
	op = getch();
	system("PAUSE");
	return op;
	
}

float areatriangulo(){
	system("cls");
	float alt, base, area;
	
	cout << "Insira a altura\n";
	cin >> alt;
	
	cout << "Insira a base\n";
	cin >> base;
	
	area = (base*alt)/2;
	
	
	return area;
}

float segundograu(){
	
	cout << "AHusuhashuuh\n";
	system("PAUSE");
	return 0;
}

int main(){
	
	int x=1;
	char op;
	float area;
	
	setlocale(LC_ALL, "Portuguese");
	
	while (x!=0){
	system("cls");
	op = menu();
	
	if (op==27){
		x = 0;

	}else if (op=='1'){

		area = areatriangulo();
		cout << area;
		
		system("PAUSE");
	}else if (op=='2'){
		segundograu();
		
	}
	
	
	
	}
}