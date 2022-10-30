package Week8;

public class Payroll {
   /* Design a Payroll class that has fields for an employee’s name, ID number, hourly pay rate,
and number of hours worked. Write the appropriate accessor and mutator methods and
a constructor that accepts the employee’s name and ID number as arguments. The class
should also have a method that returns the employee’s gross pay, which is calculated as the
number of hours worked multiplied by the hourly pay rate.

+---------------------------------------+
| Payroll                               |
+---------------------------------------+
| - Name : String                       |
| - IDNumber: int                       |
| - HourlyPayRate : Double              |
| - HoursWorked : Double                |
+---------------------------------------+
| Payroll(Name,IDNumber)                |
| +getName():string                     |
| +getID():int                          |
| +getHourlyPayRate(): double           |
| +getHoursWorked(): double             |
| +setHourlyPayRate(pRate:double):void  |
| +setHoursWorked(pHours: double):void  |
| +getGrossPay():double                 |
+---------------------------------------+

*/

    private String name;
    private int IDNumber;
    private Double hourlyPayRate;
    private Double hoursWorked;

    //constructor
    Payroll(String pName, int pIDNumber)
    {
        name=pName;
        IDNumber=pIDNumber;
    }

    //getters
    public String getName()
    {
        return name;
    }
    public int getID()
    {
        return IDNumber;
    }
    public Double getHourlyRate()
    {
        return hourlyPayRate;
    }
    public Double getHoursWorked()
    {
        return hoursWorked;
    }

    //setters
    public void setHourlyPayRate(Double pHourlyPayRate)
    {
        /*
            * input: double hourlyPayRate
            * Process: none
            * output: none
            */
        hourlyPayRate = pHourlyPayRate;
    }

    public void setHoursWorked(Double pHoursWorked)
    {
        /*
            * input: Double hoursWorked
            * Process: none
            * Output: none
            */
        hoursWorked=pHoursWorked;

    }

    //manipulator
    public Double getGrossPay()
    {
        /*
            * input: none
            * Process: multiply hourlyPayRate by HoursWorked to calculate gross pay
            * Output: Double gross pay. 
            */
        return hourlyPayRate * hoursWorked;
    }
}


