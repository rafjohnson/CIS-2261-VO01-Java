package Week11.CarpetCalculator;

public class RoomCarpet {
    public RoomDimension size;
    private Double carpetCost; //price in square feet

    // constructor
    public RoomCarpet(Double pLength, Double pWidth, Double pPrice)
    {
        size = new RoomDimension(pLength, pWidth);
        carpetCost = pPrice;
    }

    // getters - none, everything is accessable via totalCost

    // setters - none, everything is set through constructor. 

    // methods
    public Double getTotalCost() {
        /*
         * Input: n/a
         * Process: get room area from RoomDimension obj,
         * then multiply with carpetCost
         * Output: cost;
         * 
         */

        Double area = size.getArea();
        Double cost = area * carpetCost;
        return cost;
    }

    @Override
    public String toString() {
        /*
         * Input: n/a
         * Process: generate a string. Nothing in UML or instructions
         * specifies the return, so deciding to return the
         * total cost. 
         */
        String totalCost = getTotalCost().toString();
        return totalCost;
    }
}
