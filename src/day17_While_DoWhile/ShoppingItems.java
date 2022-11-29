package day17_While_DoWhile;

import java.util.ArrayList;
import java.util.Scanner;

public class ShoppingItems {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int nrOfItems = 1;
        String yesNo = "yes";
        String temp = "";
        String item1 = "";
        int howManyItem1 = 0;
        double price1 = 0;
        double total_price = 0;
        ArrayList<String> myArray = new ArrayList<>();

        while (yesNo.equalsIgnoreCase("yes")) {
            System.out.println("Enter the name of item " + nrOfItems);
            item1 = sc.next();
            System.out.println("Enter the price of the " + item1);
            price1 = sc.nextDouble();
            System.out.println("How many " + item1 + " will you buy?");
            howManyItem1 = sc.nextInt();
            temp = item1 + " x " + howManyItem1 + " - $" + (price1 * howManyItem1);
            myArray.add(nrOfItems-1,temp);

            System.out.println("Do you want to add more items to the shopping list?");
            yesNo = sc.next();


            total_price += price1 * howManyItem1;
            nrOfItems++;

        }
        System.out.println("SHOPPING LIST:");
        for (int i = 0; i < myArray.size(); i++) {
            System.out.println(myArray.get(i));
        }

        System.out.println("Total cost: $" + total_price);
    }

}
