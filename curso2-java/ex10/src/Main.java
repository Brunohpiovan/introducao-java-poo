import entities.Compra;
import entities.Item;

import java.util.ArrayList;
import java.util.List;

public class Main {
    public static void main(String[] args) {

        Item i1 = new Item("PS5",5,2350.0);
        Item i2 = new Item("XBOX",3,1350.0);
        List<Item> lista = new ArrayList<>();

        lista.add(i1);
        lista.add(i2);


        Compra c1 = new Compra("Joao",lista);

        System.out.println(c1);
        System.out.println(c1.valorTotal());
    }
}