package Week5;

import java.text.DecimalFormat;
import java.text.NumberFormat;

import javax.swing.JOptionPane;

public class MPG {
    /*A car’s miles-per-gallon (MPG) can be calculated with the following formula:
MPG = Miles driven / Gallons of gas used.
Write a program that asks the user for the number of miles driven and the gallons of gas
used. It should calculate the car’s MPG and display the result on the screen. 

+--------------+-------------------------------------+--------+
| Input        | Process                             | Output |
+--------------+-------------------------------------+--------+
| Miles Driven | MPG <= Miles Driven / Gallons used  | *MPG   |
| Gallons used |                                     |        |
+--------------+-------------------------------------+--------+
*/

    public static void main (String[] args)
    {
        //declarations
        float milesDriven;
        float gallonsUsed;
        float mpg;

        //input - Trying input dialogs
        String milesDrivenStr;
        milesDrivenStr = JOptionPane.showInputDialog("Enter the number of miles driven.");
        milesDriven = Float.parseFloat(milesDrivenStr);

        String gallonsUsedStr;
        gallonsUsedStr = JOptionPane.showInputDialog("Enter the number of gallons used.");
        gallonsUsed = Float.parseFloat(gallonsUsedStr);

        //calculate
        mpg = milesDriven/gallonsUsed;

        //output
        NumberFormat formatter = new DecimalFormat("#.00");
        String output = "Miles Driven: " + milesDriven + "\n";
        output += "Gallons Used: " + gallonsUsed +"\n";
        output += "MPG: " + formatter.format(mpg);
        JOptionPane.showMessageDialog(null, output,"MPG",1);

        //exit
        System.exit(0);

    }
}
