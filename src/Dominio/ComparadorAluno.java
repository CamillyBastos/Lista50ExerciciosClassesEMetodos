package Dominio;

public class ComparadorAluno {

        public Aluno retornarAlunoComMaiorMedia(
                Aluno aluno1, Aluno aluno2
        ) {
            if (aluno1.calcularMedia() >= aluno2.calcularMedia()) {
                return aluno1;
            }
            return aluno2;
        }
}
