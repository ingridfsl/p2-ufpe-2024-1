package lista4;

import java.util.Scanner;

public class Questao4 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        double[] vetor = new double[5];

        for (int i = 0; i < vetor.length; i++) {
            System.out.println("Insira o dado da posição " + (i + 1) + ":");
            vetor[i] = sc.nextDouble();
        }

        double[] resultado = dividir100(vetor);

        System.out.println("Conteúdo dividido por 100:");
        for (int i = 0; i < resultado.length; i++) {
            System.out.println(resultado[i]);
        }

        sc.close();
    }

    public static double[] dividir100(double[] vetor) {
        double[] vetor2 = new double[vetor.length];
        for (int i = 0; i < vetor.length; i++) {
            vetor2[i] = vetor[i] / 100.0;
        }
        return vetor2;
    }
}
