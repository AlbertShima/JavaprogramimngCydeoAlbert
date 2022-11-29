package day23_CustomMethods_Void;

public class PracticeTask14 {
    public static void main(String[] args) {
        int[] vector = {1, 3, 5, 2, 3, 5, 7, 8, 9, 3, 10};
        printEachElement(vector);
    }

    public static void printEachElement(int[] arr) {
        for (int each : arr) {
            System.out.print(each + " ");
        }
    }
}
/*
14. create a method named printEachElement that can print each element of an integer array
 */