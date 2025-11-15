
package addition;
import java.util.Scanner;
public class Addition {
    public static void main(String[] args) {
            final int numberQ=5;
   int correctcount=0;
   int countq=0;
   long starttime=System.currentTimeMillis();
   String output="";
   Scanner input=new Scanner(System.in);
   while(countq<numberQ){
       int ra1=(int)(Math.random()*10);
       int ra2=(int)(Math.random()*10);
       if(ra1<ra2){
           int temp=ra1;
           ra1=ra2;
           ra2=temp;
       }
       System.out.println("what is"+ra1+"-"+ra2+"?");   
       int answre=input.nextInt();
     if(ra1-ra2==answre)  {
         System.out.println("your answre is correct");
         correctcount++;
     }
       
     else  
         System.out.println("your answre is wrong.\n"+ra1+"-"+ra2+"should be"+(ra1-ra2));
         countq++;
    output+="\n"+ra1+"-"+ra2+"="+answre+((ra1-ra2==answre)?"correct":"wrong");}
long endtime=System.currentTimeMillis();
long testtime=endtime-starttime;
        System.out.println("correct count is"+correctcount+"\ntesttime is"+testtime/1000+"second\n"+output  );   
    }
}
