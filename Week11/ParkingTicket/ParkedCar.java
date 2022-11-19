package Week11.ParkingTicket;

import javax.swing.text.PlainDocument;

public class ParkedCar {
 /*
 Parked car keeps track of make, model, color
 License number, and number of minutes parked.

 Getters: yes
 Setters: yes
 Methods: none?
  */   

  private String make;
  private String model;
  private String color;
  private String licenseNumber;
  private Integer minutesParked;

  //constructor - car info only, set minutes parked separately since that would likely update in real time
  public ParkedCar(String pMake, String pModel, String pColor, String pLicenseNumber )
  {
    make = pMake;
    model = pModel;
    color = pColor;
    licenseNumber = pLicenseNumber; 

  }
    
  //getters
  public String getMake()
  {
    return make;
  }

  public String getModel()
  {
    return model;
  }

  public String getColor()
  {
    return color;
  }

  public String getLicenseNumber()
  {
    return licenseNumber;
  }

  public Integer getMinutesParked()
  {
    return minutesParked;
  }

  //setters
  public void setMinutesParked(Integer pMinutesParked )
  {
    minutesParked = pMinutesParked;
  }

  //methods
  //Nothing here. 

}
