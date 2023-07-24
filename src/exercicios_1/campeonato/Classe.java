package exercicios_1.campeonato;


public class Classe {
    
    private String nome;
    private int saldoDeGol;

    Classe (String nome, int saldoDeGol){
        this.nome = nome;
        this.saldoDeGol = saldoDeGol;
    }
    
    public String getNome() {
        return nome;
    }
    public void setNome(String nome) {
        this.nome = nome;
    }
    public int getSaldoDeGol() {
        return saldoDeGol;
    }
    public void setSaldoDeGol(int saldoDeGol) {
        this.saldoDeGol = saldoDeGol;
    }

    void mostra(){
        System.out.println("\n\nO nome do time é: " + nome);
        System.out.println("\nO saldo de gols é: " + saldoDeGol);
    }

}
