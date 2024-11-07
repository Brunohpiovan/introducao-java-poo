package aula13;

public class Cachorro extends Lobo{
    @Override
    public void emitirSom(){
        System.out.println("Au! Au! Au!");
    }
    public void reagir(String frase){
        if(frase == "Ola"){
            System.out.println("Abanar e latir");
        }else{
            System.out.println("Rosnar");
        }
    }
    public void reagir(float hor){
        if(hor<12){
            System.out.println("Abanar");
        }else if(hor<18){
            System.out.println("Abanar e latir");
        }else{
            System.out.println("ignorar");
        }
    }
    public void reagir(boolean dono){
        if(dono){
            System.out.println("Abanar");
        }else{
            System.out.println("Ronar e latir.");
        }
    }
    
    public void reagir(int idade,float peso){
        if(idade<3 && peso<5){
            System.out.println("Abanar");
        }else if(idade<3 && peso>5){
            System.out.println("Latir");
        }else if(idade>3 && peso<5){
            System.out.println("Rosnar");
        }else{
            System.out.println("Ignorar");
        }
    }
}
