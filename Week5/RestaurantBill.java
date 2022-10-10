package Week5;

import java.text.DecimalFormat;
import java.text.NumberFormat;
import java.util.Scanner;

public class RestaurantBill {
/*
 * Write a program that computes the tax and tip on a restaurant bill. The program should ask
the user to enter the charge for the meal. The tax should be 7.5 percent of the meal charge.
The tip should be 18 percent of the total after adding the tax. Display the meal charge, tax
amount, tip amount, and total bill on the screen.

+--------------+----------------------------------------+--------------+
| Input        | Process                                | Output       |
+--------------+----------------------------------------+--------------+
| *Meal Charge | *TaxAmount <= MealCharge * .075        | *Meal Charge |
|              | *Tip <= (MealCharge + TaxAmount) * .18 | *Tax Amount  |
|              | *Total = MealCharge + TaxAmount + Tip  | *Tip Amount  |
|              |                                        | *Total       |
+--------------+----------------------------------------+--------------+
 */

 public static void main(String[] args)
 {
    //declarations
    double mealCharge;
    final double SALES_TAX = 0.075;
    double mealTaxAmount;
    final double TIP_PERCENTAGE = 0.18;
    double tipAmount;
    double total; 


    //Input
    System.out.println("Please enter the charge for the meal.");
    Scanner input = new Scanner(System.in);
    mealCharge = input.nextDouble(); 
    input.close(); 

    //calculations, need to deal with rounding errors with multiple percentages. https://stackoverflow.com/a/11701527/7858537
    mealTaxAmount  = Math.round((mealCharge * SALES_TAX) * 100.0)/100.0; 
    
    tipAmount = Math.round( ((mealCharge + mealTaxAmount) * TIP_PERCENTAGE)*100.0 )/100.0;
    total = mealCharge + mealTaxAmount + tipAmount;

    //Output
    NumberFormat formatter = new DecimalFormat("#.00");

    System.out.println("--- Bill Information ---");
    System.out.println("Meal Charge: $"+ formatter.format(mealCharge));
    System.out.println("Sales Tax: $" + formatter.format(mealTaxAmount));
    System.out.println("Tip Amount: $" + formatter.format(tipAmount));
    System.out.println("Total Due: $" + formatter.format(total));
 }
}
