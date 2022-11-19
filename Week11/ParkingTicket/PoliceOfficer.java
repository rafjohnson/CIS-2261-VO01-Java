package Week11.ParkingTicket;

public class PoliceOfficer {
    String officerFirstName;
    String officerLastName;
    String officerBadgeNumber;

    //methods
    public Boolean isCarTimeExpired(ParkingMeter pMeter, ParkedCar pCar)
    {
        Boolean expired = false;

        //input: meter, car
        //process:
        //meter has the amount of time paid for
        //car keeps track of the amount of time parked.
        //output:
        //if amount of paidTime-parkedTime is negative (<0), expired = true
        Integer paidTime = pMeter.getMinutesPurchased();
        Integer parkedTime = pCar.getMinutesParked();

        if((paidTime-parkedTime)<0)
        {
            expired=true;
        }

        return expired;
    }

    public ParkingTicket writeParkingTicket(ParkedCar pCar, ParkingMeter pMeter)
    {
        ParkingTicket ticket = new ParkingTicket(pCar, pMeter);



        return ticket;
    }
}
