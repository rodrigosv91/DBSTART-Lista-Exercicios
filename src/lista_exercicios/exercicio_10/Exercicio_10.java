package lista_exercicios.exercicio_10;

import java.util.Scanner;

public class Exercicio_10 {

    public static void main(String[] args) {
        
        /*
        10) Leia uma matriz quadrada e determine a soma da diagonal principal.
        */
        
        Scanner sc = new Scanner(System.in);
        
        System.out.println("Informe o tamanho da matriz quadrada");
        int TAMANHO = sc.nextInt();    
        
        int[][] matriz = new int[TAMANHO][TAMANHO];
        int LINHA, COLUNA, soma = 0;
        
        //Lê Matriz
        for(LINHA = 0;  LINHA < TAMANHO; LINHA++){
            for(COLUNA = 0; COLUNA < TAMANHO ; COLUNA++){
                System.out.println("Informe o proximo elemento: ");
                matriz[LINHA][COLUNA] = sc.nextInt();
            }
        }
        
        //Mostra matriz e calcula matriz
        System.out.println("Matriz: ");
        for (LINHA = 0; LINHA < TAMANHO; LINHA++) {
            for (COLUNA = 0; COLUNA < TAMANHO; COLUNA++){
                    System.out.print(matriz[LINHA][COLUNA] + "  ");
                    if(LINHA == COLUNA)
                        soma += matriz[LINHA][COLUNA];
            }
            System.out.println();
        }
        
        System.out.println("Soma da diagonal principal: "  + soma);
 
    }
    
}
