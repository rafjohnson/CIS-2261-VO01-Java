package Final.WordCounter;

import java.util.Scanner;

/*
 * Word Counter 
Write a program with a method that accepts a String object as an argument and returns the number of
words it contains. For instance, if the argument is “Four score and seven years ago” the
method should return the number 6. Demonstrate the method in a program that asks the
user to input a string and then passes it to the method. The number of words in the string
should be displayed on the screen.
 */
public class Program {
    public static void main (String[] args)
    {
        /* Debugging/Testing
        String inputMultipleSpaces = "Four score and     seven years ago";
        String inputNoSpaces = "Supercalifragilistiexpialidocious";
        String inputSingleSpaces = "This line of text has more than 6 words";
        Integer multipleSpacesLength = wordCounter(inputMultipleSpaces);
        Integer noSpacesLength = wordCounter(inputNoSpaces);
        Integer singleSpacesLength = wordCounter(inputSingleSpaces);
        System.out.printf("Multiple Spaces: %d \n No spaces: %d\n Single Spaces: %d\n",multipleSpacesLength,noSpacesLength,singleSpacesLength);
         */
        Scanner scan = new Scanner(System.in);
        String userInput = "";
        System.out.println("Please enter a sentence to count the number of words:");
        userInput=scan.nextLine();
        Integer userCount = wordCounter(userInput);
        System.out.printf("The string has %d words.",userCount);

        scan.close();
    }

    public static Integer wordCounter(String pInput)
    {
        /*method to count number of words in a string. 
         * Input: a string to count
         * Process: uses regex to split the array on any number of spaces. 
         * Output: the count of words in the string. 
         */
        String[] inputArray = pInput.split("\s+");
        return inputArray.length;
    }
}
