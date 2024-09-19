package trycatch;

import java.util.InputMismatchException;
import java.util.Scanner;

public class TryCatch {

    public static void main(String[] args) {
        method1();
        System.out.println("Programa terminou.");
    }
    public static void method1(){
        System.out.println("***METHOD1 START***");
        method2();
        System.out.println("***METHOD1 END***");
    }
    
    public static void method2(){
        System.out.println("***method2 Start***");
       	Scanner sc = new Scanner(System.in);
        
	try {
            String[] vect = sc.nextLine().split(" ");
            int position = sc.nextInt();
            System.out.println(vect[position]);	
            }catch(ArrayIndexOutOfBoundsException e) {
            System.out.println("Posicao invalida");
            e.printStackTrace();
            sc.next();
            }catch(InputMismatchException e) {
            System.out.println("Nao existe posicao representada por letras.");
	}
        
        sc.close();
        System.out.println("***METHOD2 END***");
    }
    
}
