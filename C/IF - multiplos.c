#include <stdio.h>
#include <stdlib.h>

/* run this program using the console pauser or add your own getch, system("pause") or input loop */

int main(int argc, char *argv[]) {
	int a,b,x,y;
	float d;
	system("color 1f");
	
	    puts("digite o valor 1");
	scanf("%d",&a);
		puts("digite o valor 2");
	scanf("%d",&b);
	    x=a+b;
	   y=a-b;
	    d=a/b;
	if (a%b==0) {
		printf("%d\n",x);
			printf("%d\n",y);
				printf("%f\n",d);
					printf("e multiplo");
	}else{
		printf("%d\n",x);
			printf("%d\n",y);
				printf("%f\n",d);
					printf("não  e multiplo");	
	}   
	
	
	
	return 0;
}
