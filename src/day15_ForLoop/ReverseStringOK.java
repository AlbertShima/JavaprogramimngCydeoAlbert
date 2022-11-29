package day15_ForLoop;

import java.util.Scanner;

public class ReverseStringOK {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter a word please:");
        String str = scanner.nextLine();

        String reverseStr = ""; // declare an empty string. Here I will store the new reversed string.
        int strLength = str.length();

        for (int i = 0; i < strLength; i++) {
            reverseStr = reverseStr + str.substring(str.length() - 1 - i, str.length()  - i);

        }
        System.out.println(str + " is reversed to " + reverseStr);
    }
}

/*
7. Write a program that can reverse any given string

			Ex:
				input:
					Wooden Spoon

				output:
					noopS nedooW
 */
