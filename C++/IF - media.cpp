#include <iostream>
#include <cstdlib>
#include <stdio.h>
#include <math.h>
#include <string.h>

using namespace std;

int main(){
	
	//Vitor Francisco Lamounier
	
	float n1, n2, media;
	string sit;
	//n1 e n2 = notas
	// sit = situação do aluno
	
	system("cls");
	cout << "Algoritmo para calculo de media e definir situacao do aluno.\n";
	cout << "Obs: A situação pode ser Aprovado ou Reprovado.\n";
	
	cout << "\nInsira a primeira nota: ";
	cin >> n1;
	
	cout << "\nInsira a segunda nota: ";
	cin >> n2;
	
	media = (n1+n2)/2;
	
	if (media>=6)
		sit = "APROVADO";
	else
		sit = "REPROVADO";
	
	cout << "\nMedia: " << media << "\n";
	cout << "\nSituacao: " << sit << "\n";
	system("pause");
	return 0;
}