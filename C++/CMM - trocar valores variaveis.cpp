#include "iostream"
#include "math.h"
#include "stdlib.h"

using namespace std;

int main(){
	
	float a, b, temp;
	
	cout << "Algoritmo para alterar valores entre variaveis" << endl;
	cout << "Insira a variavel A: " << endl;
	cin >> a;
	
	cout << "Insira a variavel B: " << endl;
	cin >> b;
	
	cout << "Valor da variavel A: " << a << endl;
	cout << "Valor da variavel B: " << b << endl;
	
	
	cout << "Invertendo... " << endl;
	
	temp = a;
	a = b;
	b = temp;
	
	cout << "Valor da variavel A: " << a << endl;
	cout << "Valor da variavel B: " << b << endl;
	
	system("PAUSE");
	return 0;
}