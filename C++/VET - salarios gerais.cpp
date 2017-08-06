#include "iostream"
#include "cstdlib"
#include "locale.h"
#include "string.h"

#define MAX 7

using namespace std;

string nome[]={"Marcelo","Giovana","Claudia","Rogerio","Berenice","Julio", "Flavia"};
double salario[]={2000,1500,5000,2580,3980,6980,7000};
double idade[]={25,30,40,55,35,45,38};
char sexo[]={'h','f','f','h','f','h','f'};

int tmulheres=0, thomens=0, tsalario=0, i;
double midade=0, msalario=0, maiorsalario=0, menorsalario=10000;

int main () {
    
    //Vitor Francisco Lamounier
    
setlocale(LC_ALL, "Portuguese");// idioma
int cont = 0;  double mediaida=0;

system("cls");    

for (i = 0 ; i< MAX; i++){
     
    if(sexo[i] == 'f'){
    tmulheres++;
    
    }else if (sexo[i] == 'h') {
          thomens ++;
          }
          
    
    tsalario++;
    
    midade += idade[i];
   msalario += salario[i];
   
} 

midade = midade/tsalario;
msalario = msalario/ tsalario;


for (i = 0 ; i< MAX; i++){
     if (salario[i]>maiorsalario){                        
     maiorsalario = salario[i];                      
     } if ( salario[i] < menorsalario ){
          menorsalario = salario [i];
          }
                    
} 

cout<< "*** Totais Gerais *** ";
cout<< "\nTotal de salários: "<< tsalario;
cout<< "\n Total de homens: "<< thomens;
cout<< "\n Total de mulheres: "<< tmulheres;
cout<< "\nMédia das idade: "<< midade;
cout<< "\nMédia dos salários: "<< msalario;
cout<< "\nMaior salário: "<< maiorsalario <<endl;
cout<< "\nMenor salário: "<< menorsalario <<endl;
system("pause");
return 0; 
}