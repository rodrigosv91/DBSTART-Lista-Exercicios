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
        System.out.println("OPCOES: 1 SOMAR | 2 SUBTRAIR | 3 MULTIPLICAR | 4 DIVIDIR");
        System.out.println("\nDigite a operacao que deseja executar:");
        int opcao = sc.nextInt();
        System.out.println("Digite o primeiro valor:");
        double primeiro_numero = sc.nextDouble();
        System.out.println("Digite o segundo valor:");
        double segundo_numero = sc.nextDouble();
                 
        switch (opcao){
            case 1: 
                Calculadora.somar(primeiro_numero, segundo_numero);
                break;
            case 2:
                Calculadora.subtrair(primeiro_numero, segundo_numero);
                break;
            case 3:
                Calculadora.multiplicar(primeiro_numero, segundo_numero);
                break;
            case 4:
                Calculadora.dividir(primeiro_numero, segundo_numero);
                break;
            default:
                System.out.println("Opcão invalida");
        }        
        sc.close();      
    } 
}
