import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.println("Descubra se o número é par ou impar");
        System.out.println("Digite um número: ");
        int userNumber = input.nextInt();

        if (userNumber % 2 == 0) {
            System.out.println("O número é par");
        } else {
            System.out.println("O número é impar");
        }
    }
}