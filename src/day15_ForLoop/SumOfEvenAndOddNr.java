package day15_ForLoop;

public class SumOfEvenAndOddNr {
    public static void main(String[] args) {
        int sumOfEven = 0;
        int sumOfOdd = 0;
        for (int i = 1; i <= 100; i++) {
            if (i % 2 == 0) {
                sumOfEven += i;
            } else if (i % 2 != 0) {
                sumOfOdd += i;

            }
        }
        System.out.println("sum = " + sumOfEven);
        System.out.println("sumOfOdd = " + sumOfOdd);
    }
}

/*

		2. Write a program that can return the sum of even  and odd numbers between 1 to 100
 */