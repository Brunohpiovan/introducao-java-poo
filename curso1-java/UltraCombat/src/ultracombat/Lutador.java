
package ultracombat;

public class Lutador {
    //atributos
    private String nome, nacionalidade, categoria;
    private int idade, vitorias, derrotas, empates;
    private float altura, peso;
    
    
    //metodos publicos
    public void apresentar(){
        System.out.println("------------------------------------------------------");
        System.out.println("CHEGOU A HORA!Apresentamos o lutador "+this.getNome());
        System.out.println("Diretamente de "+this.getNacionalidade());
        System.out.println("Com "+this.getIdade()+" anos e "+this.getAltura()+"m de altura");
        System.out.println("Pesando "+this.getPeso()+"kg.");
        System.out.println("Com "+this.getVitorias()+" Vitorias "+this.getEmpates()+" empates e apenas "+this.getDerrotas()+" derrotas." );
    }
    public void status(){
        System.out.println("-------------------------");
        System.out.println("Nome: "+this.getNome());
        System.out.println("Peso: "+this.getCategoria());
        System.out.println("Vitorias: "+this.getVitorias());
        System.out.println("Derrotas: "+this.getDerrotas());
        System.out.println("Empates: "+this.getEmpates());
    }
    public void ganharLuta(){
        this.setVitorias(this.getVitorias() + 1);
    }
    public void perderLuta(){
        this.setDerrotas(this.getDerrotas() + 1);
    }
    public void empatarLuta(){
        this.setEmpates(this.getEmpates() + 1);
    } 
    
    //metodos especiais

    public Lutador(String nome, String nacionalidade, int idade, int vitorias, int derrotar, int empates, float altura, float peso) {
        this.nome = nome;
        this.nacionalidade = nacionalidade;
        this.idade = idade;
        this.vitorias = vitorias;
        this.derrotas = derrotar;
        this.empates = empates;
        this.altura = altura;
        this.setPeso(peso);
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getNacionalidade() {
        return nacionalidade;
    }

    public void setNacionalidade(String nacionalidade) {
        this.nacionalidade = nacionalidade;
    }

    public String getCategoria() {
        return categoria;
    }

    public void setCategoria() {
        if(this.peso < 52.2){
            this.categoria = "Invalido";
        }else if(this.peso <=70.3){
            this.categoria = "Leve";
        }else if(this.peso <= 83.9){
            this.categoria = "Medio";
        }else if(this.peso <= 120.3){
            this.categoria = "Pesado";
        }else{
            this.categoria = "Invalido";
        }
    }

    public int getIdade() {
        return idade;
    }

    public void setIdade(int idade) {
        this.idade = idade;
    }

    public int getVitorias() {
        return vitorias;
    }

    public void setVitorias(int vitorias) {
        this.vitorias = vitorias;
    }

    public int getDerrotas() {
        return derrotas;
    }

    public void setDerrotas(int derrotas) {
        this.derrotas = derrotas;
    }

    public int getEmpates() {
        return empates;
    }

    public void setEmpates(int empates) {
        this.empates = empates;
    }

    public float getAltura() {
        return altura;
    }

    public void setAltura(float altura) {
        this.altura = altura;
    }

    public float getPeso() {
        return peso;
    }

    public void setPeso(float peso) {
        this.peso = peso;
        this.setCategoria();
    }
    
    
}
