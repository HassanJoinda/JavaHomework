package homework;
import java.util.Random;
import java.util.Scanner;
public class Homework {
    public static void main(String[] args) {
 // practice 1;
//Scanner i=new Scanner(System.in);
//        System.out.println("enter your number");
//        int number=i.nextInt();
//        int n1,n2,n3;
//        n1=number%10;
//        number=number/10;
//        n2=number%10;
//        n3=number/10;
//        System.out.println(""+n1+n2+n3);
    //practice 2:
//    int lottery=(int)(Math.random()*100);
//Scanner input=new Scanner(System.in);
//        System.out.println("enter your guess number");
//        int guess=input.nextInt();
//        int L1=lottery/10;
//        int L2=lottery%10;
//        int G1=guess/10;
//        int G2=guess%10;
//        System.out.println("lottery="+lottery);
//        if(L1==G1 && L2==G2)   System.out.println("you win 10000");
//        if(L1==G2 && L2==G1)   System.out.println("you win 3000");
//        if(L1==G1 || L1==G2 || L2==G1 || L2==G2)  System.out.println("you win 1000");
//        else  System.out.println("sorry");
//practice 3:
//  int month=(int)(Math.random()*12)+1;
//  switch(month){
//      case 1:
//          System.out.println("January");
//          break;
//      case 2:
//         System.out.println("February");
//         break;}
  //practoce 3:
   Scanner i=new Scanner(System.in);
        System.out.println("enter your price");
        int a=i.nextInt();
        int b=i.nextInt();
        int c=i.nextInt();
if(a+b>c && a+c>b && b+c>a)  System.out.println("p="+(a+b+c));
else   System.out.println("sorry");
  /*
   int num1=(int)(Math.random()*10);
   int num2=(int)(Math.random()*10);
        System.out.println("number 1="+num1);
        System.out.println("number 2="+num2);
        int sum=num1+num2;
  Scanner in=new Scanner(System.in);
        System.out.println("enter your number");
        int number=in.nextInt();
        if(number==sum)  System.out.println("your ansawre is correct");
        else  System.out.println("your ansawre is wrong");*/
  //practice 5:
    int ra=(int)(Math.random()*101);
     Scanner in=new Scanner(System.in);
        System.out.println("enter your guess number");
        int guess1=in.nextInt();
        while(guess1!=ra){
            System.out.println("enter your guess number");
            guess1=i.nextInt(); 
            if(guess1==ra)  System.out.println("Yes your guess is correct");
            else if(guess1>ra)  System.out.println("yor answre is very high");
            else   System.out.println("your answre is very low");}
  //pravtice 6:
//    int ra=(int)(Math.random()*101);
//     Scanner in=new Scanner(System.in);
//        System.out.println("enter your guess number");
//        int guess1=in.nextInt();
//        while(guess1!=ra){
//            System.out.println("enter your guess number");
//            guess1=i.nextInt(); 
//            if(guess1==ra)  System.out.println("Yes your guess is correct");
//            else if(guess1>ra)  System.out.println("yor answre is very high");
//            else   Syst
  //practice 7:
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
       int answre=i.nextInt();
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
      //practice 8:
      Scanner i=new Scanner(System.in);
        System.out.println("enter a decimal number");
        int num=i.nextInt();
      if(num>=0 && num<=15){
          String hex=Integer.toHexString(num).toUpperCase();
          System.out.println("the hexadecimal is :"+hex);
      }

//System.out.println("a"    +"   "    +"b"  +"    "   +"pow(a,b)");
for(int a=1;a<=6;a++){
    int b=a+1;
    System.out.println(a+    "   "+      b         +"   "+      Math.pow(a, b));
       
   
       
  
  
  
  
  
  
  
  
  




    }
}