#include <stdio.h>
#include <stdlib.h>

int main(int argc, char *argv[])
{
    system ("color 18");
    
    int op ;
    float n1,n2,med;
    


do{
                 
      printf ("\n digite numeros para continuar e 0 para sair \n ");
      scanf("%d",&op);
      
      system("cls");
      
      if(op!=0){           
                 
                 printf("\n digite a nota 1 : ");
                 scanf("%f",&n1);
                 
                 printf("\n digite a nota 2 :  ");
                 scanf("%f",&n2);    
    
    med=((n1*0.30)+(n2*0.70));
    printf("\n a media e %.2f \n ",med);
    
}

}while (op!=0);


    
    
    
    
  
  system("PAUSE");	
  return 0;
}
