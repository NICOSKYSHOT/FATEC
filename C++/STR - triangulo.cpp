#include "iostream"
#include "cstdlib"
#include "math.h"
#include "string.h"
using namespace std;

struct triangulo{  
	float a, b, c, ar, ba, al;
	string tipo;
};

float lera() {
	float a; 
	cout << "Digite o lado A:";
	cin >> a;
	return a;
}

float lerb() {
	float b; 
	cout << "Digite o lado B:";
	cin >> b;
	return b;
}

float lerc() {
	float c; 
	cout << "Digite o lado C:";
	cin >> c;
	return c;
}

float vlar(struct triangulo tri) { 

	float ar, sp;
	sp = (tri.a + tri.b + tri.c)/2; 
	ar = sqrt(sp * (sp - tri.a) * (sp - tri.b) * (sp - tri.c));
	
	return ar; 

}

string idtipo(struct triangulo tri){

	if (tri.a == tri.b && tri.a == tri.c){  
		return "Equilátero";
	}else if (tri.a == tri.b && tri.a != tri.c && tri.c != tri.b ){
		return "Isóceles";	 
	}else if(tri.a != tri.b && tri.a == tri.c && tri.c != tri.b ){
		return "Isóceles";	 
	}else if(tri.a != tri.b && tri.a != tri.c && tri.c == tri.b ){
		return "Isóceles";	
	}else if(tri.a != tri.b && tri.a != tri.c ){ 
		return "Escaleno"; 
	}else{
		return "Não é triângulo!";
	}
}

float base(struct triangulo tri){
	
	if  (tri.tipo == "Equilátero"){
		return tri.a;
	}else if (tri.tipo == "Escaleno"){
		
		if (tri.a > tri.b && tri.a > tri.c){
			return tri.a;
		}else if (tri.b > tri.a && tri.b > tri.c){
			return tri.b;
		}else if (tri.a == tri.b){ 
			return tri.c;
		}else if   (tri.a == tri.c){
			return tri.b;
		}else{   
			return tri.a; 
		}
		
	}else{
		return  tri.c;
	}
}

float altura(struct triangulo tri){
	return ( (2 * tri.ar) / tri.ba);
}

int tela () {
	
	int op;
	cout << "** Menu Triângulo **";
	cout << "\n** 1 - ler lados **";
	cout << "\n** 2 - Calcular valores **";
	cout << "\n** 3 - Exibir tudo **";
	cout << "\n** 4 - Sair **";
	cout << "\n\n Item>";
	cin >> op;     
	return op;

}

void menu() {

int op = 1; 
triangulo tri;

	while (op != 4) {
	
	op = tela();
	
		if (op ==1) { 
			
			tri.a = lera();
			tri.b = lerb();
			tri.c = lerc();
			system("pause");
			system("cls");
			
		}else if (op==2){
			
				tri.tipo = idtipo(tri);
				tri.ar  = vlar(tri);
				tri.ba = base(tri);
				tri.al = altura(tri); 
				
				cout << "\nCálculo Efetuado!" << endl;
				system("pause");
				system("cls");
		
		}else if (op == 3){
		
		system("cls");
		cout << "** Resultados **"; 
		
		cout<< "\n";
		cout<< "A | B | C | AREA | BASE | ALTURA | TIPO";
		
		cout<< "\n";
		cout<< tri.a <<"|";
		cout<< tri.b << "|";
		cout<< tri.c << "|";
		cout<< tri.ar << "|";
		cout<< tri.ba << "|";
		cout<< tri.al << "|";                 
		cout<< tri.tipo << "|" ;
		
		cout<< endl;
		system("pause");
		system("cls");
		
		}else{
		system("cls");		
		cout << "** Opção Inválida **"; 
		cout<< endl;
		system("pause");
		system("cls");	
		}
		} 
}

int main() {
    setlocale(LC_ALL, "Portuguese");
    menu();
    return 0; 
}
