package day20_Arrays;

import java.util.Scanner;

public class Task5 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int[] items = new int[5];
        System.out.println("Enter 5 items");
        for (int i = 0; i < 5; i++) {
            items[i] = sc.nextInt();
        }

        double[] price = new double[5];
        System.out.println("Enter each price for 5 items");
        for (int i = 0; i < 5; i++) {
            price[i] = sc.nextInt();
        }

        for (int i = 0; i < items.length; i++) {
            double totalPrice = 0;
            totalPrice += items[i] * price[i];
            System.out.println("We have item" + (i + 1) + " and price" + (i + 1) + " and a totalPrice of " + totalPrice);
        }


    }
}
/*
	5. Items
			1. Create an array named items with the length of 5
			2. Create an array named prices with the length of 5
			3. Ask user to enter item name and price 5 times and store them into the items and prices arrays
			4. calculate the total price of the arrays
			5. display each item name and price in separate lines
 */