#include <cstdlib>
#include <iostream>

using namespace std;

int main(int argc, char *argv[])
{
    system ("color wq");
 int v1,v2;
 float d;
 
 printf("digite valor 1");
 printf("\n");
 scanf("%d",&v1);
   
  printf("\n\n");
 printf("digite valor 2");
  printf("\n");
 scanf("%d",&v2);  
    
  printf("\n");
  printf("\n\n numeros informados : \n");
  printf("valor 1 : %d" ,v1);
   printf("\n");
  printf("valor 2 :  %d" ,v2);  
    system("cls");
  
  d=v1/v2;
  
 
  printf ("a soma : \n %d + %d = %d ", v1,v2,v1+v2);
  printf("\n");
  printf ("a sub : \n %d - %d = %d ", v1,v2,v1-v2);  
  printf("\n");
  printf ("a mult : \n %d * %d = %d ", v1,v2,v1*v2);    
  printf("\n");
  printf ("a div : \n %d \ %d = %.0f ", v1,v2,d);   
    
   
    
    
   if(v1%v2==0){
  printf("\n o valor %d e multiplo do valor %d",v1,v2);   
}else {
  printf(" o valor %d nao e multiplo do valor %d",v1,v2);      
}
printf("\n");
  
    
    
    
    
    system("PAUSE");
    return EXIT_SUCCESS;
}
