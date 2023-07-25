package exercicios_1.contador;

public class Contador {
    private int contador;

    public Contador (int contador){
        this.contador = contador;
    }

    public int getContador() {
        return contador;
    }

    public void setContador(int contador) {
        this.contador = contador;
    }

    public int zera(){
        return 0;
    }

    public int incremento(){
        return contador++;
    }
    public int imprime(){
        return contador;
    }
    
}
