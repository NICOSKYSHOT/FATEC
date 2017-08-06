#include "iostream"
#include "stdlib.h"
#include "math.h"

using namespace std;

int main(){
	
	float a, b, c, d, total, dist;
	
	cout << "Algoritmo que faz soma e multiplicacao distributiva" << endl;
	cout << "Insira o Valor de A: " << endl;
	cin >> a;
	
	cout << "Insira o Valor de B: " << endl;
	cin >> b;
	
	cout << "Insira o Valor de C: " << endl;
	cin >> c;
	
	cout << "Insira o Valor de D: " << endl;
	cin >> d;
	
	total = a*b*c*d;
	dist = (a*b)+(a*c)+(a*d)+(b*c)+(b*d)+(c*d);
	
	cout << "\nValor da Multiplicacao Comum: " << total << endl << endl;
	cout << "Valor da Multiplicacao Distributiva: " << dist << endl;
}