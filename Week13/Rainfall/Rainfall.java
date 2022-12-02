package Week13.Rainfall;
/*Write a RainFall class that stores the total rainfall for each of 12 months into an array of
doubles. The program should have methods that return the following:

total rainfall for the year
the average monthly rainfall
the month with the most rain
the month with the least rain
Demonstrate the class in a complete program.
Input Validation: Do not accept negative numbers for monthly rainfall figures. */
public class Rainfall {
    
    //fields
    //static months - month names
    //double[12] for months. 
    private final String[] MONTHS= {"January","February","March","April","May","June","July","August","September","October","November","December"};
    private Double[] rainfallAmounts = new Double[12];

    //constructor
    //one for no array -individual values will be added via method - Default constructor
    public Rainfall()
    {
        //don't do anything yet. 
    }
    //one for a specified array of double[12] - helpful for testing
    public Rainfall(Double[] pRainfall)
    {
        //Input: a filled value of rainfall array
        //Process: copy pRainfall to rainfallAmounts
        //If there are more than 12 elements in pRainfall, only the first 12 will be stored
        //output: n/a

        for(int i = 0;i<rainfallAmounts.length;i++)
        {
            rainfallAmounts[i]=pRainfall[i];
        }
        

    }

    //getters
    //1) get value by month - double
    //2) get Month name by value - String


    Double getRainfallByMonth(Integer pMonth)
    {
        /*Input: integer month (0-indexed)
        * Process: n/a
        * Output: rainfall amount
        */

        return rainfallAmounts[pMonth];
    }

    String getMonthNamebyMonthNumber(Integer pMonth)
    {
        /*
        * Input: integer month (0-indexed)
        * Process: n/a
        * Output: month name
        */

        return MONTHS[pMonth];
    }





    //setters
    //1) set value by month - sets a value in a specific place in the array 
    public void setValueByMonth(Double pValue, int pMonth)
    {
        /*
        * Input: pValue: Double - value to store
        *        pMonth: int - 0-indexed month
        * Process: store value in indicated index. 
        * Output: n/a
        */

        rainfallAmounts[pMonth] = pValue;
    }

    //methods
    //total rainfal
    public Double getTotalRainfall()
    {
        /*Input: n/a
        * Process: loop through values in rainfallAmounts, and add the values to a collector
        * Output: collector. 
        */

        Double totalRainfall = 0.0;

        for(int i=0;i<rainfallAmounts.length;i++)
        {
            totalRainfall += rainfallAmounts[i];
        }

        return totalRainfall;
    }

    //average rainfall
    public Double getAverageRainfall()
    {
        /*Input: n/a
        * Process: get the total rainfall through the getTotalRainfall, divide by the length of rainfallAmounts
        * (which should be 12)
        * Output: average rainfall
        */

        Double average;
        Double total = getTotalRainfall();
        average = total/rainfallAmounts.length;

        return average;
    }

    //most rain
    public Integer getMonthWithMostRain()
    {
        /*Input: n/a
        * Process: keep track of the max month. Loop through the rainfall amounts, and if it's bigger, replace
        * the max month. 
        * Output: 0-based index of the max month. If more than 1 are the same and max, it'll return the first month. 
        */
        Integer maxMonth=0; //don't need to keep track of the max value, we can just look up to compare. 

        for(int i=0; i<rainfallAmounts.length;i++)
        {
            if(rainfallAmounts[i]>rainfallAmounts[maxMonth])
            {
                maxMonth = i;
            }
        }

        return maxMonth;

    }

    //least rain
    public Integer getMonthWithLeastRain()
    {
        /*Essentially doing the same as max, but doing less than.  */
        /*Input: n/a
        * Process: keep track of the min month. Loop through the rainfall amounts, and if it's less, replace
        * the min month. 
        * Output: 0-based index of the max month. If more than 1 are the minimum value, returns the first month. 
        */
        Integer minMonth=0; //don't need to keep track of the max value, we can just look up to compare. 

        for(int i=0; i<rainfallAmounts.length;i++)
        {
            if(rainfallAmounts[i]<rainfallAmounts[minMonth])
            {
                minMonth = i;
            }
        }

        return minMonth; 
    }
}
