/*
Input :  arr[] = {10, 20, 20, 10, 10, 20, 5, 20}
Output : 10 3
         20 4
         5  1

Input : arr[] = {10, 20, 20}
Output : 10 1
         20 2 
*/
public class Main{
    public static void main(String args[]){
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        int []arr=new int[n];
        for(int i=0;i<arr.length;i++){
            arr[i]=sc.nextInt();
        }
        int freq=1;
        int i=1;
        while(i<arr.length){
            while(i<arr.length && arr[i]==arr[i-1]){
                freq++;
                i++;
            }
            System.out.println(arr[i-1]+" "+freq);
            freq=1;
            i++;
        }
        if(arr.length==1 || arr[i-1]!=arr[i-2]){
            System.out.println(arr[i-1]+" "+freq);
        }
    }
}
