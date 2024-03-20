/*
This Java program calculates the value of \( nPr \), which represents the number of permutations of \( n \) items taken \( r \) at a time. 
The problem is commonly known as the "Permutations" problem, where you calculate the number of ways to arrange \( r \) items from a set of \( n \) items without repetition.

In this program:

- The user inputs two integers, \( n \) and \( r \), using the `Scanner` class.
- The program calculates the factorial of \( n \) (denoted as `nfact`) and the factorial of \( n-r \) (denoted as `nmrfact`).
- It then computes \( nPr \) by dividing `nfact` by `nmrfact` and prints the result.

So, the problem is related to permutations and combinations, specifically calculating permutations.
*/


//code is  simple only in main function
import java.util.*;
public class Main {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        int r=sc.nextInt();
        int nfact=1;
        for(int i=1;i<=n;i++){
            nfact=nfact*i;
        }
        int nmrfact=1;
        for(int i=1;i<=n-r;i++){
            nmrfact *= i;
        }
        int nPr=nfact/nmrfact;
        System.out.print(n+"P"+r+"="+nPr);
    }
}

//code in different function except main----------------------------------
import java.util.*;

public class Main {
    
    //Fuction of n!
    static int nfactorial(int n){
        int nfact=1;
        for(int i=1;i<=n;i++){
            nfact=nfact*i;
        }
        return nfact;
    }
    
    //Function of (n-r)!
    static int nmrfactorial(int n,int r){
        int nmrfact=1;
        for(int i=1;i<=n-r;i++){
            nmrfact *= i;
        }
        return nmrfact;
    }
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        int r=sc.nextInt();
        int result1=nfactorial(n); //Result of n! 
        int result2=nmrfactorial(n,r);//Result of (n-r)!
        int nPr=result1/result2;
        System.out.print(n+"P"+r+"="+nPr);
    }
}
