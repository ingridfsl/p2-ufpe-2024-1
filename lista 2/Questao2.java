package lista2;

import java.util.Scanner;

public class Questao2 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Insira o primeiro número: ");
        int n1 = sc.nextInt();

        System.out.println("Insira o segundo número: ");
        int n2 = sc.nextInt();

        System.out.println("Insira o terceiro número: ");
        int n3 = sc.nextInt();

        if (n1 > n2 && n1 > n3) {
            System.out.println("Condição satisfeita");
        }
        else{
            System.out.println("Erro");
        }

        sc.close();
    }
}
  