package day17_While_DoWhile;

import java.util.Scanner;

public class RommReservation {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Welcome. How can I help you? \n Would you like to reserve a room please?");
        String reservation = scanner.next().toLowerCase();

        while (!(reservation.equals("yes") || reservation.equals("no"))) {
            System.err.println("Please enter either \"yes\" or \"no\" ");
            reservation = scanner.next();
        }

        if (reservation.equals("yes")) {
            System.out.println("Which type of room you want to reserve \"king bed\", \"queen bed\" or \"single bed\"");
            scanner.nextLine();
            String room = scanner.nextLine();

            while (!(room.equals("king bed")
                    || room.equals("queen bed")
                    || room.equals("single bed"))) {
                System.out.println("Sorry, we do not have such rooms. Please enter a valid room. \n \"king bed\", \"queen bed\" or \"single bed\"");
                room = scanner.nextLine();
            }
            if (room.equalsIgnoreCase("king bed")) {
                System.out.println("King Bed: $120");
            } else if (room.equalsIgnoreCase("queen bed")) {
                System.out.println("Queen Bed: $100");
            } else if (room.equalsIgnoreCase("Single bed")) {
                System.out.println("Single Bed: $80");
            }

        } else if (reservation.equals("no")) {
            System.out.println("Have a nice day");
        }

    }
}
/*
5. Create a class called RommReservation, write a program for the room reservation, your program asks the user wants to reserve a room.
    	if user entered yes, then ask which type of room the user wants to reserve. if user entered no, print "have a nice day"
    			(if user entered any invalid answer (other than yes/no) ask user to reenter until user provides a valid entry)

	            King Bed ==> 120$
	            Queen Bed ==> 100$
	            single Bed ==> 80$

            the program should be able to display the room he/she reserved and total price of the room.

            (if the user selected an invalid room, ask the user to reselect the room until user provides a valid entry)

 */