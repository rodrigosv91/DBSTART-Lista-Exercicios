package lista_exercicios.exercicio_19;

import java.util.ArrayList;
import java.util.Scanner;

public class Exercicio_19 {

    public static void main(String[] args) {
        
        /*
        19) Implemente um sistema de agenda telefônica. Faça (ao menos) 
            as interações de adicionar e deletar números.
        */
                
        ArrayList<Contato> contatos = new ArrayList<Contato>();
        
        Scanner sc = new Scanner(System.in);
        int opcao = 0;
        
        do{
            System.out.println("\n######MENU#######");
            System.out.println("|1 - Listar contatos | 2 - inserir | 3 - remover |  0 - sair");
            System.out.println("Digite a opcao desejada:");
            opcao = sc.nextInt();
            
            switch(opcao){
                case 1:                    
                    mostraContatos(contatos, "#LISTA");
                    break;
                case 2:
                    adicionaContato(contatos, sc);
                    break;
                case 3:
                    removeContato(contatos, sc);
                    break;
                case 0:
                    System.out.println("Encerrando...");
                    break;
                default: 
                    System.out.println("Opcao invalida");
            }
        }while(opcao != 0);
       
    }
    
    public static void mostraContatos(ArrayList<Contato> contatos, String tituloLista){
        System.out.println(tituloLista);
        for(int i = 0; i < contatos.size(); i++){
            System.out.print("\n|Posicao: " + i);
            System.out.print(" | Nome: " + contatos.get(i).getNome());
            System.out.print(" | Numero: " + contatos.get(i).getNumero());
        }
        System.out.println();
    }
    
    public static void adicionaContato(ArrayList<Contato> contatos, Scanner sc){
        System.out.println("Informe o nome do contato:");
        String nome = sc.next();
        System.out.println("Informe o numero do contato:");
        String numero = sc.next();                  
        Contato contato = new Contato(nome, numero);
        contatos.add(contato);
    }
    
    public static void removeContato(ArrayList<Contato> contatos, Scanner sc){
        System.out.println("Informe a posicao do contato a ser removido:");
        int pos = sc.nextInt();
        if(pos < contatos.size()){
            contatos.remove(pos);
            System.out.println("Contato removido.");
            mostraContatos(contatos, "#NOVA LISTA");
        }else
            System.out.println("Contato invalido.");   
    }
}
