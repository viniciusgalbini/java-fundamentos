// Enunciado:
// Programa que lê três valores de ponto flutuante (A, B e C) e calcula:
// a) área do triângulo retângulo (base A e altura C)
// b) área do círculo de raio C
// c) área do trapézio (bases A e B e altura C)
// d) área do quadrado de lado B
// e) área do retângulo de lados A e B

import java.util.Locale;
import java.util.Scanner;

public class exercicio_06 {
    public static void main(String[] args) {

        // Define o padrão de localização para usar ponto como separador decimal
        Locale.setDefault(Locale.US);

        // Cria o Scanner para leitura dos valores de entrada
        Scanner sc = new Scanner(System.in);

        // Declaração das variáveis:
        // A, B, C = valores informados pelo usuário
        // pi = valor constante de PI
        // triangulo, circulo, trapezio, quadrado, retangulo = áreas calculadas
        double A, B, C, pi, triangulo, circulo, trapezio, quadrado, retangulo;

        // Define o valor de PI
        pi = 3.14159;

        // Leitura dos três valores
        System.out.println("Insira o valor de A:");
        A = sc.nextDouble();
        System.out.println("Insira o valor de B:");
        B = sc.nextDouble();
        System.out.println("Insira o valor de C:");
        C = sc.nextDouble();

        // Cálculo da área do triângulo retângulo
        triangulo = A * C / 2.0;

        // Cálculo da área do círculo
        circulo = pi * C * C;

        // Cálculo da área do trapézio
        trapezio = (A + B) / 2.0 * C;

        // Cálculo da área do quadrado
        quadrado = B * B;

        // Cálculo da área do retângulo
        retangulo = A * B;

        // Exibe os resultados das áreas calculadas
        System.out.println("Área do triângulo: " + triangulo);
        System.out.println("Área do círculo: " + circulo);
        System.out.println("Área do trapézio: " + trapezio);
        System.out.println("Área do quadrado: " + quadrado);
        System.out.println("Área do retângulo: " + retangulo);

        // Fecha o Scanner
        sc.close();
    }
}