package lista_exercicios.exercicio_17;

public class Pessoa {
    private String nome;
    private int idade;
    
    private Pessoa mae = null;
    private Pessoa pai = null;

    public Pessoa(String nome, int idade) {
        this.nome = nome;
        this.idade = idade;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public int getIdade() {
        return idade;
    }

    public void setIdade(int idade) {
        this.idade = idade;
    }

    public Pessoa getMae() {
        return mae;
    }

    public void setMae(Pessoa mae) {
        this.mae = mae;
    }

    public Pessoa getPai() {
        return pai;
    }

    public void setPai(Pessoa pai) {
        this.pai = pai;
    }
    
    public void mostrarArvoreGenealogica(){
        if( (mae != null) || (pai != null))
            System.out.println("Pessoa: " + this.nome);
        
        if(this.mae != null){
            System.out.print(" Filho(a) de: " + mae.getNome());
            
        }
        
        if( (mae != null) && (pai != null))
            System.out.print(" e");
        
        if(this.pai != null){
            System.out.print(" Filho(a) de: " + pai.getNome());
            System.out.println();
        }
        
        
        
        
        if(this.mae != null)
            mae.mostrarArvoreGenealogica();
        if(this.pai != null)
            pai.mostrarArvoreGenealogica();
        
    }
}
