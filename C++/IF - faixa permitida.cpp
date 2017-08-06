#include "stdio.h"
#include "stdlib.h"
#include "iostream"

using namespace std;

int main() {

int n;

	while (n!=0){
    cout << "Algoritmo que informa se um valor esta na faixa permitida (1-9)" << endl;
	cout << "Insira 0 para sair." << endl << endl;
	
    cout << "Informe o numero " << endl;
    cin >> n;
    
 	if (n>=1 && n<=9){
		cout << "O Valor esta na faixa permitida " << endl;
    }else{
		cout << "O Valor esta fora da faixa permitida " << endl;
	}

	system("pause");
	system("cls");
	}
    
    return 0;
}