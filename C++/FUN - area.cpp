#include <iostream>
#include <stdlib.h>
#include <string.h>

using namespace std;

//Vitor Francisco Lamounier

void area(float b, float a){
	
	float area;
	string status;
    
    area = (b*a)/2;

	cout << "\nArea: "<< area << endl;

}

int main(){
	
	cout << "Algoritmo para calcular area do triangulo.";
	cout << "\nInsira a area e a altura.\n";

	float b, a;
	
	cin >> b;
	cin >> a;
	
	area(b,a);
	
	system("PAUSE");
}