// O programa lê dois números inteiros e verifica se um é múltiplo do outro.
// Se forem múltiplos entre si, exibe "Sao Multiplos".
// Caso contrário, exibe "Nao sao Multiplos".

import java.util.Scanner;

public class c_exercicio_03 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int numero1, numero2;

        System.out.println("Digite o primeiro número:");
        numero1 = sc.nextInt();

        System.out.println("Digite o segundo número:");
        numero2 = sc.nextInt();

        if (numero1 % numero2 == 0 || numero2 % numero1 == 0) {
            System.out.println("Os números são multiplos.");
        } else {
            System.out.println("Os números não são multiplos.");
        }

        sc.close();
    }
}
