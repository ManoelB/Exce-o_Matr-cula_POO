import java.util.ArrayList;
import java.util.List;

public class Cadastro {
        private List<Aluno> alunos;

        public Cadastro() {
            this.alunos = new ArrayList<>();
        }

        public void cadastrar(Aluno aluno) throws MatriculaExc {
            for (Aluno a : alunos) {
                if (a.getMatricula().equals(aluno.getMatricula())) {
                    throw new MatriculaExc("Matrícula já existente: " + aluno.getMatricula());
                }
            }
            alunos.add(aluno);
        }

        public List<Aluno> getAlunos() {
            return alunos;
        }

    public void cadastrarAluno(Aluno aluno1) {

    }
}

