package lista_exercicios.exercicio_20;

public class Calculadora {
    
    public static double calculaTroco(double pagamento, double valorPedido){
        return pagamento - valorPedido;
    }
    
    public static void calculaNotasEMoedas(double troco){
        System.out.println(String.format("\nTroco: R$ %.2f ", troco));
        
        int notas200, notas100, notas50, notas20, notas10, notas5, notas2, notas1, moedas50Cent, moedas25Cent, moedas10Cent, moedas5Cent, moedas1Cent;
        
        if(troco >= 200){
            notas200 =  (int) (troco / 200);
            troco = troco - (notas200 * 200);  
            System.out.println("Notas de R$ 200 : " + notas200);
        }
        
        if(troco >= 100){
            notas100 =  (int) (troco / 100); 
            troco = troco - (notas100 * 100);  
            System.out.println("Notas de R$ 100 : " + notas100);
        }
        
        if(troco >= 50){
            notas50 =  (int) (troco / 50);
            troco = troco - (notas50 * 50); 
            System.out.println("Notas de R$ 50 : " + notas50);
        }
        
        if(troco >= 20){
            notas20 =  (int) (troco / 20);
            troco = troco - (notas20 * 20); 
            System.out.println("Notas de R$ 20 : " + notas20);
        }
        
        if(troco >= 10){
            notas10 =  (int) (troco / 10);
            troco = troco - (notas10 * 10);   
            System.out.println("Notas de R$ 10 : " + notas10);
        }
        
        if(troco >= 5){
            notas5 =  (int) (troco / 5);
            troco = troco - (notas5 * 5);  
            System.out.println("Notas de R$ 5 : " + notas5);
        }
        
        if(troco >= 2){
            notas2 =  (int) (troco / 2);
            troco = troco - (notas2 * 2); 
            System.out.println("Notas de R$ 2 : " + notas2);
        }
        
        if(troco >= 1){
            notas1 =  (int) (troco / 1);
            troco = troco - (notas1 * 1);  
            System.out.println("Notas de R$ 1 : " + notas1);
        }
             
        //Verifica se há moedas no troco
        if(troco > 0){
            int trocoMoedas = (int) Math.round(troco*100);
            
            if(trocoMoedas >= 50){
                moedas50Cent =  (int) (trocoMoedas / 50);
                trocoMoedas = trocoMoedas - (moedas50Cent * 50); 
                System.out.println("Moedas de 50 centavos : " + moedas50Cent);
            }
            
            if(trocoMoedas >= 25){
                moedas25Cent =  (int) (trocoMoedas / 25);
                trocoMoedas = trocoMoedas - (moedas25Cent * 25); 
                System.out.println("Moedas de 25 centavos : " + moedas25Cent);
            }
            
            if(trocoMoedas >= 10){
                moedas10Cent =  (int) (trocoMoedas / 10);
                trocoMoedas = trocoMoedas - (moedas10Cent * 10);
                System.out.println("Moedas de 10 centavos : " + moedas10Cent);
            }
            
            if(trocoMoedas >= 5){
                moedas5Cent =  (int) (trocoMoedas / 5);
                trocoMoedas = trocoMoedas - (moedas5Cent * 5); 
                System.out.println("Moedas de 5 centavos : " + moedas5Cent);
            }
            
            if(trocoMoedas >= 1){
                moedas1Cent =  (int) (trocoMoedas / 1);
                //trocoMoedas = trocoMoedas - (moedas1Cent * 1);   
                System.out.println("Moedas de 1 centavo : " + moedas1Cent);
            }    
        }
    }
    
    
    public static void calculaMenorNumeroDeNotas(int troco){
        //TODO
    }
    
}
