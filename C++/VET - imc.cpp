#include "iostream"
#include "cstdlib"
#include "string.h"

using namespace std;

int main() {
	setlocale(LC_ALL, "Portuguese");
	
	char s[5];
    double peso[5];
    double alt[5];
    
    int i;
    
    double imc[5];
    string cond[5];
	
    string status ="";
    
    for (i=0;i<5;i++){
    	
    	cin >> s[i];
    	cin >> peso[i];
    	cin >> alt[i];
	
		imc[i] = peso[i]/(alt[i]*alt[i]);
		
		if (s[i]=='m'){
		
	        if (imc[i] < 19.1){
				status = "Abaixo do Peso";
			}else if(imc[i] >= 19.1 && imc[i] <25.8){
				status = "Peso Normal";
			}else if(imc[i] >= 25.8 && imc[i] <27.3){
				status = "Marginalmente Acima do Peso";
			}else if(imc[i] >= 27.3 && imc[i] <32.3){
				status = "Acima do Peso";
			}else{
				status = "Obeso";
			}
		
		}else if(s[i] == 'h'){
			
			if (imc[i] < 20.7){
				status = "Abaixo do Peso";
			}else if(imc[i] >= 20.7 && imc[i] <26.4){
				status = "Peso Normal";
			}else if(imc[i] >= 26.4 && imc[i] <27.8){
				status = "Marginalmente Acima do Peso";
			}else if(imc[i] >= 27.8 && imc[i] <31.1){
				status = "Acima do Peso";
			}else{
				status = "Obeso";
			}
		}
       
	   cond[i] = status;
    }
    
	for (i = 0;i < 5; i++){
		
		cout << imc[i]<< "|"<< cond[i] << endl ;
		
	}

system("pause");
return 0; 
}