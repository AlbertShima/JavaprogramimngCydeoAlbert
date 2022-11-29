package day25_CustomMethods_Overloading;

import utilities.ArraysUtility;

public class Test2 {
    public static void main(String[] args) {

        System.out.println("---------------------");
        int[] arr1 = {1, 2, 3, 4, 5};
        ArraysUtility.printEachElement(arr1);

        System.out.println("---------------------");
        double[] arr2 = {1.5, 2.5, 3.5, 4.5};
        ArraysUtility.printEachElement(arr2);

        System.out.println("---------------------");
        char[] arr3 = {'a', 'b', 'c', 'd', 'r'};
        ArraysUtility.printEachElement(arr3);

        System.out.println("---------------------");
        String[] arr4 ={"Davit", "Berti", "Shima"};
        ArraysUtility.printEachElement(arr4);

        System.out.println("---------------------");
        int[] n1 = {1, 2, 5, 4, 3, 7, 11, 6, 15};
        int max1 = ArraysUtility.max(n1);
        System.out.println("max1 = " + max1);

        System.out.println("---------------------");
        double[] n2 = {1.3, 2, 5, 4.3, 3, 7, 11.7, 61.3, 15};
        double max2 = ArraysUtility.max(n2);
        System.out.println("max2 = " + max2);

        System.out.println("---------------------");
        System.out.println(ArraysUtility.contains(n1, 7));

        System.out.println("---------------------");
        System.out.println(ArraysUtility.contains(n2, 61.3));

    }
}
