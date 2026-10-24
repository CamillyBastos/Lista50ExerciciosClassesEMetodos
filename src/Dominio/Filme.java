package Dominio;

public class Filme {
        public String titulo;
        public String genero;
        public int duracaoMinutos;
        public int classificacaoIndicativa;

        public boolean isFilmeLongo() {
            return duracaoMinutos > 120;
        }
    }
