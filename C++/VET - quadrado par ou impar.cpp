#include "iostream"
#include "cstdlib"
#include "locale.h"
#include "string.h"

using namespace std;

int a[]={1,2,3,4,5};
int b[]={3,4,5,6,7};
int c[]={5,6,7,8,9};
int main(){
	
	//Vitor Francisco Lamounier
	
    int i=0, j=0, k=0, quada=0, quadb=0, quadc=0;
    
  for (i=0;i<5;i++){
  	
  	if(a[i]%2==1){
    quada = a[i]*a[i];
	cout << quada;
	}
}

cout << endl;
for (j=0;j<5;j++){
	if(b[j]%2==1){
    quadb = b[j]*b[j];
	cout << quadb;
	}
}

cout << endl;
for (k=0;k<5;k++){
	if(b[k]%2==1){
    quadc = c[k]*c[k];
	cout << quadc;
	}
}

cout << endl;
system("pause");
return 0;   
}