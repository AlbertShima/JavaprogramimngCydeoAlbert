package day14_String;

import java.util.Scanner;

public class AddTwoWords {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter first word please:");
        String firstWord =scanner.next();
        System.out.println("Enter second word please:");
        String secondWord =scanner.next();
        if(firstWord.charAt(firstWord.length()-1)==secondWord.charAt(0)){
            System.out.println(firstWord+secondWord);
        } else {
            System.out.println(firstWord+" "+secondWord);
        }
    }
}
/*
4. Ask user to enter two words. Then add them together and print.
    But if the last letter of the first word and the first letter of the last letter is the same,
    print that character once.

                    Input:
                        one
                        eight
                    Output:
                        oneight

 */