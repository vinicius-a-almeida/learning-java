package exercicios_1.fatura;

public class Fatura {
    String numIdentifica;
    String descricao;
    int quantidadeComprada;
    double precoUnitario;

    Fatura (String numIdentifica, String descricao, int quantidadeComprada, double precoUnitario){
        this.numIdentifica = numIdentifica;
        this.descricao = descricao;
        if (quantidadeComprada < 0 ){
            this.quantidadeComprada = 0;
        }else{
            this.quantidadeComprada = quantidadeComprada;    
        }
        
        this.precoUnitario = precoUnitario;
    }

    public String getNumIdentifica() {
        return numIdentifica;
    }
    public void setNumIdentifica(String numIdentifica) {
        this.numIdentifica = numIdentifica;
    }
    public String getDescricao() {
        return descricao;
    }
    public void setDescricao(String descricao) {
        this.descricao = descricao;
    }
    public int getQuantidadeComprada() {
        return quantidadeComprada;
    }
    public void setQuantidadeComprada(int quantidadeComprada) {
        this.quantidadeComprada = quantidadeComprada;
    }
    public double getPrecoUnitario() {
        return precoUnitario;
    }
    public void setPrecoUnitario(int precoUnitario) {
        this.precoUnitario = precoUnitario;
    }

    void mostra(){
        System.out.println("\n\n");
        System.out.println("O codigo de identificação do produto é: " + numIdentifica);
        System.out.println("A descrição do produto é: " + descricao);
        System.out.println("A quantidade em estoque é: " + quantidadeComprada);
        System.out.printf("O preço do produto é: R$%.2g\n", precoUnitario);
    }
    
}
