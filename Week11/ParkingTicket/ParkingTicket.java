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
        Double fine=0;
        Integer overage;

        if(policeOfficer.isCarTimeExpired(parkingMeter, car))
        {
            overage = car.getMinutesParked() -parkingMeter.getMinutesPurchased();

            if(0<overage && overage<=60)
            {
                fine = 25.00;
            }
           
            //TODO: Figure this out. 
            overage = overage - 60;
            //do the rounding algo
           // https://stackoverflow.com/a/18407671/7858537
            int rounding = (overage + 59)/ 60 ;


        }


        

        return fine;
    }

}
