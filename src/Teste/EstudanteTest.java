package Teste;
import Dominio.Estudante;
import Dominio.ImpressoraEstudante;
import Dominio.CadastroEstudante;

public class EstudanteTest {

        public static void main(String[] args) {

            // Exercício 1: criar e imprimir um estudante
            Estudante estudante1 = new Estudante();

            estudante1.nome = "Maria";
            estudante1.idade = 20;
            estudante1.sexo = 'F';

            System.out.println("=== Exercício 1 ===");
            System.out.println(estudante1.nome);
            System.out.println(estudante1.idade);
            System.out.println(estudante1.sexo);

            // Exercício 31: imprimir dois estudantes
            Estudante estudante2 = new Estudante();
            estudante2.nome = "Pedro";
            estudante2.idade = 22;
            estudante2.sexo = 'M';

            ImpressoraEstudante impressora = new ImpressoraEstudante();

            System.out.println("\n=== Exercício 31 ===");
            impressora.imprime(estudante1);
            impressora.imprime(estudante2);

            // Exercício 41: cadastrar estudantes por referência
            Estudante estudante3 = new Estudante();
            Estudante estudante4 = new Estudante();

            CadastroEstudante cadastro = new CadastroEstudante();

            cadastro.cadastrar(estudante3, "Ana", 19, 'F');
            cadastro.cadastrar(estudante4, "Lucas", 21, 'M');

            System.out.println("\n=== Exercício 41 ===");
            impressora.imprime(estudante3);
            impressora.imprime(estudante4);
        }
    }

