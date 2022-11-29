package day20_Arrays;

import java.util.Scanner;

public class Task4 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int len = sc.nextInt();
        int[] arr = new int[len];

        for (int i = 0; i < arr.length; i++) {
            arr[i] = sc.nextInt();
        }
        int sumAve = 0;
        for (int i = 0; i < len; i++) {
            sumAve += arr[i];
        }
        System.out.println((double)sumAve/len);

    }
}
/*
4. AverageNumber:
			1. Ask the user how many numbers they want to enter
			2. get all the inputs from the user and store them into an array
			3. Iterate the array & return the average number

 */