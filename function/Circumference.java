package function;
import java.util.Scanner;

public class Circumference {

    public static double radiusCircum(double n) {
        return 3.14*n*n;
    }
    public static void main(String[] args) {
         Scanner sc =new Scanner(System.in);
         System.out.println("enter the value of n:");
         double n=sc.nextInt();
        
        System.out.println("circumference of circle is: :"+radiusCircum(n));
    }
}


