package Week7;

import Week7.Car;
/*
         * Demonstrate the class in a program that creates a Car object, and then calls the accelerate
method five times. After each call to the accelerate method, get the current speed of the car
and display it. Then, call the brake method five times. After each call to the brake method,
get the current speed of the car and display it.
         */
public class program {
    public static void main(String[] args)
    {
        //main method to test the Car object

        Car car = new Car(1989,"Prius");

        //car info
        System.out.printf("Car Make & year: %d %s \n",car.getYearModel(),car.getMake() );

        //print init speed
        System.out.printf("The car is going %5.2f \n",car.getSpeed());

        for (int i=0; i<5;i++)
        {
            car.accelerate();
            System.out.println("Accelerating...");
            System.out.printf("The car is going %5.2f \n",car.getSpeed());
            

        }

        for(int i=0;i<5;i++)
        {
            car.brake();
            System.out.println("Braking...");
            System.out.printf("The car is going %5.2f \n",car.getSpeed());
            

        }
         

        
    }
}
