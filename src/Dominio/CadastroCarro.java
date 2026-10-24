package Dominio;

public class CadastroCarro {

        public void cadastrar(
                Carro carro, String nome, String modelo,
                int ano, double velocidadeAtual
        ) {
            carro.nome = nome;
            carro.modelo = modelo;
            carro.ano = ano;
            carro.velocidadeAtual = velocidadeAtual;
        }
    }
