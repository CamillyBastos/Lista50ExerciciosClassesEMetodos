package Dominio;

public class ContaBancaria {
        public String titular;
        public int numeroConta;
        public double saldo;

        public boolean temSaldo() {
            return saldo > 0;
        }

        public boolean podeSacar(double valorSaque) {
            return valorSaque >= 0 && valorSaque <= saldo;
        }

        public void depositar(double valor) {
            if (valor > 0) {
                saldo += valor;
            }
        }

        public void sacar(double valor) {
            if (valor > 0 && valor <= saldo) {
                saldo -= valor;
            } else {
                System.out.println("Saldo insuficiente");
            }
        }
    }

