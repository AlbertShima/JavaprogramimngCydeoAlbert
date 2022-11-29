package day15_ForLoop;

import java.util.Scanner;

public class CarInsurance {
    public static void main(String[] args) {
        //DO NOT TOUCH FOLLOWING LINE/LINES
        System.out.println("Welcome to the Cydeo car insurance!");

        //WRITE YOUR CODE BELOW
        Scanner scanner = new Scanner(System.in);
        int age = 0;
        int zipCode = 0;
        String levelOfEducation = "";
        double premiumCost = 0;
        System.out.println("Enter your full name");
        String fullName = scanner.nextLine().toLowerCase();
        System.out.println("Do you have a US driver license?");
        String yesno = scanner.next();
        boolean yesNo = yesno.equalsIgnoreCase("Yes");
        if (!yesNo) {
            System.out.println("You must have a license to get insurance!");
            System.exit(0);
        } else {
            System.out.println("Enter your zip code");
            zipCode = scanner.nextInt();

            switch (zipCode) {
                case 20910:
                case 20740:
                    premiumCost = premiumCost + 60;
                    break;
                case 22103:
                case 22102:
                    premiumCost = premiumCost + 30;
                    break;
                default:
                    premiumCost = premiumCost + 50;
            }
            System.out.println("Is this vehicle owned, financed, or leased?");
            String vehicleType = scanner.next();
            switch (vehicleType) {
                case "owned":
                    premiumCost = premiumCost + 10;
                    break;
                case "financed":
                    premiumCost = premiumCost + 15;
                    break;
                case "leased":
                    premiumCost = premiumCost + 20;
                    break;
                default:
            }
            System.out.println("How is this vehicle primarily used?");
            String vehicleUsed = scanner.next();
            switch (vehicleUsed) {
                case "business":
                    premiumCost = premiumCost + 50;
                    break;
                case "pleasure":
                    premiumCost = premiumCost + 10;
                    break;
                case "commuting":
                    premiumCost = premiumCost + 20;
                    System.out.println("How many days do you commute?");
                    int daysCommute = scanner.nextInt();
                    premiumCost =premiumCost +  daysCommute * 5;
                    break;
                default:
            }
            System.out.println("How old are you?");
            age = scanner.nextInt();
            if (age >= 16) {
                if (age < 20) {
                    premiumCost *= 10;
                } else if (age < 25) {
                    premiumCost *= 6;
                } else {
                    premiumCost *= 2;
                }
            } else {
                System.out.println("You can't be driving");
                System.exit(0);
            }
            System.out.println("Have you had any accidents in the last 5 years?");
            String yesNoAccident = scanner.next();

            if (yesNoAccident.equalsIgnoreCase("Yes")) {
                System.out.println("How many?");
                int numbersOfAccidents = scanner.nextInt();
                premiumCost = premiumCost + numbersOfAccidents * 10;

            }
            System.out.println("What is the highest level of education you have completed?");
            scanner.nextLine();
            levelOfEducation = scanner.nextLine();
            switch (levelOfEducation) {
                case "Bachelors":
                case "Masters":
                    premiumCost = premiumCost - premiumCost * 0.05;
                    break;
                case "PHD":
                    premiumCost = premiumCost - premiumCost * 0.1;
                    break;
                case "High School":
                    premiumCost = premiumCost + premiumCost * 0.05;
                    break;
                default:
            }


        }
        int indexOfBeginningLastName = fullName.indexOf(" ") + 1;
        String fullNameCorrect = fullName.substring(0, 1).toUpperCase() + fullName.substring(1, indexOfBeginningLastName) +
                fullName.substring(indexOfBeginningLastName, indexOfBeginningLastName + 1).toUpperCase() + fullName.substring(indexOfBeginningLastName + 1);

        System.out.println(fullNameCorrect + ", here's your quote!");
        System.out.println("This is your start premium cost: $" + premiumCost);
        String twoLettersFromFullName = fullName.substring(0, 2).toUpperCase();
        String thereLettersFromLastName = fullName.substring(fullName.length() - 3).toUpperCase();
        String educationWithoutSpace = levelOfEducation.replace(" ", "");
        System.out.print("This is your reference number: " + twoLettersFromFullName + age + thereLettersFromLastName + zipCode + educationWithoutSpace.toUpperCase());
    }
}