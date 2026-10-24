package Dominio;

public class CadastroEstudante {

        public void cadastrar(
                Estudante estudante, String nome, int idade, char sexo
        ) {
            estudante.nome = nome;
            estudante.idade = idade;
            estudante.sexo = sexo;
        }
    }

