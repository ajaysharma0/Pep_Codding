import java.util.*;

public class Main {
    public static void kadanes(int[] arr){
        int maxsum=Integer.MIN_VALUE;
        int currentSum=0;
        for(int i=0;i<arr.length;i++){
            currentSum=currentSum+arr[i];
            if(currentSum<0){
                currentSum=0;
            }
            maxsum=Math.max(currentSum,maxsum);
        }
        System.out.print(maxsum+" ");
    }
    public static void main(String args[]) {
        Scanner sc = new Scanner(System.in);
        int size = sc.nextInt();
        int[] nums = new int[size];

        for (int i = 0; i < size; i++) {
            nums[i] = sc.nextInt();
        }
        kadanes(nums);
     
    }
}
/* 
input:-
      8   //array size
      -1 -3 4 -1 -2 1 5 -3  //array element
output:-
    7
  */
  

