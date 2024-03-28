import java.util.*;

public class Main {
    public static void ReverseArray(int arr[],int size){
       for(int i = size-1; i >= 0; i--){
           System.out.print(arr[i]+" ");
       }
    }
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int size=sc.nextInt();
        int arr[]=new int[size];
        for(int i=0;i<size;i++){
            arr[i]=sc.nextInt();
        }
       ReverseArray(arr,size);
        
    }
}
/*
Your Java code defines a class `Main` with a `ReverseArray` method to reverse an array and a `main` method to take input from the user and call the `ReverseArray` method. Here's a breakdown of your code:

- The `ReverseArray` method takes an array `arr` and its size `size` as parameters.
- It iterates through the array in reverse order and prints each element separated by a space.
- In the `main` method, you create a Scanner object to read input from the user.
- You read an integer `size` from the user to determine the size of the array.
- You create an array `arr` of integers with the specified size.
- You use a loop to read integers from the user and store them in the array.
- Finally, you call the `ReverseArray` method with the array and its size as arguments.
*/
