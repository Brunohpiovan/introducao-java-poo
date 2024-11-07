import java.util.Locale;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Locale.setDefault(Locale.US);
        Scanner sc = new Scanner(System.in);
        System.out.print("Quantas alturas vao ser lidas? ");
        int n = sc.nextInt();
        double[] alt = new double[n];
        for(int x=0;x<n;x++){
            System.out.print("Altura #"+ x + ": ");
            alt[x] = sc.nextDouble();
        }
        double media = 0;
        for(int x=0;x<n;x++){
            media += alt[x]/n;
        }
        System.out.printf("A altura media é %.2fm",media);


        sc.close();
    }
}