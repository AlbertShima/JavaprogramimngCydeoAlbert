package day21_ForEachLoop;

import java.util.Scanner;

public class ReverseNames {


    public static String profit(int buyPrice, int sellPrice) {
        //WRITE YOUR CODE BELOW
        String res = "";
        if (buyPrice < sellPrice) {
            res = "profit";

        } else {
            res = "loss";
        }
        return res;
    }

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.println(profit(in.nextInt(), in.nextInt()));
    }

}