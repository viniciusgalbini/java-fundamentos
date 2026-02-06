// O programa lê a hora inicial e a hora final de um jogo.
// Em seguida, calcula a duração do jogo em horas.
// Se o jogo terminar no mesmo dia, a duração é a diferença entre as horas.
// Caso o jogo termine no dia seguinte, o cálculo considera a virada do dia (24 horas).
// Por fim, exibe a duração total do jogo.

import java.util.Scanner;

public class c_exercicio_04 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int horaInicial, horaFinal, duracao;

        System.out.println("Digite a hora que o jogo começou:");
        horaInicial = sc.nextInt();

        System.out.println("Digite a hora que o jogo acabou:");
        horaFinal = sc.nextInt();

        if (horaInicial < horaFinal) {
            duracao = horaFinal - horaInicial;
        } else {
            duracao = 24 - horaInicial + horaFinal;
        }

        System.out.println("O jogo durou: " + duracao + " horas.");

        sc.close();
    }
}
