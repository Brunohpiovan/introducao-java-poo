
package exercico;

public class Exercico {


    public static void main(String[] args) {
        
        Mouse m1 = new Mouse();
        m1.cor = "Vermelho";
        m1.dpimax = 20000;
        m1.marca = "HyperX";
        m1.preco = 800.55;
        m1.status();
        
        
        Teclado t1 = new Teclado();
        t1.marca ="Machenike";
        t1.cor ="Branco";
        t1.switchteclado ="Brown";
        t1.qtdteclas =162;
        t1.preco =550.99;
        t1.status();
        
        t1.acessibilidade();
        
    }
    
}
