package lista_exercicios.exercicio_13;

import java.util.Scanner;

public class Exercicio_13 {

     public static void main(String[] args) {
        
         /*
         13) Faça um método que calcule a média de um aluno de acordo
            com o critério definido neste curso. Além disso, faça um outro
            método que informe o status do aluno de acordo com a tabela a
            seguir:
            - Nota acima de 6: “Aprovado”
            - Nota entre 4 e 6: “Verificação Suplementar”
            - Nota abaixo de 4: “Reprovado”
         
            Critério definido: Média = (2 x Prova 1 + 2 x Prova 2 + Trabalho) / 5
         */
         
         double prova1;
         double prova2;
         double trabalho;
         double media;
         Scanner sc = new Scanner(System.in);
         
         System.out.println("Informe a nota da prova 1:");
         prova1 = sc.nextDouble();
         System.out.println("Informe a nota da prova 2:");
         prova2 = sc.nextDouble();
         System.out.println("Informe a nota do trabalho:");
         trabalho = sc.nextDouble();
         
         media = calculaMedia(prova1, prova2, trabalho);
         
         System.out.println("Media = " + media);
         informaStatusAluno(media);              
    }
     
    public static double calculaMedia(double prova1, double prova2, double trabalho){   
        return ( (prova1 * 2) + (prova2 * 2) + trabalho ) / 5;
    }
     
    public static void informaStatusAluno(double media){
        if(media < 4){
            System.out.println("Reprovado");
        }else
        if(media >= 4 && media <= 6){
            System.out.println("Veridicacao Suplementar");
        }else{
            System.out.println("Aprovado");
        }
    }
    
}
