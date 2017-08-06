#include "iostream"
#include "math.h"
#include "cstdlib"
#include "conio.h"
#include "string.h"
#include "windows.h"

using namespace std;

//Vitor Francisco Lamounier

struct grau{
  	
  	float a;
  	float b;
  	float c;
  	
  	float d;
  	
  	float x1;
  	float x2;
  	
  	string ad;
  	
};

struct circ{
  	
  	float co;
  	float di;
  	float r;
	float ar;
 
};

float LerComprCirc(){

	float c;
	cout << "\nInsira o comprimento da Circunferência: ";
	cin >> c;
	system("PAUSE");
	return c;
		
}

float CDiaCirc(struct circ prop){

	float dia;
	dia = prop.co / 3.14;
	cout << "\nDiametro Calculado." << endl;
	system("PAUSE");
	return dia;
		
}

float CRaiCirc(struct circ prop){

	float raio;
	raio = prop.di / 2;
	cout << "\nRaio Calculado." << endl;
	system("PAUSE");
	return raio;
		
}

float CAreCirc(struct circ prop){

	float area;
	area = prop.r * prop.r * 3.14;
	cout << "\nArea Calculada." << endl;
	system("PAUSE");
	return area;
		
}

void ExibirCirc(struct circ prop){

	cout << "\n\nComprimento: " << prop.co;
	cout << "\nDiametro: " << prop.di;
	cout << "\nRaio: " << prop.r;
	cout << "\nArea: " << prop.ar << endl;

	system("PAUSE");
		
}

char telaCirc() {
	char opc;
	system("cls");
	cout << "MENU DO EXERCÍCIO CIRCULO";
	cout << "\n1 - Inserir o Comprimento da Circunferência";
	cout << "\n2 - Calcular Diametro";
	cout << "\n3 - Calcular Raio";
	cout << "\n4 - Calcular Area";
	cout << "\n5 - Exibir Tudo";
	cout << "\nESC - Voltar";
	cout << "\n\nOpção escolhida: ";
	
	opc = getch();
	
	return opc;   
}

void menuCirc(){

	char opc;
	circ prop;
	
		do { 
			opc = telaCirc();
			
			if (opc == '1'){   
				prop.co = LerComprCirc();      
			
			}else if (opc == '2'){   
				prop.di = CDiaCirc(prop);  
			
			}else if (opc == '3'){   
				prop.r = CRaiCirc(prop);  
			
			}else if (opc== '4'){   
				prop.ar = CAreCirc(prop);
			 
			}else if (opc == '5'){    
    			ExibirCirc(prop);   
			
			}else{
				if(opc != 27){
				cout << "\nOpção Inválida" << endl;
				system("PAUSE");
				}
			}
		
		} while (opc != 27);
	
}

float LerGrauA(){

	float a;
	cout << "\nInsira o Valor A: ";
	cin >> a;
	system("PAUSE");
	return a;
		
}

float LerGrauB(){

	float b;
	cout << "\nInsira o Valor B: ";
	cin >> b;
	system("PAUSE");
	return b;
		
}

float LerGrauC(){

	float c;
	cout << "\nInsira o Valor C: ";
	cin >> c;
	system("PAUSE");
	return c;
		
}

float CDeltaGrau(struct grau bhask){

	float delta;
	delta = (bhask.b*bhask.b) - (4*bhask.a*bhask.c);
	cout << "\nDelta Calculado." << endl;
	system("PAUSE");
	return delta;
		
}

string ADeltaGrau(struct grau bhask){

	string delta;
	
	if(bhask.d < 0){	
		delta = "Nenhuma raiz real, delta menor que ZERO";
	}else if(bhask.d == 0){
		delta = "Uma única raiz real, delta igual a ZERO";	
	}else{
		delta = "Duas raízes reais, delta maior que ZERO";	
	}
	
	cout << "\nDelta Analisado." << endl;
	system("PAUSE");
	return delta;
	
}

