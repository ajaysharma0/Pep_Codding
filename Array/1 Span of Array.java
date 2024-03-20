/*
In the context of programming, the "span" of an array typically refers to the difference between the maximum and minimum elements in the array. 
Here's how you can calculate the span of an array in Java
*/

import java.util.*;

public class Main {
    public static int span(int arr[]) {
        int max = arr[0];
        int min = arr[0];
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] > max) {
                max = arr[i];
            }
            if (arr[i] < min) {  // Use '<' instead of '>'
                min = arr[i];    // Corrected the assignment statement
            }
        }
        return max - min;
    }

    public static void main(String args[]) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt(); // size of an array
        int[] arr = new int[n];
        for (int i = 0; i < arr.length; i++) {
            arr[i] = sc.nextInt();
        }
        int result = span(arr); // Call the span method and store the result
        System.out.println("Span of the array: " + result); // Print the result
    }
}
