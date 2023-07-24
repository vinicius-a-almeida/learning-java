package exercicios_1.elevador;

public class Elevador {
    int andar, totalAndares, capacidade, pessoasElevador;

    Elevador(int andar,int totalAndares, int capacidade, int pessoasElevador){
        this.andar = andar = 0;
        this.totalAndares = totalAndares;
        this.capacidade = capacidade;
        this.pessoasElevador = pessoasElevador;
    }

    public int getAndar() {
        return andar;
    }

    public void setAndar(int andar) {
        this.andar = andar;
    }

    public int getTotalAndares() {
        return totalAndares;
    }

    public void setTotalAndares(int totalAndares) {
        this.totalAndares = totalAndares;
    }

    public int getCapacidade() {
        return capacidade;
    }

    public void setCapacidade(int capacidade) {
        this.capacidade = capacidade;
    }

    public int getPessoasElevador() {
        return pessoasElevador;
    }

    public void setPessoasElevador(int pessoasElevador) {
        this.pessoasElevador = pessoasElevador;
    }

    int entra(int pessoasElevador){
        if(capacidade >= pessoasElevador){
            return pessoasElevador++;
        }
        else{
            return 1;
        }
    }
    int sai(int pessoasElevador){
        if(capacidade <= pessoasElevador){
            return pessoasElevador--;
        }
        else{
            return 1;
        }
    }

    int sobe(int andar){
        if(andar <= totalAndares){
            return andar ++;
        }
        else{
            return 1;
        }
    }
}
