// Programa para ler um número inteiro, e depois dizer se este número é negativo ou não.

import java.util.Scanner;

public class c_exercicio_01 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int numero;

        System.out.println("Digite o número:");
        numero = sc.nextInt();

        if (numero < 0) {
            System.out.println("O número é negativo.");
        } else {
            System.out.println("O número é positivo.");
        }

        sc.close();
    }
}
