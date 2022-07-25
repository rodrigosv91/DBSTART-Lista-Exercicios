package lista_exercicios.exercicio_16;

import java.time.LocalDate;

public class Emprestimo {
    private Pessoa pessoa;
    private Livro livro;
    
    private LocalDate dataEmprestimo;
    private LocalDate dataDevolucaoPrevista;
    private LocalDate dataDevolucaoEfetuada;

    public Emprestimo(Pessoa pessoa, Livro livro, LocalDate dataEmprestimo, LocalDate dataDevolucao) {
        this.pessoa = pessoa;
        this.livro = livro;
        this.dataEmprestimo = dataEmprestimo;
        this.dataDevolucaoPrevista = dataDevolucao;
    }

    public Pessoa getPessoa() {
        return pessoa;
    }

    public void setPessoa(Pessoa pessoa) {
        this.pessoa = pessoa;
    }

    public Livro getLivro() {
        return livro;
    }

    public void setLivro(Livro livro) {
        this.livro = livro;
    }

    public LocalDate getDataEmprestimo() {
        return dataEmprestimo;
    }

    public void setDataEmprestimo(LocalDate dataEmprestimo) {
        this.dataEmprestimo = dataEmprestimo;
    }

    public LocalDate getDataDevolucao() {
        return dataDevolucaoPrevista;
    }

    public void setDataDevolucao(LocalDate dataDevolucao) {
        this.dataDevolucaoPrevista = dataDevolucao;
    }

    public LocalDate getDataDevolucaoPrevista() {
        return dataDevolucaoPrevista;
    }

    public void setDataDevolucaoPrevista(LocalDate dataDevolucaoPrevista) {
        this.dataDevolucaoPrevista = dataDevolucaoPrevista;
    }

    public LocalDate getDataDevolucaoEfetuada() {
        return dataDevolucaoEfetuada;
    }

    public void setDataDevolucaoEfetuada(LocalDate dataDevolucaoEfetuada) {
        this.dataDevolucaoEfetuada = dataDevolucaoEfetuada;
    }    
    
    public void getStatusEmprestimo(){
        if((dataDevolucaoEfetuada == null) && LocalDate.now().isAfter(dataDevolucaoPrevista) ){
            System.out.println("Livro não devolvido e atrasado.");
        }
        else 
            if((dataDevolucaoEfetuada == null) && (LocalDate.now().isBefore(dataDevolucaoPrevista) || LocalDate.now().equals(dataDevolucaoPrevista) ) ){
            System.out.println("Livro ainda não devolvido mas dentro do prazo.");
        }
        else
            if(dataDevolucaoEfetuada.isBefore(dataDevolucaoPrevista) || dataDevolucaoEfetuada.isEqual(dataDevolucaoPrevista) ){
                System.out.println("Livro devolvido dentro do prazo");
            }
        else
            System.out.println("Livro devolvido com atraso");
    }
}
