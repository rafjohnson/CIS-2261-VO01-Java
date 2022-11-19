package Week11.ParkingTicket;

import java.text.DecimalFormat;

public class Program {
    public static void main(String[] args)
    {
        /*Program to test the parking ticket program
         * 1. park the car
         * 2. pay against meter
         * 3. set the time parked to be 
         *  a. over the paid time
         *  b. under the paid time
         * 4. write a ticket, outputting the ticket info. 
         * 
         */


         //park car
         ParkedCar car = new ParkedCar("Subaru", "Crosstrek","Silver" , "VT 12345");

         //add time
         ParkingMeter meter = new ParkingMeter();
         meter.addMinutes(15); //add minutes paid for here

         //set parked time
         car.setMinutesParked(225); //set minutes parked

         //Create Police Officer
         PoliceOfficer officer = new PoliceOfficer("Steve", "Jones","123ABC");

         //check if the meter is valid
         Boolean isExpired = officer.isCarTimeExpired(meter, car);

         if(isExpired)
         {
            System.out.println ("~~Meter is expired~~");
            ParkingTicket ticket = new ParkingTicket(car, meter, officer);
            Double fine = ticket.getFine();
            DecimalFormat money = new DecimalFormat("0.00");
            StringBuilder outputText = new StringBuilder();
            outputText.append("Car Info");
            outputText.append("\n---------------\n");
            outputText.append("Make: " + car.getMake() + "\n");
            outputText.append("Model: " + car.getModel() + "\n");
            outputText.append("Car Color: " + car.getColor() + "\n");
            outputText.append("\n");
            outputText.append("Meter Info:");
            outputText.append("\n---------------\n");
            outputText.append("Paid time: " + meter.getMinutesPurchased() + "\n");
            outputText.append("Parked Time: " + car.getMinutesParked()+ "\n");
            outputText.append("Fine: $" + money.format(fine) + "\n");
            outputText.append("\n");
            outputText.append("Police Officer");
            outputText.append("\n---------------\n");
            outputText.append(officer);
            System.out.print(outputText.toString());

         }

         else
         {
            System.out.println("~~Meter is not expired.~~");
         }
    }
}
