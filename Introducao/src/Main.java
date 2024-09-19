public class Main {
    public String name;

    protected  int salary;

    public static void main(String[] args) {

    }

    private void AtualizaSalario(){
        this.salary=400;
    }
    public int GetSalary(){
        this.AtualizaSalario();
        return this.salary;
    }

}