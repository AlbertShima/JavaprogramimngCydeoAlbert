package day18_NestedLoop;

import java.util.Scanner;

public class RoomReservation {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Welcome. How can I help you? \nWould you like to reserve a room please?");
        String reservation = scanner.next().toLowerCase();
        int totalCost = 0;
        boolean again = true;
        while (again) {
            while (!(reservation.equals("yes") || reservation.equals("no"))) {
                System.err.println("Please re-enter either \"yes\" or \"no\" ");
                reservation = scanner.next();
            }
            System.out.println("How many nights are you going to say?");
            int nrOfNights = scanner.nextInt();


            if (reservation.equals("yes")) {
                System.out.println("Which type of room you want to reserve \"king bed\", \"queen bed\" or \"single bed\"");
                scanner.nextLine();
                String room = scanner.nextLine();

                while (!(room.equals("king bed")
                        || room.equals("queen bed")
                        || room.equals("single bed"))) {
                    System.out.println("Sorry, we do not have such rooms. Please re enter a valid room. \n\"king bed\", \"queen bed\" or \"single bed\"");
                    room = scanner.nextLine();
                }
                if (room.equalsIgnoreCase("king bed")) {
                    System.out.println("King Bed: $120");
                    totalCost += 120 * nrOfNights;
                } else if (room.equalsIgnoreCase("queen bed")) {
                    System.out.println("Queen Bed: $100");
                    totalCost += 100 * nrOfNights;
                } else if (room.equalsIgnoreCase("Single bed")) {
                    System.out.println("Single Bed: $80");
                    totalCost += 80 * nrOfNights;
                }

                System.out.println("would you like to reserve another room?");
                reservation = scanner.next();
                if (reservation.equals("no")) {
                    again = false;
                }
            }
        }
        System.out.println("totalCost = " + totalCost);
    }
}



/*
2. Create a class called RoomReservation, write a program for the room reservation:
            King Bed ==> 120$
            Queen Bed ==> 100$
            single Bed ==> 80$

            the program asks the user which bedroom does he/she wants to reserve, and how many nights he/she is staying.
            Then Ask the user "would you like to reserve another room?""
                            if yes ==> repeat the entire steps
                            if no ==> return the  total price

            	If user enters any invalid entry,  ask the user to re-enter until user provides a valid entry
 */