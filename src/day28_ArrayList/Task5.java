package day28_ArrayList;

import java.util.ArrayList;
import java.util.Arrays;

public class Task5 {
    public static void main(String[] args) {
        ArrayList<Integer> list = new ArrayList<>();
        list.addAll(Arrays.asList(1, 2, 43, 34, 3, 4, 5, 6));
        int max = list.get(0);
        for (int i = 1; i < list.size(); i++) {
            if (list.get(i) > max) {
                max = list.get(i);
            }
        }
        System.out.println(max);
    }
}
/*
5. Write a program that can find the maximum number from an ArrayList of integers
		Ex:
			list = [1,2,3,4,5];
			output:
				5


 */