#include <cstdlib>
#include <iostream>

using namespace std;

int main(int argc, char *argv[])

{
    int r;
float c,p;
    
 p=3.14;
    
 printf ("digite o valor do raio :");
 scanf("%i",&r);
    
    if(r>0){
         c=2*p*(float)r;
       printf("o perimetro e : %.2f ",c);
         
}else{
         printf("invalido");         
    
}  
    
    
    
    printf("\n");
    
    
    
    
    
    
    
    
    system("PAUSE");
    return EXIT_SUCCESS;
}
