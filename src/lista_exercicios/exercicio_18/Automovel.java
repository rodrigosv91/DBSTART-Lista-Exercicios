
package lista_exercicios.exercicio_18;

public abstract class Automovel {
    protected int numRodas;
    protected int velMax;
    protected boolean ligado = false;
    protected boolean freioPressionado = false;
    protected boolean aceleradorPressionado = false;

    public Automovel(int numRodas, int velMax) {
        this.numRodas = numRodas;
        this.velMax = velMax;
    }

    public int getNumRodas() {
        return numRodas;
    }

    public void setNumRodas(int numRodas) {
        this.numRodas = numRodas;
    }

    public int getVelMax() {
        return velMax;
    }

    public void setVelMax(int velMax) {
        this.velMax = velMax;
    }

    public boolean isLigado() {
        return ligado;
    }

    public void setLigado(boolean ligado) {
        this.ligado = ligado;
    }

    public boolean isFreioPressionado() {
        return freioPressionado;
    }

    public void setFreioPressionado(boolean freioPressionado) {
        this.freioPressionado = freioPressionado;
    }

    public boolean isAceleradorPressionado() {
        return aceleradorPressionado;
    }

    public void setAceleradorPressionado(boolean aceleradorPressionado) {
        this.aceleradorPressionado = aceleradorPressionado;
    }
       
       
    public void ligar(){
        this.ligado = true;
    }
}
