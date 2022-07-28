package lista_exercicios.exercicio_18;

public class Exercicio_18 {

    public static void main(String[] args) {
        /*
        18) Faça uma classe Automóvel, identificando seus atributos e 
            métodos. Herdando tais características, crie três classes: Carro, 
            Moto e Guincho. Herdando Carro, faça uma classe 
            CarroAutomático, na qual, para poder ligar, o freio precisa estar 
            sendo pressionado. Herdando Moto, faça uma classe 
            MotoPartidaPedal, onde, para ligar, o acelerador precisa estar 
            puxado. O guincho pode carregar tanto carro quanto moto. Utilize 
            os 4 pilares da POO.
        */
       
        //Carro Automatico
        CarroAutomatico carroAut = new CarroAutomatico(4, 300);
        carroAut.ligar();
        carroAut.setFreioPressionado(true);
        carroAut.ligar();
        
        //Moto Partida Pedal
        MotoPartidaPedal motoPP = new MotoPartidaPedal(2, 200);
        motoPP.ligar();
        motoPP.setAceleradorPressionado(true);
        motoPP.ligar();
        
        //Guincho
        Guincho guincho1 = new Guincho(6, 150);
        Guincho guincho2 = new Guincho(6, 150);
        guincho1.guincharAutomovel(guincho2);
        guincho1.guincharAutomovel(motoPP);

        
    }    
}
