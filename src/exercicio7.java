import java.util.Scanner;

public class exercicio7 {

    // Faça um programa que recebe um caractere do usuário e verifica se é uma vogal
    // ou
    // consoante.
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("digite uma letra");
        char letra = scanner.next().charAt(0);

        if (letra == 'a' || letra == 'A' && letra == 'e' || letra == 'E' && letra == 'i' || letra == 'I'
                && letra == 'o' || letra == 'O' && letra == 'u' || letra == 'U') {
            System.out.printf("a letra  %c é uma vogal", letra);
        } else {
            System.out.printf("a letra %c não é uma vogal", letra);

        }
        scanner.close();

    }

}
