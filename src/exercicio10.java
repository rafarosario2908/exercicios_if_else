import java.util.Scanner;

public class exercicio10 {

    public static void main(String[] args) {
        /*
         * Crie um programa que recebe o salário de um funcionário e verifica se ele
         * está acima
         * do salário mínimo atual
         */

        Scanner scanner = new Scanner(System.in);

        double salariomin = 1412.00;
        System.out.println("digite o seu salario atual: ");

        double salario = scanner.nextDouble();

        if (salario > salariomin) {

            System.out.println("seu salario esta acima do minimo nacional");

        } else {

            System.out.println("seu salario esta abaixo do minimo: ");
        }
        scanner.close();
    }

}
