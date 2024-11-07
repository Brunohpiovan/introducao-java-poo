package entities;

public class Civic extends Carro{

    private boolean tetoAberto = false;

    public Civic(String cor) {
        super(cor);
    }

    public void abrirTeto(){
        if(tetoAberto){
            System.out.println("O teto ja esta aberto.");
            return;
        }
        this.tetoAberto = true;
        System.out.println("O teto foi aberto");
    }

    public void fecharTeto(){
        if(!tetoAberto){
            System.out.println("O teto ja esta fechado.");
            return;
        }
        this.tetoAberto = false;
        System.out.println("O teto foi fechado");
    }

    public void verTeto(){
        if(this.tetoAberto){
            System.out.println("O teto esta aberto.");
            return;
        }
        System.out.println("O teto esta fechado.");
    }


    //getters and setters
    public boolean isTetoAberto() {
        return tetoAberto;
    }

    public void setTetoAberto(boolean tetoAberto) {
        this.tetoAberto = tetoAberto;
    }
}
