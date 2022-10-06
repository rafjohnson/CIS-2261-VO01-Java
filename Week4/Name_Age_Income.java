package Week4;

import java.text.DecimalFormat;
import java.text.NumberFormat;

public class Name_Age_Income {
/* Write a program that declares the following:

 a String variable named name
 an int variable named age
a double variable named annualPay
Store your age, name, and desired annual income as literals in these variables. The program
should display these values on the screen in a manner similar to the following:
My name is Joe Mahoney, my age is 26 and
I hope to earn $100000.0 per year.*/

/*
 * +------------+------------------------+----------------------------------------+
| Input      | Process                | Output                                 |
+------------+------------------------+----------------------------------------+
| Name       | Populate output string | My name is <name>, my age is <age>     |
| Age        | with values.           | and I hope to earn $<amount> per year. |
| Annual Pay |                        |                                        |
+------------+------------------------+----------------------------------------+
 */

    public static void main(String[] args)
    {
       String name, output;
       Integer age;
       Double annualPay;

       //hardcoded values
       name = "Rebecca Johnson";
       age = 35;
       annualPay = 100000.00;

       //format decimal to dollar format
       NumberFormat formatter = new DecimalFormat("#,000.00");
        
       //output
        output = "My name is "+name + ", my age is "+ age + " and I hope to earn $" + formatter.format(annualPay);
        System.out.println(output);

    }

}