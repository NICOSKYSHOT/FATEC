#include <iostream>
#include <math.h>
#include <string.h>
#include <stdlib.h>

using namespace std;

int main (){
	
	//Vitor Francisco Lamounier

	int termo[17], i=2;
	
	cout << "Algoritmo que calcula a sequencia de fibonacci" << endl;
	
	termo[0] = 0;
	termo[1] = 1;
	
	for(i=2;i<=16;i++){
		termo[i]=termo[i-2]+termo[i-1];
        cout << termo[i] << endl;
     
        termo[i-2]=termo[i-1];
	}
	
system("PAUSE");
return 0;
}