float CX1Grau(struct grau bhask){

	float x1, rd;
	
	if (bhask.d < 0){
		x1 = 0;
	}else if(bhask.d == 0){
		x1 = -bhask.b/(bhask.a*2);
	}else{
		rd = sqrt(bhask.d);
		x1 = (-bhask.b + rd) /(bhask.a*2);
	}
	
	cout << "\nX1 Calculado." << endl;
	system("PAUSE");
	return x1;
		
}

float CX2Grau(struct grau bhask){

	float x2, rd;
	
	if (bhask.d < 0){
		x2 = 0;
	}else if(bhask.d == 0){
		x2 = -bhask.b/(bhask.a*2);
	}else{
		rd = sqrt(bhask.d);
		x2 = (-bhask.b - rd) /(bhask.a*2);
	}
	
	cout << "\nX2 Calculado." << endl;
	system("PAUSE");
	return x2;
		
}

void ExibirGrau(struct grau bhask){

	cout << "\n\nValor de A: " << bhask.a;
	cout << "\nValor de B: " << bhask.b;
	cout << "\nValor de C: " << bhask.c;
	
	cout << "\nValor do Delta: " << bhask.d;
	cout << "\nAnálise do Delta: " << bhask.ad;
	
	cout << "\nRaiz X1: " << bhask.x1;
	cout << "\nRaiz X2: " << bhask.x2 << endl;
	
	system("PAUSE");
		
}

char telaGrau() {
	char opg;
	system("cls");
	cout << "MENU DO EXERCÍCIO 2o GRAU";
	cout << "\n1 - Inserir A";
	cout << "\n2 - Inserir B";
	cout << "\n3 - Inserir C";
	cout << "\n4 - Calcular Delta";
	cout << "\n5 - Analisar Delta";
	cout << "\n6 - Calcular X1";
	cout << "\n7 - Calcular X2";
	cout << "\n8 - Exibir Tudo";
	cout << "\nESC - Voltar";
	cout << "\n\nOpção escolhida: ";
	
	opg = getch();
	
	return opg;   
}

void menuGrau(){

	char opg;
	grau bhask;
	
		do { 
			opg = telaGrau();
			
			if (opg == '1'){   
				bhask.a = LerGrauA();      
			
			}else if (opg == '2'){   
				bhask.b = LerGrauB();  
			
			}else if (opg == '3'){   
				bhask.c = LerGrauC();  
			
			}else if (opg== '4'){   
				bhask.d = CDeltaGrau(bhask);
			 
			}else if (opg == '5'){    
    			bhask.ad = ADeltaGrau(bhask);   
			
			}else if (opg == '6'){    
				bhask.x1 = CX1Grau(bhask);
			
			}else if (opg == '7'){
				bhask.x2 = CX2Grau(bhask);  
			
			}else if (opg == '8'){
			ExibirGrau(bhask);    
			
			}else{
				if(opg != 27){
				cout << "\nOpção Inválida" << endl;
				system("PAUSE");
				}
			}
		} while (opg != 27);
}

char telaMenu () {
	char opm;
	system("cls");
	cout << "ESCOLHA O EXERCÍCIO";
	cout << "\n1 - Equação do Segundo Grau";
	cout << "\n2 - Propriedades do Circulo";
	cout << "\nEsc - Sair";
	cout << "\n\nOpção escolhida: ";
	
	opm = getch();
	
	return opm;   
}

void menu(){
	
	char opm;
	
		do { 
			opm = telaMenu();
			
			if (opm == '1'){   
				menuGrau();      
			}else if (opm == '2'){   
				menuCirc(); 
			}else{
				if(opm != 27){
				cout << "\nOpção Inválida" << endl;
				system("PAUSE");
				}
			}
		} while (opm != 27);
}

int main(){
	
    setlocale(LC_ALL, "portuguese");
	menu();
    return 0;
}