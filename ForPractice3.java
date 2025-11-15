
package pkgfor.practice.pkg3;
import java.util.Scanner;
public class ForPractice3 {
public static void main(String[] args) {
//    //practice 1:
//int sum1=0;
//int sum2;
//Scanner i=new Scanner(System.in);
//do{
//    System.out.println("enter a number(if number is zero input end)");  
//    sum2=i.nextInt();
//    sum1+=sum2;
//}
//while(sum2!=0);
//    System.out.println("the sum is :"+sum1);
//////Scanner i=new Scanner(System.in);
//        System.out.println("enter your sentences");
//String s=i.nextLine();
//        System.out.println("your lenth sentences is"+s.length()+"and the first character is:"+s.charAt(0));
//    
//    //Scanner i=new Scanner(System.in);
//        System.out.println("enter your first sentences");
//     String s1=i.nextLine();
//        System.out.println("enter your second sentences");
//      String s2=i.nextLine();
//       if(s1.contains(s2))  System.out.println(s2+"Yes"+s1 );
//       else   System.out.println("Not!");
//// practice 5.4
//    final int numQ=5;
//    int countQ=0;
//    int correctA=0;
//   while(countQ<numQ) {
//        int num1=(int)(Math.random()*10);
//        int num2=(int)(Math.random()*10);
//       Scanner input=new Scanner(System.in);
//       System.out.println("what is "+num1+"+"+num2+"?");
//       int answer=input.nextInt();
//       if(answer==num1+num2){
//           System.out.println("Your answer is correct");
//       correctA++;}
//       else System.out.println("The answer is wrong it should be "+(num1+num2));
//       countQ++;
//   }
//        System.out.println("The correct answer is :"+correctA);
////change
//   System.out.println("kilograms" +"    "   +"pounds");
//       for(int kilo=1;kilo<=199;kilo+=2){
//           double pound=kilo*2.2;
//           System.out.print(kilo+"           " +pound);
//       
//        System.out.println("  ");}
//// Dec2hex
//Scanner in=new Scanner(System.in);
//        System.out.println("Enter decimal number");
//        int decimal=in.nextInt();
//        String hex1="";
//        while(decimal!=0){
//            int hex=decimal%16;
//         char hexdigit=(hex>=0 && hex<=9)?(char)(hex+'0'):(char)(hex-10+'A');
//         hex1=hexdigit+hex1;
//           decimal/=16;}
//         System.out.println("The decimal :");
//        System.out.println("The "+ decimal+"=" +hex1);
//

// check the vowel and constant:
Scanner i=new Scanner(System.in);
        System.out.println("Enter the sentensec");
        String name=i.nextLine();
        int v=0;
        int c=0;
        String vowel="aioueAIUEO";
    for(int a=0;a<name.length();a++){
     char ch=name.charAt(a);
     if(Character.isLetter(ch)){
         if(vowel.contains(Character.toString(ch)))   v++;
         else  c++;
     }
             
    }
        System.out.println("the vowel is:"+v);
        System.out.println("the constant is :"+c);
     // check the Upper case letter:
     Scanner input=new Scanner(System.in);
        System.out.println("Enter your sentences");
        String name1=input.nextLine();
        int U=0;
        for(int a=0;a<name1.length();a++){
            char ch=name1.charAt(a);
            if(Character.isUpperCase(ch))
              U++;
        }
        System.out.println("The Uppercase is :"+U);
// disply the odd position on the sentences:
Scanner in=new Scanner(System.in);
        System.out.println("Enter a word");
        String name2=in.nextLine();
        for(int a=0;a<name2.length();a++){
            char ch=name2.charAt(a);
            if(a%2==1)     System.out.print(name.charAt(a));
        }System.out.println("");
        // The reverse name:
        Scanner inp=new Scanner(System.in);
        System.out.println("Enter your name");
        String name3=inp.nextLine();
        String name12="";
        for(int a=name3.length()-1;a>=0;a--){
            char ch=name.charAt(a);
            name12+=ch;
        }
               System.out.print("The reverse number is:"+name12);
//change decimal to binary:
Scanner s=new Scanner(System.in);
        System.out.println("Enter a decimal number pleadse");
        int decimal=s.nextInt();
        String binary="";
        while(decimal!=0){
             int bin=decimal%2;
             binary=bin+binary;
             decimal/=2;
        }
        System.out.println("The binary number is:"+binary);
//change decimal to octal:
Scanner l=new Scanner(System.in);
        System.out.println("Enter a deciaml number");
        int Decimal=l.nextInt();
        String octal="";
        while(Decimal!=0){
          int oct = Decimal%8;
          octal=oct+octal;
          Decimal/=8;
        }
        System.out.println("The octal number is:"+octal);
       // disply the character from ! to ~ int ten line:
       int coun=0;
for(char ch='!';ch<='~';ch++){
    System.out.print(ch+" ");
    coun++;
    if(coun%10==0)  
        System.out.println("");
}
// The positive and negative count:
Scanner a=new Scanner(System.in);
        System.out.println("Enter numbers");
        int number=a.nextInt();
        int p=0;
        int N=0;
        int sum=0;
        while(number!=0){
            if(number>0)   p++;
            else N++;
            sum+=number;
            number=i.nextInt();
        }
        System.out.println("The positive is:"+p);
        System.out.println("The neagative is:"+N);
        System.out.println("The total is:"+sum);
        System.out.println("The average is:"+(double)sum/(N+p));

       
  
  
 

   
        


           
   
    
    
    
    
    
    
    
    
        
        
        
}
        
        
} 
    
    

