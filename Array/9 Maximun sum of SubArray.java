import java.util.*;

public class main {
public static int max_Sum_Subarrays(int arr[]) {
    int n = arr.length;
    
    int currentSum=0;
    int maxSum=Integer.MIN_VALUE;
    
    // Outer loop for starting index
    for (int start = 0; start < n; start++) {
        // Middle loop for ending index
        for (int end = start; end < n; end++) {
            currentSum=0;
            // Inner loop to print subarray elements
            for (int k = start; k <= end; k++) {
                currentSum=currentSum+arr[k];
            }
            if(currentSum>maxSum){
                maxSum=currentSum;
            }
        }
    }
    return maxSum;
}

    public static void main(String args[]) {
        Scanner sc = new Scanner(System.in);
        int size=sc.nextInt();
        int arr[]=new int[size];
        for(int i=0;i<arr.length;i++){
            arr[i]=sc.nextInt();
        }
        int res=max_Sum_Subarrays(arr);
        System.out.print(res);
    }
}
