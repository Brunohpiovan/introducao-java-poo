package entities;

public class Curso {
    private String nome;
    private Double Carga;

    public Curso() {
    }

    public Curso(String nome, Double carga) {
        this.nome = nome;
        Carga = carga;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public Double getCarga() {
        return Carga;
    }

    public void setCarga(Double carga) {
        Carga = carga;
    }
}
