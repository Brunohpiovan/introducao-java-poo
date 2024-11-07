package projetolivro;

public class Livro implements Publicacao{
    //atributos
    private String titulo,autor;
    private int totPaginas,pagAtual;
    private boolean aberto;
    private Pessoa leitor;
    
    
    //metodos publicos

    public String detalhes() {
        return "Livro{" + "titulo=" + titulo + ",\n autor=" + autor + ",\n totPaginas=" + totPaginas + ", pagAtual=" + pagAtual + ",\n aberto=" + aberto + ",\n leitor=" + leitor.getNome() +", idade=" + leitor.getIdade() +", sexo=" + leitor.getSexo() + '}';
    }
    
    
    
    //metodos especiais
    

    public Livro(String titulo, String autor, int totPaginas, Pessoa leitor) {
        this.titulo = titulo;
        this.autor = autor;
        this.totPaginas = totPaginas;
        this.leitor = leitor;
        this.aberto = false;
        this.pagAtual = 0;
    }

    public String getTitulo() {
        return titulo;
    }

    public void setTitulo(String titulo) {
        this.titulo = titulo;
    }

    public String getAutor() {
        return autor;
    }

    public void setAutor(String autor) {
        this.autor = autor;
    }

    public int getTotPaginas() {
        return totPaginas;
    }

    public void setTotPaginas(int totPaginas) {
        this.totPaginas = totPaginas;
    }

    public int getPagAtual() {
        return pagAtual;
    }

    public void setPagAtual(int pagAtual) {
        this.pagAtual = pagAtual;
    }

    public boolean isAberto() {
        return aberto;
    }

    public void setAberto(boolean aberto) {
        this.aberto = aberto;
    }

    public Pessoa getLeitor() {
        return leitor;
    }

    public void setLeitor(Pessoa leitor) {
        this.leitor = leitor;
    }
    //metodos abstratos
    @Override
    public void abrir() {
        setAberto(true);
    }

    @Override
    public void fechar() {
        setAberto(false);
    }

    @Override
    public void folhear(int p) {
        if(p>getTotPaginas()){
            System.out.println("Nao é possivel folhear");
        }else{
            setPagAtual(getPagAtual() + p);
        }
        
    }

    @Override
    public void avancaPag() {
        this.pagAtual++;
    }

    @Override
    public void voltarPag() {
        setPagAtual(getPagAtual()+1);
    }
    
}
