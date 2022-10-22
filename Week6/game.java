package Week6;

import java.util.Random;
import java.util.Scanner;
/*
 * +-------------+-------------------------------+------------------------------+
| Input       | Process                       | Output                       |
+-------------+-------------------------------+------------------------------+
| Int - Guess |                               |                              |
| from user   | Compare against random number | High, Low, or number found.  |
+-------------+-------------------------------+------------------------------+
//I will say, and IPO chart doesn't make as much sense as a flow chart here. 
 */

public class game {
    public static void main (String[] args)
    {
        Integer randomNumber;
        Integer playerGuess;
        Integer guessCount=0;
        boolean gotItRight=false;
        Integer lBound = 1;
        Integer uBound=50;

        //Generate the random number
        //generates from 0 - bound-1. Add 1 to each to go from 1-bound. 
        Random rand = new Random();
        randomNumber = rand.nextInt(uBound+lBound)+lBound;

        Scanner scan = new Scanner(System.in);

        System.out.print("Do you want to play a game?\n");
        System.out.printf("Enter a number between %d and %d: \n",lBound,uBound);

        do{
            
            playerGuess = scan.nextInt();

            //check for OK-ness
            if(playerGuess>=lBound && playerGuess<=uBound)
            {
                if(playerGuess>randomNumber)
                {
                    guessCount++;
                    System.out.println("Sorry, your guess was too high. Please try again:");
                }
                else if (playerGuess<randomNumber)
                {
                    guessCount++;
                    System.out.println("Sorry, your guess was too low. Please try again: ");
                }
                else
                {
                    guessCount++;
                    gotItRight = true;
                }
            }
            else
            {
                System.out.printf("The number you entered is not between %d and %d. Please try again.\n",lBound,uBound);
                guessCount++;
            }

        }while(gotItRight == false);

        String winningMessage="";
        winningMessage = "Great Job! The winning number was " + randomNumber + " and you took " + guessCount;
        if(guessCount==1)
        {
            winningMessage += " try.";
        }
        else{
            winningMessage += " tries. ";
        }
        System.out.println(winningMessage);
        scan.close();

    }

}
