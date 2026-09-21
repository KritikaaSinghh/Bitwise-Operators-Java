public class Problem11 {

    // Find missing number in array using XOR
    public static void main(String[] args) {

        int[] arr = {1, 2, 4, 5};

        int n = arr.length + 1;
        int xor = 0;

        // XOR all numbers from 1 to n
        for (int i = 1; i <= n; i++) {
            xor = xor ^ i;
        }

        // XOR all array elements
        for (int i = 0; i < arr.length; i++) {
            xor = xor ^ arr[i];
        }

        System.out.println("Missing number: " + xor);
    }
}
