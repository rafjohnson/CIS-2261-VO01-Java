package Week9;

import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import java.util.Scanner;
import java.util.Map.Entry;
import java.util.function.IntPredicate;

import javax.print.attribute.standard.MediaSize.Other;

import Week6.story;

public class RomanNumerals {
    /*
     * Write a program that prompts the user to enter a number within the range of 1
     * through 10.
     * The program should display the Roman numeral version of that number. If the
     * number is
     * outside the range of 1–10, the program should display an error message.
     */

    /*
     * Input: User provided number as integer
     * Process: Check if between 10 and 1, calculate roman numeral
     * Output: display roman numeral or error message if outside 1-10.
     */

    public static void main(String[] args) {
        Integer input;
        Scanner scan = new Scanner(System.in);

        // get user input:
        System.out.println("Input a number between 1-10");
        input = scan.nextInt();

        // check value
        if (0 < input && input <= 10) {
            String output = calculateRomanNumeral(input);
            System.out.println("Output: " + output);
        } else {
            System.out.println("Your number was outside of 1-10");

        }

        // calculate roman numeral

        scan.close();
    }

    private static String calculateRomanNumeral(Integer pNumber) {
        // input: integer
        // process: divide integer by largest value (M=1000, CM= 900, D=500, CD=400,
        // C=100, XC=90, L=50, XL=40, X=10, IX=9, V=5, IV=4, I=1). Add that value to the
        // StringBuilder "quotient" times.
        // Remainder is the next iteration. Repeat until zero
        // output: string roman numeral

        Integer quotient = pNumber;
        Integer remainder = pNumber;
        StringBuilder output = new StringBuilder();

        // check for initial zero
        if (pNumber <= 0) {
            // roman numerals don't have zero, or negative numbers, normally I'd return an
            // exception here, but just return the passed in value;
            output.append(pNumber.toString());
        } else {
            // work down the list to zero
            while (remainder != 0) {
                if (remainder >= 1000) {
                    quotient = remainder / 1000;
                    remainder = remainder % 1000;
                    
                    for (int i = 0; i < quotient; i++) {
                        output.append("M");
                    }

                }

                else if (remainder >= 900) {
                    quotient = remainder / 900;
                    remainder = remainder % 900;
                    
                    for (int i = 0; i < quotient; i++) {
                        output.append("CM");
                    }
                } else if (remainder >= 500) {
                    quotient = remainder / 500;
                    remainder = remainder % 500;
                    
                    for (int i = 0; i < quotient; i++) {
                        output.append("D");
                    }
                } else if (remainder >= 400) {
                    quotient = remainder / 400;
                    remainder = remainder % 400;
                    
                    for (int i = 0; i < quotient; i++) {
                        output.append("CD");
                    }
                } else if (remainder >= 100) {
                    quotient = remainder / 100;
                    remainder = remainder % 100;
                    
                    for (int i = 0; i < quotient; i++) {
                        output.append("C");
                    }
                } else if (remainder >= 90) {
                    quotient = remainder / 90;
                    remainder = remainder % 90;
                    
                    for (int i = 0; i < quotient; i++) {
                        output.append("XC");
                    }
                } else if (remainder >= 50) {
                    quotient = remainder / 50;
                    remainder = remainder % 50;
                    
                    for (int i = 0; i < quotient; i++) {
                        output.append("L");
                    }
                } else if (remainder >= 40) {
                    quotient = remainder / 40;
                    remainder = remainder % 40;
                    
                    for (int i = 0; i < quotient; i++) {
                        output.append("XL");
                    }
                } else if (remainder >= 10) {
                    quotient = remainder / 10;
                    remainder = remainder % 10;
                    
                    for (int i = 0; i < quotient; i++) {
                        output.append("X");
                    }
                } else if (remainder >= 9) {
                    quotient = remainder / 9;
                    remainder = remainder % 9;
                    
                    for (int i = 0; i < quotient; i++) {
                        output.append("IX");
                    }
                } else if (remainder >= 5) {
                    quotient = remainder / 5;
                    remainder = remainder % 5;
                    
                    for (int i = 0; i < quotient; i++) {
                        output.append("V");
                    }
                } else if (remainder >= 4) {
                    quotient = remainder / 4;
                    remainder = remainder % 4;
                    
                    for (int i = 0; i < quotient; i++) {
                        output.append("IV");
                    }
                } else if (remainder >= 1) {
                    quotient = remainder / 1;
                    remainder = remainder % 1;
                    
                    for (int i = 0; i < quotient; i++) {
                        output.append("I");
                    }

                }
            }
        }

        return output.toString();
    }

}
