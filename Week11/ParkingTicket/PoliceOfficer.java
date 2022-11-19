package Week11.ParkingTicket;

import Week6.story;

public class PoliceOfficer {
    String officerFirstName;
    String officerLastName;
    String officerBadgeNumber;

    public PoliceOfficer(String pOfficerFirstName, String pOfficerLastName, String pOfficerNumber)
    {
        officerFirstName = pOfficerFirstName;
        officerLastName = pOfficerLastName;
        officerBadgeNumber = pOfficerNumber;
    }
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
        ParkingTicket ticket = new ParkingTicket(pCar, pMeter,this);
        return ticket;
        
    }

    @Override
    public String toString() {
        StringBuilder sBuilder = new StringBuilder();

        sBuilder.append("Officer First Name: ");
        sBuilder.append(officerFirstName);
        sBuilder.append("\n");
        sBuilder.append("Officer Last Name: ");
        sBuilder.append(officerLastName);
        sBuilder.append("\n");
        sBuilder.append("Officer Badge Number: ");
        sBuilder.append(officerBadgeNumber);
        return sBuilder.toString();
    }
}
