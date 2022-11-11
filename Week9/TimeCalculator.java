package Week9;

import java.util.Scanner;

public class TimeCalculator {
   /*
   Time Calculator
Write a program that asks the user to enter a number of seconds.
l There are 60 seconds in a minute. If the number of seconds entered by the user is
greater than or equal to 60, the program should display the number of minutes in that
many seconds.
l There are 3,600 seconds in an hour. If the number of seconds entered by the user is
greater than or equal to 3,600, the program should display the number of hours in
that many seconds.
l There are 86,400 seconds in a day. If the number of seconds entered by the user is
greater than or equal to 86,400, the program should display the number of days in
that many seconds.
 */ 

 /*
  * Input: user input: number of seconds
  Process: determine hours/minutes/days
  Output: display # hours/minutes/days
  */

  public static Integer seconds=0;
  public static Integer minutes=0;
  public static Integer hours=0;
  public static Integer days=0;

  public static void main(String[] args)
  {
     
    Scanner scan = new Scanner(System.in);
    Integer input;


    //user input
    System.out.println("Input number of seconds to convert");
    input=scan.nextInt();

    //calculate
    calculateTimePeriods(input);

    //output
    System.out.printf("Days: %d\n Hours: %d \n Minutes: %d\n Seconds: %d\n",days,hours,minutes,seconds);


  }

  private static void calculateTimePeriods(Integer pSeconds)
  {
    //input: seconds
    //process: starting with days, subtract days worth of seconds, until less than a days worth. Repeat until less than 60 
    //seconds.
    //days:86400
    //hours: 3600
    //minutes:60
    //output: none

    Integer workingSeconds=pSeconds;
    
    
    
    
   //days
    while(workingSeconds>=86400)
    {
        
        days++; 
        workingSeconds=workingSeconds-86400;       
    }

    //hours
    while(workingSeconds>=3600)
    {
        hours++;
        workingSeconds = workingSeconds-3600;
    }

    //minutes
    while(workingSeconds>=60)
    {
        minutes++;
        workingSeconds = workingSeconds-60;
    }

    //seconds gets the leftovers. 
    seconds = workingSeconds;

  }
}
