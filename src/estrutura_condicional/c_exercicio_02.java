// Programa para ler um número inteiro e dizer se este número é par ou ímpar.

import java.util.Scanner;

public class c_exercicio_02 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int numero;

        System.out.print("Digite o número:");
        numero = sc.nextInt();

        if (numero % 2 == 0) {
            System.out.println("O número é par.");
        } else {
            System.out.println("O número é ímpar.");
        }

        sc.close();
    }
}
