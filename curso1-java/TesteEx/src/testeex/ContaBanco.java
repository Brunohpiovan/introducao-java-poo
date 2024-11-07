/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package testeex;

/**
 *
 * @author bpiov
 */
public class ContaBanco {
    //atributos
    public int NumConta;
    protected String tipo;
    private String dono;
    private double saldo;
    private boolean status;

    
    //construtor
    public ContaBanco() {
        saldo = 0;
        status = false;
    }

    

    //metodos
    public void estadoAtual(){
        System.out.println("----------------------------------");
        System.out.println("Numero da conta:"+this.getNumConta());
        System.out.println("Tipo:"+this.getTipo());
        System.out.println("Dono(a):"+this.getDono());
        System.out.println("Saldo:"+this.getSaldo());
        System.out.println("Status:"+this.isStatus());
        
    
    
    
    
    }   
    
    public void abrirConta(String t){
        setTipo(t);
        setStatus(true);
        if(t=="CC"){
            setSaldo(50);
        }else if(t=="CP"){
            setSaldo(150);
        }
    }
    public void fecharConta(){
        if(this.saldo > 0){
            System.out.println("A conta tem dinheiro.");
        }else if(this.saldo < 0){
            System.out.println("A conta esta em debito.");
        }else{
            setStatus(false);
        }
    }
    public void depositar(double v){
        if(isStatus()){
            setSaldo(getSaldo()+v);
        }else{
            System.out.println("É impossivel depositar.");
        }     
    }
    public void sacar(double v){
        if(isStatus()){
            setSaldo(getSaldo()-v);
        }else{
            System.out.println("É impossivel sacar.");
        }    
    }
    public void pagarMensal(){
        float v=0;
        if(tipo == "CC"){
           v=12;
        }else if(tipo == "CP"){
           v=20;
        }
        if(status == true){
            if(saldo > v){
                setSaldo(getSaldo()-v);
            }else{
                System.out.println("Saldo insuficiente");
            }
        }else{
            System.out.println("Impossivel pagar.");
        }
    }
    
    //getter and setters    
    
    //num conta
    public int getNumConta() {
        return NumConta;
    }

    public void setNumConta(int n) {
        this.NumConta = n;
    }
    
    // tipo
    public String getTipo() {
        return tipo;
    }

    public void setTipo(String t) {
        this.tipo = t;
    }
   
    //dono
    public String getDono() {
        return dono;
    }

    public void setDono(String d) {
        this.dono = d;
    }

    //saldo
    public double getSaldo() {
        return saldo;
    }

    public void setSaldo(double s) {
        this.saldo = s;
    }

    //status
    public boolean isStatus() {
        return status;
    }

    public void setStatus(boolean status) {
        this.status = status;
    }
    
    
    
}
