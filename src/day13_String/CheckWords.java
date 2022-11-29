package day13_String;

import java.util.Scanner;

public class CheckWords {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter your first word:");
        String word1 = scanner.next();
        System.out.println("Enter your second word:");
        String word2 = scanner.next();
        System.out.println("Enter your third word:");
        String word3 = scanner.next();

        int a = word1.length();
        int b = word2.length();
        int c = word3.length();

        if (a == b && b == c) {
            System.out.println("All words are same length");
        } else if (a == b || a == c || b == c) {
            System.out.println("Not Same nor Different lengths");
        } else {
            System.out.println("All different length");
        }

    }
}

/*

7. Write a program  for CheckWords, the program accepts 3 words and :
            - if they are same length:  print "All words are same length"
            - if some same length and others not:    print "Not Same nor Different lengths"
            - if all different length :  print "All different length"
 */