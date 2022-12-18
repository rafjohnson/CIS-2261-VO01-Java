package Final.VowelsAndConsonants;

import java.util.Scanner;

/*
 * Demonstrate the class in a program
that performs the following steps:
1. The user is asked to enter a string.
2. The program displays the following menu:
     a. Count the number of vowels in the string
     b. Count the number of consonants in the string
     c. Count both the vowels and consonants in the string
     d. Enter another string
     e. Exit the program
3. The program performs the operation selected by the user and repeats until the user
selects e, to exit the program.
 */
public class Program {
    public static void main(String[] args)
    {
        Scanner scan = new Scanner(System.in);
        String userString="";
        char userChoice='\0';
        boolean userChoiceValid = false;

        String menu = "a. Count the number of vowels in the string\n"
                     +"b. Count the number of consonants in the string\n"
                     +"c. Count both the vowels and consonants in the string\n"
                     +"d. Enter another string\n"
                     +"e. Exit the program\n\n";
        
        System.out.println("Please enter a string to analyze: \n");
        userString = scan.nextLine();

        //create object
        Words userWords = new Words(userString);
        
        //display menu. Input must be a-d. If it's e, exit. 
        while(!userChoiceValid && userChoice!='E')
        {
            do{
                System.out.print(menu);
                System.out.println("Enter your choice: ");
                
                while(!scan.hasNextLine())
                {
                    System.out.println("You must enter a character.");
                    scan.nextLine();
                }
                userChoice = scan.nextLine().charAt(0);
                userChoice = Character.toUpperCase(userChoice);
                if(!(userChoice=='A'||userChoice=='B'||userChoice=='C'||userChoice=='D'||userChoice=='E'))
                {
                    System.out.println("Your answer must be A, B, C, D, or E.\n");
                    
                }
                else{
                    userChoiceValid=true;
                }
                
            }while(!(userChoice=='A'||userChoice=='B'||userChoice=='C'||userChoice=='D'||userChoice=='E'));//check for any valid choice

            //now do something with the user choice. 
            //A: number of vowels
            //B: number of consonants
            //C: vowels and consonants
            //D: replace string
            //E: quit - do nothing, let while loop take us out. 

            switch (userChoice) {
                case 'A':
                    System.out.printf("There are %d vowels in the string. \n\n",userWords.countVowels());
                    //reset user choice and valid
                    userChoice = '\0';
                    userChoiceValid=false;
                    break;
                case 'B':
                    System.out.printf("There are %d consonants in the string.\n\n",userWords.countConsonants());
                    //reset user choice and valid
                    userChoice = '\0';
                    userChoiceValid=false;
                    break; 
                case 'C':
                    System.out.printf("There are %d vowels and consonants in the string.\n\n",userWords.countVowels()+userWords.countConsonants());
                    //reset user choice and valid
                    userChoice = '\0';
                    userChoiceValid=false;
                    break; 
                case 'D':
                    System.out.println("Enter a new string: ");
                    userString = scan.nextLine();
                    userWords.setWords(userString);
                    //reset user choice and valid
                    userChoice = '\0';
                    userChoiceValid=false;
                    break;
                case 'E':
                    //don't do anything here. leave choice valid true, and choice as E. 
                    System.out.println("Exiting...");
                    break;
                default:
                    break;

                
            }
            
        }

        scan.close();
        

    }
}
