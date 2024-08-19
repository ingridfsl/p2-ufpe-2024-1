package lista4;

import java.util.Scanner;

public class Questao1 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int num1=-1;
        int num2=-1;

        while (num1 < 0) {
            System.out.println("Insira o primeiro número: ");
            num1 = sc.nextInt();
        }
        while (num2 < 0) {
            System.out.println("Insira o segundo número: ");
            num2 = sc.nextInt();
        }

        System.out.println(maior(num1,num2));

    }

    public static String maior(int num1, int num2) {
        if (num1 > num2) {
            return "O maior é: " + num1;
        }
        else if (num2 > num1) {
            return "O maior é: " + num2;
        } else {
            return "Os números são iguais";
        }

    }

}
