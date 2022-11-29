package day17_While_DoWhile;

import java.util.Scanner;

public class SumOfNum {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.println("Enter numbers");
        int num = scan.nextInt();
        int sum = 0;
        while (!(num<0)){

            System.out.println("Enter a num " );

            sum+=num;
            System.out.println("sum = " + sum);
            num = scan.nextInt();
        }
        System.out.println("Invalid");

         /*2. Write a program that calculates the sum of numbers entered by the
user until user enters a negative number.
hint: you need an infinite loop */
    }
}