package entities;

import java.time.LocalDate;

public class Matricula {
    private Aluno aluno;
    private Curso curso;
    private LocalDate data;

    public Matricula() {
    }

    public Matricula(Aluno aluno, Curso curso) {
        this.aluno = aluno;
        this.curso = curso;
        this.data = LocalDate.now();
    }

    public Aluno getAluno() {
        return aluno;
    }

    public void setAluno(Aluno aluno) {
        this.aluno = aluno;
    }

    public Curso getCurso() {
        return curso;
    }

    public void setCurso(Curso curso) {
        this.curso = curso;
    }

    public LocalDate getData() {
        return data;
    }

    public void setData(LocalDate data) {
        this.data = data;
    }

    @Override
    public String toString() {
        return "Matricula{" +
                "\naluno=" + aluno.getNome() +
                "\ncurso=" + curso.getNome() +
                "\ndata=" + data + "\n"+
                '}';
    }
}
