package entities;

import java.time.LocalDate;
import java.util.ArrayList;
import java.util.List;

public class Pedido {
    private Integer id;
    private Cliente cliente;
    private List<Produto> listaProdutos = new ArrayList<>();
    private String status;
    private LocalDate data;

    //construtores
    public Pedido() {
    }

    public Pedido(Integer id, Cliente cliente, List<Produto> produtos) {
        this.id = id;
        this.cliente = cliente;
        this.listaProdutos = produtos;
        this.status = "Novo";
        this.data= LocalDate.now();
    }

    //getters and setters
    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public Cliente getCliente() {
        return cliente;
    }

    public void setCliente(Cliente cliente) {
        this.cliente = cliente;
    }

    public List<Produto> getListaProdutos() {
        return listaProdutos;
    }

    public void setListaProdutos(List<Produto> listaProdutos) {
        this.listaProdutos = listaProdutos;
    }

    public String getStatus() {
        return status;
    }

    public void setStatus(String status) {
        this.status = status;
    }

    //metodos
    public void adicionarProduto(Produto produto){
        this.listaProdutos.add(produto);
    }
    public void removerProduto(Produto produto){
        this.listaProdutos.remove(produto);
    }
    public void finalizarPedido() {
        this.status = "Finalizado";
    }
    public void cancelarPedido() {
        this.status = "Cancelado";
    }

    @Override
    public String toString() {
        return "Pedido{" +
                "   \nid=" + id +
                "   \n" + cliente +
                "   \n" + listaProdutos +
                "   \nstatus='" + status + '\'' +
                "   \ndata=" + data +
                '}';
    }
}
