package entities;

public class Produto {
    private Integer id;
    private String nome;
    private Double preco;
    private int qtdEstoque;

    // construtores
    public Produto() {
    }

    public Produto(Integer id, String nome, Double preco, int qtdEstoque) {
        this.id = id;
        this.nome = nome;
        this.preco = preco;
        this.qtdEstoque = qtdEstoque;
    }


    //getters and setters
    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public Double getPreco() {
        return preco;
    }

    public void setPreco(Double preco) {
        this.preco = preco;
    }

    public int getQtdEstoque() {
        return qtdEstoque;
    }

    public void setQtdEstoque(int qtdEstoque) {
        this.qtdEstoque = qtdEstoque;
    }

    //metodos
    public void adicionarEstoque(int qtd){
        this.qtdEstoque +=qtd;
    }

    public void removerEstoque(int qtd){
        this.qtdEstoque -=qtd;
    }

    @Override
    public String toString() {
        return "Produto{" +
                "\nid=" + id +
                "\nnome='" + nome + '\'' +
                "\npreco=" + preco +
                "\nqtdEstoque=" + qtdEstoque +
                '}';
    }
}
