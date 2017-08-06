#include "stdio.h"
#include "stdlib.h"
#include "iostream"

using namespace std;

int main() {

int i, n, f = 1;
    
    while (n!=0){
    cout << "Algoritmo que calcula o fatorial de um numero" << endl;
	cout << "Insira 0 para sair." << endl << endl;
    cout << "Informe o numero para fazer fatorial: ";
    
    cin >> n;
    
    for (i=1; i<=n; i++) {
    f = f * i;
    }

    cout << "Fatorial de " << n << " = " << f << endl;
    system("pause");

	}
	
    return 0;
}

