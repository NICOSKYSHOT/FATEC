#include "stdio.h"
#include "stdlib.h"
#include "iostream"
#include "string.h"

using namespace std;

int main() {

char s;
string n;

    cout << "Algoritmo que informa sauda uma pessoa dependendo do sexo" << endl;
    cout << "Informe o nome " << endl;
    cin >> n;
    
    cout << "Informe o sexo (m/f)" << endl;
    cin >> s;
    
 	if (s == 'm' ){
		cout << "Ilmo. Sr. " << n << endl;
    }else if (s == 'f' ){
		cout << "Ilma. Sra. " << n << endl;
	}

	system("pause");
    return 0;
}