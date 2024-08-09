package lista1;

import java.util.Scanner;

public class Questao2  {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int counter= 0;
        double soma= 0;

        System.out.println("Informe três notas, em sequência: ");
        while(counter <=2){
            double nota = sc.nextDouble();
            soma +=nota;
            counter++;

        }

        double media = soma/3;

        System.out.printf("Média aritmética: %.2f", media);

        sc.close();
    }
}
