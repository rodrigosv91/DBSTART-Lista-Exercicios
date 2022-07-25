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

    public double getValorTotalDoPedido() {
        return valorTotalDoPedido;
    }

    public void setValorTotalDoPedido(double valorTotalDoPedido) {
        this.valorTotalDoPedido = valorTotalDoPedido;
    }           
    
    public void calculaValorTotal(){
        setValorTotalDoPedido(0);
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
            calculaValorTotal();
            return true;
        }
        else
            return false;     
    }

    public void desfazerPedido(){
        Estoque estoque = Estoque.getInstance();
        ArrayList<Item> listaDeItensASerRemovidos = new ArrayList<Item>();
        
        for(Item item : getListaDeItens()){                          
            //darAlta no estoque
            estoque.darAltaEmEstoque(item.getProduto().getNome(), item.getQuantidade());          
            //remove da lista
            listaDeItensASerRemovidos.add(item);
        }           
        listaDeItens.removeAll(listaDeItensASerRemovidos);
    }
    
    public void imprimePedido(){
        listaDeItens.forEach( item ->{
                System.out.println("Item : " + item.getProduto().getNome());
                System.out.println("Quantidade : " + item.getQuantidade());
                System.out.println(String.format("Valor do item: R$ %.2f ", item.getValorDoItem()));
            }           
        );
    }
            
    public void imprimeValorTotal(){
        
        System.out.println(String.format("Valor total do pedido: R$ %.2f ", getValorTotalDoPedido()));
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
