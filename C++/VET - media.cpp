#include "iostream"
#include "cstdlib"
#include "string.h"

using namespace std;

int main() {
	setlocale(LC_ALL, "Portuguese");
	
	int i;
	int v1[5];
	int v2[5];
	string cond[5];
	double media[5];
	
    string status ="";
    
    for (i=0;i<5;i++){
	
		cin >> v1[i];
		cin >> v2[i];
		
		media[i] = (v1[i]+v2[i])/2;
		
		if (media[i] >= 8){
			status = "Aprovado com Excelência";
		}else if(media[i] >= 6 && media[i] <8){
			status = "Aprovado por nota Mínima";
		}else if(media[i] >= 5 && media[i] <6){
			status = "Aluno de Exame";
		}else if(media[i] >= 3 && media[i] <5){
			status = "Aluno de Recuperação";
		}else{
			status = "Aluno Reprovado";
		}
		
		cond[i] = status;
    }
    
    for (i=0;i<5;i++){
	
	cout << media[i]<< "|"<< cond[i] << endl ;

    }

system("pause");
    
    
return 0; 
}