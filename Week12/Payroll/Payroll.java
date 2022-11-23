package Week12.Payroll;

public class Payroll {
    private Integer[] employeeId = {5658845,4520125,7895122,8777541,8451277,1302850,7580489};
    private Integer[] hours = new Integer[7];
    private Double[] payRate = new Double[7];

    //constructor - default constructor.

    //getters
    public Integer getEmployeeIDbyIndex(int index)
    {
        return employeeId[index];
    }

    public int getIndexByEmployeeID(Integer pEmployeeID)
    {
        //input: employee ID
        //process: loops through employeeID array looking for a match. If found, it sets the index to
        //the current index, and sets i to the max value. 
        //output: positive index if found. -1 if not found. 

        int index=-1;
        for(int i = 0;i<employeeId.length;i++)
        {
            if(employeeId[i] == pEmployeeID)
            {
                index = i;
                i = employeeId.length;
            }

        }
        return index;
    }

    public Integer getHours(int index)
    {
        return hours[index];
    }

    public Double getPayRate(int index)
    {
        return payRate[index];
    }

    public int length()
    {
        //length method to get the length of the employeeID array. Since they're all designed with the 
        //same length, I'm comfortable using that array's length. Basically using this to expose a length 
        //method to use in the program.
        //input: n/a
        //process: gets employeeID.length;
        //output: integer of the length. 
        return employeeId.length;
    }


    //setters - set at index
    public void setHours(Integer pHours,int index)
    {
        hours[index]=pHours;
    }

    public void setPayRate(Double pRate,int index)
    {
        payRate[index] = pRate;
    }

    //methods:

    public Double getGrossPayByEmployeeID(Integer pEmployeeID)
    {
        //Method that accepts an employee’s identification number as an argument and returns the 
        //gross pay for that employee.

        //Input: Employee ID
        //Process: call getIndexByEmployeeID. Use that index to get the hours and pay rate. Multiply
        //the two values and return it. 

        //output: GrossPay: Double


        int index = getIndexByEmployeeID(pEmployeeID);

        return getHours(index) * getPayRate(index);
    }
    

}
