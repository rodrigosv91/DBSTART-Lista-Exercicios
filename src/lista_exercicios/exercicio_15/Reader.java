package lista_exercicios.exercicio_15;

import java.util.Scanner;

public class Reader {
    
    public static int leTermo(Scanner sc){
        int termo = validaInteiro(sc, "Termo invalido");
        return termo;
    }
    
    public static int leOpcao(Scanner sc){
        int opcao = validaInteiro(sc, "Opção precisa ser um inteiro");
        return opcao;
    }
    
    public static int validaInteiro(Scanner sc, String mensagem){
        while(!sc.hasNextInt()){
            System.out.println(mensagem + ", informe novamente:"); 
            sc.next();
            sc.nextLine();
        }
        return sc.nextInt();
    }
}
