/*
Linear search is a straightforward search algorithm used to find a target value within a list or array. It works by sequentially checking each element in the list until the target value is found or until all elements have been checked.

Here's a step-by-step explanation of the linear search algorithm:

1. **Initialization**: Start with the first element in the list/array.
2. **Comparison**: Compare the current element with the target value.
   - If the current element matches the target value, the search is successful, and the index of the element is returned.
   - If the current element does not match the target value, move to the next element in the list/array.
3. **Repeat**: Repeat steps 2 until either the target value is found or all elements have been checked.
4. **Termination**: If the target value is found, return the index of the element. If the entire list/array is checked and the target value is not found, return a signal (e.g., -1) to indicate that the target value is not present in the list/array.

Key points about linear search:
- Linear search can be performed on both sorted and unsorted lists/arrays.
- It is a simple and easy-to-understand algorithm but may not be efficient for large lists/arrays compared to other search algorithms like binary search for sorted arrays.
- Linear search has a time complexity of O(n), where n is the number of elements in the list/array. This means the worst-case scenario involves checking every element in the list/array.

Here's an example of a Java code implementation of linear search:
*/

//```java
public class LinearSearch {
    public static int linearSearch(int[] arr, int key) {
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] == key) {
                return i; // Key found, return the index
            }
        }
        return -1; // Key not found
    }

    public static void main(String[] args) {
        int[] numbers = { 3, 6, 2, 9, 1, 5 };
        int target = 9;
        int index = linearSearch(numbers, target);

        if (index != -1) {
            System.out.println("Element found at index: " + index);
        } else {
            System.out.println("Element not found");
        }
    }
}
```

/*In this example:
- We define a `linearSearch` method that takes an array and a target key as parameters and performs linear search on the array.
- Inside the `main` method, we create an array of numbers and search for the target value using the `linearSearch` method.
- If the target value is found, it prints the index of the element; otherwise, it indicates that the element is not found.
  */
