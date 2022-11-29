package day19_LoopPractices;

import java.util.Scanner;

public class Task5OK {
    public static void main(String[] args) {
        boolean continueAsking = false;
        Scanner sc = new Scanner(System.in);
        do {

            System.out.println("How much you make an hour?");
            int hourlyRate = sc.nextInt();

            if (hourlyRate <= 0) {
                System.out.println("Invalid Entry for Hourly Rate");
                System.exit(0);
            }

            System.out.println("How many hours do you work per week?");
            int weeklyHour = sc.nextInt();
            if (weeklyHour < 1 && weeklyHour > 144) {
                System.out.println("Invalid Entry for Weekly Hours");
                System.exit(0);
            }
            System.out.println("Enter your state tax rate");
            double taxRate = sc.nextDouble();
            if (taxRate < 0 || taxRate > 10) {
                System.out.println("Invalid Entry for state tax Rate");
                System.exit(0);
            }
            double groosSalary = hourlyRate * weeklyHour * 4;
            double federalTax = groosSalary * 0.26;
            double stateTax = groosSalary * taxRate / 100;

            System.out.println("Gross Salary $" + groosSalary);
            System.out.println("Federal tax $" + federalTax);
            System.out.println("State tax $" + stateTax);
            System.out.println("Total tax $" + (federalTax + stateTax));
            System.out.println("Net income $" + (groosSalary - federalTax - stateTax));
            System.out.println("Would you like to continue?");
            String yesNo = sc.next();

            if (yesNo.equalsIgnoreCase("yes")) {
                continueAsking = true;
            } else {
                System.out.println("Thank you for using Cydeo Salary Calculator APP");
                continueAsking = false;
            }

        } while (continueAsking);

    }
}
/*
5. Write a program for the salary calculator
			1. Ask the user "How much you make an hour?"
					If user entered hourlyRate is 0 or negative, terminate the program after displaying the error message "Invalid Entry for Hourly Rate"

			2. Ask the user  "How many hours do you work per week?"
					if user entered weeklyHour is less than 1 or greater than 144, terminate the program after displaying the error message "Invalid Entry for Weekly Hours"

			3. Ask the user  "Enter your state tax rate"
					if the state tax rate is less than 0% or greater than 10%, terminate the program after displaying the error message "Invalid Entry for state tax Rate"


			4. Display:
					1. Gross Salary
					2. Federal Tax (assume that federal tax rate is 26%)
					3. State Tax
					4. Total Tax
					5. Net Income

			5. Ask the user "Would you like to continue?"
				If "yes" --> repeat all the previous steps
				If "no" --> print "Thank you for using Cydeo Salary Calculator APP"

				If user enters an invalid entry, terminate the program after displaying the error message "Invalid Entry"

 */