package day17_While_DoWhile;

import java.util.Scanner;

public class Task4 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int number = scanner.nextInt();
        String divisibelBy15 = "";
        String divisibelBy5 = "";
        String divisibelBy3 = "";
        String notDivisibelBy3_5_15 = "";
        int counter = 1;

        while (counter <= number) {
            if (counter % 15 == 0) {
                divisibelBy15 += counter + " ";
            } else if (counter % 5 == 0) {
                divisibelBy5 += counter + " ";
            } else if (counter % 3 == 0) {
                divisibelBy3 += counter + " ";
            } else {
                notDivisibelBy3_5_15 += counter + " ";
            }
            counter++;
        }
        System.out.println("divisibelBy3 = " + divisibelBy3);
        System.out.println("divisibelBy5 = " + divisibelBy5);
        System.out.println("divisibelBy15 = " + divisibelBy15);
        System.out.println("notDivisibelBy3_5_15 = " + notDivisibelBy3_5_15);

    }
}
/*
	4. Write a program that can print the numbers between 1 ~ N that can be divisible by 3, 5, and 15.
	            if the number can be divisible by 3, 5 and 15,
	                then it should only be displayed in DivisibelBy15' section

	            if the number can be divisible by 3 but cannot be divisible by 15,
	                then it should only be displayed in DivisibelBy3' section

	            if the number can be divisible by 5 but cannot be divisible by 15,
	                then it should only be displayed in DivisibelBy5' section

	            EX:
	                input: 100

	                Output:
	                     Divisible By 15 15 30 45 60 75 90
	                     Divisible By 5 5 10 20 25 35 40 50 55 65 70 80 85 95 100
	                     Divisible By 3 3 6 9 12 18 21 24 27 33 36 39 42 48 51 54 57 63 66 69 72 78 81 84 87 93 96 99
 */