package function;

import java.util.Scanner;

public class Odd {
    public static int oddSum(int n) {
        int sum=0;
        for(int i=1;i<=n;i++)
        {
             if(i%2!=0){
                sum=sum+i;
             }
        }
        return sum;
    }
    public static void main(String[] args) {
         Scanner sc =new Scanner(System.in);
         System.out.println("enter the value of n:");
        int n=sc.nextInt();
        int sum=oddSum(n);
        System.out.println("sum of all odd numbers from 1 to "+n+" is equal to :"+sum);
    }
}
