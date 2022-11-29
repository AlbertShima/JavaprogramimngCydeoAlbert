package day20_Arrays;

import java.util.Arrays;
import java.util.Scanner;

public class Task3 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int len = sc.nextInt();
        int[] arr = new int[len];

        for (int i = 0; i < arr.length; i++) {
            arr[i] = sc.nextInt();
        }
        System.out.println(Arrays.toString(arr));
        int max = arr[0];
        int min = arr[0];
        for (int i = 0; i < len; i++) {

            max = Integer.max(max, arr[i]);
            min = Integer.min(min, arr[i]);

        }
        System.out.println(max);
        System.out.println(min);

    }
}
/*
3. Write a program that asks user to enter a number 10 times:
			1. store all user entered numbers in an array
			2. find the max number
			3. find the min number
 */