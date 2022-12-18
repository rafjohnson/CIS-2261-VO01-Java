package Final.PhoneNumberTranslator;

import java.util.Scanner;
import java.util.regex.Pattern;


/*Alphabetic Telephone Number Translator 
Many companies use telephone numbers such as 555-GET-FOOD so the number is easier
for their customers to remember. On a standard telephone, the alphabetic letters are
mapped to numbers in the following fashion:
A, B, and C 5 2
D, E, and F 5 3
G, H, and I 5 4
J, K, and L 5 5
M, N, and O 5 6
P, Q, R, and S 5 7
T, U, and V 5 8
W, X, Y, and Z 5 9
Write an application that asks the user to enter a 10-character telephone number in
the format 123-456-7890. The application should display the telephone number
with any alphabetic characters that appeared in the original translated to their numeric
equivalent. For example, if the user enters 555-GET-FOOD, the application should display
555-438-3663. */
public class Program {
    public static void main(String[] args)
    {
        //get user input
        Scanner scan = new Scanner(System.in);

        boolean validPN = false;
        String inputPN="";
        while(!validPN)
        {
            do {
                System.out.print("Enter a valid phone number. Numbers must be in the format xxx-xxx-xxxx where x is either a letter or number: ");
                while(!scan.hasNextLine())
                {
                    System.out.println("You must enter a phone number.");
                    scan.next();
                }
                inputPN=scan.nextLine();
                if(!isProperFormat(inputPN))
                {
                    System.out.println("Your phone number must be in the format xxx-xxx-xxxx.");
                }
                else{
                    validPN=true;
                }

            }while(!validPN);

            //have a phone number, convert it.
            String newPN = convertPhoneNumber(inputPN);
            System.out.printf("The converted number is: %s",newPN);
        }
        

        scan.close();

    }

    public static String convertPhoneNumber(String pPhoneNumber)
    {
        /*Method to convert a phone number from alpha to numeric 
         * Input: a phone number string, already validated.
         * Process: Convert to char array. Make an output char array. Loop through. If an alpha is found, use a switch statement to 
         * replace it. Convert output char array back to string. 
         * Output: converted string. 
        */
        
        char[] inputPhoneNumber = pPhoneNumber.toCharArray();
        char[] outputPhoneNumber = new char[inputPhoneNumber.length];

        //loop through each value in inputPhoneNumber
        for (int i = 0; i < inputPhoneNumber.length; i++) {

            //get the value. Since we're going to use it a bunch of times, it's clearer to read if it is it's own variable. 
            char value = Character.toUpperCase(inputPhoneNumber[i]);
            switch (value) {
                case 'A':
                case 'B':
                case 'C':
                    //a b or c = 2
                    outputPhoneNumber[i]='2';
                    break;
                case 'D':
                case 'E':
                case 'F':
                    outputPhoneNumber[i]='3';
                    break;
                case 'G':
                case 'H':
                case 'I':
                    outputPhoneNumber[i]='4';
                    break;
                case 'J':
                case 'K':
                case 'L':
                    outputPhoneNumber[i]='5';
                    break;
                case 'M':
                case 'N':
                case 'O':
                    outputPhoneNumber[i]='6';
                    break;
                case 'P':
                case 'Q':
                case 'R':
                case 'S':
                    outputPhoneNumber[i]='7';
                    break;
                case 'T':
                case 'U':
                case 'V':
                    outputPhoneNumber[i]='8';
                    break;
                case 'W':
                case 'X':
                case 'Y':
                case 'Z':
                    outputPhoneNumber[i]='9';
                    break;
            
                default:
                    outputPhoneNumber[i]=value;
                    break;
            }

            
        }//end for

        //convert the char array to a string. 
        String outString = new String(outputPhoneNumber);
        return outString;
     }


    public static boolean isProperFormat(String pPhoneNumber)
    {
        /*Method to validate phone number. Phone number must be \S{3}-\S{3}-\S{4}. 3 chars - 3 chars - 4 chars. No whitepsace. All others will fail. */
        /*Input: String to validate
         * Process: Use regex to validate.
         * Output: boolean if it's a valid phone number, . 
         */

        boolean matches = false;
         Pattern pattern = Pattern.compile("\\S{3}-\\S{3}-\\S{4}");
         if(pattern.matcher(pPhoneNumber).matches())
         {
            matches=true;
         }

         return matches;

    }
}
