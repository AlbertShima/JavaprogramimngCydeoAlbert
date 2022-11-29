package day20_Arrays;

import java.util.Arrays;

public class PractiseTask3 {
    public static void main(String[] args) {
        String[] items = {"Shoes", "Jacket", "Gloves", "AirPods", "iPad", "iPhone 12 case"};
        double[] prices = {99.99, 150.0, 9.99, 250.0, 439.50, 39.99};
        int[] itemIDs = {12345, 12346, 12347, 12348, 12349, 12350};
        System.out.println("-----------------A--------------------------------------------");
        int index = -1;
        index = Arrays.binarySearch(items, "Gloves");
        System.out.println(index);
        System.out.println("-----------------B--------------------------------------------");
        boolean containIpad = false;
        for (int i = 0; i < items.length; i++) {
            if (items[i].contains("iPad")) {
                containIpad = true;
            }
        }
        System.out.println(containIpad);
        System.out.println("-----------------C--------------------------------------------");
        for (int i = 0; i <items.length ; i++) {

            System.out.println("Name - price - Id");
            System.out.println(items[i]+" - "+prices[i]+" - "+itemIDs[i]);
            System.out.println();
        }

    }
}
/*
3. Given the following arrays:
        String[] items  = {"Shoes", "Jacket",  "Gloves", "AirPods", "iPad", "iPhone 12 case" };
        double[] prices = {99.99,      150.0,  9.99,     250.0 ,    439.50,  39.99};
        int[] itemIDs =   {12345 ,     12346,  12347,    12348,     12349,    12350};


        1. find out the first index number of "Gloves"

        2. find out if "iPad" is contained in the item list

        3. Print the report of each shopping item
            name - price - #ID
 */