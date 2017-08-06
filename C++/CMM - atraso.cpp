#include "iostream"
#include "math.h"
#include "stdlib.h"

using namespace std;

int main(){
	
	float p, v, t, tx;
	
	cout << "Algoritmo para calcular valor de prestacao em atraso" << endl;
	cout << "Insira o valor original da prestacao: " << endl;
	cin >> v;
	 
	cout << "Insira a porcentagem adicionada com as taxas de atraso: " << endl;
	cin >> t;

	tx = v*(t/100);
	p = v + (v*(t/100));
	
	cout << "O Valor das taxas e igual a: " << tx << endl;	
	cout << "O Valor a pagar nessa prestacao e de: " << p << endl;
	
	system("PAUSE");
	return 0;
}