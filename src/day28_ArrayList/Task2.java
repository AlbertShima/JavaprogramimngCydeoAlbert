package day28_ArrayList;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;

public class Task2 {
    public static void main(String[] args) {
        ArrayList<Integer> list = new ArrayList<>();

        list.addAll(Arrays.asList(1, 2, 3, 4, 5, 6));
        Collections.swap(list, 0, list.size()-1);
        System.out.println(list);
    }
}
/*
2. write a program that can swap the first and last elements of an integer arraylist
	            ex:
	                list = [1,2,3,4,5];
	                output: [5,2,3,4,1];
 */
