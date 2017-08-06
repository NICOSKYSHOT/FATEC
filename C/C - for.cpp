#include <cstdlib>
#include <iostream>

using namespace std;

int main(int argc, char *argv[])
{
    
    system("color 1f");
    int i,c ;
    printf ("valor :   ");
    scanf("%i",&i);
    for (c=0;c<=5;c++){
    i=i+1;
    printf(" numero : ");
    printf("%i\n",i);
}
    system("PAUSE");
    return EXIT_SUCCESS;
}

