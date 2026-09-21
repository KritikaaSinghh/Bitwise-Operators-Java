public class Probelm09 {

    // Get last set bit
    public static void main(String[] args) {

        int n = 12;

        int lastSetBit = n & -n;

        System.out.println("Last set bit: " + lastSetBit);
    }
}

