package Week5;

import java.text.DecimalFormat;
import java.text.NumberFormat;
import java.util.Scanner;

public class SalesTax {
        /*
     * Write a program that will ask the user to enter the amount of a purchase. The program should
then compute the state and county sales tax. Assume the state sales tax is 5.5 percent
and the county sales tax is 2 percent. The program should display the amount of the purchase,
the state sales tax, the county sales tax, the total sales tax, and the total of the sale (which is
the sum of the amount of purchase plus the total sales tax).
Hint: Use the value 0.02 to represent 2 percent, and 0.055 to represent 5.5 percent.

+-----------------+---------------------------------------------+-------------------+
| Input           | Process                                     | Output            |
+-----------------+---------------------------------------------+-------------------+
| Purchase Amount | *StateSalesTax <= Purchase * .02            | *Purchase Amount  |
|                 | *CountySalesTax <= Purchase * .055          | *State Sales Tax  |
|                 | *TotalTax <= StateSalesTax + CountySalesTax | *County Sales Tax |
|                 | *TotalSale <= PurchaseAmount + TotalTax     | *Total Sales Tax  |
|                 |                                             | *Total Sale       |
+-----------------+---------------------------------------------+-------------------+
     */

    public static void main(String[] args)
    {
       //declarations
       double purchaseAmount;
       final double STATE_SALES_TAX = 0.02;
       final double COUNTY_SALES_TAX = 0.055;
       double stateSalesTaxAmt;
       double countySalesTaxAmt;
       double totalSalesTax;
       double total; 
   
   
       //Input
       System.out.println("Please enter the purchase amount.");
       Scanner input = new Scanner(System.in);
       purchaseAmount = input.nextDouble(); 
       input.close(); 
   
       //calculations, needing to deal with rounding errors with multiple percentages. https://stackoverflow.com/a/11701527/7858537
       stateSalesTaxAmt  = Math.round((purchaseAmount * STATE_SALES_TAX) * 100.0)/100.0; 
       countySalesTaxAmt = Math.round((purchaseAmount * COUNTY_SALES_TAX) * 100.0)/100.0; 

       totalSalesTax = stateSalesTaxAmt + countySalesTaxAmt;
     
       total = purchaseAmount + totalSalesTax;
   
       //Output
       NumberFormat formatter = new DecimalFormat("#.00");
   
       //dealing wibug rounding errors
       System.out.println("Purchase Amount: $"+ purchaseAmount);
       System.out.println("State Sales Tax: $" + stateSalesTaxAmt);
       System.out.println("County Sales Tax: $" + countySalesTaxAmt);
       System.out.println("Total Tax: $" + totalSalesTax);
       System.out.println("Total Due: $" + total);
   
       System.out.println("--- Bill Information ---");
       System.out.println("Purchase Amount: $"+ formatter.format(purchaseAmount));
       System.out.println("State Sales Tax: $" + formatter.format(stateSalesTaxAmt));
       System.out.println("County Sales Tax: $" + formatter.format(countySalesTaxAmt));
       System.out.println("Total Tax: $" + formatter.format(totalSalesTax));
       System.out.println("Total Due: $" + formatter.format(total));
    }
}
