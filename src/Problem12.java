public class Problem12 {
    // Find two unique numbers (others appear twice)
    public static void main(String[] args) {

        int[] arr = {2, 4, 2, 6, 4, 8};

        int xor = 0;

        for (int i = 0; i < arr.length; i++) {
            xor = xor ^ arr[i];
        }

        // Find rightmost set bit
        int setBit = xor & -xor;

        int num1 = 0;
        int num2 = 0;

        for (int i = 0; i < arr.length; i++) {

            if ((arr[i] & setBit) == 0) {
                num1 = num1 ^ arr[i];
            } else {
                num2 = num2 ^ arr[i];
            }
        }

        System.out.println("First unique number: " + num1);
        System.out.println("Second unique number: " + num2);
    }
}
