import java.util.*;

public class Main {
    public static int[] suffixSum(int[] arr) {
        int n = arr.length;
        int[] suffix = new int[n];
        suffix[n - 1] = arr[n - 1];

        for (int i = n - 2; i >= 0; i--) {
            suffix[i] = suffix[i + 1] + arr[i];
        }

        return suffix;
    }

    public static void main(String args[]) {
        Scanner sc = new Scanner(System.in);
        int size = sc.nextInt();
        int[] arr = new int[size];

        for (int i = 0; i < size; i++) {
            arr[i] = sc.nextInt();
        }
        int[] suffix = suffixSum(arr);

        for (int value : suffix) {
            System.out.print(value + " ");
        }
    }
}
