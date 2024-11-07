package entities;

public class ContaEmpresarial extends Conta{
    private double limitEmprestimo;

    public ContaEmpresarial(){
        super();
    }

    public ContaEmpresarial(Integer numero, String titular, double saldo, double limitEmprestimo) {
        super(numero, titular, saldo);
        this.limitEmprestimo = limitEmprestimo;
    }

    public double getLimitEmprestimo() {
        return limitEmprestimo;
    }

    public void setLimitEmprestimo(double limitEmprestimo) {
        this.limitEmprestimo = limitEmprestimo;
    }

    public void emprestimo(double quantidade){
        if(quantidade <= limitEmprestimo){
            saldo += quantidade - 10.0;
        }
    }

    @Override
    public void saque(double quantidade){
        super.saque(quantidade);
        saldo -= 2.0;
    }
}
