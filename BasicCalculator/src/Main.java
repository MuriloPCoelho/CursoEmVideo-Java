import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner userInput = new Scanner(System.in);
        System.out.print("1- soma\n2- subtração\n3- multiplicação\n4- divisão\nEscolha a operação e gostaria de fazer:\n");
        int userChoice =  userInput.nextInt();
        System.out.println("Digite o primeiro número: ");
        double n1 = userInput.nextDouble();
        System.out.println("Digite o segundo número: ");
        double n2 = userInput.nextDouble();

        switch (userChoice) {
            case 1:
                System.out.println(n1 + n2);
                break;
            case 2:
                System.out.println(n1 - n2);
                break;
            case 3:
                System.out.println(n1 * n2);
                break;
            case 4:
                System.out.println(n1 / n2);
                break;
            default:
                break;
        }
    }
}