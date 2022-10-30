package Week7;
/*
+----------------------------------------+
| Car                                    |
+----------------------------------------+
| * int Year Model                       |
| * string Make                          |
| * double Speed                         |
+----------------------------------------+
| Constructor(int yearModel,string make) |
| int getYearModel()                     |
| string getMake()                       |
| double getSpeed()                      |
| accelerate()                           |
| brake()                                |
+----------------------------------------+
*/
public class Car {
    private int yearModel;
    private String make;
    private double speed; //chosing double here as it's more likely to have a partial speed. 

   
    public Car(int pYearModel, String pMake)
    {
        //Note to Prof Lagace: I got in the habit of naming parameters with p when I worked in a language
        //called Cache. While it's ObjectOriented, you couldn't use the same parameter name as a attribute of an 
        //object, so if you wanted to do this.yearModel = yearModel, it wouldn't allow you. I also feel it's easier
        //to keep track of when you're assigning out of a parameter. 

        this.yearModel=pYearModel;
        this.make=pMake;
    }

    //accessors
    public int getYearModel()
    {
        return yearModel;
    }

    public String getMake()
    {
        return make;
    }

    public double getSpeed()
    {
        return speed;
    }

    //methods
    public void accelerate()
    {
        /*
        Input: nothing
        Process: add 5 to current speed
        Output: Nothig
        */

        speed = speed + 5;

    }

    public void brake()
    {
        /*
         * Input: nothing
         * Process: subtract 5 to current speed
         * Output: nothing
         */

         speed = speed - 5;
    }

}
