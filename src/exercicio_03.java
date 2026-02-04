import java.util.Locale;
import java.util.Scanner;

public class exercicio_03 {
    public static void main(String[] args) {
        // Define o padrão de localização para usar ponto como separador decimal
        Locale.setDefault(Locale.US);

        // Cria o objeto Scanner para a leitura de dados do teclado
        Scanner sc = new Scanner(System.in);

        // Declaração das variaveis:
        // A, B, C, D = valores inteiros no input
        // dif = resultado da diferença entre os produtos
        int A, B, C, D, dif;

        // Leitura dos quatro valores inteiros
        A = sc.nextInt();
        B = sc.nextInt();
        C = sc.nextInt();
        D = sc.nextInt();

        // Calcula a diferença: (A * B) - (C * D)
        dif = (A * B - C * D);

        // Exibe o resultado da diferença
        System.out.printf("A diferença entre os números é de: " + dif);

        // Fecha o Scanner
        sc.close();
    }
}
