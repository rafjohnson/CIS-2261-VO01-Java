package Week11.ParkingTicket;

public class ParkingTicket {
    private ParkedCar car;
    private ParkingMeter parkingMeter;
    private PoliceOfficer policeOfficer;

    //constructor?
    public ParkingTicket(ParkedCar pCar, ParkingMeter pMeter,PoliceOfficer pOfficer)
    {
        car=pCar;
        parkingMeter = pMeter;
        policeOfficer = pOfficer;
    }

    //getters
    public ParkedCar getCar()
    {
        return car;
    }

    public ParkingMeter getParkingMeter()
    {
        return parkingMeter;
    }

    public PoliceOfficer getPoliceOfficer()
    {
        return policeOfficer;
    }

    //methods
    public Double getFine()
    {
        /*Input: N/A
         * Process: Determine overage time: 25 for the first hour or part of an hour
that the car is illegally parked, plus $10 for every additional hour or part of an
hour that the car is illegally parked
        Output: fine.
         */
        Double fine=0.0;
        Integer overage;

        if(policeOfficer.isCarTimeExpired(parkingMeter, car))
        {
            overage = car.getMinutesParked() - parkingMeter.getMinutesPurchased();

            //fine defaults to 25 as a minimum
            fine = 25.00;
            
            //subtract the initial 60 minutes
            overage-=60;

            while(overage>0)
            {
                fine+=10;
                overage-=60;
            }        

        }
        return fine;
    }

    @Override
    public String toString() {
        /*Generate the string text */
        StringBuilder outputText = new StringBuilder();
        outputText.append("Car Info");
        outputText.append("\n---------------\n");
        outputText.append("Make: " + car.getMake() + "\n");
        outputText.append("Model: " + car.getModel() + "\n");
        outputText.append("Car Color: " + car.getColor() + "\n");
        outputText.append("\n");
        outputText.append("Meter Info:");
        outputText.append("\n---------------\n");
        outputText.append("Paid time: " + parkingMeter.getMinutesPurchased() + "\n");
        outputText.append("Parked Time: " + car.getMinutesParked()+ "\n");
        outputText.append("Overage: " + getFine() + "\n");
        outputText.append("\n");
        outputText.append("Police Officer");
        outputText.append("\n---------------\n");
        outputText.append(policeOfficer);

            return outputText.toString();
    }

}
