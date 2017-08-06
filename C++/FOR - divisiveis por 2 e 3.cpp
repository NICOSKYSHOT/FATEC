#include "stdio.h"
#include "stdlib.h"
#include "iostream"

using namespace std;

int main() {

int i, n[4];

    cout << "Algoritmo que encontra os valores divisiveis por 2 E 3" << endl;
	
    for (i=1; i<=4; i++) {
    cout << "Informe o valor " << i << endl;
    cin >> n[i];
    }
    
    cout << endl;
    
    for (i=1; i<=4; i++) {
 	if (n[i]%2==0 && n[i]%3==0){
		cout << n[i] << " = Divisivel por 2 E 3" << endl;
	}
    }

	cout << endl;
	
    system("pause");
    return 0;
}