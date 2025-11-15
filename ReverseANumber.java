
package reverse.a.number;
import java.util.Scanner;
public class ReverseANumber {
    public static void main(String[] args) {
      Scanner input=new Scanner(System.in);
        System.out.println("enter your number");
        int number=input.nextInt();
        int n1,n2,n3;
         n1=number%10;
        number=number/10;
        n2=number%10;
        n3=number/10;
        System.out.println("the inverse number is:"+n1+n2+n3);
    }
    
}
