package Dominio;

public class Banco {
        public void transferir(
                ContaBancaria origem,
                ContaBancaria destino,
                double valor
        ) {
            if (valor > 0 && origem.podeSacar(valor)) {
                origem.saldo -= valor;
                destino.saldo += valor;
            } else {
                System.out.println("Saldo insuficiente");
            }
        }
    }

