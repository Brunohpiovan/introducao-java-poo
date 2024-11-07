package entities;

public class ProdutoEletronico extends Produto{
    private int garantiaMeses;

    public ProdutoEletronico() {
    }

    public ProdutoEletronico(Integer id, String nome, Double preco, int qtdEstoque, int garantiaMeses) {
        super(id, nome, preco, qtdEstoque);
        this.garantiaMeses = garantiaMeses;
    }

    public int getGarantiaMeses() {
        return garantiaMeses;
    }

    public void setGarantiaMeses(int garantiaMeses) {
        this.garantiaMeses = garantiaMeses;
    }
}
