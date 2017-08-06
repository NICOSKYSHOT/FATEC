#include "iostream"
#include "cstdlib"
#include "math.h"
#include "string.h"
#define tam 5
using namespace std;

//Vitor Francisco Lamounier 

int pos = -1;

struct lista {        
       int ida[tam];  
	   string nome[tam]; 
}; 

struct lista reg1;

int lerNumero() {
	int num;
	system("cls");
	cout << "\nDigite o Numero: "; 
	cin >> num; 
	return num;
}

void inserirNumero (int numero){  
	reg1.ida[pos] = numero ; 
	cout << "\nIdade inserida com sucesso.";
	cout << "\nPosição em que foi inserido: " << pos << endl; 
	system("pause");
}

string lerNome() {
	string nome;
	system("cls");
	cout << "\nDigite um Nome: "; 
	cin >> nome; 
	return nome;
}

void inserirNome (string nome){  
	pos ++;
	reg1.nome[pos] = nome ; 
	cout << "\nNome inserido com sucesso.";
	cout << "\nPosição em que foi inserido: " << pos << endl; 
	system("pause");
}

void exibirLista()    { 
	int i; 
	system("cls");
	cout << "\nLISTA";
	
	for (i=0;i<=pos;i++){ 
		cout << "\n" << reg1.ida[i] << " | " << reg1.nome[i] << "\n";
	}
	system("pause"); 
}

int buscaSequencial(int numero ){
	int posnum;// posição do número buscado
		for (posnum =0; posnum <= pos; posnum++ ){
			if (reg1.ida[posnum] == numero ) { 
			system("cls");
			cout << "\nPosição em que foi encontrado: " << posnum << endl;
			system("pause");
			return posnum;
		}
	}
	system("cls");
	cout << "\nERRO: Idade não encontrada!\n";
	system("pause");
	return -1;                   
}


int tela () { 
	int tecla = -1;
	system("cls");
	cout << "\nMENU"; 
	cout << "\n\n1 - Inserir Idade e Nome"; 
	cout << "\n2 - Exibir Estrutura"; 
	cout << "\n3 - Busca sequencial de um valor"; 
	cout << "\n4 - Sair"; 
	cout << "\n\nItem> "; 
	cin >> tecla; 
	return tecla ;  
}


void menu () {

     int numero, posBusca;
     string nome;
     int tecla = -1;
     
     
     while (tecla != 4){
        tecla = tela();
           
        if (tecla == 1){
			nome = lerNome();
            inserirNome(nome);
            
            numero = lerNumero();
            inserirNumero(numero);
            
           
             
        }else if (tecla == 2){           
            exibirLista();

        }else if (tecla == 3){ 
			numero = lerNumero();
            posBusca = buscaSequencial(numero); 
        }

    } 
}

int main () {
    setlocale(LC_ALL, "Portuguese");
    menu();
    return 0; 
}