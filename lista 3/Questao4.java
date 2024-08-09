package lista3;

import java.util.Scanner;

public class Questao4 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Insira o valor de A: ");
        int a = sc.nextInt();

        System.out.println("O valor de B: ");
        int b = sc.nextInt();

        for (int c = a; c<=b; c++){
            if (c%2==1){
                System.out.println("É ímpar: " + c);
            }
        }

        sc.close();

    }
}
