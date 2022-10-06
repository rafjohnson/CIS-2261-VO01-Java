package Week4;

import java.util.Scanner;

public class Cookie_Calories {
    /*
     * A bag of cookies holds 40 cookies. The calorie information on the bag claims that there
are 10 servings in the bag and that a serving equals 300 calories. Write a program that lets
the user enter the number of cookies he or she actually ate and then reports the number of
total calories consumed.
     */

     /*
+-------------------+--------------------------------------------+------------------------+
| Input             | Process                                    | Output                 |
+-------------------+--------------------------------------------+------------------------+
| Number of cookies | * Take input from user -> Cookies          | Display total calories |
|                   | * Calculate calories -                     |                        |
|                   |     * calculate calories per cookie        |                        |
|                   |     * multiply cal/cookie * num of cookies |                        |
+-------------------+--------------------------------------------+------------------------+
      */

    public static void main(String[] args)
    {
        Integer servingsPerBag; //how many servings per bag
        Integer cookiesPerServing; //how many cookies are in a serving
        Integer cookiesPerBag; //how many cookies in the bag. 
        Integer caloriesPerServing; //how many calories per serving
        Float caloriesPerCookie; //likely going to be a decimal of some form. 
        Integer cookiesEaten; //number of cookies eaten, retrieved from user
        Float totalCalories; //total calories eaten

        //what we know
        cookiesPerBag = 40;
        servingsPerBag = 10;
        caloriesPerServing = 300;

        //calculations
        cookiesPerServing = cookiesPerBag/servingsPerBag; //should equal 4
        caloriesPerCookie = (float)caloriesPerServing / cookiesPerServing; //cast to float

        //take input
        Scanner input = new Scanner(System.in);
        System.out.print("Enter the number of cookies eaten: ");
        cookiesEaten = input.nextInt(); //cookies eaten, getting the input. 
        System.out.print('\n');
        input.close(); 


        //calculate total calories
        totalCalories = caloriesPerCookie * cookiesEaten;

        //output total calories
        System.out.println("The total calories for " + cookiesEaten + " cookies is: " + totalCalories);

    }
}
