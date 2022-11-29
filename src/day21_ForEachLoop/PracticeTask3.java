package day21_ForEachLoop;

public class PracticeTask3 {
    public static void main(String[] args) {
        int[] arr1 = {1, 2, 3, 4, 5, 14};
        int[] arr2 = {4, 5, 6, 7, 8, 6, 14};
        for (int eleOfArr1 : arr1) {
            for (int eleOfArr2 : arr2) {
                if (eleOfArr1 == eleOfArr2) {
                    System.out.println(eleOfArr1);
                }
            }
        }
    }
}
/*

	3. Write a program that can print out the common elements from two integer array
          Ex:
              arr1: {1,2,3,4,5}
              arr2: {4,5,6,7,8}

          output:
              4 5


          MUST use for each loops
 */