import java.util.*;

public class Main {
    public static void main(String args[]){
        Scanner sc=new Scanner(System.in);
    int n =sc.nextInt();
    int []nums=new int[n];
    for(int i=0;i<nums.length;i++){
        nums[i]=sc.nextInt();
    }
    int max=Integer.MIN_VALUE;
    for(int i=0;i<nums.length;i++){
        if(nums[i]>max){
            max=nums[i];
        }
      }
        System.out.print(max);
   }
}

//Explain
/*
Your Java code reads an integer `n` from the user, then reads `n` integers into an array called `nums`. After that, it finds the maximum value in the `nums` array using a loop and prints the maximum value.

Here's a breakdown of what each part of your code does:

1. `Scanner sc=new Scanner(System.in);`: This line creates a `Scanner` object named `sc` to read input from the user.

2. `int n =sc.nextInt();`: This line reads an integer from the user, which represents the size of the array `nums`.

3. `int []nums=new int[n];`: This line declares an integer array named `nums` with a size of `n`.

4. `for(int i=0;i<nums.length;i++)`: This loop iterates over the `nums` array, reading integers from the user and storing them in the array.

5. `int max=Integer.MIN_VALUE;`: This line initializes the variable `max` with the minimum possible integer value. This value is used as an initial placeholder for comparison.

6. `for(int i=0;i<nums.length;i++)`: This loop iterates over the `nums` array again to find the maximum value in the array.

7. `if(nums[i]>max)`: This condition checks if the current element `nums[i]` is greater than the current maximum value `max`.

8. `max=nums[i];`: If the current element is greater than the current maximum, `max` is updated to the value of the current element.

9. `System.out.print(max);`: Finally, the maximum value found in the `nums` array is printed.

Overall, your code efficiently finds and prints the maximum value among the integers entered by the user.
  */
