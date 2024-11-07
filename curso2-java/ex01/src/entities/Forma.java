package entities;

public class Forma {
    private double largura;
    private double altura;

    public Forma(double largura, double altura) {
        this.largura = largura;
        this.altura = altura;
    }

    public double area(){
        return this.largura* this.altura;
    }

}
