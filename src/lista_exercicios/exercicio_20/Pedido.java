package lista_exercicios.exercicio_20;

import java.util.ArrayList;
import java.util.Scanner;

public class Pedido {
    private ArrayList<Item> listaDeItens;
    private double valorTotalDoPedido = 0;

    public Pedido() {
        listaDeItens = new ArrayList<Item>();
    }

    public ArrayList<Item> getListaDeItens() {
        return listaDeItens;
    }

    public void setListaDeItens(ArrayList<Item> listaDeItens) {
        this.listaDeItens = listaDeItens;
    }
          
    public void calculaValorTotal(){
        valorTotalDoPedido = 0;
        listaDeItens.forEach( item -> {
                item.defineValorTotal();
                valorTotalDoPedido = valorTotalDoPedido + item.getValorDoItem();
            }
        );      
    }
    
    public boolean adicionaItemNaLista(Produto produto, int quantidade){
        if(produto.getQuantidadeEmEstoque() >= quantidade){
            Item novoItem = new Item(produto, quantidade);
            listaDeItens.add(novoItem);
            return true;
        }
        else
            return false;     
    }

    public void imprimePedido(){
        listaDeItens.forEach( item ->{
                System.out.println("Item : " + item.getProduto().getNome());
                System.out.println("Quantidade :" + item.getQuantidade());
                System.out.println("Valor do item :" + item.getValorDoItem());
            }           
        );
    }
            
    public void imprimeValorTotal(){
        calculaValorTotal();
        System.out.println("Valor total do pedido: " + valorTotalDoPedido);
    }
           
    //TODO
    public void adicionaItem(){

        System.out.println("Informe o nome do produto: ");
        String nome = recebeNomeDoTeclado();

        System.out.println("Informe a quantidade");
        int quantidade = recebeQuantidadeDoTeclado();
        
        Estoque estoque = Estoque.getInstance();

        
        if((estoque.encontraProduto(nome) != null) && adicionaItemNaLista(estoque.encontraProduto(nome), quantidade)){
            estoque.darBaixaEmEstoque(nome, quantidade);
            System.out.println("Item adicionado com sucesso.");
        }
        
        else
            System.out.println("Não foi possivel adicionar o item.");
    }
            
    public String recebeNomeDoTeclado(){
        Scanner sc = new Scanner(System.in);
        String nome = sc.next();
        return nome;
    }
            
    public int recebeQuantidadeDoTeclado(){
        Scanner sc = new Scanner(System.in);
        int quantidade = sc.nextInt();
        return quantidade;
    }
                    
    public void limparCarrinho(){
        this.listaDeItens.clear();
    }
                            
                            
}
