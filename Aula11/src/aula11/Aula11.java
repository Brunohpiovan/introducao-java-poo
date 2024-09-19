package aula11;

public class Aula11 {
    public static void main(String[] args) {
        Visitante v1 =  new Visitante();
        v1.setNome("Juvenal");
        v1.setIdade(22);
        v1.setSexo("M");
        System.out.println(v1.toString());
        
        Aluno a1 =  new Aluno();
        a1.setNome("Pedro");
        a1.setMatricula(26739);
        a1.setCurso("Software");
        a1.setIdade(19);
        a1.setSexo("M");
        a1.pagarMensalidade();

        
        Bolsista b1 = new Bolsista();
        b1.setMatricula(58291);
        b1.setNome("Joao");
        b1.setBolsa(12.5F);
        b1.setSexo("M");
        b1.pagarMensalidade();
    }
    
}
