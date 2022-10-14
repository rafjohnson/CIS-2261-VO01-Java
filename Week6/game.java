package Week6;

import java.util.Random;
import java.util.Scanner;

import javax.lang.model.util.ElementScanner6;

public class game {
    public static void main (String[] args)
    {
        Integer randomNumber;
        Integer playerGuess;
        Integer guessCount=0;
        boolean gotItRight=false;

        //Generate the random number
        //generates from 0 - bound-1. Add 1 to each to go from 1-bound. 
        Random rand = new Random();
        randomNumber = rand.nextInt(51)+1;

        Scanner scan = new Scanner(System.in);

        System.out.print("Do you want to play a game?");
        System.out.println("Enter a number between 1 and 50: ");

        do{
            
            playerGuess = scan.nextInt();

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

        }while(gotItRight == false);

        String winningMessage="";
        winningMessage = "Great Job! The winning number was " + randomNumber + " and you took "
    }

}
