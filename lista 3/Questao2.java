package lista3;

import java.util.ArrayList;
import java.util.Scanner;

public class Questao2 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Insira o valor de A: ");
        int a = sc.nextInt();

        System.out.println("Insira o valor de B: ");
        int b = sc.nextInt();

        System.out.println("Série numérica: ");
        for (int i = a+1; i < b; i++) {
            System.out.print(i + " ");
        }

        sc.close();

    }
}



