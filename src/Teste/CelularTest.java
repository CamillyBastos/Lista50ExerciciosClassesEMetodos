package Teste;
import Dominio.Celular;

public class CelularTest {
        public static void main(String[] args) {

            Celular celular1 = new Celular();
            celular1.marca = "Samsung";
            celular1.modelo = "S25";
            celular1.armazenamento = 256;
            celular1.preco = 4500;

            Celular celular2 = new Celular();
            celular2.marca = "Motorola";
            celular2.modelo = "G";
            celular2.armazenamento = 128;
            celular2.preco = 1500;

            // Exercício 6: imprimir informações
            System.out.println("=== Exercício 6 ===");
            System.out.println(
                    "Celular " + celular1.marca + " " + celular1.modelo
                            + " com " + celular1.armazenamento
                            + "GB custa R$ " + celular1.preco
            );

            // Exercício 20: verificar celulares premium
            System.out.println("\n=== Exercício 20 ===");
            System.out.println(
                    celular1.modelo + ": " + celular1.isPremium()
            );
            System.out.println(
                    celular2.modelo + ": " + celular2.isPremium()
            );
        }
    }

