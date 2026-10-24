package Dominio;

public class ImpressoraCarro {
        public void imprime(Carro carro) {
            System.out.println("Nome: " + carro.nome);
            System.out.println("Modelo: " + carro.modelo);
            System.out.println("Ano: " + carro.ano);
            System.out.println(
                    "Velocidade: " + carro.velocidadeAtual + " km/h"
            );
        }

        public void imprimir(Carro carro, int limiteDaVia) {
            imprime(carro);
            System.out.println(carro.gerarMensagemMulta(limiteDaVia));
        }
    }

