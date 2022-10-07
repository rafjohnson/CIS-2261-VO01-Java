package Week5;

import javax.swing.JOptionPane;

public class StringManipulator {
    /*
     * Write a program that asks the user to enter the name of his or her favorite city. Use a String
variable to store the input. The program should display the following:
• The number of characters in the city name
• The name of the city in all uppercase letters
• The name of the city in all lowercase letters
• The first character in the name of the city

+----------------+------------------------+-------------------------------+
| Input          | Process                | Output                        |
+----------------+------------------------+-------------------------------+
| *Favorite City |  caputure variables:   | *Number of Chars in city name |
|                | toUpper, toLower,      | *Name of city in upper case   |
|                | firstChar              | *Name of city in lower case   |
|                |                        | *First char in name of city   |
+----------------+------------------------+-------------------------------+
     */

     public static void main (String[] args)
     {
        //variables
        String cityName;
        String cityToUpper;
        String cityToLower;
        Character cityFirstChar;

        //input
        cityName= JOptionPane.showInputDialog("Enter your favorite city:");

        //manipulation
        cityToUpper = cityName.toUpperCase();
        cityToLower = cityName.toLowerCase();
        cityFirstChar = cityName.charAt(0);


        //output
        String output = "City Name: "+ cityName +"\n"
                       +"City (Upper Case): " + cityToUpper + "\n"
                       +"City (Lower Case): " + cityToLower + "\n"
                       +"City First Character: " + cityFirstChar;
        JOptionPane.showMessageDialog(null, output,"Your Favorite City",1);

     }
}
