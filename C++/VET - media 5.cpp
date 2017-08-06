#include "iostream"
#include "math.h"
#include "string.h"
#include "stdlib.h"

using namespace std;

int main (){
	
	//Vitor Francisco Lamounier
	
    float n1 [5];
    float n2 [5];
    float m [5];
    int i;
    string status; 
    
    cout << "Algoritmo que calcula e classifica as medias de 5 alunos" << endl;
    
    for(i=0;i<5;i++){
 	cout << "Insira a primeira nota do " << i+1 << "o Aluno" <<endl;  
    cin >> n1[i];
    }
    for(i=0;i<5;i++){
 	cout << "Insira a segunda nota do " << i+1 << " Aluno" << endl;  
    cin >> n2[i];
    }
    
    for(i=0;i<5;i++){
    m[i] = (n1[i] + n2[i]) /2;
    if(m[i] >= 8 && m[i]<= 10){
    status = "Aprovado com excelencia";        
    }else if(m[i]>=6 && m[i]<8){
    status = "Aprovado por nota minima";
    }else if(m[i]>=5 && m[i]<6){
    status = "Aluno em exame";
    }else if(m[i]>=3 && m[i]<5){
    status = "Aluno em recuperacao";
    }else if(m[i]<3){
    status = "Aluno reprovado";
    }else{
    status = "ERRO";
	}	  
    }
    
    for(i=0;i<5;i++){
    cout << "Aluno "<< i+1 << " obteve a media " << m[i] << " e sua situacao e: " << status<< endl;                 
    }
    
    system("pause");
    return 0;
    }