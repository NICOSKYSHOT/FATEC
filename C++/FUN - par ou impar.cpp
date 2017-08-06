#include <iostream>
#include <stdlib.h>

using namespace std;

//Vitor Francisco Lamounier

void parimpar(int n){
	
	if (n%2==0){
		cout << n << " é um numero par" << endl;
	}else{
		cout << n << " é um numero impar" << endl;
	}
	
	system("pause");
	
}

void finalizar(){
	exit(0);
}

int inserir(){
	int n;
	
	cout << "\nNumero: ";
	cin >> n;
	system("pause");
	
	return n;
}

int menu(){
	int n=0, op;
	
	while (op!=3){
	system("cls");
	cout << "Algoritmo para saber se o número é par ou impar." << endl
	<< "\nMENU"
	<< "\n1 - Inserir Número | Numero atual: " << n
	<< "\n2 - Saber se é par ou impar"
	<< "\n3 - Sair"
	<< "\nOpção escolhida: ";
	
	cin >> op;
	
	if (op==1){
		n = inserir();
	}else if(op==2){
		parimpar(n);
	}else if(op==3){
		finalizar();
	}else{
		cout << "Opção inválida" << endl;
		system("pause");
	}
	
	}
	return 0;
}

int main(){
	
	setlocale(LC_ALL, "Portuguese");
	menu();
	
	return 0;
}