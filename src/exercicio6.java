import java.util.Scanner;

public class exercicio6 {

    /*
     * Crie um programa que pede ao usuário para digitar sua nota em uma disciplina
     * e
     * imprime se ele foi aprovado (nota maior ou igual a 6) ou reprovado
     */
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        System.out.println("digite a nota ");
        double nota = scanner.nextDouble();

        if (nota >= 6.0) {
            System.out.println("aluno aprovado");

        } else {

            System.out.println("aluno reprovado");
        }

        scanner.close();
    }

}
