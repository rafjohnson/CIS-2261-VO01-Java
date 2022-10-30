package Week8;

import java.util.Scanner;

public class payrollDemo {
    /*Write a program that demonstrates
the class by creating a Payroll object, then asking the user to enter the data for an
employee. The program should display the amount of gross pay earned. */

    public static void main(String[] args)
    {
        String personName;
        int ID;
        Double hours;
        Double payRate;
        Double grossPay;
        Scanner scan = new Scanner(System.in);
        
       //retrieve person info (id, name, hours, pay rate )
        System.out.println("Enter person name: ");
        personName=scan.next();

        System.out.println("Enter the person's ID number: ");
        ID = scan.nextInt();

        System.out.println("Enter the hours worked: ");
        hours = scan.nextDouble();

        System.out.println("Enter the pay rate per hour: ");
        payRate = scan.nextDouble();

        //instantiate class
        Payroll myPayroll = new Payroll(personName,ID);
       
        //add hours and pay rate
        myPayroll.setHourlyPayRate(payRate);
        myPayroll.setHoursWorked(hours);

       //get gross pay
       grossPay = myPayroll.getGrossPay();

       //display all information back.
        System.out.println("\n************");
        System.out.printf("Name: %s \n",personName);
        System.out.printf("ID: %d \n",ID);
        System.out.printf("%f hours Worked at %f per hour results in a gross pay of $%.2f \n",hours,payRate,grossPay);

        //close the scan
        scan.close();
       
    }
}
