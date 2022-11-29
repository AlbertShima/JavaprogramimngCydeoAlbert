package day21_ForEachLoop;

public class Task777 {
    public static void main(String[] args) {

        int[] arr1 = {1, 2, 3, 4, 5, 20, 23};
        int[] arr2 = {4, 5, 6, 7, 8, 23};
        String res ="";

        for (int eleArr1 : arr1) { // eleArr1 = 1

            for (int eleArr2 : arr2) {
                if (eleArr1 == eleArr2) {
                    res += eleArr1 + " ";
                }
            }
        }
        res= res.trim();
        System.out.println(res);

    }
}
/*
7. Write a program that can print out the common elements from two integer array
          Ex:
              arr1: {1,2,3,4,5}
              arr2: {4,5,6,7,8}

          output:
              4 5
 */