#include <iostream>
#include <stdlib.h>
#include <string.h>

using namespace std;

//Vitor Francisco Lamounier

void media(float n1, float n2){
	
	float m;
	string status;
    
    m = (n1+n2)/2;
    
    if (m>6){
		status = "Aprovado";		
	}else{
		status = "Reprovado";
	}
    
	cout << "\nMedia: "<< m << "\nStatus: " << status << endl;
}

int main(){
	
	cout << "Algoritmo para calcular media e exibir status. ";
	cout << "\nInsira as notas do aluno (2).\n";

	float n1, n2;
	
	cin >> n1;
	cin >> n2;
	
	media(n1,n2);
	
	system("PAUSE");
}