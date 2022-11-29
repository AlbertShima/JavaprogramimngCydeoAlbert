package day19_LoopPractices;

import java.util.Scanner;

public class eeeee {
    public static void main(String[] args) {
        //DO NOT TOUCH FOLLOWING LINE/LINES
        Scanner scan = new Scanner(System.in);
        int[] nums = new int[3];
        for(int i =0; i < 3; i++) {
            nums[i] = scan.nextInt();
        }

        //WRITE YOUR CODE BELOW
        System.out.println("[");
        for (int i = 0; i < nums.length; i++) {
            System.out.println(nums[i]+", ");

        }
        System.out.println("0, ");
        System.out.println("0, ");
        System.out.println("0]");



    }
}
