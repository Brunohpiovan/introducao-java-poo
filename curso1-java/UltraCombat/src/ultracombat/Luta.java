
package ultracombat;

import java.util.Random;

public class Luta {
    //Atributos
    private Lutador desafiado;
    private Lutador desafiante;
    private int rounds;
    private boolean aprovado;
    
    //metodos publico
    public void marcarLuta(Lutador l1,Lutador l2){
        if(l1.getCategoria().equals(l2.getCategoria()) && l1 != l2){
            setAprovado(true);
            setDesafiado(l1);
            setDesafiante(l2);
        }else{
            setAprovado(false);
            setDesafiado(null);
            setDesafiante(null);
        }
    }
    public void lutar(){
        if(getAprovado()){
            System.out.println("### DESAFIADO ###");
            getDesafiado().apresentar();
            System.out.println("### DESAFIANTE ###");
            getDesafiante().apresentar();
            
            Random aleatorio = new Random();
            int vencedor = aleatorio.nextInt(3); // 0 1 2
            System.out.println("==== RESULTADO DA LUTA ====");
            switch(vencedor){
                case 0://empate
                    System.out.println("EMPATOU!");
                    this.desafiado.empatarLuta();
                    this.desafiante.empatarLuta();
                    break;
                case 1://desafiado vence
                    System.out.println("Vitoria do "+getDesafiado().getNome()+"!!!");
                    this.desafiado.ganharLuta();
                    this.desafiante.perderLuta();
                    break;
                case 2://desafiante vence
                    System.out.println("Vitoria do "+getDesafiante().getNome()+"!!!");
                    this.desafiado.perderLuta();
                    this.desafiante.ganharLuta();
                    break;
            }
            System.out.println("=================");
        }else{
            System.out.println("A luta nao pode acontecer.");
        }
    }
    //metodos especiais

    public Lutador getDesafiado() {
        return desafiado;
    }

    public void setDesafiado(Lutador desafiado) {
        this.desafiado = desafiado;
    }

    public Lutador getDesafiante() {
        return desafiante;
    }

    public void setDesafiante(Lutador desafiante) {
        this.desafiante = desafiante;
    }

    public int getRounds() {
        return rounds;
    }

    public void setRounds(int rounds) {
        this.rounds = rounds;
    }

    public boolean getAprovado() {
        return aprovado;
    }

    public void setAprovado(boolean aprovado) {
        this.aprovado = aprovado;
    }
    
}
