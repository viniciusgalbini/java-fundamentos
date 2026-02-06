// O programa lê dois valores reais que representam as coordenadas (x, y) de um ponto no plano cartesiano.
// Primeiro, verifica se o ponto está na origem (x = 0 e y = 0).
// Depois, verifica se o ponto está sobre o eixo X ou sobre o eixo Y.
// Caso contrário, determina em qual quadrante (Q1, Q2, Q3 ou Q4) o ponto se encontra
// com base nos sinais de x e y.


import java.util.Locale;
import java.util.Scanner;

public class c_exercicio_07 {
    public static void main(String[] args) {
        Locale.setDefault(Locale.US);
        Scanner sc = new Scanner(System.in);

        double x, y;

        System.out.println("Digite o primeiro número:");
        x = sc.nextDouble();

        System.out.println("Digite o segundo número:");
        y = sc.nextDouble();

        if (x == 0.0 && y == 0.0) {
            System.out.println("Origem");
        } else if (x == 0.0) {
            System.out.println("Eixo Y");
        } else if (y == 0.0) {
            System.out.println("Eixo X");
        } else if (x > 0.0 && y > 0.0) {
            System.out.println("Q1");
        } else if (x < 0.0 && y > 0.0) {
            System.out.println("Q2");
        } else if (x < 0.0 && y < 0.0) {
            System.out.println("Q1");
        } else {
            System.out.println("Q4");
        }

        sc.close();
    }
}
