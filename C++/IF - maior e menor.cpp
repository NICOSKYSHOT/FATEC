#include "stdio.h"
#include "stdlib.h"
#include "iostream"

using namespace std;

int main() {

int a, b, c, d, e, maior, menor;

    cout << "Algoritmo que encontra o maior e o menor valor" << endl;
	
    cout << "Informe o valor a" << endl;
    cin >> a;
    cout << "Informe o valor b" << endl;
    cin >> b;
    cout << "Informe o valor c" << endl;
    cin >> c;
    cout << "Informe o valor d" << endl;
    cin >> d;
    cout << "Informe o valor e" << endl;
    cin >> e;

    
	if (a>b && a>c && a>d && a>e){
	maior = a;	
	}else if(b>a && b>c && b>d && b>e){
	maior = b;	
	}else if(c>b && c>a && c>d && c>e){
	maior = c;	
	}else if(d>b && d>c && d>a && d>e){
	maior = d;	
	}else if(e>b && e>c && e>d && e>a){
	maior = e;	
	}
	
	if (a<b && a<c && a<d && a<e){
	menor = a;	
	}else if(b<a && b<c && b<d && b<e){
	menor = b;	
	}else if(c<b && c<a && c<d && c<e){
	menor = c;	
	}else if(d<b && d<c && d<a && d<e){
	menor = d;	
	}else if(e<b && e<c && e<d && e<a){
	menor = e;	
	}

	cout << endl << "Maior Valor = " << maior << endl;
	cout << "Menor Valor = " << menor << endl << endl;
	
    system("pause");
    return 0;
}