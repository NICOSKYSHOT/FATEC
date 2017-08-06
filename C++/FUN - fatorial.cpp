#include <iostream>
#include <stdlib.h>

using namespace std;

//Vitor Francisco Lamounier

void fatorial(int n){
	
	int f, temp;
	temp = n;
    f = n;
	while(n > 1){
      f = f * (n-1);
      n--;
    }
    
	cout << temp << "! = " << f << endl;
}

int main(){
	
	cout << "Algoritmo para calcular fatorial. ";
	cout << "\nInsira o numero para encontrar o fatorial.\n";

	int n;
	
	cin >> n;
	
	fatorial(n);
	
	system("PAUSE");
}