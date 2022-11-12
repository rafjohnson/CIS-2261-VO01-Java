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
     * array to keep track of
     * rainfall. take input from user to populate 2d array. (A database table would
     * be better here, but this'll
     * have to work).
     * During each monthly input: increment number of months, total inches of
     * rainfall, and populate rainfall
     * array.
     * 
     * Output: Number of months, total inches of rainfall, and average rainfall per
     * month
     */

    public static void main (String[] args)
     {
        //month array (table) 
        String[] months = new String[]{ "January", "February","March","April","May","June","July",
                                        "August","September","October","November","December"};
        
        double[] rainfallMontlyTotals = new double[12]; 
        Integer totalMonths=0;
        double totalRainfall=0;
        double inputRainfall;
        Integer inputYears;

        boolean debug = false;

        Scanner scan = new Scanner(System.in);

        if(!debug)
        {
        //get number of years
        System.out.print("Input number of years: ");
        inputYears = scan.nextInt();
        }
        else{
            inputYears=4;
        }

        //declare/init rainfall array
        double[][] rainfall = new double[inputYears][12];

        if(!debug)
        {
            //loop years
            for(int year=0; year<inputYears;year++)
            {
                //loop months
                for(int month=0; month<12;month++)
                {
                    //get user input
                    System.out.printf("Enter the rainfall for %s year %d: ",months[month],year+1);
                    inputRainfall = scan.nextDouble();

                    //save to rainfall table
                    rainfall[year][month]=inputRainfall;

                    //add to the total rainfall
                    totalRainfall = totalRainfall+inputRainfall;

                    //add to the total months
                    totalMonths++;

                    //add to the totals table
                    rainfallMontlyTotals[month]=rainfallMontlyTotals[month]+inputRainfall;
                }
            }
        }
        else{
            //test build table
            rainfall[0][0] = 7.38;
            rainfall[0][1] = 0.69;
            rainfall[0][2] = 0.72;
            rainfall[0][3] = 4.85;
            rainfall[0][4] = 6.9;
            rainfall[0][5] = 1.2;
            rainfall[0][6] = 7.15;
            rainfall[0][7] = 0.34;
            rainfall[0][8] = 0.47;
            rainfall[0][9] = 2.76;
            rainfall[0][10] = 9.48;
            rainfall[0][11] = 9.99;
            rainfall[1][0] = 6.98;
            rainfall[1][1] = 6.64;
            rainfall[1][2] = 6.83;
            rainfall[1][3] = 0.74;
            rainfall[1][4] = 6.44;
            rainfall[1][5] = 2.09;
            rainfall[1][6] = 9.19;
            rainfall[1][7] = 4.36;
            rainfall[1][8] = 6.15;
            rainfall[1][9] = 5.15;
            rainfall[1][10] = 2.18;
            rainfall[1][11] = 1.61;
            rainfall[2][0] = 1.32;
            rainfall[2][1] = 0.85;
            rainfall[2][2] = 3.37;
            rainfall[2][3] = 2.43;
            rainfall[2][4] = 8.23;
            rainfall[2][5] = 7.51;
            rainfall[2][6] = 2.51;
            rainfall[2][7] = 4.92;
            rainfall[2][8] = 4.82;
            rainfall[2][9] = 6.56;
            rainfall[2][10] = 3.05;
            rainfall[2][11] = 7.66;
            rainfall[3][0] = 2.48;
            rainfall[3][1] = 9.26;
            rainfall[3][2] = 5.08;
            rainfall[3][3] = 0.19;
            rainfall[3][4] = 5.2;
            rainfall[3][5] = 6.93;
            rainfall[3][6] = 1.61;
            rainfall[3][7] = 0.33;
            rainfall[3][8] = 3.97;
            rainfall[3][9] = 7.81;
            rainfall[3][10] = 9.35;
            rainfall[3][11] = 6.2;

            totalRainfall=221.93;
            rainfallMontlyTotals[0]=18.16;
            rainfallMontlyTotals[1]=17.44;
            rainfallMontlyTotals[2]=16;
            rainfallMontlyTotals[3]=8.21;
            rainfallMontlyTotals[4]=26.77;
            rainfallMontlyTotals[5]=17.73;
            rainfallMontlyTotals[6]=20.46;
            rainfallMontlyTotals[7]=9.95;
            rainfallMontlyTotals[8]=15.41;
            rainfallMontlyTotals[9]=22.28;
            rainfallMontlyTotals[10]=24.06;
            rainfallMontlyTotals[11]=25.46;
        }
        
        //debug: display whole average table
        //print row header (months)
        for(int i=0;i<12;i++)
        {            
            System.out.printf("| %s ",months[i]);
        }
        //linesplit
        System.out.printf("\n ------------------------- \n");


        //print chart of rainfall amounts
        for(int i=0;i<inputYears;i++)
        {
            for(int j=0;j<12;j++)
            {
                System.out.printf( "| %.2f ",rainfall[i][j]);   
            }
            System.out.print("\n");
        }

        //monthly totals
        System.out.print("\n Monthly totals \n ---------------------- \n");
        for(int month=0;month<12;month++)
        {           
           

            //print
            System.out.printf("%s: %.2f \n",months[month],rainfallMontlyTotals[month]);
        }

        System.out.print("\n Monthly averages \n ------------------------ \n");
        //print monthly averages:
        for(int month=0;month<12;month++)
        {           
            double average = rainfallMontlyTotals[month]/inputYears;

            //print
            System.out.printf("%s: %.2f \n",months[month],average);
        }

        System.out.printf("Total Months = %d \n",inputYears*12);

        System.out.printf("Total Rainfall: %.2f \n",totalRainfall);
                
        scan.close();
     }

}
