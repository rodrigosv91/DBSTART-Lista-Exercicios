package lista_exercicios.exercicio_05;

import java.util.Scanner;

public class Exercicio_05 {

    public static void main(String[] args) {
        
        /*
        Usar for
        5) Construa a tabuada de um número. (ex: 1x1=1, 1x2=2,...,1x10=10);
        */
        
        Scanner sc = new Scanner(System.in);
        
        System.out.println("Informe o numero a ser construida a tabuada");
        int num = sc.nextInt();
        
        System.out.println("TABUADA DO " + num);
        for(int i = 1; i <=10 ; i++){
            System.out.println(num + " X " + i + " = " + num * i );
        }        
              
        sc.close();                        
    }
    
}
