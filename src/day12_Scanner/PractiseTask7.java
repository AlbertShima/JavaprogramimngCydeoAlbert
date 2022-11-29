package day12_Scanner;

import java.util.Scanner;

public class PractiseTask7 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("How many total shares you have already?");
        int inum = sc.nextInt();
        System.out.println("How much their total value in the stock market is?");
        double dnum = sc.nextDouble();
        sc.nextLine();
        System.out.println("Enter the name of the company they have the most shares in");
        String nameOfCompany = sc.nextLine();

        if (inum >= 0) {

            System.out.println("\"Your total stock market holding is $" + dnum + " which is made up of " + 100 + " shares.\n" + nameOfCompany + " is your company holdings\"");

        } else {
            System.out.println("Please enter a positive number");
        }
    }
}
/*
7. StockMarket task:
        - Ask the user how many total shares they have already? (int)
            -> If the user gives 0 or give a negative number none of the rest condition should be executed

        - Ask the user how much their total value in the stock market is (double)
        - Ask the user to enter the name of the company they have the most shares in (String, multiple words)

        - Print in the following format:
            Ex:
                inputs: 100, 25000, Apple INC

            "Your total stock market holding is $25000 which is made up of 100 shares. Apple INC is your company holdings"
 */