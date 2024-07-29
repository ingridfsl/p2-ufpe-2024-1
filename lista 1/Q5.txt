package lista1;

import java.util.Scanner;
import java.lang.Math;

public class Questao5 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        double n1;
        double n2;

        System.out.println("Insira o primeiro número: ");
        n1 = sc.nextDouble();
        while(n1<=0){
            System.out.println("O número precisa ser maior que 0! Tente novamente.");
            n1 = sc.nextDouble();
        }

        System.out.println("Insira o segundo número:");
        n2 = sc.nextDouble();

        while(n2<=0){
            System.out.println("O número precisa ser maior que 0! Tente novamente.");
            n2 = sc.nextDouble();
        }

        double x = Math.pow(n1, n2);
        System.out.println("Resultado: " + x);

        sc.close();
    }
}
