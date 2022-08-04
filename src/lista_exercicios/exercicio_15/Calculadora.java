package lista_exercicios.exercicio_15;

public class  Calculadora {
    
    public static void somar(double primeiro_termo, double segundo_termo){
        System.out.println("Soma = " + (primeiro_termo + segundo_termo));
    }
    
    public static void subtrair(double primeiro_termo, double segundo_termo){
        System.out.println("Subtração = " + (primeiro_termo - segundo_termo));
    }
    
    public static void multiplicar(double primeiro_termo, double segundo_termo){
        System.out.println("Multiplicação = " + (primeiro_termo * segundo_termo));
    }
    
    public static void dividir(double primeiro_termo, double segundo_termo){
        if(segundo_termo == 0)
            System.out.println("Em caso de divisao o segundo termo nao pode ser zero");
        else
            System.out.println("Divisao = " + (primeiro_termo / segundo_termo));
    }
    
    public static void mostraCabecalho(){
        System.out.println("Calculadora");
        System.out.println("OPCOES: 1 - SOMAR | 2 - SUBTRAIR | 3 - MULTIPLICAR | 4 - DIVIDIR");
        System.out.println("\nDigite a operacao que deseja executar:");
    }
}
