package lista4;

import java.util.Scanner;

public class Questao5 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int [] vetor = new int [5];

        for (int i = 0; i < vetor.length; i++) {
            System.out.println("Insira o dado da posição " + (i + 1) + ":");
            vetor[i] = sc.nextInt();
        }
        System.out.println("Insira a chave de busca: ");
        int chave = sc.nextInt();

        boolean busca = false;
        for (int i = 0; i < vetor.length; i++) {
            if (vetor[i] == chave) {
                System.out.println("Chave encontrada na posição: "+ vetor[i]);
                busca = true;
                break;
            }
        }

        if (!busca){
            System.out.println("Chave não encontrada!");
        }

        sc.close();

    }
}
