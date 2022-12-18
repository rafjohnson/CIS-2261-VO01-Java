package Final.PasswordVerifier;

import java.io.FileWriter;
import java.io.IOException;
import java.io.PrintWriter;
import java.util.Scanner;
import java.util.regex.Matcher;
import java.util.regex.Pattern;


/*Password Verifier 
Imagine you are developing a software package for an online shopping site that requires
users to enter their own username and password.
Your software requires that users’ passwords meet the following criteria:
The password should be at least six characters long.
The password should contain at least one uppercase and at least one lowercase letter.
The password should have at least one digit.
Write a program that verifies that a password meets the stated criteria. If it does not it must promp
the user to try again and keep track of the number of attempts, after 3 attempts the program terminates
Display a message indicating the password is valid or not.
The program must write the username and password to a text file. */
public class Program {
    public static void main(String[] args) throws IOException
    {

        Scanner scan = new Scanner(System.in);
        FileWriter fw = new FileWriter("password.txt",false); //this should add a file in the same directory
        //but how I'm running in VSCode, it is outputting it at my workspace directory rather than in the same directory as the 
        //java file.
          
        PrintWriter writer = new PrintWriter(fw);
        

        //get the username. No checking on it.
        String username;
        System.out.print("Username: ");
        username = scan.next();

        //get password: here we need to check validity. 
        Boolean validPW = false;
        String password="";
        int attempts = 0;
       
            while(!validPW && attempts<3)
            {
                
                do{
                    System.out.printf("Password (Attempts remaining: %d) : ",3-attempts);
                    while(!scan.hasNext())
                    {
                        System.out.println("You must enter a password. ");
                        attempts++;
                        scan.next();
                    }
                    password = scan.next();
                    if(!matchesRequirements(password))
                    {
                        attempts++;

                        if(attempts<3)
                        {
                            System.out.println("Your password must be 6 or more characters, have 1 upper, 1 lower, and 1 numeric character. ");
                            
                        }
                    }
                    
                    else{
                        validPW = true;
                    }
                }while(!matchesRequirements(password)&& attempts<3);
          
        }
        
        if(attempts>=3)
        {
            System.out.println("Too may password attempts.");
        }
        else{
            //write info to screen and to file.
            System.out.printf("Username and Password accepted. \nUsername: %s  Password: %s",username,password);
            writer.printf("Username: %s\nPassword: %s\n",username,password);
        }

        scan.close();
        writer.close();
    }

    private static Boolean matchesRequirements(String pPassword)
    {
        /*Method which checks requirements:
         * At least 6 characters
         * 1 upper and 1 lowercase char
         * 1 number
         * 
         * Input: password to be checked
         * Process: determine validity
         * Output: boolean whether it passes. 
         */

         Boolean passes=false;

         //check for length
         int PWLength = pPassword.length();

         //check for an upperCase char - using regex.  https://stackoverflow.com/a/7378472/7858537
         Pattern upperCasePattern = Pattern.compile("[A-Z]");
         Matcher upperCaseMatcher = upperCasePattern.matcher(pPassword);
         long upperCaseCount = upperCaseMatcher.results().count();

         //check for lowercase chars
         Pattern lowerCasePattern = Pattern.compile("[a-z]");
         Matcher lowerCaseMatcher = lowerCasePattern.matcher(pPassword);
         long lowerCaseCount = lowerCaseMatcher.results().count();

         //check for numbers
         Pattern numberPattern = Pattern.compile("[0-9]");
         Matcher numbMatcher = numberPattern.matcher(pPassword);
         long numberCount = numbMatcher.results().count();

         //validate info
         if(PWLength>=6 && upperCaseCount>0 && lowerCaseCount>0 && numberCount>0)
         {
            passes=true;
         }
         
         return passes;

    }
}
