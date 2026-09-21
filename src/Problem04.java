public class Problem04 {

    // Find unique element (All others appear twice)
    public static void main(String[] args) {

        int[] arr = {2, 3, 4, 2, 3};

        int unique = 0;

        for (int i = 0; i < arr.length; i++) {
            unique = unique ^ arr[i];
        }

        System.out.println("Unique element: " + unique);
    }
}