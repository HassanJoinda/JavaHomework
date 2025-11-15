
package greatest.divisor;
import java.util.Scanner;
public class GreatestDivisor {
    public static void main(String[] args) {
    Scanner i=new Scanner(System.in);
        System.out.println("Enter your first number");
        int number1=i.nextInt();
        System.out.println("Enter second number");
        int number2=i.nextInt();
        int gcd=1;
        for(int  j=1;j<=number1 && j<=number2;j++){
            if(number1%j==0 && number2%j==0)  
                gcd=j;
        }  System.out.println("The greatet divisor is :"+gcd);
        
        
        
        
        
        
        
        
        
        
        
    }
    
}
