
package decimal.to.hexadecimal;
import java.util.Scanner;
public class DecimalToHexadecimal {
    public static void main(String[] args) {
     Scanner i=new Scanner(System.in);
        System.out.println("Enter a decimal number");
        int decimal=i.nextInt();
        String Hex="";
        while(decimal!=0){
             int hex=decimal%16;
       char hexdigit=(hex>=0 && hex<=9)?(char)(hex+'0'):(char)(hex-10+'A');
       Hex=hexdigit+Hex;
       decimal/=16;
        }
        System.out.println("The Hex is:"+Hex);        
        
        
        
        
        
        
        
        
    }
    
}
