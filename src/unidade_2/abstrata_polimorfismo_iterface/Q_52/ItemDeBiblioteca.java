package abstrata_polimorfismo_iterface.Q_52;

public class ItemDeBiblioteca {
    public interface Item{
        int maximoDeDiasParaEmprestimo = 14;
        boolean emprestado = false;

       public boolean estaEmprestado(boolean emprestado);
       public void empresta();
       public void devolve();
       public String localizacao();
       public String descricao();
             
    }
}