import entities.Funcionario;
import entities.FuncionarioTercerizado;

import java.util.ArrayList;
import java.util.List;
import java.util.Locale;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        Locale.setDefault(Locale.US);
        Scanner sc = new Scanner(System.in);

        List<Funcionario> list = new ArrayList<>();

        System.out.print("Qual a quantidade de funcionarios? ");
        int n = sc.nextInt();
        for(int i =1;i<=n;i++){
            System.out.println("Funcionario #"+i+" dados:");
            System.out.print("Terceirizado?(y/n)");
            char ch = sc.next().charAt(0);
            System.out.print("Nome: ");
            sc.nextLine();
            String nome = sc.nextLine();
            System.out.print("Horas: ");
            int horas = sc.nextInt();
            System.out.print("Valor por hora: ");
            double valorPorHora = sc.nextDouble();
            if(ch == 'y'){
                System.out.println("Taxa adicional: ");
                double add = sc.nextDouble();
                Funcionario func = new FuncionarioTercerizado(nome,horas,valorPorHora,add);
                list.add(func);
            }else {
                Funcionario func = new Funcionario(nome,horas,valorPorHora);
                list.add(func);
            }
        }

        System.out.println();
        System.out.println("Pagamentos: ");
        for(Funcionario func : list){
            System.out.println(func.getNome() + " - $ " + String.format("%.2f",func.pagamento()));
        }

        sc.close();
    }
}