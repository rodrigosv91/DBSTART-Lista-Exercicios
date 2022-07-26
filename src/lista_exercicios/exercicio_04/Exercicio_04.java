package lista_exercicios.exercicio_04;

import java.util.Scanner;

public class Exercicio_04 {

    public static void main(String[] args) {
       
        /*
        Usar switch-case
        4) Implemente o programa da calculadora utilizando uma instrução 
            switch-case para determinar a operação que deve ser executada, 
            conforme o usuário escolheu no menu de opções.
        */
        Scanner sc = new Scanner(System.in);
                
        System.out.println("Calculadora");
        System.out.println("Opcoes: 1 somar | 2 subtrair | 3 multiplicar | 4 dividir");
        System.out.println("Digite a operacao que deseja executar:");
    
        int opcao = sc.nextInt();
        
        System.out.println("Digite o primeiro valor");
        double valor1 = sc.nextDouble();
        System.out.println("Digite o segundo valor");
        double valor2 = sc.nextDouble(); 
        
        switch (opcao){
            case 1: 
                System.out.println("Soma = " + (valor1 + valor2));
                break;
            case 2:
                System.out.println("Subtracao = " + (valor1 - valor2));
                break;
            case 3:
                System.out.println("Multiplicacao = " + (valor1 * valor2));
                break;
            case 4:
                if(valor2 == 0)
                    System.out.println("Em caso de divisao o segundo valor nao pode ser zero");
                else
                    System.out.println("Divisao = " + (valor1 / valor2));
                break;
            default:
                System.out.println("Opcao invalida");
        }
        
        sc.close();
    }
       
}
