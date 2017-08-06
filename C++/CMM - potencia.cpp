#include <iostream>
#include <math.h>
#include <string.h>
#include <stdlib.h>

using namespace std;

int main (){

int b, e, p;

	//Vitor Francisco Lamounier
	
	cout << "Insira o valor da base: ";  
    cin >> b; 
	cout << "Insira o valor do expoente: ";  
    cin >> e; 
	
	p = pow(b,e);
	
	cout << b << "^"<<e<<" = "<< p << endl;
	
system("PAUSE");
return 0;
}