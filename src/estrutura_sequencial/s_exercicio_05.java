// Enunciado:
// Programa para ler o código de uma peça 1, o número de peças 1, o valor unitário de cada peça 1, o
// código de uma peça 2, o número de peças 2 e o valor unitário de cada peça 2. Calcule e mostre o valor a ser pago

import java.util.Locale;
import java.util.Scanner;

public class s_exercicio_05 {
    public static void main(String[] args) {

        // Define o padrão de localização para usar ponto como separador decimal
        Locale.setDefault(Locale.US);

        // Cria o Scanner para leitura dos dados de entrada
        Scanner sc = new Scanner(System.in);

        // Declaração das variáveis:
        // cod1, cod2 = códigos dos produtos
        // qte1, qte2 = quantidades compradas de cada produto
        // preco1, preco2 = preço unitário de cada produto
        // total = valor total da compra
        int cod1, cod2, qte1, qte2;
        double preco1, preco2, total;

        // Leitura dos dados do primeiro produto
        System.out.println("Insira o código do produto:");
        cod1 = sc.nextInt();

        System.out.println("Insira a quantidade de itens desse produto:");
        qte1 = sc.nextInt();

        System.out.println("Insira o valor do produto:");
        preco1 = sc.nextDouble();

        // Leitura dos dados do segundo produto
        System.out.println("Insira o código do produto:");
        cod2 = sc.nextInt();

        System.out.println("Insira a quantidade de itens desse produto:");
        qte2 = sc.nextInt();

        System.out.println("Insira o valor do produto:");
        preco2 = sc.nextDouble();

        // Cálculo do valor total da compra
        total = preco1 * qte1 + preco2 * qte2;

        // Exibe o valor total a pagar com duas casas decimais
        System.out.printf("Valor total a pagar: R$ %.2f%n", total);

        // Fecha o Scanner
        sc.close();
    }
}
