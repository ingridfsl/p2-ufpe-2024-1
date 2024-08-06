package lista2;

import java.util.Scanner;

public class Questao4 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Insira o primeiro valor: ");
        int n1 = sc.nextInt();

        System.out.println("Insira o segundo valor: ");
        int n2 = sc.nextInt();

        if (n1 == n2) {
            System.out.println(n1*n2);
        }
        else if (n1 > n2) {
            System.out.println(n1-n2);
        }
        else{
            System.out.println(n1+n2);
        }

        sc.close();

    }
}
