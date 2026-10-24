package Teste;
import Dominio.Pessoa;

public class PessoaTest {
    public static void main(String[] args) {

        Pessoa pessoa = new Pessoa();

        pessoa.nome = "Carlos";
        pessoa.idade = 20;

        System.out.println("Nome: " + pessoa.nome);
        System.out.println("Idade: " + pessoa.idade);

        System.out.println(
                "Maior de idade? " + pessoa.isMaiorDeIdade(18)
        );
    }
}
