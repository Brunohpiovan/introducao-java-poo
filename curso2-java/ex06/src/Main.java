import entities.Aluno;
import entities.Curso;
import entities.Matricula;
import entities.Professor;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class Main {
    public static void main(String[] args) {

        List<Aluno> listaAlunos = new ArrayList<>();

        Aluno a1 = new Aluno("Pedro","111.222.333-44","22/10/2005");
        Aluno a2 = new Aluno("Joao","660.575.510-36","25/05/2006");
        Aluno a3 = new Aluno("Maria","356.536.690-75","11/03/2004");
        Aluno a4 = new Aluno("Cezar","586.466.180-56","30/11/2005");

        Curso c1 = new Curso("Historia",35.0);
        Curso c2 = new Curso("Matematica",50.0);
        Curso c3 = new Curso("Portugues",45.0);

        Matricula mat1 = new Matricula(a1,c1);
        Matricula mat2 = new Matricula(a2,c2);
        Matricula mat3 = new Matricula(a3,c3);

        Professor p1 = new Professor("Cleuza","123.456.789-10","12/04/1972",c1);
        p1.atribuiNota(a1,7);
        p1.atribuiNota(a2,10);
        p1.atribuiNota(a3,4);
        p1.atribuiNota(a4,6);

        Collections.addAll(listaAlunos, a1, a2, a3, a4);

        for(Aluno aluno : listaAlunos){
          System.out.println(aluno);
        }

        System.out.println(mat1);
        System.out.println(mat2);
        System.out.println(mat3);
    }
}