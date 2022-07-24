package lista_exercicios.exercicio_20;

import java.util.Scanner;

public class Menu {
    
    public void controlaMenu(){
        System.out.println("\nSISTEMA SuperMercadoProva");
        System.out.println("1 - Mostrar estoque");
        System.out.println("2 - Adicionar produto ao estoque");
        System.out.println("3 - Adicionar item ao pedido");
        System.out.println("4 - Mostrar pedido");
        System.out.println("5 - Pagar pedido");
        System.out.println("6 - Limpar carrinho");

        System.out.println("0 - Sair");
    }
    
    public void mostraEstoque(){
        System.out.println("ESTOQUE:");
        Estoque.getInstance().imprimeCatalogoDoEstoque();
    }
    
    public void switchCase(int opcao, Pedido pedido, Scanner sc){
        switch(opcao){
            case 0 :
                System.out.println("Encerrando...");
                break;
            case 1 : 
                mostraEstoque();
                break;
            case 2 :
                adicionaProdutoAoEstoque(sc);               
                break;
            case 3 : 
                pedido.adicionaItem();               
                break;
            case 4 : 
                mostrarPedido(pedido);
                break;
            case 5 : 
                //pagar pedido
                break;
            case 6 : 
                limparPedido(pedido);
                break;
            default: 
                System.out.println("Opcao invalida.");     
        }
    }
    
    public void adicionaProdutoAoEstoque(Scanner sc){
        System.out.println("Digite o nome do produto: ");
        String nome = sc.next();
        System.out.println("Digite o preco do prduto: ");
        double preco = sc.nextDouble();
        System.out.println("Digite a quantidade: ");
        int quantidade = sc.nextInt();
        
        Produto produto = new Produto(Contador.gerarId(), nome, preco, quantidade);
        Estoque estoque = Estoque.getInstance();
        if(estoque.cadastrarProduto(produto)){
            System.out.println("Produto cadastrado com sucesso.");
        }else{
            System.out.println("Produto já existe no estoque.");
        }                        
    }
    
    public void mostrarPedido(Pedido pedido){
        if(!pedido.getListaDeItens().isEmpty()){
            pedido.imprimePedido();
            pedido.imprimeValorTotal();
        }else
            System.out.println("Não há items no pedido");    
    }
    
    public void limparPedido(Pedido pedido){
        pedido.limparCarrinho();
        System.out.println("Carrinho limpo.");
    }
    
    public void pagarPedido(){
        
    }
    
}