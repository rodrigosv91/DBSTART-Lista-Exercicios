package lista_exercicios.exercicio_17;

public class Exercicio_17 {

    public static void main(String[] args) {
       
        /*
        17) Faça um programa para representar a árvore genealógica de
            uma família. Para tal crie uma classe Pessoa que permita indicar 
            além de nome e idade, o pai e a mãe. Tenha em mente que pai e
            mãe também são do tipo Pessoa.
        */
        
        //Bisavo
        Pessoa bisavo1 =  new Pessoa("Manuel", 95);
        
        //Avôs maternos
        Pessoa avo_materno1 = new Pessoa("Maria Freitas", 70);
        Pessoa avo_materno2 = new Pessoa("Joel Freitas", 75);
        
        //Avôs paternos     
        Pessoa avo_paterno1 = new Pessoa("Irene Silva", 65);
        Pessoa avo_paterno2 = new Pessoa("Lineu Silva", 70);
        
        //Pais
        Pessoa mae = new Pessoa("Rosa Freitas Silva", 45);
        Pessoa pai = new Pessoa("Saulo Freitas Silva", 45);
        
        //Filho
        Pessoa filho = new Pessoa("Pedro Freitas da Silva", 25);
        
        //Add bisavo
        avo_materno1.setPai(bisavo1);
        
        //Add pais mae
        mae.setMae(avo_materno1);
        mae.setPai(avo_materno2);
        
        //Add pais pai
        pai.setMae(avo_paterno1);
        pai.setPai(avo_paterno2);
        
        //Add pais filho
        filho.setMae(mae);
        filho.setPai(pai);
        
        filho.mostrarArvoreGenealogica();
    }
    
}
