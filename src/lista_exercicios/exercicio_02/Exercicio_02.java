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
        
        final int VALOR_DESCONTO_BASE = 0;
        
        final int QUANTIDADE_PRODUTO_PARA_DESCONTO_MINIMO = 11;
        final int QUANTIDADE_PRODUTO_PARA_DESCONTO_MEDIO = 21;
        final int QUANTIDADE_PRODUTO_PARA_DESCONTO_MAXIMO = 51;
        
        final double VALOR_DESCONTO_MINIMO = 0.10;
        final double VALOR_DESCONTO_MEDIO = 0.20;
        final double VALOR_DESCONTO_MAXIMO = 0.25;
         
        Scanner sc = new Scanner(System.in);
        
        System.out.println("Informe o nome do produto:");    
        String nome_produto = sc.next();
        
        System.out.println("Informe o preco do produto");
        double preco_produto = sc.nextDouble();
        
        System.out.println("Informe a quantidade");
        int quantidade_produto = sc.nextInt();
        
        final double VALOR_PRODUTO_BASE = quantidade_produto * preco_produto;
        double desconto_produto = VALOR_DESCONTO_BASE;
        
        if(quantidade_produto >= QUANTIDADE_PRODUTO_PARA_DESCONTO_MINIMO && quantidade_produto < QUANTIDADE_PRODUTO_PARA_DESCONTO_MEDIO)
                desconto_produto = VALOR_PRODUTO_BASE * VALOR_DESCONTO_MINIMO ;       
        if(quantidade_produto >= QUANTIDADE_PRODUTO_PARA_DESCONTO_MEDIO && quantidade_produto < QUANTIDADE_PRODUTO_PARA_DESCONTO_MAXIMO)
                desconto_produto = VALOR_PRODUTO_BASE * VALOR_DESCONTO_MEDIO;      
        if(quantidade_produto >= QUANTIDADE_PRODUTO_PARA_DESCONTO_MAXIMO)
                desconto_produto = VALOR_PRODUTO_BASE * VALOR_DESCONTO_MAXIMO;
        
        System.out.println("Produto: " + nome_produto);
        System.out.println("Valor Total: " + ( VALOR_PRODUTO_BASE - desconto_produto));
        
        sc.close();            
    }   
}
