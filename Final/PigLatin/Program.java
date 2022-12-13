package Final.PigLatin;

import java.util.ArrayList;
import java.util.Scanner;

import Week6.story;

/*Write a program that reads a sentence as input and converts each word to “Pig Latin”. In
one version of Pig Latin you convert a word by removing the first letter, placing that letter
at the end of the word, and then appending “ay” to the word. Here is an example:
English: I SLEPT MOST OF THE NIGHT
Pig Latin: IAY LEPTSAY OSTMAY FOAY HETAY IGHTNAY */
public class Program {
    public static void main(String[] args)
    {
        /* Input: user input for the sentence. 
            Process: Approach I'm going to take here is to split the sentene 
         * on spaces. This will give me an array of words (Strings).
         * I'll loop over the words, and split those to arrays of chars. 
         * Create a new array of length of the word+2 for "ay", and then get values 1-length, 
         * put at 0- length-1, add word[0], and "ay".
         * Then, recombine sentence in another for loop, elements separated by spaces
         * Output: Pig latin-ized sentence, all in upper case. 
         */

        Scanner scan = new Scanner(System.in);
        String originalSentence;

        System.out.print("Enter a sentence to turn into pig latin:");
        originalSentence = scan.nextLine();

        //split the sentence on spaces
        String[] words = originalSentence.split("\s+");

        //new array list to hold new sentence. 
       ArrayList<String> newWords = new ArrayList<String>();

        for (String word : words) {
            //split the word into chars
            char[] letters = word.toCharArray();
            
            //build a new array and pick peices to put in. Make everything UpperCase. 
            char[] newLetters = new char[letters.length+2];

            //1-end
            for(int i=1;i<letters.length;i++)
            {
                newLetters[i-1]= Character.toUpperCase(letters[i]);
            }

            //first letter at the almost end of newletters
            newLetters[(letters.length)-1] = Character.toUpperCase(letters[0]);

            //add a,y
            newLetters[(newLetters.length)-2] = 'A';
            newLetters[(newLetters.length)-1] = 'Y';

            //add new word to newWords array.
            String newWord = new String(newLetters);
            newWords.add(newWord);
        }
        
        //now create new string to hold new sentence. Use stringbuilder.
        StringBuilder sb = new StringBuilder();
        for (String word : newWords) {
            sb.append(word + " ");
        }

        //turn StringBuilder to a string
        String newSentence = sb.toString();

        //remove the final space added via StringBuilder
        newSentence = newSentence.substring(0,newSentence.length()-1);

        //write new sentence to output
        System.out.printf("Pig Latin: %s",newSentence);

        scan.close();
    }
}
