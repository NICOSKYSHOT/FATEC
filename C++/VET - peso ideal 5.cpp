#include <iostream>
#include <math.h>
#include <string.h>
#include <stdlib.h>
using namespace std;

int main (){

	//Vitor Francisco Lamounier
	
	float peso[5];
	float altura [5];
	float imc[5];
	char sexo[5];
	int i;
	string status;
	
	cout << "Algoritmo que calcula e classifica o imc de 5 pessoas" << endl;

	for (i=0;i<5;i++){
		cout << "Insira o peso da " << i+1 << "a Pessoa" <<endl;  
	    cin >> peso[i]; 
	    cout << "Insira a altura da " << i+1 << "a Pessoa" <<endl;  
	    cin >> altura[i];
	    cout << "Insira o sexo (m ou f) da " << i+1 << "a Pessoa" <<endl;  
	    cin >> sexo[i];
		}
	
	for (i=0; i<5; i++){
	    imc[i] = peso[i]/(altura[i]*altura[i]);
	    if (sexo[i] == 'm'){
	       if (imc[i] < 20.7){ 
	          status = "Abaixo do peso";
	       }else if (imc[i] >= 20.7 && imc[i] < 26.4){
	             status = "Peso normal";
	       }else if (imc[i] >= 26.4 && imc[i] <27.8){
	             status = "Marginalmente acima do peso";
	       }else if (imc[i] >= 27.8 && imc[i] <31.1){
	             status = "Acima do peso";
	       }else if (imc[i] >31.1){
	             status = "Obeso";
	       }
	       cout << " O imc eh " << imc[i] << " e o status eh " << status << endl;
	       
	    }else if (sexo[i] == 'f'){
	          if (imc[i] < 19.1){ 
	                  status = "Abaixo do peso";
	       }else if (imc[i] >= 19.1 && imc[i] < 25.8){
	             status = "Peso normal";
	       }else if (imc[i] >= 25.8 && imc[i] <27.3){
	             status = "Marginalmente acima do peso";
	       }else if (imc[i] >= 27.3 && imc[i] <32.2){
	             status = "Acima do peso";
	       }else if (imc[i] >32.2){
	             status = "Obeso";
	       } 
	       cout << " O imc eh " << imc[i] << " e o status eh " << status << endl;  
	    }
	}

system("PAUSE");
return 0;
}