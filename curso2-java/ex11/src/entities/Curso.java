package entities;

import java.util.ArrayList;

public class Curso {
    private String nome;
    private final ArrayList<Disciplina> disciplinas = new ArrayList<>();

    public Curso(String nome) {
        this.nome = nome;
    }

    public void addDisciplinas(Disciplina disciplina){
        disciplinas.add(disciplina);
        disciplina.getCursos().add(this);
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public ArrayList<Disciplina> getDisciplinas() {
        return disciplinas;
    }

    @Override
    public String toString() {
        return "Curso{" +
                "\nnome='" + nome + '\'' +
                "\ndisciplinas=" + disciplinas;
    }
}
