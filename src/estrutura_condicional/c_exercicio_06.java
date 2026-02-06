// O programa lê um número com ponto flutuante.
// Em seguida, verifica em qual intervalo o valor se encontra:
// [0,25], (25,50], (50,75] ou (75,100].
// Caso o número esteja fora desses intervalos, exibe a mensagem "Fora de intervalo".

import java.util.Locale;
import java.util.Scanner;
import java.util.Locale;

public class c_exercicio_06 {
    public static void main(String[] args) {
        Locale.setDefault(Locale.US);
        Scanner sc = new Scanner(System.in);

        double numero;

        System.out.println("Digite o número:");
        numero = sc.nextDouble();

        if (numero < 0 || numero > 100) {
            System.out.println("O número está fora do intervalo.");
        } else if(numero <= 25.0) {
            System.out.println("O número está dentro do intervalo [0, 25]");
        } else if(numero <= 50.0) {
            System.out.println("O número está dentro do intervalo (25, 50]");
        } else if(numero <= 75.0) {
            System.out.println("O número está dentro do intervalo (50, 75]");
        } else {
            System.out.println("O número está dentro do intervalo (75, 100]");
        }

        sc.close();
    }
}
