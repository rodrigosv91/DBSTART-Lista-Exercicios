package lista_exercicios.exercicio_06;

public class Exercicio_06 {

    public static void main(String[] args) {
        
    /*
    Usar for
    6) Gere 10 números aleatórios entre 0 e 100; mostre todos na tela 
        (em uma única linha); identifique o menor e o maior deles.
    */
        int[] numeros = new int[10]; 
    
        for(int i = 0; i<10; i++){
            //(int) ((Math.random() * (max - min)) + min)
            numeros[i] = (int) ( Math.random() * 100 ); 
        }
        
        int menor = numeros[0];
        int maior = numeros[0];       
        
        for(int i = 1; i <10 ; i++){
            if(menor > numeros[i])
                menor = numeros[i];
            if(maior < numeros[i])
                maior = numeros[i];
        }
        System.out.println("Numeros gerados:");
        for(int i = 0; i < 10; i++){
            System.out.print(numeros[i]+ " "); 
        }
        System.out.println("\nO maior numero é: " +  maior);
        System.out.println("O menor numero é: " + menor);
    }
    
}
