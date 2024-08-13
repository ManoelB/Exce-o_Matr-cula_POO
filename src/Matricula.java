public class Matricula {
    public static void main(String[] args) {
        Cadastro cadastro = new Cadastro();

        Aluno aluno1 = new Aluno("João Silva", "Rua A, 123", "2023001");
        Aluno aluno2 = new Aluno("Maria Oliveira", "Rua B, 456", "2023002");
        Aluno aluno3 = new Aluno("Carlos Pereira", "Rua C, 789", "2023001"); // Matrícula duplicada

        cadastro.cadastrarAluno(aluno1);
        cadastro.cadastrarAluno(aluno2);

        cadastro.cadastrarAluno(aluno3);

    }
}