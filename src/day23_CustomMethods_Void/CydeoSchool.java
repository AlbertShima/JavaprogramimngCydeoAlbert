package day23_CustomMethods_Void;

public class CydeoSchool {
    public static void main(String[] args) {
        //calling the method
        regularName("cYdeO", "ScHool");
        // calling the method for the second time
        regularName("Trying TO understand", "HOW methoDs worK!");
    }

    public static void regularName(String firstName, String lastName) {
        //making all letters to lower case
        firstName = firstName.toLowerCase();
        lastName = lastName.toLowerCase();
        //making JUST the first latter upper case
        firstName = firstName.substring(0, 1).toUpperCase() + firstName.substring(1);
        lastName = lastName.substring(0, 1).toUpperCase() + lastName.substring(1);
        // Concatenating two first and last name
        String fullName = firstName + " " + lastName;
        //printing the string
        System.out.println(fullName);
    }
}
/*

	16.  write a method that can print out the full name of a person in regular format
            ex:
               fullName("cYdEo", "SCHOOL");

                output:
                    "Cydeo School"
 */
