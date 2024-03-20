/*
The logic for counting the digit frequency is moved to a separate method named countDigitFrequency.
The main method now calls countDigitFrequency and prints the returned value.
*/
import java.util.Scanner;

public class Main {
    public static void main(String args[]){
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        int key=sc.nextInt();
        int frequency = countDigitFrequency(n, key);
        System.out.print(frequency);
    } 

    public static int countDigitFrequency(int n, int key) {
        int count=0;
        while(n>0){
            int ldigit=n%10;
            if(ldigit==key){
                count++;
            }
            n=n/10;
        }
        return count;
    }
}
