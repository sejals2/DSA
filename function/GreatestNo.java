package function;
import java.util.*;

public class GreatestNo{
   
    public static int compareNo(int a, int b) {
       if(a>b){
        return a;
       }
       else{
        return b;
       }

    }

    public static void main(String[] args) {
        Scanner sc =new Scanner(System.in);
        System.out.println("Enter the 1st number:");
        int a=sc.nextInt();
        System.out.println("Enter the 2nd number:");
        int b=sc.nextInt();
    

        int compare=compareNo(a, b);
        System.out.println("greatest number is:"+compare);
    }
    
}

