package lista_exercicios.exercicio_12;

public class Exercicio_12 {

    public static void main(String[] args) {
       
        /*
        12) Crie dois vetores de 50 posições com valores inteiros aleatórios,
            ordene cada vetor individualmente, e combine os dois vetores
            gerando um novo vetor de 100 posições, ordenando esse novo.
        */
        
        int TAMANHO = 50;
        
        int[] vetor1 = new int[TAMANHO];
        int[] vetor2 = new int[TAMANHO];
        
        //Gera valores aleatorios nos vetores
        for(int i = 0; i < TAMANHO; i++){
            vetor1[i] = (int) (Math.random() * TAMANHO);
            vetor2[i] = (int) (Math.random() * TAMANHO);
        }
        
        //Mostra vetores gerado
        System.out.println("Vetor 1:");
        mostraVetor(vetor1);
                  
        System.out.println("\nVetor 2:");
        mostraVetor(vetor2);
         
        //Ordena vetores
        ordenaVetor(vetor1);
        ordenaVetor(vetor2);
        
        //Mostra vetores ordenado  
        System.out.println("\n\nVetor 1 ordenado:");
        mostraVetor(vetor1);

        System.out.println("\nVetor 2 ordenado:");
        mostraVetor(vetor2);
        
        //combina vetores
        int tamanhoNovoVetor = vetor1.length + vetor2.length;
        int[] vetorCombinado = new int[tamanhoNovoVetor];
              
        for(int i = 0, j = 0; i < tamanhoNovoVetor; i++){
            if(i < vetor1.length)
                vetorCombinado[i] = vetor1[i];
            else{
                vetorCombinado[i] = vetor2[j];
                j++;
            }      
        }
        
        //Ordena e mostra vetor combinado
        System.out.println("\n\nVetor combinado:");
        mostraVetor(vetorCombinado);
        
        ordenaVetor(vetorCombinado);
        
        System.out.println("\nVetor combinado ordenado:");
        mostraVetor(vetorCombinado);
        
    }
    
    public static void mostraVetor(int[] vetor){
        for(int i = 0; i < vetor.length; i++)
            System.out.print(vetor[i] + " ");   
    }
    
    public static int[] ordenaVetor(int[] vetor){
        int valorTemporario;
        
        for(int i = 0; i < vetor.length; i++)
            for(int j = 0 ; j < (vetor.length -1); j++ ){
                if(vetor[j] > vetor[j+1]){
                    valorTemporario = vetor[j];
                    vetor[j] = vetor[j+1];
                    vetor[j+1] = valorTemporario;
                }
            }
      return vetor;
    }
    
}
