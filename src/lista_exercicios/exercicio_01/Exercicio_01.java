package lista_exercicios.exercicio_01;

import java.util.Scanner;

public class Exercicio_01 {

    public static void main(String[] args) {
        /*
        Usar if-else
        1) Definir a idade de uma pessoa e verificar se ela é maior de idade ou não.
        */
        
        Scanner sc = new Scanner(System.in);
        System.out.println("Informe a idade da pessoa:");
        int idade = sc.nextInt();
        System.out.println(testaSeEhMaiorOuMenorDeIdade(idade));
        sc.close();
    }

    public static String testaSeEhMaiorOuMenorDeIdade(int idade){
        if(idade < 18)
           return "Pessoa menor de idade";
        else
            return "Pessoa maior de idade";
    }
}
