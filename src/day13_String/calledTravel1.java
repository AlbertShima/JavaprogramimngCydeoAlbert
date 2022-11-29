package day13_String;

import java.util.Scanner;

public class calledTravel1 {
    public static void main(String[] args) {
        int baseCostOfTicket = 0;
        Scanner scanner = new Scanner(System.in);
        System.out.println("Do you have a valid passport (yes or no)");
        String yesNoPassport = scanner.next();
        scanner.nextLine();
        System.out.println("Which country would you like to go?");
        String countryToTravel = scanner.nextLine();
        System.out.println("How many bags do you have?");
        byte nrOfBags = scanner.nextByte();
        System.out.println("How many people would you like to travel?");
        short nrOfPeople = scanner.nextShort();
        System.out.println("Enter all the names in one line, separating each name with a comma please");
        scanner.nextLine();
        String namesOfPeople = scanner.nextLine();
        boolean passport = yesNoPassport.equals("Yes");
        if (passport) {
            baseCostOfTicket = 1000;
            baseCostOfTicket += nrOfBags * 50;
            baseCostOfTicket += -nrOfPeople * 100;
            if (baseCostOfTicket < 300) {
                baseCostOfTicket = 300;
            }
            System.out.println("Your ticket is booked to " + countryToTravel+".");
            System.out.println("We have charged extra for the " + nrOfBags + " bags but you are traveling with \n" + namesOfPeople + " so we are giving a discount. Your total cost is " + baseCostOfTicket);
        } else {
            int cost_of_the_passport_renewal = 200;
            System.out.println("When your passport expired(int)");
            int passportExpired =scanner.nextInt();
            System.out.println("Will you be traveling in the next year");
            boolean travelingNextYear = scanner.next().equals("Yes");
            if (travelingNextYear){
                baseCostOfTicket+=100;
            } else{
                baseCostOfTicket+=-50;
            }
            System.out.println("Looks like your password has been expired for "+passportExpired+", but not to worry we will get it ready for you to travel to "+countryToTravel+
                    "Your total cost has come out to "+(cost_of_the_passport_renewal+baseCostOfTicket));

        }

    }
}
        /*


        3.Create a

class calledTravel.Make a cost variable to calculate how much the person will owe after everything.
        Ask the user if they have a valid passport(yes or no)
        If the user enters yes:
        The base cost of the ticket should be set to:1000
        Ask the user the country they to travel to(String,multiple word)
        Ask the user how many bags they will take with them(byte)
        >Each bag will add 50to the cost
        Ask the user how many people they will travel with(short)
        >For each person the cost is reduced by 100.Up to a limit of 300.
        Ask the user to Enter the name of the people they will travel with in one line,
        separating each name with a comma(String,multiple word)

        Print:"Your ticket is booked to $countryName.
        We have charged extra for the $numberOfBags bags but you are traveling with
        $peopleYouTravelWith so we are giving a discount.Your total cost is $costAmount"


        If the user enters no:
        The base cost of the passport renewal is:200
        Ask the user when their passport expired(int)
        >Each year it was expired adds 75to the cost
        Ask the user which country they plan to travel
        Ask the user if they will be traveling in the next year(String-yes or no)
        >If yes:add 100to the cost
        >If no:subtract 50from the cost

        Print:"Looks like your password has been expired for $years, but not to worry we will get it ready for you to travel to $allCountries. Your total cost has come out to $costAmount."

        */