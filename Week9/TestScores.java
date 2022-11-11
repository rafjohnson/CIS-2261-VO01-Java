package Week9;

import java.util.Scanner;

import Week6.story;

public class TestScores {
    /*
     * TestScores 
Design a TestScores program that asks the user to enter three numeric test scores.
Calculate the average of the three grades then use the grading scheme in the following table
and display the numeric grade, alpha grade and an appropriate message based on the grade they receive
Ex.  You average was a 93 which is an A, Great work!
Test Score Average Letter Grade
90–100 A
80–89 B
70–79 C
60–69 D
Below 60 F
     */

     /*
      * Input: 3 test scores
        Process: average 3 scores, if/else-if/else based on score to display output.
      Output: Average, Grade, message
      */

    public static void main(String[] args){
        Scanner scan = new Scanner(System.in);

        Double test1=0.0, test2=0.0, test3 = 0.0;
        Double finalScore;

        System.out.println("Enter the first test score: ");
        test1 = scan.nextDouble();

        System.out.println("Enter the second test score:");
        test2 = scan.nextDouble();

        System.out.println("Enter the third test score:");
        test3=scan.nextDouble();

        finalScore = (test1+test2+test3)/3;

        if(90<=finalScore)
        {
            System.out.printf("Your average was a %.1f which is an A. Excellent job!",finalScore);
        }
        else if(80<=finalScore && finalScore<90)
        {
            System.out.printf("Your average was an %.1f which is a B. Great work!",finalScore);
        }
        else if (70<=finalScore && finalScore<80)
        {
            System.out.printf("Your average was a %.1f which is a C. Keep up the hard work!",finalScore);
        }
        else if (60<=finalScore && finalScore<70)
        {
            System.out.printf("Your average was a %.1f which is an D. Great effort, but study harder.",finalScore);
        }
        else
        {
            System.out.printf("Your average was a %.1f which is an F. You're failing, please see me.",finalScore);
        }
        scan.close();
    }
}

