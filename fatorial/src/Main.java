import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Type a number:");
        int num = input.nextInt();
        int fat = 1;
        String fatString = Integer.toString(num);

        for (int i=num; i > 0; i--) {
            fat *= i;
            //System.out.println(i);
            if(i != num){
                fatString += " x " + i;
                System.out.println(fatString + " = " + fat);
            }
        }

        //System.out.println(fat);
    }
}