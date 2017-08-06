#include <iostream>
#include <cstdlib>
#include <stdio.h>
#include <math.h>

using namespace std;

int main(){
	
	//Vitor Francisco Lamounier
	int op;
	
	while(1!=0){
                
    system("cls");
    cout << "MENU" << endl;
    cout << "1 - Volume de um cilindro" << endl;
    cout << "2 - Combustivel gasto em uma viagen" << endl;
    cout << "3 - Sair" << endl;
    cin >> op;
    
    if (op==1){
	
	float h, r,v;

	system("cls");
	cout << "Algoritmo para calcular volume de um cilindro.\n";
	cout << "Lata de oleo no caso.\n";
	
	cout << "\nInsira o raio da base da lata de oleo: ";
	cin >> r;
	
	cout << "\nInsira a altura da lata de oleo: ";
	cin >> h;

	r = pow(r,2);
	v = 3.14159*r*h;	

	cout << "\nRaio da lata: " << r << endl;
	cout << "Altura da lata: " << h << endl;
	
	cout << "\nVolume da lata: " << v << endl;
	
	system("pause");
	
	
	}else if(op==2){
		//Vitor Francisco Lamounier
	
	float t, v, d, c;
	
	system("cls");
	cout << "Algoritmo para calcular o combustivel gasto em uma viagem.\n";
	cout << "A partir do tempo de viagem e da velocidade media.\n";
	
	cout << "\nInsira o tempo de viagem (horas): ";
	cin >> t;
	
	cout << "\nInsira a velocidade media (km/h): ";
	cin >> v;

	d = t*v;

	c = d/12;
	//O carro faz 12 km por litro

	cout << "\nTempo de Viagem: " << t << " horas\n";
	cout << "Velocidade media: " << v << " km/h\n";
	
	cout << "\nDistancia percorrida: " << d << " km\n";
	
	cout << "\nCombustivel gasto: " << c << " litros\n";
	
	system("pause");
	}else{
		return 0;
	}
	
	}
}