public class Main {
    public static void main(String[] args) {
        for (int c1 = 1; c1 <= 2; c1++){
            for (int c2 = 1; c2 <= 2; c2++){
                for (int c3 = 1; c3 <= 2; c3++){
                    System.out.println("c3 = " + c3);
                }
                System.out.println("c2 = " + c2);
            }
            System.out.println("c1 = " + c1);
        }
    }
}