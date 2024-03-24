//Count occurrences of an element in a sorted array.

//count number of element in sorted array
import java.util.*;

public class main{
    public static int FirstOccurence(int []nums,int key){
        int start=0;
        int end=nums.length-1;
        int res=-1;
        while(start<=end){
            int mid=start+(end-start)/2;
            if(nums[mid]==key){
                res=mid;
                end=mid-1;
            }else if(nums[mid]>key){
                end=mid-1;
            }else{
                start=mid+1;
            }
        }
        return res;
        }
    
        public static int LastOccurence(int []nums,int key){
        int start=0;
        int end=nums.length-1;
        int res=-1;
        while(start<=end){
            int mid=start+(end-start)/2;
            if(nums[mid]==key){
                res=mid;
                start=mid+1;
            }
            else if(nums[mid]>key){
                end=mid-1;
            }else{
                start=mid+1;
            }
        }
        return res;
        }
    
    public static void main(String[] args){
        Scanner sc=new Scanner(System.in);
        int size=sc.nextInt();
        int []nums=new int[size];
        for(int i=0;i<nums.length;i++){
            nums[i]=sc.nextInt();
        }
        int key=sc.nextInt();
        
        int first=FirstOccurence(nums,key);
        int last=LastOccurence(nums,key);
        
        System.out.print("Count of element in sorted array="+((last-first)+1));
        
    }
}
