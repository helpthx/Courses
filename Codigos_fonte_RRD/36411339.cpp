#include<iostream>
#include<cmath>
#include<stdlib.h>
using namespace std;
float calcular função (float x)
{
    return pow (x,2) + x - 2;
}
int main ()
{
    char escolha = 'S';
    do
    {
        float x1, x2, qtdeRet, media, somaArea=0;
        cout <<" Calculo da area de uma funçao \n";
        cout <<" Sera usada a funçao: f(x)= x²+ x - 2 \n";
        cout <<"Informe a posição do x inicial ";
        cin >> a;
        cout <<" \n informe a posição do x final";
        cin >> b; 
        white(b < a)
        {
            cout<<"\n O valor de x inicial tem que ser menor do o do x final! \n";
            cout<<"informe a posiçao do x inicial: "
            cin >> a;
            cout<<"\n informe a posição do x final: ";
            cin>> b;
         } 
        cout<<" \n Em quantas partes quer dividir essa area ? ";
        cin >> qtdeRet;
        media = (b - a)/qtdeRet;
        for ( int i = 0; i < qtdeRet; i++)
        {
            float resultado = calcular funçao(a+(media/2))*media;
            if (resultado < 0)
        {
            resultado * = -1;
        }
        soma area += resulado;
        a += media;
        }
        cout << "\n A area da funçao e : "<<soma area<<"\n\n";
        cout << "Deseja continuar ? (S/N)";
        cout <<"\n\n";
    }
    while (escolha == 'S'|| escolha == 'S');
    system("pause");
    return 0;
}