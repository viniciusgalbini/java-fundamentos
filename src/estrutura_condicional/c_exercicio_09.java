// O programa lê a quantidade de minutos consumidos em um plano de telefone.
// O valor básico da conta é R$ 50.00, que inclui até 100 minutos.
// Caso o consumo ultrapasse 100 minutos, é cobrado um valor adicional de R$ 2.00
// para cada minuto excedente.
// Ao final, o programa exibe o valor total da conta.

import java.util.Locale;
import java.util.Scanner;

public class c_exercicio_09 {
    public static void main(String[] args) {
        Locale.setDefault(Locale.US);
        Scanner sc = new Scanner(System.in);

        int minutos = sc.nextInt();
        double conta = 50.0;

        if (minutos > 100) {
            conta += (minutos - 100) * 2.0;
        }

        System.out.printf("Valor da conta = R$ %.2f%n", conta);

        sc.close();
    }
}
