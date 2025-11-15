
package leapyear.and.convert;
import java.util.Scanner;
public class LeapyearAndConvert {
    public static void main(String[] args) {
         // converting temperature
       byte fahrenheit=64;
      double celsius=(5.0/9)*(fahrenheit-32);
        System.out.println("celsius="+celsius);
        //cheak leap year
        Scanner i=new Scanner(System.in);
        System.out.println("enter your year");
        int year=i.nextInt();
        if(year%4==0 && year%100!=0 ||year%400==0) {
            System.out.println("this year is leap year");
        } else System.out.println("this year not leap");
    }
    
}
