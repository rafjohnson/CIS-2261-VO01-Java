package Week5;

import java.util.Scanner;

public class TestAverage {
    /*
     * Write a program that asks the user to enter three test scores. The program should display
each test score, as well as the average of the scores.

+---------------+---------------------------------+----------------+
| Input         | Process                         | Output         |
+---------------+---------------------------------+----------------+
| *Test Score 1 | Average <= (TS1 + TS2 + TS3)/3  | *Test Score 1  |
| *Test Score 2 |                                 | *Test Score 2  |
| *Test Score 3 |                                 | *Test Score 3  |
|               |                                 | *Final Average |
+---------------+---------------------------------+----------------+


     */
    public static void main(String[] args)
    {
        //declarations
        float testScore1,testScore2, testScore3;
        float average;

        //get input. 
        //we haven't learned of how to take multiple inputs via ui, using terminal for now. 
        System.out.println("Enter three test scores. After the third, your average will display.");
        System.out.println("First Test Score: ");
        Scanner input = new Scanner(System.in);
        testScore1 = input.nextFloat();
        System.out.println("Second Test Score: ");
        testScore2 = input.nextFloat();
        System.out.println("Third Test Score");
        testScore3 = input.nextFloat();
        input.close();

        //calculations. 
        average = (testScore1 + testScore2 + testScore3) /3;

        //output
        System.out.printf("Your test scores: \n" );
        System.out.printf("Test Score #1: %.2f \n",testScore1);
        System.out.printf("Test Score #2: %.2f \n",testScore2);
        System.out.printf("Test Score #3: %.2f \n",testScore3);
        System.out.printf("Final Average: %.2f \n",average);
    }
}
