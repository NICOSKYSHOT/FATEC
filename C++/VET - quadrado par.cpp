#include "iostream"
#include "cstdlib"
#include "locale.h"
#include "string.h"
using namespace std;
int a[]={1,2,3};
int b[]={5,6};

int main(){
	
	//Vitor Francisco Lamounier
	
    int i=0, j=0,quada=0,quadb=0;
    
  for (i=0;i<2;i++){
  	
  	if(a[i]%2==0){
    quada = a[i]*a[i];
	cout << quada;
	}
}

cout << endl;

for (j=0;j<3;j++){
	
	if(b[j]%2==0){
    quadb = b[j]*b[j];
	cout << quadb;
	}
}

cout << endl;

system("pause");
return 0;   
}