package lista_exercicios.exercicio_18;

public class Guincho extends Automovel{
    private Automovel automovelGuinchado;

    public Guincho(int numRodas, int velMax) {
        super(numRodas, velMax);
    }  
    
    public void guincharAutomovel(Automovel automovel){
        if( (automovel instanceof Carro) || (automovel instanceof Moto)){
            this.automovelGuinchado = automovel;
            System.out.println(automovel.getClass().getSimpleName() +" guinchado com sucesso!");
        }
        else
            System.out.println("Guincho so pode içar Carro ou Moto.");
    }
}
