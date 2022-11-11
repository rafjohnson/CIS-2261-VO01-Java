package Week9;

import java.io.StringReader;
import java.util.Scanner;

public class MobileServiceProvider{
    /*
     * Mobile Service Provider
A mobile phone service provider has three different subscription packages for its customers:
Package A: For $39.99 per month 450 minutes are provided. Additional minutes are
$0.45 per minute.
Package B: For $59.99 per month 900 minutes are provided. Additional minutes are
$0.40 per minute.
Package C: For $69.99 per month unlimited minutes are provided.
Design a program that calculates a customer’s monthly bill. It should store the letter of the
package the customer has purchased (A, B, or C) and the number of minutes that were used.
The program should display the total charges in decimal format
     */

     //Input: Package number, minutes used
     //Process: basecharge + ratePerMinute*(baseMinutes-usedMinutes) when used Minutes is greater than base minutes
     //output total charges

     public static void main(String[] args)
     {
          final Double basePackageA = 39.99;
          final Double basePackageB = 59.99;
          final Double basePackageC = 69.99;

          final Integer minutesIncludedPackageA = 450;
          final Integer minutesIncludedPackageB = 900;
          //package c is unlimited. 

          final Double additionalMinuteRateA = 0.45;
          final Double additionalMinuteRateB = 0.40;

          String packageSelection;
          Integer minutesUsed;
          Double totalCharges = 0.00;
          Scanner scan = new Scanner(System.in);

          //get user input
          System.out.println("Enter the package selected: ");
          packageSelection = scan.next();
          System.out.println("Enter number of minutes used: ");
          minutesUsed = scan.nextInt();

          //calculate
          switch (packageSelection) {
               case "A":
                    if(minutesUsed>minutesIncludedPackageA)
                    {
                         totalCharges = basePackageA + additionalMinuteRateA *(minutesUsed-minutesIncludedPackageA);
                    }
                    else{
                         totalCharges = basePackageA;
                    }
                    break;
          
               case "B":
               if(minutesUsed>minutesIncludedPackageB)
                    {
                         totalCharges = basePackageB + additionalMinuteRateB *(minutesUsed-minutesIncludedPackageB);
                    }
                    else{
                         totalCharges = basePackageB;
                    }
                    break;

               case "C":
               //unlimited package
                    totalCharges = basePackageC;
                    break;
               default:
                    break;
          }

          //output
          System.out.printf("The total charges are $%.2f",totalCharges);
          scan.close();
     }
}