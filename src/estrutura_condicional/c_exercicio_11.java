// O programa calcula o valor de um desconto com base no preço de um produto.
// Se o preço for menor que 20.00, o desconto é de 1%.
// Caso contrário, o desconto é de 5%.
// O cálculo é feito usando o operador ternário.
// Ao final, o programa exibe o valor do desconto.

import java.util.Scanner;

public class c_exercicio_11 {
    static void main() {
        Scanner sc = new Scanner(System.in);

        double preco = 34.5;
        double desconto = (preco < 20.0) ? preco * 0.01 : preco * 0.05;

        System.out.printf("Desconto de: R$ %.3f%n", desconto);

        sc.close();
    }


}
