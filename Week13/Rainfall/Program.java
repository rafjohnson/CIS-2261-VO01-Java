package Week13.Rainfall;

import java.util.Scanner;

public class Program {
    //Program to demonstrate the Rainfall class

    public static void main(String[] args)
    {
        //create two objects, one for the "debug" constructor (where the array is already initialized)
        //another for the more interactive version. 

        //automated/testing version: 
        Double[] testValues = {2.1, 3.2, 2.3, 4.5, 6.5, 4.0, 1.1, 1.0, 0.0, 0.1, 2.2,3.2};
        //create class object
        Rainfall testRainfall = new Rainfall(testValues);
        //test getters
        System.out.printf("getRainfallByMonth (month 4- May): %.2f \n",testRainfall.getRainfallByMonth(4)); //should be 6.5
        System.out.printf("getMonth: %s\n",testRainfall.getMonthNamebyMonthNumber(4)); //should be "May"

        //get computed values
        System.out.printf("Total Rainfall: %.2f\n",testRainfall.getTotalRainfall());
        System.out.printf("Average Rainfall: %.2f\n",testRainfall.getAverageRainfall());
        System.out.printf("Month with most rain: %s\n",testRainfall.getMonthNamebyMonthNumber(testRainfall.getMonthWithMostRain()));
        System.out.printf("Month with least rain: %s\n", testRainfall.getMonthNamebyMonthNumber(testRainfall.getMonthWithLeastRain()));
        


        //Interactive version!
        //Getting values from the user. :: Input Validation: Do not accept negative numbers for monthly rainfall figures.
        
        Rainfall inputRainfall = new Rainfall();
        Scanner scan = new Scanner(System.in);

        for(int i=0;i<12;i++)
            {
                //values must be positive
                boolean validRainfall = false;
                Double rainfall = -1.0;
                while(!validRainfall)
                {
                    do{
                        System.out.printf("Rainfall amount for %s: \n",inputRainfall.getMonthNamebyMonthNumber(i));
                        while(!scan.hasNextDouble())
                        {
                            System.out.println("You must enter a decimal number.");
                            scan.next();
                        }
                        rainfall = scan.nextDouble();

                        /*Comparing Doubles is a pain due to float rounding errors
                         (negative if lessthan, 0 if equal, positive is greaterthan) */
                        if(rainfall.compareTo(0.0)<0)
                        {
                            System.out.println("You must enter a positive rainfall amount.");
                        }
                        else{
                            validRainfall = true;
                        }

                    }while(rainfall.compareTo(0.0)<0);
                }
                inputRainfall.setValueByMonth(rainfall, i);
            }

        //now that we have our values, do outputs:
        //display values: 
        for (int i = 0; i < 12; i++) {
        System.out.printf("| %s ", centerText(inputRainfall.getMonthNamebyMonthNumber(i),11)); //september is the longest with 9, 11 gives a space on each side .
        }
        System.out.print("\n");
        for (int i = 0; i < 12; i++) {
                System.out.printf("| %s ", centerText(inputRainfall.getRainfallByMonth(i).toString(),11));
        }
        System.out.print("\n");

        //get computed values
        System.out.printf("Total Rainfall: %.2f\n",inputRainfall.getTotalRainfall());
        System.out.printf("Average Rainfall: %.2f\n",inputRainfall.getAverageRainfall());
        System.out.printf("Month with most rain: %s\n",inputRainfall.getMonthNamebyMonthNumber(inputRainfall.getMonthWithMostRain()));
        System.out.printf("Month with least rain: %s\n", inputRainfall.getMonthNamebyMonthNumber(inputRainfall.getMonthWithLeastRain()));

        scan.close();
    }


    public static String centerText(String pText,int length)
    {
        //yes, i'm resuing from last week. 
        
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
