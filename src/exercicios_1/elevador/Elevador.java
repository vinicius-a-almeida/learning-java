package exercicios_1.elevador;

public class Elevador {
    int andar, totalAndares, capacidade, pessoasElevador;

    Elevador(int andar,int totalAndares, int capacidade, int pessoasElevador){
        this.andar = 0;
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

    int entra(){
        if(pessoasElevador < capacidade){
            System.out.println("Entre ai meu peixe: " + (pessoasElevador + 1));
            return pessoasElevador++;
        }
        else{
            return pessoasElevador;
        }
    }
    int sair(){
        if(pessoasElevador != 0){
            return pessoasElevador--;
        }
        else{
            return pessoasElevador;
        }
    }

    int sobe(){
        if(andar < totalAndares){
            System.out.println("você está no andar: " + (andar + 1));
            return andar++;
        }
        else{
            System.out.println("Você já está no ultimo andar!");
            return andar;
        }
    }

    int desce(){
        if(andar != 0){
            System.out.println("você está no andar: " + (andar - 1));
            return andar--;
        }else{
            System.out.println("Você já está no terreo!");
            return andar;
        }
    }
}
