#include "stdio.h"
#include "stdlib.h"
#include "iostream"

using namespace std;

int main() {

int n;

	while (n!=0){
    cout << "Algoritmo que informa se um valor e menor que 3" << endl;
	cout << "Insira 0 para sair." << endl << endl;
	
    cout << "Informe o numero " << endl;
    cin >> n;
    
 	if (n<=3){
		cout << n << " nao e maior que 3" << endl;
    }else{
		cout << "esse valor e maior que 3" << endl;
	}

	system("pause");
	system("cls");
	}
    
    return 0;
}