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
        final int VALOR_MAX = 3;
        final int VALOR_MIN = 1;
        Scanner sc = new Scanner(System.in);
        String[] jogadas = {"PEDRA", "PAPEL", "TESOURA"};          
        System.out.println("Digite: 1 para PEDRA | 2 para PAPEL | 3 para TESOURA");
        System.out.println("Informe a jogada:");      
        int jogadaUsuario = sc.nextInt();                   
        int jogadaMaquina = (int) ( (Math.random() * VALOR_MAX) + VALOR_MIN);
                   
        if(jogadaMaquina == jogadaUsuario){
            System.out.println("EMPATE");
        }
        else 
            if((jogadaUsuario == 1 && jogadaMaquina == 2) || (jogadaUsuario == 2 && jogadaMaquina == 3) || (jogadaUsuario == 3 && jogadaMaquina == 1))
                System.out.println("USUARIO PERDE");
        else{
            System.out.println("USUARIO VENCE");
        }
        
        System.out.println("Você jogou: " + jogadas[jogadaUsuario-1]);
        System.out.println("Maquina jogou: " + jogadas[jogadaMaquina-1]);            
        
        sc.close(); 
    } 
}
