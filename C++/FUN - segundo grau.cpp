#include <iostream>
#include <stdlib.h>
#include <math.h>

using namespace std;

//Vitor Francisco Lamounier

void calc(int a, int b, int c){
	
	double d=0, rd=0, x1=0, x2=0;
	d = (b*b) - (4*a*c);
	cout << "Delta = " << d << endl;
	
	if (d>0){
		
		rd = sqrt(d);
		cout << "Raiz do Delta = " << rd << endl;
		
		b = -b;
		x1 = (b + rd) / (2*a);
		x2 = (b - rd) / (2*a);
		
		cout << "Raizes da Função:" << endl 
		<< "X1 = " << x1 << endl
		<< "X2 = " << x2 << endl;	
			
	}else{
		
		cout << "Delta Negativo"
		<< " não será possível realizar os cálculos" << endl;	
	}

	system("pause");
}

void finalizar(){
	exit(0);
}

int inserira(){
	int a;
	
	cout << "\nValor A: ";
	cin >> a;

	return a;
}

int inserirb(){
	int b;
	
	cout << "Valor B: ";
	cin >> b;
	
	return b;
}

int inserirc(){
	int c;
	
	cout << "Valor C: ";
	cin >> c;

	system("pause");
	
	return c;
}

int menu(){
	int a=0, b=0, c=0, op;
	
	while (op!=3){
	system("cls");
	cout << "Algoritmo para calcular uma equação do segundo grau." << endl
	<< "\nMENU"
	<< "\n1 - Inserir Valores para Equação | Valores atuais: a = " << a
	<< " b = " << b << " c = " << c
	<< "\n2 - Calcular a Equação"
	<< "\n3 - Sair"
	<< "\nOpção escolhida: ";
	
	cin >> op;
	
	if (op==1){
		a = inserira();
		b = inserirb();
		c = inserirc();
	}else if(op==2){
		calc(a, b, c);
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