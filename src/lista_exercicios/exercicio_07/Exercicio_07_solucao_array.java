package lista_exercicios.exercicio_07;

import java.util.Scanner;

public class Exercicio_07_solucao_array {

    public static void main(String[] args) {
      
        /*
        7) Calcule a série de Fibonacci para um número inteiro não negativo
            informado pelo usuário. A série de Fibonacci inicia com os
            números F0 = 0 e F1 = 1, e cada número posterior equivale à soma
            dos dois números anteriores (Fn = Fn-1 + Fn-2). Por exemplo, caso
            o usuário informe o número 9, o resultado seria 0, 1, 1, 2, 3, 5,
            8, 13, 21, 34
        */      
        
        Scanner sc = new Scanner(System.in);                   
        System.out.println("Informe o numero a ser calculada a funcao:");
        int numeroEscolhido = sc.nextInt();
        
        int[] arrayFib =  new int[numeroEscolhido+1];
        
        // define pos 0 e 1       
        // percore guardando soma de n-1 e n-2 em n
        // mostra n
        
        arrayFib[0] = 0;
        arrayFib[1] = 1;
        
        for(int i = 0; i < arrayFib.length ; i++){
            if(i == 0 || i == 1 ){
                System.out.print(arrayFib[i] + " ");
            }
            else{
                arrayFib[i] = arrayFib[i-1] + arrayFib[i-2];
                System.out.print(arrayFib[i] + " ");           
            }          
        }      
    }    
}
