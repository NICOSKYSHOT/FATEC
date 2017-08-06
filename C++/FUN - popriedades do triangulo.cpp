#include <iostream>
#include <stdlib.h>
#include <math.h>
#include <string.h>

using namespace std;

//Vitor Francisco Lamounier

void calc(int a, int b, int c){
	
	double semip, area, base, alt;
	string tipo;
	
	semip = (a + b + c) /2;
	cout << "Semiperimetro: " << semip << endl;
	
	if (a==b && a==c && b==c){
    tipo = "EQUILATERO";              
    }else if (a!=b && a!=c && b!=c){
    tipo = "ISOCELES";      
    }else{
    tipo = "ESCALENO";      
    } 
    cout << "Tipo de Triangulo: " << tipo << endl;

	area = sqrt( semip*(semip-a)*(semip-b)*(semip-c) );
    cout << "Area do Triangulo: " << area << endl;
    
    if (a > b && a > c){
    base = a;
    }else if (b > a && b > c){
    base = b;
    }else if (c > a && c > b){
    base = c;
    }else{
    base = a;    
    }      
	cout << "Base do Triangulo: " << base << endl;
	
    alt = area/(0.5*base);
	cout << "Altura do Triangulo: " << alt << endl << endl;

	system("pause");
}

void finalizar(){
	exit(0);
}

int inserira(){
	int a;
	
	cout << "\nLado A: ";
	cin >> a;

	return a;
}

int inserirb(){
	int b;
	
	cout << "Lado B: ";
	cin >> b;
	
	return b;
}


int inserirc(){
	int c;
	
	cout << "Lado C: ";
	cin >> c;

	system("pause");
	
	return c;
}

void validar(int a, int b, int c){
	
	if ((a < (b+c)) && (b < (a+c)) && (c < (a+b))){
		calc(a, b, c);
	}else{
		cout << "Os valores destes lados não formam um triangulo" << endl;
	}
	
	system("pause");
}

int menu(){
	int a=0, b=0, c=0, op;
	
	while (op!=3){
	system("cls");
	cout << "Algoritmo para calcular propriedades de um triangulo." << endl
	<< "\nMENU"
	<< "\n1 - Inserir os lados do Triangulo | Valores atuais: A = " << a
	<< " B = " << b << " C = " << c
	<< "\n2 - Fazer os Cálculos do Triangulo"
	<< "\n3 - Sair"
	<< "\nOpção escolhida: ";
	
	cin >> op;
	
	if (op==1){
		a = inserira();
		b = inserirb();
		c = inserirc();
	}else if(op==2){
		validar(a, b, c);
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