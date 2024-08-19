package lista4;

import java.util.Scanner;

public class Questao2 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int [] array = new int[3];

        System.out.println("Insira o primeiro número: ");
        array[0] =sc.nextInt();

        System.out.println("Insira o segundo número: ");
        array[1] =sc.nextInt();

        System.out.println("Insira o terceiro número: ");
        array[2] =sc.nextInt();

        System.out.println(isFirstGreater(array));

    }

    public static String isFirstGreater(int[] array) {
        if (array[0] > array[1] && array[0] > array[2]) {
            return "Condição satisfeita";
        }
        else{
            return "Erro";
       }
    }
}
