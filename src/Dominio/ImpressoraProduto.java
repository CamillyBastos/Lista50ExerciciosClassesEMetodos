package Dominio;

public class ImpressoraProduto {
        public void imprime(Produto produto) {
            System.out.println("Nome: " + produto.nome);
            System.out.println("Preço: R$ " + produto.preco);
            System.out.println("Quantidade: " + produto.quantidade);
            System.out.println(
                    "Valor total: R$ " + produto.calcularValorTotal()
            );
        }
    }

