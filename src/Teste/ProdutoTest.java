package Teste;
import Dominio.Produto;
import Dominio.CadastroProduto;
import Dominio.ImpressoraProduto;
import Dominio.ComparadorProduto;
import Dominio.Promocao;

public class ProdutoTest {
    public static void main(String[] args) {

            Produto produto1 = new Produto();
            Produto produto2 = new Produto();

            // Exercícios 4 e 43: criar e cadastrar produtos
            CadastroProduto cadastro = new CadastroProduto();

            cadastro.cadastrar(produto1, "Notebook", 3500, 5);
            cadastro.cadastrar(produto2, "Caneta", 3, 100);

            System.out.println("=== Exercícios 4 e 43 ===");
            System.out.println(produto1.nome);
            System.out.println(produto1.preco);
            System.out.println(produto1.quantidade);

            // Exercício 14: valor total em estoque
            System.out.println("\n=== Exercício 14 ===");
            System.out.println(
                    produto1.calcularValorTotal()
            );

            // Exercício 15: categoria dos produtos
            System.out.println("\n=== Exercício 15 ===");
            System.out.println(produto1.verificarCategoria());
            System.out.println(produto2.verificarCategoria());

            // Exercício 21: desconto de 10%
            System.out.println("\n=== Exercício 21 ===");
            System.out.println(
                    produto1.aplicarDesconto(10)
            );

            // Exercício 22: aumento de 20%
            System.out.println("\n=== Exercício 22 ===");
            System.out.println(
                    produto2.aumentarPreco(20)
            );

            // Exercício 27: calcular frete
            System.out.println("\n=== Exercício 27 ===");
            System.out.println(
                    produto1.calcularFrete(50)
            );

            // Exercício 30: estoque mínimo
            System.out.println("\n=== Exercício 30 ===");
            System.out.println(
                    produto1.estoqueBaixo(10)
            );

            // Exercício 33: imprimir produtos
            System.out.println("\n=== Exercício 33 ===");
            ImpressoraProduto impressora = new ImpressoraProduto();
            impressora.imprime(produto1);
            impressora.imprime(produto2);

            // Exercício 45: comparar preços
            System.out.println("\n=== Exercício 45 ===");
            ComparadorProduto comparador = new ComparadorProduto();

            Produto maisCaro = comparador.retornarProdutoMaisCaro(
                    produto1, produto2
            );

            System.out.println("Mais caro: " + maisCaro.nome);

            // Exercício 48: desconto que altera o objeto
            System.out.println("\n=== Exercício 48 ===");
            System.out.println("Antes: " + produto1.preco);

            Promocao promocao = new Promocao();
            promocao.aplicarDesconto(produto1, 10);

            System.out.println("Depois: " + produto1.preco);
        }
    }

