/* script para trocar vogais por '@' 25183534*/
#include <stdio.h>
#include <stdlib.h>
#include <string.h>

int main(int argc, char const *argv[])
{
char frase[100], vogais[10] = "AaEeIiOoUu";
int i, j;

printf("Digite uma frase: ");
	fgets(frase, 100, stdin);


for(i = 0; i < 10; i++){ //Verificação das vogais
	for (j = 0; j < 100; j++) // Verificação na frase
	{
		if(frase[j] == vogais[i]){
     		frase[j] = '@';
			
		}
	}	
}

printf("Frase com @ nas vogais: %s\n", frase);

return 0;
}
