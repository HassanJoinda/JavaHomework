
package change.dollar;

import java.util.Scanner;

public class ChangeDollar {
    public static void main(String[] args) {
   Scanner i=new Scanner(System.in);
        System.out.println("enter your money");
        double money=i.nextDouble();
        int cent=(int)(money*100);
        int dollar=cent/100;
        cent=cent%100;
        int quarter=cent/25;
        cent=cent%25;
        int dimes=cent/10;
        cent=cent%10;;
        cent=cent%100;

        int nickle=cent/5;
        cent=cent%5;
        int pennise=cent;
        System.out.println("your money"+money+" consist of");
        System.out.println(""+dollar+"dollar");
        System.out.println(""+quarter+"quarter");
        System.out.println(""+dimes+"dimes");
        System.out.println(""+nickle+"nickle");
        System.out.println(""+pennise+"pennise");
    }
    
}
