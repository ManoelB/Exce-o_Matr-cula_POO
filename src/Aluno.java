public class Aluno {
    private String nome;
    private String endereco;
    private String matricula;

    public Aluno(String nome, String endereco, String matricula){
        this.nome = nome;
        this.endereco = endereco;
        this.matricula = matricula;
    }

    public String getNome(){
        return nome;
    }

    public String getEndereco(){
        return endereco;
    }

    public String getMatricula(){
        return matricula;
    }

    public String toString() {
        return "Aluno{" +
                "nome='" + nome + '\'' +
                ", endereco='" + endereco + '\'' +
                ", matricula='" + matricula + '\'' +
                '}';
    }
}
