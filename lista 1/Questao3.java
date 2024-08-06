package lista1;

import java.util.Scanner;

public class Questao3 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Insira o salário: ");
        double sal = sc.nextDouble();

        double sal2 = sal*1.25;

        System.out.printf("Novo salário: %.2f", sal2);
    }
}
