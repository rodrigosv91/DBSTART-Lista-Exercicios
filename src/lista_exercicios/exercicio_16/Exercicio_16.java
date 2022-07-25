package lista_exercicios.exercicio_16;

import java.time.LocalDate;
import java.util.ArrayList;
import java.util.Scanner;

public class Exercicio_16 {

    public static void main(String[] args) {
       
        /*
        16) Faça um programa para controle de empréstimo de livros, com
            as classes Emprestimo, Livro e Pessoa.
        */
        
        Scanner sc = new Scanner(System.in);      
        ArrayList<Emprestimo> emprestimos = new ArrayList<Emprestimo>();
               
        System.out.println("Informe o nome do livro:");
        String nomeLivro = sc.next();
        System.out.println("Informe o nome da pessoa:");
        String nomePessoa = sc.next();
             
        Pessoa pessoa = new Pessoa(nomePessoa);
        Livro livro = new Livro(nomeLivro);
        
        Emprestimo emprestimo =  new Emprestimo(pessoa, livro, LocalDate.now(), LocalDate.now().plusDays(15));
        
        int diasAleatorios = (int) ((Math.random()* 29) +1) ;
        
        emprestimo.setDataDevolucaoEfetuada(LocalDate.now().plusDays(diasAleatorios));      
        emprestimos.add(emprestimo);
        
        //Emprestimo teste / Simula um lvro que nao foi devolvido 
        Emprestimo emprestimoTeste = new Emprestimo(new Pessoa("Joe"), new Livro("Mock"), LocalDate.now().minusDays(diasAleatorios), LocalDate.now().minusDays(diasAleatorios).plusDays(15));
        emprestimos.add(emprestimoTeste);
        
        System.out.println("Dias gerados de devolução: " + diasAleatorios + " ( > 15 = atraso | < 15 = no prazo)");
        
        System.out.println("\n#EMPRESTIMOS: ");
        for(int i = 0;  i < emprestimos.size() ; i++){
            System.out.println("\nLivro: " + emprestimos.get(i).getLivro().getNome());
            System.out.println("Pessoa Locadora: " + emprestimos.get(i).getPessoa().getNome());
            System.out.println("Data Emprestimo: " + emprestimos.get(i).getDataEmprestimo().toString());
            System.out.println("Data Devolucao Prevista: " + emprestimos.get(i).getDataDevolucaoPrevista().toString());
            emprestimos.get(i).getStatusEmprestimo();
        }
        
    }  
}
