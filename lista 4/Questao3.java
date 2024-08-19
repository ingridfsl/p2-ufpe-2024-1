package lista4;

import java.util.Scanner;

public class Questao3 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Insira um número: ");
        int num1 = sc.nextInt();

        System.out.println(parImpar(num1));

    }

    public static String parImpar(int num1) {
        if (num1 % 2 != 0) {
            return num1 + " é ímpar";
        } else {
            return num1 + " é par";
        }
    }
}
