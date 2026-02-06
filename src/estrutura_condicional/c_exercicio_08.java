// O programa lê o salário de uma pessoa e calcula o valor do Imposto de Renda a ser pago.
// A tributação é feita por faixas de salário, onde cada faixa possui uma alíquota diferente.
// Valores até R$ 2000.00 são isentos de imposto.
// Para salários acima desse valor, o imposto é calculado apenas sobre a parte que excede cada faixa.
// Ao final, o programa exibe o valor do imposto a pagar ou informa que o salário é isento.

import java.util.Locale;
import java.util.Scanner;

public class c_exercicio_08 {
    public static void main(String[] args) {
        Locale.setDefault(Locale.US);
        Scanner sc = new Scanner(System.in);

        double salario, imposto;

        System.out.println("Digite o seu salário:");
        salario = sc.nextDouble();

        if (salario <= 2000.0) {
            imposto = 0.0;
        } else if (salario <= 3000.0) {
            imposto = (salario - 2000.0) * 0.08;
        } else if (salario <= 4500.0) {
            imposto = (salario - 3000.0) * 0.18 + 1000.0 * 0.08;
        } else {
            imposto = (salario - 4500.0) * 0.28 + 1500 * 0.18 + 1000.0 * 0.08;
        }

        if (imposto == 0.0) {
            System.out.println("Você é isento de pagar imposto ;)");
        } else {
            System.out.printf("Você precisa pagar: R$ %.2f de impostos.%n",imposto);
        }

        sc.close();
    }
}
