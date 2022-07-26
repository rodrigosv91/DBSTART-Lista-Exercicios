package lista_exercicios.exercicio_07;

import java.util.Scanner;

public class Exercicio_07 {

    public static void main(String[] args) {
        
        /*
        7) Calcule a série de Fibonacci para um número inteiro não negativo
            informado pelo usuário. A série de Fibonacci inicia com os
            números F0 = 0 e F1 = 1, e cada número posterior equivale à soma
            dos dois números anteriores (Fn = Fn-1 + Fn-2). Por exemplo, caso
            o usuário informe o número 9, o resultado seria 0, 1, 1, 2, 3, 5,
            8, 13, 21, 34
         */      
        
        int ultimo = 0;
        int penultimo = 0;       
        int numGeradoDaSoma;      
        int numeroEscolhido;
        
        Scanner sc = new Scanner(System.in);
        
        System.out.println("Informe o numero a ser calculada a funcao:");
        numeroEscolhido = sc.nextInt();
        
        for (int i = 0; i <= numeroEscolhido ; i++){
            
            numGeradoDaSoma = penultimo + ultimo;         
            
            if(i == 0){
                System.out.print(i + " ");  
                ultimo = 0;
            }
            if(i == 1){ 
                System.out.print(i + " ");
                numGeradoDaSoma = ultimo + i;
                ultimo = numGeradoDaSoma;                
            }
            if(i > 1){
                penultimo = ultimo;
                ultimo = numGeradoDaSoma;
            
                System.out.print( ultimo + " ");           
            }                   
        }
        sc.close();
    }   
}
