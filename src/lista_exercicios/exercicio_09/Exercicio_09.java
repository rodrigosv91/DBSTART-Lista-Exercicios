package lista_exercicios.exercicio_09;

import java.util.Scanner;

public class Exercicio_09 {

    public static void main(String[] args) {
        
        /*
        9) Altere o exercício 7 para o algoritmo contar a série Fibonacci até 
            um determinado número. Por exemplo, caso declarado o número 
            25, o resultado seria: 0, 1, 1, 2, 3, 5, 8, 13, 21.
        */
        
        int ultimo = 0;
        int penultimo = 0;       
        int numGeradoDaSoma = 0;  
        int numeroEscolhido;
        
        Scanner sc = new Scanner(System.in);             
        
        System.out.println("Informe o numero a ser calculada a funcao:");
        numeroEscolhido = sc.nextInt();
        
        int i = 0;
        
        while(numGeradoDaSoma <= numeroEscolhido){
        
            if(i == 0){               
                System.out.print( ultimo + " ");
                if(numeroEscolhido == 0)
                    break;
            }
            if(i == 1){
                ultimo = 1;                    
                System.out.print( ultimo + " ");
            }

            if(i > 1){           
                penultimo = ultimo;
                ultimo = numGeradoDaSoma;                 
                System.out.print( ultimo + " ");
            }

            numGeradoDaSoma = penultimo + ultimo;

            i++;        
        }
        
        sc.close();
    }
    
}
