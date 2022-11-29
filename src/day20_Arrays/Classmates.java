package day20_Arrays;

import java.util.Scanner;

public class Classmates {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        String[] arr = new String[10];

        for (int i = 0; i < arr.length; i++) {
            arr[i] = sc.nextLine();
        }

        for (int i = 0; i < arr.length; i++) {
            String initialLetters = "";
            initialLetters = arr[i].charAt(0) + " " + arr[i].charAt(arr[i].indexOf(" ") + 1);
            System.out.println("initialLetters = " + initialLetters);

        }

    }
}
/*

1. create an array named classmates, and store 10 of your classmates' full names
            print the initials of each classmate's in separate lines
 */
