// O programa exibe um menu com códigos, nomes e preços dos produtos.
// Em seguida, lê o código do item escolhido e a quantidade desejada.
// Com base no código informado, determina o preço do produto.
// Por fim, calcula e exibe o valor total a pagar pela compra.

import java.util.Scanner;

public class c_exercicio_05 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("CÓDIGO |  ESPECIFICAÇÃO  | PREÇO");
        System.out.println("  1    | Cachorro Quente | R$ 4.00");
        System.out.println("  2    | X-Salada        | R$ 4.50");
        System.out.println("  3    | X-Bacon         | R$ 5.00");
        System.out.println("  4    | Torrada Simples | R$ 2.00");
        System.out.println("  5    | Refrigerante    | R$ 1.50");

        int cod;
        int qtd;

        System.out.println("Qual item do menu você gostaria de comprar?");
        cod = sc.nextInt();

        System.out.println("Quantas unidades?");
        qtd = sc.nextInt();

        double total;

        if (cod == 1) {
            total = qtd * 4.0;
        } else if (cod == 2) {
            total = qtd * 4.5;
        } else if (cod == 3) {
            total = qtd * 5.0;
        } else if (cod == 4) {
            total = qtd * 2.0;
        } else {
            total = qtd * 1.5;
        }

        System.out.printf("O total da sua compra é: R$ %.2f.%n", total);

        sc.close();
    }
}
