package Week4;

public class Name_Initials {
/*Write a program that has the following String variables: firstName, middleName, and
lastName. Initialize these with your first, middle, and last names. The program should also
have the following char variables: firstInitial, middleInitial, and lastInitial.
Store your first, middle, and last initials in these variables.
The program should display the contents of these variables on the screen. */

/*
 +-------------+-------------------------------------+----------------------------------------+
| Input       | Process                             | Output                                 |
+-------------+-------------------------------------+----------------------------------------+
| First Name  | * Retrieve first character of each, | Output contents of initials variables. |
| Middle Name | store in initials variables.        |                                        |
| Last Name   |                                     |                                        |
+-------------+-------------------------------------+----------------------------------------+
 */
public static void main(String[] args)
    {
        String firstName, middleName, lastName;
        Character firstInitial, middleInitial, lastInitial;
        
        //initialize chars as null
        firstInitial = '\0';
        middleInitial = '\0';
        lastInitial = '\0';

        //population
        firstName = "Rebecca";
        middleName = "Ann";
        lastName = "Johnson";

        //process items to get initials, chars get initialized as null. Capitalize.
        
        if(!firstName.isEmpty()){
            firstInitial = Character.toUpperCase(firstName.charAt(0));
        }
        if(!middleName.isEmpty()){
            middleInitial =  Character.toUpperCase(middleName.charAt(0));
        }
        if(!lastName.isEmpty()){
            lastInitial =  Character.toUpperCase(lastName.charAt(0));
        }
        

        //output
        System.out.println("First Initial: " + firstInitial);
        System.out.println("Middle Initial: " + middleInitial);
        System.out.println("Last Initial: " + lastInitial);

    }


}
