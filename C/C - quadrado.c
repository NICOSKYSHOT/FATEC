#include <stdio.h>
#include <stdlib.h>

int main(int argc, char *argv[])
{
  int nun,quad;
  printf(" 1-continuar e 0-sair ");
  do{
                      printf("\n\n numeros : ");
                      scanf ("%d",&nun);
         if (nun != 0 ){
                 quad=nun*nun;
          printf("\n\n o quadrado do numero %d e %d " ,nun , quad );
          }
          
 } while (nun !=0) ;
   system("PAUSE");	
  return 0;
                           

  
}


