package day20_Arrays;

import java.util.Arrays;

public class Arrays100To1 {
    public static void main(String[] args) {

        int[] arr = new int[100];
        for (int i = arr.length-1, j = 1; i >=0; i--, j++) {
            arr[i] = j;
        }
        System.out.println(Arrays.toString(arr));
    }
}
/*
2. create an array that has the numbers 100 to 1
 */
