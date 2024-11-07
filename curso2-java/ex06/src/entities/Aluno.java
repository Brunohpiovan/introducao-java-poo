package entities;

public class Aluno extends Pessoa{
    private Double nota;
    public String aprovacao;

    //construtores
    public Aluno() {
    }

    public Aluno(String nome, String cpf, String dataNascimento) {
        super(nome, cpf, dataNascimento);
    }

    //getters and setters
    public Double getNota() {
        return nota;
    }

    public void setNota(Double nota) {
        this.nota = nota;
    }

    public String getAprovacao() {
        return aprovacao;
    }

    public void setAprovacao(String aprovacao) {
        this.aprovacao = aprovacao;
    }
    //metodo
    public String avaliaAprov(){
        if(this.nota>=6){
            return "Aprovado";
        }else{
            return "Reprovado";
        }
    }

    @Override
    public String toString() {
        return "Aluno{" +
                "\nnome=" + getNome() +
                "\nnota=" + nota +
                "\nResultado='" + avaliaAprov() + "\n" +
                '}';
    }
}
