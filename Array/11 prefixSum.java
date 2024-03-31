import java.util.*;

public class Main {
    public static int[] prefixSum(int[] arr) {
        int n = arr.length;
        int[] prefix = new int[n];
        prefix[0] = arr[0];
        
        for (int i = 1; i < n; i++) {
            prefix[i]=prefix[i-1]+arr[i];
        }
        
        return prefix;
    }

    public static void main(String args[]) {
        Scanner sc = new Scanner(System.in);
        int size = sc.nextInt();
        int[] arr = new int[size];
        
        for (int i = 0; i < size; i++) {
            arr[i] = sc.nextInt();
        }
        
        int[] prefixSumArray = prefixSum(arr); 
        
        for (int value : prefixSumArray) {
            System.out.print(value + " ");
        }
    }
}
