
package projetopessoas;

public class ProjetoPessoas {

    public static void main(String[] args) {
       Pessoa p1 = new Pessoa();
       Aluno p2 = new Aluno();
       Professor p3 = new Professor();
       Funcionario p4 = new Funcionario();
       
       p1.setNome("Pedro");
       p1.setIdade(21);
       p1.setSexo("M");
       //
       p2.setNome("Maria");
       p2.setIdade(20);
       p2.setSexo("F");
       p2.setCurso("Eng software");
       //
       p3.setNome("Joao");
       p3.setIdade(42);
       p3.setSexo("M");
       p3.setSalario(2500.75F);
       p3.receberAumento(500F);
       //
       p4.setNome("Fabio");
       p4.setIdade(54);
       p4.setSexo("M");
       p4.setSetor("Almoxarife");
       
       System.out.println(p1.toString());
       System.out.println(p2.toString());
       System.out.println(p3.toString());
       System.out.println(p4.toString());
       
    }
    
}
