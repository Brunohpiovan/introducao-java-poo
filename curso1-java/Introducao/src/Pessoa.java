class Ser{
    String nome;
    int idade;

    void setNome(String nome){
        this.nome = nome;
    }
    void setIdade(int idade){
        this.idade = idade;
    }
}

public class Pessoa extends Ser{
    void criaMain(){
        Main meuMain = new Main();
        System.out.println(meuMain.salary);
        System.out.println(meuMain.name);
    }
}
