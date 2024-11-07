package entities;

public class Professor extends Pessoa{
    private Curso curso;

    //construtores
    public Professor() {
    }

    public Professor(String nome, String cpf, String dataNascimento, Curso curso) {
        super(nome, cpf, dataNascimento);
        this.curso = curso;
    }

    public Curso getCurso() {
        return curso;
    }

    public void setCurso(Curso curso) {
        this.curso = curso;
    }

    public void atribuiNota(Aluno aluno, double nota){
        aluno.setNota(nota);
    }

}
