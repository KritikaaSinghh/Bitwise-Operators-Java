public class Problem6 {

    // Check if number is power of 2
    public static void main(String[] args) {

        int n = 16;

        if (n > 0 && (n & (n - 1)) == 0) {
            System.out.println("Power of 2");
        } else {
            System.out.println("Not a Power of 2");
        }
    }
}