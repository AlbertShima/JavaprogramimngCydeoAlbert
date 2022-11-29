package day19_LoopPractices;

import java.util.Scanner;

public class MultiplyOfTwoNum {
    public static void main(String[] args) {
        /*3. Write a program that asks user to enter two positive numbers,
     then multiply those two numbers without using multiplication (*) operator.
        if user enters any negative numbers, print Invalid

          Ex:      inputs:                      output:
                    10                            200
                    20*/
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter a number");
        int first = sc.nextInt();                 //5
        System.out.println("Enter a number");
        int second = sc.nextInt();               //2

        int result =0;

        if (first > 0 && second > 0) {
            int attempt = first;

            while (!(attempt==0)) {

                attempt--;
                result +=second;
            }
            System.out.println(result);

        } else if (first==0||second==0){
            System.out.println(0);
        }else {
            System.out.println("Invalid");
        }
        sc.close();
    }
}