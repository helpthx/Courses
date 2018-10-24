/* script para Escreva uma função que calcula a área de um retângulo. 
(Área= base*altura) e receber como parâmetros 
a base e altura e deve retornar o valor da área. 37344921*/

#include <stdio.h>
#include <stdlib.h>
#include <string.h>


float calc_area(float b, float a);

int main(int argc, char const *argv[])
{
float area = 0, comp_base = 0, comp_altura = 0;

printf("------------------------------------------\n");
printf("Codigo para retonar a area de um retângulo\n");
printf("------------------------------------------\n");

printf("Digite o comprimento da base: ");
scanf("%f", &comp_base);

printf("Digite o comprimento da altura: ");
scanf("%f", &comp_altura);

area = calc_area(comp_base, comp_altura);

printf("A area é: %.3f\n", area);

return 0;
}

float calc_area(float b, float a){
	return (b*a);
}