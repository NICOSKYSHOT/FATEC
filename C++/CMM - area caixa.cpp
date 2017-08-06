#include "iostream"
#include "stdlib.h"
#include "math.h"

using namespace std;

int main(){
	
	float c, l, a, area;
	
	cout << "Algoritmo que calcula area de caixa retangular" << endl;
	cout << "Insira o comprimento da caixa" << endl;
	cin >> c;
	
	cout << "Insira a largura da caixa" << endl;
	cin >> l;
	
	cout << "Insira a altura caixa" << endl;
	cin >> a;
	
	area = c*l*a;
	
	cout << "Area da caixa: " << area <<endl;
	
	system("PAUSE");
	return 0;
}