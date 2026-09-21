public class Problem15 {

    // Implement fast exponentiation using bitwise
    public static void main(String[] args) {

        int base = 2;
        int power = 10;

        int result = 1;

        while (power > 0) {

            // Check if power is odd
            if ((power & 1) == 1) {
                result = result * base;
            }

            base = base * base;
            power = power >> 1;
        }

        System.out.println("Answer: " + result);
    }
}
