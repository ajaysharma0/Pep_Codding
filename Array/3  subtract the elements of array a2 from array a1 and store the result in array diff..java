import java.util.*;

public class Main {
    public static void main(String args[]) {
        Scanner sc = new Scanner(System.in);

        // Input array 1
        int n1 = sc.nextInt();
        int[] a1 = new int[n1];
        for (int i = 0; i < a1.length; i++) {
            a1[i] = sc.nextInt();
        }

        // Input array 2
        int n2 = sc.nextInt();
        int[] a2 = new int[n2];
        for (int i = 0; i < a2.length; i++) {
            a2[i] = sc.nextInt();
        }

        // Result array
        int[] diff = new int[Math.max(n1, n2)];
        int carry = 0;

        // Pointer variables
        int i = n1 - 1;
        int j = n2 - 1;
        int k = diff.length - 1;

        // Subtract arrays a1 and a2
        while (k >= 0) {
            int digit = carry;
            if (i >= 0) {
                digit += a1[i];
                i--;
            }
            if (j >= 0) {
                digit -= a2[j];
                j--;
            }
            if (digit < 0) {
                digit += 10;
                carry = -1;
            } else {
                carry = 0;
            }
            diff[k] = digit;
            k--;
        }

        // Print the result array
        for (int val : diff) {
            System.out.print(val + " ");
        }
    }
}
