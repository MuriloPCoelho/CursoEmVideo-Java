import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        int n, t = 0;
        String resp;
        Scanner input = new Scanner(System.in);
        System.out.println("--- Number Adder ---");
        do {
            System.out.println("Type a number:");
            n = input.nextInt();
            t += n;
            System.out.println("Do you want to continue? [Y/N]");
            resp = input.next();
        } while (resp.equals("Y") || resp.equals("y"));

        System.out.println("Total = " + t);
    }
}