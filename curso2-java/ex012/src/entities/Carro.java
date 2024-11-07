package entities;

public class Carro {

    private String cor;
    protected double velocidade = 0;

    //construtor
    public Carro(String cor) {
        this.cor = cor;
    }

    //getters and setters
    public String getCor() {
        return cor;
    }

    public void setCor(String cor) {
        this.cor = cor;
    }

    public Double getVelocidade() {
        return velocidade;
    }

    public void setVelocidade(Double velocidade) {
        this.velocidade = velocidade;
    }

    //metodos
    public void acelerar(){
        if(velocidade <=150){
            this.velocidade += 10;
            return;
        }
        System.out.println("O carro ja atingiu seu limite de velocidade.");
    }
    public void frear(){
        if(velocidade >0){
            this.velocidade -= 10;
            return;
        }
        System.out.println("O carro esta parado");
    }
}
