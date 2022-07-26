package lista_exercicios.exercicio_15;

import java.util.Scanner;

public class Exercicio_15 {

    public static void main(String[] args) {
        
        /*
        15) Crie uma classe Calculadora que faça as operações de soma, 
            subtração, multiplicação, divisão e potenciação. Cada operação 
            deve ser um método e todos os métodos devem ser estáticos.
            Para fazer a escolha das operações use como base o exercício 4
        */
        
        Scanner sc = new Scanner(System.in);
                
        System.out.println("Calculadora");
        System.out.println("Opcoes: 1 somar | 2 subtrair | 3 multiplicar | 4 dividir");
        System.out.println("\nDigite a operacao que deseja executar:");
    
        int opcao = sc.nextInt();
        
        System.out.println("Digite o primeiro valor:");
        double valor1 = sc.nextDouble();
        System.out.println("Digite o segundo valor:");
        double valor2 = sc.nextDouble();
                
        switch (opcao){
            case 1: 
                Calculadora.somar(valor1, valor2);
                break;
            case 2:
                Calculadora.subtrair(valor1, valor2);
                break;
            case 3:
                Calculadora.multiplicar(valor1, valor2);
                break;
            case 4:
                Calculadora.dividir(valor1, valor2);
                break;
            default:
                System.out.println("Opcao invalida");
        }
         
        sc.close();
    }
    
}
