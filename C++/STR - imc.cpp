#include "iostream"
#include "cstdlib"
#include "conio.h"
#include "windows.h"
#include "string.h"

using namespace std;

struct registro {
       double imc[5]; 
       string status[5]; 
};

struct registro cond;

//Vitor Franciso Lamounier

	char s[]={'h', 'm', 'm', 'h', 'h'};
    double peso[]={100, 61, 55, 75, 82};
    double alt[]={1.8, 1.6, 1.7, 1.9, 1.65};

int main() {
	setlocale(LC_ALL, "Portuguese");
	
    string status ="";
    
    for (int i=0;i<5;i++){
	
		cond.imc[i] = peso[i]/(alt[i]*alt[i]);
		
		if (s[i]=='m'){
		
	        if (cond.imc[i] < 19.1){
				status = "Abaixo do Peso";
			}else if(cond.imc[i] >= 19.1 && cond.imc[i] <25.8){
				status = "Peso Normal";
			}else if(cond.imc[i] >= 25.8 && cond.imc[i] <27.3){
				status = "Marginalmente Acima do Peso";
			}else if(cond.imc[i] >= 27.3 && cond.imc[i] <32.3){
				status = "Acima do Peso";
			}else{
				status = "Obeso";
			}
		
		}else if(s[i] == 'h'){
			
			if (cond.imc[i] < 20.7){
				status = "Abaixo do Peso";
			}else if(cond.imc[i] >= 20.7 && cond.imc[i] <26.4){
				status = "Peso Normal";
			}else if(cond.imc[i] >= 26.4 && cond.imc[i] <27.8){
				status = "Marginalmente Acima do Peso";
			}else if(cond.imc[i] >= 27.8 && cond.imc[i] <31.1){
				status = "Acima do Peso";
			}else{
				status = "Obeso";
			}
		}
       cond.status[i] = status;
    }
    
for (int x = 0;x < 5; x++){
cout << cond.imc[x]<< "|"<< cond.status[x] << endl ;
}

system("pause");
return 0; 
}