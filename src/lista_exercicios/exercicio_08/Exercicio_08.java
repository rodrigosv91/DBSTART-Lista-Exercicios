package lista_exercicios.exercicio_08;

import java.util.Scanner;

public class Exercicio_08 {

    public static void main(String[] args) {
        /*
        8) Leia um número até que o usuário digite 10;
        */
        
        Scanner sc = new Scanner(System.in);
        int num = 0;
        do{
            System.out.println("Informe o numero: ");
            num = sc.nextInt();
        }while(num != 10);
               
        sc.close();
    }
    
}
