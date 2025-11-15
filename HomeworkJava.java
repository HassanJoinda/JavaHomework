
package homework.java;
import java.util.Scanner;
public class HomeworkJava {
    public static void main(String[] args) {
 //compute area of circle
      byte radius=3;
      double area=radius*radius*3.1459;
       System.out.println("area="+area);
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
    //compute perimetor of circle
    byte radiu=5;
    double perimetor=2*radius*3.1459;
        System.out.println("perimetor="+perimetor);
     //compute area of rectangle
     byte width=3;
     byte height=4;
     int arearectangle=width*height;
        System.out.println(arearectangle); 
       //            System.out.println(number);
        System.out.println("     J        A      V     V       A ");
        System.out.println("     J       A A      V   V       A A ");
        System.out.println("J    J      AAAAA      V V       AAAAA ");
        System.out.println(" J J       A     A      V       A     A ");
        //Disply time:
         Scanner input = new Scanner(System.in);   
               System.out.print("Enter a number for seconds: ");
       int seconds = input.nextInt();
      int minutes = seconds / 60; 
       int remainingSeconds = seconds % 60; 
      System.out.println(seconds + " seconds is " + minutes +
        " minutes and " + remainingSeconds + " seconds");
        
        
        
        
        
    }
    
}
