package aula12;

public class Cachorro extends Mamifero{
    public void latir(){
        System.out.println("Latindo");
    }
    @Override
    public void emitirSom(){
        System.out.println("AU! AU! AU!");
    }
}
