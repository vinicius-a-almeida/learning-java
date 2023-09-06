package abstrata_polimorfismo_iterface.Q_52;

public class LivroDeBiblioteca extends Livro implements ItemDeBiblioteca{
    private boolean statusDoLivro;
    private String localizacao;
    private String descricao;

    public LivroDeBiblioteca(String localizacao, String descricao, String titulo, String autor, String numeroDePaginas, String anoDaEdicao){
        super(titulo, autor,numeroDePaginas,anoDaEdicao);
        this.statusDoLivro = false;
        this.localizacao = localizacao;
        this.descricao = descricao;
    }

    @Override
    public boolean estaEmprestado() {
        return statusDoLivro;
    }

    @Override
    public void empresta( ) {
        statusDoLivro = true;
    }

    @Override
    public void devolve( ) {
        statusDoLivro = false;
    }

    @Override
    public String localizacao() {
        return localizacao;
    }

    @Override
    public String descricao() {
        return descricao;
    }
}