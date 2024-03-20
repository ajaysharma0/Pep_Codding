import java.util.*;

public class Main {
    public static void main(String args[]) {
        span();
    }

    public static void span() {
        Scanner sc = new Scanner(System.in);
        
        // Input array 1
        int n1 = sc.nextInt();
        int a1[] = new int[n1];
        for (int i = 0; i < a1.length; i++) {
            a1[i] = sc.nextInt();
        }

        // Input array 2
        int n2 = sc.nextInt();
        int a2[] = new int[n2];
        for (int i = 0; i < a2.length; i++) {
            a2[i] = sc.nextInt();
        }

        // Resultant array
        int sum[] = new int[Math.max(n1, n2)];
        int carry = 0;

        int i = a1.length - 1;
        int j = a2.length - 1;
        int k = sum.length - 1;

        while (k >= 0) {
            int digit = carry;
            if (i >= 0) {
                digit += a1[i];
                i--;
            }
            if (j >= 0) {
                digit += a2[j];
                j--;
            }
            carry = digit / 10;
            digit %= 10;
            sum[k] = digit;
            k--;
        }

        if (carry != 0) {
            System.out.println(carry);
        }

        for (int val : sum) {
            System.out.println(val);
        }
    }
}
