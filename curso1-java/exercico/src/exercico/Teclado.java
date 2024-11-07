
package exercico;

public class Teclado {
    String marca;
    String switchteclado;
    String cor;
    double preco;
    int qtdteclas;
    
    void status(){
        System.out.println("TECLADO:");
        System.out.println("Marca: "+this.marca);
        System.out.println("Switch: "+this.switchteclado);
        System.out.println("Cor: "+this.cor);
        System.out.println("Preço: "+this.preco);
        System.out.println("Quantidade de teclas: "+this.qtdteclas);
    }
        void acessibilidade(){
        if(this.preco > 300){
            System.out.println("Esse produto esta caro.");
        }else{
            System.out.println("Esse produto esta acessivel.");
        }
    }
}
