import entities.Carro;
import entities.Civic;
import entities.Ferrari;

public class Main {
    public static void main(String[] args) {

        Carro c1 = new Ferrari("Vermelha");
        Civic c2 = new Civic("Prata");


        System.out.println("FERRARI");
        c1.acelerar();
        c1.acelerar();
        c1.acelerar();
        System.out.println(c1.getVelocidade()+" KM/h");
        System.out.println("-----------------------");


        System.out.println("CIVIC");
        c2.acelerar();
        c2.acelerar();
        c2.acelerar();
        c2.acelerar();
        c2.frear();
        System.out.println(c2.getVelocidade()+" KM/h");
        System.out.println();
        c2.abrirTeto();
        c2.fecharTeto();
        System.out.println("----------------");

    }
}