package lista_exercicios.exercicio_01;

import java.util.Scanner;

public class Exercicio_01 {

    public static void main(String[] args) {
        /*
        Usar if-else
        1) Definir a idade de uma pessoa e verificar se ela é maior de idade ou não.
        */
        
        Scanner sc = new Scanner(System.in);
        
        System.out.println("Informe a idade:");
        int idade = sc.nextInt();
        
        if(idade < 18)
            System.out.println("Menor de idade");
        else
            System.out.println("Maior de idade");
        
        sc.close();
    }   
}
