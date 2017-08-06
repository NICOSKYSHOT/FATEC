#include "iostream"
#include "cstdlib"
#include "conio.h"
#include "windows.h"
#include "string.h"
#include "math.h"

using namespace std;

struct registro {
       double novosal[5]; 
       char sexo[5];
};

struct registro sal;

//Vitor Franciso Lamounier

int main() {
	
	string nome[]={"Mario", "Marcia", "Athos", "Fabiana", "Juarez"};
    int ida[]={30,32,40,25,18};
    double salario[]={2000,2500,1800,3000,2000};
    char sex[]={'h','f','h','f','h'};
    
	double salmaior=0;
	double salmedio=0;
	double salmenor=100000;
	double mediaida=0;
	
	setlocale(LC_ALL, "Portuguese");
	
    string status ="";
    double saltotal=0, idadetotal=0;
    
    for (int i=0;i<5;i++){
	
		if (sex[i]=='f'){
			sal.novosal[i] = salario[i] + (salario[i]*12.5);
			sal.sexo[i] = 'f';
			
		}else if (sex[i]=='h'){
			sal.novosal[i] = salario[i] + (salario[i]*10);
			sal.sexo[i] = 'h';
		}
		
		if(salmaior < salario[i]){
			salmaior = salario[i];
		}else if(salmenor > salario[i]){
			salmenor = salario[i];
		}
		
		saltotal += salario[i];
        idadetotal += ida[i];
    }
    
    salmedio = saltotal/5;
    mediaida = (idadetotal/5);
    
for (int x = 0;x < 5; x++){
cout << sal.novosal[x] << "|"<< sal.sexo[x] <<endl;
}

cout << "Maior Salario " << salmaior << endl;
cout << "Menor Salario " << salmenor << endl;
cout << "Media Salarios " << salmedio << endl;
cout << "Media Idade " << mediaida << endl;
system("pause");
    
    
return 0; 
}