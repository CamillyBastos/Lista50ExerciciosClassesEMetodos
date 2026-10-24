package Teste;
import Dominio.Filme;

public class FilmeTest {
        public static void main(String[] args) {

            Filme filme = new Filme();

            filme.titulo = "Interestelar";
            filme.genero = "Ficção científica";
            filme.duracaoMinutos = 169;
            filme.classificacaoIndicativa = 10;

            // Exercício 9: imprimir informações
            System.out.println("=== Exercício 9 ===");
            System.out.println("Título: " + filme.titulo);
            System.out.println("Gênero: " + filme.genero);
            System.out.println("Duração: " + filme.duracaoMinutos);
            System.out.println(
                    "Classificação: " + filme.classificacaoIndicativa
            );

            // Exercício 19: verificar duração
            System.out.println("\n=== Exercício 19 ===");
            System.out.println(
                    "É um filme longo? " + filme.isFilmeLongo()
            );
        }
    }

