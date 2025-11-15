
package game.lottery;
import java.util.Scanner;
public class GameLottery {
    public static void main(String[] args) {
        int lottery=(int)(Math.random()*100);
Scanner i=new Scanner(System.in);
        System.out.println("enter your guess number");
        int guess=i.nextInt();
        int L1=lottery/10;
        int L2=lottery%10;
        int G1=guess/10;
        int G2=guess%10;
         System.out.println("show your lottery="+lottery);              
      if(lottery==guess)  System.out.println("you win="+10000);
      else if(L1==G2 && L2==G1)  System.out.println("you win="+3000);
      else if(L1==G1 || L1==G2 || L2==G1 || L2==G2)   System.out.println("you win="+1000);
      else  System.out.println("sorry");
    }
    
}
