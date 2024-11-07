package entities;

public class Ferrari extends Carro{
    public Ferrari(String cor) {
        super(cor);
    }
    @Override
    public void acelerar(){
        if(velocidade <=150){
            this.velocidade += 40;
            return;
        }
        System.out.println("O carro ja atingiu seu limite de velocidade.");
    }
    @Override
    public void frear(){
        if(velocidade >0){
            this.velocidade -= 20;
            return;
        }
        System.out.println("O carro esta parado");
    }
}
