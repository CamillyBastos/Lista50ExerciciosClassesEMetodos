package Teste;
import Dominio.Livro;

public class LivroTest {
    public static void main(String[] args) {

            Livro livro1 = new Livro();
            livro1.titulo = "Java Básico";
            livro1.autor = "João Silva";
            livro1.numeroPaginas = 450;
            livro1.preco = 80;

            Livro livro2 = new Livro();
            livro2.titulo = "Contos";
            livro2.autor = "Maria Souza";
            livro2.numeroPaginas = 150;
            livro2.preco = 35;

            // Exercício 5: imprimir dois livros
            System.out.println("=== Exercício 5 ===");
            System.out.println(livro1.titulo);
            System.out.println(livro1.autor);
            System.out.println(livro1.numeroPaginas);
            System.out.println(livro1.preco);

            System.out.println("--------------------");

            System.out.println(livro2.titulo);
            System.out.println(livro2.autor);
            System.out.println(livro2.numeroPaginas);
            System.out.println(livro2.preco);

            // Exercício 18: verificar tamanho
            System.out.println("\n=== Exercício 18 ===");
            System.out.println(
                    livro1.titulo + ": " + livro1.verificarTamanho()
            );
            System.out.println(
                    livro2.titulo + ": " + livro2.verificarTamanho()
            );
        }
    }

