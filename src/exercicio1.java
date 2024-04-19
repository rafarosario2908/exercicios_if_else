import java.util.Scanner;

public class exercicio1 {

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        System.out.println("digite o ano de nascimento");
        int ano = scanner.nextInt();
        double resultado = (2024 - ano);

        if (resultado >= 18) {
            System.out.println("voçê de maior");
            System.out.println("sua idade é :" + resultado);

        } else {
            System.out.println("voçe é de menor");
            System.out.println("sua idade é :" + resultado);

        }

        scanner.close();

    }

}
