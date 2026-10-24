package Teste;
import Dominio.Termometro;

public class TermometroTest {

    public static void main(String[] args) {

            Termometro termometro = new Termometro();

            termometro.temperaturaAtual = 38.5;

            System.out.println(
                    "Temperatura atual: "
                            + termometro.temperaturaAtual
            );

            System.out.println(
                    "Passou do limite? "
                            + termometro.passouDoLimite(37.5)
            );
        }
    }
