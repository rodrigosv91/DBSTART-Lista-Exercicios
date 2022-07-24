package lista_exercicios.exercicio_18;

public class MotoPartidaPedal extends Moto{

    public MotoPartidaPedal(int numRodas, int velMax) {
        super(numRodas, velMax);
    }

    @Override
    public void ligar() {
        if(aceleradorPressionado){
            this.ligado = true;
            System.out.println("Moto Ligada");
        }else
            System.out.println("Acelerador precissa estar pressionado para ligar");
    }
  
}
