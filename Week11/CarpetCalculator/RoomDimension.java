package Week11.CarpetCalculator;

public class RoomDimension {
   private Double length; //length in feet
   private Double width;  //width in feet

    //constructor
    public RoomDimension(Double pLength, Double pWidth)
    {
        /*
         * Input: length, width
         * Process: set values of object
         * Output: n/a
         */
        length = pLength;
        width = pWidth;
    }
    //getters - none - only area is publicly available
    
    //setters - none - everything setup via constructors
    
    //methods
    public Double getArea()
    {
        /*
         * Input: n/a
         * Process: multiply length * width
         * Output: Double area
         */

        return width*length;
    }

    @Override
    public String toString() {
        /*
         * Input: n/a
         * Process: n/a
         * Output: returns a logical string. I'm deciding to output "width: xxx length: xxx"
         * since nothing was specified in the instructions or UML diagram
         */
        String output;
        output = "Width: "+ width + " Length: " + length;
        return output;
    }
}
