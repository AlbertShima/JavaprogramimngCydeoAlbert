package day28_ArrayList;

import java.util.ArrayList;

public class FibonaciNumbers {
    public static void main(String[] args) {
        System.out.println(fibonaci(99));

    }
   public static ArrayList<Integer> fibonaci(int FibonaciNumbersUpTo){
       ArrayList<Integer> list = new ArrayList<>();
       list.add(0, 0);
       list.add(1, 1);
       for (int i = 2; i < FibonaciNumbersUpTo; i++) {
           list.add(i, list.get(i-1)+list.get(i-2));
       }
       return list;
   }

}
/*
Task 6 :  Fibonacci

                Create a method that will give you the Fibonacci numbers up to the x value. Where x is the given parameter.

                Fibonacci is a sequence of number starting from 0, 1 where the following numbers are the sum of the previous 2 numbers

                Note: Fibonacci numbers are read as index values, so the 0th Fibonacci is 0, 1st value is 1, 2nd value is 1, etc

                    Ex:
                        Input:
                            8
                        Output:
                            0, 1, 1, 2, 3, 5, 8, 13, 21

                            1- Create one method and only print the numbers
                            2- You will return the numbers
                            3- Yuo will put that numbers into the array then you will return it
 */