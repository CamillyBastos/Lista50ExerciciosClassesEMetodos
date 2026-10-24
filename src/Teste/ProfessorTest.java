package Teste;
import Dominio.Professor;

public class ProfessorTest {


        public static void main(String[] args) {

            Professor professor = new Professor();

            professor.nome = "Carlos";
            professor.idade = 40;
            professor.disciplina = "Matemática";
            professor.salario = 4500.00;

            System.out.println("Nome: " + professor.nome);
            System.out.println("Idade: " + professor.idade);
            System.out.println("Disciplina: " + professor.disciplina);
            System.out.println("Salário: R$ " + professor.salario);
        }
    }

