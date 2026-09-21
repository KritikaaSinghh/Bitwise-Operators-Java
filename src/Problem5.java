public class Problem5 {

    // Count number of set bits (1s)
    public static void main(String[] args) {

        int n = 13;
        int count = 0;

        while (n > 0) {

            if ((n & 1) == 1) {
                count++;
            }

            n = n >> 1;
        }

        System.out.println("Number of set bits: " + count);
    }
}