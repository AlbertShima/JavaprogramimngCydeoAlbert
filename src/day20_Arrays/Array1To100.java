package day20_Arrays;

import java.util.Arrays;

public class Array1To100 {
    public static void main(String[] args) {

        int[] arr = new int[100];
        for (int i = 0, j = 1; i < arr.length; i++, j++) {
            arr[i] = j;
        }
        System.out.println(Arrays.toString(arr));
    }
}
/*
	1. create an array that has the numbers 1 to 100
 */