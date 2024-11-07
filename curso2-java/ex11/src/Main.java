import entities.Curso;
import entities.Disciplina;

public class Main {
    public static void main(String[] args) {
        Curso c1 = new Curso("Eng Software");
        Curso c2 = new Curso("Eng Computacao");
        Curso c3 = new Curso("ADS");

        Disciplina d1 = new Disciplina("JAVA");
        Disciplina d2 = new Disciplina("Sistemas operacionais");
        Disciplina d3 = new Disciplina("Banco de dados");

        c1.addDisciplinas(d1);
        c1.addDisciplinas(d2);

        c2.addDisciplinas(d1);
        c2.addDisciplinas(d3);

        c3.addDisciplinas(d1);
        c3.addDisciplinas(d2);
        c3.addDisciplinas(d3);

        for (Curso cursos : d1.getCursos()){
            System.out.println();
            System.out.println("Esse curso possui a materia de "+ d1.getNome());
            System.out.println("Curso: "+ cursos.getNome());
            System.out.println("----------------------------------");
        }

        System.out.println(c3);

    }
}