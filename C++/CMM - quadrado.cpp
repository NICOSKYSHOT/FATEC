#include "iostream"
#include "stdlib.h"
#include "math.h"

using namespace std;

int main(){
	
	float n, q;
	
	cout << "Algoritmo que calcula quadrado de um numero" << endl;
	cout << "Insira o numero para achar o quadrado" << endl;
	cin >> n;
	
	q = n*n;
	
	cout << "Numero: " << n <<endl;
	cout << "Seu Quadrado: " << q <<endl;
	
	system("PAUSE");
	return 0;
}