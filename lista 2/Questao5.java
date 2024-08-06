package lista2;

import java.util.Scanner;

public class Questao5 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Digite 1 para somar;\n" +
                "Digite 2 para subtrair;\n" +
                "Digite 3 para multiplicar;\n" +
                "Digite 4 para dividir; ");

        int n = sc.nextInt();

        System.out.println("Insira o primeiro valor: ");
        int n1 = sc.nextInt();

        System.out.println("Insira o segundo valor: ");
        int n2 = sc.nextInt();

        if (n ==1){
            System.out.println(n1+n2);
        }
        else if (n ==2){
            System.out.println(n1-n2);
        }
        else if (n ==3){
            System.out.println(n1*n2);
        }
        else if (n ==4){
            if (n2 != 0) {
                System.out.println(n1 / n2);
            }
            else{
                System.out.println("Divisão por zero.");
            }

        }

        sc.close();
    }
}
