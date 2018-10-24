/* script para Entrar com vários números positivos e 
imprimir a média dos produtos digitados. 
Quando algum número negativo for digitado. 36273568*/

#include <stdio.h>
#include <stdlib.h>
#include <string.h>

int main(int argc, char const *argv[])
{
float media = 0, sum = 0, div = 0;
int numero_ver, numeros_in[100] = {0}, i, j;

for (i = 0; i < 100; i)
{
	printf("Digite um numero positivo: ");
	scanf("%d", &numero_ver);
	if (numero_ver > 0)
	{
		numeros_in[i] = numero_ver;
		i++;
		div++;
	}
	else
	{
		printf("Foi digitador um numero negativo ou zero. Printar a Média dos numeros digitados...\n");
		break;
	}
}

printf("%d\n", i);
for (j = 0; j < 100; j++)
{
	sum = sum + numeros_in[j];
}

media = (sum/div);

printf("A média é: %.3f\n", media);

return 0;
}