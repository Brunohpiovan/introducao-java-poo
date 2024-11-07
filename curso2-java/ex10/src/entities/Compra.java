package entities;

import java.util.ArrayList;
import java.util.List;

public class Compra {

    private String cliente;
    private List<Item> itens = new ArrayList<>();

    public Compra(String cliente, List<Item> itens) {
        this.cliente = cliente;
        this.itens = itens;
    }

    public double valorTotal(){
        double soma = 0;

        for (Item item : itens){
            soma += item.getPreco()* item.getQuantidade();
        }
        return soma;
    }

    public String getCliente() {
        return cliente;
    }

    public void setCliente(String cliente) {
        this.cliente = cliente;
    }

    public List<Item> getItens() {
        return itens;
    }

    public void setItens(List<Item> itens) {
        this.itens = itens;
    }

    @Override
    public String toString() {
        return "Compra{" +
                "cliente='" + cliente + '\'' +
                ", itens=" + itens +
                '}';
    }
}
