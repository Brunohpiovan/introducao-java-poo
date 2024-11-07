package entities;

import java.util.ArrayList;

public class Disciplina {
    private String nome;
    private final ArrayList<Curso> cursos = new ArrayList<>();

    public Disciplina(String nome) {
        this.nome = nome;
    }

    public void addCurso(Curso curso){
        this.cursos.add(curso);
        curso.getDisciplinas().add(this);
    }


    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public ArrayList<Curso> getCursos() {
        return cursos;
    }

    @Override
    public String toString() {
        return "nome= " + nome;
    }
}
