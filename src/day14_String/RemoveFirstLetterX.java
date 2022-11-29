package day14_String;

import java.util.Scanner;

public class RemoveFirstLetterX {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter your word please:");
        String word = scanner.next();
        if (word.charAt(0) == 'x' || word.charAt(0) == 'X') {
            System.out.println(word.substring(1));
        } else {
            System.out.println(word);
        }

    }
}
/*

    3. Ask user to enter a word. If the word starts with x, print the word without x.
                    Input:
                        xcode
                    Output:
                        code
 */