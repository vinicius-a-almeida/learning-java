package abstrata_polimorfismo_iterface.Q_52;

public class Livro {
    String titulo, autor, numeroDePaginas, anoDaEdicao;

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