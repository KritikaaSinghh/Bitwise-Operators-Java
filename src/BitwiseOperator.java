public class BitwiseOperator {

    public static void main(String[] args) {

        int a = 5;
        int b = 6;

        // -------------------------------
        // 1. Bitwise AND (&)
        // -------------------------------
        System.out.println("Bitwise AND: " + (a & b));

        // 5 = 0101
        // 6 = 0110
        //     ----
        //     0100 = 4


        // -------------------------------
        // 2. Bitwise OR (|)
        // -------------------------------
        System.out.println("Bitwise OR: " + (a | b));

        // 5 = 0101
        // 6 = 0110
        //     ----
        //     0111 = 7


        // -------------------------------
        // 3. Bitwise XOR (^)
        // -------------------------------
        System.out.println("Bitwise XOR: " + (a ^ b));

        // 5 = 0101
        // 6 = 0110
        //     ----
        //     0011 = 3


        // -------------------------------
        // 4. Bitwise NOT (~)
        // -------------------------------
        System.out.println("Bitwise NOT: " + (~a));

        // ~5 = -6
        // Formula: ~(n) = -(n + 1)


        // -------------------------------
        // 5. Left Shift (<<)
        // -------------------------------
        int n = 1;

        System.out.println("\nLeft Shift:");

        for (int i = 1; i <= 10; i++) {
            n = n << 1;
            System.out.println(n);
        }

        // 1 << 1 = 2
        // 2 << 1 = 4
        // 4 << 1 = 8
        // 8 << 1 = 16
        // Left shift by 1 ≈ multiply by 2


        // -------------------------------
        // 6. Right Shift (>>)
        // -------------------------------
        n = 100;

        System.out.println("\nRight Shift:");

        for (int i = 1; i <= 10; i++) {
            n = n >> 1;
            System.out.println(n);
        }

        // 100 >> 1 = 50
        // 50  >> 1 = 25
        // 25  >> 1 = 12
        // 12  >> 1 = 6
        // 6   >> 1 = 3
        // 3   >> 1 = 1
        // 1   >> 1 = 0
        //
        // Right shift by 1 ≈ divide by 2


        // -------------------------------
        // 7. Unsigned Right Shift (>>>)
        // -------------------------------
        int x = -8;

        System.out.println("\nUnsigned Right Shift:");
        System.out.println(x >>> 1);


        // -------------------------------
        // 8. Left Shift Example
        // -------------------------------
        int p = 10;

        System.out.println("\n10 << 1: " + (p << 1));
        System.out.println("10 << 2: " + (p << 2));


        // -------------------------------
        // 9. Right Shift Example
        // -------------------------------
        int q = 20;

        System.out.println("\n20 >> 1: " + (q >> 1));
        System.out.println("20 >> 2: " + (q >> 2));
    }
}