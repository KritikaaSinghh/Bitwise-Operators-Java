public class Problem14 {
    // Convert decimal to binary manually
    public static void main(String[] args) {

        int n = 13;
        int binary = 0;
        int place = 1;

        while (n > 0) {

            int remainder = n % 2;

            binary = binary + remainder * place;

            n = n / 2;
            place = place * 10;
        }

        System.out.println("Binary: " + binary);
    }
}
