package Week10;

import java.util.Scanner;

public class AverageRainfall {
    /*
     * Write a program that uses nested loops to collect data and calculate the
     * average rainfall
     * over a period of years.
     * 
     * The program should first ask for the number of years. The outer loop
     * will iterate once for each year.
     * 
     * The inner loop will iterate twelve times, once for each month.
     * 
     * Each iteration of the inner loop will ask the user for the inches of rainfall
     * for that month.
     * After all iterations, the program should display the number of months, the
     * total inches of
     * rainfall, and the average rainfall per month for the entire period.
     * Input Validation: Do not accept a number less than 1 for the number of years.
     * Do not
     * accept negative numbers for the monthly rainfall.
     * 
     * Input: Number of years, rainfall for each month
     * Process: int years, decimal rainfall.
     * Three arrays: 1 single dimensioned array for the months, a 2d (12x #of years)
     * array to keep track of rainfall. take input from user to populate 2d array. (A database table would
     * be better here, but this'll have to work).
     * During each monthly input: increment number of months, populate total inches of rainfall per month array, and populate rainfall
     * Table.
     * Output: Number of months, total inches of rainfall, and average rainfall per month
     */

    public static void main(String[] args) {
        // month array (table)
        String[] months = new String[] { "January", "February", "March", "April", "May", "June", "July",
                "August", "September", "October", "November", "December" };

        double[] rainfallMontlyTotals = new double[12];
        Integer totalMonths = 0;
        double totalRainfall = 0;
        
        Integer inputYears;

        Scanner scan = new Scanner(System.in);

        // get number of years
        System.out.print("Input number of years: ");
        inputYears = scan.nextInt();

        // declare/init rainfall array
        double[][] rainfall = new double[inputYears][12];

        // loop years
        for (int year = 0; year < inputYears; year++) 
        {
            // loop months
            for (int month = 0; month < 12; month++) 
            {
                // get user input, validating for positive
                boolean validRainfall=false; 
                double inputRainfall=0.0;
                while(!validRainfall)
                {   
                    do 
                    {
                        System.out.printf("Enter the rainfall total for %s, year %s: ", months[month],year+1);
                        while(!scan.hasNextDouble())
                        {
                            System.out.printf("You must enter a valid number: ");
                            scan.next();
                        }
                        inputRainfall = scan.nextDouble();
                        if(inputRainfall<0)
                        {
                            System.out.println("Negative rainfall is impossible. Enter a valid number");
                            validRainfall = false;
                        }
                        else
                        {
                            validRainfall = true;
                        }
                    }while(inputRainfall<=0);
                }         
                

                // save to rainfall table
                rainfall[year][month] = inputRainfall;

                // add to the total rainfall
                totalRainfall = totalRainfall + inputRainfall;

                // add to the total months
                totalMonths++;

                // add to the totals table
                rainfallMontlyTotals[month] = rainfallMontlyTotals[month] + inputRainfall;
            }
        }

        // debug: display whole average table
        // print row header (months)
        for (

                int i = 0; i < 12; i++) {
            System.out.printf("| %s ", months[i]);
        }
        // linesplit
        System.out.printf("\n ------------------------- \n");

        // print chart of rainfall amounts
        for (int i = 0; i < inputYears; i++) 
        {
            for (int j = 0; j < 12; j++) 
            {
                System.out.printf("| %.2f ", rainfall[i][j]);
            }
            System.out.print("\n");
        }

        // monthly totals
        System.out.print("\n Monthly totals \n ---------------------- \n");
        for (int month = 0; month < 12; month++) 
        {

            // print
            System.out.printf("%s: %.2f \n", months[month], rainfallMontlyTotals[month]);
        }

        System.out.print("\n Monthly averages \n ------------------------ \n");
        // print monthly averages:
        for (int month = 0; month < 12; month++) 
        {
            double average = rainfallMontlyTotals[month] / inputYears;

            // print
            System.out.printf("%s: %.2f \n", months[month], average);
        }

        System.out.printf("Total Months = %d \n", inputYears * 12);

        System.out.printf("Total Rainfall: %.2f \n", totalRainfall);

        scan.close();
    }

}
