package day13_String;

import java.util.Scanner;

public class TipCalculator {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Split or No split (Yes or No)?");
        String yesNo = scanner.next();
        System.out.println("Enter the number of people");
        int nrOfPeople = scanner.nextInt();
        System.out.println("Enter the amount:");
        int amount = scanner.nextInt();
        System.out.println("How was the service quality? (Excellent/Great/Good/Fair/Poor)");
        scanner.nextLine();
        String service = scanner.next();
        double tip = 0;
        boolean nrOfPeoplePositive = nrOfPeople > 0;
        boolean amountMustBePositive = amount > 0;
        switch (service) {
            case "Excellent":
                tip = amount * 0.25;
                break;
            case "Great":
                tip = amount * 0.2;
                break;
            case "Good":
                tip = amount * 0.15;
                break;
            case "Fair":
                tip = amount * 0.1;
                break;
            case "Poor":
                tip = amount * 0.05;
                break;
            default:

        }

        if (yesNo.equals("Yes")) { // We will split the amount

            if (nrOfPeoplePositive && amountMustBePositive) {
                System.out.println("Number of people entered: " + nrOfPeople);
                System.out.println("Total to pay: " + (amount + tip));
                System.out.println("Total tip: " + tip);
                System.out.println("Total per person: " + ((amount + tip) / nrOfPeople));
                System.out.println("Tip per person: " + (tip / nrOfPeople));
            } else {
                System.out.println("Please enter a positive number for peoples/amount");
            }

        } else {                // We will NOT split the amount

            System.out.println("Number of people entered: " + nrOfPeople);
            System.out.println("Total to pay: " + (amount + tip));
            System.out.println("Total tip: " + tip);

        }

    }

}

/*
2. Create a class called TipCalculator, write a program for a tip calculator.
There will be different service quality benchmarks that will determine the tip given.
There will also the ability to calculate based on the number of people in the party and if there is a
split of the bill or not.

		Poor = 5%, Fair = 10%, Good = 15%, Great = 20%, Excellent = 25%

	The program should display the following information based on the user input:

	Split or No split (Yes or No),  Number of people entered: (number) (each person = & in output)
	Check amount: (number) Service Quality: (String) Total to pay: Total tip: Total per person:
	Tip per person:

	Ex:
		Split or No split (Yes or No)?
		Yes
		Enter the number of people
		4
		Enter the check amount:
		476
		How was the service quality? (Excellent/Great/Good/Fair/Poor)
		Excellent

		output:
			Number of people entered: 4
			Total to pay: 595.0
			Total tip: 119.0
			Total per person: 148.75
			Tip per person: 29.75

	HINT: you will need to use .equals() method
 */
