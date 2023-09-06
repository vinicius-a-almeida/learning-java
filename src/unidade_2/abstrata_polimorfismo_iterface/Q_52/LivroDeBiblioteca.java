package abstrata_polimorfismo_iterface.Q_52;

public class LivroDeBiblioteca extends Livro{
    public LivroDeBiblioteca(String titulo, String autor, String numeroDePaginas){
        super(titulo, autor);
        this.numeroDePaginas = numeroDePaginas;
        
    }
}