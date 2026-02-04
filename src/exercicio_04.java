// Enunciado:
// Programa que leia o número de um funcionário, seu número de horas trabalhadas, o valor que recebe por
// hora e calcula o salário desse funcionário. A seguir, mostre o número e o salário do funcionário, com duas casas
// decimais.

import java.util.Locale;
import java.util.Scanner;

public class exercicio_04 {
    public static void main(String[] args) {

        // Define o padrão de localização para usar ponto como separador decimal
        Locale.setDefault(Locale.US);

        // Cria o Scanner para leitura dos dados digitados pelo usuario
        Scanner sc = new Scanner(System.in);

        // Declaração das variaveis:
        // numero = número de identificação do funcionario
        // horas = quantidade de horas trabalhadas
        // valorHora = valor pago por hora trabalhada
        // salario = salario calculado
        // nomeFunc = nome do funcionário (não utilizado neste exercício)
        int numero, horas;
        double valorHora, salario;
        String nomeFunc;

        // Solicita e lê o número do funcionario
        System.out.println("Insira o número do funcionário:");
        numero = sc.nextInt();

        // Solicita e lê a quantidade de horas trabalhadas
        System.out.println("Insira o número de horas trabalhadas pelo funcionário:");
        horas = sc.nextInt();

        // Solicita e lê o valor da hora trabalhada
        System.out.println("Insira o valor da hora do funcionário:");
        valorHora = sc.nextDouble();

        // Calcula o salario com base nas horas trabalhadas
        salario = valorHora * horas;

        // Exibe o número do funcionario
        System.out.println("Número do funcionário: " + numero);

        // Exibe o salário calculado
        System.out.println("Salário do funcionário: R$" + salario);

        // Fecha o Scanner
        sc.close();
    }
}