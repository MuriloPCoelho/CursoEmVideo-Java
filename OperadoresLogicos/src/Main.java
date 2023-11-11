import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Qual sua idade?");
        int userAge = Integer.parseInt(input.nextLine());

        if(userAge >= 18 && userAge <= 70) {
            System.out.println("Voto Obrigatório");
        } else if ((userAge < 18 && userAge >= 16) || (userAge > 70)) {
            System.out.println("Voto Opcional");
        } else {
            System.out.println("Não pode votar");
        }
    }
}