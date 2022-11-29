package day13_String;

import java.util.Scanner;

public class EmptyString {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter a string:");
        String string = scanner.next();
        int stringLength = string.length();

        if (string.isEmpty()) {
            System.out.println("string is empty");
        } else if (stringLength > 3) {
            System.out.println(string.substring(stringLength - 3));
        } else {
            System.out.println(string);
        }
    }
}
/*
5. Write a method that asks user to enter a string.
        if the string is empty, print: string is empty
        if the string has more than 3 characters, print the last three characters
        if the string has less than or equal 3 characters, print the string itself
 */