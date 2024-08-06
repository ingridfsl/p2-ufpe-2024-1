package lista2;

import java.util.Scanner;

public class Questao3 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Insira um número: ");
        int n = sc.nextInt();

        if (n % 2 == 0) {
            System.out.println(n +" é par.");
        }
        else{
            System.out.println(n +" é ímpar.");
        }

        sc.close();
    }
}
