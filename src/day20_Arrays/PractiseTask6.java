package day20_Arrays;

import java.util.Arrays;

public class PractiseTask6 {
    public static void main(String[] args) {
        int[] array = {10, 0, 5, 0, 1, 0, 4, 13, 0, 12};
        for (int i = 0; i < array.length; i++) {
            for (int j = i + 1; j < array.length; j++) {

                if (array[i] == 0 && array[j] != 0) {
                    array[i] = array[j];
                    array[j] = 0;
                }
            }
        }
        System.out.println(Arrays.toString(array));
    }
}

/*
6. write a program that can move all the zeros to the end of the array
        Ex:
            array = {10, 0, 5, 0, 1, 0};

            output:
                 {10, 5, 1, 0, 0, 0}
 */