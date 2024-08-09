package lista3;

import java.util.Scanner;

public class Questao5 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        boolean ehPrimo = true;

        System.out.println("Insira um número: ");
        int n = sc.nextInt();

        if (n <= 1) {
            ehPrimo = false;
        } else {
            for (int i = 2; i <= Math.sqrt(n); i++) {
                if (n % i == 0) {
                    ehPrimo = false;
                    break;
                }
            }
        }

        if (ehPrimo) {
            System.out.println(n + " é primo.");
        } else {
            System.out.println(n + " não é primo.");
        }

        sc.close();
    }
}
