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
        
        emprestimos.add(emprestimo);
        
        System.out.println("#EMPRESTIMOS: ");
        for(int i = 0;  i < emprestimos.size() ; i++){
            System.out.println("Livro: " + emprestimos.get(i).getLivro().getNome());
            System.out.println("Pessoa Locadora: " + emprestimos.get(i).getPessoa().getNome());
            System.out.println("Data Emprestimo: " + emprestimos.get(i).dataEmprestimo.toString());
            System.out.println("Data Devolucao: " + emprestimos.get(i).dataDevolucao);
        }
        /*
        for(Emprestimo e : emprestimos){
            System.out.println("Livro: " +  e.getLivro().getNome());
            System.out.println("Pessoa Locadora: " + e.getPessoa().getNome());
            System.out.println("Data Emprestimo: " + e.dataEmprestimo.toString());
            System.out.println("Data Devolucao: " + e.dataDevolucao);
        }
        
        emprestimos.forEach((e) -> {
            System.out.println("Livro: " + e.getLivro().getNome());
            System.out.println("Pessoa Locadora: " + e.getPessoa().getNome());
            System.out.println("Data Emprestimo: " + e.dataEmprestimo.toString());
            System.out.println("Data Devolucao: " + e.dataDevolucao);
        });
        */
    }
    
}
