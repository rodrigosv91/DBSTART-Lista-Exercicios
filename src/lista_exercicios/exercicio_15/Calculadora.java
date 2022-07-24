package lista_exercicios.exercicio_15;

public class  Calculadora {
    
    public static void somar(double valor1, double valor2){
        System.out.println("Soma = " + (valor1 + valor2));
    }
    
    public static void subtrair(double valor1, double valor2){
        System.out.println("Soma = " + (valor1 - valor2));
    }
    
    public static void multiplicar(double valor1, double valor2){
        System.out.println("Soma = " + (valor1 * valor2));
    }
    
    public static void dividir(double valor1, double valor2){
        if(valor2 == 0)
            System.out.println("Em caso de divisao o segundo valor nao pode ser zero");
        else
            System.out.println("Divisao = " + (valor1 / valor2));
    }
}
