#include "stdio.h"
#include "stdlib.h"
#include "iostream"

using namespace std;

int main() {

int n;

	while (n!=0){
    cout << "Algoritmo que informa se um numero e par ou impar" << endl;
	cout << "Insira 0 para sair." << endl << endl;
	
    cout << "Informe o numero " << endl;
    cin >> n;
    
 	if (n%2==0){
		cout << n << " = PAR" << endl;
    }else{
		cout << n << " = IMPAR" << endl;
	}

	system("pause");
	system("cls");
	}
    
    return 0;
}