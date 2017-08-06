#include <stdio.h>
#include <stdlib.h>

int main(int argc, char *argv[])
{
 int a,b,c,op ;
 
 do{
     printf("\n numeros para continuar  0 para sair \n ");
     scanf("%d",&op);
     system("cls");
 if(op!=0){
           printf("\n digite valor 1 : ");
           scanf("%d",&a);
            printf("\n digite valor 2 : ");
           scanf("%d",&b);
           printf("\n digite valor 3 : ");
           scanf("%d",&c);   
         system("cls");
     printf ("\n numeros : %d - %d - %d ",a,b,c);
     
     
  if(a<b && a<c){
    printf ("\n o menor numero e %d  e esta na posicao 1 \n ",a);  
   }else if (b<c && b<a){
        printf ("\n o menor numero e %d  e esta na posicao 2 \n ",b);
   } else if (c<a && c<b){
         printf ("\n o menor numero e %d  e esta na posicao 3 \n ",c);       
}else if (a==b || b==c || a== c) {
      printf("\n numeros repetidos \n ");
      }
      
    
    

}  
     
}while (op!=0); 
     
     
     
     
     
     
     
     
     
     
  system("PAUSE");	
  return 0;
}
