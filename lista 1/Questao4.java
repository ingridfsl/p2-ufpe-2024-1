package lista1;

import java.util.Scanner;

public class Questao4 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Insira a base: ");
        int base = sc.nextInt();

        System.out.println("Insira a altura: ");
        int altura = sc.nextInt();

        int area = (base * altura)/2;

        System.out.println("Área do triângulo: "+ area);

        sc.close();
    }
}
