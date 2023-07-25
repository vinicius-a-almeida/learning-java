package exercicios_1.lampada;

import exercicios_1.contador.Contador;

public class Lampada {
    Contador ligado = new Contador(0);
    Contador desligado = new Contador(0);
    private boolean estadoDaLampada;


    public Contador getLigado() {
        return ligado;
    }


    public void setLigado(Contador ligado) {
        this.ligado = ligado;
    }


    public Contador getDesligado() {
        return desligado;
    }


    public void setDesligado(Contador desligado) {
        this.desligado = desligado;
    }


    public boolean isEstadoDaLampada() {
        return estadoDaLampada;
    }

    public void setEstadoDaLampada(boolean estadoDaLampada) {
        this.estadoDaLampada = estadoDaLampada;
    }

    Lampada(boolean estadoDaLampada){
        this.estadoDaLampada = estadoDaLampada;
    }

    boolean acende(){
        ligado.incremento();
        return true;
    }
    
    boolean apaga(){
        desligado.incremento();
        return false;
    }

    void mostraEstado(){
        if(estadoDaLampada == true){
            System.out.println("A lampada está ligada");
        }else if(estadoDaLampada == false){
            System.out.println("A lampada está desligada");
        }
    }

    boolean estaLigada(){
        return estadoDaLampada;
    }
    void quantidadeAcesa(){
        System.out.println("Foi acesa: \n" + ligado.imprime());
        System.out.println("Foi apagada: \n" + desligado.imprime());
    }

}