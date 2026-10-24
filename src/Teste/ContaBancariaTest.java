package Teste;
import Dominio.ContaBancaria;
import Dominio.Banco;
public class ContaBancariaTest {
    public static void main(String[] args) {

            ContaBancaria conta1 = new ContaBancaria();
            conta1.titular = "Ana";
            conta1.numeroConta = 1001;
            conta1.saldo = 1000;

            ContaBancaria conta2 = new ContaBancaria();
            conta2.titular = "Pedro";
            conta2.numeroConta = 1002;
            conta2.saldo = 500;

            // Exercício 7: dados da conta
            System.out.println("=== Exercício 7 ===");
            System.out.println(conta1.titular);
            System.out.println(conta1.numeroConta);
            System.out.println(conta1.saldo);

            // Exercício 17: verificar saldo positivo
            System.out.println("\n=== Exercício 17 ===");
            System.out.println(conta1.temSaldo());

            // Exercício 26: verificar limite de saque
            System.out.println("\n=== Exercício 26 ===");
            System.out.println(conta1.podeSacar(300));
            System.out.println(conta1.podeSacar(2000));

            // Exercício 36: depositar
            System.out.println("\n=== Exercício 36 ===");
            System.out.println("Antes: " + conta1.saldo);
            conta1.depositar(200);
            System.out.println("Depois: " + conta1.saldo);

            // Exercício 37: sacar
            System.out.println("\n=== Exercício 37 ===");
            conta1.sacar(100);
            System.out.println("Após saque: " + conta1.saldo);
            conta1.sacar(5000);

            // Exercício 46: transferir entre contas
            System.out.println("\n=== Exercício 46 ===");
            Banco banco = new Banco();

            banco.transferir(conta1, conta2, 300);

            System.out.println(
                    "Saldo de " + conta1.titular + ": " + conta1.saldo
            );
            System.out.println(
                    "Saldo de " + conta2.titular + ": " + conta2.saldo
            );
        }
    }


