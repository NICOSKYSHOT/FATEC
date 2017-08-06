#include "iostream"
#include "cstdlib"
#include "conio.h"
#include "windows.h"
#include "string.h"

using namespace std;

struct registro {
       double media[5]; 
       string status [5]; 
};

struct registro med;

//Vitor Franciso Lamounier

   double v1[]={8, 6, 5, 4, 2};
   double v2[]={10, 6, 5, 4, 3};

int main() {
	setlocale(LC_ALL, "Portuguese");
	
    string status ="";
    
    for (int i=0;i<5;i++){
	
		med.media[i] = (v1[i]+v2[i])/2;

        if (med.media[i] >= 8){
			status = "Aprovado com Excelencia";
		}else if(med.media[i] >= 6 && med.media[i] <8){
			status = "Aprovado por nota minima";
		}else if(med.media[i] >= 5 && med.media[i] <6){
			status = "Aluno de Exame";
		}else if(med.media[i] >= 3 && med.media[i] <5){
			status = "Aluno Recuperacao";
		}else{
			status = "Aluno Reprovado";
		}

       med.status [i] = status;

    }
    
for (int x = 0;x < 5; x++){
cout << med.media[x]<< "|"<< med.status[x] << endl ;
}

system("pause");
    
    
return 0; 
}