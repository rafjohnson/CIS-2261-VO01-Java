package Week13.DriversLicense;

import java.util.Scanner;

public class Program {
    /*Much like the rainfall program, I'm going to break this out into two sections,
     * one for testing/debugging and one for the actual interactive program. 
     */

     public static void main(String[] args)
     {
        //multiple driver exam objects, pass (100% right), fail (0% right), and exactly passing (15 correct)
        char[] passAnswers = {'B','D','A','A','C','A','B','A','C','D','B','C','D','A','D','C','C','B','D','A'};
        char[] failAnswers = {'A','C','B','C','D','B','C','D','A','C','A','D','B','D','C','A','B','C','A','B'};
        char[] exactlyPassAnswers = {'A','D','B','A','C','C','B','A','C','A','B','C','C','A','D','C','C','B','D','A'};

        //create the objects. 
        DriverExam fullPass = new DriverExam(passAnswers);
        DriverExam fail = new DriverExam(failAnswers);
        DriverExam exactlyPass = new DriverExam(exactlyPassAnswers);

        //run tests. 
        //#1: pass/fail
        //#2: right/wrong
        //#3: list of wrong answers

        System.out.printf("FullPass: \n");
        System.out.printf("Pass/Fail: %s\n",fullPass.passed()?"Passed":"Fail");
        System.out.printf("No. Right: %d  No. Wrong: %d\n",fullPass.totalCorrect(),fullPass.totalIncorrect());
        System.out.printf("Questions incorrect: ");
        Integer[] passedQuestionsMissed = fullPass.questionsMissed();
        for(int i=0;i<passedQuestionsMissed.length;i++)
        {
            System.out.printf("%d ",passedQuestionsMissed[i]);
        }

        System.out.println("\n--------------------------------------");

        System.out.printf("fail: \n");
        System.out.printf("Pass/Fail: %s\n",fail.passed()?"Passed":"Fail");
        System.out.printf("No. Right: %d  No. Wrong: %d\n",fail.totalCorrect(),fail.totalIncorrect());
        System.out.printf("Questions incorrect: ");
        Integer[] failedQuestionsMissed = fail.questionsMissed();
        for(int i=0;i<failedQuestionsMissed.length;i++)
        {
            System.out.printf("%d ",failedQuestionsMissed[i]);
        }
        
        System.out.println("\n--------------------------------------");

        System.out.printf("JustPass: \n");
        System.out.printf("Pass/Fail: %s\n",exactlyPass.passed()?"Passed":"Fail");
        System.out.printf("No. Right: %d  No. Wrong: %d\n",exactlyPass.totalCorrect(),exactlyPass.totalIncorrect());
        System.out.printf("Questions incorrect: ");
        Integer[] exactlyPassedMissed = exactlyPass.questionsMissed();
        for(int i=0;i<exactlyPassedMissed.length;i++)
        {
            System.out.printf("%d ",exactlyPassedMissed[i]);
        }
        System.out.print("\n");

        //And now for the interactive portion. Only change will be to input values, and 
        //then output the same as the test portion

        //create the object
        DriverExam interactvieExam = new DriverExam();
        Scanner scan = new Scanner(System.in);
        //take in user input
        for(int i=0;i<20;i++)
        {
            boolean validInput = false;
            Character input='\0';
            while(!validInput)
            {
                do{
                    System.out.printf("Enter the answer for question %d: ",i+1);
                    while(!scan.hasNext())
                    {
                        System.out.println("You must enter a letter. ");
                        scan.next();

                    }
                    input = scan.next().charAt(0);
                    input = Character.toUpperCase(input);//make it uppercase for comparing;
                    if(!(Character.toUpperCase(input)=='A'||Character.toUpperCase(input)=='B'||Character.toUpperCase(input)=='C'||Character.toUpperCase(input)=='D'))
                    {
                        System.out.println("Your answer must be A, B, C, or D.");
                    }
                    else{
                        validInput = true;
                    }
                }while(!(input=='A'||input=='B'|input=='C'||input=='D'));
            }
            interactvieExam.setStudentAnswerAtIndex(input, i);
        }

        //print results
        System.out.println("\n--------------------------------------");

        System.out.printf("Interactive Answers: \n");
        System.out.printf("Pass/Fail: %s\n",interactvieExam.passed()?"Passed":"Fail");
        System.out.printf("No. Right: %d  No. Wrong: %d\n",interactvieExam.totalCorrect(),interactvieExam.totalIncorrect());
        System.out.printf("Questions incorrect: ");
        Integer[] interactiveWrongs = interactvieExam.questionsMissed();
        for(int i=0;i<interactiveWrongs.length;i++)
        {
            System.out.printf("%d ",interactiveWrongs[i]);
        }

        scan.close();
     }


}
