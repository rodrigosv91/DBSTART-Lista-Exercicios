package lista_exercicios.exercicio_02;

import java.util.Scanner;

public class Exercicio_02 {

    public static void main(String[] args) {     
        /*
        Usar if-else
        2) Para cada produto informado (nome, preço e quantidade), escreva o 
            nome do produto comprado e o valor total a ser pago, considerando 
            que são oferecidos descontos pelo número de unidades compradas, 
            segundo a tabela abaixo:
            a. Até 10 unidades: valor total
            b. De 11 a 20 unidades: 10% de desconto
            c. De 21 a 50 unidades: 20% de desconto
            d. Acima de 50 unidades: 25% de desconto
        */
        
        Scanner sc = new Scanner(System.in);
        
        System.out.println("Informe o nome do produto:");    
        String nome = sc.next();
        
        System.out.println("Informe o preco do produto");
        double preco = sc.nextDouble();
        
        System.out.println("Informe a quantidade");
        double quantidade = sc.nextDouble();
        
        double valorBase = quantidade*preco;
        double desconto = 0; // inicializacao necessária
        
        if(quantidade < 10)
            desconto = 0;
        else 
            if(quantidade <= 20)
                desconto = valorBase * 0.10 ;
        else 
            if(quantidade <= 50)
                desconto = valorBase * 0.2;
        else
            desconto = valorBase * 0.25;
        
        System.out.println("Produto: " + nome);
        System.out.println("Valor Total: " + ( valorBase - desconto));
        
        sc.close();            
    }   
}
