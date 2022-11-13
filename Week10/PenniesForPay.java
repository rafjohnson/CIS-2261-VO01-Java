package Week10;

import java.math.BigDecimal;
import java.math.BigInteger;
import java.util.Scanner;

public class PenniesForPay {
    /*
     * Write a program that calculates how much a person would earn over a period of time if
his or her salary is one penny the first day, two pennies the second day, and continues to
double each day. The program should display the salary for each day, and
then show the total pay at the end of the period. The output should be displayed in a dollar
amount, not the number of pennies.
Input Validation: Do not accept a number less than one for the number of days worked.

Input: user input (validated to be 1 or more)
Process: for loop starting at 1, up to user input, doubling value each time. Convert to dollars (divide by 100)
Output: final amout, in dollars

     */


    public static void main(String[] args)
    {
        Integer input;
        BigInteger cents= new BigInteger("1"); //there's a good chance that it'l overflow an int. 
        Scanner scan = new Scanner(System.in);

        //validate input
        do{
            System.out.println("Input a whole number of days, greater than 0:");
            input = scan.nextInt();
        }while(input<1);
        
        //now, have a valid input
        for(int i=1;i<=input;i++)
        {
            System.out.printf("day: %d cents: %d, ",i, cents,i);
            cents= cents.multiply(BigInteger.valueOf(2));
            System.out.printf("total: %d\n ",cents);
            
        }

        //convert to dollars
        BigDecimal centsDecimal = new BigDecimal(cents, 0);
        BigDecimal dollars = centsDecimal.divide(BigDecimal.valueOf(100.00));
        System.out.printf("Amount earned is: %.2f",dollars);
        scan.close();
    
    }
}
