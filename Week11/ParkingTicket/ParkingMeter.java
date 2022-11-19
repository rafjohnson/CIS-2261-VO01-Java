package Week11.ParkingTicket;

public class ParkingMeter {
    private Integer minutesPurchased;

    //constructors
    public ParkingMeter()
    {
        minutesPurchased = 0;
    }

    public ParkingMeter(Integer pMinutesPurchased)
    {
        minutesPurchased = pMinutesPurchased;
    }

    //methods
    public Integer getMinutesPurchased()
    {
        return minutesPurchased;
    }

    public void setMinutes(Integer pMinutes)
    {
        minutesPurchased = pMinutes;

    }

    public Integer addMinutes(Integer pMinutes)
    {
        minutesPurchased = minutesPurchased + pMinutes;
        return minutesPurchased;
    }
}
