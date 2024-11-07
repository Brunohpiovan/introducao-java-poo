package entities;

public class ContaPoupanca extends Conta{
    private Double taxaJuros;

    public ContaPoupanca(){
        super();
    }

    public ContaPoupanca(Integer numero, String titular, double saldo, Double taxaJuros) {
        super(numero, titular, saldo);
        this.taxaJuros = taxaJuros;
    }

    @Override
    public void saque(double quantidade){
        saldo -= quantidade;
    }

    public void atualizarSaldo(){
        saldo += saldo*taxaJuros;
    }

    public Double getTaxaJuros() {
        return taxaJuros;
    }

    public void setTaxaJuros(Double taxaJuros) {
        this.taxaJuros = taxaJuros;
    }
}
