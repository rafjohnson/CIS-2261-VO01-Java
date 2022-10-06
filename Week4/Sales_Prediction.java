package Week4;

import java.text.DecimalFormat;
import java.text.NumberFormat;

public class Sales_Prediction {
    /*
     * The East Coast sales division of a company generates 65 percent of total sales. Based on
that percentage, write a program that will predict how much the East Coast division will
generate if the company has $8.3 million in sales this year.
Hint: Use the value 0.65 to represent 65 percent
     */

     /*
      * 
    +------------------------+-------------------------------------------------+-------------------------------+
    | Input                  | Process                                         | Output                        |
    +------------------------+-------------------------------------------------+-------------------------------+
    | Sales $                | * East Coast = (Percentage * Total Sales)       | Display East Coast Division $ |
    | Percent of Total Sales |                                                 |                               |
    +------------------------+-------------------------------------------------+-------------------------------+
      */

    public static void main(String[] args)
    {
        Double totalSales;
        Double percentage; 
        Double eastCoastSales;

        //initialize:
        totalSales = 8300000.00;
        percentage = .65;

        //calculate
        eastCoastSales = percentage * totalSales;

        //format decimal to dollar format
        NumberFormat formatter = new DecimalFormat("#,000.00");

        System.out.println("The East Coast Division sales will be: $" + formatter.format(eastCoastSales));

    }
      
}
