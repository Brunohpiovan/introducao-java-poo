package entities;

import java.time.LocalDate;
import java.util.Date;

public class ProdutoAlimenticio extends Produto{
    private LocalDate dataValidade;

    public ProdutoAlimenticio() {
    }

    public ProdutoAlimenticio(Integer id, String nome, Double preco, int qtdEstoque) {
        super(id, nome, preco, qtdEstoque);
        this.dataValidade = LocalDate.now();
    }

    public LocalDate getDataValidade() {
        return dataValidade;
    }

    public void setDataValidade(LocalDate dataValidade) {
        this.dataValidade = dataValidade;
    }
}
