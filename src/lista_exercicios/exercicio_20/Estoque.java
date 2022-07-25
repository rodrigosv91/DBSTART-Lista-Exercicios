package lista_exercicios.exercicio_20;

import java.util.ArrayList;

public class Estoque {
    private int id = 1;
    ArrayList<Produto> listaDeProdutos;
    
    private static Estoque instanciaEstoque = new Estoque();

    private Estoque() {       
        inicializarEstoque();
    }  
    
    public static Estoque getInstance() {
        return instanciaEstoque;
    }
    
    public void inicializarEstoque(){
        listaDeProdutos = new ArrayList<Produto>();
        cadastrarProduto(new Produto(Contador.gerarId(), "TV", 2000, 100));
        cadastrarProduto(new Produto(Contador.gerarId(), "PC", 2500, 50));
        cadastrarProduto(new Produto(Contador.gerarId(), "MESA", 500, 150));
        cadastrarProduto(new Produto(Contador.gerarId(), "MOUSE", 100, 100));
    }
    
    public Produto encontraProduto(String nome){       
        for(Produto produto : listaDeProdutos){
            if(produto.getNome().toUpperCase().equals(nome.toUpperCase()))
                return produto;           
        }             
        return null;
    }
    
    public Produto encontraProduto(int id){
        for(Produto produto : listaDeProdutos){
            if(produto.getId() == id)
                return produto;           
        }             
        return null;
    }
    
    public boolean cadastrarProduto(Produto produto){
        if(!this.listaDeProdutos.contains(encontraProduto(produto.getNome()))){
            this.listaDeProdutos.add(produto);
            return true;
        }
        else
            return false;
    }
    
    public void imprimeCatalogoDoEstoque(){
        listaDeProdutos.forEach(produto ->{
                System.out.print("Produto ID: " + produto.getId());
                System.out.print(" | Produto Nome : " + produto.getNome());
                System.out.print(" | Preco : R$ " + produto.getPreco());
                System.out.print(" | Quantidade em Estoque : " + produto.getQuantidadeEmEstoque() + "\n");              
            }             
        );
    }
    
    public boolean darBaixaEmEstoque(String nome, int quantidadeParaDarBaixa){
        Produto produto = encontraProduto(nome);
        
        if(produto.getQuantidadeEmEstoque() >= quantidadeParaDarBaixa){
            produto.setQuantidadeEmEstoque(produto.getQuantidadeEmEstoque() - quantidadeParaDarBaixa);
            return true;
        }
        else    
            return false;
    }
    
    public boolean darBaixaEmEstoque(int id, int quantidadeParaDarBaixa){
        Produto produto = encontraProduto(id);
        
        if(temEstoqueOuNao(produto, quantidadeParaDarBaixa)){
            produto.setQuantidadeEmEstoque(produto.getQuantidadeEmEstoque() - quantidadeParaDarBaixa);
            return true;
        }
        else    
            return false;
    }
            
    public void darAltaEmEstoque(String nome, int quantidadeParaDarBaixa){
        Produto produto = encontraProduto(nome);       
        produto.setQuantidadeEmEstoque(produto.getQuantidadeEmEstoque() + quantidadeParaDarBaixa);
    }       
    
    public void darAltaEmEstoque(int id, int quantidadeParaDarBaixa){
        Produto produto = encontraProduto(id);       
        produto.setQuantidadeEmEstoque(produto.getQuantidadeEmEstoque() + quantidadeParaDarBaixa);
    } 
    
    public int getQuantidadeAtualEmEstoque(Produto produto){
        return produto.getQuantidadeEmEstoque();
    }
    
    public int getPosicaoDoProdutoNaLista(Produto produto){
        return listaDeProdutos.indexOf(produto);
    }
    
    public boolean temEstoqueOuNao(Produto produto, int quantidadeParaDarBaixa){
        return getQuantidadeAtualEmEstoque(produto) >= quantidadeParaDarBaixa;
    }
    
}
