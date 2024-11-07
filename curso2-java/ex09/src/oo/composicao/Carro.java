package oo.composicao;

public class Carro {

    private Motor motor;

    public Carro(){
        this.motor = new Motor(this);
    }

    public void acelerar(){
        if(motor.getFatorInjecao()<2.6){
            motor.setFatorInjecao(motor.getFatorInjecao()+0.4);
        }

    }
    public void frear(){
        if(motor.getFatorInjecao()>0.5){
            motor.setFatorInjecao(motor.getFatorInjecao()-0.4);
        }

    }

    public void ligar(){
        motor.setLigado(true);
    }
    public void desligar(){
        motor.setLigado(false);
    }

    public boolean estaLigado(){
        return motor.getLigado();
    }

    public Motor getMotor() {
        return motor;
    }

    public void setMotor(Motor motor) {
        this.motor = motor;
    }
}
