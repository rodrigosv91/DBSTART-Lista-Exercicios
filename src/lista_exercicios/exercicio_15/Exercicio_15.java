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
        Calculadora.mostraCabecalho();
        int opcao = Reader.leOpcao(sc);
        System.out.println("Digite o primeiro termo:");
        double primeiro_termo = Reader.leTermo(sc);
        System.out.println("Digite o segundo termo:");
        double segundo_termo = Reader.leTermo(sc);
                 
        switch (opcao){
            case 1: 
                Calculadora.somar(primeiro_termo, segundo_termo);
                break;
            case 2:
                Calculadora.subtrair(primeiro_termo, segundo_termo);
                break;
            case 3:
                Calculadora.multiplicar(primeiro_termo, segundo_termo);
                break;
            case 4:
                Calculadora.dividir(primeiro_termo, segundo_termo);
                break;
            default:
                System.out.println("Opcão invalida");
        }        
        sc.close();      
    } 
}
