package abstrata_polimorfismo_iterface.Q_52;

public interface ItemDeBiblioteca {
    int maximoDeDiasParaEmprestimo = 14;

    public boolean estaEmprestado();
    public void empresta();
    public void devolve();
    public String localizacao();
    public String descricao();
             
}