package Final.SumNumbers;

import java.util.Scanner;

public class Program {
    /*
     * Sum of Numbers in a String  
Write a program that asks the user to enter a series of numbers separated by commas. Here
is an example of valid input:
7,9,10,2,18,6
The program should calculate and display the sum of all the numbers.
     */

     public static void main(String[] args)
     {
        /*Method used: take in a string input, remove all spaces. Split on comma into a String[]. 
        Create a long array the same size as the string array, and copy values into it, converting from string to long. 
        Pass long array to sumNumbers. 
        Display value to user. 
        Known Issues: can't handle if the parse isn't a number. I could use exception handling, but we haven't learned that yet. 
        */
        Scanner scan = new Scanner(System.in);

        System.out.print("Enter a list of numbers, separated by a comma:");
        String[] inputStringArray = scan.nextLine().split(",");
        //create the new long array
        Long[] numberArray = new Long[inputStringArray.length];

        //loop through input array and convert to long
        for(int i=0;i<inputStringArray.length;i++)
        {
            numberArray[i]=Long.parseLong(inputStringArray[i]);
        }

        //pass to sumNumbers
        Long sum = sumNumbers(numberArray);
        System.out.printf("Sum: %d",sum);

        scan.close();
     }   
     
     public static Long sumNumbers(Long[] pInput)
     {
        /*Method which takes an array of longs and sums all of them
        Input: array of longs
        Process: iterate through the array, and add to an accumulator. 
        Output: sum of values. 
        */
        Long sum=0L;
        for (Long long1 : pInput) {
            sum+=long1;
        }
        return sum;
     }

}
