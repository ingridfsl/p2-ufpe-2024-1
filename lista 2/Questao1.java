package lista2;

import java.util.Scanner;

public class Questao1 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n1;
        int n2;

        System.out.println("Insira o primeiro número: ");
        n1 = sc.nextInt();

        System.out.println("Insira o segundo número:");
        n2 = sc.nextInt();

        if (n1 > n2) {
            System.out.println("O maior é: "+ n1);
        }
        else if (n1 < n2) {
            System.out.println("O maior é: "+ n2);
        }
        else {
            System.out.println("Os números são iguais");
        }

        sc.close();
    }
}
