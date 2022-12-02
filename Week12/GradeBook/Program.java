package Week12.GradeBook;

import java.util.Scanner;

public class Program {
    public static void main(String[] args)
    {
        //Test program to test the gradebook class. 
        //gets info from the user, and saves them to a gradebook object. 
        //displays the class grades information


        GradeBook book = new GradeBook();
        Scanner scan = new Scanner(System.in);


        //get user info, and save values. 

        
        System.out.println("Populate students' info:");
        //limit it to 5 students. 
        for(int i=0;i<5;i++)
        {
            //start with the name
            System.out.print("\nName:");
            String name = scan.next();

            //get grades
            System.out.printf("Enter the 4 grades for %s\n",name);

            Double[] grades = new Double[4];
            for(int j = 0;j<4;j++)
            {
                //grades must be between 0 and 100. 
                boolean validScore = false;
                Double score = -1.0;
                while(!validScore)
                {
                    do{
                        System.out.print("Grade: \n");
                        while(!scan.hasNextDouble())
                        {
                            System.out.println("You must enter a decimal number.");
                            scan.next();
                        }
                        score = scan.nextDouble();

                        /*Comparing Doubles is a pain due to float rounding errors
                         (negative if lessthan, 0 if equal, positive is greaterthan) */
                        if(score.compareTo(0.0)<0 || score.compareTo(100.0)>0)
                        {
                            System.out.println("You must enter a number between 1 and 100.");
                        }
                        else{
                            validScore = true;
                        }

                    }while(score.compareTo(0.0)<0 || score.compareTo(100.0)>0);
                }
                grades[j]=score;

            }

            //save everything to the object.
            book.addStudentAndGrades(i, name, grades);
            
        }


        //output info for demo
        System.out.println("==============================\n");
        for (int i=0;i<5;i++)
        {
            System.out.printf("Student name: %s\n",book.getStudentNameByIndex(i) );
            System.out.printf("Letter grade: %s\n", book.getGradeAverageByIndex(i));
            System.out.printf("Grade average: %.2f\n", book.getAverageScoreByIndex(i));
            System.out.printf("Grades:\n");
            for(int j = 0;j<4;j++)
            {
                System.out.printf("%.2f\n",book.getTestScoreByIndexByIndex(i, j));
            }
            System.out.print("\n");
        }
        
        scan.close();

    
    }   

    

}
