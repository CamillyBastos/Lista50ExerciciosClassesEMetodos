package Dominio;

public class Impressora {

        public void imprime(Estudante estudante) {
            System.out.println("Nome: " + estudante.nome);
            System.out.println("Idade: " + estudante.idade);
            System.out.println("Sexo: " + estudante.sexo);
        }
    }
