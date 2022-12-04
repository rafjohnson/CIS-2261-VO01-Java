package Week13.DriversLicense;

import java.sql.Driver;
import java.util.ArrayList;

import Week8.payrollDemo;

public class DriverExam {
    //fields
    //array[20] answers - chars - final
    //array[20] student answers - chars
    private final char[] ANSWERS= {'B','D','A','A','C','A','B','A','C','D','B','C','D','A','D','C','C','B','D','A'};
    private char[] studentAnswers= new char[20];
    //constructor - default constructor
    public DriverExam()
    {
        //don't do anything special
    }

    public DriverExam(char[] pAnswers)
    {
        //special constructor that takes a list of answers. 
        //copies pAnswers to the studentAnswers array. 

        for(int i=0;i<studentAnswers.length;i++)
        {
            studentAnswers[i]=pAnswers[i];
        }
    }

    //getters
    //none needed

    //setters
    //set answer at index - 0-based
    public void setStudentAnswerAtIndex(char pAnswer, int index)
    {
        /*Input: answer:char - student's answer, index - 0-based index
         * Process: set char at index to pAnswer
         * Output: none
         */

         studentAnswers[index]=pAnswer;
    }


    //methods
    //isCorrect - a helper method to determine if any particular answer is correct
    private boolean isCorrect(int index)
    {
        /*
         * Input: index to look for 
         * Process: compare ANSWERS[index] to StudentAnswers[index].
         * Output: If they're equal, return true, else return false. 
         */

         char answer = ANSWERS[index];
         char studentAnswer = studentAnswers[index];
         boolean correct = (answer==studentAnswer)?true:false;

         return correct;
    }
    //passed - t/f if student passed
    public boolean passed()
    {
        /*
         * Input: n/a
         * Process: call totalCorrect. Passed = 15 or more. 
         * Output: boolean if the student has passed
         */

         if(totalCorrect()>=15)
         { return true;}
         else
         { return false;}
    }
    
    //totalCorrect - number correct
    public Integer totalCorrect()
    {
        /*
         * Input: n/a
         * Process: loop through studentAnswers, and each time one is correct, increment correct
         * Output: correct value
         */
        Integer correct=0;

        for(int i=0;i<studentAnswers.length;i++)
        {
            if(studentAnswers[i]==ANSWERS[i])
            {
                correct++;
            }
        }
        return correct;
    }
    //totalIncorrect - number incorrect
    public Integer totalIncorrect()
    {
        /*
         * Input:n/a
         * Process: no point in doing the same thing twice. Since the number of answers is fixed, calculate
         * total correct - ANSWERS.length, and that'll be the wrong ones. 
         * Output: Answers.lenghth - totalCorrect.
         */

         return ANSWERS.length - totalCorrect();
    }

    //questionsMissed - array of ints showing the ones wrong
    public Integer[] questionsMissed()
    {
        /*
         * Input: n/a
         * Process: use an array list to keep track of the ones wrong. loop from 0-Answers.length
         * and call isCorrect. If false, add to an arrayList
         * Output arrayList.toArray().
         */

         ArrayList<Integer> incorrect = new ArrayList<Integer>();
         for(int i=0;i<studentAnswers.length;i++)
         {
            if(!isCorrect(i))
            {
                incorrect.add(i+1); //questions are 1 based.
            }
         }

         Integer[] incorrectArray = new Integer[incorrect.size()];
         incorrectArray = incorrect.toArray(incorrectArray);
         return incorrectArray;

    }
    

}
