
package gussing.number;
import java.util.Scanner;
public class GussingNumber {
    public static void main(String[] args) {
       int randomnumber=(int)(Math.random()*101);
       Scanner i=new Scanner(System.in);
        System.out.println("Enter your answer");
       int answer=i.nextInt();
       while(answer!=randomnumber){
           if(answer==randomnumber) System.out.println("Yes your answer is correct");
          else if(answer>randomnumber)  System.out.println("Your answer is to high");
          else if(answer<randomnumber)  System.out.println("Your answer is to low");
           answer=i.nextInt();
       }
        
        
    }
    
}
