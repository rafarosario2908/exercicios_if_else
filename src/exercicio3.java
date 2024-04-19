import java.util.Scanner;

public class exercicio3 {
    public static void main(String[] args) {

        /*
         * Faça um programa que solicita ao usuário a temperatura em graus Celsius e
         * converte
         * para Fahrenheit, seguindo a fórmula: F = (C * 9/5) + 32. Certifique-se de que
         * o
         * programa imprime uma mensagem de alerta caso a temperatura em Celsius seja
         * menor
         * que -273.15 (zero absoluto).
         */

        Scanner scanner = new Scanner(System.in);
        System.out.println("informe a temperatua em celsius: ");
        double temperaturaCelsius = scanner.nextDouble();
        final double zeroAbsolutoEmCelsius = -273.15;
        // se (celsius <= zero)

        if (temperaturaCelsius < zeroAbsolutoEmCelsius) {
            System.out.println("temperatura invalida.");

        } else {

            double temperaturafahrenheit = ((temperaturaCelsius * 9) / 5) + 32;

            System.out.println("temperatura fahrenheit: " + temperaturafahrenheit);
        }

        scanner.close();

    }

}
