package day22_MultiDimensionalArray;

public class MultidimensionalArray {
    public static void main(String[] args) {

        // create a 2d array
        int[][] a = {
                {1, 2, 3},
                {4, 5, 6, 9},
                {7},
        };

        // calculate the length of each row
        System.out.println("Length of row 1: " + a[0].length);
        System.out.println("Length of row 2: " + a[1].length);
        System.out.println("Length of row 3: " + a[2].length);
        System.out.println("---------------------------------");

        for (int i = 0; i < a.length; ++i) {
            for(int j = 0; j < a[i].length; ++j) {
                System.out.print(a[i][j]+" ");
            }
            System.out.println();
        }
        System.out.println("---------------------------------");
        for (int[] innerArray: a) {
            // second for...each loop access each element inside the row
            for(int data: innerArray) {
                System.out.print(data+" ");
            }
            System.out.println();
        }
    }
}
/*
OUTPUT:
Length of row 1: 3
Length of row 2: 4
Length of row 3: 1
---------------------------------
1 2 3
4 5 6 9
7
---------------------------------
1 2 3
4 5 6 9
7
 */