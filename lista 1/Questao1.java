package lista1;

import java.util.Scanner;

public class Questao1 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int soma = 0;
        int counter = 0;

        System.out.println("Informe quatro números, em sequência: ");
        while (counter <=3){
            int num = sc.nextInt();
            soma += num;
            counter++;
        }
        
        System.out.println("Resultado da soma: "+ soma);

        sc.close();
    }
}
