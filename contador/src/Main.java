public class Main {
    public static void main(String[] args) {
        int cc = 0;
        while (cc < 10) {
            cc++;

            if(cc%2 != 0) {
                continue;
            }

            System.out.println("Cambalhota " + cc);

        }
    }
}