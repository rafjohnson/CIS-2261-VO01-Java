package Week11.CarpetCalculator;

import java.util.Scanner;

public class program {
    /*
     * Test program to demonstrate the RoomCarpet and RoomDimension classes.
     */

    public static void main(String[] args)
    {
        //user inputs
        Double length;
        Double width;
        Double pricePerSqFoot;

        Scanner scan = new Scanner(System.in);

        //get user input for dimensions and price per sq. ft. 
        System.out.println("Enter the area of the carpet: ");
        System.out.print("Length: ");
        length = scan.nextDouble();
        System.out.print("Width: ");
        width = scan.nextDouble();

        System.out.print("Enter the price per square foot: ");
        pricePerSqFoot = scan.nextDouble();

        //create object
        RoomCarpet carpet = new RoomCarpet(length,width,pricePerSqFoot);

        //print info
        System.out.printf("\nThe area is: %.2f\n",carpet.size.getArea());
        System.out.printf("The total cost is: $%.2f\n",carpet.getTotalCost());

        //demonstrating .toString methods
        System.out.println("RoomDimension.toString()");
        System.out.print(carpet.size.toString());
        System.out.print("\n");
        System.out.println("RoomCarpet.toString() (Square footage)");
        System.out.print(carpet.toString());
        scan.close();

    }

}
