package day17_While_DoWhile;

import java.util.Scanner;

public class ShoppingItems2 {
    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);
        int item = 1;
        boolean add = true;
        String split = "";
        double total = 0;

        do {

            System.out.println("Enter the name of item " + item);
            String name = scan.nextLine();
            split += name + " x ";

            System.out.println("Enter the price of the " + name);
            double price = scan.nextDouble();

            System.out.println("How many " + name + " will you buy?");
            int quantity = scan.nextInt();

            split += quantity + " - $" + (price*quantity);

            System.out.println("Do you want to add more items to the shopping list?");
            scan.nextLine();
            String shop = scan.nextLine();
            total += price*quantity;
            if(shop.equals("no")){
                add = false;
            }

            split += "\n";

            item++;

        }while(add);

        System.out.println("SHOPPING LIST:");
        System.out.print(split);
        System.out.println("Total cost: $" + total);

    }
}