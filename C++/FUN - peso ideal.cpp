#include <iostream>
#include <stdlib.h>

using namespace std;

//Vitor Francisco Lamounier

void pesoideal(char s, float a){
	
	float pi;
	
	if (s=='m'){
		pi = (a - 100) - ((a-150)/4);
	} else if (s=='f'){
		pi = (a - 100) - ((a-150)/2);
	}
	
	cout << endl << pi << "kg" << endl;

}

int main(){
	
	cout << "Algoritmo para calcular peso ideal. ";
	cout << "\nInsira o sexo (m/f) e altura (cm).\n";
	
	char s;
	float a;
	
	cin >> s;
	cin >> a;
	
	pesoideal(s,a);
	
	system("PAUSE");
	
	return 0;
}