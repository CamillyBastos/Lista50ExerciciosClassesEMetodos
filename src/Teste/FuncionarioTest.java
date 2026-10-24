package Teste;
import Dominio.Funcionario;

public class FuncionarioTest {
    public static void main(String[] args) {

            Funcionario funcionario = new Funcionario();

            funcionario.nome = "Roberto";
            funcionario.salario = 3000;

            double bonus = funcionario.calcularBonus(10);

            System.out.println("Nome: " + funcionario.nome);
            System.out.println("Salário: R$ " + funcionario.salario);
            System.out.println("Bônus: R$ " + bonus);
        }
    }

