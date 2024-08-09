package lista3;

import java.util.Scanner;

public class Questao3 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int count = 0 ;
        int num =-1;
        while (num != 0){
            System.out.println("Insira um número: ");
            num = sc.nextInt();
            if (num > 0){
                count++;
            }

        }
        System.out.println("Quantidade de positivos: "+ count);

        sc.close();
    }
}
