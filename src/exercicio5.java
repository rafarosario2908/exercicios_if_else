import java.util.Scanner;

public class exercicio5 {
    public static void main(String[] args) {
        // Escreva um programa que recebe três números do usuário e imprime o maior
        // deles
        Scanner scanner = new Scanner(System.in);
        System.out.println("digite o primeiro numero");
        int num1 = scanner.nextInt();
        System.out.println("digite o segundo numero");
        int num2 = scanner.nextInt();
        System.out.println("digite o terceiro numero");
        int num3 = scanner.nextInt();

        if (num1 > num2 && num1 > num3) {
            System.out.println("o primeiro numero é o maior " + num1);

        } else if (num2 > num1 && num2 > num3) {

            System.out.println("o segundo numero é o maior " + num2);

        } else {
            System.out.println("o terceiro é o maior " + num3);

        }
        scanner.close();

    }

}
