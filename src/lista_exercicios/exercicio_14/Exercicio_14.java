package lista_exercicios.exercicio_14;

import java.util.Scanner;

public class Exercicio_14 {

    public static void main(String[] args) {
       
        /*
        14) Leia do usuário o tempo em segundos e escreva em horas,
            minutos e segundos. Utilize cinco métodos, para a leitura e escrita
            de dados e para obtenção de horas, minutos e segundos a partir
            do tempo em segundos.
            Ex: 7023 segundos equivalem a 1h57min3seg.
        */
        
        Scanner sc = new Scanner(System.in);
               
        int horas = 0;
        int minutos = 0;
               
        int tempo = leTempo(sc);        

        if(tempo >= 3600){
            horas = tempo / 3600;
            tempo = tempo % 3600;
        }
        
        if(tempo >= 60){
            minutos = tempo /60;
            tempo = tempo % 60;
        }
               
        System.out.println(formataTempo(horasToString(horas), minutosToString(minutos), segundosToString(tempo)));
        
    }
    // <editor-fold defaultstate="collapsed" desc="metodos">
    public static int leTempo(Scanner sc){
        System.out.println("Informe o tempo em segundos:");
        return sc.nextInt();
    }
    
    public static String horasToString(int horas){
        return horas > 0 ? horas + "h" : "";
    }
    
    public static String minutosToString(int minutos){
        return minutos > 0 ? minutos + "min" : "";
    }
    public static String segundosToString(int segundos){
        return segundos > 0 ? segundos + "seg" : "";
    }
    
    public static String formataTempo(String horas, String minutos, String segundos){
        if(horas.equals("") && minutos.equals("") && segundos.equals(""))
            return "00h00min00seg";
        else 
            return horas + minutos + segundos;
    }
    // </editor-fold>
}
