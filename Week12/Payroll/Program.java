package Week12.Payroll;

import java.text.DecimalFormat;
import java.util.Scanner;

public class Program {
    public static void main(String[] args)
    {
        //create the payroll class. No constructor, just the default one. 
        Payroll payroll = new Payroll();
        Scanner scan = new Scanner(System.in);

        //ask user to input values. Loop through the payroll object and populate the 
        //rates and hours asking the user each time. 
        System.out.println("Enter the hours worked and payrate for the following employees: ");
        for(int i = 0; i<payroll.length();i++)
        {
            Boolean validHours = false;
            Integer hoursWorked = 0;
            Boolean validPayRate = false;
            Double payRate = 0.0;

            System.out.printf("%d:\n",payroll.getEmployeeIDbyIndex(i));

            //hours worked
           
            while(!validHours)
            {
                do
                {
                    System.out.printf("Hours worked (Must be zero or more hours): ");
                    while(!scan.hasNextInt())
                    {
                        System.out.println("You must enter a valid amount of hours, zero or greater.");
                        scan.next();
                    }
                    hoursWorked = scan.nextInt();
                    if(hoursWorked<0)
                    {
                        System.out.println("You must enter a valid amount of hours, zero or greater.");
                    }
                    else
                    {
                        validHours=true;
                    }
                    
                }while(hoursWorked<=0);
            }

            payroll.setHours(hoursWorked, i);

            //payRate
            while(!validPayRate)
            {
                do
                {
                    System.out.printf("Pay rate (must be more than 6.00): ");
                    while(!scan.hasNextDouble())
                    {
                        System.out.println("You must enter a valid pay rate, greater than 6.00.");
                        scan.next();
                    }
                    payRate = scan.nextDouble();
                    if(payRate.compareTo(6.0)<0) //doubles don't otherwise compare right. 6.0!=6.0000000 etc.
                    {
                        System.out.println("You must enter a valid pay rate, greater than 6.00.");
                    }
                    else
                    {
                        validPayRate=true;
                    }
                    
                }while(payRate.compareTo(6.0)<0);
            }
            payroll.setPayRate(payRate, i);




        }
        //close scanner
        scan.close();

        //output values
        /*
         * Employee ID | Hours worked | PayRate | Gross Pay   EID: 12 Hours: 14 Pay: 11 Gross: 11
         * --------------------------------------------------- 50 wide
         *            
         */

         System.out.println("Employee ID | Hours worked | PayRate | Gross Pay   ");
         System.out.println("---------------------------------------------------");
         for(int i=0;i<payroll.length();i++)
         {
            DecimalFormat twoPlaces = new DecimalFormat("#.00");
            Integer eeID = payroll.getEmployeeIDbyIndex(i);
            Integer hours = payroll.getHours(i);
            Double payRate = payroll.getPayRate(i);
            Double grossPay = payroll.getGrossPayByEmployeeID(eeID);

            System.out.printf("%s|%s|%s|%s\n",centerText(eeID.toString(),12)
                                                    ,centerText(hours.toString(), 14)
                                                    ,centerText(twoPlaces.format(payRate), 9)
                                                    ,centerText(twoPlaces.format(grossPay), 11));
            
         }



    }

    public static String centerText(String pText,int length)
    {
        
        
        //Input: text (string) and a length to fit in. 
        //Process: pad either side (with slightly to the left if uneven) with spaces
        //output: formatted text. If text is longer than length, return just the string without formatting. 

        
        int stringLength = pText.length();
        int totalSpaces = length-stringLength;
        if(totalSpaces>0)
        {
            int charCount = 0;
            char[] charOutput = new char[length];

            //add leading spaces
            for(int i = 0;i<totalSpaces/2;i++)
            {
                charOutput[i]=' ';
                charCount++;
            }

            //add string
            for(int i = 0;i<pText.length();i++)
            {
                
                charOutput[charCount]=pText.charAt(i);
            
                charCount++;
            }

            //add trailing spaces
            for(int i = charCount;i<length;i++)
            {
                charOutput[i]=' ';
            }
            String output = new String(charOutput);
            return output;
        }
        else
        return pText;


        
    }
}
