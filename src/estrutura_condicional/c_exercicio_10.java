// O programa lê um número inteiro que representa um dia da semana.
// Os valores válidos vão de 1 a 7, onde:
// 1 = Domingo, 2 = Segunda, 3 = Terça, 4 = Quarta,
// 5 = Quinta, 6 = Sexta e 7 = Sábado.
// Caso o número informado não esteja entre 1 e 7,
// o programa exibe a mensagem "Valor Inválido".

import java.util.Scanner;

public class c_exercicio_10 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int x = sc.nextInt();

        String dia = switch (x) {
            case 1 -> "Domingo";
            case 2 -> "Segunda";
            case 3 -> "Terça";
            case 4 -> "Quarta";
            case 5 -> "Quinta";
            case 6 -> "Sexta";
            case 7 -> "Sábado";
            default -> "Valor Inválido";
        };

        System.out.println("Dia da semana: " + dia);

        sc.close();
    }
}
