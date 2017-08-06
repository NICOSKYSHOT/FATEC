#include "iostream"
#include "cstdlib"
#include "locale.h"
#include "string.h"
using namespace std;
int a[]={1,2,3};
int b[]={5,6};

int main(){

	//Vitor Francisco Lamounier
	
    int i=1,n=1, f=1;
    
    cin >> n;
    
    for (i=1; i<=n; i++) {
    f = f * i;
    }

    cout << n << "! = " << f << endl;
    
	system("pause");
   return 0;   
}