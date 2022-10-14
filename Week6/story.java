


package Week6;

import java.util.Scanner;

public class story {
    public static void main(String[] args) throws InterruptedException
    {
        String userName, city, college, profession, animal, petName;
        String output="";
        Integer age;



        System.out.printf("Enter information about yourself, and I'll tell you a story.\n");
        
        Scanner input = new Scanner(System.in);

        System.out.println("What is your name? ");
        userName = input.next();
        
        System.out.println("How old are you? ");
        age = input.nextInt();

        System.out.println("Name a city: ");
        city = input.next();

        System.out.println("Name a college: ");
        college = input.next();

        System.out.println("Enter a profession: ");
        profession = input.next();

        System.out.println("What's your favorite animal? ");
        animal = input.next();

        System.out.println("Give me another name, this time for a pet: ");
        petName = input.next();

        System.out.println("Ok. Give me a few moments to pull this all together...");
        Thread.sleep(800);
        System.out.println("Just a bit more...");
        Thread.sleep(500);
        System.out.println("OK, got it. Here's your story: ");
        Thread.sleep(500);

        //build output. Doing it this way to handle an/a, rather than printf
        output += "There once was a person named "+ userName +  " who lived in " + city + ". At the age of ";
        output += age.toString() + ", " +  userName + " went to college at "+ college + ". ";
        output += userName +" graduated and went to work as ";
        if ("AEIOU".indexOf(profession.toUpperCase().charAt(0)) != -1)
        {
            output += "an ";
        }
        else {
            output += "a ";
        }
        output += profession + ". Then, " + userName + " adopted ";
        if ("AEIOU".indexOf(animal.toUpperCase().charAt(0)) != -1) //aeiou is present
        {
            output += "an ";
        }
        else {
            output += "a ";
        }
        output += animal + " named " + petName + ". They both lived happily ever after!";

        //finally output
        System.out.println(output);

   }
}
