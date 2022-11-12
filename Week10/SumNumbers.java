package Week10;

import java.util.Scanner;

public class SumNumbers {
    /*
     * Write a program that asks the user for a positive nonzero integer value. The program
should use a loop to get the sum of all the integers from 1 up to the number entered. For
example, if the user enters 50, the loop will find the sum of 1, 2, 3, 4, . . . , 50.
     */

     /*Input: user input value (Positive, nonzero) integer
      * Process: For loop, for 1 to input, add i to the final output
      Outupt: Additive value. 
      */

    public static void main(String[] args)
    {
        Integer input;
        Long output=0L; //there's a good chance that it'l overflow an int. 
        
        Scanner scan = new Scanner(System.in);

        //validate input
        do{
            System.out.println("Input a whole number greater than 0:");
            input = scan.nextInt();
        }while(input<1);
        
        //now, have a valid input
        for(int i=1;i<=input;i++)
        {
            System.out.printf("output: %d i: %d, ",output,i);
            output+=i;
            System.out.printf("total: %d\n ",output);
            
        }

        System.out.printf("Sum is %d\n",output);
        scan.close();
    
    }
}
