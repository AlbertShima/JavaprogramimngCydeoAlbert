package day14_String;

import java.util.Scanner;

public class WordReally {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter your word please:");
        String word = scanner.next();
        int wordLength = word.length();
        if (word.substring(wordLength - 2).equalsIgnoreCase("ly")) {
            System.out.println("Really");
        } else {
            System.out.println("Never mind");
        }
    }
}
/*
 2. ask the user to enter a word. if the word ends with "ly", print "really???" ,
 otherwise, print "never mind"
 */