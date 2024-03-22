//Binary search in descending order sorted array 
//20 17 15 13 12 9 7 6 4
import java.util.*;
public class main{
    public static int descBinarySearch(int nums[],int key){
        int start=0;
        int end=nums.length-1;
        while(start<=end){
            int mid=start+(end-start)/2;
            if(nums[mid]==key){
                return mid;
            }
            if(key>nums[mid]){
                end=mid-1;
            }
            else{
                start=mid+1;
            }
        }
        return -1;
    }
    public static void main(String args[]){
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();//Size of an aray
        int []arr=new int[n];
        for(int i=0;i<arr.length;i++){
            arr[i]=sc.nextInt();
        }
        int key=sc.nextInt();
        System.out.print(descBinarySearch(arr,key));
        
    }
}
