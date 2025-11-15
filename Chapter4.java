
package chapter.pkg4;
import java.util.Scanner;
public class Chapter4 {
    public static void main(String[] args) {
          //the vowel:
          Scanner i=new Scanner(System.in);
        System.out.println("enter your letter");
       String s=i.next().toLowerCase();
       if(s.length()==1){
           char ch=Character.toLowerCase(s.charAt(0));
           if("aieuo".indexOf(ch)>=0)  
               System.out.println( s+" is a vowei");
           else   System.out.println(s+"is a constant ");}
           else{     System.out.println(s+" is invalid");}
        
        //decimal to hexa:
        Scanner input=new Scanner(System.in);
        System.out.println("enter a decimal number");
        int decimal=input.nextInt();
        if(decimal>=0 && decimal<=15)  {
            String hex=Integer.toHexString(decimal).toUpperCase();  
        System.out.println("the hex is :"+hex);}
       //convert letter grade to number
    //   Scanner input=new Scanner(System.in);
        System.out.println("enter your letter");
        String letter=input.nextLine();
        if(letter.equals("A"))    System.out.println("the value for"+letter+"is"+4);   
      else   if(letter.equals("B"))  System.out.println("the value for"+letter+"is"+3);
      else if(letter.equals("C"))  System.out.println("the value for"+letter+"is"+2);
    else if(letter.equals("D"))  System.out.println("the value for"+letter+"is"+1);
        //Random character:
        char letterRandom=(char)('A'+(int)(Math.random()*26));
        System.out.println("the letter Random is:"+letterRandom);
        //process a string:
       // Scanner i=new Scanner(System.in);
        System.out.println("enter your word");
        String word=i.nextLine();
        System.out.println("the lenth word is :"+word.length()+","+"and the first character is:"+word.charAt(0));
       //check substring:
      // Scanner i=new Scanner(System.in);
        System.out.println("enter your first word");
        String word1=i.nextLine();
           System.out.println("enter your second word");
                   String word2=i.nextLine();
            if(word1.contains(word2))  
                System.out.println("the"+ word2+" is substring"+ word1);
            else     System.out.println("the"+ word2+" is not substring"+ word1);
        
        //the phone key:
       // Scanner i=new Scanner(System.in);
        System.out.println("enter a letter");
     String letter2=i.next();
     char ch=Character.toUpperCase(letter2.charAt(0));
     if(!Character.isLetter(ch))  {
         System.out.println("the input is invaild");
     }
        int number;
        if("ABC".indexOf(ch)>=0)  number=2;
        else if("DEF".indexOf(ch)>=0)  number=3;
          else if("GHI".indexOf(ch)>=0)  number=4;
          else if("JKL".indexOf(ch)>=0)  number=5;
          else if("MNO".indexOf(ch)>=0)  number=6;
          else if("PQRS".indexOf(ch)>=0)  number=7;
          else if("TUV".indexOf(ch)>=0)  number=8;
          else   number=9;
        System.out.println("the  number phone key is :"+number);
    //vowel
Scanner in=new Scanner(System.in);
    System.out.println("Enter a letter");
    String word12=in.next();
    String vowel="aoiue";
    if(vowel.toUpperCase().contains(word12)||vowel.toLowerCase().contains(word12))  
        System.out.println("your letter is vowel");
    else System.out.println("your letter is constant");
   
          
//Q5.35 
double result = 0;
        for(double a = 1; a<624; a++){
    result += 1/(Math.sqrt(a)+Math.sqrt(a+1));
}
        System.out.println(result);
// the value of PI
double pi=0;
for(double j=1;j<=2000000;j++){
    pi+=Math.pow(-1, j+1)/(2*j-1);
}
        System.out.println("The PI prise ="+4*pi);
       double e=0;
 //the order tow cities
   Scanner input1=new Scanner(System.in);
        System.out.println("Enter your first city");
        String city1=input1.nextLine();
        System.out.println("Enter your second city");
        String city2=input1.nextLine();
if(city1.compareTo(city2)<0)   
            System.out.println("The cities in alphabitical order is:"+ city1 +" and "+ city2);
else    System.out.println("The cities in alphabitical order is:"+ city2 +" and "+  city1);
        // change hexadecimal to decimal
     //   Scanner i=new Scanner(System.in);
        System.out.println("Enter a hexadecimal number");
        String numberhex=i.nextLine();
        if(numberhex.length()!=1) { 
            System.out.println("You must enter only one character");
            System.exit(1);}
        char num=Character.toUpperCase(numberhex.charAt(0));
        if(num>='A' && num<='F')  {
            int price=num-'A'+10;
            System.out.println("The decimal value for "+ num+ " is:"+price);
        }
        else if(Character.isDigit(num))  {
            System.out.println("The decimal value for "+ num+" is+num");}
        else  System.out.println("Your input is invild");
        
        
        
        
        
        
        
    }
    
}
