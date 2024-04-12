import java.util.Scanner;

public class exercicio2 {
    public static void main(String[] args) {
        
        Scanner scanner = new Scanner(System.in);

        System.out.println("digite sua idade");
        int idade = scanner.nextInt();
    
      

        if (idade>= 18) {
            System.out.println("voçê de maior");
           

        } else {
            System.out.println("voçe é de menor");
            

        }

        scanner.close();
    }
    
}
