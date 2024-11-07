import entities.Produto;

public class Main {
    public static void main(String[] args) {
        Produto p1 = new Produto("Produto teste",220.5,5);

        p1.addProduto(3);
        p1.remProduto(1);
        System.out.println(p1);
        }
    }
