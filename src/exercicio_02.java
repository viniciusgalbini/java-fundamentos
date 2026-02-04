import java.util.Locale;
import java.util.Scanner;

public class exercicio_02 {
    public static void main(String[] args) {

        // Define o padrão de localização para usar ponto como separador decimal
        Locale.setDefault(Locale.US);

        // Cria o objeto Scanner para a leitura de dados do teclado
        Scanner sc = new Scanner(System.in);

        // Declaração das variaveis:
        // R = raio do circulo
        // A = aréa do circulo
        // pi = valor de PI
        double R, A, pi = 3.14159;

        // Lê o valor do raio
        R = sc.nextDouble();

        // Calcula a area do circulo (A = pi * R^2)
        A = pi * R * R;

        // Exibe o resultado com 4 casas decimais
        System.out.printf("A=%.4f%n", A);

        // Fecha o Scanner
        sc.close();
    }
}
