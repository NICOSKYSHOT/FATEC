#include <iostream>
#include <stdlib.h>

using namespace std;

//Vitor Francisco Lamounier

void area(int c){
	
	double area, r;
	r = c/2;
	
	area = 3.14 * (r*r);
	
	cout << "Raio Circulo: " << r << endl
	<< "Area do Circulo: " << area << endl;
	system("pause");
	
}

void finalizar(){
	exit(0);
}

int inserir(){
	int c;
	
	cout << "\nComprimento do Circulo: ";
	cin >> c;
	system("pause");
	
	return c;
}

int menu(){
	int c=0, op;
	
	while (op!=3){
	system("cls");
	cout << "Algoritmo para calcular a area do circulo." << endl
	<< "\nMENU"
	<< "\n1 - Inserir o comprimento do Circulo | Comprimento atual: " << c
	<< "\n2 - Calcular Área com base no comprimento"
	<< "\n3 - Sair"
	<< "\nOpção escolhida: ";
	
	cin >> op;
	
	if (op==1){
		c = inserir();
	}else if(op==2){
		area(c);
	}else if(op==3){
		finalizar();
	}else{
		cout << "Opção inválida" << endl;
		system("pause");
	}
	
	}
}

int main(){
	
	setlocale(LC_ALL, "Portuguese");
	menu();
	
	return 0;
}