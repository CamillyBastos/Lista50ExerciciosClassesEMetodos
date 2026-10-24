package Dominio;

public class Livro {
        public String titulo;
        public String autor;
        public int numeroPaginas;
        public double preco;

        public String verificarTamanho() {
            if (numeroPaginas > 300) {
                return "Livro grande";
            }
            return "Livro pequeno";
        }
    }
