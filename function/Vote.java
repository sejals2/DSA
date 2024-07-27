package function;
import java.util.*;

public class Vote{
   
    public static String ageEligible(int n) {
       if(n>18){
        return "Eligible";
       }
       else{
        return "Not Eligible";
       }

    }

    public static void main(String[] args) {
        Scanner sc =new Scanner(System.in);
        System.out.println("Enter the age:");
        int n=sc.nextInt();
       

        
        System.out.println("the person is:"+ageEligible(n));
    }
    
}


