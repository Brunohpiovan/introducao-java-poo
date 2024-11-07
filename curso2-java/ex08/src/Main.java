import entities.Produto;

import java.util.Locale;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Locale.setDefault(Locale.US);
        Scanner sc = new Scanner(System.in);

        int n = sc.nextInt();
        Produto[] vect = new Produto[n];

        for(int i = 0; i<n; i ++){
            sc.nextLine();
            String nome = sc.nextLine();
            double preco = sc.nextDouble();
            vect[i] = new Produto(nome,preco);
        }

        double soma = 0;

        for(int i = 0; i<n; i ++){
            soma += vect[i].getPreco()/n;
        }
        System.out.printf("Media igual %.2f",soma);




        sc.close();
    }
}