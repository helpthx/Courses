/* script para escrever um algoritmo para imprimir os números de 
1 inclusive a 10 inclusive em em ordem decrescente. 53894163*/

#include <stdio.h>
#include <stdlib.h>
#include <string.h>



int main(int argc, char const *argv[])
{

int seq[10] = {1, 2, 3, 4, 5, 6, 7, 8, 9, 10}, i, j;

printf("------------------------------------------\n");
printf("Codigo para printar de 1 a 10 decrescente.\n");
printf("------------------------------------------\n");

printf("Sequencia de 1 a 10: \n");
for (int i = 0; i < 10; ++i)
{
	printf("%d ", seq[i]);
}
printf("\n");

for (j = 9; j >= 0; j--)
{
	printf("%d ", seq[j]);
}
printf("\n");


return 0;
}

