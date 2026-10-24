package Teste;
import Dominio.Carro;
import Dominio.CadastroCarro;
import Dominio.ImpressoraCarro;
import Dominio.Oficina;

    public class CarroTest {
        public static void main(String[] args) {

            Carro carro1 = new Carro();
            Carro carro2 = new Carro();

            // Exercícios 3 e 42: criar e cadastrar dois carros
            CadastroCarro cadastro = new CadastroCarro();

            cadastro.cadastrar(
                    carro1, "Civic", "Sedan", 2022, 100
            );

            cadastro.cadastrar(
                    carro2, "Fusca", "Clássico", 1980, 60
            );

            ImpressoraCarro impressora = new ImpressoraCarro();

            System.out.println("=== Exercícios 3 e 42 ===");
            impressora.imprime(carro1);
            impressora.imprime(carro2);

            // Exercício 16: carro antigo ou novo
            System.out.println("=== Exercício 16 ===");
            System.out.println(
                    carro1.nome + ": " + carro1.verificarIdadeDoCarro()
            );
            System.out.println(
                    carro2.nome + ": " + carro2.verificarIdadeDoCarro()
            );

            // Exercícios 23 e 24: verificar multas
            int limiteDaVia = 80;

            System.out.println("\n=== Exercícios 23 e 24 ===");
            System.out.println(
                    carro1.nome + ": " + carro1.isMultado(limiteDaVia)
            );
            System.out.println(
                    carro2.nome + ": " + carro2.isMultado(limiteDaVia)
            );
            System.out.println(
                    carro1.gerarMensagemMulta(limiteDaVia)
            );
            System.out.println(
                    carro2.gerarMensagemMulta(limiteDaVia)
            );

            // Exercício 32: imprimir os dados dos carros
            System.out.println("\n=== Exercício 32 ===");
            impressora.imprime(carro1);
            impressora.imprime(carro2);

            // Exercício 35: imprimir mensagens de multa
            System.out.println("=== Exercício 35 ===");
            carro1.imprimirMulta(limiteDaVia);
            carro2.imprimirMulta(limiteDaVia);

            // Exercício 38: acelerar
            System.out.println("\n=== Exercício 38 ===");
            System.out.println("Antes: " + carro2.velocidadeAtual);
            carro2.acelerar(20);
            System.out.println("Depois: " + carro2.velocidadeAtual);

            // Exercício 39: frear
            System.out.println("\n=== Exercício 39 ===");
            carro2.frear(30);
            System.out.println("Velocidade: " + carro2.velocidadeAtual);

            // Exercício 47: trocar velocidades
            System.out.println("\n=== Exercício 47 ===");
            System.out.println(
                    "Antes: " + carro1.velocidadeAtual
                            + " / " + carro2.velocidadeAtual
            );

            Oficina oficina = new Oficina();
            oficina.trocarVelocidades(carro1, carro2);

            System.out.println(
                    "Depois: " + carro1.velocidadeAtual
                            + " / " + carro2.velocidadeAtual
            );

            // Exercício 50: sistema completo
            System.out.println("\n=== Exercício 50 ===");

            Carro carro3 = new Carro();
            Carro carro4 = new Carro();

            cadastro.cadastrar(
                    carro3, "Onix", "Hatch", 2023, 90
            );

            cadastro.cadastrar(
                    carro4, "Gol", "Compacto", 2008, 50
            );

            impressora.imprimir(carro3, limiteDaVia);
            impressora.imprimir(carro4, limiteDaVia);
        }
    }

