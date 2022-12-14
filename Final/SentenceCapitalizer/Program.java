package Final.SentenceCapitalizer;

import java.util.Scanner;

/*
 * Sentence Capitalizer 
Write a method that accepts a String object as an argument and returns a copy of the
string with the first character of each sentence capitalized. For instance, if the argument is
“hello. my name is Joe. what is your name?” the method should return the string, “Hello.
My name is Joe. What is your name?” Demonstrate the method in a program that asks
the user to input a string and then passes it to the method. The modified string should be
displayed on the screen.
 */
public class Program {
    public static void main(String[] args)
    {
        String input = "";
        Scanner scan = new Scanner(System.in);

        System.out.print("Enter a sentence or three to be capitalized:");
        input = scan.nextLine();

        String output = capitalizeString(input);

        System.out.printf("%s",output);
        scan.close();
    }

    public static String capitalizeString(String pSentence)
    {
        
        /*Input: a string to be capitalized. 
        Method: break pSentence into a Char array. Create a new chararray to copy into. Loop through the characters:
         * 1) First character is always capitalized.
         * 2) Continue traversing the array until a sentence ending punctuation mark is found (.?!), copying characters to the same index in the new array. 
         * 3) When the punctuation mark is found, copy it, and keep copying to the next non space, non-punctuation mark character using Character.isAlphabetic.  
         * 4) When the next letter is found, capitalize it. 
         * 5) Keep looping until end of string. 
         * The build the chararray into a new string an output it. 
         * 
         * Output: a new string, properly capitalized. 
         */

         char[] letters = pSentence.toCharArray();
         char[] capitalized = new char[letters.length];

         //copy the first char as capital.
         capitalized[0]=Character.toUpperCase(letters[0]);

         boolean isPunctuationMode = false;
         //start at 1, and go to the end. 
         for(int i=1;i<letters.length;i++)
         {            
            
            //determine if it's punctuation. 
            if(letters[i]=='.'||letters[i]=='?'||letters[i]=='!')
            {
                isPunctuationMode=true;
            }

            if(!isPunctuationMode)
            {
                //if we're not in punctuation mode, just copy to capitalized.
                capitalized[i]=letters[i];
            }
            else
            {
                //in punctuation mode

                //if it's a space, just copy
                if(letters[i]==' ')
                {
                    //just copy
                    capitalized[i]=letters[i];
                }
                else{
                    //check to make sure this isn't the capital letter
                    if(!(letters[i]=='.'||letters[i]=='?'||letters[i]=='!'))
                    {
                        //capitalize, copy, and reset isPunctuationMode
                        capitalized[i]=Character.toUpperCase(letters[i]);
                        isPunctuationMode=false;
                    }
                    else
                    {
                        //it's punctuation, just copy
                        capitalized[i]=letters[i];
                    }
                }
            } 
            //go to next char. 
         }

         //create a new string to return. 
         String capString = new String(capitalized);
         return capString;

    }
}
