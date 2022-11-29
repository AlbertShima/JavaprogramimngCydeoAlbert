package day22_MultiDimensionalArray;

import java.util.Arrays;

public class ReverseArray {
    public static void main(String[] args) {
        // 1 2 3            4 5 6 7 8 9
        // 4 5 6 7 8 9      1 2 3
        int[][] array2D = {{1, 2, 3}, {4, 5, 6,}};
        int[][] reversed = new int[array2D.length][];

        for (int i = array2D.length - 1, j = 0; i >= 0; i--, j++) { // j = 0 and i = 1
            reversed[j] = new int[array2D[i].length];
            for (int k = array2D[i].length - 1, m = 0; k >= 0; k--, m++) { // m = 0 and k = 1
                   reversed[j][m] = array2D[i][k];
                 //reserved[0][0] = array2D[1][2]
                // reserved[0][1] = array2D[1][1]
                // reserved[0][2] = array2D[1][0]
            }
        }
        System.out.println(Arrays.deepToString(reversed));
    }
}
/*
1. Write a program that can reverse a two-dimensional array (return new array)
		Ex:
			array = { {1,2,3}, {4,5,6}};
 */