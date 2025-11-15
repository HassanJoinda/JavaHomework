
package computing.loan.paymenth;
import java.util.Scanner;
public class ComputingLoanPaymenth {
    public static void main(String[] args) {
      
        Scanner input=new Scanner(System.in);
        System.out.println("enter your loanamount");
        double loanamount;
        loanamount=input.nextDouble();
        System.out.println("enter your monthly intre");
        double mir;
        mir=input.nextDouble();
        System.out.println("enter year");        
        double year;
        year=input.nextDouble();
        double monthlypayment=loanamount*mir/(1-(1/(Math.pow(1+mir, year*12))));
        System.out.println("monthlypaymante="+monthlypayment);
        
        
        
        
        
    }
    
}
