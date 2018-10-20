/* script para printar frase, printar as 5 primeiras vogais 
e printar as ultimas 5 vogais. Exercicio 25193947
João Vitor Rodrigues Baptista*/

#include <stdio.h>
#include <stdlib.h>
#include <string.h>


char func_vec_vogal(char a);

int main(int argc, char const *argv[])
{
char frase[25], vogais[10] = "AaEeIiOoUu", vogal_1ida, cons_lida; 
char cons[] = "QqWwRrTtYyPpSsDdFfGgHhJjKkLlÇçZzXxCcVvBbNnMm";
int i, j = 0, k = 1;

printf("Digite uma frase com no minimo 10 letras e no maximo 20: ");
fgets(frase, 25, stdin);

for(i = 0; i < 25; i++){ //Verificação das vogai
		for (j = 0; j < 10; j++)
		{
			if(frase[i] == vogais[j] && k < 6){
			vogal_1ida = vogais[j];
			printf("Vogal %d: %c\n", k, vogal_1ida);
			k++;
			}	
		}
}
k = 5;
for(i = 25; 0 <= i; i--){ //Verificação das vogai
		for (j = 0; cons[j]; j++)
		{
			if(frase[i] == cons[j] && k > 0){
			cons_lida = cons[j];
			printf("Consoante %d: %c\n", k, cons_lida);
			k--;
			}	
		}
}



printf("Frase que você entrou: %s\n", frase);

return 0;
}


