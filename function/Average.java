package function;

import java.util.Scanner;

public class Average {
    public static int calculateAvg(int a, int b, int c) {
       int avg=(a+b+c)/3;
       return avg;
    }

    public static void main(String[] args) {
        Scanner sc =new Scanner(System.in);
        int a=sc.nextInt();
        int b=sc.nextInt();
        int c=sc.nextInt();

        int avg=calculateAvg(a,b,c);
        System.out.println("avg of 3 numbers:"+avg);
    }
    
}

