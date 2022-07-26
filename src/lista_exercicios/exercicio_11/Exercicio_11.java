package lista_exercicios.exercicio_11;

public class Exercicio_11 {

    public static void main(String[] args) {
       
        /*
        11) Ordene um vetor de 100 números inteiros gerados aleatoriamente. (Pesquisar sobre Bubble Sort)
        */
        int TAMANHO = 100;
        int valorTemporario;
        
        int[] vetor = new int[TAMANHO];
        
        //Gera valores aleatorios no vetor
        for(int i = 0; i < TAMANHO; i++)
            vetor[i] = (int) (Math.random() * TAMANHO);
        
        //Mostra vetor gerado
        System.out.println("Vetor gerado");
        for(int i = 0; i < TAMANHO; i++)
            System.out.print(vetor[i] + " ");
        
        //Bubble Sort
        for(int i = 0; i < TAMANHO; i++)
            for(int j = 0 ; j < (TAMANHO -1); j++ ){
                if(vetor[j] > vetor[j+1]){
                    valorTemporario = vetor[j];
                    vetor[j] = vetor[j+1];
                    vetor[j+1] = valorTemporario;
                
                }
            } 
        //Mostra vetor ordenado        
        System.out.println("\nVetor ordenado");
        for(int i = 0; i < TAMANHO; i++)
            System.out.print(vetor[i] + " ");       
    }
    
}
