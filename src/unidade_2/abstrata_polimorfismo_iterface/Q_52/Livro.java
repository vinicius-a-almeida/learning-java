package abstrata_polimorfismo_iterface.Q_52;

public class Livro {
    private String titulo, autor, numeroDePaginas, anoDaEdicao;



    public String getTitulo() {
        return titulo;
    }

    public void setTitulo(String titulo) {
        this.titulo = titulo;
    }

    public String getAutor() {
        return autor;
    }

    public void setAutor(String autor) {
        this.autor = autor;
    }

    public String getNumeroDePaginas() {
        return numeroDePaginas;
    }

    public void setNumeroDePaginas(String numeroDePaginas) {
        this.numeroDePaginas = numeroDePaginas;
    }

    public String getAnoDaEdicao() {
        return anoDaEdicao;
    }

    public void setAnoDaEdicao(String anoDaEdicao) {
        this.anoDaEdicao = anoDaEdicao;
    }

        public Livro(String titulo, String autor, String numeroDePaginas, String anoDaEdicao){
            this.titulo = titulo;
            this.autor = autor;
            this.numeroDePaginas = numeroDePaginas;
            this.anoDaEdicao = anoDaEdicao;
        }

        public String qualTitulo(){
            return titulo;
        }

        public String qualAutor(){
            return autor;
        }

        @Override
        public String toString() {
            return "Livro [titulo=" + titulo + ", autor=" + autor + ", numeroDePaginas=" + numeroDePaginas
                    + ", anoDaEdicao=" + anoDaEdicao + "]";
        }

}