package lista_exercicios.exercicio_20;

public class Contador {
    private static int contador = 0;
    
    public static int gerarId(){
        contador++;
        return contador;
    }
}
