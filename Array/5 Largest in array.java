import java.util.*;
public class Main {
    public static int largest(int arr[],int size){
        int max=Integer.MIN_VALUE;
        for(int i=0;i<size;i++){
            if(arr[i]>max){
                max=arr[i];
            }
        }
        return max;
    }
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int size=sc.nextInt();
        int arr[]=new int[size];
        for(int i=0;i<size;i++){
            arr[i]=sc.nextInt();
        }
        int res = largest(arr,size);
        System.out.print("The maximum in array is ="+ res);
    }
}
/*
This Java program finds the largest element in an array. Here's a step-by-step explanation of how it works:

1. Importing the necessary package:
   
   import java.util.*;
   

2. Defining the `Main` class:
  
   public class Main {
   

3. Creating a method `largest` to find the largest element in the array:
   
   public static int largest(int arr[], int size) {
       int max = Integer.MIN_VALUE;
       for (int i = 0; i < size; i++) {
           if (arr[i] > max) {
               max = arr[i];
           }
       }
       return max;
   }
  
   - The `largest` method takes an integer array `arr` and its size as parameters.
   - It initializes a variable `max` to the smallest possible integer value (`Integer.MIN_VALUE`), ensuring any element in the array will be greater than `max`.
   - The method then iterates through the array elements using a for loop.
   - If an element is greater than the current `max`, it updates `max` to the value of that element.
   - Finally, it returns the maximum value found in the array.

4. Implementing the `main` method for user input and output:
   
   public static void main(String[] args) {
       Scanner sc = new Scanner(System.in);
       int size = sc.nextInt();
       int arr[] = new int[size];
       for (int i = 0; i < size; i++) {
           arr[i] = sc.nextInt();
       }
       int res = largest(arr, size);
       System.out.print("The maximum in array is = " + res);
   }
  
   - The `main` method starts by creating a `Scanner` object (`sc`) to read input from the user.
   - It prompts the user to enter the size of the array (`size`) and then initializes an integer array `arr` of that size.
   - Using a for loop, it reads integers from the user and stores them in the array `arr`.
   - It then calls the `largest` method to find the maximum element in the array and stores the result in `res`.
   - Finally, it prints the maximum value found in the array.

This program demonstrates how to find the largest element in an array using a custom method and user input.
*/
