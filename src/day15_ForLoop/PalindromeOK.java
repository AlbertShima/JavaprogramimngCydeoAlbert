package day15_ForLoop;

import java.util.Scanner;
public class PalindromeOK {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter a str please:");
        String str = scanner.next();
        String strLowerCase = str.toLowerCase(); // assigning a new string with lower case
        String reverseStr = "";
        /*
        Declaring an empty string. This one is going to fill by characters of
        strLowerCase in reverse order.
         */

        int strLength = str.length();

        for (int i = (strLength - 1); i >= 0; --i) {
            reverseStr = reverseStr + str.charAt(i);
        }

        if (str.equals(reverseStr)) {
            System.out.println(str + " is a Palindrome String.");
        } else {
            System.out.println(str + " is not a Palindrome String.");
        }
    }
}
/*
8. Write a program that can check if the given String is palindrome

			Ex:
				input:
					Level

				output:
					true


				input:
					Anna

				output:
					true


 */