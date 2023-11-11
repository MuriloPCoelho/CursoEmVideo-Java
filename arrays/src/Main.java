import java.util.Arrays;

public class Main {
    public static void main(String[] args) {
        int[] n = {3,4,5,6,7,1,443,121,55233};

//        for (int i = 0; i < n.length; i++) {
//            System.out.println(n[i]);
//        }
        Arrays.sort(n); //sort
        int value = 5;
        int pos = Arrays.binarySearch(n, value);
        for (int i : n) { //for each
            System.out.println(i);
        }
        System.out.println("Found " + value + " at position " + pos);
    }
}