/* script para somar os 10 primeiros numeros pares de 1 a 100 
Exercicio 25568897
João Vitor Rodrigues Baptista*/

#include <stdio.h>
#include <stdlib.h>

int fun_par(int numb);
int main(int argc, char const *argv[])
{
int i, j, numb_result = 0, numb[100];

for (i = 0; i < 100; i++)
{
	numb[i] = fun_par(i);
	if (numb[i] != 0)
	{
		printf("%d\n", numb[i]);
	
	}	
}

for (j = 0; j < 21; j++)
{
	numb_result = numb_result + numb[j];
	if (numb[j] != 0)
	{
		printf("Numero dentro dos 10 primeiros: %d\n", numb[j]);
	
	}	
	
}


printf("Valor final da soma dos pares de 1 a 100: %d\n",numb_result);
return 0;
}

int fun_par(int numb){
		if(numb%2==0){
		return numb;
		}

		else{
		return 0; //Elemento neutro da soma
		}
	
		
	
}
