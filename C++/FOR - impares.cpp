#include "iostream"
#include "math.h"
#include "stdlib.h"

using namespace std;

int main (){
    
    int x=-1, y=-1;

    while (x!=0 && y!=0){
		cout << "Algoritmo que calcula quadrado de todos os numeros IMPARES em um setor" << endl;
		cout << "Insira 0 para sair." << endl << endl;
		cout << "Insira o numero que inicia o setor" << endl;
		cin >> x;
          
  		cout << "Insira o numero que finaliza o setor" << endl;
		cin >> y;
          
		for (int i =x; i<= y; i++){
          
		if (i%2==1){            
		cout << i << " -> " << pow (i,2) << endl;
		}
		
		}
		cout << "\n";
		system("PAUSE");
		system("cls");

		}

    return 0;

}