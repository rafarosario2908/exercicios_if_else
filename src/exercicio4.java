import java.util.Scanner;

public class exercicio4 {
    public static void main(String[] args) {
        //Desenvolva um programa que verifica se um número é divisível por 7
        
        Scanner scanner = new Scanner(System.in);
        System.out.println("digite o dividendo");
        int dividendo = scanner.nextInt();
        int divisor = 7;
        int quociente;
        
        quociente = dividendo%divisor;

        if (quociente == 0) {
            System.out.println("é divisivel por 2");
            
        } else {
            System.out.println("nao é divisivel por 2");
        }
        scanner.close();

    }
}
