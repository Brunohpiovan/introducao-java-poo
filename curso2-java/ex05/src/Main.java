import entities.Cliente;
import entities.Pedido;
import entities.Produto;
import entities.ProdutoEletronico;

import java.util.ArrayList;
import java.util.List;

public class Main {
    public static void main(String[] args) {
        List<Produto> prod = new ArrayList<>();
        Produto p1 = new ProdutoEletronico(1,"PS5",3500.0,5,12);
        Cliente cli = new Cliente(2,"Joao","Joao@gmail.com");
        prod.add(p1);
        Pedido ped = new Pedido(3,cli,prod);

        System.out.println(ped);

    }
}