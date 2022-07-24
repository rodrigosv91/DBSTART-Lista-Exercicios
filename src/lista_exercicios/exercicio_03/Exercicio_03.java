package lista_exercicios.exercicio_03;

import java.util.Scanner;

public class Exercicio_03 {

    public static void main(String[] args) {
        /*
        Usar if-else
        3) Implemente um jogo Jokenpo (Pedra, papel ou tesoura). Será o 
            jogador contra a máquina. O código tem que gerar as posições 
            aleatoriamente e comparar com o que escolhemos.
        */
        System.out.println((int) 1.1);
        Scanner sc = new Scanner(System.in);
               
        System.out.println("Digite: 1 para PEDRA | 2 para PAPEL | 3 para TESOURA");
        System.out.println("Informe a jogada:");
        
        int jogadaUsuario = sc.nextInt();
        
        String[] jogadas = {"PEDRA", "PAPEL", "TESOURA"};
        
        //gera numero entre zero e um 
        //multiplica por 2 (resultado entre 0 e 1.9)
        //cast da part inteira para int
        int jogadaMaquina = (int) ( (Math.random() * 2) + 1);
        
        if(jogadaMaquina == jogadaUsuario)
            System.out.println("EMPATE");
        else
            if(jogadaUsuario == 1 && jogadaMaquina == 2)
                System.out.println("USUARIO PERDE");
        else
            if(jogadaUsuario == 2 && jogadaMaquina == 3)
                System.out.println("USUARIO PERDE");
        else
            if(jogadaUsuario == 3 && jogadaMaquina == 1)
                System.out.println("USUARIO PERDE");
        else
            if(jogadaUsuario == 2 && jogadaMaquina == 1)
                System.out.println("USUARIO VENCE");
        else
            if(jogadaUsuario == 3 && jogadaMaquina == 2)
                System.out.println("USUARIO VENCE");
        else
            if(jogadaUsuario == 1 && jogadaMaquina == 3)
                System.out.println("USUARIO VENCE");
                
        System.out.println("Você jogou: " + jogadas[jogadaUsuario-1]);
        System.out.println("Maquina jogou :" + jogadas[jogadaMaquina-1]);            
        
        sc.close();  
    }
    
}
