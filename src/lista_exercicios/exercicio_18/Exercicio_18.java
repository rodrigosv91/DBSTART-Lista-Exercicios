package lista_exercicios.exercicio_18;

public class Exercicio_18 {

    public static void main(String[] args) {
       
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
