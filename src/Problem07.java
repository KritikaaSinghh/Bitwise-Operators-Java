public class Problem07 {

    // Remove last set bit
    public static void main(String[] args) {

        int n = 12;

        System.out.println("Before: " + n);

        n = n & (n - 1);

        System.out.println("After: " + n);
    }
}