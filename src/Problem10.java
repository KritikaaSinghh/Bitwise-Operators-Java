public class Problem10 {
    // Count number of set bits
    public static void main(String[] args) {

        int n = 13;
        int count = 0;

        while (n != 0) {

            n = n & (n - 1);
            count++;
        }

        System.out.println("Number of set bits: " + count);
    }
}
