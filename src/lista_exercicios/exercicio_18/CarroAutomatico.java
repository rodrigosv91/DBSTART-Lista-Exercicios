package lista_exercicios.exercicio_18;

public class CarroAutomatico extends Carro{

    public CarroAutomatico(int numRodas, int velMax) {
        super(numRodas, velMax);
    }
        
    @Override
    public void ligar(){
        if(freioPressionado == true){
            this.ligado = true;
            System.out.println("Carro Ligado");
        }
        else
            System.out.println("Freio precisa estar pressionado para ligar");
    }
    
}
