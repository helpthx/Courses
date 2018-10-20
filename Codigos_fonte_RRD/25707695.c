//https://www.solbrilhando.com.br/Esportes/Boliche/Simulador_caixa.htm

#include <stdio.h>
#include <stdlib.h>
#define JOGADAS 18	

int main(void) {
    //int game[21] = {10, 9, 1, 6, 3, 7, 0, 8, 2, 0, 8, 2, 0, 8, 2, 0, 8, 10, 9, 1};	
    //int game[21] = {9,  1, 3 ,4 ,8 ,2 ,6 ,4 ,7 ,1 ,10, 8 ,2 ,5, 1 ,8 , 0, 7, 3, 0};
    //int game[] = {9, 1, 0, 10, 10, 10, 6, 2, 7, 3, 8, 2, 10, 9, 0, 9, 1 , 2, 0, 0};
    //int game[] = {10, 10, 10, 10, 10, 10, 10, 10, 10, 10, 10, 10 , 0, 0};
    int i, j, pontos_finais = 0;
    int game[21] = {0};
    printf("Digite os numeros sequencialmente... \n");
    printf("No final complente com zeros...\n");
    printf("No caso de strikes digite apenas a primeira jogada (10)\n");
    for (j = 0; j < 21; j++)
    {
    	scanf("%d\n", &game[j]);
    	
    }

    for(i=0; i < JOGADAS; i++) {
        if(game[i] == 10) {
            printf("STRIKE\n");
            pontos_finais = pontos_finais +  10 + game[i+1] + game[i+2]; 
        }
        else if (game[i]+game[i+1] == 10) {
            printf("SPARE\n");
            pontos_finais = pontos_finais + game[i] + game[i+1] + game[i+2];
            i++; 
        }
        else {
            printf("MISS\n");
            pontos_finais = pontos_finais + game[i] + game[i+1];
            i++;
        }
        
    }

    printf("Pontuação Final: %d\n", pontos_finais);
    return 0;
}