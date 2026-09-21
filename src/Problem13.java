public class Problem13 {
    // Check if number is power of 4
    public static void main(String[] args) {

        int n = 16;

        if (n > 0 && (n & (n - 1)) == 0 && (n & 0x55555555) != 0) {
            System.out.println("Power of 4");
        } else {
            System.out.println("Not a Power of 4");
        }
    }
}
