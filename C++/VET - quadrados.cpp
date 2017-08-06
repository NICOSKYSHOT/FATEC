#include "iostream"
#include "cstdlib"
#include "locale.h"
#include "string.h"
using namespace std;

int a[5]={1,2,3,4,5};
int b[3]={2,3,4};

int main(){

	//Vitor Francisco Lamounier
	
int i=0,quada=0,quadb=0,c=0;

for (i=0;i<5;i++){
	
quada = a[i]*a[i];
cout << quada;

}

cout << endl;

for (c=0;c<3;c++){
    quadb = b[c]*b[c];
 cout << quadb;
}
	
cout << endl;

system("pause");
return 0;   

}