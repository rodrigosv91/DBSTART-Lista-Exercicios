package lista_exercicios.exercicio_20;

import java.util.Scanner;



public class Exercicio_20 { 

    public static void main(String[] args) {
              
        Scanner sc = new Scanner(System.in);
        int opcao = 0;
        Menu menu = new Menu();
        Pedido pedido = new Pedido(); 
        
        do{
            menu.controlaMenu();
            System.out.println("Digite a opcao desejada: "); 
            opcao = sc.nextInt();
            menu.switchCase(opcao, pedido, sc);
       }
        while(opcao != 0);
        
        sc.close();
    }
    
}
