package oo.composicao;

public class Motor {
    private Double fatorInjecao = 1.0;
    private Boolean ligado = false;
    private Carro carro;


    public Motor(Carro carro){
        this.carro = carro;
    }

    public double giros(){
        if(ligado){
            return fatorInjecao * 3000;
        }
        return 0;
    }

    public Double getFatorInjecao() {
        return fatorInjecao;
    }

    public void setFatorInjecao(Double fatorInjecao) {
        this.fatorInjecao = fatorInjecao;
    }

    public Boolean getLigado() {
        return ligado;
    }

    public void setLigado(Boolean ligado) {
        this.ligado = ligado;
    }

    public Carro getCarro() {
        return carro;
    }

    public void setCarro(Carro carro) {
        this.carro = carro;
    }
}
