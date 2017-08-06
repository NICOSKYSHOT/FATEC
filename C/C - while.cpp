#include <cstdlib>
#include <iostream>

using namespace std;

int main(int argc, char *argv[])
{
  int v1,i;
printf("numero :  ");
scanf("%i",&v1);
 i=1;
 
 system("cls");
 
 while(i<5){
            v1=v1+3;
  printf("\n cont = %i",i); 
   
  printf("\n valor = %i",v1);
  i++;
}
    printf("\n");
    system("PAUSE");
    return EXIT_SUCCESS;
}
