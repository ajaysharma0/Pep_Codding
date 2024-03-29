import java.util.*;

public class main {
public static void printSubarrays(int arr[]) {
    int n = arr.length;

    // Outer loop for starting index
    for (int start = 0; start < n; start++) {
        // Middle loop for ending index
        for (int end = start; end < n; end++) {
            // Inner loop to print subarray elements
            for (int i = start; i <= end; i++) {
                System.out.print(arr[i] + " ");
            }
            System.out.println(); // Print new line after each subarray
        }
    }
}

    public static void main(String args[]) {
        Scanner sc = new Scanner(System.in);
        int size=sc.nextInt();
        int arr[]=new int[size];
        for(int i=0;i<arr.length;i++){
            arr[i]=sc.nextInt();
        }
        printSubarrays(arr);
    }
}
