//order-agnostic search

import java.util.*;

public class Main {
    public static int binarySearch(int[] nums, int key) {
        int start = 0;
        int end = nums.length - 1;

        while (start <= end) {
            int mid = start + (end - start) / 2;

            if (nums[mid] == key) {
                return mid; // Key found, return the index
            } else if (nums[mid] < key) {
                start = mid + 1; // Update start for the right half
            } else {
                end = mid - 1; // Update end for the left half
            }
        }

        return -1; // Key not found
    }

    public static int descBinarySearch(int nums[], int key) {
        int start = 0;
        int end = nums.length - 1;
        while (start <= end) {
            int mid = start + (end - start) / 2;
            if (nums[mid] == key) {
                return mid;
            }
            if (key > nums[mid]) {
                end = mid - 1;
            } else {
                start = mid + 1;
            }
        }
        return -1;
    }

    public static void main(String args[]) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int arr[] = new int[n];
        for (int i = 0; i < arr.length; i++) {
            arr[i] = sc.nextInt();
        }
        int key = sc.nextInt();

        if (n == 1) {
            System.out.println(arr[0]); // Print the only element in the array
            return;
        }

        // Check if the array is in ascending or descending order
        if (arr[0] < arr[1]) {
            System.out.println(binarySearch(arr, key));
        } else {
            System.out.println(descBinarySearch(arr, key));
        }
    }
}
