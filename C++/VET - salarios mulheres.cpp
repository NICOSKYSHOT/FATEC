#include "iostream"
#include "cstdlib"
#include "locale.h"
#include "string.h"

#define MAX 6

using namespace std;

string nome[]={"Leia","Raquel","Sara","Debora","Ester","Eliseu"};
double salario[]={100,1000,10,100,10000,1000};
double idade[]={20,25,30,35,40,45};
char sexo[]={'f','f','f','f','f','m'};

int tmulheres=0, tpessoas=0, i;
double midade=0, msalario=0;

int main () {
	
//Vitor Francisco Lamounier
    
setlocale(LC_ALL, "Portuguese");// idioma
int cont = 0;  double mediaida=0;

system("cls");    

for (i = 0 ; i< 6; i++){
     
    if(sexo[i] == 'f'){
    tmulheres++;
    }
    
    tpessoas++;
    
    midade += idade[i];
    
} 

midade = midade/tpessoas;

for (i = 0 ; i< 6; i++){
     if (salario[i]>msalario){                        
     msalario = salario[i];                      
     }                
} 

cout<< "*** Totais Gerais *** ";
cout<< "\nTotal de mulheres: "<< tmulheres;
cout<< "\nMédia das idade: "<< midade;
cout<< "\nMaior salario: "<< msalario;
cout<< "\nTotal de pessoas: "<< tpessoas <<endl;
system("pause");
return 0; 
}