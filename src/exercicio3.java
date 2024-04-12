import java.util.Scanner;

public class exercicio3 {
    public static void main(String[] args) {

        /*Faça um programa que solicita ao usuário a temperatura em graus Celsius e converte
        para Fahrenheit, seguindo a fórmula: F = (C * 9/5) + 32. Certifique-se de que o
        programa imprime uma mensagem de alerta caso a temperatura em Celsius seja menor
        que -273.15 (zero absoluto).*/

        Scanner scanner = new Scanner(System.in);
        System.out.println("Digite a temperatua atual em celsius: ");
        double celsius = scanner.nextDouble();
        final double zero = -273.15;
        // se (celsius <= zero)

        if (celsius <= zero) {
            System.out.println("a temperatura em Celsius é menor que zero absoluto.");
            
        }
        
      //  double fahrenheit = ((celsius * 9)/5) + 32;

      

        scanner.close();



    }
    
}
