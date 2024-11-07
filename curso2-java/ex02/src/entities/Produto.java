package entities;

public class Produto {
    private String nome;
    private double preco;
    private int quantidade;

    //metodos
    public Produto(String nome, double preco, int quantidade) {
        this.nome = nome;
        this.preco = preco;
        this.quantidade = quantidade;
    }

    public double valorTotal(){
        return this.quantidade*this.preco;
    }

    public void addProduto(int quant){
        this.quantidade +=quant;
    }
    public void remProduto(int del){
        this.quantidade -=del;
    }

    @Override
    public String toString() {
        return "Produto{" + "\n" +
                "nome=" + nome + "\n" +
                "preco=" + preco + "\n" +
                "quantidade=" + quantidade + "\n" +
                "valor Total=" + valorTotal() + "\n" +
                '}';
    }

    //getters and setters
    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public double getPreco() {
        return preco;
    }

    public void setPreco(double preco) {
        this.preco = preco;
    }

    public int getQuantidade() {
        return quantidade;
    }

    public void setQuantidade(int quantidade) {
        this.quantidade = quantidade;
    }
}
