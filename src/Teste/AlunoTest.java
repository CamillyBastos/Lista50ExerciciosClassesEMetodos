package Teste;
import Dominio.Aluno;
import Dominio.ComparadorAluno;
import Dominio.Secretaria;
public class AlunoTest {
    public static void main(String[] args) {

            Aluno aluno1 = new Aluno();
            aluno1.nome = "João";
            aluno1.nota1 = 8;
            aluno1.nota2 = 6;

            Aluno aluno2 = new Aluno();
            aluno2.nome = "Maria";
            aluno2.nota1 = 9;
            aluno2.nota2 = 10;

            Aluno aluno3 = new Aluno();
            aluno3.nome = "Pedro";
            aluno3.nota1 = 4;
            aluno3.nota2 = 5;

            // Exercício 10: dados do aluno
            System.out.println("=== Exercício 10 ===");
            System.out.println(aluno1.nome);
            System.out.println(aluno1.nota1);
            System.out.println(aluno1.nota2);

            // Exercício 11: calcular média
            System.out.println("\n=== Exercício 11 ===");
            System.out.println(aluno1.calcularMedia());

            // Exercício 12: aprovado ou reprovado
            System.out.println("\n=== Exercício 12 ===");
            System.out.println(aluno1.isAprovado());

            // Exercício 13: situação de três alunos
            System.out.println("\n=== Exercício 13 ===");
            System.out.println(
                    aluno1.nome + ": " + aluno1.getSituacao()
            );
            System.out.println(
                    aluno2.nome + ": " + aluno2.getSituacao()
            );
            System.out.println(
                    aluno3.nome + ": " + aluno3.getSituacao()
            );

            // Exercício 34: imprimir situação
            System.out.println("\n=== Exercício 34 ===");
            aluno1.imprimirSituacao();

            // Exercício 40: atualizar notas
            System.out.println("\n=== Exercício 40 ===");
            System.out.println(
                    "Média antiga: " + aluno1.calcularMedia()
            );

            aluno1.atualizarNotas(10, 10);

            System.out.println(
                    "Média nova: " + aluno1.calcularMedia()
            );

            // Exercício 44: comparar médias
            System.out.println("\n=== Exercício 44 ===");
            ComparadorAluno comparador = new ComparadorAluno();

            Aluno melhorAluno = comparador.retornarAlunoComMaiorMedia(
                    aluno1, aluno2
            );

            System.out.println(
                    "Maior média: " + melhorAluno.nome
            );

            // Exercício 49: atualizar situação pela Secretaria
            System.out.println("\n=== Exercício 49 ===");

            Secretaria secretaria = new Secretaria();

            System.out.println(
                    "Antes: " + aluno3.getSituacao()
            );

            secretaria.atualizarAluno(aluno3, 8, 9);

            System.out.println(
                    "Depois: " + aluno3.getSituacao()
            );
        }
    }

