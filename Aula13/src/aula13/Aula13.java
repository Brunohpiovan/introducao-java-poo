package aula13;

public class Aula13 {
    public static void main(String[] args) {
        Cachorro c = new Cachorro();
        c.emitirSom();
        System.out.println("Frase:");
        c.reagir("Sai cachorro");
        System.out.println("");
        System.out.println("Horario:");
        c.reagir(1.5F);
        System.out.println("");
        System.out.println("Dono:");
        c.reagir(true);
        System.out.println("");
        System.out.println("Idade e peso:");
        c.reagir(2, 12.5F);
    }
    
}
