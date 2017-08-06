#include <iostream>
#include <stdlib.h>
#include <iomanip>
#include <math.h>
#include <windows.h>
#include <stdio.h>
#include <conio.h>

using namespace std;

int tam = 5; // definindo tamamanho da fila

//fila de números
struct fila{
	
	int fim;
	int inicio;
	
	int num[5];

	int inserirNum(int i){
		cout << "Digite o número: ";
		cin >> num[i];
		
		return num[i];
	}
	
} n;

//Verificar se está Cheia ou Vazia
bool filaVazia(fila n){
	
	if (n.fim == -1)
		return true;
	else
		return false;
	
}

bool filaCheia(fila n){
	
	if(n.fim == 5)
		return true;
	else
		return false;
	
}

//Adicionando valores ao topo da fila
fila inserir(fila n){
	double x;
	
	if (filaCheia(n)){
		
		cout << "A fila já está cheia!\n";
		system("PAUSE");
		return n;
		
	}else{
		
		for(int i = (n.fim+1); i < 5; i++){
			
			cout << "\nPosição Atual: " << i+1 << endl;
			x = n.inserirNum(i);
			n.fim ++;
			n.num[tam] = x;
		}
		
	}
				
	system("pause");
	return n;
}

fila remover(fila n){
	
	n.inicio = n.num[0];
	
	if (filaVazia(n)){
		
		cout << "A fila já está vazia!\n";
		system("PAUSE");
		return n;
		
	}
	
	cout << "\n\nNumero: " << n.num[0] << endl
		 << "Foi REMOVIDO" << endl
		 << "Numero: " << n.num[1] << endl
		 << "Tomou o LUGAR";
		 
	 	 n.num[5] = 0;
		 
	getch();
	for(int i=0;i<5;i++){
	n.num[i] = n.num[i+1];
	}
	
	n.fim--;
	return n;
	
}

fila exibirFila(fila n){
	
	cout << " v FIM DA FILA" << endl;
	     
	if (filaVazia(n)){
		
		cout << "A fila está vazia!\n";
		system("PAUSE");
		return n;
		
	} 
	
	for(int i = n.fim ; i >= 0; i --){
		
		cout << "\n\n P: " << i+1;
		cout << "\n N: " << n.num[i];

	}
	
	cout << "\n\n\n ^ INICIO DA FILA"
		 << "\n\n P = POSIÇÃO"
		 << "\n N = NÚMERO" << endl << "\n";
	getch();
	return n;
}

char telaPrincipal(){
	
	cout << "FILA DE NÚMEROS"
		 << "\n 1 - Inserir números no Fim da fila"
		 << "\n 2 - Remover números do Inicio da fila"
		 << "\n 3 - Exibir Fila"
		 << "\n ESC - Sair" << endl;
		 
	return getch();
}

void menuPrincipal(fila n1){
	char tecla;
	n1.fim= -1;

	while(tecla != 27){
		
		system("CLS");
		tecla = telaPrincipal();
		
		if(tecla == '1'){
			n1 = inserir(n1);
		}else if(tecla == '2'){
			n1 = remover(n1);
		}else if(tecla == '3'){
			system("CLS");
			exibirFila(n1);		
		}
		
	}
}

int main(){

	setlocale(LC_ALL, "PORTUGUESE");
	fila n1;

	menuPrincipal(n1);

	return 0;
}